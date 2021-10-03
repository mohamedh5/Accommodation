package com.iter.accommodation.mapper;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;

import com.iter.accommodation.booking.dto.HotelsSearchRequestParam;

@Component
public class HotelSearchRequestMapper {

	private HttpServletRequest request;

	public HotelSearchRequestMapper(HttpServletRequest request) {
		super();
		this.request = request;
	}

	public HotelsSearchRequestParam mapRequestParams() {
		HotelsSearchRequestParam params = new HotelsSearchRequestParam();
		params.setRoomNumber(request.getParameter("roomNumber"));
		params.setCheckoutDate(request.getParameter("checkoutDate"));
		params.setCheckinDate(request.getParameter("checkinDate"));
		params.setAdultsNumber(request.getParameter("adultsNumber"));
		params.setFilterByCurrency(request.getParameter("filterByCurrency"));
		params.setDestType(request.getParameter("destType"));
		params.setDestId(request.getParameter("destId"));
		params.setPageNumber(request.getParameter("pageNumber"));
		params.setChildrenNumber(request.getParameter("childrenNumber"));
		params.setChildrenAges(request.getParameter("childrenAges"));
		params.setCategoriesFilterIds(request.getParameter("categoriesFilterIds"));
		params.setOrderBy(request.getParameter("orderBy"));
		return params;
	}
}
