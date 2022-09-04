package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CountryPage extends BasePage{

    @FindBy(xpath = "//span[contains(@class,'a-dropdown-prompt')]")
    private WebElement CountryField;

    @FindBy(xpath = "//input[contains(@class,'a-button-input')]")
    private WebElement GoToHomePageButton;

    public CountryPage(WebDriver driver) {
        super(driver);
    }

    public boolean IsCountryFieldVisiable()
    {
        return CountryField.isDisplayed();
    }
    public boolean IsGoToHomePageButton()
    {
        return GoToHomePageButton.isDisplayed();
    }
    public void clickCountryField()
    {
        CountryField.click();
    }
    public void clickGoToHomePageButton()
    {
        GoToHomePageButton.click();
    }
    public WebElement getGoToHomePageButton()
    {
        return GoToHomePageButton;
    }

}
