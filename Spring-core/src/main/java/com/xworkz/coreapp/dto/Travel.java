package com.xworkz.coreapp.dto;

import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@ToString
@Data
public class Travel {

    private String agencyName;
    private String location;
}
