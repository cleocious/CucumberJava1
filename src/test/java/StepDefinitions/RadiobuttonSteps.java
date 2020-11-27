package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObjects.RadiobuttonPageObjects;
import testbase.TestBase;

public class RadiobuttonSteps extends TestBase {
    public RadiobuttonPageObjects radiobuttonPage = new RadiobuttonPageObjects();;

    @Given("user is on radiobutton selection page")
    public void user_is_on_radiobutton_selection_page() throws Exception {
        driver.get("http://demo.guru99.com/test/ajax.html");
    }

    @When("user selects a radiobutton")
    public void user_selects_a_radiobutton() {
        radiobuttonPage.selectRadiobutton("no");
    }

    @And("presses the Check button")
    public void presses_the_Check_button() {
        radiobuttonPage.pressButton("check");
    }

    @Then("status text shows correct status and value of selected radiobutton")
    public void status_text_shows_correct_status_and_value_of_selected_radiobutton() {
        Assert.assertTrue(driver.getPageSource().contains("Radio button is checked and it's value is No"));
    }

    @And("presses the Reset and Check buttons")
    public void presses_the_reset_and_Check_buttons() {
        radiobuttonPage.pressButton("reset");
        radiobuttonPage.pressButton("check");
    }

    @Then("status text shows that no radiobutton is selected")
    public void status_text_shows_that_no_radiobutton_is_selected() {
        Assert.assertTrue(driver.getPageSource().contains("Radio button is Not checked"));
    }
}
