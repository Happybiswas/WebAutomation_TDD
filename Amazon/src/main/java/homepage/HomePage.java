package homepage;

import com.mongodb.client.model.geojson.LineString;
import com.relevantcodes.extentreports.LogStatus;
import common.WebAPI;
import databases.ConnectToSqlDB;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import reporting.ExtentTestManager;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static common.WebAPI.*;
import static homepage.HomePageWebElement.*;
import static homepage.HomePageWebElement.searchButtonLocator;

public class HomePage extends WebAPI {
    DataSource dataSource;
    public static ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        // Action Method class
        // Find By Annotation: First Approach
        @FindBy(how = How.ID, using = searchBoxLocator) public WebElement searchBox;
        @FindBy(how = How.ID, using = searchButtonLocator) public WebElement searchButton;
        @FindBy(how = How.XPATH, using = searchTextLocator) public WebElement searchText;
        //Find all button box
        @FindBy(how = How.CSS, using = ClickAllSearch) public WebElement ClickAllSearchButton;
        @FindBy(how = How.XPATH, using = Trending) public WebElement TrendingText;
        @FindBy(how = How.XPATH, using = NewReleases) public WebElement NewReleasesBox;
        @FindBy(how = How.XPATH, using = VideoGame) public WebElement VideoGametext;
        @FindBy(how = How.XPATH, using = Fashion) public WebElement FashionBox;
        @FindBy(how = How.XPATH, using = FashionNavigation) public WebElement FashionNavigationBar;
        @FindBy(how = How.XPATH, using = FashionNavigationrolling) public WebElement FashionNavigationrollingSlide;
        @FindBy(how = How.XPATH, using = SelectImage) public WebElement SelectImageFashion;
        @FindBy(how = How.CLASS_NAME, using = SwetyRockWomanShort) public WebElement SwetyRockWomanShorttext;
        @FindBy(how = How.XPATH, using = Fashion1) public WebElement Fashion1box;
        @FindBy(how = How.XPATH, using = Women) public WebElement WomenBox;
        @FindBy(how = How.XPATH, using = ShopByCategory) public WebElement ShopByCategoryText;
        @FindBy(how = How.XPATH, using = SingInAccountList) public WebElement SingInAccountListBox;
        @FindBy(how = How.XPATH, using = SingInButton) public WebElement SingInButtonClick;
        @FindBy(how = How.XPATH, using = SingInButtonText) public WebElement SingInButtonTextGet;
        // send key for email
        @FindBy(how = How.XPATH, using = SingInsendkey) public WebElement SingInsendkeyEmail;
        @FindBy(how = How.XPATH, using = Continue) public WebElement ContinueButton;
        @FindBy(how = How.CLASS_NAME, using = problemMessage) public WebElement problemMessagetext;
        @FindBy(how = How.XPATH, using = createanAmazonAccount) public WebElement createanAmazonAccountP;
        @FindBy(how = How.XPATH, using = createAccount) public WebElement createAccounttext;
        //Account Creation page
        @FindBy(how = How.XPATH, using = userName) public WebElement userNameSendkey;
        @FindBy(how = How.XPATH, using = userEmail) public WebElement userEmailendkey;
        @FindBy(how = How.XPATH, using = userPassword) public WebElement userPasswordsendKey;
        @FindBy(how = How.XPATH, using = userReEnterPassword) public WebElement userReEnterPasswordSendKey;
        @FindBy(how = How.XPATH, using = gettextCreatAccount) public WebElement gettextCreatAccounttext;
        //toys and game
        @FindBy(how = How.XPATH, using = toysAndGames) public WebElement toysAndGamesBox;
        @FindBy(how = How.XPATH, using = ageRange) public WebElement ageRangeForKids;
        @FindBy(how = How.XPATH, using = nubyIceJelTheeterKey) public WebElement nubyIceJelTheeterKeytoys;
        @FindBy(how = How.XPATH, using = addToCart) public WebElement addToCartToy;
        @FindBy(how = How.XPATH, using = selectCart) public WebElement selectCartForPayment;
        @FindBy(how = How.XPATH, using = shoppingCart) public WebElement shoppingCartText;
        //mouse hoover and   radiobutton flag for usa icon
        @FindBy(how = How.XPATH, using = UsaFlage) public WebElement UsaFlagebutton;
        @FindBy(how = How.XPATH, using = Amazoncom) public WebElement AmazoncomText;
        @FindBy(how = How.ID, using = ReturnAndOrder) public WebElement ReturnAndOrderButton;
        @FindBy(how = How.XPATH, using = NewToAmazon) public WebElement NewToAmazonText;
        @FindBy(how = How.XPATH, using = ClickAllButton) public WebElement ClickAllButtonOn;
        @FindBy(how = How.XPATH, using = listofElementsinAl) public WebElement listofElementsinAllCollect;
    // to get the list Element
        @FindBy(how = How.XPATH, using = SelectAllArrowLocator) public WebElement SelectAllArrowLocatorSelect;
        @FindBy(how = How.XPATH, using = ListOFAllElementLocator) public WebElement ListOFAllElementLocatorSelect;
        @FindBy(how = How.XPATH, using = ListOFAllElementLocatorText) public WebElement ListOFAllElementLocatorTextSelect;


        // to get the list Element
    public void AllSearchBoxSelected() throws InterruptedException {
        SelectAllArrowLocatorSelect.click();
        Thread.sleep(2000);
       getListOfWebElementsByXpath1(ListOFAllElementLocatorSelect);
        //ListOFAllElementLocatorTextSelect.getText();
        System.out.println(ListOFAllElementLocatorTextSelect.getText());
       // ExtentTestManager.getTest().log(LogStatus.PASS, "Test Passed");
    }


