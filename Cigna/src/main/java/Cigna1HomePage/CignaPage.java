package Cigna1HomePage;

import common.WebAPI;
import databases.ConnectToSqlDB;
import databases.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static Cigna1HomePage.CignaWebElement.*;
import static databases.ConnectToSqlDB.connectToSqlDatabase;

public class CignaPage extends WebAPI {
    CignaPage cignaPage;
        //First testcase
            @FindBy(how = How.XPATH, using = individualAndFamilies) public WebElement individualAndFamily;
            @FindBy(how = How.XPATH, using = understandingInsurance) public WebElement understandingInsuranceBox;
            @FindBy(how = How.XPATH, using = PopularInsuranceArticles) public WebElement PopularInsuranceArticlesText;
            //2nd test case
            @FindBy(how = How.XPATH, using = commonInsurancePlaneType) public WebElement commonInsurancePlaneTypebox;
            @FindBy(how = How.XPATH, using = GetHelpChoosingBetween) public WebElement GetHelpChoosingBetweenAndHmo;
            //3rd case
            @FindBy(how = How.CSS, using = AnHmoIsRightForYou) public WebElement AnHmoIsRightForYoulink;
            @FindBy(how = How.XPATH, using = WhatIsdifferentBetweenHmoPpo) public WebElement WhatIsdifferentBetweenHmoAndPpo;
            //4th case
            @FindBy(how = How.XPATH, using = BackToUnderstandingInsuranceLink) public WebElement BackToUnderstandingInsuranceLinkText;
            @FindBy(how = How.XPATH, using = UnderstandingInsurance) public WebElement UnderstandingInsuranceText;
            //5th
            @FindBy(how = How.XPATH, using = exploreGlocery) public WebElement exploreGloceryButton;
            @FindBy(how = How.XPATH, using = SearchTermBBy) public WebElement SearchTermBByText;
            //6th
            @FindBy(how = How.XPATH, using = Category) public WebElement CategoryType;
            //@FindBy(how = How.XPATH, using = claimAndPayment) public WebElement claimAndPaymentRadioButton;
            @FindBy(how = How.XPATH, using = pharmacy) public WebElement pharmacyButton;
            @FindBy(how = How.XPATH, using = BrandDrugName) public WebElement BrandDrugNameText;
            //log in to my Cigna
            @FindBy(how = How.XPATH, using = UserName) public WebElement UserNameSend;
            @FindBy(how = How.XPATH, using = Password) public WebElement PasswordSend;
            //@FindBy(how = How.ID, using = LogIn) public WebElement LogInButton;
            @FindBy(how = How.ID, using = customerLoginText) public WebElement gettingcustomerLoginText;
            //Register
            @FindBy(how = How.XPATH, using = LogInToMyCigna) public WebElement LogInToMyCignaButton;
            @FindBy(how = How.ID, using = register) public WebElement registerCigna;
            @FindBy(how = How.ID, using = ActiveMyCignaAccount) public WebElement ActiveMyCignaAccounttext;
            //Health insurance for individuales and families
            @FindBy(how = How.XPATH, using = IndividualesFamilies) public WebElement InsuranceIndividualesFamilies;
            @FindBy(how = How.XPATH, using = HealthPlaneByState) public WebElement HealthPlaneByStatetext;
            //select drop Down state
            @FindBy(how = How.XPATH, using = SelectState) public WebElement SelectStateBox;
            @FindBy(how = How.XPATH, using = selectStatestate) public WebElement selectStategettext;
            //select country dropdown Button
            @FindBy(how = How.XPATH, using = SelectCountry) public WebElement SelectCountrybox;
            @FindBy(how = How.XPATH, using = seePlane) public WebElement seePlaneBOX;
            @FindBy(how = How.XPATH, using = HealthInsurancePlaneInMaricopa) public WebElement HealthInsurancePlaneInMaricopatext;
            //MarketPlace plane level and features
            @FindBy(how = How.XPATH, using = MarketPlacePlaneLevel) public WebElement MarketPlacePlaneLevelclick;
            @FindBy(how = How.XPATH, using = MarketPlacePlaneLevelclickthengetText) public WebElement MarketPlacePlaneLevelclickthengetTextPage;
            @FindBy(how = How.XPATH, using = FindDoctor) public WebElement FindDoctorBox;
            @FindBy(how = How.XPATH, using = EmployeSchool) public WebElement EmployeSchooltextfromImage;
            //cigna International
            @FindBy(how = How.XPATH, using = CignaInternational) public WebElement CignaInternationalbutton;
            @FindBy(how = How.XPATH, using = TruelyGlobalHealthSolition) public WebElement TruelyGlobalHealthSolitionText;


