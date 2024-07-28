package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class seeProductDPageFactory {
    WebDriver driver;

    @FindBy(xpath = "//img[@alt='Hummingbird printed t-shirt']")
    WebElement lbl_titShirt;
    @FindBy(xpath = "//span[@itemprop='price']")
    WebElement lbl_price;
    @FindBy(xpath = "//span[normalize-space()='Size']")
    WebElement lbl_size;
    @FindBy(xpath = "//span[normalize-space()='Quantity']")
    WebElement lbl_quantity;
    @FindBy(xpath = "//button[@class='btn btn-primary add-to-cart']")
    WebElement btn_addCart;
    @FindBy(xpath = "//a[normalize-space()='Description']")
    WebElement lbl_despcription;
    @FindBy(xpath = "//a[normalize-space()='Product Details']")
    WebElement lbl_detailProduct;



    public String validateTitShirt(){

        return    lbl_titShirt.getText();

    }
    public seeProductDPageFactory(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
}
