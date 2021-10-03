
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
    "credits",
    "sum_credits"
})
@Generated("jsonschema2pojo")
public class Total implements Serializable
{

    @JsonProperty("credits")
    private List<Credit__1> credits = null;
    @JsonProperty("sum_credits")
    private SumCredits sumCredits;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -5697180688742207264L;

    @JsonProperty("credits")
    public List<Credit__1> getCredits() {
        return credits;
    }

    @JsonProperty("credits")
    public void setCredits(List<Credit__1> credits) {
        this.credits = credits;
    }

    @JsonProperty("sum_credits")
    public SumCredits getSumCredits() {
        return sumCredits;
    }

    @JsonProperty("sum_credits")
    public void setSumCredits(SumCredits sumCredits) {
        this.sumCredits = sumCredits;
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
        sb.append(Total.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("credits");
        sb.append('=');
        sb.append(((this.credits == null)?"<null>":this.credits));
        sb.append(',');
        sb.append("sumCredits");
        sb.append('=');
        sb.append(((this.sumCredits == null)?"<null>":this.sumCredits));
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
