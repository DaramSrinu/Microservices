package com.mphasis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import com.mphasis.domain.Book;
import com.mphasis.repository.BookRepository;

import brave.sampler.Sampler;

@EnableEurekaClient
@SpringBootApplication
public class BookstoreappApplication implements CommandLineRunner{
	
	@Autowired
	@Qualifier("bookRepository")
	private BookRepository bookRepository;
	public static void main(String[] args) {
		SpringApplication.run(BookstoreappApplication.class, args);
	}
	@Bean
	public Sampler getSampler() {
		
		return Sampler.ALWAYS_SAMPLE;
	}

	
	
	@Override
	public void run(String... args) throws Exception {
	
		bookRepository.save(new Book(1,"A Tale of Two Cities","255887-9765-8656",256,1990,"j.Austen"));
		bookRepository.save(new Book(2,"The Moon Stone", "34534",2569,19869,"c.Dickens"));
    	bookRepository.save(new Book(3,"Uncle Bernac", "44534-865-988",200,1897,"A.C.Doyle"));
		bookRepository.save(new Book(4,"A Changed Man", "335-87789-9834",150,1913,"T.Hardly"));
		bookRepository.save(new Book(5,"My man Teju", "789-988-63534",143,2021,"K.Kaveri"));

		System.out.println(bookRepository.findAll());
	}

}
