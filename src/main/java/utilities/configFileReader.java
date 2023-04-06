package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class configFileReader {

    private Properties properties;

    public configFileReader(){
        BufferedReader reader;
        try {
            String propertyFile = "configurations/config.properties";
            reader = new BufferedReader(new FileReader(propertyFile));
            properties = new Properties();
            try {
                properties.load(reader);
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }



    public String getdeviceName(){
        String getdeviceName = properties.getProperty("deviceName");
        if (getdeviceName != null) return  getdeviceName;
        else throw new RuntimeException("device name not found");

    }
    public String getplatformName(){
        String getplatformName = properties.getProperty("platformName");
        if (getplatformName != null) return  getplatformName;
        else throw new RuntimeException("platform name not found");

    }
    public String getplatformVersion(){
        String getplatformVersion = properties.getProperty("platformVersion");
        if (getplatformVersion != null) return  getplatformVersion;
        else throw new RuntimeException("platform version name not found");

    }
    public String getautomationName(){
        String getautomationName = properties.getProperty("automationName");
        if (getautomationName!= null) return  getautomationName;
        else throw new RuntimeException("automation name not found");

    }
    public String getapp(){
        String getapp = properties.getProperty("app");
        if (getapp != null) return  getapp;
        else throw new RuntimeException("App name not found");

    }

    public String getappiumServerPath() {
        String appiumServerPath = properties.getProperty("appiumServerPath");
        if (appiumServerPath != null) return appiumServerPath;
        else throw new RuntimeException("url not specified in the Configuration.properties file.");
    }

    public String getExcelPath() {
        String deviceName = properties.getProperty("excelPath");
        if (deviceName!= null) return deviceName;
        else throw new RuntimeException("excel file not found");
    }


}





