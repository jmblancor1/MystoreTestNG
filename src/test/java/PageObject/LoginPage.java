package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
        driver.findElement(txt_username).sendKeys(userName);
    }

    public void enterPassword (String password){
        driver.findElement(txt_password).sendKeys(password);
    }

    public void clickLoginButton (){
        driver.findElement(btn_login).click();
    }
}
