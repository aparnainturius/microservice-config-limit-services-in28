package com.example.microservices.limits_services.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.microservices.limits_services.LimitsServicesApplication;
import com.example.microservices.limits_services.bean.Limits;
import com.example.microservices.limits_services.configuration.Configuration;

@RestController
public class LimitController {
	
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public Limits getLimits() {
		return new Limits(configuration.getMinimum(),configuration.getMaximum());
	}

}