    //MouseHoover Over
    public void individualAndFamilyCase() throws InterruptedException {
        Actions action = new Actions(driver);
        action.moveToElement(individualAndFamily).build().perform();
        //Thread.sleep(2000);
        understandingInsuranceBox.click();
        Thread.sleep(2000);
        PopularInsuranceArticlesText.getText();

    }
    public void commonInsurancePlaneTypeCase() throws InterruptedException {
        commonInsurancePlaneTypebox.click();
        Thread.sleep(2000);
        GetHelpChoosingBetweenAndHmo.getText();
    }
    public void anHmoIsRightForYou() throws InterruptedException {

        AnHmoIsRightForYoulink.click();
        Thread.sleep(2000);
        WhatIsdifferentBetweenHmoAndPpo.getText();
    }
    public void backToUnderstandingInsurance() throws InterruptedException {
        BackToUnderstandingInsuranceLinkText.click();
        Thread.sleep(2000);
        UnderstandingInsuranceText.getText();
    }
    public void exploreGlocery() throws InterruptedException {
        exploreGloceryButton.click();
        Thread.sleep(2000);
        SearchTermBByText.getText();
    }
    public void categoryclaimAndPaymentpharmacy() throws InterruptedException {
        exploreGlocery();
        CategoryType.click();
        Thread.sleep(2000);
        //claimAndPaymentRadioButton.click();
        //Thread.sleep(2000);
        pharmacyButton.click();
        Thread.sleep(2000);
        BrandDrugNameText.getText();
    }
    public void CutomerLoginCigna() throws InterruptedException, SQLException, IOException, ClassNotFoundException {
        //ArrayList<String> list= ConnectToSqlDB.readUserProfileFromSqlTable1();
        //Thread.sleep(2000);
        LogInToMyCignaButton.click();
        Thread.sleep(2000);
        UserNameSend.sendKeys("happy");
        PasswordSend.sendKeys("emp_password");
        //LogInButton.click();
        Thread.sleep(2000);
        gettingcustomerLoginText.getText();
    }
    public void RegisterCigna() throws InterruptedException {
        LogInToMyCignaButton.click();
        Thread.sleep(1000);
        registerCigna.click();
        Thread.sleep(1000);
        ActiveMyCignaAccounttext.getText();
    }
    public void HealthInsuranceforIndividualesandFamilies() throws InterruptedException {

        InsuranceIndividualesFamilies.click();
        Thread.sleep(2000);
        HealthPlaneByStatetext.getText();
    }
    //select drop Down state
    public void SelectStateDropDownBox() throws InterruptedException{
        HealthInsuranceforIndividualesandFamilies();
        Thread.sleep(2000);
        Select State = new Select(SelectStateBox);
        State.selectByVisibleText("Arizona");
        State.selectByIndex(1);
        Thread.sleep(3000);
        selectStategettext.getText();
    }
    //select drop Down country
    public void SelectcountryDropDownBox() throws InterruptedException{

        SelectStateDropDownBox();
        Select State = new Select(SelectCountrybox);
        State.selectByVisibleText("Maricopa");
        //State.getAllSelectedOptions();
        State.selectByIndex(1);
        Thread.sleep(3000);
        seePlaneBOX.click();
        Thread.sleep(3000);
        HealthInsurancePlaneInMaricopatext.getText();
    }
    public void MarketPlacePlanelevelAndFeatures() throws InterruptedException{
        SelectcountryDropDownBox();
        MarketPlacePlaneLevelclick.click();
        Thread.sleep(3000);
        MarketPlacePlaneLevelclickthengetTextPage.getText();
    }
    public void FindDoctorDentistFacility() throws InterruptedException {
        FindDoctorBox.click();
        Thread.sleep(3000);
        EmployeSchooltextfromImage.getText();
    }
        //cigna International
        public void CignaInterNational() throws InterruptedException {
            CignaInternationalbutton.click();
            Thread.sleep(3000);
            TruelyGlobalHealthSolitionText.getText();
    }




    }