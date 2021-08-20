package CapHomePageTest;

import CapHomePage.CapitalOnepage;
import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.io.IOException;
import java.sql.SQLException;

public class CapitalOneTestPage extends WebAPI {
    CapitalOnepage capitalOnepage;

    @BeforeMethod
    public void getInit() {
        capitalOnepage = PageFactory.initElements(driver, CapitalOnepage.class);
    }
    @Test(enabled = false)
    public void testAutoLoanMouseHoover() throws InterruptedException {
        //call the method here
        capitalOnepage.AutoLoanMouseHoover();
        String expectedText = "Get Pre-qualified";
        String actualText = capitalOnepage.FindTheRightCarText.getText();
        Assert.assertEquals(actualText, expectedText, "product does not match");
    }
    @Test(enabled = true)
    public void testCapSingIn() throws InterruptedException, SQLException, ClassNotFoundException, IOException {
        //testAutoLoanMouseHoover();
        capitalOnepage.CapSingIn();
        String expectedText = "Sign In";
        String actualText = capitalOnepage.signIngetText.getText();
        Assert.assertEquals(actualText, expectedText, "product does not match");
    }
    @Test(enabled = false)
    public void testCreditCardMouseHoover() throws InterruptedException {
        capitalOnepage.CreditCardMouseHoover();
        String expectedText = "TYPES OF CREDIT CARDS";
        String actualText = capitalOnepage.TypeOfcreditCardText.getText();
        Assert.assertEquals(actualText, expectedText, "product does not match");
    }

    @Test(enabled = false)
    public void testTravelRewardCardCase() throws InterruptedException {
        //testCreditCardMouseHoover();
        capitalOnepage.TravelRewardCardCase();
        String expectedText = "Travel & Miles Rewards";
        String actualText = capitalOnepage.TravelAndMilesRewardText.getText();
        Assert.assertEquals(actualText, expectedText, "product does not match");
    }
    @Test(enabled =false)
    public void testVentureRewardsCard() throws InterruptedException {
        //testTravelRewardCardCase();
        capitalOnepage.VentureRewardsCard();
        String expectedText = "Earn 60,000 Bonus Miles";
        String actualText = capitalOnepage.EarnBonustext.getText();
        Assert.assertEquals(actualText, expectedText, "product does not match");
    }
    @Test(enabled =false)
    public void YourCreditScoreWorthProtecting() throws InterruptedException {
        capitalOnepage.YourCreditScoreWorthProtecting();
        String expectedText = "Featured Content";
        String actualText = capitalOnepage.FeatureContainText.getText();
        Assert.assertEquals(actualText, expectedText, "product does not match");
    }


}