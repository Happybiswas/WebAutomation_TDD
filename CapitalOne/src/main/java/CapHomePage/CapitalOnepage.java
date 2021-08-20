package CapHomePage;
import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import javax.swing.*;
import java.io.IOException;
import java.sql.*;

import static CapHomePage.CapitalOneWebElement.*;

public class CapitalOnepage extends WebAPI {

    DataSource dataSource;
    JavascriptExecutor js = (JavascriptExecutor) driver;

            //mouseHoover overand get text
            @FindBy(how = How.XPATH, using = AutoLoanMouseHoover) public WebElement AutoMouseHoover;
            @FindBy(how = How.XPATH, using = FINDTHERIGHTFINANCING) public WebElement FindRightFinaceText;
            //FindFinanceCarwithAutoavigator link and get text
            @FindBy(how = How.CSS, using = FindFinanceCarwithAutoavigator) public WebElement FindFinanceCarwithAuto;
            @FindBy(how = How.XPATH, using = FindTheRightCar) public WebElement FindTheRightCarText;
            //singIn
            @FindBy(how = How.XPATH, using = UserName) public WebElement addusername;
            @FindBy(how = How.XPATH, using = Password) public WebElement addPasswpord;
            // @FindBy(how= How.XPATH,using = SingIn) public WebElement SingInbutton;
            // @FindBy(how= How.XPATH,using = YouEnterWrongData) public WebElement YouEnterWrong;
            @FindBy(how = How.XPATH, using = signIntext) public WebElement signIngetText;
            //Credit Card
            @FindBy(how = How.XPATH, using = CreditCardMouseHoover) public WebElement CreditCardHoover;
            @FindBy(how = How.XPATH, using = TypeOfcreditCard) public WebElement TypeOfcreditCardText;
            //Travel REward card
            @FindBy(how = How.XPATH, using = TravelRewardCard) public WebElement TravelRewardCardclick;
            @FindBy(how = How.XPATH, using = TravelAndMilesReward) public WebElement TravelAndMilesRewardText;
            //VentureRewards
            @FindBy(how = How.XPATH, using = VentureRewards) public WebElement VentureRewardsCard;
            @FindBy(how = How.XPATH, using = ApplyNowButton) public WebElement ApplyNowButtonclick;
            @FindBy(how = How.XPATH, using = EarnBonus) public WebElement EarnBonustext;
            //Your Credit Score
            @FindBy(how = How.XPATH, using = LearnAndGrow) public WebElement LearnAndGrowTab;
            @FindBy(how = How.XPATH, using = FeatureContain) public WebElement FeatureContainText;

    public void AutoLoanMouseHoover() throws InterruptedException {
        Actions action = new Actions(driver);
        action.moveToElement(AutoMouseHoover).build().perform();
        Thread.sleep(2000);
        FindRightFinaceText.getText();
        System.out.println(FindRightFinaceText.getText());
        Thread.sleep(2000);
        FindFinanceCarwithAuto.click();
        Thread.sleep(2000);
        FindTheRightCarText.getText();
        System.out.println("last page " + FindTheRightCarText);
    }
//  Database Connection In capitalOne login

    public void CapSingIn() throws InterruptedException, ClassNotFoundException, SQLException, IOException {
       Connection conn = dataSource.connectToSqlDatabase();
        String query = "SELECT * FROM emloyee_db.chase_emp where emp_id = 102";
        // create a statement
        Statement st = conn.createStatement();
        //result set
        ResultSet rs = st.executeQuery(query);
        while (rs.next()) {
            rs.getString("emp_Firstname");
            addusername.sendKeys( rs.getString("emp_Firstname"));
            rs.getString("emp_password");
            addPasswpord.sendKeys(rs.getString("emp_password"));
            System.out.println(rs.getString("emp_Firstname"));
            System.out.println(rs.getString("emp_password"));
        }
        Thread.sleep(1000);
        signIngetText.getText();
        System.out.println(signIngetText.getText());
    }
    public void CreditCardMouseHoover() throws InterruptedException {
        Actions action = new Actions(driver);
        action.moveToElement(CreditCardHoover).build().perform();
        Thread.sleep(2000);
        TypeOfcreditCardText.click();
    }
    public void TravelRewardCardCase() throws InterruptedException {
        CreditCardMouseHoover();
        TravelRewardCardclick.click();
        Thread.sleep(2000);
        TravelAndMilesRewardText.getText();
    }
    public void VentureRewardsCard() throws InterruptedException {
        TravelRewardCardCase();
        Thread.sleep(2000);
        VentureRewardsCard.click();
        Thread.sleep(2000);
        //This will scroll the page till the element is found
        // js.executeScript("arguments[0].scrollIntoView();", Element);
        js.executeScript("arguments[0].scrollIntoView();", ApplyNowButtonclick);
        ApplyNowButtonclick.click();
        Thread.sleep(2000);
        EarnBonustext.getText();
        System.out.println(EarnBonustext.getText());
    }
    public void YourCreditScoreWorthProtecting() throws InterruptedException {
        LearnAndGrowTab.click();
        Thread.sleep(2000);
        FeatureContainText.getText();
        System.out.println(FeatureContainText.getText());

    }
}
