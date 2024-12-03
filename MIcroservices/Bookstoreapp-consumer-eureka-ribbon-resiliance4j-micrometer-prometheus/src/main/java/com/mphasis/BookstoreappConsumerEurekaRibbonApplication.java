package com.mphasis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.context.annotation.Bean;

import io.micrometer.core.aop.TimedAspect;
import io.micrometer.core.instrument.MeterRegistry;

@SpringBootApplication
public class BookstoreappConsumerEurekaRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreappConsumerEurekaRibbonApplication.class, args);
	}
	@Bean
	public TimedAspect timedAspect (MeterRegistry registry) {
		return new TimedAspect(registry);
	}

}
