package ua.in.kupol.BasicIdea;

import org.apache.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by kpl on 03.07.2014.
 */
public class PropertiesReader {
    static Logger logger = Logger.getLogger(PropertiesReader.class);
    Properties projectProperties = new Properties();
    public PropertiesReader(){
        InputStream input = null;
        try {
            input = Main.class.getClassLoader().getResourceAsStream(Main.PROPERTIES_FILE);
            projectProperties.load(input);
        } catch (IOException ex) {
            logger.error("Sorry, unable to find " + Main.PROPERTIES_FILE, ex);
        } finally{
            if(input!=null){
                try {
                    input.close();
                } catch (IOException e) {
                    logger.error("Sorry, can't close file" + Main.PROPERTIES_FILE, e);
                }
            }
        }
    }

      public Integer getReGex () {
//      public String getReGex () {
        return 1;
//        return projectProperties.getProperty("regexMask");
      }

}
