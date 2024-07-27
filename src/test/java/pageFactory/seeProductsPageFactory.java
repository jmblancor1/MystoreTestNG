package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class seeProductsPageFactory {
    WebDriver driver;
    @FindBy(xpath = "//img[@alt='Hummingbird printed t-shirt']")
    WebElement lbl_shirt;

    public void clickShirt() {
        lbl_shirt.click();
    }
    public seeProductsPageFactory(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
}
