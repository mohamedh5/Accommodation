package com.iter.accommodation.config;

import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import com.iter.accommodation.dto.Provider;

import lombok.Data;

@Configuration
@ConfigurationProperties("accomodations")
@Data
public class ClientConfig {

	private Map<String,Provider> providers;
}
