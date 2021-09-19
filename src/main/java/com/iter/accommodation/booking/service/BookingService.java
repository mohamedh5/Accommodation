package com.iter.accommodation.booking.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.iter.accommodation.booking.client.BookingHttpClient;
import com.iter.accommodation.booking.dto.Location;
import com.iter.accommodation.booking.mapper.LocationMapper;
import com.iter.accommodation.dto.LocationDto;
import com.iter.accommodation.service.AccomodationService;

@Service
public class BookingService implements AccomodationService {

	private BookingHttpClient bookingClient;
	private LocationMapper mapper;

	public BookingService(BookingHttpClient bookingClient, LocationMapper mapper) {
		this.bookingClient = bookingClient;
		this.mapper = mapper;
	}

	@Override
	public List<LocationDto> getLocations(String place) {
		List<Location> locations = bookingClient.getLocations(place);
		return mapper.mapLocations(locations);
	}

}
