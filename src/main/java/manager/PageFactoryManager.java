package manager;

import org.openqa.selenium.WebDriver;
import pages.*;

public class PageFactoryManager {

    WebDriver driver;

    public PageFactoryManager(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage getHomePage() {
        return new HomePage(driver);
    }


    public SearchResultPage getSearchResultPage() {
        return new SearchResultPage(driver);
    }

    public ProductPage getProductPage() {
        return new ProductPage(driver);
    }

    public SignInPage getSignInPage() {
        return new SignInPage(driver);
    }

    public ShoppingCartPage getShoppingCartPage() {
        return new ShoppingCartPage(driver);
    }

    public GiftCardPage getGiftCardPage(){return new GiftCardPage(driver);}

    public CreateAccountPage getCreateAccountPage(){return new CreateAccountPage(driver);}

    public ChangeCountryPage getChangeCountryPage(){return new ChangeCountryPage(driver);}

    public CountryPage getCountryPage(){return new CountryPage(driver);}
}
