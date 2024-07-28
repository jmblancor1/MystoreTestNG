package StepDefinitions;

import Utilities.PropertiesReader;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pageFactory.loginPageFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageFactory.homePageFactory;
import pageFactory.loginPageFactory;

import java.time.Duration;

public class PageFactoryLoginStepsDefinition {

    private WebDriver driver = Hooks.driver;
    private WebDriverWait wait;




    public PageFactoryLoginStepsDefinition() throws Exception {
        PropertiesReader propertiesReader = new PropertiesReader();
<<<<<<< HEAD
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(propertiesReader.getTimeout()));
=======
        this.wait = new WebDriverWait(driver,propertiesReader.getTimeout());
>>>>>>> 9bf25ddc2f819aa4a88f4cc23634437534af7003
    }



    loginPageFactory login;
    homePageFactory home;


    @Given("User is on login page")
    public void user_is_on_login_page() {
        login = new loginPageFactory(driver,wait);
<<<<<<< HEAD
=======
        login.loginPageisDisplayed();
>>>>>>> 9bf25ddc2f819aa4a88f4cc23634437534af7003
        login.clickSignin();

    }

    @When("User enters valid {string} and {string}")
    public void user_enters_valid_and(String username, String password) throws InterruptedException {

        loginPageFactory login = new loginPageFactory(driver,wait);
        login.loginPageisDisplayed();
        login.enterUsername(username);
        login.enterPassword(password);

    }

    @And("Clicks on Login Button")
    public void clicks_on_login_button() {
        loginPageFactory login = new loginPageFactory(driver,wait);
        login.clickLogin();
    }

    @Then("User is navigated to Home Page")
    public void user_is_navigated_to_home_page() {
        homePageFactory home=new homePageFactory(driver,wait);
        home.validateCar();
        Assert.assertTrue(home.homePageIsDisplayed());

    }

    @And("Close the browser")
    public void close_the_browser() {
        if (driver != null) {
            driver.quit();
        }
    }
}
