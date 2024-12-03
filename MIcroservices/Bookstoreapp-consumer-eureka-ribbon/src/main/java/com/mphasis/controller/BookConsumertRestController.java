package com.mphasis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.mphasis.domain.Book;

@RestController
@Scope("request")
public class BookConsumertRestController {
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/get-books/{id}")
	public Book getBookById(@PathVariable int id) {
		
		String bookServiceUrl="http://book-service/books/" + id;
		return restTemplate.getForObject(bookServiceUrl, Book.class);
//		Product product = restTemplate.getForObject(
//				"https://products/" + id, 
//				Product.class);
//		return product;
		
		
//		@GetMapping("/get-books/{bookId}")
//		public String getBook(@PathVariable String bookId) {
//			String bookServiceUrl = "http://book-service/books/" + bookId;
//			return restTemplate.getForObject(bookServiceUrl, String.class);
	}
	

}