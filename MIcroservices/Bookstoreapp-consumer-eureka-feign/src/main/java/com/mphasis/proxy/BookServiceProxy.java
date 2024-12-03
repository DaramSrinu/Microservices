package com.mphasis.proxy;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.cafe.entity.Admin;
import com.mphasis.domain.Book;

@FeignClient("book-service")
public interface BookServiceProxy {
	
	@GetMapping(value = "/books", produces = (MediaType.APPLICATION_JSON_VALUE))
	public List<Book> getAllBooks() ;
	
	@GetMapping(value = "/books/{id}", produces = (MediaType.APPLICATION_JSON_VALUE))
	public Book getBookById(@PathVariable("id") Integer id) ;
		
	
}
