package homepage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

import static homepage.TDAmeritradeWebElement.*;

public class PricingIRAAccount extends WebAPI {

    @FindBy(how= How.XPATH,using = pricing1Locator)public WebElement pricing;
    @FindBy(how= How.XPATH,using = openNewAccountLocator)public WebElement openNewAccount;
    @FindBy(how= How.XPATH,using = IraAccountLocator)public WebElement IraAccount;
    @FindBy(how= How.CSS,using = openTraditionalAccountLocator)public WebElement openTraditionalAccount;
    @FindBy(how= How.CSS,using = WelcomeLetsAccountLocator)public WebElement WelcomeLetsAccount;

@Test
    public void IraAccountOpen() throws InterruptedException {
        pricing.click();
        Thread.sleep(2000);
        openNewAccount.click();
        IraAccount.click();
        openTraditionalAccount.click();
        WelcomeLetsAccount.getText();
        System.out.println(WelcomeLetsAccount.getText());
    }




}
