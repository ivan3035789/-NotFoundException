package ru.netology.domain;

import lombok.Data;

@Data
public class TShirt extends Product {
    private String color;
    private String size;

    public TShirt(int id, String name, int price, String color, String size) {
        super(id, name, price);
        this.color = color;
        this.size = size;
    }

    public TShirt(String color, String size) {
        this.color = color;
        this.size = size;
    }
}
