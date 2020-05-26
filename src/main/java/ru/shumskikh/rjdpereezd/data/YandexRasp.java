
package ru.shumskikh.rjdpereezd.data;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class YandexRasp {

    @SerializedName("interval_segments")
    @Expose
    private List<Object> intervalSegments = new ArrayList<Object>();
    @SerializedName("pagination")
    @Expose
    private Pagination pagination;
    @SerializedName("segments")
    @Expose
    private List<Segment> segments = new ArrayList<Segment>();

    public List<Object> getIntervalSegments() {
        return intervalSegments;
    }

    public void setIntervalSegments(List<Object> intervalSegments) {
        this.intervalSegments = intervalSegments;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public List<Segment> getSegments() {
        return segments;
    }

    public void setSegments(List<Segment> segments) {
        this.segments = segments;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("intervalSegments", intervalSegments).append("pagination", pagination).append("segments", segments).toString();
    }

}
