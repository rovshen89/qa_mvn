package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DatePickerPage {

    public DatePickerPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "datepicker")
    WebElement datePick;

    @FindBy(xpath = "//td[@data-handler = 'selectDay']/a")
    List<WebElement> allDates;

    public void clickDatePick() {
        datePick.click();
    }

    public void getAllDates(String date) {
        for (WebElement eachDay : allDates) {
            if (eachDay.getText().equals(date)) {
                eachDay.click();
                break;
            }
        }
    }


}
