package com.iter.accommodation.booking.mapper;

import org.springframework.util.StringUtils;
import org.springframework.web.util.UriComponentsBuilder;

import com.iter.accommodation.booking.dto.HotelsSearchRequestParam;

public class HotelsSearchRequestMapper {

	private static final String LOCALE = "en-gb";
	private static final String METRIC = "metric";

	private HotelsSearchRequestMapper() {
		super();
	}

	public static String buildURI(String baseURI, HotelsSearchRequestParam params) {
		UriComponentsBuilder url = UriComponentsBuilder.fromHttpUrl(baseURI).queryParam("locale", LOCALE)
				.queryParam("room_number", params.getRoomNumber())
				.queryParam("checkout_date", params.getCheckoutDate())
				.queryParam("checkin_date", params.getCheckinDate()).queryParam("order_by", params.getOrderBy())
				.queryParam("adults_number", params.getAdultsNumber())
				.queryParam("filter_by_currency", params.getFilterByCurrency())
				.queryParam("dest_type", params.getDestType()).queryParam("dest_id", params.getDestId())
				.queryParam("units", METRIC);

		if (StringUtils.hasLength(params.getPageNumber()))
			url.queryParam("page_number", params.getPageNumber());
		if (StringUtils.hasLength(params.getChildrenNumber()))
			url.queryParam("children_number", params.getChildrenNumber());
		if (StringUtils.hasLength(params.getChildrenAges()))
			url.queryParam("children_ages", params.getChildrenAges());
		if (StringUtils.hasLength(params.getCategoriesFilterIds()))
			url.queryParam("categories_filter_ids", params.getCategoriesFilterIds());

		return url.toUriString();
	}
}
