package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class GiftCardPage extends BasePage{

    @FindBy(xpath = "//h1[contains(text(),'Shop the perfect gift card')]")
    private WebElement text;

    @FindBy(xpath = "//i[@class='a-icon a-icon-checkbox']")
    private List<WebElement> formatsearch;

   @FindBy(xpath = "//span[contains(@class,'a-size-base-plus a-color-base a-text-normal')]")
    private List<WebElement> productafterseach;

   @FindBy(xpath = "//a[contains(@id,'nav-logo-sprites')]")
   private WebElement logo;
    public GiftCardPage(WebDriver driver) {
        super(driver);
    }

    public boolean IsTextVisibiality()
    {
        return text.isDisplayed();
    }

    public void clickToTheninthelement()
    {
        formatsearch.get(9).click();
    }

    public void clickafterformat()
    {
        productafterseach.get(0).click();
    }
    public void clicklogo()
    {
        logo.click();
    }
}
