package com.iter.accommodation.service;

import java.util.List;

import com.iter.accommodation.dto.LocationDto;

public interface AccomodationService {

	public List<LocationDto> getLocations(String place);
}
