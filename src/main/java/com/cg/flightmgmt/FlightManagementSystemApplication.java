package com.cg.flightmgmt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FlightManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightManagementSystemApplication.class, args);
		System.out.println("Application running on localhst:5100");
	}

}
