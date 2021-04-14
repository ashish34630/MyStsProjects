package com.example.test.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.test.entity.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

    Book findByIsbn(String isbn);
}