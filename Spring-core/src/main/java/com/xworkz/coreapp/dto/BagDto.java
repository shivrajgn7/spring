package com.xworkz.coreapp.dto;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@ToString
@Component
public class BagDto {

    private String brand;
    private String color;
    private float price;

    public BagDto(
            @Value("Puma") String brand,
            @Value("Black") String color,
            @Value("499.99") float price) {

        this.brand = brand;
        this.color = color;
        this.price = price;
    }
}
