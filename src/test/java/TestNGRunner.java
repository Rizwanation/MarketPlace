import Utilities.Listeners;
import org.testng.ITestListener;
import org.testng.TestListenerAdapter;
import org.testng.TestNG;

import java.util.Collections;

public class TestNGRunner {

    public static void main(String[] args)
    {
        CucumberRunner();
    }

    public static void mainRunner()
    {
        TestNG testngABC = new TestNG();
        testngABC.setListenerClasses(Collections.singletonList(Listeners.class));
        testngABC.setTestClasses(new Class[] { TestCases.UI_TC_001_HomePage.class });
        testngABC.run();
    }

    public static void CucumberRunner()
    {
        TestNG testngABC = new TestNG();
       // testngABC.setListenerClasses(Collections.singletonList(Listeners.class));
        testngABC.setTestClasses(new Class[] { TestRunnerCucumber.class });
        testngABC.run();
    }
}
