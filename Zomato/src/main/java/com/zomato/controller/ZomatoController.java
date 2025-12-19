package com.zomato.controller;

import com.zomato.dto.ZomatoDto;
import com.zomato.service.ZomatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class ZomatoController {

    @Autowired
    ZomatoService zomatoService;

    ZomatoController(){
        System.out.println("Controller is started");
    }
    @RequestMapping("hotel")
      public String addRestaurant(ZomatoDto zomatoDto){
        System.out.println(zomatoDto);
        boolean inValid=zomatoService.validSave(zomatoDto);
        if(!inValid){
            return "Result.jsp";
        }else {
            return "Error.jsp";
        }

      }
}
