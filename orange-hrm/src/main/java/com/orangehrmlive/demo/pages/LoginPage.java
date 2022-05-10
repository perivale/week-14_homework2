package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Utility {
    public LoginPage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(id="txtUsername")
    WebElement username;
    @FindBy(id="txtPassword")
    WebElement password;
    @FindBy(id="btnLogin")
    WebElement loginbutton;
    @FindBy(id="logInPanelHeading")
    WebElement loginpanneltext;
    @FindBy(xpath = "//a[@id='welcome']")
    WebElement useraccount;
    @FindBy(xpath = "//a[contains(text(),'Logout')]")
    WebElement logoutbutton;

    public void enterusername(String uname){
        sendTextToElement(username,uname);
    }
    public void enterpassword(String passwd){
        sendTextToElement(password,passwd);
    }
    public void clickonloginbutton(){
        clickOnElement(loginbutton);
    }
    public String verifytheloginpanel(){
        return getTextFromElement(loginpanneltext);
    }
    public void mousehoveronelement( ){
        clickOnElement(useraccount);
    }
    public void clickonlogout(){
        clickOnElement(logoutbutton);
    }

}
