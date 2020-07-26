package stepDefs;

import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import pageObject.CheckboxRadioPage;
import pageObject.DriverPage;

public class CheckBoxRadioDefs {

    CheckboxRadioPage checkboxRadioPage = new CheckboxRadioPage(DriverPage.getDriver());


    @Then("^I validate number of (\\w+) is (\\d+)$")
    public void validate_radios_number(String type, int radios) {
        Assertions.assertEquals(radios, checkboxRadioPage.elementSize(type));
        System.out.println("Completed number of " + type + " validation is " + radios);
    }


}
