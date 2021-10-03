
package com.iter.accommodation.booking.dto;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
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
    "adults",
    "children"
})
@Generated("jsonschema2pojo")
public class RoomDistribution implements Serializable
{

    @JsonProperty("adults")
    private String adults;
    @JsonProperty("children")
    private List<Object> children = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 4492246281651460825L;

    @JsonProperty("adults")
    public String getAdults() {
        return adults;
    }

    @JsonProperty("adults")
    public void setAdults(String adults) {
        this.adults = adults;
    }

    @JsonProperty("children")
    public List<Object> getChildren() {
        return children;
    }

    @JsonProperty("children")
    public void setChildren(List<Object> children) {
        this.children = children;
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
        sb.append(RoomDistribution.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("adults");
        sb.append('=');
        sb.append(((this.adults == null)?"<null>":this.adults));
        sb.append(',');
        sb.append("children");
        sb.append('=');
        sb.append(((this.children == null)?"<null>":this.children));
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
