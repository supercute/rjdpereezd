
package ru.shumskikh.rjdpereezd.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class TransportSubtype {

    @SerializedName("color")
    @Expose
    private Object color;
    @SerializedName("code")
    @Expose
    private Object code;
    @SerializedName("title")
    @Expose
    private Object title;

    public Object getColor() {
        return color;
    }

    public void setColor(Object color) {
        this.color = color;
    }

    public Object getCode() {
        return code;
    }

    public void setCode(Object code) {
        this.code = code;
    }

    public Object getTitle() {
        return title;
    }

    public void setTitle(Object title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("color", color).append("code", code).append("title", title).toString();
    }

}
