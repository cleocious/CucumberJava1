package StepDefinitions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/features"
                    ,glue={"StepDefinitions"}
                    ,plugin={"pretty"
                        ,"html:target/HtmlReports/report.html"
                        ,"json:target/cucumber.json"}
                    ,tags = "not @skip"
                    ,monochrome = true
                )
public class TestRunner extends AbstractTestNGCucumberTests {

}
