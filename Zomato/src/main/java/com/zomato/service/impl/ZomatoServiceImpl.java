package com.zomato.service.impl;

import com.zomato.dao.ZomatoDao;
import com.zomato.dao.impl.ZomatoDaoImpl;
import com.zomato.dto.ZomatoDto;
import com.zomato.service.ZomatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ZomatoServiceImpl implements ZomatoService {
    @Autowired
    private ZomatoDaoImpl zomatoDao;

    @Override
    public boolean validSave(ZomatoDto zomatoDto) {


        System.out.println("Validation is started");
        boolean inValid=false;
        if(zomatoDto!=null){
            if(zomatoDto.getRestName()==null||zomatoDto.getRestName().length()>20){
                inValid=true;
            }
            if(zomatoDto.getAddress()==null||zomatoDto.getAddress().length()>30){
                inValid=true;
            }
            if(zomatoDto.getCity()==null||zomatoDto.getCity().length()>10){
                inValid=true;
            }
            if(zomatoDto.getOwnerName()==null||zomatoDto.getOwnerName().length()>15){
                inValid=true;
            }
            if(zomatoDto.getRestEmail()==null){
                inValid=true;
            }
            if(zomatoDto.getMenu()==null){
                inValid=true;
            }

            if(!inValid){
                System.out.println("Validation is correct");
                zomatoDao.duplicate(zomatoDto);
                    zomatoDao.saveRest(zomatoDto);
            }else {
                System.out.println("Validation error");
            }
        }


        return false;
    }
}
