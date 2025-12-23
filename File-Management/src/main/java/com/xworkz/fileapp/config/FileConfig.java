package com.xworkz.fileapp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.xworkz.fileapp")
public class FileConfig {
    FileConfig(){
        System.out.println("Config file s created");
    }
}
