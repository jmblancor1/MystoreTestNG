package StepDefinitions;

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

    @Given("User is on login page")
    public void user_is_on_login_page() {
        WebDriverManager.chromedriver().setup();
        //System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\chrome\\version_115\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().deleteAllCookies();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("http://www.testingyes.com/onlineshop/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='user-info']//a[@href='http://www.testingyes.com/onlineshop/my-account']")));
        loginButton.click();
    }

    @When("User enters valid username and password")
    public void user_enters_valid_username_and_password() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement emailElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email")));
        emailElement.sendKeys("jmbr2004@gmail.com");

        WebElement passwordElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        passwordElement.sendKeys("Joyce.1984");
    }

    @When("Clicks on Login Button")
    public void clicks_on_login_button() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("submit-login")));
        loginButton.click();
    }

    @Then("User is navigated to Home Page")
    public void user_is_navigated_to_home_page() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        boolean isHomePage = wait.until(ExpectedConditions.urlToBe('http://www.testingyes.com/onlineshop/my-account\');
        Assert.assertTrue(isHomePage, "User is navigated to Home Page");
    }

    @Then("Close the browser")
    public void close_the_browser() {
        if (driver != null) {
            driver.quit();
        }
    }
}
