package com.iter.accommodation.booking.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.iter.accommodation.booking.client.BookingHttpClient;
import com.iter.accommodation.booking.dto.HotelsSearch;
import com.iter.accommodation.booking.dto.HotelsSearchRequestParam;
import com.iter.accommodation.booking.dto.Location;
import com.iter.accommodation.booking.mapper.BookingMapper;
import com.iter.accommodation.dto.HotelsSearchDto;
import com.iter.accommodation.dto.LocationDto;
import com.iter.accommodation.mapper.HotelSearchRequestMapper;
import com.iter.accommodation.service.AccomodationService;

@Service
public class BookingService implements AccomodationService {

	private BookingHttpClient bookingClient;
	private BookingMapper mapper;
	private HotelSearchRequestMapper requestMapper;

	public BookingService(BookingHttpClient bookingClient, BookingMapper mapper,
			HotelSearchRequestMapper requestMapper) {
		super();
		this.bookingClient = bookingClient;
		this.mapper = mapper;
		this.requestMapper = requestMapper;
	}

	@Override
	public List<LocationDto> getLocations(String place) {
		List<Location> locations = bookingClient.getLocations(place);
		return mapper.mapLocations(locations);
	}
	
	@Override
	public HotelsSearchDto getHotels() {
		HotelsSearchRequestParam params = requestMapper.mapRequestParams();
		HotelsSearch searchResults = bookingClient.getHotelSearchResults(params);
		return mapper.mapHotelSearchResult(searchResults);
	}

}
