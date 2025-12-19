package com.zomato.dao.impl;

import com.zomato.dao.ZomatoDao;
import com.zomato.dto.ZomatoDto;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@Component
public class ZomatoDaoImpl implements ZomatoDao {
    static{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
    String url="jdbc:mysql://localhost:3306/file_app";
    String user="root";
    String password="@0995DuKe";
    @Override
    @SneakyThrows
    public boolean saveRest(ZomatoDto zomatoDto) {
        System.out.println("Dao is started");

        String insertQuery="insert into zomato (restName ,restAddr ,restcity ,restOwner ,restEmail ,contact ,stars ,menu ) values (?,?,?,?,?,?,?,?);";
        try (Connection connection= DriverManager.getConnection(url,user,password);
             PreparedStatement preparedStatement=connection.prepareStatement(insertQuery)){
            System.out.println("Connection started");
            preparedStatement.setString(1,zomatoDto.getRestName());
            preparedStatement.setString(2,zomatoDto.getAddress());
            preparedStatement.setString(3,zomatoDto.getCity());
            preparedStatement.setString(4,zomatoDto.getOwnerName());
            preparedStatement.setString(5,zomatoDto.getRestEmail());
            preparedStatement.setString(6,zomatoDto.getContact());
            preparedStatement.setInt(7,zomatoDto.getStars());
            preparedStatement.setString(8,zomatoDto.getMenu());

            int rows=preparedStatement.executeUpdate();
            System.out.println("Row is inserted: "+rows);

            System.out.println("Dao is endded");
        }

        return false;
    }
@SneakyThrows
@Override
    public boolean duplicate(ZomatoDto zomatoDto){
    System.out.println("Duplication is started");
        String dupQuery="select count * from zomato where contact=?";
        try(Connection connection=DriverManager.getConnection(url,user,password);
        PreparedStatement preparedStatement=connection.prepareStatement(dupQuery)) {
            preparedStatement.setString(1,zomatoDto.getContact());

                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    if (resultSet.next()) {
                        // If email exists, resultSet.next() returns true
                        return resultSet.getInt(1) > 0;
                    }
            }
            System.out.println("Duplication is endded");
        }
        return false;

    }
}
