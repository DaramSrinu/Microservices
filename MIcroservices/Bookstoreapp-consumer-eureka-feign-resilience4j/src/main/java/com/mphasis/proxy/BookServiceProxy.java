package com.mphasis.proxy;

import java.util.ArrayList;
import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.mphasis.domain.Book;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
//import com.mphasis.fallback.BookServiceFallback;
@FeignClient(name="book-service")
//		fallback=BookServiceFallback.class)
public interface BookServiceProxy {
	@Retry(name="book-service")
	@CircuitBreaker(name="book-service", fallbackMethod="fallbackMethodGetAllBooks")
	@GetMapping(value = "/books", produces = (MediaType.APPLICATION_JSON_VALUE))
	public List<Book> getAllBooks() ;
	@Retry(name="book-service")
	@CircuitBreaker(name="book-service", fallbackMethod="fallbackMethodGetBookById")
	@GetMapping(value = "/books/{id}", produces = (MediaType.APPLICATION_JSON_VALUE))
	public Book getBookById(@PathVariable("id") Integer id) ;
		
	
	public default List<Book> fallbackMethodGetAllBooks(Throwable cause) {
		System.out.println("Exception raised with message:===> " + cause.getMessage());
		return new ArrayList<Book>();
	}


	public default  Book  fallbackMethodGetBookById(Integer id, Throwable cause) {
		System.out.println("Exception raised with message:===> " + cause.getMessage());
		return new Book(id,"Monitor","ISBN2599668",214,235,"SS");
		
	}

	
}
