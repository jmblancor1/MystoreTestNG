package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePageFactory {
    static WebDriver driver;
    @FindBy(xpath = "//i[@class='material-icons shopping-cart']")
    WebElement lbl_cart;
    @FindBy(xpath = "//li[@id='category-3']//a[@class='dropdown-item']")
    WebElement lbl_clothes;
    public void validateCar() {
        lbl_cart.isDisplayed();
    }
    public void clickClothes() {
        lbl_clothes.click();
    }
    public homePageFactory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
