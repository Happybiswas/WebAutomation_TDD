package homePageTest;

import common.WebAPI;
import homepage.LoginPage;
import homepage.PricingIRAAccount;
import homepage.TDAmeritradeHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import reporting.TestLogger;

import java.io.IOException;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

public class HomePageTest extends WebAPI {
    TDAmeritradeHomePage homePage;
    LoginPage homepage1;
    PricingIRAAccount homepage2;


    @BeforeMethod
    public void getInit() {
        //The initElement used to initialize the web element
        //Page Factory is a class provided by Selenium WebDriver to support Page Object Design patterns.
        // In Page Factory, testers use @FindBy annotation. The initElements method is used to initialize web elementsPage Factory is a class provided by Selenium WebDriver to support Page Object Design patterns. In Page Factory,
        // testers use @FindBy annotation. The initElements method is used to initialize web elements
        homePage = PageFactory.initElements(driver, TDAmeritradeHomePage.class);
        homepage1 = PageFactory.initElements(driver, LoginPage.class);
        homepage2 = PageFactory.initElements(driver, PricingIRAAccount.class);
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);


    }

    @Test(enabled = true)
    public void testpricingBoxSelected() throws InterruptedException {
        homePage.pricingSelected();
        String expectedText = "Pricing";
        String actualText = homePage.StocksLocatorText.getText();
        Assert.assertEquals(actualText, expectedText, "product does not match");

    }

    @Test(enabled = false)
    public void testOpenAccount() throws InterruptedException {
        //homePage.OpenAccount();
        String expectedText = "Prefix (optional)";
        String actualText = homePage.prefixLocatorText.getText();
        Assert.assertEquals(actualText, expectedText, "product does not match");
        TestLogger.log("AccountSet Up is succesful");

    }

    @Test(enabled = false)
    @Parameters({"FirstName", "LastName"})
    public void testAccountSetup(String FName, String LName) throws InterruptedException, SQLException, IOException, ClassNotFoundException {
        homePage.AccountSetup(FName, LName);
        String expectedText = "What you need:";
        String actualText = homePage.WhatDoYouNeedLocatortext.getText();
        Assert.assertEquals(actualText, expectedText, "product does not match");
        // SoftAssert softAssertion= new SoftAssert();
        //softAssertion.assertTrue(false);
        // softAssertion.assertTrue(true,"the test case is pass ");


    }

    @Test(enabled = false)
    //@Test(dataProvider = "getData")
    public void testLoginBox(String userNAME, String Password) throws InterruptedException {
        homepage1.LoginBox(userNAME, Password);
        String expectedText = "Secure Log-in";
        String actualText = homepage1.SecureLog_inText.getText();
        Assert.assertEquals(actualText, expectedText, "product does not match");
        //return data;
        TestLogger.log("test is successful");
    }

    @DataProvider
    public Object[][] getData() {
        Object[][] data = new Object[4][2];
        //1st set
        data[0][0] = "Happy";
        data[0][1] = "1234";
        //2st set
        data[1][0] = "Tapan";
        data[1][1] = "20344";
        //3st set
        data[2][0] = "Anindya";
        data[2][1] = "52480";
        //3st set
        data[3][0] = "lipe";
        data[3][1] = "52470";

        return data;
    }

    @Test(enabled = false)
    public void testElements() {
        homepage1.elementList();
        String expectedText = "Need Login Help?";
        String actualText = homepage1.MainHeaderText.getText();
        Assert.assertEquals(actualText, expectedText, "product does not match");

    }
// database connection

    @Test(enabled = false)
    public void testIraAccountOpen() throws InterruptedException {
        homepage2.IraAccountOpen();
        String expectedText = "Welcome! Let's  open a traditional IRA.";
        String actualText = homepage2.WelcomeLetsAccount.getText();
        Assert.assertEquals(actualText, expectedText, "product does not match");


    }
    @Test(enabled = false)
    public void testbrokenLink() throws IOException, InterruptedException {
        homepage1.brokenLink();
        //String expectedText = "Languages";
        //String actualText =homepage1.Lookingforgudience.getText();
      // Assert.assertEquals(actualText, expectedText, "product does not match");
    }
}