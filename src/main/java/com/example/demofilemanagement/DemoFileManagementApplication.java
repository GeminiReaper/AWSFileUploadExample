package com.example.demofilemanagement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoFileManagementApplication {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(DemoFileManagementApplication.class);

	public static void main(String[] args) {
		
		SpringApplication.run(DemoFileManagementApplication.class, args);
		LOGGER.info("DemoFileManagementApplication started successfully.");
	}

}
