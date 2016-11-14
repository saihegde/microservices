package com.pavitlabs.workshop.teams.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ThoughtOfTheDayController {

	@Value("${thought-of-the-day}") String thoughtOfTheDay;

	@RequestMapping("/thought-of-the-day")
	public String getThoughtOfTheDay() {
		return thoughtOfTheDay;
	}
	
}
