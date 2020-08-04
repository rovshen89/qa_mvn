package stepDefs;

import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObject.DatePickerPage;
import managers.DriverPage;

public class DatePickerDefs {
    WebDriver driver;

    @When("I validate date selection")
    public void date_selection() {
        driver = DriverPage.getDriver();
        DatePickerPage datePickerPage = new DatePickerPage(driver);
        System.out.println("inside date selection");
        datePickerPage.clickDatePick();
        datePickerPage.getAllDates("22");
    }

    //moved to @After hook class
    /*@And("I quit the browser")
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }*/
}
