package com.mphasis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.mphasis.domain.Book;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class BookService {
	@Autowired
	private RestTemplate restTemplate;
	@HystrixCommand(fallbackMethod = "fallbackMethodForGetBookById")
	public Book getBookById(int id) {
	String bookServiceUrl="http://book-service/books/" + id;
	return restTemplate.getForObject(bookServiceUrl, Book.class);

}
	public Book fallbackMethodForGetBookById(int id){
		return new Book(id,"Monitor","ISBN255444",343,2008,"SS");
			
	}
	}
