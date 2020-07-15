package com.apihomeworld.homeworld.book.controller;

import com.apihomeworld.homeworld.book.model.Book;
import com.apihomeworld.homeworld.book.service.BookLibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class BookLibraryController {
    //service injection
    @Autowired
    private BookLibraryService bookLibraryService;

    //GET FOR CONSUMING
    @GetMapping("/booklibrary")
    public List<Book> getBooks() {
        return bookLibraryService.getBookList();
    }

    @RequestMapping("/booklibrary/{id}")
    public List<Book> getBookByName(@PathVariable("id") int id) {
        return bookLibraryService.getBookById(id);
    }

    //POST METHOD FOR ADDING
    //    @RequestMapping(method = RequestMethod.POST, value = "/booklibrary")
    @PostMapping(value = "/booklibrary")
    public void addBook(@RequestBody Book book) {
        bookLibraryService.addBookList(book);
    }

    // PUT TO UPDATE
    //    @RequestMapping(method = RequestMethod.PUT, value = "/booklibrary")
    @PutMapping(value = "/booklibrary")
    public void updateBook(@RequestBody Book book) {
        bookLibraryService.updateBookList(book);
    }

    //DELETE FOR DELETE
    //    @RequestMapping(method = RequestMsethod.DELETE, value = "/booklibrary/{id}")
    @DeleteMapping(value = "/booklibrary/{id}")
    public void deleteBook(@RequestBody Book book) {
        bookLibraryService.deleteBookList(book);
    }

}
