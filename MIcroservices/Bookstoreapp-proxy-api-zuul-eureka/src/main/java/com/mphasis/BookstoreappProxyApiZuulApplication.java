package com.mphasis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.mphasis.filters.ErrorFilter;
import com.mphasis.filters.PostFilter;
import com.mphasis.filters.PreFilter;
import com.mphasis.filters.RouteFilter;
@EnableZuulProxy
@SpringBootApplication
public class BookstoreappProxyApiZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreappProxyApiZuulApplication.class, args);
	}
	@Bean
	public PreFilter getPreFilter() {
		return new PreFilter();
		
	}
	@Bean
	public PostFilter getPostFilter() {
		return new PostFilter();
		
	}
	@Bean
	public RouteFilter getRouteFilter() {
		return new RouteFilter();
		
	}
	@Bean
	public ErrorFilter getErrorFilter() {
		return new ErrorFilter();
		
	}

}
