package cnnhomepage;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import static cnnhomepage.CNNWebElement.*;
    public class CNNHomePage extends WebAPI {
        CNNHomePage cnnHomePage;
        @FindBy(how = How.XPATH, using = US) public WebElement USBox;
        @FindBy(how = How.XPATH, using = TheLatesUSstory) public WebElement TheLatesUSstoryText;
        //Edition
        @FindBy(how = How.XPATH, using = Edition) public WebElement EditionBox;
        @FindBy(how = How.XPATH, using = International) public WebElement InternationalText;
        //login icon
        @FindBy(how = How.XPATH, using = logIn) public WebElement logInButton;
        @FindBy(how = How.XPATH, using = LoginTextafterClick) public WebElement LoginTextafterClickText;
        //send key on login icon
        @FindBy(how = How.XPATH, using = EmailAddress) public WebElement EmailAddresskey;
        @FindBy(how = How.XPATH, using = Password) public WebElement Passwordkey;
        @FindBy(how = How.XPATH, using = ForgotPassword) public WebElement ForgotPasswordtext;
        //World icon
        @FindBy(how = How.XPATH, using = World) public WebElement WorldButton;
        @FindBy(how = How.XPATH, using = Worldtext) public WebElement GettingWorldtext;
        //Live Tv Icon
        @FindBy(how = How.XPATH, using = LiveTv) public WebElement LiveTvButton;
        @FindBy(how = How.XPATH, using = Channels) public WebElement ChannelsButton;
        @FindBy(how = How.XPATH, using = getChannelsText) public WebElement getChannelsTextfromChannel;
        //cnn Channel
        @FindBy(how = How.XPATH, using = CNNChannel) public WebElement CNNTVChannel;
        @FindBy(how = How.XPATH, using = LoginText) public WebElement GetLoginText;
        //Menu Icon
        @FindBy(how = How.CSS, using = MenuIcon) public WebElement MenuIconButton;
        @FindBy(how = How.XPATH, using = SendKeyInTheSearch) public WebElement SendKeyInTheSearchButton;
        @FindBy(how = How.XPATH, using = Search) public WebElement SearchBox;
        @FindBy(how = How.XPATH, using = Covid19Text) public WebElement GetCovid19Text;
        //Select US radio Button
        @FindBy(how = How.XPATH, using = RadioButtonUS) public WebElement RadioButtonUSclik;
        @FindBy(how = How.XPATH, using = DisplayingResult) public WebElement DisplayingResultGetting;
        //Politics Icon
        @FindBy(how = How.XPATH, using = politics) public WebElement politicsIcon;
        @FindBy(how = How.XPATH, using = DisplayingResult) public WebElement PaidParentContentText;


        public void CNNUSButton() throws InterruptedException {
            USBox.click();
            Thread.sleep(2000);
            TheLatesUSstoryText.getText();
        }
        public void EditionFlipover() throws InterruptedException {
            EditionBox.click();
            Thread.sleep(2000);
            InternationalText.getText();
        }
        public void Loginicon() throws InterruptedException {
            logInButton.click();
            Thread.sleep(2000);
            LoginTextafterClickText.getText();
        }
        public void SendKeyInLoginButton() throws InterruptedException {
            Loginicon();
            EmailAddresskey.sendKeys("happybiswas@yahoo.com");
            Thread.sleep(2000);
            Passwordkey.sendKeys("ung6350");
            Thread.sleep(2000);
            ForgotPasswordtext.getText();
        }
        //World icon
        public void WorldIconTesting() throws InterruptedException {

            WorldButton.click();
            Thread.sleep(2000);
            GettingWorldtext.getText();
        }
        //Live Tv Icon
        public void LiveTvIcon() throws InterruptedException {
            LiveTvButton.click();
            Thread.sleep(3000);
            ChannelsButton.click();
            Thread.sleep(3000);
            getChannelsTextfromChannel.getText();
        }
        //cnn Channel
        public void CNNchannel() throws InterruptedException {
            LiveTvIcon();
            Thread.sleep(3000);
            CNNTVChannel.click();
            Thread.sleep(3000);
            GetLoginText.getText();
            Thread.sleep(3000);
        }
    //        public void navigateForward() {
    //            driver.navigate().forward();
    //        }
        //Menu Icon
        public void MenuIcon() throws InterruptedException {
            MenuIconButton.click();
            Thread.sleep(3000);
            SendKeyInTheSearchButton.sendKeys("Covid19");
            SearchBox.click();
            Thread.sleep(3000);
            GetCovid19Text.getText();
        }
        //Select US radio Button
        public void USRadioButtonClick() throws InterruptedException {
            MenuIcon();
            RadioButtonUSclik.click();
            Thread.sleep(3000);
            DisplayingResultGetting.getText();
        }
    //politice icon
    public void PoliticsIcon() throws InterruptedException {
        politicsIcon.click();
        Thread.sleep(5000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("arguments[0].scrollIntoView();", WebElement);
        PaidParentContentText.getText();
    }
@Test( dataProvider="getData",dataProviderClass= DataProvider.class)
        public void SendKeyInLoginButton1(String username, String password) throws InterruptedException {
            Loginicon();
           // EmailAddresskey.sendKeys("happybiswas@yahoo.com");
         EmailAddresskey.sendKeys(username);
            Thread.sleep(2000);
           // Passwordkey.sendKeys("ung6350");
             Passwordkey.sendKeys("password");
            Thread.sleep(2000);
            ForgotPasswordtext.getText();
        }



}



