package com.kalyan.flynow.controllers;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FlightController {

	@PostMapping("/viewflights")
	public String viewFlights(@RequestParam("from") String from,@RequestParam("to") String to,
			@RequestParam("departureDate")@DateTimeFormat(pattern = "MM-dd-yyy") Date departureDate,ModelMap modelMap)
	{
		
		return "viewflights";
	}
}
