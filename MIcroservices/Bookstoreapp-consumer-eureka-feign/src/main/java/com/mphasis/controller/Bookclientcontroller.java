package com.mphasis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cafe.entity.Admin;
import com.mphasis.domain.Book;
import com.mphasis.proxy.BookServiceProxy;

@RestController
@Scope("request")
public class Bookclientcontroller {
	
	@Autowired
	private BookServiceProxy bookServiceProxy;

	@GetMapping("/get-books/{id}")
	public Book getBookById(@PathVariable("id") int id) {
		Book book=bookServiceProxy.getBookById(id);
		return book;
	}

	@GetMapping("/get-books")
	public List<Book> getAllBooks() {
		List<Book> books=bookServiceProxy.getAllBooks();
		return books;
	}
	
	
}
