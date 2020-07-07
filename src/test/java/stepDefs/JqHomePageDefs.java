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
        System.out.println("indside @when");

    }

    @Then("I land on the controlgroup page")
    public void i_land_on_the_controlgroup_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("indside @then");
    }

}
