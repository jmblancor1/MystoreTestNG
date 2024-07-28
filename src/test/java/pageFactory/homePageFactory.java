package pageFactory;

import Utilities.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class homePageFactory extends BaseClass {
    static WebDriver driver;
    @FindBy(xpath = "//i[@class='material-icons shopping-cart']")
    @CacheLookup
    WebElement lbl_cart;
    @FindBy(xpath = "//li[@id='category-3']//a[@class='dropdown-item']")
    @CacheLookup
    WebElement lbl_clothes;
    @FindBy(xpath = "//a[@class='logout hidden-sm-down']")
    @CacheLookup
    WebElement lbl_signout;
    @FindBy(xpath = "//li[@id='category-6']//a[@class='dropdown-item']")
    @CacheLookup
    WebElement lbl_accessories;
    @FindBy(xpath = "//a[normalize-space()='Art']")
    @CacheLookup
    WebElement lbl_art;
    @FindBy(xpath = "//a[@id='identity-link']//span[@class='link-item']")
    @CacheLookup
    WebElement btn_information;
    @FindBy(xpath = "//i[contains(text(),'\uE567')]")
    @CacheLookup
    WebElement btn_addAddres;
    @FindBy(xpath = "//i[contains(text(),'\uE916')]")
    @CacheLookup
    WebElement btn_orderHistory;
    @FindBy(xpath = "//i[contains(text(),'\uE8B0')]")
    @CacheLookup
    WebElement btn_creditSlips;
    @FindBy(xpath = "//i[normalize-space()='account_box']")
    @CacheLookup
    WebElement btn_personalData;
    public boolean homePageIsDisplayed() {
        WaitUntilElementVisible(lbl_cart);
        lbl_cart.isDisplayed();
        WaitUntilElementVisible(lbl_clothes);
        lbl_clothes.isDisplayed();
        WaitUntilElementVisible(lbl_signout);
        lbl_signout.isDisplayed();
        WaitUntilElementVisible(lbl_accessories);
        lbl_accessories.isDisplayed();
        WaitUntilElementVisible(lbl_art);
        lbl_art.isDisplayed();
        WaitUntilElementVisible(btn_addAddres);
        btn_addAddres.isDisplayed();
        WaitUntilElementVisible(btn_information);
        btn_information.isDisplayed();
        WaitUntilElementVisible(btn_orderHistory);
        btn_orderHistory.isDisplayed();
        WaitUntilElementVisible(btn_creditSlips);
        btn_creditSlips.isDisplayed();
        WaitUntilElementVisible(btn_creditSlips);
        btn_personalData.isDisplayed();
        return true;
    }





    public void validateCar() {
        lbl_cart.isDisplayed();
    }
    public void clickClothes() {
        WaitUntilElementVisible(lbl_clothes);
        lbl_clothes.isEnabled();
        lbl_clothes.click();
    }
    public homePageFactory(WebDriver driver, WebDriverWait wait) {
        super(driver,wait);
        PageFactory.initElements(driver, this);
    }
}
