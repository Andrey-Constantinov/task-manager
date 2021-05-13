package helpers;

import database.JDBCHelper;

import java.io.IOException;
import java.io.InputStream;

public class MyProperties {

    InputStream input = JDBCHelper.class.getClassLoader().getResourceAsStream("config.properties");
    java.util.Properties prop = new java.util.Properties();

    public MyProperties() {
        try {
            prop.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getUrl() {
        return prop.getProperty("url");
    }

    public String getName() {
        return prop.getProperty("name");
    }

    public String getPassword() {
        return prop.getProperty("password");
    }
}
