package com.demo.travelrailway.controller;

import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.travelrailway.model.Travel;
import com.demo.travelrailway.model.Travellers;

@RestController
@RequestMapping("/train")
public class Train {

	@GetMapping("/{from}")
	public Travellers getAvailableTrain(@PathVariable String from) {
		Travellers travellers = new Travellers();
		travellers.setTravel(Arrays.asList(new Travel("TRAIN", "WED", "NGP"), new Travel("TRAIN", "THU", "NDLS")));
		return travellers;
	}

}
