package com.xworkz.fileapp.dao;

import com.xworkz.fileapp.dto.FileDto;

public interface FileDao {
    boolean saveFile(FileDto fileDto);
}
