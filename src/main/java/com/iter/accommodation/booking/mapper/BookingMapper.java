package com.iter.accommodation.booking.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.iter.accommodation.booking.dto.HotelsSearch;
import com.iter.accommodation.booking.dto.Location;
import com.iter.accommodation.booking.dto.Result;
import com.iter.accommodation.dto.Hotel;
import com.iter.accommodation.dto.HotelsSearchDto;
import com.iter.accommodation.dto.LocationDto;

@Mapper(componentModel = "spring")
public interface BookingMapper {

	List<LocationDto> mapLocations(List<Location> location);

	@Mapping(source = "result", target = "hotels")
	HotelsSearchDto mapHotelSearchResult(HotelsSearch result);

	@Mapping(source = "priceBreakdown.allInclusivePrice", target = "allInclusivePrice")
	Hotel mapResult(Result result);
}
