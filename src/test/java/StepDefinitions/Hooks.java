package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import testbase.TestBase;

import java.io.File;
import java.io.IOException;

public class Hooks {

    @Before
    public void before_or_after() throws Exception {
        WebDriverManager.chromedriver().setup();
        TestBase.driver = new ChromeDriver();
    }

    @After
    public void before_or_after(Scenario scenario) throws IOException {
        // Include link to screenshot in Cucumber HTML report in case of scenario failure
        if (scenario.isFailed()) {
            String scenarioName = scenario.getName();
            File srcFile = ((TakesScreenshot)TestBase.driver).getScreenshotAs(OutputType.FILE);
            File destFile = new File("target/screenshots/" + scenarioName + ".jpg");
            FileUtils.copyFile(srcFile, destFile);
            String screenshotLink = "<a href=\"../../target/screenshots/" + scenarioName + ".jpg" + "\">Screenshot</a>";
            scenario.log("Scenario failed.");
            scenario.log(screenshotLink);
        }

        TestBase.driver.close();
        TestBase.driver.quit();
    }
}
