
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
    "is_city_center",
    "in_best_district",
    "children_not_allowed",
    "is_beach_front",
    "cant_book",
    "hotel_id",
    "bwallet",
    "main_photo_id",
    "cc1",
    "is_genius_deal",
    "currencycode",
    "accommodation_type_name",
    "district_id",
    "checkout",
    "review_recommendation",
    "city_in_trans",
    "address_trans",
    "url",
    "distances",
    "city",
    "address",
    "review_score_word",
    "main_photo_url",
    "id",
    "badges",
    "is_wholesaler_candidate",
    "wishlist_count",
    "hotel_facilities",
    "soldout",
    "hotel_name_trans",
    "class_is_estimated",
    "timezone",
    "preferred",
    "preferred_plus",
    "district",
    "genius_discount_percentage",
    "ufi",
    "price_breakdown",
    "hotel_has_vb_boost",
    "is_smart_deal",
    "mobile_discount_percentage",
    "is_mobile_deal",
    "districts",
    "is_no_prepayment_block",
    "unit_configuration_label",
    "longitude",
    "selected_review_topic",
    "country_trans",
    "min_total_price",
    "class",
    "block_ids",
    "extended",
    "zip",
    "default_language",
    "rewards",
    "is_geo_rate",
    "city_trans",
    "composite_price_breakdown",
    "distance",
    "is_free_cancellable",
    "hotel_include_breakfast",
    "countrycode",
    "review_nr",
    "distance_to_cc",
    "default_wishlist_name",
    "accommodation_type",
    "latitude",
    "price_is_final",
    "checkin",
    "type",
    "hotel_name",
    "review_score",
    "currency_code",
    "cc_required",
    "city_name_en",
    "max_photo_url",
    "max_1440_photo_url"
})
@Generated("jsonschema2pojo")
public class Result implements Serializable
{

    @JsonProperty("is_city_center")
    private Integer isCityCenter;
    @JsonProperty("in_best_district")
    private Integer inBestDistrict;
    @JsonProperty("children_not_allowed")
    private Object childrenNotAllowed;
    @JsonProperty("is_beach_front")
    private Integer isBeachFront;
    @JsonProperty("cant_book")
    private Object cantBook;
    @JsonProperty("hotel_id")
    private Integer hotelId;
    @JsonProperty("bwallet")
    private Bwallet bwallet;
    @JsonProperty("main_photo_id")
    private Integer mainPhotoId;
    @JsonProperty("cc1")
    private String cc1;
    @JsonProperty("is_genius_deal")
    private Integer isGeniusDeal;
    @JsonProperty("currencycode")
    private String currencycode;
    @JsonProperty("accommodation_type_name")
    private String accommodationTypeName;
    @JsonProperty("district_id")
    private Integer districtId;
    @JsonProperty("checkout")
    private Checkout checkout;
    @JsonProperty("review_recommendation")
    private String reviewRecommendation;
    @JsonProperty("city_in_trans")
    private String cityInTrans;
    @JsonProperty("address_trans")
    private String addressTrans;
    @JsonProperty("url")
    private String url;
    @JsonProperty("distances")
    private List<Distance> distances = null;
    @JsonProperty("city")
    private String city;
    @JsonProperty("address")
    private String address;
    @JsonProperty("review_score_word")
    private String reviewScoreWord;
    @JsonProperty("main_photo_url")
    private String mainPhotoUrl;
    @JsonProperty("id")
    private String id;
    @JsonProperty("badges")
    private List<Badge> badges = null;
    @JsonProperty("is_wholesaler_candidate")
    private Integer isWholesalerCandidate;
    @JsonProperty("wishlist_count")
    private Integer wishlistCount;
    @JsonProperty("hotel_facilities")
    private String hotelFacilities;
    @JsonProperty("soldout")
    private Integer soldout;
    @JsonProperty("hotel_name_trans")
    private String hotelNameTrans;
    @JsonProperty("class_is_estimated")
    private Integer classIsEstimated;
    @JsonProperty("timezone")
    private String timezone;
    @JsonProperty("preferred")
    private Integer preferred;
    @JsonProperty("preferred_plus")
    private Integer preferredPlus;
    @JsonProperty("district")
    private String district;
    @JsonProperty("genius_discount_percentage")
    private Integer geniusDiscountPercentage;
    @JsonProperty("ufi")
    private Integer ufi;
    @JsonProperty("price_breakdown")
    private PriceBreakdown priceBreakdown;
    @JsonProperty("hotel_has_vb_boost")
    private Integer hotelHasVbBoost;
    @JsonProperty("is_smart_deal")
    private Integer isSmartDeal;
    @JsonProperty("mobile_discount_percentage")
    private Integer mobileDiscountPercentage;
    @JsonProperty("is_mobile_deal")
    private Integer isMobileDeal;
    @JsonProperty("districts")
    private String districts;
    @JsonProperty("is_no_prepayment_block")
    private Integer isNoPrepaymentBlock;
    @JsonProperty("unit_configuration_label")
    private String unitConfigurationLabel;
    @JsonProperty("longitude")
    private Double longitude;
    @JsonProperty("selected_review_topic")
    private Object selectedReviewTopic;
    @JsonProperty("country_trans")
    private String countryTrans;
    @JsonProperty("min_total_price")
    private Integer minTotalPrice;
    @JsonProperty("class")
    private Double _class;
    @JsonProperty("block_ids")
    private List<String> blockIds = null;
    @JsonProperty("extended")
    private Integer extended;
    @JsonProperty("zip")
    private String zip;
    @JsonProperty("default_language")
    private String defaultLanguage;
    @JsonProperty("rewards")
    private Rewards rewards;
    @JsonProperty("is_geo_rate")
    private String isGeoRate;
    @JsonProperty("city_trans")
    private String cityTrans;
    @JsonProperty("composite_price_breakdown")
    private CompositePriceBreakdown compositePriceBreakdown;
    @JsonProperty("distance")
    private String distance;
    @JsonProperty("is_free_cancellable")
    private Integer isFreeCancellable;
    @JsonProperty("hotel_include_breakfast")
    private Integer hotelIncludeBreakfast;
    @JsonProperty("countrycode")
    private String countrycode;
    @JsonProperty("review_nr")
    private Integer reviewNr;
    @JsonProperty("distance_to_cc")
    private String distanceToCc;
    @JsonProperty("default_wishlist_name")
    private String defaultWishlistName;
    @JsonProperty("accommodation_type")
    private Integer accommodationType;
    @JsonProperty("latitude")
    private Double latitude;
    @JsonProperty("price_is_final")
    private Integer priceIsFinal;
    @JsonProperty("checkin")
    private Checkin checkin;
    @JsonProperty("type")
    private String type;
    @JsonProperty("hotel_name")
    private String hotelName;
    @JsonProperty("review_score")
    private Double reviewScore;
    @JsonProperty("currency_code")
    private String currencyCode;
    @JsonProperty("cc_required")
    private Integer ccRequired;
    @JsonProperty("city_name_en")
    private String cityNameEn;
    @JsonProperty("max_photo_url")
    private String maxPhotoUrl;
    @JsonProperty("max_1440_photo_url")
    private String max1440PhotoUrl;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 2594170644083920229L;

