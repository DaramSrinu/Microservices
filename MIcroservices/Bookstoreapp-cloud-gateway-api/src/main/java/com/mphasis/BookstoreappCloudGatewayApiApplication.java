package com.mphasis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class BookstoreappCloudGatewayApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreappCloudGatewayApiApplication.class, args);
	}

}
