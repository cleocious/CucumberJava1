package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObjects.LoginPageObjects;
import testbase.TestBase;

public class LoginSteps extends TestBase {
    public LoginPageObjects loginPage = new LoginPageObjects();

    @Given("user is on login page")
    public void user_is_on_login_page() {
        driver.get("https://demo.openmrs.org/openmrs/login.htm");
    }

    @When("user enters username and password")
    public void user_enters_username_and_password() {
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("Admin123");
    }

    @And("selects location")
    public void selects_location() {
        loginPage.selectLocationInpatientWard();
    }

    @And("clicks on login button")
    public void clicks_on_login_button() {
        loginPage.logIn();
    }

    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page() {
        Assert.assertTrue(driver.getPageSource().contains("Logged in as Super User (admin) at Inpatient Ward."));
    }
}

