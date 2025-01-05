package com.example.bookstore_management.book.repository;

import com.example.bookstore_management.book.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
}
