package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static Properties properties;

    static {


        String path="src/configuration.properties";  //properties dosyasini yolu
        try {
            FileInputStream fis=new FileInputStream(path);
            properties =new Properties();
            properties.load(fis);


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {

        }
    }

    public static String getProperty(String key){

        return properties.getProperty(key);
    }


}
