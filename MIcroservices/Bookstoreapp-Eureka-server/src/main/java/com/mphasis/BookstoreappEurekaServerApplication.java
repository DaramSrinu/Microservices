package com.mphasis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class BookstoreappEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreappEurekaServerApplication.class, args);
	}

}
