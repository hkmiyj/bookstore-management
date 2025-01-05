package com.example.bookstore_management.book.controller;

import com.example.bookstore_management.book.entity.Book;
import com.example.bookstore_management.book.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

    @GetMapping("/{id}")
    public List<Book> getBooksById(@PathVariable("id") String id){
        return bookService.getAllBooks();
    }

    @PostMapping
    public List<Book> addBook(@RequestBody Book book){
        return bookService.getAllBooks();
    }
    @PutMapping
    public List<Book> updateBook(@RequestBody Book book){
        return bookService.getAllBooks();
    }
    @DeleteMapping("/{id}")
    public List<Book> deleteBooks(@PathVariable("id") String id){
        return bookService.getAllBooks();
    }
}
