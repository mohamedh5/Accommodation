
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
    "strikethrough_amount",
    "gross_amount",
    "all_inclusive_amount",
    "benefits",
    "included_taxes_and_charges_amount",
    "discounted_amount",
    "net_amount",
    "excluded_amount",
    "reward_amount",
    "gross_amount_per_night",
    "items",
    "strikethrough_amount_per_night"
})
@Generated("jsonschema2pojo")
public class ProductPriceBreakdown implements Serializable
{

    @JsonProperty("strikethrough_amount")
    private StrikethroughAmount__1 strikethroughAmount;
    @JsonProperty("gross_amount")
    private GrossAmount__1 grossAmount;
    @JsonProperty("all_inclusive_amount")
    private AllInclusiveAmount__1 allInclusiveAmount;
    @JsonProperty("benefits")
    private List<Benefit__1> benefits = null;
    @JsonProperty("included_taxes_and_charges_amount")
    private IncludedTaxesAndChargesAmount__1 includedTaxesAndChargesAmount;
    @JsonProperty("discounted_amount")
    private DiscountedAmount__1 discountedAmount;
    @JsonProperty("net_amount")
    private NetAmount__1 netAmount;
    @JsonProperty("excluded_amount")
    private ExcludedAmount__1 excludedAmount;
    @JsonProperty("reward_amount")
    private RewardAmount rewardAmount;
    @JsonProperty("gross_amount_per_night")
    private GrossAmountPerNight grossAmountPerNight;
    @JsonProperty("items")
    private List<Item> items = null;
    @JsonProperty("strikethrough_amount_per_night")
    private StrikethroughAmountPerNight strikethroughAmountPerNight;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -2785055303302508302L;

    @JsonProperty("strikethrough_amount")
    public StrikethroughAmount__1 getStrikethroughAmount() {
        return strikethroughAmount;
    }

    @JsonProperty("strikethrough_amount")
    public void setStrikethroughAmount(StrikethroughAmount__1 strikethroughAmount) {
        this.strikethroughAmount = strikethroughAmount;
    }

    @JsonProperty("gross_amount")
    public GrossAmount__1 getGrossAmount() {
        return grossAmount;
    }

    @JsonProperty("gross_amount")
    public void setGrossAmount(GrossAmount__1 grossAmount) {
        this.grossAmount = grossAmount;
    }

    @JsonProperty("all_inclusive_amount")
    public AllInclusiveAmount__1 getAllInclusiveAmount() {
        return allInclusiveAmount;
    }

    @JsonProperty("all_inclusive_amount")
    public void setAllInclusiveAmount(AllInclusiveAmount__1 allInclusiveAmount) {
        this.allInclusiveAmount = allInclusiveAmount;
    }

    @JsonProperty("benefits")
    public List<Benefit__1> getBenefits() {
        return benefits;
    }

    @JsonProperty("benefits")
    public void setBenefits(List<Benefit__1> benefits) {
        this.benefits = benefits;
    }

    @JsonProperty("included_taxes_and_charges_amount")
    public IncludedTaxesAndChargesAmount__1 getIncludedTaxesAndChargesAmount() {
        return includedTaxesAndChargesAmount;
    }

    @JsonProperty("included_taxes_and_charges_amount")
    public void setIncludedTaxesAndChargesAmount(IncludedTaxesAndChargesAmount__1 includedTaxesAndChargesAmount) {
        this.includedTaxesAndChargesAmount = includedTaxesAndChargesAmount;
    }

    @JsonProperty("discounted_amount")
    public DiscountedAmount__1 getDiscountedAmount() {
        return discountedAmount;
    }

    @JsonProperty("discounted_amount")
    public void setDiscountedAmount(DiscountedAmount__1 discountedAmount) {
        this.discountedAmount = discountedAmount;
    }

    @JsonProperty("net_amount")
    public NetAmount__1 getNetAmount() {
        return netAmount;
    }

    @JsonProperty("net_amount")
    public void setNetAmount(NetAmount__1 netAmount) {
        this.netAmount = netAmount;
    }

    @JsonProperty("excluded_amount")
    public ExcludedAmount__1 getExcludedAmount() {
        return excludedAmount;
    }

    @JsonProperty("excluded_amount")
    public void setExcludedAmount(ExcludedAmount__1 excludedAmount) {
        this.excludedAmount = excludedAmount;
    }

    @JsonProperty("reward_amount")
    public RewardAmount getRewardAmount() {
        return rewardAmount;
    }

    @JsonProperty("reward_amount")
    public void setRewardAmount(RewardAmount rewardAmount) {
        this.rewardAmount = rewardAmount;
    }

    @JsonProperty("gross_amount_per_night")
    public GrossAmountPerNight getGrossAmountPerNight() {
        return grossAmountPerNight;
    }

    @JsonProperty("gross_amount_per_night")
    public void setGrossAmountPerNight(GrossAmountPerNight grossAmountPerNight) {
        this.grossAmountPerNight = grossAmountPerNight;
    }

    @JsonProperty("items")
    public List<Item> getItems() {
        return items;
    }

    @JsonProperty("items")
    public void setItems(List<Item> items) {
        this.items = items;
    }

    @JsonProperty("strikethrough_amount_per_night")
    public StrikethroughAmountPerNight getStrikethroughAmountPerNight() {
        return strikethroughAmountPerNight;
    }

    @JsonProperty("strikethrough_amount_per_night")
    public void setStrikethroughAmountPerNight(StrikethroughAmountPerNight strikethroughAmountPerNight) {
        this.strikethroughAmountPerNight = strikethroughAmountPerNight;
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
        sb.append(ProductPriceBreakdown.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("strikethroughAmount");
        sb.append('=');
        sb.append(((this.strikethroughAmount == null)?"<null>":this.strikethroughAmount));
        sb.append(',');
        sb.append("grossAmount");
        sb.append('=');
        sb.append(((this.grossAmount == null)?"<null>":this.grossAmount));
        sb.append(',');
        sb.append("allInclusiveAmount");
        sb.append('=');
        sb.append(((this.allInclusiveAmount == null)?"<null>":this.allInclusiveAmount));
        sb.append(',');
        sb.append("benefits");
        sb.append('=');
        sb.append(((this.benefits == null)?"<null>":this.benefits));
        sb.append(',');
        sb.append("includedTaxesAndChargesAmount");
        sb.append('=');
        sb.append(((this.includedTaxesAndChargesAmount == null)?"<null>":this.includedTaxesAndChargesAmount));
        sb.append(',');
        sb.append("discountedAmount");
        sb.append('=');
        sb.append(((this.discountedAmount == null)?"<null>":this.discountedAmount));
        sb.append(',');
        sb.append("netAmount");
        sb.append('=');
        sb.append(((this.netAmount == null)?"<null>":this.netAmount));
        sb.append(',');
        sb.append("excludedAmount");
        sb.append('=');
        sb.append(((this.excludedAmount == null)?"<null>":this.excludedAmount));
        sb.append(',');
        sb.append("rewardAmount");
        sb.append('=');
        sb.append(((this.rewardAmount == null)?"<null>":this.rewardAmount));
        sb.append(',');
        sb.append("grossAmountPerNight");
        sb.append('=');
        sb.append(((this.grossAmountPerNight == null)?"<null>":this.grossAmountPerNight));
        sb.append(',');
        sb.append("items");
        sb.append('=');
        sb.append(((this.items == null)?"<null>":this.items));
        sb.append(',');
        sb.append("strikethroughAmountPerNight");
        sb.append('=');
        sb.append(((this.strikethroughAmountPerNight == null)?"<null>":this.strikethroughAmountPerNight));
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
