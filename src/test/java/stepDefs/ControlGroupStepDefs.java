package stepDefs;

import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import pageObject.ControlGroupPage;
import pageObject.DriverPage;

public class ControlGroupStepDefs {

    ControlGroupPage controlGroupPage = new ControlGroupPage(DriverPage.getDriver());

    @Then("I validate header")
    public void validateHeader() {
        Assertions.assertEquals(controlGroupPage.headerText(), "Controlgroup", "Header mismatch");
        System.out.println("Successfully passed test");
    }

    @Then("^I click (\\w+) arrow (\\d+) times$")
    public void numberClicker(String arrow, int num) {
        for (int i = 0; i < num; i++) {
            if (arrow.equalsIgnoreCase("up")) {
                controlGroupPage.clickUp();
            } else {
                controlGroupPage.clickDown();
            }
        }
    }

    @Then("^I validate that number of cars is (\\d+)$")
    public void validateCarNum(int num) {
        Assertions.assertEquals(String.valueOf(num), controlGroupPage.getCarCount(), "count mismatch");
        System.out.println("completed I validate number of cars: " + num);
    }
}
