package TNG_Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.DatePickerPage;
import pageObject.DriverPage;
import pageObject.JQueryHpage;

public class WebDriverMngr_Test {

    WebDriver driver;
    String baseURL;
    JQueryHpage jQueryHpage;
    DatePickerPage datePickerPage;

    @BeforeClass
    public void setup() {
//        System.setProperty("webdriver.gecko.driver", "D:\\QA_Testing\\Resources\\geckodriver\\geckodriver.exe");
//        WebDriverManager.chromedriver().setup();
//        WebDriverManager.firefoxdriver().setup();
        baseURL = "https://jqueryui.com";
//        driver = new FirefoxDriver();
        driver = DriverPage.getDriver();
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
        //System.setProperty("date", "5");
        datePickerPage.getAllDates(System.getProperty("date"));
        Thread.sleep(3000);

    }
}
