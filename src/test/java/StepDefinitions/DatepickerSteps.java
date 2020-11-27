package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObjects.DatepickerPageObjects;
import testbase.TestBase;

public class DatepickerSteps extends TestBase {
    public DatepickerPageObjects datepickerPage = new DatepickerPageObjects();

    @Given("user is on travel departure date selection page")
    public void user_is_on_travel_departure_date_selection_page() {
        driver.get("https://www.cleartrip.com/");
    }

    @When("user selects {string} {string} {string} in date picker")
    public void user_selects_departure_date_in_date_picker(String date, String month, String year) {
        datepickerPage.selectDepartureDate(date, month, year);
    }

    @Then("departure date is selected")
    public void departure_date_is_selected() {
        Assert.assertEquals(datepickerPage.getSelectedDate(), datepickerPage.getExpectedDate());
    }
}
