package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    WebDriver driver;
    By txt_username= By.name ("email");
    By txt_password= By.name("password");
    By btn_login=By.id("submit-login");
    By lbl_logo=By.cssSelector(".logo");

    public void enterUserName (String userName){
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       WebElement emailElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email")));
       driver.findElement(txt_username).sendKeys(userName);
    }

    public void enterPassword (String password){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement passwordElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        driver.findElement(txt_password).sendKeys(password);
    }

    public void clickLoginButton (){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(btn_login));
        driver.findElement(btn_login).click();
    }
}
