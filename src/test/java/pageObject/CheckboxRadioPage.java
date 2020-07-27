package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CheckboxRadioPage {
    @FindBy(css = ".ui-checkboxradio-radio-label>span.ui-checkboxradio-icon")
    List<WebElement> allRadios;

    @FindBy(xpath = "//legend[text() = 'Hotel Ratings: ']/following-sibling::label[contains(@for, 'checkbox')]/span[1]")
    List<WebElement> allRatings;

    @FindBy(xpath = "//legend[text() = 'Bed Type: ']/following-sibling::label[contains(@for, 'checkbox')]/span[1]")
    List<WebElement> allBedTypes;

    @FindBy(css = ".ui-checkboxradio-radio-label")
    List<WebElement> allRadios1;

    @FindBy(xpath = "//legend[text() = 'Bed Type: ']")
    List<WebElement> allRatings1;

    public CheckboxRadioPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public int elementSize(String type) {
        int size = 0;
        switch (type) {
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

    public boolean selectRadio(String city) throws InterruptedException {
        boolean isRadioSelected = false;
        for (WebElement eachRadio: allRadios1) {
            if (eachRadio.getText().equals(city)){
                eachRadio.click();
                Thread.sleep(2000);
                isRadioSelected = eachRadio.findElement(By.xpath("following-sibling::input[1]")).isSelected();
                break;
            }
        }
        return isRadioSelected;
    }

    /*public boolean selectCheckbox(String star) throws InterruptedException {
        boolean isRadioSelected = false;
        for (WebElement eachCheckBox: allRatings) {
            if (eachCheckBox.getText().equals(String.valueOf(star))){
                eachCheckBox.click();
                Thread.sleep(2000);
                isRadioSelected = eachCheckBox.findElement(By.xpath("//legend[text() = 'Hotel Ratings: ']/following-sibling::label[contains(@for, 'checkbox')]/span[1]")).isSelected();
                break;
            }
        }
        return isRadioSelected;
    }*/

    public void selectCheckBox(String star) throws InterruptedException {
        for(WebElement eachCheckbox: allRatings){
            if (eachCheckbox.getText().equals(star)){
                eachCheckbox.click();
                Thread.sleep(2000);
                break;
            }
        }
    }
}
