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
        System.out.println("Validation Completed: number of " + type + " elements is " + radios);
    }

    @Then("^I select \"(.*)\" radio button$")
    public void selectRadio(String city) throws InterruptedException {
        Assertions.assertTrue(checkboxRadioPage.selectRadio(city));
        System.out.println("completed selecting radio");
    }

    @Then("^I select \"(.*)\" checkbox$")
    public void selectCheckbox(String star) throws InterruptedException {
//        Assertions.assertTrue(checkboxRadioPage.selectCheckbox(star));
        checkboxRadioPage.selectCheckBox(star);

        System.out.println("completed selecting checkbox");
    }


}
