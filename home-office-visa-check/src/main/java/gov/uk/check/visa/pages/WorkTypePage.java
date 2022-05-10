package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WorkTypePage extends Utility {
    public WorkTypePage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//body")
    WebElement selectworktype;

    @FindBy(xpath = "//body")
    WebElement nextstep;


    public  void selectJobType(String job){
        selectByValueFromDropDown(selectworktype,job);
    }
    public  void clickNextStepButton(){
        clickOnElement(nextstep);

    }

}


