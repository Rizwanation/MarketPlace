package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrendMicro {

    WebDriver driver;

    public TrendMicro(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css="input[title='Username']")
    WebElement username;

    @FindBy(css ="input#login")
    WebElement LoginBtn1;

    @FindBy(css="input#password")
    WebElement password;


    @FindBy(css="button#login")
    WebElement LoginBtn2;

    public void setusername(String uname)
    {
        username.sendKeys(uname);
    }

    public void setPassword(String pswd)
    {
        password.sendKeys(pswd);
    }

    public void clickLogin1()
    {
        LoginBtn1.click();
    }

    public void clickLogin2()
    {
        LoginBtn2.click();
    }


}
