package stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import pageObject.DriverPage;

public class Hooks {

    WebDriver driver;

    @Before
    public void setUp(){
        driver = DriverPage.getDriver();
        String baseURL = "https://jqueryui.com/";
        driver.manage().window().maximize();
        driver.get(baseURL);
        System.out.println("Browser start successful");

    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
        System.out.println("Inside @After hook");
        System.out.println("Browser quit successfully");
    }
}
