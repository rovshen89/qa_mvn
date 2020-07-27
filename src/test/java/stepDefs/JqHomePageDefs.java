package stepDefs;

import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import pageObject.DatePickerPage;
import pageObject.DriverPage;
import pageObject.JQueryHpage;

public class JqHomePageDefs {
    WebDriver driver;
    //String baseURL; --> moved to @Before hook
    JQueryHpage jQueryHpage;
    DatePickerPage datePickerPage;


    @Given("I am on the jquery homepage")
    public void i_am_on_the_jquery_homepage() {
        //baseURL = "https://jqueryui.com/"; --> moved to @Before hook
        driver = DriverPage.getDriver();
        jQueryHpage = new JQueryHpage(driver);
        datePickerPage = new DatePickerPage(driver);
        //driver.manage().window().maximize(); --> moved to @Before hook
        //driver.get(baseURL); -- moved to @Before hook
        Assertions.assertEquals(driver.getCurrentUrl(), "https://jqueryui.com/", "failed");
        System.out.println("inside @given");

    }

    @When("I click on controlgroup")
    public void i_click_on_controlgroup() {
        jQueryHpage.clickCtrlGroup();
        System.out.println("indside @when controlgroup");

    }

    @Then("I land on the controlgroup page")
    public void i_land_on_the_controlgroup_page() {
        Assertions.assertEquals(driver.getCurrentUrl(), "https://jqueryui.com/controlgroup/", "failed");
        System.out.println("Page URL checked");
        System.out.println("inside @then controlgroup");
    }

    @When("I click on datepicker")
    public void i_click_on_datepicker() {
        jQueryHpage.clickDatePicker();
        System.out.println("insdie @when datepicker ");
    }

    @Then("I land on the datepicker page")
    public void i_land_on_the_datepicker_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("inside @then datepicker");
    }

    @When("I click on checkboxradio")
    public void i_click_on_checkboxradio() {
        jQueryHpage.clickCheckBoxRadio();
    }

    @But("I land on the checkboxradio page")
    public void i_land_on_the_checkboxradio_page() {
        Assertions.assertEquals(driver.getCurrentUrl(), "https://jqueryui.com/checkboxradio/", "failed");
        System.out.println("Page URL checked");
    }

    @And("I switch to demo-frame")
    public void i_swith_to_demo_frame() {
        System.out.println("switch to demo frame");
        jQueryHpage.switchFrame();
    }


}
