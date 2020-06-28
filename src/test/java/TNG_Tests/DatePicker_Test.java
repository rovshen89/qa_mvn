package TNG_Tests;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.ControlGroupPage;
import pageObject.DatePickerPage;
import pageObject.JQueryHpage;

public class DatePicker_Test {

    WebDriver driver;
    String baseURL;
    JQueryHpage jQueryHpage;
    DatePickerPage datePickerPage;

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.gecko.driver", "D:\\QA_Testing\\Resources\\geckodriver\\geckodriver.exe");
        baseURL = "https://jqueryui.com";
        driver = new FirefoxDriver();
        jQueryHpage = new JQueryHpage(driver);
        datePickerPage = new DatePickerPage(driver);
        driver.manage().window().maximize();
        driver.get(baseURL);

    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void clickCtrlGroup() throws InterruptedException {
        jQueryHpage.clickDatePicker();
//        Thread.sleep(2000);
        jQueryHpage.switchFrame();
        datePickerPage.clickDatePick();
        datePickerPage.getAllDates("5");
        Thread.sleep(3000);

    }
}
