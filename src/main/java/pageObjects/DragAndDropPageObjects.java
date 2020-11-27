package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import testbase.TestBase;

public class DragAndDropPageObjects extends TestBase {
    By DRAGGABLE = By.id("draggable");
    By DROPPABLE = By.id("droppable");

    public void performDragAndDrop() {
        Actions act = new Actions(driver);
        act.dragAndDrop(driver.findElement(DRAGGABLE), driver.findElement(DROPPABLE)).build().perform();
    }

    public WebElement getDroppable() {
        return driver.findElement(DROPPABLE);
    }
}

