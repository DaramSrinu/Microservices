package com.mphasis.service;

import java.util.List;

import com.mphasis.domain.Book;

public interface IBookService {

	Book addBook(Book product);
	
	Book updateBook(Book product);
	
	void deleteBookById(Integer id);
	
	Book getBookById(Integer id);
	
	List<Book> getAllBooks();

	Book getBookByYear(int year);

	Book getBookByTitle(String title);

	//Book getBookPublisher(String publisher);
	Book getBookByPublisher(String publisher);
}
