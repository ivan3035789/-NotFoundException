package ru.netology.domain;

import lombok.Data;

@Data
public class Book extends Product {
    private String author;

    public Book(String author) {
        this.author = author;
    }

    public Book(int id, String title, int price, String author) {
        super(id, title, price);
        this.author = author;
    }
}
