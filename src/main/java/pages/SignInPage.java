package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage{

    @FindBy(xpath = "//label[contains(text(),'Email or mobile phone number')]")
    private WebElement entryField;

    @FindBy(xpath = "//a[contains(@id,'createAccountSubmit')]")
    private WebElement createaccountButton;

    @FindBy(xpath = "//input[contains(@class,'a-input-text a-span12')]")
    private WebElement loginform;
    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public boolean IsEntryFieldVisiable()
    {
        return entryField.isDisplayed();
    }

    public boolean IsCreateAccountButton()
    {
        return createaccountButton.isDisplayed();
    }

    public void setLoginform()
    {
        loginform.click();
    }
    public void login(final String login)
    {
        loginform.clear();
        loginform.sendKeys(login);
    }
    public void clickRegister()
    {
        createaccountButton.click();
    }
}
