package ru.shumskikh.rjdpereezd.data;

public class RailCross {
    private double lat;
    private double lng;
    private double firstDistance;
    private double lastDistance;
    private String firstStationCode;
    private String lastStationCode;
    private String name;

    public RailCross(String name, double lat, double lng, String firstStationCode, String lastStationCode, double firstDistance, double lastDistance) {
        this.name = name;
        this.lat = lat;
        this.lng = lng;
        this.firstStationCode = firstStationCode;
        this.lastStationCode = lastStationCode;
        this.firstDistance = firstDistance;
        this.lastDistance = lastDistance;
    }

    public String getName() {
        return name;
    }

    public String getFirstStationCode() {
        return firstStationCode;
    }

    public String getLastStationCode() {
        return lastStationCode;
    }

    public double getFirstDistance() {
        return firstDistance;
    }

    public double getLastDistance() {
        return lastDistance;
    }

    public double getLat() {
        return lat;
    }

    public double getLng() {
        return lng;
    }
}