    public void searchBox() throws InterruptedException {
        // Enter productName
        searchBox.sendKeys(productName);
        Thread.sleep(3000);
        // Click on searchButton
        searchButton.click();
    }
    public void searchBox1() {
        typeOnElement(searchBoxLocator, "Hand Sanitizer");
        clickOnElement(searchButtonLocator);
    }
    //work all searchButton Rolling
    public void clickAllSearchButton() throws InterruptedException {
        ClickAllSearchButton.click();
        Thread.sleep(2000);
        TrendingText.getText();
    }
    public void NewRelaeaseFromAllsearch() throws InterruptedException {
        clickAllSearchButton();
        NewReleasesBox.click();
        Thread.sleep(2000);
        VideoGametext.getText();
        System.out.println(VideoGametext.getText());
    }
    //this program not working
    public void ClickOnFashionTab() throws InterruptedException {

        FashionBox.click();
        Thread.sleep(1000);
        FashionNavigationBar.click();
        Thread.sleep(1000);
        FashionNavigationrollingSlide.click();
    }
    public void ClickOnFashionSecondTab() throws InterruptedException {
        Fashion1box.click();
        Thread.sleep(4000);
        //CustomersMostLoveText.click();
        ShopByCategoryText.getText();
    }
    // Hello sing in Account And List
    public void ClickSingInEmail() throws InterruptedException {
        Actions action = new Actions(driver);
        action.moveToElement(SingInAccountListBox).build().perform();
        Thread.sleep(1000);
        SingInButtonClick.click();
        Thread.sleep(1000);
        SingInButtonTextGet.getText();
        System.out.println(SingInButtonTextGet.getText());
    }
    //send key on email
    public void SendKeyOnEmail() throws InterruptedException, IOException {
        ArrayList<String> aList= dataSource.getDataFromexcel("Login1");
        System.out.println(aList.get(1));
        System.out.println(aList.get(2));
        System.out.println(aList.get(3));
        Thread.sleep(2000);
        //calling the clickSingInEmail
        ClickSingInEmail();
        Thread.sleep(2000);
        SingInsendkeyEmail.sendKeys(aList.get(2));
        Thread.sleep(1000);
        ContinueButton.click();
        Thread.sleep(2000);
        problemMessagetext.getText();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Test Passed");
    }
    public void createAccount() throws InterruptedException, IOException {
        SendKeyOnEmail();
        Thread.sleep(3000);
        createanAmazonAccountP.click();
        Thread.sleep(1000);
        createAccounttext.getText();
    }
    //toys and game
    public void ToysAndGameFram() throws InterruptedException {
        toysAndGamesBox.click();
        Thread.sleep(2000);
        ageRangeForKids.click();
        Thread.sleep(2000);
        nubyIceJelTheeterKeytoys.click();
        Thread.sleep(2000);
        addToCartToy.click();
        Thread.sleep(2000);
        selectCartForPayment.click();
        Thread.sleep(2000);
        shoppingCartText.getText();
        System.out.println(shoppingCartText.getText());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Test Passed");
    }
    //mouse hoover and   radiobutton flag for usa icon
    public void radiobuttonflag() throws InterruptedException {
        Actions action = new Actions(driver);
        action.moveToElement(UsaFlagebutton).build().perform();
        Thread.sleep(2000);
        AmazoncomText.getText();
    }
    public void ReturnandorderMethod() throws InterruptedException {
        ReturnAndOrderButton.click();
        Thread.sleep(2000);
        NewToAmazonText.getText();
        System.out.println(NewToAmazonText.getText());
    }
    public void listofElementsinAllSelectItem() throws InterruptedException {
        Thread.sleep(2000);
        getListOfWebElementsByXpath(listofElementsinAl);
        Thread.sleep(2000);
        listofElementsinAllCollect.getText();
        System.out.println(listofElementsinAllCollect.getText());
    }
    public void getDataFromDB() throws Exception {
        // String FILE_NAME= "../WebAutomationFrameworkTDD_Team1/Amazon/TestData/testdata.xlsx";
        createAccount();
        Thread.sleep(1000);
        connectToSqlDB = new ConnectToSqlDB();
        List<String> dataList = new ArrayList<String>();
        dataList= connectToSqlDB.readDataBase("chase_emp","emp_FirstName");
       String  name =dataList.get(0);
       // Thread.sleep(2000);
        //userNameSendkey.sendKeys("itemName");
        userNameSendkey.sendKeys(name);
        userEmailendkey.sendKeys("Happydas@gmail.com");
        userPasswordsendKey.sendKeys("12587");
        userReEnterPasswordSendKey.sendKeys("12587");
        Thread.sleep(3000);
        gettextCreatAccounttext.getText();
        System.out.println(gettextCreatAccounttext.getText());
    }
    public void InsertDataToDB() throws Exception {
        DataSource.insertDataIntoDB();
    }
    // read data from xlsx
    public void provideAccountInformation() throws Exception {
        createAccount();
        ArrayList<String> aList= dataSource.getDataFromexcel("Login1");
        System.out.println(aList.get(1));
        System.out.println(aList.get(2));
        System.out.println(aList.get(3));
        Thread.sleep(2000);
        userNameSendkey.sendKeys(aList.get(1));
        userEmailendkey.sendKeys(aList.get(2));
        userPasswordsendKey.sendKeys(aList.get(3));
        userReEnterPasswordSendKey.sendKeys(aList.get(3));
        Thread.sleep(3000);
        gettextCreatAccounttext.getText();
        System.out.println(gettextCreatAccounttext.getText());
    }





    }
