package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultPage extends BasePage{

    private static final String EXPECTED_QUERY = "s?k=Samsung+S20";
    private static final int EXPECTED_AMOUNT_OF_PRODUCTS = 16;

    @FindBy(xpath = "//span[contains(@class,'a-size-medium a-color-base a-text-normal')]")
    private List<WebElement> productafterseach;

    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getProductAfterSeach()
    {
        return productafterseach;
    }

    public int coutAllProductsOnThePage()
    {
        return getProductAfterSeach().size();
    }

    public int EXPECTEDAMOUNT()
    {
        return EXPECTED_AMOUNT_OF_PRODUCTS;
    }
    public void clickToTheProduct()
    {
        productafterseach.get(0).click();
    }

}
