package com.iter.accommodation.booking.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.iter.accommodation.booking.dto.Location;
import com.iter.accommodation.dto.LocationDto;

@Mapper(componentModel = "spring")
public interface LocationMapper {

	List<LocationDto> mapLocations(List<Location> location);
}
