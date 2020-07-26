package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ControlGroupPage {

    @FindBy(xpath = "//div[@class = 'widget']/h1")
    WebElement header;
    @FindBy(css = "#horizontal-spinner")
    WebElement numCars;
    @FindBy(css = "div.ui-helper-clearfix>span>a.ui-spinner-up")
    WebElement upArrow;
    @FindBy(css = "div.ui-helper-clearfix>span>a.ui-spinner-down")
    WebElement downArrow;

    public ControlGroupPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    public void clickUp() {
        upArrow.click();
    }

    public void clickDown() {
        downArrow.click();
    }

    public String getCarCount() {
        return numCars.getAttribute("aria-valuenow");
    }

    public String headerText() {
        return header.getText();
    }


}
