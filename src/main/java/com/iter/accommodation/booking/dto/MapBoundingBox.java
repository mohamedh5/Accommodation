
package com.iter.accommodation.booking.dto;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "sw_lat",
    "ne_long",
    "sw_long",
    "ne_lat"
})
@Generated("jsonschema2pojo")
public class MapBoundingBox implements Serializable
{

    @JsonProperty("sw_lat")
    private Double swLat;
    @JsonProperty("ne_long")
    private Double neLong;
    @JsonProperty("sw_long")
    private Double swLong;
    @JsonProperty("ne_lat")
    private Double neLat;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -2613524778133821679L;

    @JsonProperty("sw_lat")
    public Double getSwLat() {
        return swLat;
    }

    @JsonProperty("sw_lat")
    public void setSwLat(Double swLat) {
        this.swLat = swLat;
    }

    @JsonProperty("ne_long")
    public Double getNeLong() {
        return neLong;
    }

    @JsonProperty("ne_long")
    public void setNeLong(Double neLong) {
        this.neLong = neLong;
    }

    @JsonProperty("sw_long")
    public Double getSwLong() {
        return swLong;
    }

    @JsonProperty("sw_long")
    public void setSwLong(Double swLong) {
        this.swLong = swLong;
    }

    @JsonProperty("ne_lat")
    public Double getNeLat() {
        return neLat;
    }

    @JsonProperty("ne_lat")
    public void setNeLat(Double neLat) {
        this.neLat = neLat;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MapBoundingBox.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("swLat");
        sb.append('=');
        sb.append(((this.swLat == null)?"<null>":this.swLat));
        sb.append(',');
        sb.append("neLong");
        sb.append('=');
        sb.append(((this.neLong == null)?"<null>":this.neLong));
        sb.append(',');
        sb.append("swLong");
        sb.append('=');
        sb.append(((this.swLong == null)?"<null>":this.swLong));
        sb.append(',');
        sb.append("neLat");
        sb.append('=');
        sb.append(((this.neLat == null)?"<null>":this.neLat));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
