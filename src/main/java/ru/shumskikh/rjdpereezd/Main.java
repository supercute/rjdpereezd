package ru.shumskikh.rjdpereezd;

import com.google.gson.Gson;
import org.joda.time.DateTime;
import org.joda.time.Interval;
import org.joda.time.Minutes;
import org.joda.time.format.ISODateTimeFormat;
import ru.shumskikh.rjdpereezd.data.ApiKey;
import ru.shumskikh.rjdpereezd.data.RailCross;
import ru.shumskikh.rjdpereezd.data.Segment;
import ru.shumskikh.rjdpereezd.data.YandexRasp;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        double lat = 58.501228; //широта
        double lng = 49.7210848; //долгота
        final String FORMAT = "json";


        RailCross railCross = new RailCross(
                "Нововятский",
                58.501228,
                49.7210848,
                "s9612402",
                "s9612284",
                9.471,
                82.949
        );

        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter dateFormatterForUrl = DateTimeFormatter.ofPattern("YYYYMMdd", Locale.ENGLISH);

        //Киров-Пасс -> переезд - 9.471554837206181 км
        //переезд -> Луговой (58.445343, 50.476519) - 44.37315622257763 км
        //Луговой -> Зуевка - 38.576052571369054
        //переезд -> Зуевка ~ 82.949

        Gson gson = new Gson();
        URL url = null;
        try {
            url = new URL("https://api.rasp.yandex.net/v3.0/search/?apikey="+ApiKey.APIKEY+
                    "&format="+FORMAT+
                    "&system=yandex&show_systems=yandex" +
                    "&from="+railCross.getFirstStationCode()+
                    "&to="+railCross.getLastStationCode()+
                    "&transport_types=train,suburban" +
                    "&result_timezone=Europe/Kirov" +
                    "&date="+dateFormatterForUrl.format(date)+""); //TODO Добавить запрос API от последней станции до первой (обратное направление поездов)
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        try {

            InputStreamReader reader = new InputStreamReader(url.openStream());
            YandexRasp rasp = gson.fromJson(reader, YandexRasp.class);

            for (Segment x : rasp.getSegments()) {

                org.joda.time.format.DateTimeFormatter dateTimeFormatter = ISODateTimeFormat.dateTimeNoMillis();
                DateTime departure = dateTimeFormatter.parseDateTime(x.getDeparture());
                DateTime arrival = dateTimeFormatter.parseDateTime(x.getArrival());
                Minutes minutes = Minutes.minutesBetween(departure, arrival);

                double T1 = getTimeOfPartOfPath(railCross, minutes, Direction.start);

                System.out.println(x.getFrom().getTitle()+" - "+x.getTo().getTitle());
                System.out.println("Время отправления и прибытия: "+x.getDeparture()+" - "+x.getArrival());
                System.out.println("Время в пути: "+minutes.getMinutes()+" минут");
                if (departure.plusMinutes((int) T1).isAfterNow()) {
                    Interval interval = new Interval(DateTime.now(),departure.plusMinutes((int) T1));
                    System.out.println("Переезд "+railCross.getName()+" будет закрыт через: "+interval.toDuration().getStandardMinutes()+" минут");
                } else {
                    System.out.println("Был на переезде "+railCross.getName()+": "+departure.plusMinutes((int) T1)+" минут");
                }

                System.out.println("\n");

            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static double getTimeOfPartOfPath(RailCross railCross, Minutes minutes, Direction direction) {
        int T = minutes.getMinutes();
        double S1 = railCross.getFirstDistance();
        double S2 = railCross.getLastDistance();
        return direction == Direction.start ? (T*S1)/T : direction == Direction.end ? (T*S2/T) : 0; //FIXME Возвращать Exception вместо 0
    }
    enum Direction {start, end}

    //TODO Добавить PostgreSQL и Hibernate, чтобы каждый раз не запрашивать данные по API
}