    @JsonProperty("is_city_center")
    public Integer getIsCityCenter() {
        return isCityCenter;
    }

    @JsonProperty("is_city_center")
    public void setIsCityCenter(Integer isCityCenter) {
        this.isCityCenter = isCityCenter;
    }

    @JsonProperty("in_best_district")
    public Integer getInBestDistrict() {
        return inBestDistrict;
    }

    @JsonProperty("in_best_district")
    public void setInBestDistrict(Integer inBestDistrict) {
        this.inBestDistrict = inBestDistrict;
    }

    @JsonProperty("children_not_allowed")
    public Object getChildrenNotAllowed() {
        return childrenNotAllowed;
    }

    @JsonProperty("children_not_allowed")
    public void setChildrenNotAllowed(Object childrenNotAllowed) {
        this.childrenNotAllowed = childrenNotAllowed;
    }

    @JsonProperty("is_beach_front")
    public Integer getIsBeachFront() {
        return isBeachFront;
    }

    @JsonProperty("is_beach_front")
    public void setIsBeachFront(Integer isBeachFront) {
        this.isBeachFront = isBeachFront;
    }

    @JsonProperty("cant_book")
    public Object getCantBook() {
        return cantBook;
    }

    @JsonProperty("cant_book")
    public void setCantBook(Object cantBook) {
        this.cantBook = cantBook;
    }

    @JsonProperty("hotel_id")
    public Integer getHotelId() {
        return hotelId;
    }

