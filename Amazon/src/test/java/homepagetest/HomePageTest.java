package homepagetest;

import com.relevantcodes.extentreports.LogStatus;
import common.WebAPI;
import databases.ConnectToSqlDB;
import homepage.DataSource;
import homepage.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import reporting.ExtentTestManager;

import java.io.IOException;
import java.sql.Connection;


public class HomePageTest extends WebAPI {

    HomePage homePage;

    @BeforeMethod
    public void getInit() {

        homePage = PageFactory.initElements(driver, HomePage.class);
    }

    @Test(enabled = false)
    public void testSearchBox() throws InterruptedException {
        homePage.searchBox();
        String expectedText = "\"Mask\"";
        String actualText = homePage.searchText.getText();
        Assert.assertEquals(actualText, expectedText, "product does not match");


    }

    //its working
    @Test(enabled = true)

    public void testclickAllSearchButton() throws InterruptedException {
        // checkSearchBox();
        homePage.clickAllSearchButton();
        String expectedText = "Trending";
        String actualText = homePage.TrendingText.getText();
        Assert.assertEquals(actualText, expectedText, "page does not match");
    }

    @Test(enabled = true)
    public void testNewRelaeaseFromAllsearch() throws InterruptedException {
        homePage.NewRelaeaseFromAllsearch();
        String expectedText = "Video Games";
        String actualText = homePage.VideoGametext.getText();
        Assert.assertEquals(actualText, expectedText, "page does not match");
        SoftAssert softAssertion= new SoftAssert();
        //softAssertion.assertTrue(false);
        softAssertion.assertTrue(true,"the test case is pass ");
    }

    @Test(enabled = false)
    public void testClickOnFashionTab() throws InterruptedException {
        //calling this method with method name
        homePage.ClickOnFashionTab();
        String expectedText = "SweatyRocks Women's Short Sleeve Deep V Neck Self Tie Front Crop Top Blouse";
        String actualText = homePage.SwetyRockWomanShorttext.getText();
        Assert.assertEquals(actualText, expectedText, "page does not match");
    }

    @Test(enabled = false)
    public void testClickOnFashionSecondTab() throws InterruptedException {
        //calling this method with method name
        homePage.ClickOnFashionSecondTab();
        String expectedText = "Shop by category";
        String actualText = homePage.ShopByCategoryText.getText();
        Assert.assertEquals(actualText, expectedText, "page does not match");
    }

    //working
    @Test(enabled = false)
    public void testClickSingInEmail() throws InterruptedException {

        homePage.ClickSingInEmail();
        String expectedText = "Sign-In";
        String actualText = homePage.SingInButtonTextGet.getText();
        Assert.assertEquals(actualText, expectedText, "page does not match");
    }
    //working
    @Test(enabled = true)
    public void testSendKeyOnEmail() throws InterruptedException, IOException {
        // homePage.ClickSingInEmail();
        homePage.SendKeyOnEmail();
        String expectedText = "There was a problem";
        String actualText = homePage.problemMessagetext.getText();
        Assert.assertEquals(actualText, expectedText, "page does not match");

    }
    //create an AmazonAccount
    @Test(enabled = false)
    public void testcreateAccount() throws InterruptedException, IOException {
        homePage.createAccount();
        String expectedText = "Create account";
        String actualText = homePage.createAccounttext.getText();
        Assert.assertEquals(actualText, expectedText, "page does not match");
    }
//    @Test(enabled = true)
//    public void testprovideAccountInformation() throws Exception {
//
//        homePage.provideAccountInformation();
//        String expectedText = "Create account";
//        String actualText = homePage.createAccounttext.getText();
//        Assert.assertEquals(actualText, expectedText, "page does not match");
//
//    }
    @Test(enabled = false)
    public void testToysAndGameFram() throws InterruptedException {
        homePage.ToysAndGameFram();
        String expectedText = "Shopping Cart";
        String actualText = homePage.shoppingCartText.getText();
        Assert.assertEquals(actualText, expectedText, "page does not match");
    }

    @Test(enabled = true)
    public void radiobuttonflag() throws InterruptedException {

        homePage.radiobuttonflag();
        String expectedText = "You are shopping on Amazon.com.";
        String actualText = homePage.AmazoncomText.getText();
        Assert.assertEquals(actualText, expectedText, "page does not match");
    }
    @Test(enabled = false)
    public void testReturnandorderMethod() throws InterruptedException {
        homePage.ReturnandorderMethod();
        String expectedText = "New to Amazon?";
        String actualText = homePage.NewToAmazonText.getText();
        Assert.assertEquals(actualText, expectedText, "page does not match");
    }

    @Test(enabled = false)
    public void testlistofElementsinAllSelectItem() throws InterruptedException {

        homePage.listofElementsinAllSelectItem();
        String expectedText = "All Departments";
        String actualText = homePage.listofElementsinAllCollect.getText();
        Assert.assertEquals(actualText, expectedText, "page does not match");
    }
    @Test(enabled = false)
    public void testgetDataFromDB() throws InterruptedException, IOException {

        homePage.createAccount();
        String expectedText = "Create account";
        String actualText = homePage.createAccounttext.getText();
        Assert.assertEquals(actualText, expectedText, "page does not match");

    }
      // connect with xlsx
    @Test(enabled = false)
        public void testprovideAccountInformation() throws Exception {
      homePage.provideAccountInformation();
        String expectedText = "Create account";
        String actualText = homePage.createAccounttext.getText();
        Assert.assertEquals(actualText, expectedText, "page does not match");

    }
    @Test(enabled = false)
    public void testAllSearchBoxSelected() throws InterruptedException {
        homePage.AllSearchBoxSelected();
        String expectedText = "Appliances";
        String actualText = homePage.ListOFAllElementLocatorTextSelect.getText();
        Assert.assertEquals(actualText, expectedText, "page does not match");
    }



}
