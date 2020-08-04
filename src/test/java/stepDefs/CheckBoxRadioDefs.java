package stepDefs;

import io.cucumber.java.en.Then;
import managers.AutomationContext;
import org.junit.jupiter.api.Assertions;
import pageObject.CheckboxRadioPage;
import managers.DriverPage;

public class CheckBoxRadioDefs {

    AutomationContext context;

    public CheckBoxRadioDefs(AutomationContext context){
        this.context = context;
    }

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

    @Then("^I only select \"(.*)\" radio button$")
    public void selectOnlyRadio(String city) throws Throwable  {
        checkboxRadioPage.selectRadioOnly(city);
        context.setContextMap("buttonselected:", city);
        System.out.println("button selected: " + city);
        context.getScenarioMgr().getScenario().log("button selected: " + city);
    }

    @Then("^I validate radiocheckbox selection$")
    public void validateSelection()throws Throwable {
        Assertions.assertTrue(checkboxRadioPage.validateSelection(context.getContextMap("buttonselected:")));
        System.out.println("validated button selection: " + context.getContextMap("buttonselected"));
        context.getScenarioMgr().getScenario().log("validated button selection: " + context.getContextMap("buttonselected"));
    }

}
