package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.*;
import com.orangehrmlive.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UsersTest extends TestBase {
    HomePage homePage;
    LoginPage loginPage;
    AdminPage adminPage;
    ViewSystemUsersPage viewSystemUsersPage;
    AddUserPage addUserPage;
    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        homePage=new HomePage();
        loginPage=new LoginPage();
        adminPage=new AdminPage();
        viewSystemUsersPage =new ViewSystemUsersPage();
        adminPage=new AdminPage();

    }
    @Test(groups = "sanity")
    public void dminShouldAddUserSuccessFully(){
        loginPage.enterusername("Admin");
        loginPage.enterpassword("admin123");
        loginPage.clickonloginbutton();
        homePage.clickonadmintab();
        String expected="System Users";
        String actual=viewSystemUsersPage.gettexttousersystem();
        Assert.assertEquals(expected,actual);
        viewSystemUsersPage.clickonaddbutton();
        String expectedtext1="Add User";
        String actualtext= addUserPage.verifyaddusertext();
        Assert.assertEquals(expectedtext1,actualtext);
        addUserPage.dropdownonusername(1);
        addUserPage.enteremployname("Ananya Dash");
        addUserPage.enterusername("ananya");
        addUserPage.dropdownonsatues(3);
        loginPage.enterpassword("123456");
        viewSystemUsersPage.enteronsavebutton();


    }
    @Test(groups = "sanity")
    public void searchTheUserCreatedAndVerifyIt(){
        loginPage.enterusername("Admin");
        loginPage.enterpassword("admin123");
        loginPage.clickonloginbutton();
        homePage.clickonadmintab();
        String expected="System Users";
        String actual=viewSystemUsersPage.gettexttousersystem();
        Assert.assertEquals(expected,actual);
        addUserPage.enterusername("aayansh");
        addUserPage.enteremployname("admin");
        addUserPage.dropdownonsatues(3);
        viewSystemUsersPage.clickonserchbutton();
    }
    @Test(groups = {"sanity","smoke",})
    public void verifyThatAdminShouldDeleteTheUserSuccessFully(){
        loginPage.enterusername("Admin");
        loginPage.enterpassword("admin123");
        loginPage.clickonloginbutton();
        homePage.clickonadmintab();
        String expected="System Users";
        String actual=viewSystemUsersPage.gettexttousersystem();
        Assert.assertEquals(expected,actual);
        addUserPage.enterusername("ayaansh");
        addUserPage.enteremployname("admin");
        addUserPage.dropdownonsatues(3);
        viewSystemUsersPage.clickonserchbutton();
        viewSystemUsersPage.clickondeletebutton();
    }
    @Test(groups = {"sanity","smoke"})
    public void searchTheDeletedUserAndVerifyTheMessageNoRecordFound(){
        loginPage.enterusername("Admin");
        loginPage.enterpassword("admin123");
        loginPage.clickonloginbutton();
        homePage.clickonadmintab();
        String expected="System Users";
        String actual=viewSystemUsersPage.gettexttousersystem();
        Assert.assertEquals(expected,actual);
        addUserPage.enterusername("aayansh");
        addUserPage.enteremployname("admin");
        addUserPage.dropdownonsatues(3);
        viewSystemUsersPage.clickonserchbutton();

    }



}
