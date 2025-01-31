package com.mphasis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;

@EnableFeignClients

@SpringBootApplication
public class BookstoreappConsumerEurekaFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreappConsumerEurekaFeignApplication.class, args);
	}
	@Bean
	public Sampler getSampler() {
		
		//return Sampler.create(0.5f);
		return Sampler.ALWAYS_SAMPLE;
	}
}
