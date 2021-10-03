
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
    "base",
    "name",
    "kind",
    "details",
    "inclusion_type",
    "item_amount",
    "identifier"
})
@Generated("jsonschema2pojo")
public class Item__1 implements Serializable
{

    @JsonProperty("base")
    private Base__1 base;
    @JsonProperty("name")
    private String name;
    @JsonProperty("kind")
    private String kind;
    @JsonProperty("details")
    private String details;
    @JsonProperty("inclusion_type")
    private String inclusionType;
    @JsonProperty("item_amount")
    private ItemAmount__1 itemAmount;
    @JsonProperty("identifier")
    private String identifier;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -2506798992679357307L;

    @JsonProperty("base")
    public Base__1 getBase() {
        return base;
    }

    @JsonProperty("base")
    public void setBase(Base__1 base) {
        this.base = base;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("kind")
    public String getKind() {
        return kind;
    }

    @JsonProperty("kind")
    public void setKind(String kind) {
        this.kind = kind;
    }

    @JsonProperty("details")
    public String getDetails() {
        return details;
    }

    @JsonProperty("details")
    public void setDetails(String details) {
        this.details = details;
    }

    @JsonProperty("inclusion_type")
    public String getInclusionType() {
        return inclusionType;
    }

    @JsonProperty("inclusion_type")
    public void setInclusionType(String inclusionType) {
        this.inclusionType = inclusionType;
    }

    @JsonProperty("item_amount")
    public ItemAmount__1 getItemAmount() {
        return itemAmount;
    }

    @JsonProperty("item_amount")
    public void setItemAmount(ItemAmount__1 itemAmount) {
        this.itemAmount = itemAmount;
    }

    @JsonProperty("identifier")
    public String getIdentifier() {
        return identifier;
    }

    @JsonProperty("identifier")
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
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
        sb.append(Item__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("base");
        sb.append('=');
        sb.append(((this.base == null)?"<null>":this.base));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("kind");
        sb.append('=');
        sb.append(((this.kind == null)?"<null>":this.kind));
        sb.append(',');
        sb.append("details");
        sb.append('=');
        sb.append(((this.details == null)?"<null>":this.details));
        sb.append(',');
        sb.append("inclusionType");
        sb.append('=');
        sb.append(((this.inclusionType == null)?"<null>":this.inclusionType));
        sb.append(',');
        sb.append("itemAmount");
        sb.append('=');
        sb.append(((this.itemAmount == null)?"<null>":this.itemAmount));
        sb.append(',');
        sb.append("identifier");
        sb.append('=');
        sb.append(((this.identifier == null)?"<null>":this.identifier));
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
