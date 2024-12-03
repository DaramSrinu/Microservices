package com.mphasis.domain;






import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data

@NoArgsConstructor
@AllArgsConstructor

public class Book {

	
	private Integer id;

	
	private String title;

	
	private String isbn;

	private int pages;
	
	
	private int year;
	
	
	private String publisher;
	
	public Book() {
		
	}
	public Book(Integer id, String title, String isbn, int pages, int year,String publisher) {
		super();
		this.id = id;
		this.title = title;
		this.isbn = isbn;
		this.pages = pages;
		this.year = year;
		this.publisher=publisher;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", isbn=" + isbn + ", pages=" + pages + ", year=" + year
				+ ", publisher=" + publisher + "]";
	}
	
	

}