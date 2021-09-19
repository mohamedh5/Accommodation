package com.iter.accommodation.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.iter.accommodation.dto.LocationDto;
import com.iter.accommodation.factory.AccomodationFactory;
import com.iter.accommodation.service.AccomodationService;

@RestController
@RequestMapping("/accomodations")
public class AccomodationController {

	private AccomodationFactory factory;

	public AccomodationController(AccomodationFactory factory) {
		super();
		this.factory = factory;
	}

	@GetMapping("/locations")
	public List<LocationDto> getLocations(@RequestParam String place,
			@RequestHeader(required = false) String provider) {
		AccomodationService service = factory.getService(provider);
		return service.getLocations(place);
	}
}
