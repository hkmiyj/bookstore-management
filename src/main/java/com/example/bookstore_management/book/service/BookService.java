package com.example.bookstore_management.book.service;

import com.example.bookstore_management.book.entity.Book;
import com.example.bookstore_management.book.repository.BookRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }


    public Book getBooksById(long id){
        return bookRepository.findById(id).orElseThrow(() -> new RuntimeException("Book not found with id: " + id));
    }


    public Book addBook(@RequestBody Book book){
        return bookRepository.save(book);
    }

    public Book updateBook(Book NewBook, long id){
        Book existingBook = bookRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Book not found with id: " + id));

        existingBook.setTitle(NewBook.getTitle());
        existingBook.setAuthor(NewBook.getAuthor());
        existingBook.setPrice(NewBook.getPrice());
        existingBook.setStock(NewBook.getStock());

        return bookRepository.save(existingBook);
    }

    public String deleteBooks(long id){
        Book existingBook = bookRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Book not found with id: " + id));
        bookRepository.deleteById(id);
        return "Book Successfully" + existingBook.getTitle() +"Deleted";
    }
}
