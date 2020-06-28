package TNG_Tests;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import pageObject.ControlGroupPage;
import pageObject.JQueryHpage;

public class Jquery_Test {

    WebDriver driver;
    String baseURL;
    JQueryHpage jQueryHpage;
    ControlGroupPage controlGroupPage;

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.gecko.driver", "D:\\QA_Testing\\Resources\\geckodriver\\geckodriver.exe");
        baseURL = "https://jqueryui.com";
        driver = new FirefoxDriver();
        jQueryHpage = new JQueryHpage(driver);
        controlGroupPage = new ControlGroupPage(driver);
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
        jQueryHpage.clickCtrlGroup();
//        Thread.sleep(2000);
        jQueryHpage.switchFrame();
        Assertions.assertEquals(controlGroupPage.headerText(), "Controlgroup");

    }
}
