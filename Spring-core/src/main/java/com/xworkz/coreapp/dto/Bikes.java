package com.xworkz.coreapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@ToString
@Data
@AllArgsConstructor
public class Bikes {

    private  String bikeName;
    private int mileage;
}
