package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JQueryHpage {
    WebDriver jQDriver;
    @FindBy(xpath = "//a[text()='Controlgroup']")
    WebElement controlGroup;
    @FindBy(className = "demo-frame")
    WebElement frame;
    @FindBy(xpath = "//a[text() = 'Datepicker']")
    WebElement datePicker;
    @FindBy(xpath = "//input[@id='email']")
    WebElement email;
    @FindBy(xpath = "//input[@name='password']")
    WebElement password;
    @FindBy(xpath = "//a[text() = 'Checkboxradio']")
    WebElement checkboxradio;

    public JQueryHpage(WebDriver driver) {
        jQDriver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickCheckBoxRadio() {
        checkboxradio.click();
    }

    public void clickCtrlGroup() {
        controlGroup.click();
    }


    public void switchFrame() {
        jQDriver.switchTo().frame(frame);
    }


    public void clickDatePicker() {
        datePicker.click();
    }


}
