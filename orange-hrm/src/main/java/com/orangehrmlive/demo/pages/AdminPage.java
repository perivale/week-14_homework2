package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage extends Utility {
    public AdminPage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a[@id='menu_admin_UserManagement']")
    WebElement usermangment;
    @FindBy(xpath = "//a[@id='menu_admin_Job']")
    WebElement jobtext;
    @FindBy(xpath = "//a[@id='menu_admin_Organization']")
    WebElement orgenasition;



          public String getttextonusermangment() {
              return getTextFromElement(usermangment);
          }
}
