package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewSystemUsersPage extends Utility {
    public ViewSystemUsersPage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a[contains(text(),'>')]")
    WebElement usersystem;
    @FindBy(xpath = "//input[@id='searchSystemUser_userName']")
    WebElement usernamefiled;
    @FindBy(xpath = "//select[@id='searchSystemUser_userType']")
    WebElement userrollnum;
    @FindBy(xpath = "//input[@id='searchSystemUser_employeeName_empName']")
    WebElement username;
    @FindBy(xpath = "//select[@id='searchSystemUser_status']")
    WebElement status;
    @FindBy(xpath = "//input[@id='searchBtn']")
    WebElement searchbutton;
    @FindBy(xpath = "//input[@id='resetBtn']")
    WebElement resetbutton;
    @FindBy(xpath = "//input[@id='btnAdd']")
    WebElement addbutton;
    @FindBy(xpath = "//input[@id='btnDelete']")
    WebElement deletebutton;
    @FindBy(xpath = "//input[@id='btnSave']")
    WebElement savebutton;

    public String gettexttousersystem(){
        return getTextFromElement(usersystem);
    }
    public void enterusername(String str){
        sendTextToElement(usernamefiled,str);
    }
    public void dropdownmwnuforuserroll(String num){
        selectByValueFromDropDown(userrollnum,num);
    }
    public void enteremploynamefiled(String name){
        sendTextToElement(username,name);
    }
    public void dropdownmwnuforstatus(String atr){
        selectByValueFromDropDown(status,atr);
    }
    public void clickonserchbutton(){
        clickOnElement(searchbutton);
    }
    public void clickonresetbutton(){
        clickOnElement(resetbutton);
    }
    public void clickonaddbutton(){
        clickOnElement(addbutton);
    }
    public void clickondeletebutton(){
        clickOnElement(deletebutton);

    }
    public void enteronsavebutton(){
        clickOnElement(savebutton);
    }



}
