package StepDefinitions;

import PageObject.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;

public class LoginStepsDefinition {
    WebDriver driver;
    LoginPage login;

    @Given("User is on login page")
    public void user_is_on_login_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.testingyes.com/onlineshop/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='user-info']//a[@href='http://www.testingyes.com/onlineshop/my-account']")));
        loginButton.click();
    }

    @When("User enters valid username and password")
    public void user_enters_valid_username_and_password() {
        login = new LoginPage();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement emailElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email")));
        emailElement.sendKeys("jmbr2004@gmail.com");

        WebElement passwordElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        passwordElement.sendKeys("Joyce.1984");
    }

    @When("User enters valid {string} and {string}")
    public void user_enters_valid_and(String username, String password) {
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //WebElement emailElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email")));
        //emailElement.sendKeys(username);

        //WebElement passwordElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        //passwordElement.sendKeys(password);
        login.enterUserName(username);
        login.enterPassword(password);

    }


    @When("Clicks on Login Button")
    public void clicks_on_login_button() {
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("submit-login")));
        //loginButton.click();
        login.clickLoginButton();
    }

    @Then("User is navigated to Home Page")
    public void user_is_navigated_to_home_page() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Assert.assertTrue(driver.findElements(By.cssSelector(".logo")).size()>0,"user_is_navigated_to_home_page");
    }

    @Then("Close the browser")
    public void close_the_browser() {
        if (driver != null) {
            driver.quit();
        }
    }
}
