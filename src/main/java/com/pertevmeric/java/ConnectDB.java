package com.pertevmeric.java;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB extends NameSubtract { //Connects to Database and calls superclass to print database name

    ConnectDB(String URL, String username, String password )
    {
        super(URL);

        try (Connection connection = DriverManager.getConnection(URL,username,password)) {

        }
        catch (SQLException e){

            System.out.println("\nConnection Failed to DB Server!");

        }
    }
}
