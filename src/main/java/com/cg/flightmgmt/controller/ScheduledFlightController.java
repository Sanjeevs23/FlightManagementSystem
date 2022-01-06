package com.cg.flightmgmt.controller;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.flightmgmt.dao.ScheduledFlightDao;

@RestController
@RequestMapping("/scheduled")
public class ScheduledFlightController {
Logger logger=org.slf4j.LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private ScheduledFlightDao dao;
	
	
}
