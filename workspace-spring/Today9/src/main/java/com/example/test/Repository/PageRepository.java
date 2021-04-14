package com.example.test.Repository;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.example.test.entity.Book;
import com.example.test.entity.Page;
import org.springframework.data.domain.Sort;


public interface PageRepository extends CrudRepository<Page, Long> {

    List<Page> findByBook(Book book, Sort sort);
}