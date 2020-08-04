package stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import managers.AutomationContext;
import managers.ConfigReader;
import managers.ScenarioMgr;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import managers.DriverPage;

public class Hooks {

    WebDriver driver;
    AutomationContext context;
    ConfigReader configReader;

    public Hooks(AutomationContext context){
        this.context = context;
    }

    @Before
    public void setUp(Scenario scenario){
        DriverPage.initDriver();
        driver = DriverPage.getDriver();
//        String baseURL = "https://jqueryui.com/";
        driver.manage().window().maximize();
        driver.get(context.getConfigReader().getPropertyValue("baseURL"));
        context.getScenarioMgr().setScenario(scenario);
        System.out.println("Browser start successful");

    }

    @After
    public void tearDown(Scenario scenario) throws InterruptedException {
        scenario.log("getID: " + scenario.getId());
        scenario.log("getName: " + scenario.getName());
        scenario.log("getLine: " + scenario.getLine());
        scenario.log("getSourceTagNames: " + scenario.getSourceTagNames());
        scenario.log("getUri: " + scenario.getUri());
        scenario.log("getStatus: "+ scenario.getStatus());
        scenario.log("isFailed: " + scenario.isFailed());
        byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/jpeg", "");
        Thread.sleep(5000);
        driver.quit();
        System.out.println("Inside @After hook");
        System.out.println("Browser quit successfully");
    }
}
