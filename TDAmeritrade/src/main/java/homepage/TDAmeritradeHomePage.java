package homepage;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import reporting.TestLogger;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import static homepage.TDAmeritradeWebElement.*;

public class TDAmeritradeHomePage extends WebAPI {
    @FindBy(how = How.XPATH, using = PricingLocator) public WebElement PricingLocatorclick;
    @FindBy(how = How.XPATH, using = StocksLocator) public WebElement StocksLocatorText;
    @FindBy(how = How.XPATH, using = openNewAccountLinkLocator) public WebElement openNewAccountLinkLocatorclick;
    @FindBy(how = How.XPATH, using = iNdividualLocator) public WebElement iNdividualLocatorclick;
    @FindBy(how = How.XPATH, using = openWithIndividualLocator) public WebElement openWithIndividualLocatorclick;
    @FindBy(how = How.XPATH, using = prefixLocator) public WebElement prefixLocatorText;
    @FindBy(how = How.XPATH, using = prefixSelectLocator) public WebElement prefixSelectLocatordropdown;
    @FindBy(how = How.XPATH, using = FristNameLocator) public WebElement FristNameSendKey;
    @FindBy(how = How.XPATH, using = LastNameLocator) public WebElement LastNameSendKey;
    @FindBy(how = How.XPATH, using = suffixSelectorLocator) public WebElement suffixSelectorSelect;
    @FindBy(how = How.XPATH, using = EmailAddressLocator) public WebElement EmailAddressSend;
    @FindBy(how = How.XPATH, using = SelectCountryLocator) public WebElement SelectCountry;
    @FindBy(how = How.XPATH, using = StreetAddressLocator) public WebElement StreetAddress;
   // @FindBy(how = How.XPATH, using = AptLocator) public WebElement AptSend;
    @FindBy(how = How.XPATH, using = cityLocator) public WebElement citySendKey;
    @FindBy(how = How.XPATH, using = SelectStateLocator) public WebElement SelectState;
    @FindBy(how = How.XPATH, using = SelectSZipCodeLocator) public WebElement SelectSZipCode;
    @FindBy(how = How.XPATH, using = PhoneNumLocator) public WebElement PhoneNum;
    @FindBy(how = How.XPATH, using = ReadTdAmertradecheckboxLocator) public WebElement ReadTdAmertradecheckbox;
    @FindBy(how = How.XPATH, using = continueToPersonalInformationLocator) public WebElement continueToPersonalInformation;
    @FindBy(how = How.XPATH, using = WhatDoYouNeedLocator) public WebElement WhatDoYouNeedLocatortext;

  // driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

