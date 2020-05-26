
package ru.shumskikh.rjdpereezd.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Thread {

    @SerializedName("uid")
    @Expose
    private String uid;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("number")
    @Expose
    private String number;
    @SerializedName("short_title")
    @Expose
    private String shortTitle;
    @SerializedName("thread_method_link")
    @Expose
    private String threadMethodLink;
    @SerializedName("transport_type")
    @Expose
    private String transportType;
    @SerializedName("vehicle")
    @Expose
    private String vehicle;
    @SerializedName("transport_subtype")
    @Expose
    private TransportSubtype transportSubtype;
    @SerializedName("express_type")
    @Expose
    private Object expressType;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getShortTitle() {
        return shortTitle;
    }

    public void setShortTitle(String shortTitle) {
        this.shortTitle = shortTitle;
    }

    public String getThreadMethodLink() {
        return threadMethodLink;
    }

    public void setThreadMethodLink(String threadMethodLink) {
        this.threadMethodLink = threadMethodLink;
    }

    public String getTransportType() {
        return transportType;
    }

    public void setTransportType(String transportType) {
        this.transportType = transportType;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public TransportSubtype getTransportSubtype() {
        return transportSubtype;
    }

    public void setTransportSubtype(TransportSubtype transportSubtype) {
        this.transportSubtype = transportSubtype;
    }

    public Object getExpressType() {
        return expressType;
    }

    public void setExpressType(Object expressType) {
        this.expressType = expressType;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("uid", uid).append("title", title).append("number", number).append("shortTitle", shortTitle).append("threadMethodLink", threadMethodLink).append("transportType", transportType).append("vehicle", vehicle).append("transportSubtype", transportSubtype).append("expressType", expressType).toString();
    }

}
