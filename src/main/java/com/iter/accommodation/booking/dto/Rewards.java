
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
    "blocks",
    "total"
})
@Generated("jsonschema2pojo")
public class Rewards implements Serializable
{

    @JsonProperty("blocks")
    private List<Block> blocks = null;
    @JsonProperty("total")
    private Total total;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 1900473296189761170L;

    @JsonProperty("blocks")
    public List<Block> getBlocks() {
        return blocks;
    }

    @JsonProperty("blocks")
    public void setBlocks(List<Block> blocks) {
        this.blocks = blocks;
    }

    @JsonProperty("total")
    public Total getTotal() {
        return total;
    }

    @JsonProperty("total")
    public void setTotal(Total total) {
        this.total = total;
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
        sb.append(Rewards.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("blocks");
        sb.append('=');
        sb.append(((this.blocks == null)?"<null>":this.blocks));
        sb.append(',');
        sb.append("total");
        sb.append('=');
        sb.append(((this.total == null)?"<null>":this.total));
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
