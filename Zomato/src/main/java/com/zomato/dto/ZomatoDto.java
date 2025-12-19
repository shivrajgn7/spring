package com.zomato.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ZomatoDto {
    private String restName;
    private String address;
    private String city;
    private String ownerName;
    private String  restEmail;
    private String contact;
    private int stars;
    private String menu;

}
