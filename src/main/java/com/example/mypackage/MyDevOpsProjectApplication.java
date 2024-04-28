package com.example.mypackage;

import org.springframework.boot.SpringApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyDevOpsProjectApplication {

	private static final Logger log = LoggerFactory.getLogger(MyDevOpsProjectApplication.class);

	public static void main(String[] args) {
		log.info("Main method has been invoked"); 
		SpringApplication.run(MyDevOpsProjectApplication.class, args);
		System.out.println("Application is running");
	}

}
