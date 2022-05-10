package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.bind.annotation.W3CDomHandler;
import javax.xml.bind.annotation.XmlAccessOrder;

public class AddUserPage extends Utility {
    public AddUserPage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a[contains(text(),'User Role')]")
    WebElement userrolldown;
    @FindBy(xpath = "//a[contains(text(),'Employee Name')]")
    WebElement employeename;
    @FindBy(xpath = "//a[contains(text(),'Username')]")
    WebElement usernamedropdown;
    @FindBy(xpath = "//thead/tr[1]/th[5]/a[1]")
    WebElement statesdropdown;
    @FindBy(xpath = "//h1[@id='UserHeading']")
    WebElement addusertext;

    public String verifyaddusertext(){
        return getTextFromElement(addusertext);
    }
    public void dropdownonusername(int a){
        selectByIndexFromDropDown(userrolldown,a);
    }
    public void enteremployname(String name){
        sendTextToElement(employeename,name);
    }
    public void enterusername(String name1){
        sendTextToElement(usernamedropdown,name1);
    }
    public void dropdownonsatues(int b){
        selectByIndexFromDropDown(statesdropdown,b);
    }


}
