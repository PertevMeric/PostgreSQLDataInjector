package com.pertevmeric.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ProcessBuilder {

    ProcessBuilder(String URL, String username, String password,String script) throws IOException {

        try (Connection con = DriverManager.getConnection(URL, username, password)){

            java.lang.ProcessBuilder processBuilder = new java.lang.ProcessBuilder();

            processBuilder.command("bash", "-c", script);

            Process process = processBuilder.start();

            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(process.getInputStream()));

            String line;

            while ((line = reader.readLine()) != null) {

                System.out.println(line);

            }

        } catch (SQLException ex) {

            System.out.println("Failed to Read");

        }
    }
}
