package com.example.demoblue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class DemoBlueApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoBlueApplication.class, args);
	}

}
