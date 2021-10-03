
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
    "has_tax_exceptions",
    "has_incalculable_charges",
    "sum_excluded_raw",
    "has_fine_print_charges",
    "gross_price",
    "currency",
    "all_inclusive_price"
})
@Generated("jsonschema2pojo")
public class PriceBreakdown implements Serializable
{

    @JsonProperty("has_tax_exceptions")
    private Integer hasTaxExceptions;
    @JsonProperty("has_incalculable_charges")
    private Integer hasIncalculableCharges;
    @JsonProperty("sum_excluded_raw")
    private Double sumExcludedRaw;
    @JsonProperty("has_fine_print_charges")
    private Integer hasFinePrintCharges;
    @JsonProperty("gross_price")
    private String grossPrice;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("all_inclusive_price")
    private Double allInclusivePrice;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -7631674118855624641L;

    @JsonProperty("has_tax_exceptions")
    public Integer getHasTaxExceptions() {
        return hasTaxExceptions;
    }

    @JsonProperty("has_tax_exceptions")
    public void setHasTaxExceptions(Integer hasTaxExceptions) {
        this.hasTaxExceptions = hasTaxExceptions;
    }

    @JsonProperty("has_incalculable_charges")
    public Integer getHasIncalculableCharges() {
        return hasIncalculableCharges;
    }

    @JsonProperty("has_incalculable_charges")
    public void setHasIncalculableCharges(Integer hasIncalculableCharges) {
        this.hasIncalculableCharges = hasIncalculableCharges;
    }

    @JsonProperty("sum_excluded_raw")
    public Double getSumExcludedRaw() {
        return sumExcludedRaw;
    }

    @JsonProperty("sum_excluded_raw")
    public void setSumExcludedRaw(Double sumExcludedRaw) {
        this.sumExcludedRaw = sumExcludedRaw;
    }

    @JsonProperty("has_fine_print_charges")
    public Integer getHasFinePrintCharges() {
        return hasFinePrintCharges;
    }

    @JsonProperty("has_fine_print_charges")
    public void setHasFinePrintCharges(Integer hasFinePrintCharges) {
        this.hasFinePrintCharges = hasFinePrintCharges;
    }

    @JsonProperty("gross_price")
    public String getGrossPrice() {
        return grossPrice;
    }

    @JsonProperty("gross_price")
    public void setGrossPrice(String grossPrice) {
        this.grossPrice = grossPrice;
    }

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("all_inclusive_price")
    public Double getAllInclusivePrice() {
        return allInclusivePrice;
    }

    @JsonProperty("all_inclusive_price")
    public void setAllInclusivePrice(Double allInclusivePrice) {
        this.allInclusivePrice = allInclusivePrice;
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
        sb.append(PriceBreakdown.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("hasTaxExceptions");
        sb.append('=');
        sb.append(((this.hasTaxExceptions == null)?"<null>":this.hasTaxExceptions));
        sb.append(',');
        sb.append("hasIncalculableCharges");
        sb.append('=');
        sb.append(((this.hasIncalculableCharges == null)?"<null>":this.hasIncalculableCharges));
        sb.append(',');
        sb.append("sumExcludedRaw");
        sb.append('=');
        sb.append(((this.sumExcludedRaw == null)?"<null>":this.sumExcludedRaw));
        sb.append(',');
        sb.append("hasFinePrintCharges");
        sb.append('=');
        sb.append(((this.hasFinePrintCharges == null)?"<null>":this.hasFinePrintCharges));
        sb.append(',');
        sb.append("grossPrice");
        sb.append('=');
        sb.append(((this.grossPrice == null)?"<null>":this.grossPrice));
        sb.append(',');
        sb.append("currency");
        sb.append('=');
        sb.append(((this.currency == null)?"<null>":this.currency));
        sb.append(',');
        sb.append("allInclusivePrice");
        sb.append('=');
        sb.append(((this.allInclusivePrice == null)?"<null>":this.allInclusivePrice));
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
