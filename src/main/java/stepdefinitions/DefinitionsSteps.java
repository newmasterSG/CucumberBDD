package stepdefinitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import manager.PageFactoryManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;
import static java.lang.Thread.sleep;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DefinitionsSteps {
    private static final long DEFAULT_TIMEOUT = 60;

    WebDriver driver;
    HomePage homePage;
    SearchResultPage searchResultPage;
    ProductPage productPage;
    CreateAccountPage createAccountPage;
    SignInPage signInPage;
    ShoppingCartPage shoppingCartPage;
    GiftCardPage giftCardPage;
    PageFactoryManager pageFactoryManager;

    ChangeCountryPage changeCountryPage;

    CountryPage countryPage;

    @Before
    public void testsSetUp() {
        chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        pageFactoryManager = new PageFactoryManager(driver);
    }

    @And("User opens {string} page")
    public void openPage(final String url) {
        homePage = pageFactoryManager.getHomePage();
        homePage.openHomePage(url);
    }

    @And("User checks search field visibility")
    public void checkSearchVisibility() {
        homePage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        homePage.IsSearchFieldVisible();
    }

    @And("User clicks search button")
    public void clickSearchButton()
    {
        homePage.clickSearchButton();
    }

    @And("User makes search by keyword {string}")
    public void enterKeywordToSearchField(final String keyword) {
        homePage.enterTextToSearchField(keyword);
    }

    @And("User checks that amount of products on the page")
    public void AmountOfProductsOnThePage()
    {
        searchResultPage=pageFactoryManager.getSearchResultPage();
        searchResultPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        assertEquals(searchResultPage.coutAllProductsOnThePage(),searchResultPage.EXPECTEDAMOUNT());
    }

    @And("User checks left side bar visibility")
    public void VisiableLeftSideBar()
    {
        homePage.IsChooseFunctionsVisiable();
    }
    @And("User clicks left side bar button")
    public void clicksidebar()
    {
        homePage.clickChooseFunctions();
    }
    @And("User checks anyone category")
    public void VisiableCategory()
    {
        homePage.IsChooseCategoryVisiable();
    }

    @When("User click anyone category")
    public void clickCategory()
    {
        homePage.getChoosecategory();
    }

    @And("User clicks to the first product")
    public void clickFirstProduct()
    {
        searchResultPage = pageFactoryManager.getSearchResultPage();
        searchResultPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        searchResultPage.clickToTheProduct();
    }

    @And("User checks buying options visibility")
    public void VisiableBuyingoptions()
    {
        productPage = pageFactoryManager.getProductPage();
        productPage.IsOtherOffersVisiable();
    }

    @And("User clicks buying options")
    public void clickoptions()
    {
        productPage = pageFactoryManager.getProductPage();
        productPage.clickOtherOffers();
    }

    @And("User checks header visibility")
    public void checkHeadervisibility()
    {
        assertTrue(homePage.IsHeaderVisiable());
    }
    @And("User checks footer visibility")
    public void checkFooterVisibility()
    {
        assertTrue(homePage.IsFooterVisiable());
    }
    @And("User checks sign in field visibility")
    public void checksigninVisibility()
    {
        homePage.IsSignInField();
    }
    @And("User checks choose language visibility")
    public void checkLanguageVisibility()
    {
        homePage.IsButtonToChooseLanguagesVisiable();
    }
    @And("User checks order field visibility")
    public void checkOrderVisibility()
    {
        homePage.IsOrderField();
    }
    @And("User checks deliver to country field visibility")
    public void checkDeliverVisibility()
    {
        homePage.IsChooseCountryFieldVisiable();
    }
    @And("User checks cart visibility")
    public void checkcartVisibility()
    {
        homePage.IsCartFieldVisiable();
    }
    @And("User checks register button visibility")
    public void checkregisterVisibility()
    {
        homePage.IsRegistrygiftFieldFieldVisiable();
    }
    @And("User checks today's deals field visibility")
    public void checktodaydealsVisibility()
    {
        homePage.IsTodayDealsFieldVisiale();
    }
    @And("User checks customer service field visibility")
    public void ckeckCustomerVisibility()
    {
        homePage.IsCustomerServiceFieldVisiable();
    }
    @And("User checks sell field visibility")
    public void checksellVisibility()
    {
        homePage.IsSellFieldVisiable();
    }
    @And("User checks gift card field visibility")
    public void checkGiftcard()
    {
        assertTrue(homePage.IsGiftCardsFieldVisiable());
    }
    @And("User clicks gift card")
    public void clickToGiftCard()
    {
        homePage = pageFactoryManager.getHomePage();
        homePage.TobeClick(homePage.getGiftcardsField());
        homePage.clickGiftCard();
    }
    @Then("checks to visibility to text")
    public void checkTextVisibility()
    {
        giftCardPage = pageFactoryManager.getGiftCardPage();
        giftCardPage.IsTextVisibiality();
    }

    @And("User clicks to the choose format")
    public void clicktoelement()
    {
        giftCardPage = pageFactoryManager.getGiftCardPage();
        giftCardPage.clickToTheninthelement();
    }
    @And("User clicks to first product")
    public void clickFir()
    {
        giftCardPage.clickafterformat();
    }

    @And("User clicks to logo")
    public void clicklogo()
    {
        giftCardPage.clicklogo();
    }

    @And("User checks field is entry")
    public void IsFieldentry()
    {
        signInPage=pageFactoryManager.getSignInPage();
        signInPage.IsEntryFieldVisiable();
    }
    @And("User clicks to the sign in field")
    public void clickTosing()
    {
        homePage.clickSignIn();
        signInPage=pageFactoryManager.getSignInPage();
    }

    @And("User checks register visibility")
    public void RegisterVisibility()
    {
        signInPage.IsCreateAccountButton();
    }

    @And("User clicks register button")
    public void clickregister()
    {
        signInPage.clickRegister();
    }

    @And("User checks name field visibility")
    public void IsNameVisibility()
    {
        createAccountPage=pageFactoryManager.getCreateAccountPage();
        createAccountPage.IsNameVisiable();
    }

    @And("User checks email or email field visibility")
    public void IsemailfieldVisibility()
    {
        createAccountPage.IsPhoneVisiable();
    }

    @And("User checks password visibility")
    public void IspasswordVisibility()
    {
        createAccountPage.IsPasswordVisiable();
    }
    @And("User checks repassword visibility")
    public void IsrepasswordVisibility()
    {
        createAccountPage.IsRePasswordVisiable();
    }

    @And("User fills {string}")
    public void name(final String name)
    {
        createAccountPage=pageFactoryManager.getCreateAccountPage();
        createAccountPage.setName(name);
    }
    @And("User fills{string}")
    public void email(final String email)
    {
        createAccountPage.setemail(email);
    }
    @And("User fill {string}")
    public void password(final String password)
    {
        createAccountPage.setPassword(password);
    }
    @And("User fill{string}")
    public void repassword(final String repassword)
    {
        createAccountPage.setRepassword(repassword);
    }

    @And("User clicks to the choose language")
    public void clickchooseLanguage()
    {
        homePage.clickChooseLanguages();
    }

    @And("User checks change language visibility")
    public void IsChangeLanguageVisibility()
    {
        changeCountryPage=pageFactoryManager.getChangeCountryPage();
        changeCountryPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        changeCountryPage.IsChangeLanguageVisiale();
    }

    @And("User clicks change language")
    public void clickChangeLanguage()
    {
        changeCountryPage.clickChangeLanguage();
    }

    @And("User checks change choice currency visibility")
    public void IsChoiceCurrencyVisibility()
    {
        changeCountryPage.IsChangeCurrencyVisiale();
    }
    @And("User clicks to the choice currency")
    public void clickChoiceCurrency()
    {
        changeCountryPage.clickChangeCurrency();
    }
    @And("User checks currency visibility")
    public void IsExactlyCurrencyVisiable()
    {
        changeCountryPage.IsCurrencyVisiable();
    }
    @And("User clicks currency")
    public void clickExactlyCurrency()
    {
        changeCountryPage.clickcurrency();
    }
    @And("User checks to change click right")
    public void checkright()
    {
        homePage.IsChangeBannerToTheRightVisiable();
    }
    @And("User click to change right")
    public void clickright()
    {
        homePage.clickChangeBannerToTheRight();
    }
    @And("User checks to change click left")
    public void checkleft()
    {
        homePage.IsChangeBannerToTheLeftVisiable();
    }
    @And("User clicks to change left")
    public void clickleft()
    {
        homePage.clickChangeBannerToTheLeft();
    }
    @And("User checks change country on side bar")
    public void IschangeCountryVisibility()
    {
        homePage.IschangeCountrywithleftbarVisiable();
    }
    @And("User clicks change country")
    public void clickChangeCountry()
    {
        homePage.clickchangeCountrywithleftbar();
    }
    @And("User checks change country field visibility")
    public void IsChangeCountryFieldVisibility()
    {
        countryPage=pageFactoryManager.getCountryPage();
        countryPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        countryPage.IsCountryFieldVisiable();
    }
    @And("User clicks change country field")
    public void clickChangeCountryField()
    {
        countryPage.clickCountryField();
    }
    @And("User checks returns to homepage")
    public void IsChecksReturns()
    {
        countryPage.IsGoToHomePageButton();
    }
    @And("User clicks returns to homepage")
    public void clickCheckReturns()
    {
        countryPage.TobeClick(countryPage.getGoToHomePageButton());
        countryPage.clickGoToHomePageButton();
    }
    @After
    public void tearDown() {
        driver.close();
    }
    @And("User fills data {string}")
    public void data(final String login)
    {
        signInPage.login(login);
    }
}
