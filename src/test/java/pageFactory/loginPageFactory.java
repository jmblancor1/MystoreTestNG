package pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class loginPageFactory {
    WebDriver driver;
    @FindBy(name = "email")
    WebElement txt_username;
    @FindBy(name = "password")
    WebElement txt_password;
    @FindBy(xpath = "//div[@class='user-info']//a[@href='http://www.testingyes.com/onlineshop/my-account']")
    WebElement lbl_Signin;
    @FindBy(id = "submit-login")
    WebElement btn_login;
    @FindBy(xpath = "//img[@alt='My e-commerce']")
    WebElement lbl_logo;
    public void enterUsername(String username) {
        txt_username.sendKeys(username);
    }
    public void enterPassword(String password) {
        txt_password.sendKeys(password);
    }
    public void clickLogin() {
        btn_login.click();
    }

    public void clickSignin() {
        lbl_Signin.click();
    }
    public loginPageFactory(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
//    public void validateLogo() {
//        lbl_logo.isDisplayed();
//    }

}
