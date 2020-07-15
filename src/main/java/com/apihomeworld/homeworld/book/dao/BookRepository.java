package com.apihomeworld.homeworld.book.dao;

import com.apihomeworld.homeworld.book.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

    List<Book> findById(int id);

}
