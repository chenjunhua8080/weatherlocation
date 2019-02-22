package com.weatherlocation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class WeatherlocationApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherlocationApplication.class, args);
	}

}

