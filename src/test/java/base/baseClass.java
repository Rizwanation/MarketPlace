package base;

import Utilities.readConfig;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class baseClass {

    //
    public static WebDriver driver;
    //read configurations from file
    public readConfig rc = new readConfig();
    public String browser = rc.getBrowserName();

    //reporting stuff
    public static ExtentSparkReporter spark;
    public static ExtentReports extent;




    @BeforeClass
    public void initializeBrowser() {
        if (browser.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", ".//Browsers//chromedriver");


            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments(
                    "--disable-web-security",
                    "--ignore-certificate-errors",
                    "--allow-running-insecure-content",
                    "--allow-insecure-localhost"
            );
            driver = new ChromeDriver(chromeOptions);

        }
    }

    @BeforeTest
    public void startReport()
    {
        extent = new ExtentReports();
        spark = new ExtentSparkReporter(".//spark.html");
        extent.attachReporter(spark);
    }

    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }

    public static String getTime() {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }


    public static String GetScreenShot(String tname)  {

        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        String path = System.getProperty("user.dir") +"//Screenshots//" + tname+ getTime() + ".png";
        File dst = new File(path);

        try {
            FileUtils.copyFile(src,dst);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return path;
    }


}
