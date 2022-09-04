package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class HomePage extends BasePage {

    @FindBy(xpath = "//header[contains(@class, 'nav-progressive-attribute')]")
    private WebElement header;

    @FindBy(xpath = "//div[contains(@class,'navLeftFooter')]")
    private WebElement footer;

    @FindBy(xpath = "//input[@id ='twotabsearchtextbox']")
    private WebElement searchField;

    @FindBy(xpath = "//span[contains(text(),'Hello, Sign in')]")
    private WebElement signInField;

    @FindBy(xpath = "//a[@class='nav-a nav-a-2 icp-link-style-2']")
    private WebElement chooseLanguages;

    @FindBy(xpath = "//a[contains(@id,'nav-cart')]")
    private WebElement cartField;

    @FindBy(xpath = "//a[contains(@id,'nav-orders')]")
    private WebElement orderField;

    @FindBy(xpath = "//input[contains(@id,'search-submit-button')]")
    private WebElement searchButton;

    @FindBy(xpath = "//i[contains(@class,'a-icon a-icon-next-rounded')]")
    private WebElement changebannertotheright;

    @FindBy(xpath = "//i[contains(@class,'a-icon a-icon-previous-rounded')]")
    private WebElement changebannertotheleft;

    @FindBy(xpath = "//a[contains(@id,'global-location')]")
    private WebElement chooseCountryField;

    @FindBy(xpath = "//a[contains(@class,'hmenu-item')]//div[contains(@class,'hmenu-icon-container')]//i[contains(@class,'icon-css-reset icp-flag-3 icp-flag-3-us')]")
    private WebElement changeCountrywithleftbar;
    @FindBy(xpath = "//div[contains(@id,'nav-xshop')]//a[contains(text(),'Deals')]")
    private WebElement todaydealsField;

    @FindBy(xpath = "//div[contains(@id,'nav-xshop')]//a[contains(text(),'Customer Service')]")
    private WebElement customerserviceField;

    @FindBy(xpath = "//div[contains(@id,'nav-xshop')]//a[contains(text(),'Registry')]")
    private WebElement registrygiftField;

    @FindBy(xpath = "//div[contains(@id,'nav-xshop')]//a[contains(text(),'Gift Cards')]")
    private WebElement giftcardsField;

    @FindBy(xpath = "//div[contains(@id,'nav-xshop')]//a[contains(text(),'Sell')]")
    private WebElement sellField;

    @FindBy(xpath = "//div[contains(@class,'a-spacing-none')]//img[contains(@class,'-image-link_style_')]")
    private List<WebElement> banner;

    @FindBy(xpath = "//a[contains(@id,'nav-hamburger-menu')]")
    private WebElement choosefunctions;

    @FindBy(xpath = "//a[text()='See more']")
    private List<WebElement> choosecategory;


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void IsChooseCategoryVisiable()
    {
        choosecategory.get(0).isDisplayed();
    }
    public void getChoosecategory()
    {
        choosecategory.get(0).click();
    }

    public void openHomePage(String url) {
        driver.get(url);
    }

    public boolean IsHeaderVisiable()
    {
        return header.isDisplayed();
    }

    public boolean IsFooterVisiable()
    {
        return footer.isDisplayed();
    }
    public boolean IschangeCountrywithleftbarVisiable()
    {
        return changeCountrywithleftbar.isDisplayed();
    }
    public void clickchangeCountrywithleftbar()
    {
        changeCountrywithleftbar.click();
    }
    public boolean IsSearchFieldVisible()
    {
        return searchField.isDisplayed();
    }

    public boolean IsSignInField()
    {
        return signInField.isDisplayed();
    }

    public boolean IsButtonToChooseLanguagesVisiable()
    {
        return chooseLanguages.isDisplayed();
    }

    public boolean IsCartFieldVisiable()
    {
        return cartField.isDisplayed();
    }

    public boolean IsOrderField()
    {
        return orderField.isDisplayed();
    }

    public boolean IsSearchButtonVisiable()
    {
        return searchButton.isDisplayed();
    }

    public boolean IsChooseCountryFieldVisiable()
    {
        return chooseCountryField.isDisplayed();
    }

    public boolean IsTodayDealsFieldVisiale()
    {
        return todaydealsField.isDisplayed();
    }

    public boolean IsCustomerServiceFieldVisiable()
    {
        return customerserviceField.isDisplayed();
    }

    public boolean IsRegistrygiftFieldFieldVisiable()
    {
        return registrygiftField.isDisplayed();
    }

    public boolean IsGiftCardsFieldVisiable()
    {
        return giftcardsField.isDisplayed();
    }

    public boolean IsSellFieldVisiable()
    {
        return sellField.isDisplayed();
    }

    public boolean IsBannerVisiable()
    {
        return banner.get(0).isDisplayed();
    }

    public boolean IsChooseFunctionsVisiable()
    {
        return choosefunctions.isDisplayed();
    }



    public void clickSignInField()
    {
        signInField.click();
    }

    public void clickChooseLanguages()
    {
        chooseLanguages.click();
    }

    public void clickSearchButton()
    {
        searchButton.click();
    }

    public void clickChooseFunctions()
    {
        choosefunctions.click();
    }


    public void enterTextToSearchField(final String searchText) {
        searchField.clear();
        searchField.sendKeys(searchText);
    }

    public void clickGiftCard()
    {
        giftcardsField.click();
    }

    public WebElement getGiftcardsField() {
        return giftcardsField;
    }
    public void clickSignIn()
    {
        signInField.click();
    }

    public boolean IsChangeBannerToTheRightVisiable()
    {
        return changebannertotheright.isDisplayed();
    }
    public boolean IsChangeBannerToTheLeftVisiable()
    {
        return changebannertotheleft.isDisplayed();
    }
    public void clickChangeBannerToTheRight()
    {
        changebannertotheright.click();
    }
    public void clickChangeBannerToTheLeft()
    {
        changebannertotheleft.click();
    }
}
