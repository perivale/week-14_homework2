package gov.uk.check.visa.testsuite;

import gov.uk.check.visa.pages.*;

import gov.uk.check.visa.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VisaConfirmationTest extends TestBase {
    StartPage startPage;
    ReasonForTravelPage reasonForTravelPage;
    SelectNationalityPage selectNationalityPage;
    ResultPage resultPage;
    DurationOfStayPage durationOfStayPage;
    WorkTypePage workTypePage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        startPage = new StartPage();
        selectNationalityPage = new SelectNationalityPage();
        reasonForTravelPage = new ReasonForTravelPage();
        resultPage = new ResultPage();
        durationOfStayPage =new DurationOfStayPage();
        workTypePage=new WorkTypePage();



    }

    @Test(groups = "sanity")
    public void anAustralianCominToUKForTourism() {
        driver.manage().deleteAllCookies();
        startPage.clickStartNow();


    }

    @Test(groups = "sanity")
    public void aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths() {
        startPage.clickoncookies();
        startPage.clickStartNow();






    }

    @Test(groups = "smoke")
    public void aColumbianNationalComingToTheUKToJoinAPartnerForALongStayTheyDoHaveAnArticle10Or20Card() {
        // startPage.clickoncookies();
        startPage.clickStartNow();
        selectNationalityPage.selectNationality("Colombia");
        selectNationalityPage.clickNextStepButton();



    }
}
