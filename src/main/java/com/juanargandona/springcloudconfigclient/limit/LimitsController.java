package com.juanargandona.springcloudconfigclient.limit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

	@Autowired
	LimitConfiguration limitConfiguration;
	
	@GetMapping("/limits")
	public LimitBean retrieveLimitsFromConfigurations() {
		return new LimitBean(limitConfiguration.getMinimum(), limitConfiguration.getMaximum());
	}
}
