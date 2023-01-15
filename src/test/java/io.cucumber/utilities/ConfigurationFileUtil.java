package io.cucumber.utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;
import java.util.Set;

import static io.cucumber.utilities.Constant.CONFIGURATION_PROPERTIES;




/**
 *
 */
public class ConfigurationFileUtil
{
    public static Properties properties;
    static String path;

    static
    {
        path = CONFIGURATION_PROPERTIES;
        try
        {
            loadFileIntoProperties(path);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }


    //STATIC BLOCK ICINDEN 1 KERE CAGIRILIR
    private static void loadFileIntoProperties(String path) throws IOException {
        FileInputStream fis = new FileInputStream(path);
        properties = new Properties();
        properties.load(fis);
        fis.close();
    }

    //.PROPERTIES FILE'INDAN KEY'SINE BAKARAK VALUE RETURN EDER
    public static String getProperty(String key)
    {
        return properties.getProperty(key);
    }

    //.PROPERTIES FILE'INDAN TUM KEYLERI SET<STRING> HALINDE RETURN EDER
    public Set<String> getAllPropertyNames(){
        return properties.stringPropertyNames();
    }

    //.PROPERTIES FILE'INDAN KEY'SINE BAKARAK VALUE RETURN EDER
    public boolean containsKey(String key){
        return properties.containsKey(key);
    }

    //.PROPERTIES FILE'A YENI KEY=VALUE PAIR EKLER
    public static void setProperty(String key, String value) throws IOException {
        properties.setProperty(key, value);
        flush();
    }

    //.PROPERTIES FILE'IN PATH + KEY DEGERINI VER -> VALUE'U RETURN ETSIN
    public static String getPropertyWithFileName(String filePath, String key){
        try {
            loadFileIntoProperties(path=filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties.getProperty(key);
    }


    public static void flush() throws IOException {
        try (final OutputStream outputstream
                     = new FileOutputStream(path);) {
            properties.store(outputstream,"File Updated");
            outputstream.close();
        }
    }




}
