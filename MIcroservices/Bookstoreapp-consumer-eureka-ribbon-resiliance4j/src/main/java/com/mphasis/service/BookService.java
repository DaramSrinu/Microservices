package com.mphasis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.mphasis.domain.Book;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;


@Service
public class BookService {
	@Autowired
	private RestTemplate restTemplate;
	
	@Retry(name="book-service")
	@CircuitBreaker(name="book-service", fallbackMethod = "fallbackMethodForGetBookById")
	public Book getBookById(int id) {
	String bookServiceUrl="http://book-service/books/" + id;
	return restTemplate.getForObject(bookServiceUrl, Book.class);

}
	public Book fallbackMethodForGetBookById(int id ,Throwable cause){
		System.out.println("Exception Raised with the message:===> "+cause.getMessage());
		return new Book(id,"Monitor","ISBN255444",343,2008,"SS");
			
	}
	}
