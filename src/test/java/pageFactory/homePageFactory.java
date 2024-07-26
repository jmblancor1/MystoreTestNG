package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePageFactory {
    static WebDriver driver;
    @FindBy(xpath = "//i[@class='material-icons shopping-cart']")
    WebElement lbl_cart;
    public void validateCar() {
        lbl_cart.isDisplayed();
    }
    public homePageFactory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
