package com.xworkz.coreapp.dto;

import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@Data@ToString
public class Person {

    private String personName;
    private long mobileNo;
}