    public void pricingSelected() throws InterruptedException {
        PricingLocatorclick.click();
        //Thread.sleep(2000);
       // driver.manage().deleteAllCookies();
        StocksLocatorText.getText();
       // cancelAlert();
        System.out.println(StocksLocatorText.getText());

    }
//    public void OpenAccount() throws InterruptedException {
//        //pricingSelected();
//        openNewAccountLinkLocatorclick.click();
//       // Thread.sleep(2000);
//        iNdividualLocatorclick.click();
//        // cancelAlert();
//        openWithIndividualLocatorclick.click();
//      //  Thread.sleep(2000);
//        prefixLocatorText.getText();
//        System.out.println(prefixLocatorText.getText());
//
//    }
    // this is account setup method
//    @Parameters({"FirstName","LastName"})
//    public void AccountSetup(String FName,String LName) throws InterruptedException {
//
//        openNewAccountLinkLocatorclick.click();
//
//        iNdividualLocatorclick.click();
//        // cancelAlert();
//        openWithIndividualLocatorclick.click();
//
//        Select select = new Select(prefixSelectLocatordropdown);
//        select.selectByVisibleText("Mr");
//        //Thread.sleep(2000);
//        FristNameSendKey.sendKeys(FName);
//       // Thread.sleep(2000);
//        LastNameSendKey.sendKeys(LName);
//        //Thread.sleep(2000);
//        Select select1 = new Select(suffixSelectorSelect);
//        select1.selectByIndex(2);
//        //Thread.sleep(2000);
//        EmailAddressSend.sendKeys("hbiswas@yahoo.com");
//        //Thread.sleep(2000);
//        Select select2 = new Select(SelectCountry);
//        select2.selectByVisibleText("United States");
//        StreetAddress.sendKeys("408,Elton Fram circle");
//        //AptSend.sendKeys("55");
//       // Thread.sleep(2000);
//        citySendKey.sendKeys("Glens Mills");
//        //Thread.sleep(4000);
//        Select select3 = new Select(SelectState);
//        select3.selectByVisibleText("PA - Pennsylvania");
//
//        SelectSZipCode.sendKeys("19342");
//        Thread.sleep(2000);
//
//
//        PhoneNum.sendKeys("654-335-6447");
//        //WebAPI.waitUntilClickAble( ReadTdAmertradecheckboxLocator);
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        wait.until(ExpectedConditions.elementToBeClickable(ReadTdAmertradecheckbox));
//        //ReadTdAmertradecheckbox.click();
//        //WebElement element =
//        WhatDoYouNeedLocatortext.getText();
//        System.out.println(WhatDoYouNeedLocatortext.getText());
//
//        //TestLogger.log("AccountSet Up is succesful");
//    }
public void AccountSetup(String FName,String LName) throws InterruptedException, SQLException, IOException, ClassNotFoundException {

    Connection conn = DataSource.connectToSqlServerDatabase();

    openNewAccountLinkLocatorclick.click();

    iNdividualLocatorclick.click();
    // cancelAlert();
    openWithIndividualLocatorclick.click();

    Select select = new Select(prefixSelectLocatordropdown);
    select.selectByVisibleText("Mr");
    //Thread.sleep(2000);
    FristNameSendKey.sendKeys(FName);
    // Thread.sleep(2000);
    LastNameSendKey.sendKeys(LName);
    //Thread.sleep(2000);
    Select select1 = new Select(suffixSelectorSelect);
    select1.selectByIndex(2);
    //Thread.sleep(2000);
    EmailAddressSend.sendKeys("hbiswas@yahoo.com");
    //Thread.sleep(2000);
    Select select2 = new Select(SelectCountry);
    select2.selectByVisibleText("United States");
    StreetAddress.sendKeys("408,Elton Fram circle");
    //AptSend.sendKeys("55");
    // Thread.sleep(2000);
    citySendKey.sendKeys("Glens Mills");
    //Thread.sleep(4000);
    Select select3 = new Select(SelectState);
    select3.selectByVisibleText("PA - Pennsylvania");

    SelectSZipCode.sendKeys("19342");
    Thread.sleep(2000);


    PhoneNum.sendKeys("654-335-6447");
    //WebAPI.waitUntilClickAble( ReadTdAmertradecheckboxLocator);
    WebDriverWait wait = new WebDriverWait(driver, 10);
    wait.until(ExpectedConditions.elementToBeClickable(ReadTdAmertradecheckbox));
    //ReadTdAmertradecheckbox.click();
    //WebElement element =
    WhatDoYouNeedLocatortext.getText();
    System.out.println(WhatDoYouNeedLocatortext.getText());

    //TestLogger.log("AccountSet Up is succesful");
}



//  Database Connection In capitalOne login
//
//    public void CapSingIn() throws InterruptedException, ClassNotFoundException, SQLException, IOException {
//        Connection conn = DataSource.connectToSqlDatabase();
//        String query = "SELECT * FROM emloyee_db.chase_emp where emp_id = 102";
//        // create a statement
//        Statement st = conn.createStatement();
//        //result set
//        ResultSet rs = st.executeQuery(query);
//        while (rs.next()) {
//            rs.getString("emp_Firstname");
//            addusername.sendKeys( rs.getString("emp_Firstname"));
//            rs.getString("emp_password");
//            addPasswpord.sendKeys(rs.getString("emp_password"));
//            System.out.println(rs.getString("emp_Firstname"));
//            System.out.println(rs.getString("emp_password"));
//        }
//        Thread.sleep(1000);
//        signIngetText.getText();
//        System.out.println(signIngetText.getText());
//    }
}
