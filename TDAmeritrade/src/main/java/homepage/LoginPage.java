package homepage;


import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import javax.xml.crypto.Data;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

import static homepage.TDAmeritradeWebElement.*;
public class LoginPage extends WebAPI {
    // @FindBy(how = How.XPATH, using = PricingLocator) public WebElement PricingLocatorclick;
    @FindBy(how = How.XPATH, using = LoginLocator)
    public WebElement Login;
    @FindBy(how = How.CSS, using = userIDLocator)
    public WebElement userID;
    @FindBy(how = How.CSS, using = passwordLocator)
    public WebElement Passwpord;
    @FindBy(how = How.CLASS_NAME, using = SecureLog_in)
    public WebElement SecureLog_inText;
    @FindBy(how = How.CLASS_NAME, using = WhyTdAmeritrade)
    public WebElement WhyTdAmeritradeElement;
    @FindBy(how = How.CLASS_NAME, using = MainHeader)
    public WebElement MainHeaderText;
    @FindBy(how = How.XPATH, using = LookingforgudienceLocator)
    public WebElement Lookingforgudience;


    @Test(dataProvider = "getData")
    public void LoginBox(String userNAME, String Password) throws InterruptedException {
        driver.manage().deleteAllCookies();
        Login.click();
        //Thread.sleep(2000);
        userID.sendKeys(userNAME);
        Passwpord.sendKeys(Password);
        SecureLog_inText.getText();
        System.out.println(SecureLog_inText.getText());
        // WebDriverWait wait = new WebDriverWait(WebDriverRefrence,TimeOut);
        //wait.until(ExpectedConditions.VisibilityofElementLocated(By.xpath(""//button[@value='Save Changes']"")));
        // WebDriverWait wait = new WebDriverWait (driver, 20);
        //wait.until(ExpectedConditions.visibilityOf(SecureLog_inText));

        //driver.navigate().back();
        // }
    }


    //    public void elementList() {
//
//        // List <WebElement> listOfWebElements = driver.findElements(By.tagName("li"));
//        List<WebElement> listOfWebElements = driver.findElements(By.className("main-header-nav-scroll-container"));
//        for (WebElement objCurrentLink : listOfWebElements) {
//            String strlinkText = objCurrentLink.getText();
//            System.out.println(strlinkText);
//
//            MainHeaderText.getText();
//
//        }
    public void elementList() {

        // List <WebElement> listOfWebElements = driver.findElements(By.tagName("li"));
        List<WebElement> listOfWebElements = driver.findElements(By.cssSelector("a[class*='main-footer-nav-link']"));
        for (WebElement objCurrentLink : listOfWebElements) {
            String strlinkText = objCurrentLink.getText();
            System.out.println(strlinkText);

            MainHeaderText.getText();

        }


    }
    // broken link/ url
    // step 1 is to get all urls tried up to the links using selenium
    // java method  will call the URL'S  and gets you  the status code
    // if status code 400 then that url is not working
    // if status code is 200 its mean the link are working
    // udemy rahul sety video

    //    public void brokenLink() throws IOException, InterruptedException {
//        //List<WebElement> links = driver.findElements(By.cssSelector("a[class*='main-footer-nav-link']"));
//        List<WebElement> links = driver.findElements(By.tagName("a"));
//        for (WebElement link : links) {
//            // open connection method come from url class that come from java library
//            String url = link.getAttribute("href");
//            Thread.sleep(5000);
//            HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
//            conn.setRequestMethod("HEAD");
//            conn.connect();
//            int respCode = conn.getResponseCode();
//            System.out.println(respCode);
//            if (respCode > 400) {
//                System.out.println("The link with text" + link.getText() + "is broken with code" + respCode);
//                Assert.assertTrue(true);
//            }
//
//        }
    //this one run with url
    //youtube vedio******************************************************
    public void brokenLink() throws IOException, InterruptedException {
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println((links.size()));
        for (int i = 0; i < links.size(); i++) {
            // by using href attribute we can get url of required link
            WebElement element = links.get(i);
            String url = element.getAttribute("href");
            URL link = new URL(url);

            //  crete a connection using url object link

            HttpURLConnection httConn = (HttpURLConnection) link.openConnection();
            Thread.sleep(2000);
            httConn.connect();
            int rescode = httConn.getResponseCode();
            if (rescode >= 400) {
                System.out.println(url + "" + "is broken");
            } else {
                System.out.println(url + "" + "is valid link");
            }

        }


    }


//      //  }
//            ****************************************************************
//            this method id how to fund one broken link
//            public void brokenLink() throws IOException, InterruptedException {
//                String url= driver.findElement(By.xpath("//a[@class='main-footer-nav-link'][normalize-space()='Open New Account']")).getAttribute("href");
//
//                // open connection method come from url class that come from java library
//                HttpURLConnection conn =(HttpURLConnection)new URL(url).openConnection();
//                conn.setRequestMethod("HEAD");
//                conn.connect();
//                int respCode = conn.getResponseCode();
//                System.out.println(respCode);
//                Thread.sleep(200);
//               Lookingforgudience.getText();
//              System.out.println(Lookingforgudience.getText());
//    }


}