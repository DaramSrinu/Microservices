package com.mphasis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.mphasis.domain.Book;
import com.mphasis.service.BookService;

import io.micrometer.core.annotation.Timed;

@RestController
@Scope("request")
public class BookConsumertRestController {
	@Autowired
	private BookService bookService;
	@Timed(value="getBookById.time", description="Time taken to return book")
	@GetMapping("/get-books/{id}")
	public Book getBookById(@PathVariable int id) {
		return bookService.getBookById(id);
		
//		String bookServiceUrl="http://book-service/books/" + id;
//		return restTemplate.getForObject(bookServiceUrl, String.class);

		
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