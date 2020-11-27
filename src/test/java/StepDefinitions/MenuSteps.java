package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObjects.MenuPageObjects;
import testbase.TestBase;

public class MenuSteps extends TestBase  {
    public MenuPageObjects menuPage = new MenuPageObjects();

    @Given("user is on menu page")
    public void user_is_on_menu_page() {
        driver.get("http://the-internet.herokuapp.com/dropdown");
    }

    @When("user selects item {string}")
    public void user_selects_item(String itemName) {
        menuPage.selectMenu(itemName);
    }

    @Then("menu shows selected item {string}")
    public void menu_shows_selected_item(String expectedItem) {
        Assert.assertEquals(menuPage.getMenu().getFirstSelectedOption().getText(), expectedItem);
    }
}
