package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    public HomePage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a[@id='welcome']")
    WebElement welcometext;
    @FindBy(xpath = "//body/div[@id='wrapper']/div[@id='branding']/a[1]/img[1]")
    WebElement orghrmlogo;

    @FindBy(xpath = "//b[contains(text(),'Admin')]")
    WebElement adminnametext;
    @FindBy(xpath = "//b[contains(text(),'PIM')]")
    WebElement pimnametxt;
    @FindBy(xpath = "//b[contains(text(),'Leave')]")
    WebElement leavetext;
    @FindBy(xpath = "//b[contains(text(),'Dashboard')]")
    WebElement deshboardtext;


    public String verifywelcometext(){
        return getTextFromElement(welcometext);
    }
    public boolean verifyorghrmlogo(){
        return orghrmlogo.isDisplayed();

    }
    public void clickonadmintab(){
        clickOnElement(adminnametext);
    }






}
