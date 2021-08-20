package CNNHomePageTest;
import cnnhomepage.CNNHomePage;
import cnnhomepage.DataProvider;
import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CNNTestDriverPage extends WebAPI {
    CNNHomePage cnnHomePage;

    @BeforeMethod
    public void getInit() {
        cnnHomePage = PageFactory.initElements(driver, CNNHomePage.class);
    }

    //us select
    @Test(enabled = false)
    public void testCNNUSButton() throws InterruptedException {
        cnnHomePage.CNNUSButton();
        String expectedText = "The latest US stories";
        String actualText = cnnHomePage.TheLatesUSstoryText.getText();
        Assert.assertEquals(actualText, expectedText, "product does not match");

    }

    //edition flipover
    @Test(enabled = false)
    public void testEditionFlipover() throws InterruptedException {

        cnnHomePage.EditionFlipover();
        String expectedText = "International";
        String actualText = cnnHomePage.InternationalText.getText();
        Assert.assertEquals(actualText, expectedText, "product does not match");
    }

    //login icon
    @Test(enabled = false)
    public void testLoginicon() throws InterruptedException {

        cnnHomePage.Loginicon();
        String expectedText = "Log In";
        String actualText = cnnHomePage.LoginTextafterClickText.getText();
        Assert.assertEquals(actualText, expectedText, "product does not match");
    }

    // send key on login button
    @Test(enabled = true)
    public void SendKeyInLoginButton() throws InterruptedException {
        cnnHomePage.SendKeyInLoginButton();
        String expectedText = "Forgot password?";
        String actualText = cnnHomePage.ForgotPasswordtext.getText();
        Assert.assertEquals(actualText, expectedText, "product does not match");
    }

  // @Test(enabled = true)
  // @Test( enabled = true, dataProvider="getData")
   @Test( dataProvider="getData",dataProviderClass= DataProvider.class)
    public void SendKeyInLoginButton1() throws InterruptedException {
        cnnHomePage.SendKeyInLoginButton1("username","password");
        String expectedText = "Forgot password?";
        String actualText = cnnHomePage.ForgotPasswordtext.getText();
        Assert.assertEquals(actualText, expectedText, "product does not match");
    }

    //World icon
    @Test(enabled = false)
    public void WorldIconTesting() throws InterruptedException {
        cnnHomePage.WorldIconTesting();
        String expectedText = "World";
        String actualText = cnnHomePage.GettingWorldtext.getText();
        Assert.assertEquals(actualText, expectedText, "product does not match");
    }

    //Live tv Icon
    @Test(enabled = false)
    public void testLiveTvIcon() throws InterruptedException {

        cnnHomePage.LiveTvIcon();
        String expectedText = "CHANNELS";
        String actualText = cnnHomePage.getChannelsTextfromChannel.getText();
        Assert.assertEquals(actualText, expectedText, "product does not match");
    }
    //cnn Channel
    @Test(enabled = true)
    public void CNNchannel() throws InterruptedException {
        cnnHomePage.CNNchannel();
        String expectedText = "Login";
        String actualText = cnnHomePage.GetLoginText.getText();
        Assert.assertEquals(actualText, expectedText, "product does not match");
    }

    //Menu Icon with send key
    @Test(enabled = true)
    public void MenuIcon() throws InterruptedException {
        cnnHomePage.MenuIcon();
        String expectedText = "Covid19";
        String actualText = cnnHomePage.GetCovid19Text.getText();
        Assert.assertEquals(actualText, expectedText, "product does not match");
    }

    //Select US radio Button
    @Test(enabled = true)
    public void USRadioButtonClick() throws InterruptedException {
        cnnHomePage.USRadioButtonClick();
        String expectedText = "Covid19";
        String actualText = cnnHomePage.DisplayingResultGetting.getText();
        Assert.assertEquals(actualText, expectedText, "product does not match");
    }

    //politice icon
    @Test(enabled = true)
    public void PoliticsIcon() throws InterruptedException {
        cnnHomePage.PoliticsIcon();

        String expectedText = "Paid Partner Content";
        String actualText = cnnHomePage.PaidParentContentText.getText();
        Assert.assertEquals(actualText, expectedText, "product does not match");
    }

}






