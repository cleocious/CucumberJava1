package pageObjects;

import org.openqa.selenium.By;
import testbase.TestBase;

public class LoginPageObjects extends TestBase {
    By USERNAME = By.id("username");
    By PASSWORD = By.id("password");
    By INPATIENT_WARD = By.id("Inpatient Ward");
    By LOGIN = By.id("loginButton");

    public void enterUsername(String name) {
        driver.findElement(USERNAME).sendKeys(name);
    }

    public void enterPassword(String pass) {
        driver.findElement(PASSWORD).sendKeys(pass);
    }

    public void selectLocationInpatientWard() {
        driver.findElement(INPATIENT_WARD).click();
    }

    public void logIn() {
        driver.findElement(LOGIN).click();
    }
}
