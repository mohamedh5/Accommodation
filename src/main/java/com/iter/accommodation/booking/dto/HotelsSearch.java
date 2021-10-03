
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
    "primary_count",
    "count",
    "room_distribution",
    "map_bounding_box",
    "total_count_with_filters",
    "unfiltered_count",
    "extended_count",
    "unfiltered_primary_count",
    "search_radius",
    "sort",
    "result"
})
@Generated("jsonschema2pojo")
public class HotelsSearch implements Serializable
{

    @JsonProperty("primary_count")
    private Integer primaryCount;
    @JsonProperty("count")
    private Integer count;
    @JsonProperty("room_distribution")
    private List<RoomDistribution> roomDistribution = null;
    @JsonProperty("map_bounding_box")
    private MapBoundingBox mapBoundingBox;
    @JsonProperty("total_count_with_filters")
    private Integer totalCountWithFilters;
    @JsonProperty("unfiltered_count")
    private Integer unfilteredCount;
    @JsonProperty("extended_count")
    private Integer extendedCount;
    @JsonProperty("unfiltered_primary_count")
    private Integer unfilteredPrimaryCount;
    @JsonProperty("search_radius")
    private Double searchRadius;
    @JsonProperty("sort")
    private List<Sort> sort = null;
    @JsonProperty("result")
    private List<Result> result = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -334693492549222081L;

    @JsonProperty("primary_count")
    public Integer getPrimaryCount() {
        return primaryCount;
    }

    @JsonProperty("primary_count")
    public void setPrimaryCount(Integer primaryCount) {
        this.primaryCount = primaryCount;
    }

    @JsonProperty("count")
    public Integer getCount() {
        return count;
    }

    @JsonProperty("count")
    public void setCount(Integer count) {
        this.count = count;
    }

    @JsonProperty("room_distribution")
    public List<RoomDistribution> getRoomDistribution() {
        return roomDistribution;
    }

    @JsonProperty("room_distribution")
    public void setRoomDistribution(List<RoomDistribution> roomDistribution) {
        this.roomDistribution = roomDistribution;
    }

    @JsonProperty("map_bounding_box")
    public MapBoundingBox getMapBoundingBox() {
        return mapBoundingBox;
    }

    @JsonProperty("map_bounding_box")
    public void setMapBoundingBox(MapBoundingBox mapBoundingBox) {
        this.mapBoundingBox = mapBoundingBox;
    }

    @JsonProperty("total_count_with_filters")
    public Integer getTotalCountWithFilters() {
        return totalCountWithFilters;
    }

    @JsonProperty("total_count_with_filters")
    public void setTotalCountWithFilters(Integer totalCountWithFilters) {
        this.totalCountWithFilters = totalCountWithFilters;
    }

    @JsonProperty("unfiltered_count")
    public Integer getUnfilteredCount() {
        return unfilteredCount;
    }

    @JsonProperty("unfiltered_count")
    public void setUnfilteredCount(Integer unfilteredCount) {
        this.unfilteredCount = unfilteredCount;
    }

    @JsonProperty("extended_count")
    public Integer getExtendedCount() {
        return extendedCount;
    }

    @JsonProperty("extended_count")
    public void setExtendedCount(Integer extendedCount) {
        this.extendedCount = extendedCount;
    }

    @JsonProperty("unfiltered_primary_count")
    public Integer getUnfilteredPrimaryCount() {
        return unfilteredPrimaryCount;
    }

    @JsonProperty("unfiltered_primary_count")
    public void setUnfilteredPrimaryCount(Integer unfilteredPrimaryCount) {
        this.unfilteredPrimaryCount = unfilteredPrimaryCount;
    }

    @JsonProperty("search_radius")
    public Double getSearchRadius() {
        return searchRadius;
    }

    @JsonProperty("search_radius")
    public void setSearchRadius(Double searchRadius) {
        this.searchRadius = searchRadius;
    }

    @JsonProperty("sort")
    public List<Sort> getSort() {
        return sort;
    }

    @JsonProperty("sort")
    public void setSort(List<Sort> sort) {
        this.sort = sort;
    }

    @JsonProperty("result")
    public List<Result> getResult() {
        return result;
    }

    @JsonProperty("result")
    public void setResult(List<Result> result) {
        this.result = result;
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
        sb.append(HotelsSearch.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("primaryCount");
        sb.append('=');
        sb.append(((this.primaryCount == null)?"<null>":this.primaryCount));
        sb.append(',');
        sb.append("count");
        sb.append('=');
        sb.append(((this.count == null)?"<null>":this.count));
        sb.append(',');
        sb.append("roomDistribution");
        sb.append('=');
        sb.append(((this.roomDistribution == null)?"<null>":this.roomDistribution));
        sb.append(',');
        sb.append("mapBoundingBox");
        sb.append('=');
        sb.append(((this.mapBoundingBox == null)?"<null>":this.mapBoundingBox));
        sb.append(',');
        sb.append("totalCountWithFilters");
        sb.append('=');
        sb.append(((this.totalCountWithFilters == null)?"<null>":this.totalCountWithFilters));
        sb.append(',');
        sb.append("unfilteredCount");
        sb.append('=');
        sb.append(((this.unfilteredCount == null)?"<null>":this.unfilteredCount));
        sb.append(',');
        sb.append("extendedCount");
        sb.append('=');
        sb.append(((this.extendedCount == null)?"<null>":this.extendedCount));
        sb.append(',');
        sb.append("unfilteredPrimaryCount");
        sb.append('=');
        sb.append(((this.unfilteredPrimaryCount == null)?"<null>":this.unfilteredPrimaryCount));
        sb.append(',');
        sb.append("searchRadius");
        sb.append('=');
        sb.append(((this.searchRadius == null)?"<null>":this.searchRadius));
        sb.append(',');
        sb.append("sort");
        sb.append('=');
        sb.append(((this.sort == null)?"<null>":this.sort));
        sb.append(',');
        sb.append("result");
        sb.append('=');
        sb.append(((this.result == null)?"<null>":this.result));
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
