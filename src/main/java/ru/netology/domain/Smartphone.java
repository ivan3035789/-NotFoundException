package ru.netology.domain;

import lombok.Data;

@Data
public class Smartphone extends Product {
    String manufacturer;

    public Smartphone(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Smartphone(int id, String title, int price, String manufacturer) {
        super(id, title, price);
        this.manufacturer = manufacturer;
    }
}
