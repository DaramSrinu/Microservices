package com.mphasis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;

@SpringBootApplication
public class BookstoreappConsumerEurekaRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreappConsumerEurekaRibbonApplication.class, args);
	}
	@Bean
	public Sampler getSampler() {
		
		//return Sampler.create(0.5f);
		return Sampler.ALWAYS_SAMPLE;
	}
}
