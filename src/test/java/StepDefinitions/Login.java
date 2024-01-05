package StepDefinitions;

import Utils.CommonMethods;
import Utils.ConfigReader;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class Login extends CommonMethods {
    @Given("user launched the browser and navigate to the URL")
    public void user_launched_the_browser_and_navigate_to_the_url() {
        openBrowserAndLaunchApplication();
    }
    @And("user clicked on My Account button")
    public void user_clicked_on_my_account_button() {
        doClick(login.MyAcctBtn);
    }
    @When("user enters Email Address")
    public void user_enters_email_address() {
        sendText(login.EnterEmailAddress, ConfigReader.getPropertyValue("username"));
    }
    @When("user enters  password")
    public void when_user_enters_password() {
        sendText(login.EnterPassword, ConfigReader.getPropertyValue("password"));
    }
    @When("user clicked on LOGIN button to log in")
    public void then_user_clicked_on_login_button_to_log_in() throws InterruptedException {
        Thread.sleep(5000);
       doClick (login.ClickLoginBtn);

    }
    @Then("user successfully logged in with message {string}")
    public void user_successfully_logged_in_with_message(String expectedText) throws InterruptedException {
        Thread.sleep(3000);

        WebElement welcomeMessage = login.myAccountWelcomeMessage;
        System.out.println("expectedText:" + " " + expectedText);
        String actualText = welcomeMessage.getText();
        System.out.println("actual TEXT:" + " " + actualText);
        Assert.assertEquals(actualText,expectedText);

    }
        @When("user enters different {string} and {string} and verify the {string} for it")
    public void user_enters_different_and_and_verify_the_for_it(String username, String password, String errorMessage) {
        sendText(login.EnterEmailAddress, username);
        sendText(login.EnterPassword, password);
        doClick(login.ClickLoginBtn);

        String errorActual = login.errorMessage.getText();
        Assert.assertEquals(errorMessage,errorActual);
    }

    }

