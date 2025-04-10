package com.springrest.service;

import org.hibernate.annotations.DialectOverride.Where;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.springrest.appiresponse.WeatherResponse;

@Component
public class WeatherService {
	
	private static final String apiKey = "839e6baeeb1851b2cae6fa58eaba3b67";
	
	private static final String API = "http://api.weatherstack.com/current?access_key=API_KEY&query=CITY";
	
	@Autowired
	private RestTemplate restTemplate;
	
	public WeatherResponse getWeather(String city) {
		String finalApi = API.replace("CITY", city).replace("API_KEY", apiKey);
		ResponseEntity<WeatherResponse> response = restTemplate.exchange(finalApi, HttpMethod.GET, null, WeatherResponse.class);
		WeatherResponse body = response.getBody();
		return body;
	}

}
