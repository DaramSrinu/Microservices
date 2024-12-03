package com.mphasis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mphasis.domain.Book;
import com.mphasis.repository.BookRepository;

@Service(value = "bookService")
@Scope("singleton")
@Transactional
public class BookService implements IBookService {

	@Autowired
	@Qualifier("bookRepository")
	private BookRepository bookRepository;

	@Override
	public Book addBook(Book book) {

		return bookRepository.save(book);
	}

	@Override
	public Book updateBook(Book book) {

		return bookRepository.save(book);
	}

	@Override
	public void deleteBookById(Integer id) {

		bookRepository.deleteById(id);
	}

	@Override
	public Book getBookById(Integer id) {

		return bookRepository.findById(id).get();
	}


	@Override
	public List<Book> getAllBooks() {
		
		return bookRepository.findAll();
	}

	@Override
	public Book getBookByYear(int year) {
		// TODO Auto-generated method stub
		return bookRepository.getBookByYear(year).get();
	}

	@Override
	public Book getBookByTitle(String title) {
		// TODO Auto-generated method stub
		 return bookRepository.findByTitle(title);
	}

//	@Override
//	public Book getBookPublisher(String publisher) {
//		// TODO Auto-generated method stub
//		return bookRepository.getBookPublisher(publisher).get();
//	}
	@Override
	public Book getBookByPublisher(String publisher) {
		// TODO Auto-generated method stub
		return bookRepository.getBookByPublisher(publisher).get();
	}
}
