package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObjects.DragAndDropPageObjects;
import testbase.TestBase;

public class DragAndDropSteps extends TestBase {
    public DragAndDropPageObjects dragAndDropPage = new DragAndDropPageObjects();

    @Given("user is on drag and drop page")
    public void user_is_on_drag_and_drop_page() {
        driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
    }

    @When("user drags object to drop target")
    public void user_drags_object_to_drop_target() {
        dragAndDropPage.performDragAndDrop();
    }

    @Then("object is dropped into drop target")
    public void object_is_dropped_into_drop_target() {
        Assert.assertTrue(dragAndDropPage.getDroppable().getText().equals("Dropped!"));
    }
}
