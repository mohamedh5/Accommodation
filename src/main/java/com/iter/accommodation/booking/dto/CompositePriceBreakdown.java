
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
    "benefits",
    "included_taxes_and_charges_amount",
    "net_amount",
    "excluded_amount",
    "discounted_amount",
    "gross_amount",
    "strikethrough_amount",
    "all_inclusive_amount",
    "product_price_breakdowns",
    "reward_amount",
    "gross_amount_per_night",
    "items",
    "strikethrough_amount_per_night"
})
@Generated("jsonschema2pojo")
public class CompositePriceBreakdown implements Serializable
{

    @JsonProperty("benefits")
    private List<Benefit> benefits = null;
    @JsonProperty("included_taxes_and_charges_amount")
    private IncludedTaxesAndChargesAmount includedTaxesAndChargesAmount;
    @JsonProperty("net_amount")
    private NetAmount netAmount;
    @JsonProperty("excluded_amount")
    private ExcludedAmount excludedAmount;
    @JsonProperty("discounted_amount")
    private DiscountedAmount discountedAmount;
    @JsonProperty("gross_amount")
    private GrossAmount grossAmount;
    @JsonProperty("strikethrough_amount")
    private StrikethroughAmount strikethroughAmount;
    @JsonProperty("all_inclusive_amount")
    private AllInclusiveAmount allInclusiveAmount;
    @JsonProperty("product_price_breakdowns")
    private List<ProductPriceBreakdown> productPriceBreakdowns = null;
    @JsonProperty("reward_amount")
    private RewardAmount__1 rewardAmount;
    @JsonProperty("gross_amount_per_night")
    private GrossAmountPerNight__1 grossAmountPerNight;
    @JsonProperty("items")
    private List<Item__1> items = null;
    @JsonProperty("strikethrough_amount_per_night")
    private StrikethroughAmountPerNight__1 strikethroughAmountPerNight;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -5411232294288371474L;

    @JsonProperty("benefits")
    public List<Benefit> getBenefits() {
        return benefits;
    }

    @JsonProperty("benefits")
    public void setBenefits(List<Benefit> benefits) {
        this.benefits = benefits;
    }

    @JsonProperty("included_taxes_and_charges_amount")
    public IncludedTaxesAndChargesAmount getIncludedTaxesAndChargesAmount() {
        return includedTaxesAndChargesAmount;
    }

    @JsonProperty("included_taxes_and_charges_amount")
    public void setIncludedTaxesAndChargesAmount(IncludedTaxesAndChargesAmount includedTaxesAndChargesAmount) {
        this.includedTaxesAndChargesAmount = includedTaxesAndChargesAmount;
    }

    @JsonProperty("net_amount")
    public NetAmount getNetAmount() {
        return netAmount;
    }

    @JsonProperty("net_amount")
    public void setNetAmount(NetAmount netAmount) {
        this.netAmount = netAmount;
    }

    @JsonProperty("excluded_amount")
    public ExcludedAmount getExcludedAmount() {
        return excludedAmount;
    }

    @JsonProperty("excluded_amount")
    public void setExcludedAmount(ExcludedAmount excludedAmount) {
        this.excludedAmount = excludedAmount;
    }

    @JsonProperty("discounted_amount")
    public DiscountedAmount getDiscountedAmount() {
        return discountedAmount;
    }

    @JsonProperty("discounted_amount")
    public void setDiscountedAmount(DiscountedAmount discountedAmount) {
        this.discountedAmount = discountedAmount;
    }

    @JsonProperty("gross_amount")
    public GrossAmount getGrossAmount() {
        return grossAmount;
    }

    @JsonProperty("gross_amount")
    public void setGrossAmount(GrossAmount grossAmount) {
        this.grossAmount = grossAmount;
    }

    @JsonProperty("strikethrough_amount")
    public StrikethroughAmount getStrikethroughAmount() {
        return strikethroughAmount;
    }

    @JsonProperty("strikethrough_amount")
    public void setStrikethroughAmount(StrikethroughAmount strikethroughAmount) {
        this.strikethroughAmount = strikethroughAmount;
    }

    @JsonProperty("all_inclusive_amount")
    public AllInclusiveAmount getAllInclusiveAmount() {
        return allInclusiveAmount;
    }

    @JsonProperty("all_inclusive_amount")
    public void setAllInclusiveAmount(AllInclusiveAmount allInclusiveAmount) {
        this.allInclusiveAmount = allInclusiveAmount;
    }

    @JsonProperty("product_price_breakdowns")
    public List<ProductPriceBreakdown> getProductPriceBreakdowns() {
        return productPriceBreakdowns;
    }

    @JsonProperty("product_price_breakdowns")
    public void setProductPriceBreakdowns(List<ProductPriceBreakdown> productPriceBreakdowns) {
        this.productPriceBreakdowns = productPriceBreakdowns;
    }

    @JsonProperty("reward_amount")
    public RewardAmount__1 getRewardAmount() {
        return rewardAmount;
    }

    @JsonProperty("reward_amount")
    public void setRewardAmount(RewardAmount__1 rewardAmount) {
        this.rewardAmount = rewardAmount;
    }

    @JsonProperty("gross_amount_per_night")
    public GrossAmountPerNight__1 getGrossAmountPerNight() {
        return grossAmountPerNight;
    }

    @JsonProperty("gross_amount_per_night")
    public void setGrossAmountPerNight(GrossAmountPerNight__1 grossAmountPerNight) {
        this.grossAmountPerNight = grossAmountPerNight;
    }

    @JsonProperty("items")
    public List<Item__1> getItems() {
        return items;
    }

    @JsonProperty("items")
    public void setItems(List<Item__1> items) {
        this.items = items;
    }

    @JsonProperty("strikethrough_amount_per_night")
    public StrikethroughAmountPerNight__1 getStrikethroughAmountPerNight() {
        return strikethroughAmountPerNight;
    }

    @JsonProperty("strikethrough_amount_per_night")
    public void setStrikethroughAmountPerNight(StrikethroughAmountPerNight__1 strikethroughAmountPerNight) {
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
        sb.append(CompositePriceBreakdown.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("benefits");
        sb.append('=');
        sb.append(((this.benefits == null)?"<null>":this.benefits));
        sb.append(',');
        sb.append("includedTaxesAndChargesAmount");
        sb.append('=');
        sb.append(((this.includedTaxesAndChargesAmount == null)?"<null>":this.includedTaxesAndChargesAmount));
        sb.append(',');
        sb.append("netAmount");
        sb.append('=');
        sb.append(((this.netAmount == null)?"<null>":this.netAmount));
        sb.append(',');
        sb.append("excludedAmount");
        sb.append('=');
        sb.append(((this.excludedAmount == null)?"<null>":this.excludedAmount));
        sb.append(',');
        sb.append("discountedAmount");
        sb.append('=');
        sb.append(((this.discountedAmount == null)?"<null>":this.discountedAmount));
        sb.append(',');
        sb.append("grossAmount");
        sb.append('=');
        sb.append(((this.grossAmount == null)?"<null>":this.grossAmount));
        sb.append(',');
        sb.append("strikethroughAmount");
        sb.append('=');
        sb.append(((this.strikethroughAmount == null)?"<null>":this.strikethroughAmount));
        sb.append(',');
        sb.append("allInclusiveAmount");
        sb.append('=');
        sb.append(((this.allInclusiveAmount == null)?"<null>":this.allInclusiveAmount));
        sb.append(',');
        sb.append("productPriceBreakdowns");
        sb.append('=');
        sb.append(((this.productPriceBreakdowns == null)?"<null>":this.productPriceBreakdowns));
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
