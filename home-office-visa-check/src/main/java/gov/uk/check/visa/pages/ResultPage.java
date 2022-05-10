package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultPage extends Utility {
    public ResultPage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//h1[contains(text(),'How long are you planning to study in the UK for?')]")
    WebElement resultsmessge;
    @FindBy(xpath = "//body")
    WebElement resultmessgefortorisum;
    @FindBy(xpath = "//body")
    WebElement resultmessageforwork;

    public  String getResultMessage(){
        return getTextFromElement(resultsmessge);
    }
    public void confirmResultMessage(String expectedMessage){

    }
    public String messageforturisumvisa(){
        return getTextFromElement(resultmessgefortorisum);
    }
    public String messageforworkvisa(){
        return  getTextFromElement(resultmessageforwork);

    }
}
