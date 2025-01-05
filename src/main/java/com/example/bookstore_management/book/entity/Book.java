package com.example.bookstore_management.book.entity;

import lombok.*;

@Setter
@Getter
@Data
public class Book {

    private Long id;
    private String title;
    private String author;
    private double price;
    private int stock;
}
