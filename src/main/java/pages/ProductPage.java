package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductPage extends BasePage{

    /*@FindBy(xpath = "//a[contains(text(),' Add to List ')]")
    private WebElement addtocart;*/

    @FindBy(xpath = "//a[contains(text(),' See All Buying Options ')]")
    private WebElement otheroffers;

    @FindBy(xpath = "//span[@id='aod-sort-details-string']")
    private WebElement sortedby;
    @FindBy(xpath = "//div[contains(@class,'a-alert-container')]//div[contains(text(),'Added')]")
    private List<WebElement> ListAddProducts;

    @FindBy(xpath = "//span[@id='a-autoid-2-offer-1-announce']")
    private WebElement Add;

    @FindBy(xpath = "//i[contains(@class,'a-icon a-icon-close a-icon-medium aod-close-button')]")
    private WebElement closeButton;

    @FindBy(xpath = "//a[contains(@id,'nav-cart')]")
    private WebElement cartField;
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getSortedby()
    {
        return sortedby;
    }
    public boolean IsOtherOffersVisiable()
    {
        return otheroffers.isDisplayed();
    }

    public void clickCloseButton()
    {
        closeButton.click();
    }

    public WebElement getCloseButton()
    {
        return closeButton;
    }

    public boolean IsAdd()
    {
        return Add.isDisplayed();
    }

    public boolean IsListAddProductsVisiale()
    {
        return ListAddProducts.get(0).isDisplayed();
    }

    public WebElement Add()
    {
        return Add;
    }
    public void clickOtherOffers()
    {
        otheroffers.click();
    }

    public void clickAddToCart()
    {
        Add.click();
    }

    public void clickCartField()
    {
        cartField.click();
    }
}
