package com.iter.accommodation.booking.client;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.iter.accommodation.booking.dto.HotelsSearch;
import com.iter.accommodation.booking.dto.HotelsSearchRequestParam;
import com.iter.accommodation.booking.dto.Location;
import com.iter.accommodation.booking.mapper.HotelsSearchRequestMapper;
import com.iter.accommodation.config.ClientConfig;
import com.iter.accommodation.dto.Provider;

@Component
public class BookingHttpClient {

	private RestTemplate template;
	private Provider booking;
	private static final String LOCALE = "en-gb";

	public BookingHttpClient(RestTemplate template, ClientConfig config) {
		super();
		this.template = template;
		this.booking = config.getProviders().get("booking");
	}

	public List<Location> getLocations(String city) {
		String locationUrl = booking.getUrls().get("location");
		String uri = UriComponentsBuilder.fromHttpUrl(locationUrl).queryParam("name", city).queryParam("locale", LOCALE)
				.toUriString();

		HttpHeaders headers = getMandatoryHeaders();
		HttpEntity<?> entity = new HttpEntity<>(headers);

		ResponseEntity<List<Location>> responseEntity = template.exchange(uri, HttpMethod.GET, entity,
				new ParameterizedTypeReference<List<Location>>() {
				});
		return responseEntity.getBody();
	}

	public HotelsSearch getHotelSearchResults(HotelsSearchRequestParam params) {
		String searchURL = booking.getUrls().get("search");
		String uri = HotelsSearchRequestMapper.buildURI(searchURL, params);

		HttpHeaders headers = getMandatoryHeaders();
		HttpEntity<?> entity = new HttpEntity<>(headers);

		ResponseEntity<HotelsSearch> responseEntity = template.exchange(uri, HttpMethod.GET, entity,
				HotelsSearch.class);
		return responseEntity.getBody();
	}

	private HttpHeaders getMandatoryHeaders() {
		HttpHeaders headers = new HttpHeaders();
		headers.set("X-Rapidapi-Host", booking.getXRapidapiHost());
		headers.set("X-Rapidapi-Key", booking.getXRapidapiKey());
		return headers;
	}
}
