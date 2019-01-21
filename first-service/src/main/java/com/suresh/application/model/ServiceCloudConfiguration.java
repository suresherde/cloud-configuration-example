package com.suresh.application.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class ServiceCloudConfiguration {

	@Autowired
	Environment environment;
	
	public String getDBUser(){
		return environment.getProperty("database.user.name");
	}
	
	public String getDBPass(){
		return environment.getProperty("database.user.password");
	}
	
	public String getMyConfig(){
		return environment.getProperty("first.service.myConfig");
	}
}
