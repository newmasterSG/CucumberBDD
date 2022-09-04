package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage{

    @FindBy(xpath = "//span[contains(@id,'nav-cart-count') and text() = '1']")
    private WebElement countofelementsinCart;

    @FindBy(xpath = "//span[contains(@id,'a-autoid-0-announce')]")
    private WebElement chooseamount;

    @FindBy(xpath = "//a[contains(text(),'0 (Delete)')]")
    private WebElement deletproduct;

    @FindBy(xpath = "//input[contains(@data-feature-id,'proceed-to-checkout-action')]")
    private WebElement checkoutButton;

    @FindBy(xpath = "//h1[contains(text(),'Amazon Cart is empty')]")
    private WebElement emptyCart;

    @FindBy(xpath = "//div[contains(@class,'sc-list-item-content-inner')]")
    private WebElement product;
    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }

    public boolean IsCheckOutButtonVisiable()
    {
        return checkoutButton.isDisplayed();
    }

    public boolean IsCountOfElementsInCartVisiable()
    {
        return countofelementsinCart.isDisplayed();
    }

    public boolean IsChooseAmountVisiable()
    {
        return chooseamount.isDisplayed();
    }

    public boolean IsDeletProductVisiable()
    {
        return deletproduct.isDisplayed();
    }

    public boolean IsEmptyCartVisiable()
    {
        return emptyCart.isDisplayed();
    }

    public String getCountOfElementsInCart()
    {
        return countofelementsinCart.getText();
    }

    public void clickChooseAmount()
    {
        chooseamount.click();
    }

    public void clickDeletProduct()
    {
        deletproduct.click();
    }

    public WebElement getProduct()
    {
        return product;
    }

}
