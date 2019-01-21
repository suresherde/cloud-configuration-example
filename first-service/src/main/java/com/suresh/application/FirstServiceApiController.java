package com.suresh.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.suresh.application.model.ServiceCloudConfiguration;

@RestController
public class FirstServiceApiController {
	
	@Autowired
	ServiceCloudConfiguration serviceCloudConfiguration;
	
	@RequestMapping("/profile")
	public ServiceCloudConfiguration getConfig(){
		
		return serviceCloudConfiguration;
	}
	

}
