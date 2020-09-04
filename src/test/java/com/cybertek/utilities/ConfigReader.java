package com.cybertek.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties = new Properties();

    static{
        String path = "configuration.properties";

        try {
            FileInputStream file = new FileInputStream(path);
            properties.load(file);
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("configuration.properties file Was NOT found ");
        }
    }
    public static String getProperty(String str){
        return properties.getProperty(str);
    }
}
