
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
    "landmark_type",
    "rtl",
    "label",
    "region",
    "hotels",
    "image_url",
    "dest_type",
    "dest_id",
    "latitude",
    "country",
    "longitude",
    "type",
    "city_ufi",
    "cc1",
    "name",
    "nr_hotels",
    "city_name",
    "lc",
    "timezone"
})
@Generated("jsonschema2pojo")
public class Location implements Serializable
{

    @JsonProperty("landmark_type")
    private int landmarkType;
    @JsonProperty("rtl")
    private int rtl;
    @JsonProperty("label")
    private String label;
    @JsonProperty("region")
    private String region;
    @JsonProperty("hotels")
    private int hotels;
    @JsonProperty("image_url")
    private String imageUrl;
    @JsonProperty("dest_type")
    private String destType;
    @JsonProperty("dest_id")
    private String destId;
    @JsonProperty("latitude")
    private double latitude;
    @JsonProperty("country")
    private String country;
    @JsonProperty("longitude")
    private double longitude;
    @JsonProperty("type")
    private String type;
    @JsonProperty("city_ufi")
    private int cityUfi;
    @JsonProperty("cc1")
    private String cc1;
    @JsonProperty("name")
    private String name;
    @JsonProperty("nr_hotels")
    private int nrHotels;
    @JsonProperty("city_name")
    private String cityName;
    @JsonProperty("lc")
    private String lc;
    @JsonProperty("timezone")
    private String timezone;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 4035205238941489248L;

    @JsonProperty("landmark_type")
    public int getLandmarkType() {
        return landmarkType;
    }

    @JsonProperty("landmark_type")
    public void setLandmarkType(int landmarkType) {
        this.landmarkType = landmarkType;
    }

    @JsonProperty("rtl")
    public int getRtl() {
        return rtl;
    }

    @JsonProperty("rtl")
    public void setRtl(int rtl) {
        this.rtl = rtl;
    }

    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    @JsonProperty("label")
    public void setLabel(String label) {
        this.label = label;
    }

    @JsonProperty("region")
    public String getRegion() {
        return region;
    }

    @JsonProperty("region")
    public void setRegion(String region) {
        this.region = region;
    }

    @JsonProperty("hotels")
    public int getHotels() {
        return hotels;
    }

    @JsonProperty("hotels")
    public void setHotels(int hotels) {
        this.hotels = hotels;
    }

    @JsonProperty("image_url")
    public String getImageUrl() {
        return imageUrl;
    }

    @JsonProperty("image_url")
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @JsonProperty("dest_type")
    public String getDestType() {
        return destType;
    }

    @JsonProperty("dest_type")
    public void setDestType(String destType) {
        this.destType = destType;
    }

    @JsonProperty("dest_id")
    public String getDestId() {
        return destId;
    }

    @JsonProperty("dest_id")
    public void setDestId(String destId) {
        this.destId = destId;
    }

    @JsonProperty("latitude")
    public double getLatitude() {
        return latitude;
    }

    @JsonProperty("latitude")
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("longitude")
    public double getLongitude() {
        return longitude;
    }

    @JsonProperty("longitude")
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("city_ufi")
    public int getCityUfi() {
        return cityUfi;
    }

    @JsonProperty("city_ufi")
    public void setCityUfi(int cityUfi) {
        this.cityUfi = cityUfi;
    }

    @JsonProperty("cc1")
    public String getCc1() {
        return cc1;
    }

    @JsonProperty("cc1")
    public void setCc1(String cc1) {
        this.cc1 = cc1;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("nr_hotels")
    public int getNrHotels() {
        return nrHotels;
    }

    @JsonProperty("nr_hotels")
    public void setNrHotels(int nrHotels) {
        this.nrHotels = nrHotels;
    }

    @JsonProperty("city_name")
    public String getCityName() {
        return cityName;
    }

    @JsonProperty("city_name")
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @JsonProperty("lc")
    public String getLc() {
        return lc;
    }

    @JsonProperty("lc")
    public void setLc(String lc) {
        this.lc = lc;
    }

    @JsonProperty("timezone")
    public String getTimezone() {
        return timezone;
    }

    @JsonProperty("timezone")
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
