package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CreateAccountPage extends BasePage{

    @FindBy(xpath = "//input[contains(@id,'ap_customer_name')]")
    private WebElement name;

    @FindBy(xpath = "//input[contains(@id,'ap_email')]")
    private WebElement phone;

    @FindBy(xpath = "//input[contains(@id,'ap_password')]")
    private List<WebElement> password;


    //input[contains(@id,'ap_customer_name')]

    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }
    public boolean IsNameVisiable()
    {
        return name.isDisplayed();
    }
    public boolean IsPhoneVisiable()
    {
        return phone.isDisplayed();
    }
    public boolean IsPasswordVisiable()
    {
        return password.get(0).isDisplayed();
    }
    public boolean IsRePasswordVisiable()
    {
        return password.get(1).isDisplayed();
    }
    public void setName(final String name)
    {
        this.name.click();
        this.name.clear();
        this.name.sendKeys(name);
    }
    public void setemail(final String email)
    {
        this.phone.click();
        this.phone.clear();
        this.phone.sendKeys(email);
    }
    public void setPassword(final String password)
    {
        this.password.get(0).click();
        this.password.clear();
        this.password.get(0).sendKeys(password);
    }
    public void setRepassword(final String repassword)
    {
        this.password.get(1).click();
        this.password.clear();
        this.password.get(1).sendKeys(repassword);
    }
}
