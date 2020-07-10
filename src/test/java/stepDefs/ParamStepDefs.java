package stepDefs;

import io.cucumber.java.en.*;

public class ParamStepDefs {

    @When("^I read parameter \"(.*)\"$")
    public void i_read_parameter(String param) {
        System.out.println("param is: " + param);

    }

    @Given("^I login with \"(.*)\" id and \"(.*)\" password$")
    public void login_with_credentials(String user, String password) {
        System.out.println("User ID: " + user + "\nPassword: " + password);
    }

    @Then("^I land on homepage \"(.*)\"$")
    public void land_on_homepage(String homepage) {
        System.out.println("Im inside homepage: " + homepage);
    }

    @Given("^I sign up with user name \"(.*)\" and email \"([^\"]*)\"$")
    public void login_with_param2(String user, String email) {
        System.out.println("Username is: " + user + " and email: " + email);
    }

    @Given("^I login with id (\\w+) and passId (\\d+)$")
    public void wordParam(String user, String password) {
        System.out.println("Username ID: " + user + " password: " + password);
    }

    @Given("^I pass double value into parameter (\\d+.\\d+)$")
    public void doubleDigit(double digit){
        System.out.println("Double digit is: " + digit);
    }




}
