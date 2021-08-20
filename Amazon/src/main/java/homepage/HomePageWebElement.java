package homepage;


import org.openqa.selenium.By;

public class HomePageWebElement  {

    // WebElement class for Locators only and some other properties
    public static final String productName="Mask";
    public static final String searchBoxLocator="twotabsearchtextbox";
    public static final String searchButtonLocator="nav-search-submit-button";
    public static final String searchTextLocator="//*[@id=\"search\"]/span/div/span/h1/\ndiv/div[1]/div/div/span[3]";
    //this isclick on all button and get text
    public static final String ClickAllSearch="#nav-hamburger-menu > i";
    public static final String Trending="//*[@id=\"hmenu-content\"]/ul[1]/li[1]/div";
    public static final String NewReleases="//*[@id=\"hmenu-content\"]/ul[1]/li[3]/a";
    public static final String VideoGame ="//*[@id=\"zg_left_col1\"]/div[1]/h3";
    public static final String Fashion="//*[@id=\"nav-xshop\"]/a[7]";
    public static final String FashionNavigation="//*[@id=\"live-flagship-root\"]/div/div[2]/div[2]/div/a[2]";
    public static final String FashionNavigationrolling = "//*[@id=\"live-flagship-root\"]/div/div[2]/div[2]/div/a[2]";
    public static final String SelectImage ="//*[@id=\"live-flagship-root\"]/div/div[2]/div[2]/div/div/div[11]/div/div[1]/div";
    public static final String SwetyRockWomanShort="a-size-large product-title-word-break";
    public static final String Fashion1="//*[@id=\"nav-xshop\"]/a[7]";
    public static final String Women="//*[@id=\"sobe_d_b_4_1\"]/a";
    public static final String ShopByCategory=" /html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[14]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h3[2]" ;
    //singIn email and
    public static final String SingInAccountList="//*[@id=\"nav-link-accountList\"]/span[1]/span";
    public static final String SingInButton="//*[@id=\"nav-flyout-ya-signin\"]/a";
    public static final String SingInButtonText="//*[@id=\"authportal-main-section\"]/div[2]/div/div[1]/form/div/div/div/h1";
    // send key for email
    public static final String SingInsendkey="//*[@id=\"ap_email\"]";
    public static final String Continue=  "//*[@id=\"continue\"]";
    public static final String problemMessage=  "a-alert-heading";
    //CLICK ON create your Amazon Account Button
    public static final String createanAmazonAccount=  "//*[@id=\"createAccountSubmit\"]";
    public static final String createAccount=  "//*[@id=\"ap_register_form\"]/div/div/h1";
    // provide the user information to creat the account
    public static final String userName=  "//input[@id='ap_customer_name']";
    public static final String userEmail=  "//input[@id='ap_email']";
    public static final String userPassword=  "//input[@id='ap_password']";
    public static final String userReEnterPassword=  "//input[@id='ap_password_check']";
    public static final String gettextCreatAccount="//*[@id=\"ap_register_form\"]/div/div/h1";
    //Toys And Games
    public static final String toysAndGames="//a[contains(text(),'Toys & Games')]";
    public static final String ageRange= "//*[@id=\"s-refinements\"]/div[1]/ul/li[1]/span/a/div/label/i";
    public static final String nubyIceJelTheeterKey= "//span[contains(text(),'Nuby Ice Gel Teether Keys')]";
    public static final String addToCart = "//input[@id='add-to-cart-button']";
    public static final String selectCart= "//*[@id=\"nav-cart\"]";
    public static final String shoppingCart ="//*[@id=\"sc-active-cart\"]/div/div/div";
    //radio Button For Usa Flag icon
    public static final String UsaFlage ="//span[@class='nav-line-2']//span[@class='nav-icon nav-arrow null']";
    public static final String Amazoncom ="//*[@id=\"nav-flyout-icp\"]/div[2]/span[2]/span";
    //Nav and Order
    public static final String ReturnAndOrder ="nav-orders";
    public static final String NewToAmazon ="//*[@id=\"authportal-main-section\"]/div[2]/div/div[2]";
    public static final String ClickAllButton ="//*[@id=\"nav-search-label-id\"]";
    public static final String listofElementsinAl="//*[@id=\"searchDropdownBox\"]/option";

    // to get the list Element
    public static final String SelectAllArrowLocator = "//div[@id='nav-search-dropdown-card']";
    public static final String ListOFAllElementLocator = "//*[@id=\"searchDropdownBox\"]/option";
    public static final String ListOFAllElementLocatorText = "//*[@id=\"searchDropdownBox\"]/option";




}
