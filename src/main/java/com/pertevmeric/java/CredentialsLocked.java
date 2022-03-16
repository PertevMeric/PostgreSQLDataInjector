package com.pertevmeric.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class CredentialsLocked {
    private String injectorIP;
    private String injectorUserName;
    private String injectorPasswd;
    private String TableName;
    private String delimiter;
    private String loadPath;
    private String savePath;
    private String localLogPath;
    private String logTableName;
    private String DatabaseUN;
    private String DatabasePasswd;

    private Properties CredentialsLocked ()
    {
        Properties prop = new Properties();
        String fileName = "src/app.config";
        try (FileInputStream fis = new FileInputStream(fileName)) {
            prop.load(fis);
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

                                 }
             return prop;
    }
    public String getInjectorIP() {
        return injectorIP;
    }

    public void setInjectorIP(String injectorIP) {
        this.injectorIP = injectorIP;
    }

    public String getInjectorUserName() {
        return injectorUserName;
    }

    public void setInjectorUserName(String injectorUserName) {
        this.injectorUserName = injectorUserName;
    }

    public String getInjectorPasswd() {
        return injectorPasswd;
    }

    public void setInjectorPasswd(String injectorPasswd) {
        this.injectorPasswd = injectorPasswd;
    }

    public String getTableName() {
        return TableName;
    }

    public void setTableName(String tableName) {
        TableName = tableName;
    }

    public String getDelimiter() {
        return delimiter;
    }

    public void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    public String getLoadPath() {
        return loadPath;
    }

    public void setLoadPath(String loadPath) {
        this.loadPath = loadPath;
    }

    public String getSavePath() {
        return savePath;
    }

    public void setSavePath(String savePath) {
        this.savePath = savePath;
    }

    public String getLocalLogPath() {
        return localLogPath;
    }

    public void setLocalLogPath(String localLogPath) {
        this.localLogPath = localLogPath;
    }

    public String getLogTableName() {
        return logTableName;
    }

    public void setLogTableName(String logTableName) {
        this.logTableName = logTableName;
    }

    public String getDatabaseUN() {
        return DatabaseUN;
    }

    public void setDatabaseUN(String databaseUN) {
        DatabaseUN = databaseUN;
    }

    public String getDatabasePasswd() {
        return DatabasePasswd;
    }

    public void setDatabasePasswd(String databasePasswd) {
        DatabasePasswd = databasePasswd;
    }

    public Properties getCreds() {
        return  CredentialsLocked();
    }

}
