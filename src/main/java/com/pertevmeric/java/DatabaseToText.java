package com.pertevmeric.java;
import org.postgresql.copy.CopyManager;
import org.postgresql.core.BaseConnection;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseToText { //Saves database to text file

   DatabaseToText(String URL, String username, String password, String tableName, String delimiter, String savePath )
    {
        try (Connection con = DriverManager.getConnection(URL, username, password)) {

            CopyManager cm = new CopyManager((BaseConnection) con);

            String fileName = savePath;

            FileOutputStream fos = new FileOutputStream(fileName);

            cm.copyOut("COPY "+tableName+" TO STDOUT WITH DELIMITER  '"+delimiter+"'", fos);

            System.out.println("DB to Text successful! \n");

        } catch (SQLException | IOException ex) {

        System.out.println("Failed to write");

        }
    }
}
