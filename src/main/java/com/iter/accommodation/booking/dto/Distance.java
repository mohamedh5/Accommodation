
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
    "text",
    "icon_name",
    "icon_set"
})
@Generated("jsonschema2pojo")
public class Distance implements Serializable
{

    @JsonProperty("text")
    private String text;
    @JsonProperty("icon_name")
    private String iconName;
    @JsonProperty("icon_set")
    private Object iconSet;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 7331618369844768204L;

    @JsonProperty("text")
    public String getText() {
        return text;
    }

    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    @JsonProperty("icon_name")
    public String getIconName() {
        return iconName;
    }

    @JsonProperty("icon_name")
    public void setIconName(String iconName) {
        this.iconName = iconName;
    }

    @JsonProperty("icon_set")
    public Object getIconSet() {
        return iconSet;
    }

    @JsonProperty("icon_set")
    public void setIconSet(Object iconSet) {
        this.iconSet = iconSet;
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
        sb.append(Distance.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("text");
        sb.append('=');
        sb.append(((this.text == null)?"<null>":this.text));
        sb.append(',');
        sb.append("iconName");
        sb.append('=');
        sb.append(((this.iconName == null)?"<null>":this.iconName));
        sb.append(',');
        sb.append("iconSet");
        sb.append('=');
        sb.append(((this.iconSet == null)?"<null>":this.iconSet));
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
