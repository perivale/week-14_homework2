package uk.co.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.library.utility.Utility;

public class ResultPage extends Utility {
    public ResultPage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//body/main[@id='site-main']/div[1]/div[1]/div[2]/div[1]/div[2]/label[1]")
    WebElement resultText;



    public String verifyTheResults(String result){
      return getTextFromElement(resultText,result);
    }








}
