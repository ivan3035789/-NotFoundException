package ru.netology.domain;

import lombok.Data;

@Data
public class Product {
    private int id;
    private String title;
    private int price;

    public Product() {
    }

    public Product(int id, String title, int price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }
}
