package base;

import Utilities.readConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class baseClass {

    public static WebDriver driver;
     readConfig rc;
    public String browser;

    @BeforeClass
    public void initializeBrowser()
    {
        rc = new readConfig();
        browser = rc.getBrowserName();

        if(browser.equals("chrome"))
        {
            System.setProperty("webdriver.chrome.driver", "//Users//zeeshanyousaf//GitRepoforAutomation//E2E-Project//Browsers//chromedriver");
            driver = new ChromeDriver();

        }

        //System.setProperty("webdriver.chrome.driver", "//Users//zeeshanyousaf//GitRepoforAutomation//E2E-Project//Browsers//chromedriver");
       // driver = new ChromeDriver();

    }

    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }

}
