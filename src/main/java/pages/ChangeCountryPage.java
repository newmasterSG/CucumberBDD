package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ChangeCountryPage extends BasePage{

    @FindBy(xpath = "//span[contains(text(),'Deutsch')]")
    private WebElement changeLanguagetoDeutsch;

    @FindBy(xpath = "//span[contains(@class,'a-button-text a-declarative')]")
    private WebElement changeCurrency;

    @FindBy(xpath = "//a[contains(@class,'a-dropdown-link')]")
    private List<WebElement> currency;

    public ChangeCountryPage(WebDriver driver) {
        super(driver);
    }
    public boolean IsChangeLanguageVisiale()
    {
        return changeLanguagetoDeutsch.isDisplayed();
    }
    public void clickChangeLanguage()
    {
        changeLanguagetoDeutsch.click();
    }
    public boolean IsChangeCurrencyVisiale()
    {
        return changeCurrency.isDisplayed();
    }
    public void clickChangeCurrency()
    {
        changeCurrency.click();
    }

    public boolean IsCurrencyVisiable()
    {
        return currency.get(1).isDisplayed();
    }
    public void clickcurrency()
    {
        currency.get(1).click();
    }
}
