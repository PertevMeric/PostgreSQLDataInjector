package com.pertevmeric.java;

public class NameSubtract { //Subtract name of the database from a full URL connection

    protected NameSubtract(String URL) {
        int length = URL.length()-1;
        int slashLoc = 0;
        int i =length;
        while (i>1)
        {
            if (URL.charAt(i) == '/')
            {
                slashLoc = i;
                break;
            }
            i--;
        }
        String dbname = URL.substring(slashLoc+1,length+1);
        System.out.println("Connection established to "+ dbname);
    }
}


