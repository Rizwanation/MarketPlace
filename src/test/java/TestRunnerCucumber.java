import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"/Users/muhammadrizwan/MarketPlace/src/test/java/features"},
        glue  = {"stepDefinitions"}

)
public class TestRunnerCucumber extends AbstractTestNGCucumberTests {
}
