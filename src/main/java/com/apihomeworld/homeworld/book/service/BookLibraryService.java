package com.apihomeworld.homeworld.book.service;


import com.apihomeworld.homeworld.book.dao.BookRepository;
import com.apihomeworld.homeworld.book.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//A business service is a singleton and keeps that in its memory.
//Service Components are the class file
//which contains @Service annotation. These class files are used to write business logic in a different layer, separated from @RestController class file. The logic for creating a service component class file is shown here −
@Service
public class BookLibraryService {

    @Autowired
    BookRepository bookRepository;

    public List<Book> getBookList() {
        return (List<Book>) bookRepository.findAll();
    }

    public List<Book> getBookById(int id) {
        return bookRepository.findById(id);
    }

    public void addBookList(Book book) {
        bookRepository.save(book);
    }

    public void updateBookList(Book book) {
        bookRepository.save(book);
    }

    public void deleteBookList(Book book) {
        bookRepository.delete(book);
    }
}
