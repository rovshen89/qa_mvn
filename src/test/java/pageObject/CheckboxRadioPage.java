package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CheckboxRadioPage {

    public CheckboxRadioPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".ui-checkboxradio-radio-label>span.ui-checkboxradio-icon")
    List<WebElement> allRadios;

    @FindBy(xpath = "//legend[text() = 'Hotel Ratings: ']/following-sibling::label[contains(@for, 'checkbox')]/span[1]")
    List<WebElement> allRatings;

    @FindBy(xpath = "//legend[text() = 'Bed Type: ']/following-sibling::label[contains(@for, 'checkbox')]/span[1]")
    List<WebElement> allBedTypes;

    public int elementSize(String type){
        int size = 0;
        switch (type){
            case "radios":
                size = allRadios.size();
                break;
            case "ratings":
                size = allRatings.size();
                break;
            case "bedTypes":
                size = allBedTypes.size();
                break;
        }
        return size;
    }
}
