
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
    "reward_currency",
    "terms_conditions",
    "reward_amount"
})
@Generated("jsonschema2pojo")
public class Credit__1 implements Serializable
{

    @JsonProperty("reward_currency")
    private String rewardCurrency;
    @JsonProperty("terms_conditions")
    private String termsConditions;
    @JsonProperty("reward_amount")
    private Double rewardAmount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -7527708433345946851L;

    @JsonProperty("reward_currency")
    public String getRewardCurrency() {
        return rewardCurrency;
    }

    @JsonProperty("reward_currency")
    public void setRewardCurrency(String rewardCurrency) {
        this.rewardCurrency = rewardCurrency;
    }

    @JsonProperty("terms_conditions")
    public String getTermsConditions() {
        return termsConditions;
    }

    @JsonProperty("terms_conditions")
    public void setTermsConditions(String termsConditions) {
        this.termsConditions = termsConditions;
    }

    @JsonProperty("reward_amount")
    public Double getRewardAmount() {
        return rewardAmount;
    }

    @JsonProperty("reward_amount")
    public void setRewardAmount(Double rewardAmount) {
        this.rewardAmount = rewardAmount;
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
        sb.append(Credit__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("rewardCurrency");
        sb.append('=');
        sb.append(((this.rewardCurrency == null)?"<null>":this.rewardCurrency));
        sb.append(',');
        sb.append("termsConditions");
        sb.append('=');
        sb.append(((this.termsConditions == null)?"<null>":this.termsConditions));
        sb.append(',');
        sb.append("rewardAmount");
        sb.append('=');
        sb.append(((this.rewardAmount == null)?"<null>":this.rewardAmount));
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
