package com.cg.backgroundverification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@SpringBootApplication
@EnableEurekaClient

public class BackgroundverificationApplication {
	public static void main(String[] args) {
		SpringApplication.run(BackgroundverificationApplication.class, args);
	}
}
