package stepDefs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

import java.util.List;
import java.util.Map;

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
    public void doubleDigit(double digit) {
        System.out.println("Double digit is: " + digit);
    }

    @Given("^I select (Fast|Faster|Medium|Slow|Slower) from the speed drop down$")
    public void limitedParam(String param) {
        System.out.println("Limited param is: " + param);
    }

    @Given("^I pass integer value (\\d+)$")
    public void intParam(int number){
        System.out.println("Integer is: " + number);
    }

    @When("^I fill (\\w+) form$")
    public void readMap(String formType, Map<String, String> params){
        System.out.println("\r\nForm type: " + formType);
        for (Map.Entry<String, String> param: params.entrySet()){
            System.out.println("key: " + param.getKey());
            System.out.println("Value: " + param.getValue());
        }
    }

    @Given("^I fill all forms$")
    public void dataTable(DataTable param){
        List<Map<String, String>> list = param.asMaps(String.class, String.class);
        for (Map<String, String> eachMap: list){
            System.out.println("\r\n");
            for (Map.Entry<String, String> entry: eachMap.entrySet()){
                System.out.println(entry.getKey() + ":" + entry.getValue());
            }
        }
    }


}
