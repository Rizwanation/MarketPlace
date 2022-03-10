package stepDefinitions;

import base.baseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class MyStepdefs extends baseClass{

    public WebDriver driver;

    @Given("ChromeDriver is Initialized")
    public void chromedriverIsInitialized() {

       initializeBrowser();
       driver = baseClass.driver;
    }

    @Then("Browser is open and maximized")
    public void browserIsOpenAndMaximized() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

    }



    @Given("Google's URL is Entered")
    public void googleSURLIsEntered() {

        driver.get("https://www.google.com");
        
    }

    @When("User tries to navigate to google")
    public void userTriesToNavigateToGoogle() {
        System.out.println("Navigate");
        
    }

    @Then("Google Search Page is loaded")
    public void googleSearchPageIsLoaded() {
        System.out.println("Search Page");

    }


}
