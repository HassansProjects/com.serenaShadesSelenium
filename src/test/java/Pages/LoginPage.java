package Pages;

import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends CommonMethods {

    public LoginPage()
    {
        //call selenium page factory
        PageFactory.initElements(driver, this);
        // Initializing the webElements of the current page
    }
    @FindBy(xpath = "(//*[name()='svg'])[1]")
    public WebElement MyAcctBtn;
    @FindBy(xpath = "//input[@id='email']")
    public WebElement EnterEmailAddress;

    @FindBy(xpath = "//input[@id='pass']")
    public WebElement EnterPassword;

    @FindBy(xpath = "//span[normalize-space()='Login']")
    public WebElement ClickLoginBtn;

    @FindBy(xpath= "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    public WebElement errorMessage;

    @FindBy(xpath = "//h1[contains(text(),'Account Summary')]")
    public WebElement myAccountWelcomeMessage;
}
