package pageObjects;

import org.openqa.selenium.By;
import testbase.TestBase;

public class RadiobuttonPageObjects extends TestBase {

    By YES = By.id("yes");
    By NO = By.id("no");
    By RESET = By.xpath("//input[@type='reset']");
    By CHECK = By.id("buttoncheck");

    public void selectRadiobutton(String name) {
        if (name.equals("yes"))
            driver.findElement(YES).click();
        else if (name.equals("no"))
            driver.findElement(NO).click();
    }

    public void pressButton(String name) {
        if (name.equals("reset"))
            driver.findElement(RESET).click();
        else if (name.equals("check"))
            driver.findElement(CHECK).click();
    }
}
