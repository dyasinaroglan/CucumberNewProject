package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import utils.Browsers;
import utils.Driver;

@CucumberOptions(

       features = {"src/test/java/features/search.feature"},
        glue = {"stepdefs"},
        tags = "@ProductSearch",
        dryRun = false

)
public class RunnerSearch extends AbstractTestNGCucumberTests {
    @AfterSuite
    public void afterTest(){
        Driver.quitDriver();
    }
    @BeforeTest
    @Parameters("browser")
    public void beforeTest(String browser){
        if(browser.equalsIgnoreCase("firefox")){
            Driver.browserNames.set(Browsers.FIREFOX);
        }else {
            Driver.browserNames.set(Browsers.CHROME);
        }
    }
}
