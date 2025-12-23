package com.xworkz.fileapp.service;

import com.xworkz.fileapp.dto.FileDto;

import java.util.Optional;

public interface FileService {
    boolean validAndSave(FileDto fileDto);

     Optional<FileDto> getName(String fileName);

     boolean  updateAndSave(FileDto fileDto);


}
