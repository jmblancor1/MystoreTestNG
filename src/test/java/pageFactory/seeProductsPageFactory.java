package pageFactory;

import Utilities.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class seeProductsPageFactory extends BaseClass {
    WebDriver driver;
    @FindBy(xpath = "//img[@alt='Hummingbird printed t-shirt']")
    WebElement lbl_shirt;
    @FindBy(xpath = "//h1[@class='h1']")
    WebElement lbl_titClothes;
    @FindBy(xpath = "//p[@class='h6 facet-title hidden-sm-down'][normalize-space()='Categories']")
    WebElement lbl_filterCategories;
    @FindBy(xpath = "//p[@class='h6 facet-title hidden-sm-down'][normalize-space()='Size']")
    WebElement lbl_filterSize;

    @FindBy(xpath = "//p[@class='h6 facet-title hidden-sm-down'][normalize-space()='Color']")
    WebElement lbl_filColor;
    @FindBy(xpath = "//p[@class='h6 facet-title hidden-sm-down'][normalize-space()='Property']")
    WebElement lbl_filterProperty;
    @FindBy(xpath = "//p[@class='h6 facet-title hidden-sm-down'][normalize-space()='Price']")
    WebElement lbl_filterPrice;
    @FindBy(xpath = "//ul[@class='category-sub-menu']//a[contains(text(),'Men')]")
    WebElement lbl_filterMen;
    @FindBy(xpath = "//ul[@class='category-sub-menu']//a[contains(text(),'Women')]")
    WebElement lbl_filterWomen;

    public boolean productsClothesIsDisplayed() {
        WaitUntilElementVisible(lbl_filterMen);
        lbl_filterMen.isDisplayed();
        WaitUntilElementVisible(lbl_filterWomen);
        lbl_filterWomen.isDisplayed();
        WaitUntilElementVisible(lbl_titClothes);
        lbl_titClothes.isDisplayed();
        WaitUntilElementVisible(lbl_shirt);
        lbl_shirt.isDisplayed();
        WaitUntilElementVisible(lbl_filterCategories);
        lbl_filterCategories.isDisplayed();
        WaitUntilElementVisible(lbl_filterSize);
        lbl_filterSize.isDisplayed();
        WaitUntilElementVisible(lbl_filColor);
        lbl_filColor.isDisplayed();
        WaitUntilElementVisible(lbl_filterProperty);
        lbl_filterProperty.isDisplayed();
        WaitUntilElementVisible(lbl_filterPrice);
        lbl_filterPrice.isDisplayed();

        return true;
    }

    public void clickShirt() {
        lbl_shirt.click();
    }
    public seeProductsPageFactory(WebDriver driver, WebDriverWait wait)
    {
        super(driver, wait);
        PageFactory.initElements(driver, this);
    }
}
