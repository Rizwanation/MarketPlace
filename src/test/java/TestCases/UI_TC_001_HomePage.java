package TestCases;

import Utilities.ByPassTrendMicro;
import base.baseClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class UI_TC_001_HomePage extends baseClass {

    @Test(priority = 1)
    public void visitURL()
    {
       // driver=initializeBrowser();
        driver.get("https://www.olx.com.pk/");


        if (driver.getTitle().startsWith("Trend")) {
            ByPassTrendMicro btm = new ByPassTrendMicro();
            btm.byPass(driver);
        }


    }

    @Test(priority = 2)
    public void Test02()
    {
        System.out.println("Test 02");
        driver.get("https://www.google.com");

        SoftAssert sa = new SoftAssert();
        sa.assertEquals(2,3);
        sa.assertEquals(3,3);

        sa.assertAll();
    }
}
