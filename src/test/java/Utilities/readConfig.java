package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class readConfig {

    Properties prop;
    public readConfig()
    {
     // File src=new File(System.getProperty(System.getProperty("user.dir")+"//Configurations//config.properties"));

       try {
           FileInputStream fis = new FileInputStream("/Users/config.properties");
           prop = new Properties();
           prop.load(fis);
       }
       catch (Exception e)
       {
           System.out.println("The exception is "+ e.getMessage());
       }
    }

    public String getBrowserName()
    {
        String browser=prop.getProperty("browser");
        return browser;
    }

    public String getTmUserName()
    {
        String tmUserName = prop.getProperty("tmusername");
        return tmUserName;

    }

    public String gettmpassword()
    {
        String tmpassword = prop.getProperty("tmpassword");
        return tmpassword;

    }

    public String getPdmusername()
    {
        String pdmusername = prop.getProperty("pdmusername");
        return pdmusername;

    }


    public String getPdmpassword()
    {
        String pdmpassword = prop.getProperty("pdmpassword");
        return pdmpassword;

    }


}
