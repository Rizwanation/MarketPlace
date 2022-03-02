package TestCases;

import base.baseClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class test extends baseClass {

    @Test
    public void visitURL()
    {
       // driver=initializeBrowser();
        driver.get("https://www.olx.com.pk/");
    }
}
