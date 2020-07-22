package stepDefs;

import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import pageObject.ControlGroupPage;
import pageObject.DriverPage;
import pageObject.JQueryHpage;

public class ControlGroupStepDefs {


    @Then("I validate header")
    public void validateHeader(){
        ControlGroupPage controlGroupPage = new ControlGroupPage(DriverPage.getDriver());
        Assertions.assertEquals(controlGroupPage.headerText(), "Controlgroup", "Header mismatch");
        System.out.println("Successfully passed test");
    }
}
