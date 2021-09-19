package com.iter.accommodation.factory;

import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.iter.accommodation.service.AccomodationService;

@Component
public class AccomodationFactory {

	private static final String SERVICE = "Service";
	private static final String DEFAULT_BOOKING = "booking";
	private Map<String, AccomodationService> services;

	public AccomodationFactory(Map<String, AccomodationService> services) {
		super();
		this.services = services;
	}

	public AccomodationService getService(String name) {
		if (!StringUtils.hasText(name))
			name = DEFAULT_BOOKING;
		name+= SERVICE;
		return services.get(name);
	}
}
