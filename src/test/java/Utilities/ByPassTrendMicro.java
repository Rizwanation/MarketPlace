package Utilities;

import PageObjects.TrendMicro;
import org.openqa.selenium.WebDriver;

public class ByPassTrendMicro {

    WebDriver driver;


    public void byPass(WebDriver driver)
    {
        this.driver = driver;
        TrendMicro tm = new TrendMicro(driver);

        readConfig rc = new readConfig();


        tm.setusername(rc.getTmUserName());
        tm.clickLogin1();
        tm.setPassword(rc.gettmpassword());
        tm.clickLogin2();
    }
}
