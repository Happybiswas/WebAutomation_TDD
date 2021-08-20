package homepage;

public class TDAmeritradeWebElement {
    public static final String PricingLocator = "//nav[@class='main-header-supernav']//li[1]";
    public static final String StocksLocator = "//h1[normalize-space()='Pricing']";
    public static final String openNewAccountLinkLocator = "//a[normalize-space()='Open new account']";
    public static final String iNdividualLocator = "//div[@aria-label='Detaigit ls about Individual']";
    public static final String openWithIndividualLocator = "//button[normalize-space()='Open an individual account']";
    public static final String prefixLocator = "//p[normalize-space()='Prefix (optional)']";
    public static final String prefixSelectLocator = "//select[@name='owners.primaryOwner.name.prefix']";
    public static final String FristNameLocator = "//input [@name='owners.primaryOwner.name.firstName']";
    public static final String LastNameLocator = "//input [@name='owners.primaryOwner.name.lastName']";
    public static final String suffixSelectorLocator = "//select[@name='owners.primaryOwner.name.suffix']";
    public static final String EmailAddressLocator = "//input[@name='owners.primaryOwner.email']";
    public static final String SelectCountryLocator = "//select[@name='owners.primaryOwner.physicalAddress.country']";
    public static final String StreetAddressLocator = "//input[@placeholder='No PO boxes']";
    //public static final String AptLocator ="//input[@name='owners.primaryOwner.physicalAddress.addressLine2']";
    public static final String cityLocator = "//input[@name='owners.primaryOwner.physicalAddress.city']";
    public static final String SelectStateLocator = "//select[@name='owners.primaryOwner.physicalAddress.state']";
    public static final String SelectSZipCodeLocator = "//input[@name='owners.primaryOwner.physicalAddress.zip']";
    public static final String PhoneNumLocator = "//input[@name='owners.primaryOwner.primaryPhone.phoneNumber']";
    public static final String ReadTdAmertradecheckboxLocator = "//label[normalize-space()='I have read the TD Ameritrade Privacy Statement.']";
    public static final String continueToPersonalInformationLocator = "//button[normalize-space()='Continue to personal information']";
    public static final String WhatDoYouNeedLocator = " //h2[normalize-space()='What you need:']";

    // loginPage
    public static final String LoginLocator = "//*[@id=\"form-login\"]/div/button";
    public static final String userIDLocator = "input[name*='tbUsername']";
    public static final String passwordLocator = "input[name*='tbPassword']";
    public static final String SecureLog_in = "loginHeaderTitle";


    // list of elements
    public static final String WhyTdAmeritrade = "main-header-nav-item expandable";
    public static final String MainHeader = "main-header-login-help";

    // pricing ira account
    public static final String pricing1Locator = "//li[@class='main-header-supernav-item']//a[@title='Pricing'][normalize-space()='Pricing']";
    public static final String openNewAccountLocator = "//a[normalize-space()='Open new account']";
    public static final String IraAccountLocator = "//*[@id=\"root\"]/div/div/main/div/div/div/div/div/div/div[2]/div/div[1]/div/div[1]/div/div/div[3]";
    public static final String openTraditionalAccountLocator = "span[class*='padding-bottom-24 margin-right-24 display-inline-block']";
    public static final String WelcomeLetsAccountLocator = "h1[class='font-size-extra-large font-weight-medium padding-bottom-24']";
    public static final String LookingforgudienceLocator = "footer-languages__title";

}