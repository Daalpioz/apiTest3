package com.cursoapidev.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cursoapidev.domain.Author;
import com.cursoapidev.domain.Weather;

@RestController
public class HomeController {
	
	@RequestMapping("/")
	public Weather home() {
		RestTemplate restTemplate = new RestTemplate();
		Weather weather = restTemplate.getForObject("https://apitest3pic.herokuapp.com/data/weather.json", Weather.class);
		return weather;
	}
	
	@RequestMapping("/author")
	public Author author() {
		RestTemplate restTemplate = new RestTemplate();
		Author autor = restTemplate.getForObject("https://apitest3pic.herokuapp.com/data/author.json", Author.class);
		return autor;
	}
	
}
