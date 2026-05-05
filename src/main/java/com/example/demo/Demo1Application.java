package com.example.demo;

import com.example.demo.service.OrderService;
import com.example.demo.service.PayPalPaymentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.sql.*;

@SpringBootApplication
public class Demo1Application {

    public static void main(String[] args) throws Exception{

        int sid =6;
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
        System.out.println("Connection closed successfully");

    }

}
