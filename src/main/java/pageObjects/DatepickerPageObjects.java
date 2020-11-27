package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import testbase.TestBase;

import java.util.List;

public class DatepickerPageObjects extends TestBase {
    By DEPART_DATE = By.id("DepartDate");
    By CALENDAR_YEAR = By.className("ui-datepicker-year");
    By CALENDAR_MONTH = By.className("ui-datepicker-month");
    By CALENDAR = By.className("calendar");
    By NEXT_MONTH = By.className("nextMonth");
    By ROW = By.tagName("tr");
    By COL = By.tagName("td");
    String date, month, year;
    String caldate, calmonth, calyear;
    List<WebElement> rows, cols;
    String selectedMonthAndYear, expectedMonthAndYear;

    public void selectDepartureDate(String departureDate, String departureMonth, String departureYear) {
        WebElement calendar;
        date = departureDate;
        month = departureMonth;
        year = departureYear;
        expectedMonthAndYear = month + " " + year;

        driver.findElement(DEPART_DATE).click();
        calyear = driver.findElement(CALENDAR_YEAR).getText();

        /* Select year */
        while (! (calyear.equals(year))) {
            driver.findElement(NEXT_MONTH).click();
            calyear = driver.findElement(CALENDAR_YEAR).getText();
        }

        calmonth = driver.findElement(CALENDAR_MONTH).getText();

        /* Select month */
        while (! (calmonth.equalsIgnoreCase(month))) {
            driver.findElement(NEXT_MONTH).click();
            calmonth = driver.findElement(CALENDAR_MONTH).getText();
        }

        calendar = driver.findElement(CALENDAR);

        /* Select date */
        rows = calendar.findElements(ROW);
        for (WebElement elem: rows) {
            cols = elem.findElements(COL);
            for (WebElement elem2: cols) {
                caldate = elem2.getText();
                if (caldate.equals(date)) {
                    elem2.click();
                    break;
                }
            }
        }

        /* Get selected date (month and year) for verification purposes
           TO DO: Find a way to get selected date (table cell) as well
         */
        driver.findElement(DEPART_DATE).click();
        calendar = driver.findElement(CALENDAR);
        calyear = driver.findElement(CALENDAR_YEAR).getText();
        calmonth = driver.findElement(CALENDAR_MONTH).getText();
        selectedMonthAndYear = calmonth + " " + calyear;
    }

    public String getSelectedDate() {
        return selectedMonthAndYear;
    }

    public String getExpectedDate() {
        return expectedMonthAndYear;
    }
}

