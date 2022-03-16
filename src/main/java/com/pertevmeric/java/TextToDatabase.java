package com.pertevmeric.java;
import org.postgresql.copy.CopyManager;
import org.postgresql.core.BaseConnection;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TextToDatabase { //Saves text file to database

    TextToDatabase(String URL, String username, String password, String tableName, String delimiter, String loadPath)
    {
        try (Connection con = DriverManager.getConnection(URL, username, password)) {

            CopyManager cm = new CopyManager((BaseConnection) con);

            cm.copyIn("COPY "+tableName+" FROM STDIN WITH DELIMITER  '"+delimiter+"'", new FileReader(loadPath));

            System.out.println("Text to DB successful! \n");

        } catch (SQLException | IOException ex) {

            System.out.println("Failed to Read");

            ex.printStackTrace();

        }
    }
}
