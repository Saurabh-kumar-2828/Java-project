package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.response.WeatherResponse;
import com.example.demo.service.WeatherService;

@Controller
@RequestMapping("/home")
public class HomeController {
	
	@Autowired
	private WeatherService weatherService;

    @GetMapping
    public String home() {
        return "home"; 
    }
     
    @GetMapping("/weather/{city}")
    @ResponseBody
    public String getWeatherTemperature(@PathVariable String city) {
        WeatherResponse weatherResponse = weatherService.getWeather(city);
        if (weatherResponse != null && weatherResponse.getCurrent() != null) {
            return "Current temperature in " + city + " is " + weatherResponse.getCurrent().getTemperature() + "°C";
        } else {
            return "Weather data not available for " + city;
        }
    }

}
