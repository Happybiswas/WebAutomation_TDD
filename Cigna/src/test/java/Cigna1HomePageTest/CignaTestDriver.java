package Cigna1HomePageTest;

import Cigna1HomePage.CignaPage;
import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.sql.SQLException;

public class CignaTestDriver extends WebAPI {
    CignaPage cignaPage;

    @BeforeMethod
    public void getInit() {

        cignaPage = PageFactory.initElements(driver, CignaPage.class);


    }

    @Test(enabled = false)
    public void testindividualAndFamilyCase() throws InterruptedException {
        cignaPage.individualAndFamilyCase();
        String expectedText = "Popular Insurance Articles";
        String actualText = cignaPage.PopularInsuranceArticlesText.getText();
        Assert.assertEquals(actualText, expectedText, "product does not match");

    }

    @Test(enabled = false)
    public void testcommonInsurancePlaneTypeCase() throws InterruptedException {
        testindividualAndFamilyCase();
        cignaPage.commonInsurancePlaneTypeCase();
        String expectedText = "Get help choosing between an HMO, EPO, and PPO plan.";
        String actualText = cignaPage.GetHelpChoosingBetweenAndHmo.getText();
        Assert.assertEquals(actualText, expectedText, "product does not match");

    }

    @Test(enabled = false)
    public void testanHmoIsRightForYou() throws InterruptedException {
        testcommonInsurancePlaneTypeCase();
        cignaPage.anHmoIsRightForYou();
        String expectedText = "What’s the Difference Between HMO and PPO Plans";
        String actualText = cignaPage.WhatIsdifferentBetweenHmoAndPpo.getText();
        Assert.assertEquals(actualText, expectedText, "product does not match");

    }


    @Test(enabled = false)
    public void testbackToUnderstandingInsurance() throws InterruptedException {
        testanHmoIsRightForYou();
        cignaPage.backToUnderstandingInsurance();
        String expectedText = "Understanding Insurance";
        String actualText = cignaPage.UnderstandingInsuranceText.getText();
        Assert.assertEquals(actualText, expectedText, "product does not match");
    }

    @Test(enabled = false)
    public void testexploreGlocery() throws InterruptedException {
        testbackToUnderstandingInsurance();
        cignaPage.exploreGlocery();
        String expectedText = "Search terms by:";
        String actualText = cignaPage.SearchTermBByText.getText();
        Assert.assertEquals(actualText, expectedText, "product does not match");

    }

    @Test(enabled = false)
    public void testcategoryclaimAndPaymentpharmacy() throws InterruptedException {
        testexploreGlocery();
        cignaPage.categoryclaimAndPaymentpharmacy();
        String expectedText = "brand name drug";
        String actualText = cignaPage.SearchTermBByText.getText();
        Assert.assertEquals(actualText, expectedText, "product does not match");
    }
//database connection
    @Test(enabled = true)
    public void testCutomerLoginCigna() throws InterruptedException, SQLException, IOException, ClassNotFoundException {
        cignaPage.CutomerLoginCigna();
        String expectedText = "Customer Login";
        String actualText = cignaPage.gettingcustomerLoginText.getText();
        Assert.assertEquals(actualText, expectedText, "product does not match");

    }

    @Test(enabled = false)
    public void testRegisterCigna() throws InterruptedException {
        cignaPage.RegisterCigna();
        String expectedText = "Activate your myCigna account";
        String actualText = cignaPage.ActiveMyCignaAccounttext.getText();
        Assert.assertEquals(actualText, expectedText, "product does not match");

    }

    @Test(enabled = false)
    public void testHealthInsuranceforIndividualesandFamilies() throws InterruptedException {

       cignaPage.HealthInsuranceforIndividualesandFamilies();
        String expectedText = "Health Plans by State";
        String actualText = cignaPage.HealthPlaneByStatetext.getText();
        Assert.assertEquals(actualText, expectedText, "product does not match");


    }
    @Test(enabled = true)
    public void testSelectStateDropDownBox() throws InterruptedException {

        cignaPage.SelectStateDropDownBox();
        String expectedText ="Select a State";
        String actualText = cignaPage.selectStategettext.getText();
        Assert.assertEquals(actualText, expectedText, "product does not match");

    }
    @Test(enabled = true)
    public void testSelectcountryDropDownBox() throws InterruptedException{
       cignaPage.SelectcountryDropDownBox();
        String expectedText ="Health Insurance Plans in Maricopa, Arizona";
        String actualText = cignaPage.HealthInsurancePlaneInMaricopatext.getText();
        Assert.assertEquals(actualText, expectedText, "product does not match");
    }

    @Test(enabled = false)
    public void testMarketPlacePlanelevelAndFeatures() throws InterruptedException {

        cignaPage.MarketPlacePlanelevelAndFeatures();
        String expectedText ="Our most popular plans come in three categories: Bronze, Silver, and Gold, also called “metal levels.”";
        String actualText = cignaPage.MarketPlacePlaneLevelclickthengetTextPage.getText();
        Assert.assertEquals(actualText, expectedText, "product does not match");
    }

    @Test(enabled = false)
    public void testFindDoctorDentistFacility() throws InterruptedException {

        cignaPage.FindDoctorDentistFacility();

        String expectedText ="Employer or School";
        String actualText = cignaPage.EmployeSchooltextfromImage.getText();
        Assert.assertEquals(actualText, expectedText, "product does not match");
    }


    //cigna International
    @Test(enabled = false)
    public void testCignaInterNational() throws InterruptedException {
        cignaPage.CignaInterNational();
        String expectedText ="Truly global health solutions.";
        String actualText = cignaPage.TruelyGlobalHealthSolitionText.getText();
        Assert.assertEquals(actualText, expectedText, "product does not match");

    }



    }

