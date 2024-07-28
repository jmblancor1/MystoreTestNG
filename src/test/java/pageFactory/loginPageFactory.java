package pageFactory;

import Utilities.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class loginPageFactory extends BaseClass {

    public loginPageFactory(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
        PageFactory.initElements(driver, this);
    }

    WebDriver driver;
    @FindBy(name = "email")
    @CacheLookup
    private WebElement txt_username;

    @FindBy(name = "password")
    @CacheLookup
    private WebElement txt_password;

    @FindBy(xpath = "//div[@class='user-info']//a[@href='http://www.testingyes.com/onlineshop/my-account']")
    @CacheLookup
    private WebElement lbl_Signin;

    @FindBy(id = "submit-login")
    @CacheLookup
    private WebElement btn_login;
    @FindBy(xpath = "//h1[normalize-space()='Log in to your account']")
    @CacheLookup
    private WebElement lbl_titLogin;

    @FindBy(xpath = "//img[@alt='My e-commerce']")
    @CacheLookup
    private WebElement lbl_logo;
    @FindBy(xpath = "//a[normalize-space()='Forgot your password?']")
    @CacheLookup
    private WebElement lbl_forgotPassword;
    @FindBy(xpath = "//a[normalize-space()='No account? Create one here']")
    @CacheLookup
    private WebElement lbl_createAccount;



    public void enterUsername(String username) {
        WaitUntilElementVisible(txt_username);
        txt_username.isEnabled();
        txt_username.clear();
        txt_username.sendKeys(username);
    }
    public void enterPassword(String password) {
        WaitUntilElementVisible(txt_password);
        txt_password.isEnabled();
        txt_password.sendKeys(password);
    }
    public boolean loginPageisDisplayed(){
        WaitUntilElementVisible(lbl_titLogin);
        lbl_titLogin.isDisplayed();
        WaitUntilElementVisible(txt_username);
        txt_username.isDisplayed();
        WaitUntilElementVisible(txt_password);
        txt_password.isDisplayed();
        WaitUntilElementVisible(btn_login);
        btn_login.isDisplayed();
        WaitUntilElementVisible(lbl_forgotPassword);
        lbl_forgotPassword.isDisplayed();
        WaitUntilElementVisible(lbl_createAccount);
        lbl_createAccount.isDisplayed();

        return true;
    }
    public void clickLogin() {
        btn_login.click();
    }

    public void clickSignin() {
        lbl_Signin.click();
    }


}
