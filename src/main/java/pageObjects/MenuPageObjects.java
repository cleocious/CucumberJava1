package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import testbase.TestBase;

public class MenuPageObjects extends TestBase {
    By MENU = By.id("dropdown");
    Select menu;

    public void selectMenu(String item) {
        menu = new Select(driver.findElement(MENU));
        menu.selectByVisibleText(item);
    }

    public Select getMenu() {
        return menu;
    }
}
