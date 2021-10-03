package com.iter.accommodation.booking.dto;

import lombok.Data;

@Data
public class HotelsSearchRequestParam {

	private String locale;
	private String roomNumber;
	private String checkoutDate;
	private String checkinDate;
	private String orderBy;
	private String adultsNumber;
	private String filterByCurrency;
	private String destType;
	private String destId;
	private String pageNumber;
	private String childrenNumber;
	private String childrenAges;
	private String categoriesFilterIds;
}
