package com.demo.travelrailway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TravelRailwayApplication {

	public static void main(String[] args) {
		SpringApplication.run(TravelRailwayApplication.class, args);
	}

}
