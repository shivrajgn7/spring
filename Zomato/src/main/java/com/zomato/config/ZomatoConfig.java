package com.zomato.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.zomato")
public class ZomatoConfig {
    ZomatoConfig(){
        System.out.println("Config file is crated");
    }
}
