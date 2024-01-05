package StepDefinitions;

import Utils.CommonMethods;
import io.cucumber.java.en.*;

public class DesignShadeAsGuest extends CommonMethods {

    @When("user clicked on Design and Buy button")
    public void user_clicked_on_design_and_buy_button() {
        doClick(designShadeAsGuest.clickDesignAndBuyBtn);
    }
    @When("user clicked to select Roller as a shade style")
    public void user_clicked_to_select_roller_as_a_shade_style() {
        //sleep(2000);
    doClick(designShadeAsGuest.clickOnRollerStyle);

    }

    @When("user clicked on Next button")
    public void user_clicked_on_next_button() {
        //sleep(2000);
        jsScroll500();
        doClick(designShadeAsGuest.clickOnNextBtn1);

    }
    @Then("user entered the desired Measurements {string} and {string} and {string} and {string}")
    public void user_entered_the_desired_measurements_and_and_and(String width, String widthfraction, String height, String heightfraction)  {

        clickDropDown(designShadeAsGuest.selectWidth).selectByVisibleText(width);
        //sleep(2000);
        clickDropDown(designShadeAsGuest.selectWidthFraction).selectByVisibleText(widthfraction);
        //sleep(2000);
        clickDropDown(designShadeAsGuest.selectHeight).selectByVisibleText(height);
        //sleep(2000);
        clickDropDown(designShadeAsGuest.selectHeightFraction).selectByVisibleText(heightfraction);
    }

    @Then("user clicked Next Button")
    public void user_clicked_next_button() {
        //sleep(2000);
        jsScroll300();
        doClick(designShadeAsGuest.clickNextBtn2);
    }

    @Then("user clicked to select Battery Powered option")
    public void user_clicked_to_select_battery_powered_option() {
        //sleep(2000);
        doClick(designShadeAsGuest.selectBattery);
    }

    @Then("user click on Next Button")
    public void user_click_on_next_button() {
        //sleep(2000);
        doClick(designShadeAsGuest.clickNextBtn3);
    }

    @Then("user clicked to Choose Mounting Type inside Mount")
    public void user_clicked_to_choose_mounting_type_inside_mount() {
        //sleep(2000);
        doClick(designShadeAsGuest.selectMountingType);
        //sleep(2000);
        jsScroll500();
    }

    @Then("user clicked to choose the Headrail Option Architectural Fascia")
    public void user_clicked_to_choose_the_headrail_option_architectural_fascia() {
        //sleep(2000);
        jsScroll300();
        doClick(designShadeAsGuest.selectHeadrailOption);

    }

        @When("user clicked on the Next button")
    public void user_clicked_on_the_next_button() {
            //sleep(2000);
            jsScroll300();
            //sleep(2000);
        doClick(designShadeAsGuest.clickNextBtn4);
    }
    @Then("user clicked to Choose the Fabric Style")
    public void user_clicked_to_choose_the_fabric_style() {
        //sleep(2000);
        doClick(designShadeAsGuest.selectFabricStyle);
    }

    @Then("user clicked on Next btn")
    public void user_clicked_on_next_btn() {
        sleep(2000);
        doClick(designShadeAsGuest.clickNextBtn5);
    }

    @Then("user clicked to select Fabric Collection Color Red")
    public void user_clicked_to_select_fabric_collection_color_red() {
        sleep(2000);
        doClick(designShadeAsGuest.selectColor);
        //sleep(2000);
        jsScroll1000();
        jsScroll500();
        //sleep(2000);
        doClick(designShadeAsGuest.selectFasciaFinishColor);

    }

    @Then("user clicked on next BTN6")
    public void user_clicked_on_next_btn6() {
        //sleep(2000);
        jsScroll500();
        //sleep(2000);
        doClick(designShadeAsGuest.clickNextBtn6);

    }
    @Then("used select the shade control option")
    public void used_select_the_shade_control_option() {
        //sleep(2000);
        doClick(designShadeAsGuest.selectShadeControlOption);

    }
    @Then("user select Pico 3button")
    public void user_select_pico_3button() {
        //sleep(2000);
        doClick(designShadeAsGuest.selectPicoRemote);

    }
    @Then("user select Pico color Light Almond {string}")
    public void user_select_pico_color_light_almond(String PicoColor) {
        //sleep(2000);
        jsScroll300();
        //sleep(2000);
        clickDropDown(designShadeAsGuest.selectColorLAfromDdMenu).selectByVisibleText(PicoColor);

    }
    @Then("user clicked next BTN7")
    public void user_clicked_next_btn7() {
        //sleep(2000);
        jsScroll500();
        //sleep(2000);
        doClick(designShadeAsGuest.clickNextBtn6);

    }
    @Then("used Enter Shade Location Name {string}")
    public void used_enter_shade_location_name(String ShadeLocation) {
        //sleep(2000);
        sendText(designShadeAsGuest.enterTheShadeLocation, ShadeLocation);

    }
    @Then("used Add item to Cart")
    public void used_add_item_to_cart() {
        //sleep(2000);
        doClick(designShadeAsGuest.addItemToCart);


    }


}
