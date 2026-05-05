package com.example.demo.service;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

@Service
public class ClientService  {

    public void insertClient() throws Exception {
        int sid = 6;
        String sname = "Nito";
        int smark = 25;

        String url = "jdbc:postgresql://127.0.0.1:5432/test";
        String username = "postgres";
        String password = "0000";
        String query = "insert into client values (?,?,?)";

        Class.forName("org.postgresql.Driver");

        Connection connection = DriverManager.getConnection(url, username, password);

        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, sid);
        statement.setString(2, sname);
        statement.setInt(3, smark);
        statement.execute();

        connection.close();
    }
}