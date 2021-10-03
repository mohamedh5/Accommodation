
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
    "block_id"
})
@Generated("jsonschema2pojo")
public class Block implements Serializable
{

    @JsonProperty("credits")
    private List<Credit> credits = null;
    @JsonProperty("block_id")
    private String blockId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 1562679007808294728L;

    @JsonProperty("credits")
    public List<Credit> getCredits() {
        return credits;
    }

    @JsonProperty("credits")
    public void setCredits(List<Credit> credits) {
        this.credits = credits;
    }

    @JsonProperty("block_id")
    public String getBlockId() {
        return blockId;
    }

    @JsonProperty("block_id")
    public void setBlockId(String blockId) {
        this.blockId = blockId;
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
        sb.append(Block.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("credits");
        sb.append('=');
        sb.append(((this.credits == null)?"<null>":this.credits));
        sb.append(',');
        sb.append("blockId");
        sb.append('=');
        sb.append(((this.blockId == null)?"<null>":this.blockId));
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
