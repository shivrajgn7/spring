package com.xworkz.coreapp.dto;

import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@ToString
@Data
public class City {

    private String name;
    private boolean hasMetro;
}
