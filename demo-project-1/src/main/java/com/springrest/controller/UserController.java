package com.springrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.appiresponse.WeatherResponse;
import com.springrest.service.WeatherService;

@Controller
public class UserController {

	@Autowired
	private WeatherService weatherService;
	
	@RequestMapping("/home")
	public String homePage() {
		return "home";
	}
	

	@GetMapping("/{city}")
	public String getWeatherTemperature(@PathVariable String city) {
		WeatherResponse weatherResponse = weatherService.getWeather(city);
		if (weatherResponse != null && weatherResponse.getCurrent() != null) {
			return "Current temperature in " + city + " is " + weatherResponse.getCurrent().getTemperature() + "°C";
		} else {
			return "Weather data not available for " + city;
		}
	}
}