    @JsonProperty("hotel_id")
    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
    }

    @JsonProperty("bwallet")
    public Bwallet getBwallet() {
        return bwallet;
    }

    @JsonProperty("bwallet")
    public void setBwallet(Bwallet bwallet) {
        this.bwallet = bwallet;
    }

    @JsonProperty("main_photo_id")
    public Integer getMainPhotoId() {
        return mainPhotoId;
    }

    @JsonProperty("main_photo_id")
    public void setMainPhotoId(Integer mainPhotoId) {
        this.mainPhotoId = mainPhotoId;
    }

    @JsonProperty("cc1")
    public String getCc1() {
        return cc1;
    }

    @JsonProperty("cc1")
    public void setCc1(String cc1) {
        this.cc1 = cc1;
    }

    @JsonProperty("is_genius_deal")
    public Integer getIsGeniusDeal() {
        return isGeniusDeal;
    }

    @JsonProperty("is_genius_deal")
    public void setIsGeniusDeal(Integer isGeniusDeal) {
        this.isGeniusDeal = isGeniusDeal;
    }

    @JsonProperty("currencycode")
    public String getCurrencycode() {
        return currencycode;
    }

    @JsonProperty("currencycode")
    public void setCurrencycode(String currencycode) {
        this.currencycode = currencycode;
    }

    @JsonProperty("accommodation_type_name")
    public String getAccommodationTypeName() {
        return accommodationTypeName;
    }

    @JsonProperty("accommodation_type_name")
    public void setAccommodationTypeName(String accommodationTypeName) {
        this.accommodationTypeName = accommodationTypeName;
    }

    @JsonProperty("district_id")
    public Integer getDistrictId() {
        return districtId;
    }

    @JsonProperty("district_id")
    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    @JsonProperty("checkout")
    public Checkout getCheckout() {
        return checkout;
    }

    @JsonProperty("checkout")
    public void setCheckout(Checkout checkout) {
        this.checkout = checkout;
    }

    @JsonProperty("review_recommendation")
    public String getReviewRecommendation() {
        return reviewRecommendation;
    }

    @JsonProperty("review_recommendation")
    public void setReviewRecommendation(String reviewRecommendation) {
        this.reviewRecommendation = reviewRecommendation;
    }

    @JsonProperty("city_in_trans")
    public String getCityInTrans() {
        return cityInTrans;
    }

    @JsonProperty("city_in_trans")
    public void setCityInTrans(String cityInTrans) {
        this.cityInTrans = cityInTrans;
    }

    @JsonProperty("address_trans")
    public String getAddressTrans() {
        return addressTrans;
    }

    @JsonProperty("address_trans")
    public void setAddressTrans(String addressTrans) {
        this.addressTrans = addressTrans;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("distances")
    public List<Distance> getDistances() {
        return distances;
    }

    @JsonProperty("distances")
    public void setDistances(List<Distance> distances) {
        this.distances = distances;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("address")
    public String getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(String address) {
        this.address = address;
    }

    @JsonProperty("review_score_word")
    public String getReviewScoreWord() {
        return reviewScoreWord;
    }

    @JsonProperty("review_score_word")
    public void setReviewScoreWord(String reviewScoreWord) {
        this.reviewScoreWord = reviewScoreWord;
    }

    @JsonProperty("main_photo_url")
    public String getMainPhotoUrl() {
        return mainPhotoUrl;
    }

    @JsonProperty("main_photo_url")
    public void setMainPhotoUrl(String mainPhotoUrl) {
        this.mainPhotoUrl = mainPhotoUrl;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("badges")
    public List<Badge> getBadges() {
        return badges;
    }

    @JsonProperty("badges")
    public void setBadges(List<Badge> badges) {
        this.badges = badges;
    }

    @JsonProperty("is_wholesaler_candidate")
    public Integer getIsWholesalerCandidate() {
        return isWholesalerCandidate;
    }

    @JsonProperty("is_wholesaler_candidate")
    public void setIsWholesalerCandidate(Integer isWholesalerCandidate) {
        this.isWholesalerCandidate = isWholesalerCandidate;
    }

    @JsonProperty("wishlist_count")
    public Integer getWishlistCount() {
        return wishlistCount;
    }

    @JsonProperty("wishlist_count")
    public void setWishlistCount(Integer wishlistCount) {
        this.wishlistCount = wishlistCount;
    }

    @JsonProperty("hotel_facilities")
    public String getHotelFacilities() {
        return hotelFacilities;
    }

    @JsonProperty("hotel_facilities")
    public void setHotelFacilities(String hotelFacilities) {
        this.hotelFacilities = hotelFacilities;
    }

    @JsonProperty("soldout")
    public Integer getSoldout() {
        return soldout;
    }

    @JsonProperty("soldout")
    public void setSoldout(Integer soldout) {
        this.soldout = soldout;
    }

    @JsonProperty("hotel_name_trans")
    public String getHotelNameTrans() {
        return hotelNameTrans;
    }

    @JsonProperty("hotel_name_trans")
    public void setHotelNameTrans(String hotelNameTrans) {
        this.hotelNameTrans = hotelNameTrans;
    }

    @JsonProperty("class_is_estimated")
    public Integer getClassIsEstimated() {
        return classIsEstimated;
    }

    @JsonProperty("class_is_estimated")
    public void setClassIsEstimated(Integer classIsEstimated) {
        this.classIsEstimated = classIsEstimated;
    }

    @JsonProperty("timezone")
    public String getTimezone() {
        return timezone;
    }

    @JsonProperty("timezone")
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    @JsonProperty("preferred")
    public Integer getPreferred() {
        return preferred;
    }

    @JsonProperty("preferred")
    public void setPreferred(Integer preferred) {
        this.preferred = preferred;
    }

    @JsonProperty("preferred_plus")
    public Integer getPreferredPlus() {
        return preferredPlus;
    }

    @JsonProperty("preferred_plus")
    public void setPreferredPlus(Integer preferredPlus) {
        this.preferredPlus = preferredPlus;
    }

    @JsonProperty("district")
    public String getDistrict() {
        return district;
    }

    @JsonProperty("district")
    public void setDistrict(String district) {
        this.district = district;
    }

    @JsonProperty("genius_discount_percentage")
    public Integer getGeniusDiscountPercentage() {
        return geniusDiscountPercentage;
    }

    @JsonProperty("genius_discount_percentage")
    public void setGeniusDiscountPercentage(Integer geniusDiscountPercentage) {
        this.geniusDiscountPercentage = geniusDiscountPercentage;
    }

    @JsonProperty("ufi")
    public Integer getUfi() {
        return ufi;
    }

    @JsonProperty("ufi")
    public void setUfi(Integer ufi) {
        this.ufi = ufi;
    }

    @JsonProperty("price_breakdown")
    public PriceBreakdown getPriceBreakdown() {
        return priceBreakdown;
    }

    @JsonProperty("price_breakdown")
    public void setPriceBreakdown(PriceBreakdown priceBreakdown) {
        this.priceBreakdown = priceBreakdown;
    }

    @JsonProperty("hotel_has_vb_boost")
    public Integer getHotelHasVbBoost() {
        return hotelHasVbBoost;
    }

    @JsonProperty("hotel_has_vb_boost")
    public void setHotelHasVbBoost(Integer hotelHasVbBoost) {
        this.hotelHasVbBoost = hotelHasVbBoost;
    }

    @JsonProperty("is_smart_deal")
    public Integer getIsSmartDeal() {
        return isSmartDeal;
    }

    @JsonProperty("is_smart_deal")
    public void setIsSmartDeal(Integer isSmartDeal) {
        this.isSmartDeal = isSmartDeal;
    }

    @JsonProperty("mobile_discount_percentage")
    public Integer getMobileDiscountPercentage() {
        return mobileDiscountPercentage;
    }

    @JsonProperty("mobile_discount_percentage")
    public void setMobileDiscountPercentage(Integer mobileDiscountPercentage) {
        this.mobileDiscountPercentage = mobileDiscountPercentage;
    }

    @JsonProperty("is_mobile_deal")
    public Integer getIsMobileDeal() {
        return isMobileDeal;
    }

    @JsonProperty("is_mobile_deal")
    public void setIsMobileDeal(Integer isMobileDeal) {
        this.isMobileDeal = isMobileDeal;
    }

    @JsonProperty("districts")
    public String getDistricts() {
        return districts;
    }

    @JsonProperty("districts")
    public void setDistricts(String districts) {
        this.districts = districts;
    }

    @JsonProperty("is_no_prepayment_block")
    public Integer getIsNoPrepaymentBlock() {
        return isNoPrepaymentBlock;
    }

    @JsonProperty("is_no_prepayment_block")
    public void setIsNoPrepaymentBlock(Integer isNoPrepaymentBlock) {
        this.isNoPrepaymentBlock = isNoPrepaymentBlock;
    }

    @JsonProperty("unit_configuration_label")
    public String getUnitConfigurationLabel() {
        return unitConfigurationLabel;
    }

    @JsonProperty("unit_configuration_label")
    public void setUnitConfigurationLabel(String unitConfigurationLabel) {
        this.unitConfigurationLabel = unitConfigurationLabel;
    }

    @JsonProperty("longitude")
    public Double getLongitude() {
        return longitude;
    }

    @JsonProperty("longitude")
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    @JsonProperty("selected_review_topic")
    public Object getSelectedReviewTopic() {
        return selectedReviewTopic;
    }

    @JsonProperty("selected_review_topic")
    public void setSelectedReviewTopic(Object selectedReviewTopic) {
        this.selectedReviewTopic = selectedReviewTopic;
    }

    @JsonProperty("country_trans")
    public String getCountryTrans() {
        return countryTrans;
    }

    @JsonProperty("country_trans")
    public void setCountryTrans(String countryTrans) {
        this.countryTrans = countryTrans;
    }

    @JsonProperty("min_total_price")
    public Integer getMinTotalPrice() {
        return minTotalPrice;
    }

    @JsonProperty("min_total_price")
    public void setMinTotalPrice(Integer minTotalPrice) {
        this.minTotalPrice = minTotalPrice;
    }

    @JsonProperty("class")
    public Double getClass_() {
        return _class;
    }

    @JsonProperty("class")
    public void setClass_(Double _class) {
        this._class = _class;
    }

    @JsonProperty("block_ids")
    public List<String> getBlockIds() {
        return blockIds;
    }

    @JsonProperty("block_ids")
    public void setBlockIds(List<String> blockIds) {
        this.blockIds = blockIds;
    }

    @JsonProperty("extended")
    public Integer getExtended() {
        return extended;
    }

    @JsonProperty("extended")
    public void setExtended(Integer extended) {
        this.extended = extended;
    }

    @JsonProperty("zip")
    public String getZip() {
        return zip;
    }

    @JsonProperty("zip")
    public void setZip(String zip) {
        this.zip = zip;
    }

    @JsonProperty("default_language")
    public String getDefaultLanguage() {
        return defaultLanguage;
    }

    @JsonProperty("default_language")
    public void setDefaultLanguage(String defaultLanguage) {
        this.defaultLanguage = defaultLanguage;
    }

    @JsonProperty("rewards")
    public Rewards getRewards() {
        return rewards;
    }

    @JsonProperty("rewards")
    public void setRewards(Rewards rewards) {
        this.rewards = rewards;
    }

    @JsonProperty("is_geo_rate")
    public String getIsGeoRate() {
        return isGeoRate;
    }

    @JsonProperty("is_geo_rate")
    public void setIsGeoRate(String isGeoRate) {
        this.isGeoRate = isGeoRate;
    }

    @JsonProperty("city_trans")
    public String getCityTrans() {
        return cityTrans;
    }

    @JsonProperty("city_trans")
    public void setCityTrans(String cityTrans) {
        this.cityTrans = cityTrans;
    }

    @JsonProperty("composite_price_breakdown")
    public CompositePriceBreakdown getCompositePriceBreakdown() {
        return compositePriceBreakdown;
    }

    @JsonProperty("composite_price_breakdown")
    public void setCompositePriceBreakdown(CompositePriceBreakdown compositePriceBreakdown) {
        this.compositePriceBreakdown = compositePriceBreakdown;
    }

    @JsonProperty("distance")
    public String getDistance() {
        return distance;
    }

    @JsonProperty("distance")
    public void setDistance(String distance) {
        this.distance = distance;
    }

    @JsonProperty("is_free_cancellable")
    public Integer getIsFreeCancellable() {
        return isFreeCancellable;
    }

    @JsonProperty("is_free_cancellable")
    public void setIsFreeCancellable(Integer isFreeCancellable) {
        this.isFreeCancellable = isFreeCancellable;
    }

    @JsonProperty("hotel_include_breakfast")
    public Integer getHotelIncludeBreakfast() {
        return hotelIncludeBreakfast;
    }

    @JsonProperty("hotel_include_breakfast")
    public void setHotelIncludeBreakfast(Integer hotelIncludeBreakfast) {
        this.hotelIncludeBreakfast = hotelIncludeBreakfast;
    }

    @JsonProperty("countrycode")
    public String getCountrycode() {
        return countrycode;
    }

    @JsonProperty("countrycode")
    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }

    @JsonProperty("review_nr")
    public Integer getReviewNr() {
        return reviewNr;
    }

    @JsonProperty("review_nr")
    public void setReviewNr(Integer reviewNr) {
        this.reviewNr = reviewNr;
    }

    @JsonProperty("distance_to_cc")
    public String getDistanceToCc() {
        return distanceToCc;
    }

    @JsonProperty("distance_to_cc")
    public void setDistanceToCc(String distanceToCc) {
        this.distanceToCc = distanceToCc;
    }

    @JsonProperty("default_wishlist_name")
    public String getDefaultWishlistName() {
        return defaultWishlistName;
    }

    @JsonProperty("default_wishlist_name")
    public void setDefaultWishlistName(String defaultWishlistName) {
        this.defaultWishlistName = defaultWishlistName;
    }

    @JsonProperty("accommodation_type")
    public Integer getAccommodationType() {
        return accommodationType;
    }

    @JsonProperty("accommodation_type")
    public void setAccommodationType(Integer accommodationType) {
        this.accommodationType = accommodationType;
    }

    @JsonProperty("latitude")
    public Double getLatitude() {
        return latitude;
    }

    @JsonProperty("latitude")
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    @JsonProperty("price_is_final")
    public Integer getPriceIsFinal() {
        return priceIsFinal;
    }

    @JsonProperty("price_is_final")
    public void setPriceIsFinal(Integer priceIsFinal) {
        this.priceIsFinal = priceIsFinal;
    }

    @JsonProperty("checkin")
    public Checkin getCheckin() {
        return checkin;
    }

    @JsonProperty("checkin")
    public void setCheckin(Checkin checkin) {
        this.checkin = checkin;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("hotel_name")
    public String getHotelName() {
        return hotelName;
    }

    @JsonProperty("hotel_name")
    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    @JsonProperty("review_score")
    public Double getReviewScore() {
        return reviewScore;
    }

    @JsonProperty("review_score")
    public void setReviewScore(Double reviewScore) {
        this.reviewScore = reviewScore;
    }

    @JsonProperty("currency_code")
    public String getCurrencyCode() {
        return currencyCode;
    }

    @JsonProperty("currency_code")
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    @JsonProperty("cc_required")
    public Integer getCcRequired() {
        return ccRequired;
    }

    @JsonProperty("cc_required")
    public void setCcRequired(Integer ccRequired) {
        this.ccRequired = ccRequired;
    }

    @JsonProperty("city_name_en")
    public String getCityNameEn() {
        return cityNameEn;
    }

    @JsonProperty("city_name_en")
    public void setCityNameEn(String cityNameEn) {
        this.cityNameEn = cityNameEn;
    }

    @JsonProperty("max_photo_url")
    public String getMaxPhotoUrl() {
        return maxPhotoUrl;
    }

    @JsonProperty("max_photo_url")
    public void setMaxPhotoUrl(String maxPhotoUrl) {
        this.maxPhotoUrl = maxPhotoUrl;
    }

    @JsonProperty("max_1440_photo_url")
    public String getMax1440PhotoUrl() {
        return max1440PhotoUrl;
    }

    @JsonProperty("max_1440_photo_url")
    public void setMax1440PhotoUrl(String max1440PhotoUrl) {
        this.max1440PhotoUrl = max1440PhotoUrl;
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
        sb.append(Result.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("isCityCenter");
        sb.append('=');
        sb.append(((this.isCityCenter == null)?"<null>":this.isCityCenter));
        sb.append(',');
        sb.append("inBestDistrict");
        sb.append('=');
        sb.append(((this.inBestDistrict == null)?"<null>":this.inBestDistrict));
        sb.append(',');
        sb.append("childrenNotAllowed");
        sb.append('=');
        sb.append(((this.childrenNotAllowed == null)?"<null>":this.childrenNotAllowed));
        sb.append(',');
        sb.append("isBeachFront");
        sb.append('=');
        sb.append(((this.isBeachFront == null)?"<null>":this.isBeachFront));
        sb.append(',');
        sb.append("cantBook");
        sb.append('=');
        sb.append(((this.cantBook == null)?"<null>":this.cantBook));
        sb.append(',');
        sb.append("hotelId");
        sb.append('=');
        sb.append(((this.hotelId == null)?"<null>":this.hotelId));
        sb.append(',');
        sb.append("bwallet");
        sb.append('=');
        sb.append(((this.bwallet == null)?"<null>":this.bwallet));
        sb.append(',');
        sb.append("mainPhotoId");
        sb.append('=');
        sb.append(((this.mainPhotoId == null)?"<null>":this.mainPhotoId));
        sb.append(',');
        sb.append("cc1");
        sb.append('=');
        sb.append(((this.cc1 == null)?"<null>":this.cc1));
        sb.append(',');
        sb.append("isGeniusDeal");
        sb.append('=');
        sb.append(((this.isGeniusDeal == null)?"<null>":this.isGeniusDeal));
        sb.append(',');
        sb.append("currencycode");
        sb.append('=');
        sb.append(((this.currencycode == null)?"<null>":this.currencycode));
        sb.append(',');
        sb.append("accommodationTypeName");
        sb.append('=');
        sb.append(((this.accommodationTypeName == null)?"<null>":this.accommodationTypeName));
        sb.append(',');
        sb.append("districtId");
        sb.append('=');
        sb.append(((this.districtId == null)?"<null>":this.districtId));
        sb.append(',');
        sb.append("checkout");
        sb.append('=');
        sb.append(((this.checkout == null)?"<null>":this.checkout));
        sb.append(',');
        sb.append("reviewRecommendation");
        sb.append('=');
        sb.append(((this.reviewRecommendation == null)?"<null>":this.reviewRecommendation));
        sb.append(',');
        sb.append("cityInTrans");
        sb.append('=');
        sb.append(((this.cityInTrans == null)?"<null>":this.cityInTrans));
        sb.append(',');
        sb.append("addressTrans");
        sb.append('=');
        sb.append(((this.addressTrans == null)?"<null>":this.addressTrans));
        sb.append(',');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
        sb.append(',');
        sb.append("distances");
        sb.append('=');
        sb.append(((this.distances == null)?"<null>":this.distances));
        sb.append(',');
        sb.append("city");
        sb.append('=');
        sb.append(((this.city == null)?"<null>":this.city));
        sb.append(',');
        sb.append("address");
        sb.append('=');
        sb.append(((this.address == null)?"<null>":this.address));
        sb.append(',');
        sb.append("reviewScoreWord");
        sb.append('=');
        sb.append(((this.reviewScoreWord == null)?"<null>":this.reviewScoreWord));
        sb.append(',');
        sb.append("mainPhotoUrl");
        sb.append('=');
        sb.append(((this.mainPhotoUrl == null)?"<null>":this.mainPhotoUrl));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("badges");
        sb.append('=');
        sb.append(((this.badges == null)?"<null>":this.badges));
        sb.append(',');
        sb.append("isWholesalerCandidate");
        sb.append('=');
        sb.append(((this.isWholesalerCandidate == null)?"<null>":this.isWholesalerCandidate));
        sb.append(',');
        sb.append("wishlistCount");
        sb.append('=');
        sb.append(((this.wishlistCount == null)?"<null>":this.wishlistCount));
        sb.append(',');
        sb.append("hotelFacilities");
        sb.append('=');
        sb.append(((this.hotelFacilities == null)?"<null>":this.hotelFacilities));
        sb.append(',');
        sb.append("soldout");
        sb.append('=');
        sb.append(((this.soldout == null)?"<null>":this.soldout));
        sb.append(',');
        sb.append("hotelNameTrans");
        sb.append('=');
        sb.append(((this.hotelNameTrans == null)?"<null>":this.hotelNameTrans));
        sb.append(',');
        sb.append("classIsEstimated");
        sb.append('=');
        sb.append(((this.classIsEstimated == null)?"<null>":this.classIsEstimated));
        sb.append(',');
        sb.append("timezone");
        sb.append('=');
        sb.append(((this.timezone == null)?"<null>":this.timezone));
        sb.append(',');
        sb.append("preferred");
        sb.append('=');
        sb.append(((this.preferred == null)?"<null>":this.preferred));
        sb.append(',');
        sb.append("preferredPlus");
        sb.append('=');
        sb.append(((this.preferredPlus == null)?"<null>":this.preferredPlus));
        sb.append(',');
        sb.append("district");
        sb.append('=');
        sb.append(((this.district == null)?"<null>":this.district));
        sb.append(',');
        sb.append("geniusDiscountPercentage");
        sb.append('=');
        sb.append(((this.geniusDiscountPercentage == null)?"<null>":this.geniusDiscountPercentage));
        sb.append(',');
        sb.append("ufi");
        sb.append('=');
        sb.append(((this.ufi == null)?"<null>":this.ufi));
        sb.append(',');
        sb.append("priceBreakdown");
        sb.append('=');
        sb.append(((this.priceBreakdown == null)?"<null>":this.priceBreakdown));
        sb.append(',');
        sb.append("hotelHasVbBoost");
        sb.append('=');
        sb.append(((this.hotelHasVbBoost == null)?"<null>":this.hotelHasVbBoost));
        sb.append(',');
        sb.append("isSmartDeal");
        sb.append('=');
        sb.append(((this.isSmartDeal == null)?"<null>":this.isSmartDeal));
        sb.append(',');
        sb.append("mobileDiscountPercentage");
        sb.append('=');
        sb.append(((this.mobileDiscountPercentage == null)?"<null>":this.mobileDiscountPercentage));
        sb.append(',');
        sb.append("isMobileDeal");
        sb.append('=');
        sb.append(((this.isMobileDeal == null)?"<null>":this.isMobileDeal));
        sb.append(',');
        sb.append("districts");
        sb.append('=');
        sb.append(((this.districts == null)?"<null>":this.districts));
        sb.append(',');
        sb.append("isNoPrepaymentBlock");
        sb.append('=');
        sb.append(((this.isNoPrepaymentBlock == null)?"<null>":this.isNoPrepaymentBlock));
        sb.append(',');
        sb.append("unitConfigurationLabel");
        sb.append('=');
        sb.append(((this.unitConfigurationLabel == null)?"<null>":this.unitConfigurationLabel));
        sb.append(',');
        sb.append("longitude");
        sb.append('=');
        sb.append(((this.longitude == null)?"<null>":this.longitude));
        sb.append(',');
        sb.append("selectedReviewTopic");
        sb.append('=');
        sb.append(((this.selectedReviewTopic == null)?"<null>":this.selectedReviewTopic));
        sb.append(',');
        sb.append("countryTrans");
        sb.append('=');
        sb.append(((this.countryTrans == null)?"<null>":this.countryTrans));
        sb.append(',');
        sb.append("minTotalPrice");
        sb.append('=');
        sb.append(((this.minTotalPrice == null)?"<null>":this.minTotalPrice));
        sb.append(',');
        sb.append("_class");
        sb.append('=');
        sb.append(((this._class == null)?"<null>":this._class));
        sb.append(',');
        sb.append("blockIds");
        sb.append('=');
        sb.append(((this.blockIds == null)?"<null>":this.blockIds));
        sb.append(',');
        sb.append("extended");
        sb.append('=');
        sb.append(((this.extended == null)?"<null>":this.extended));
        sb.append(',');
        sb.append("zip");
        sb.append('=');
        sb.append(((this.zip == null)?"<null>":this.zip));
        sb.append(',');
        sb.append("defaultLanguage");
        sb.append('=');
        sb.append(((this.defaultLanguage == null)?"<null>":this.defaultLanguage));
        sb.append(',');
        sb.append("rewards");
        sb.append('=');
        sb.append(((this.rewards == null)?"<null>":this.rewards));
        sb.append(',');
        sb.append("isGeoRate");
        sb.append('=');
        sb.append(((this.isGeoRate == null)?"<null>":this.isGeoRate));
        sb.append(',');
        sb.append("cityTrans");
        sb.append('=');
        sb.append(((this.cityTrans == null)?"<null>":this.cityTrans));
        sb.append(',');
        sb.append("compositePriceBreakdown");
        sb.append('=');
        sb.append(((this.compositePriceBreakdown == null)?"<null>":this.compositePriceBreakdown));
        sb.append(',');
        sb.append("distance");
        sb.append('=');
        sb.append(((this.distance == null)?"<null>":this.distance));
        sb.append(',');
        sb.append("isFreeCancellable");
        sb.append('=');
        sb.append(((this.isFreeCancellable == null)?"<null>":this.isFreeCancellable));
        sb.append(',');
        sb.append("hotelIncludeBreakfast");
        sb.append('=');
        sb.append(((this.hotelIncludeBreakfast == null)?"<null>":this.hotelIncludeBreakfast));
        sb.append(',');
        sb.append("countrycode");
        sb.append('=');
        sb.append(((this.countrycode == null)?"<null>":this.countrycode));
        sb.append(',');
        sb.append("reviewNr");
        sb.append('=');
        sb.append(((this.reviewNr == null)?"<null>":this.reviewNr));
        sb.append(',');
        sb.append("distanceToCc");
        sb.append('=');
        sb.append(((this.distanceToCc == null)?"<null>":this.distanceToCc));
        sb.append(',');
        sb.append("defaultWishlistName");
        sb.append('=');
        sb.append(((this.defaultWishlistName == null)?"<null>":this.defaultWishlistName));
        sb.append(',');
        sb.append("accommodationType");
        sb.append('=');
        sb.append(((this.accommodationType == null)?"<null>":this.accommodationType));
        sb.append(',');
        sb.append("latitude");
        sb.append('=');
        sb.append(((this.latitude == null)?"<null>":this.latitude));
        sb.append(',');
        sb.append("priceIsFinal");
        sb.append('=');
        sb.append(((this.priceIsFinal == null)?"<null>":this.priceIsFinal));
        sb.append(',');
        sb.append("checkin");
        sb.append('=');
        sb.append(((this.checkin == null)?"<null>":this.checkin));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("hotelName");
        sb.append('=');
        sb.append(((this.hotelName == null)?"<null>":this.hotelName));
        sb.append(',');
        sb.append("reviewScore");
        sb.append('=');
        sb.append(((this.reviewScore == null)?"<null>":this.reviewScore));
        sb.append(',');
        sb.append("currencyCode");
        sb.append('=');
        sb.append(((this.currencyCode == null)?"<null>":this.currencyCode));
        sb.append(',');
        sb.append("ccRequired");
        sb.append('=');
        sb.append(((this.ccRequired == null)?"<null>":this.ccRequired));
        sb.append(',');
        sb.append("cityNameEn");
        sb.append('=');
        sb.append(((this.cityNameEn == null)?"<null>":this.cityNameEn));
        sb.append(',');
        sb.append("maxPhotoUrl");
        sb.append('=');
        sb.append(((this.maxPhotoUrl == null)?"<null>":this.maxPhotoUrl));
        sb.append(',');
        sb.append("max1440PhotoUrl");
        sb.append('=');
        sb.append(((this.max1440PhotoUrl == null)?"<null>":this.max1440PhotoUrl));
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
