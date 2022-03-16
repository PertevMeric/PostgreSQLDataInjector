package com.pertevmeric.java;
import java.util.Scanner;

public class UserInterface {

   public void showTextIntro() {
        System.out.print(" 1 Send text file to database " +
                "\n 2 Send database to a text file  " +
                "\n 3 Inject shell command " +
                "\n q to exit" +
                "\n");
    }
    public void welcomer(){
        System.out.println("\n--Welcome to PostgresqlCopyInjector!---\n");

    }
}

