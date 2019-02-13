package modules;

import java.io.*;
import java.util.Properties;

/**
 * Created by Lokesh_GnanaSekhar on 6/21/2017.
 */
public class ProjectConfigReader {

    Properties properties;
    InputStream input;

    public ProjectConfigReader(){
        properties = new Properties();
        try {

            File file = new File("./ProjectConfig.properties");
            input = new FileInputStream(file);
            properties.load(input);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public String getBrowserName(){
        return properties.getProperty("BROWSER_NAME");
    }

    public String getURL(){
        return properties.getProperty("APP_URL");
    }

    public String getExeMode(){
        return properties.getProperty("EXE_MODE");
    }

    public String getSauceURL(){
        return properties.getProperty("SAUCEURL");
    }


}
