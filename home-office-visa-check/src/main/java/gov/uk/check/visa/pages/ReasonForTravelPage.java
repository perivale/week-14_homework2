package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReasonForTravelPage extends Utility {
    public ReasonForTravelPage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@id='response-0']")
    WebElement reasonfortravel;

    @FindBy(xpath = "void clickNextStepButton()")
    WebElement nextstrpbutton;
    @FindBy(xpath = "id=\"response-1\"")
    WebElement resonfortraveloption2;
    @FindBy(xpath = "id=\"response-4\"")
    WebElement resonfortraveloption4;



    public void selectReasonForVisit(String reason){
       selectByValueFromDropDown (reasonfortravel,reason);
    }
    public void clickNextStepButton(){
        clickOnElement(nextstrpbutton);

    }
    public void selectReasonForVisitToComeUk(String reason2){

        selectByValueFromDropDown(resonfortraveloption2,reason2);
    }
    public void selectReasonForVisitToComeUkReason(String reason4){
        selectByValueFromDropDown(resonfortraveloption4,reason4);
    }
}


