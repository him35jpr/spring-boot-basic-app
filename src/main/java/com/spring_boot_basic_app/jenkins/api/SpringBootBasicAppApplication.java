package com.spring_boot_basic_app.jenkins.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootBasicAppApplication {
	
	public static Logger logger = LoggerFactory.getLogger(SpringBootBasicAppApplication.class);
	
	public void init() {
		logger.info("Application Started!");
		 
	}

	public static void main(String[] args) {
		logger.info("Application Executed!");
		SpringApplication.run(SpringBootBasicAppApplication.class, args);
	}

}
