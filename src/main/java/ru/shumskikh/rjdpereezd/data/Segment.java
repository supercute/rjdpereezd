
package ru.shumskikh.rjdpereezd.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Segment {

    @SerializedName("arrival")
    @Expose
    private String arrival;
    @SerializedName("from")
    @Expose
    private From from;
    @SerializedName("thread")
    @Expose
    private Thread thread;
    @SerializedName("departure_platform")
    @Expose
    private String departurePlatform;
    @SerializedName("departure")
    @Expose
    private String departure;
    @SerializedName("stops")
    @Expose
    private String stops;
    @SerializedName("departure_terminal")
    @Expose
    private Object departureTerminal;
    @SerializedName("to")
    @Expose
    private To to;
    @SerializedName("has_transfers")
    @Expose
    private Boolean hasTransfers;
    @SerializedName("duration")
    @Expose
    private Double duration;
    @SerializedName("arrival_terminal")
    @Expose
    private Object arrivalTerminal;
    @SerializedName("start_date")
    @Expose
    private String startDate;
    @SerializedName("arrival_platform")
    @Expose
    private String arrivalPlatform;

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public From getFrom() {
        return from;
    }

    public void setFrom(From from) {
        this.from = from;
    }

    public Thread getThread() {
        return thread;
    }

    public void setThread(Thread thread) {
        this.thread = thread;
    }

    public String getDeparturePlatform() {
        return departurePlatform;
    }

    public void setDeparturePlatform(String departurePlatform) {
        this.departurePlatform = departurePlatform;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getStops() {
        return stops;
    }

    public void setStops(String stops) {
        this.stops = stops;
    }

    public Object getDepartureTerminal() {
        return departureTerminal;
    }

    public void setDepartureTerminal(Object departureTerminal) {
        this.departureTerminal = departureTerminal;
    }

    public To getTo() {
        return to;
    }

    public void setTo(To to) {
        this.to = to;
    }

    public Boolean getHasTransfers() {
        return hasTransfers;
    }

    public void setHasTransfers(Boolean hasTransfers) {
        this.hasTransfers = hasTransfers;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    public Object getArrivalTerminal() {
        return arrivalTerminal;
    }

    public void setArrivalTerminal(Object arrivalTerminal) {
        this.arrivalTerminal = arrivalTerminal;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getArrivalPlatform() {
        return arrivalPlatform;
    }

    public void setArrivalPlatform(String arrivalPlatform) {
        this.arrivalPlatform = arrivalPlatform;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("arrival", arrival).append("from", from).append("thread", thread).append("departurePlatform", departurePlatform).append("departure", departure).append("stops", stops).append("departureTerminal", departureTerminal).append("to", to).append("hasTransfers", hasTransfers).append("duration", duration).append("arrivalTerminal", arrivalTerminal).append("startDate", startDate).append("arrivalPlatform", arrivalPlatform).toString();
    }

}
