package base;

import Utilities.readConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class baseClass {

    public static WebDriver driver;
    public readConfig rc = new readConfig();
    public String browser = rc.getBrowserName();

    @BeforeClass
    public void initializeBrowser() {
        if (browser.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", ".//Browsers//chromedriver");
            driver = new ChromeDriver();
        }

    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
