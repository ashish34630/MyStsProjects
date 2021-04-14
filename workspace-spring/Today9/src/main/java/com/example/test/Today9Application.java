package com.example.test;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.test.Repository.BookRepository;
import com.example.test.Repository.PageRepository;
import com.example.test.entity.Book;
import com.example.test.entity.Page;

@SpringBootApplication
public class Today9Application {

	public static void main(String[] args) {
		SpringApplication.run(Today9Application.class, args);
	}
	
	@Bean
    public CommandLineRunner mappingDemo(BookRepository bookRepository,
                                         PageRepository pageRepository) {
        return args -> {

            // create a new book
            Book book = new Book("Java 101", "John Doe", "123456");

            // save the book
            bookRepository.save(book);

            // create and save new pages
            pageRepository.save(new Page(1, "Introduction contents", "Introduction", book));
            pageRepository.save(new Page(65, "Java 8 contents", "Java 8", book));
            pageRepository.save(new Page(95, "Concurrency contents", "Concurrency", book));
        };
    }
	
	
	

}
