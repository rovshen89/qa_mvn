package stepDefs;

import io.cucumber.java.en.*;

public class JqHomePageDefs {

    @Given("I am on the jquery homepage")
    public void i_am_on_the_jquery_homepage() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("indside @given");
    }

    @When("I click on controlgroup")
    public void i_click_on_controlgroup() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("indside @when controlgroup");

    }

    @Then("I land on the controlgroup page")
    public void i_land_on_the_controlgroup_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("indside @then controlgroup");
    }

    @When("I click on datepicker")
    public void i_click_on_datepicker() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("insdie @when datepicker ");
    }

    @Then("I land on the datepicker page")
    public void i_land_on_the_datepicker_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("inside @then datepicker");
    }

    @When("I click on checkboxradio")
    public void i_click_on_checkboxradio() {
        //code here
        System.out.println("inside @when checkboxradio");
    }

    @But("I land on the checkboxradio page")
    public void i_land_on_the_checkboxradio_page() {
        //code here
        System.out.println("inside @Then checkboxradio");
    }


}
