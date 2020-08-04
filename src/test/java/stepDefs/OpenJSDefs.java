package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import managers.AutomationContext;
import managers.DriverPage;
import managers.ExcelReader;
import pageObject.OpenJSPage;

import java.util.ArrayList;
import java.util.HashMap;

public class OpenJSDefs {

    AutomationContext context;
    OpenJSPage openJSPage = new OpenJSPage(DriverPage.getDriver());

    public OpenJSDefs(AutomationContext context) {
        this.context = context;
    }

    @Then("^I read property (\\w+)$")
    public void read_prop(String key) {
        context.getScenarioMgr().getScenario().log(key + ": property value = " + context.getConfigReader().getPropertyValue(key));
    }

    @And("^I set (\\w+) to \"(.*)\"$")
    public void setValues(String field, String valueKey) throws InterruptedException {
        openJSPage.setValue(field, context.getConfigReader().getPropertyValue(valueKey));
        Thread.sleep(2000);
    }

    @Given("I login with excel file")
    public void iLoginWithExcelFile() {
        ArrayList<HashMap<String, String>> validationData = ExcelReader.readFromExcel();
        for(HashMap<String, String> eachRow: validationData) {
            context.getScenarioMgr().getScenario().log("Data:"+eachRow);
            openJSPage.setValue("email", eachRow.get("email"));
            openJSPage.setValue("password", eachRow.get("password"));
        }
    }


}
