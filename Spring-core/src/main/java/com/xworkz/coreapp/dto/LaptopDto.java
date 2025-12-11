package com.xworkz.coreapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@ToString
@Data
@AllArgsConstructor
public class LaptopDto {
    private String cmpName;
    private int id;
    private int price;

    @Autowired
    public LaptopDto(String cmpName){
        this.cmpName=cmpName;
        System.out.println("Parameterized constructor ######################");
    }


    public LaptopDto(){
        System.out.println("Default constructor-------------------------------");

    }
}
