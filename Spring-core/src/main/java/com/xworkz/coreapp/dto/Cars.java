package com.xworkz.coreapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@Data
@ToString
@AllArgsConstructor
public class Cars {

    private String carName;
    private int price;

}
