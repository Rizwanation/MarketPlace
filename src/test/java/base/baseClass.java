package base;

import Utilities.readConfig;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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

    public static String getTime() {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }


    public static void GetScreenShot(String tname)
    {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File dst = new File(".//Screenshots//" + tname+ getTime() + ".png");

        try {
            FileUtils.copyFile(src,dst);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
