package com.xworkz.fileapp.controller;

import com.xworkz.fileapp.dto.FileDto;
import com.xworkz.fileapp.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class FileController {
    FileController(){
        System.out.println("File Controller object is created");
    }

        @Autowired
    FileService fileService;

    @PostMapping("/file")
    public String addFile(FileDto fileDto){
        System.out.println("Added file is started");
        System.out.println(fileDto);

        boolean valid=fileService.validAndSave(fileDto);
        if(!valid)return "Result.jsp";
            else
        return "Error.jsp";
    }
}
