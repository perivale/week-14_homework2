package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DurationOfStayPage extends Utility {
    public DurationOfStayPage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement lessthen6moth;

    @FindBy(xpath = "//input[@id='response-1']")
    WebElement morethen6month;

    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement nextstepbutton;

    public  void selectLengthOfStay(String lessthen6month){
        selectByValueFromDropDown(lessthen6moth,lessthen6month);
    }
    public  void selectLengthOfStay1(String moreor6month){
        selectByValueFromDropDown(morethen6month,moreor6month);
    }
    public void clickNextStepButton(){
        clickOnElement(nextstepbutton);
    }

}
