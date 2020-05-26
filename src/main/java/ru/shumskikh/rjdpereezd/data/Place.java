
package ru.shumskikh.rjdpereezd.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Place {

    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("name")
    @Expose
    private String name;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("currency", currency).append("name", name).toString();
    }

}
