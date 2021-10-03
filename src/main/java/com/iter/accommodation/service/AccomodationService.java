package com.iter.accommodation.service;

import java.util.List;

import com.iter.accommodation.dto.HotelsSearchDto;
import com.iter.accommodation.dto.LocationDto;

public interface AccomodationService {

	List<LocationDto> getLocations(String place);

	HotelsSearchDto getHotels();
}
