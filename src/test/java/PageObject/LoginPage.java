package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    WebDriver driver;
    By lbl_Signin = By.xpath("//div[@class='user-info']//a[@href='http://www.testingyes.com/onlineshop/my-account']");
    By txt_username= By.name("email");
    By txt_password= By.name("password");
    By btn_login=By.id("submit-login");
    By lbl_logo=By.cssSelector(".logo");

    public LoginPage(WebDriver driver) {
        this.driver=driver;
    }
    public void clickSignIn() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement linkSigIn = wait.until(ExpectedConditions.elementToBeClickable(lbl_Signin));
        linkSigIn.click();

    }
    public void enterUserName(String userName) {
        driver.findElement(txt_username).sendKeys(userName);
    }
    public void enterPassword(String password) {

        driver.findElement(txt_password).sendKeys(password);
    }
    public void clickLogin() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(btn_login));
        // locate the element using AutomaticDataLockTimed locator
        loginButton.click();
        //driver.findElement((By)loginButton).click();
    }
    public void userLogin(String username, String password) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement emailElement = wait.until(ExpectedConditions.visibilityOfElementLocated(txt_username));
        driver.findElement((By)emailElement).sendKeys(username);
        WebElement passwordElement = wait.until(ExpectedConditions.visibilityOfElementLocated(txt_password));
        driver.findElement((By) passwordElement).sendKeys(password);
    }
    public void isLogoDisplayed() {
        driver.findElement(lbl_logo).isDisplayed();
    }
}
