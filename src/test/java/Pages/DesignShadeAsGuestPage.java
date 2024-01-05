package Pages;

import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DesignShadeAsGuestPage extends CommonMethods {

    public DesignShadeAsGuestPage (){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='header-buttons desktop-btn']//a[@class='btn'][normalize-space()='Design & Buy']")
    public WebElement clickDesignAndBuyBtn;

    @FindBy(xpath = "//div[@data-name='Roller']")
    public WebElement clickOnRollerStyle;

    @FindBy(xpath = "//a[normalize-space()='Next']")
    public WebElement clickOnNextBtn1;



    @FindBy(xpath = "//select[@id='width']")
    public WebElement selectWidth;

    @FindBy(xpath = "//select[@id='width-fraction']")
    public WebElement selectWidthFraction;

    @FindBy(xpath = "//select[@id='height']")
    public WebElement selectHeight;

    @FindBy(xpath = "//select[@id='height-fraction']")
    public WebElement selectHeightFraction;


    @FindBy(xpath = "//a[contains(.,'Next')]")
    public WebElement clickNextBtn2;

    @FindBy(xpath = "//div[@data-value='Battery']")
    public WebElement selectBattery;

    @FindBy(xpath = "//a[normalize-space()='Next']")
    public WebElement clickNextBtn3;

    @FindBy(xpath = "//*[@id=\"mount-type\"]/div[4]/div[1]/div[1]")
    public WebElement selectMountingType;

    @FindBy(xpath = "//div[@data-value='Architectural Fascia']")
    public WebElement selectHeadrailOption;

    @FindBy(xpath = "//a[normalize-space()='Next']")
    public WebElement clickNextBtn4;

    @FindBy(xpath = "//div[@data-value='blackout']")
    public WebElement selectFabricStyle;

    @FindBy(xpath = "//a[normalize-space()='Next']")
    public WebElement clickNextBtn5;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/main[1]/main[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[9]/div[1]/div[1]/div[1]/div[2]/div[1]/div[6]/div[1]/div[1]/div[1]")
    public WebElement selectColor;

    @FindBy(xpath = "//*[@id=\"arch-finish-color-choice\"]/div[3]/div")
    public WebElement selectFasciaFinishColor;




    @FindBy(xpath = "//a[normalize-space()='Next']")
    public WebElement clickNextBtn6;

    @FindBy(xpath = "//div[@data-value='remotes|pico|connectedhome']//div[@class='option-img option-selectable']")
    public WebElement selectShadeControlOption;

    @FindBy(xpath = "//div[@id='prod-197411']//div[@class='option-img accessories-item option-selectable']")
    public WebElement selectPicoRemote;

    @FindBy(xpath = "//div[@id='prod-197411']//select[@class='product-select']")
    public WebElement selectColorLAfromDdMenu;

    @FindBy(xpath = "//a[normalize-space()='Next']")
    public WebElement clickNextBtn7;

    @FindBy(xpath = "//input[@id='name']")
    public WebElement enterTheShadeLocation;

    @FindBy(xpath = "//a[@id='addcart']")
    public WebElement addItemToCart;

























}
