package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class seeProductDPageFactory {
    WebDriver driver;

    @FindBy(xpath = "//img[@alt='Hummingbird printed t-shirt']")
    WebElement lbl_titShirt;

    public String validateTitShirt(){

        return    lbl_titShirt.getText();

    }
    public seeProductDPageFactory(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
}
