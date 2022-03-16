package com.pertevmeric.java;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.IOException;
import java.util.Scanner;

public class Business {

    Business() throws IOException {
        UserInterface ui = new UserInterface();
        boolean program = true;
        Logger logger = LoggerFactory.getLogger(UserInterface.class); //Custom Logs are passed when any other classes are called, written after halt of program
        Props props = new Props();
        String URL = "jdbc:postgresql://" +props.getProps("app.injectorIP")+":5432"+ "/"+props.getProps("app.injectorUserName");
        String username = props.getProps("app.injectorUserName");
        String password = props.getProps("app.injectorPasswd");
        String tableName = props.getProps("app.TableName");
        String delimiter = props.getProps("app.delimiter");
        String loadPath = props.getProps("app.loadPath");
        String savePath = props.getProps("app.savePath");
        String injectorHOST = props.getProps("app.injectorIP");
        String injectorUSERNAME = props.getProps("app.injectorUserName");
        String injectorPASSWORD =props.getProps("app.injectorPasswd");
        ConnectDB connectDB = new ConnectDB(URL, username, password);
        Scanner scan = new Scanner(System.in);
        ui.welcomer();

        while (program) {
            ui.showTextIntro();
            String keyInput = scan.nextLine();


            if (keyInput.equals("1")) {

                TextToDatabase textToDatabase = new TextToDatabase(URL, username, password, tableName, delimiter, loadPath);

                logger.info("Performed Text file to Database operation, Source file : " + loadPath + " to Table :" + tableName);

            } else if (keyInput.equals("2")) {

                DatabaseToText databaseToText = new DatabaseToText(URL, username, password, tableName, delimiter, savePath);

                logger.info("Performed Database to Text file operation, Source table : " + tableName + " to File :" + savePath);

            } else if (keyInput.equals("3")) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Please enter any command to run on current machine");
                String script5 = sc.nextLine();
                ProcessBuilder processBuilder = new ProcessBuilder(URL, username, password, script5);
                logger.info("Injected any command on Current OS: " + username + " ," + script5);
            }
            else if (keyInput.equals("q")) //User wants to quit
            {
                program = false;
            } else {
                System.out.println("Wrong selection, exiting.."); //Any other input
                    break;
            }
        }
    }
}
