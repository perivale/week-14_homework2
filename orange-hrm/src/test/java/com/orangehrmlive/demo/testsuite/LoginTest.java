package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    LoginPage loginPage;
    HomePage homePage;

    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        loginPage=new LoginPage();
        homePage=new HomePage();
    }

    @Test(groups = "sanity")
    public void verifyUserShouldLoginSuccessFully(){
        loginPage.enterusername("Admin");
        loginPage.enterpassword("admin123");
        loginPage.clickonloginbutton();
        String expectedtext="Welcome";
        String actualtext=homePage.verifywelcometext();
        Assert.assertEquals(expectedtext,actualtext.substring(0,7));


    }
    @Test(groups = {"smoke","sanity","regression"})
    public void verifyThatTheLogoDisplayOnHomePage(){
        loginPage.enterusername("Admin");
        loginPage.enterpassword("admin123");
        loginPage.clickonloginbutton();
        Assert.assertTrue(homePage.verifyorghrmlogo());
    }
    @Test(groups = {"smoke","sanity"})
    public void verifyUserShouldLogOutSuccessFully(){
        loginPage.enterusername("Admin");
        loginPage.enterpassword("admin123");
        loginPage.clickonloginbutton();
        loginPage.mousehoveronelement();
        loginPage.clickonlogout();
        loginPage.verifytheloginpanel();



    }
}
