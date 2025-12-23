package com.xworkz.fileapp.service;

import com.xworkz.fileapp.dao.FileDao;
import com.xworkz.fileapp.dto.FileDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class FileSeriveImpl implements FileService{
@Autowired
   private FileDao fileDao;

    @Override
    public boolean  validAndSave(FileDto fileDto) {
        System.out.println("Validation is started");
        boolean inValid=false;
        if(fileDto!=null){
            if(fileDto.getFileName()==null||fileDto.getFileName().length()>=12){
                inValid=true;

            }
            if(fileDto.getFileType()==null){
                inValid=true;
            }
            if(fileDto.getFileSize()==null){
                inValid=true;
            }
            if(fileDto.getFileNumber()==null|| fileDto.getFileNumber().length()>4){
                inValid=true;
            }
        }
        if(!inValid){
            System.out.println("Valid and save done dao is startd");
            fileDao.saveFile(fileDto);
        }else{
            System.out.println("Validation is not working");
        }


        return inValid;
    }

    @Override
    public Optional<FileDto> getName(String fileName) {
        if(fileName.trim().isEmpty()){
            return Optional.empty();
        }else{
    return fileDao.getByName(fileName);

        }

    }



    @Override
    public boolean  updateAndSave(FileDto fileDto) {
        System.out.println("Validation is started");
        boolean inValid=false;
        if(fileDto!=null){
            if(fileDto.getFileName()==null||fileDto.getFileName().length()>=12){
                inValid=true;

            }
            if(fileDto.getFileType()==null){
                inValid=true;
            }
            if(fileDto.getFileSize()==null){
                inValid=true;
            }
            if(fileDto.getFileNumber()==null|| fileDto.getFileNumber().length()>4){
                inValid=true;
            }
        }
        if(!inValid){
            System.out.println("Valid and save done dao is startd");
            fileDao.updateByName(fileDto);
        }else{
            System.out.println("Validation is not working");
        }

        return inValid;
    }

}


