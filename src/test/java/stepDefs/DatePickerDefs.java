package stepDefs;

import io.cucumber.java.en.When;

public class DatePickerDefs {

    @When("I validate date selection")
    public void date_selection() {
        System.out.println("inside date selection");
    }
}
