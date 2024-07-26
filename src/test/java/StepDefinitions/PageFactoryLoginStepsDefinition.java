package StepDefinitions;

import PageObject.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageFactory.homePageFactory;
import pageFactory.loginPageFactory;

public class PageFactoryLoginStepsDefinition {
    WebDriver driver;
    loginPageFactory login;
    homePageFactory home;
    @Given("User is on login page")
    public void user_is_on_login_page() {
        WebDriverManager.chromedriver().setup();
        //System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\chrome\\version_115\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().deleteAllCookies();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("http://www.testingyes.com/onlineshop/");
        login = new loginPageFactory(driver);
        login.clickSignin();

    }

    @When("User enters valid {string} and {string}")
    public void user_enters_valid_and(String username, String password) throws InterruptedException {

        //login = new loginPageFactory(driver);
        login.enterUsername(username);
        login.enterPassword(password);
    }

    @And("Clicks on Login Button")
    public void clicks_on_login_button() {

        login.clickLogin();
    }

    @Then("User is navigated to Home Page")
    public void user_is_navigated_to_home_page() {
        home=new homePageFactory(driver);
        home.validateCar();
        System.out.println("test factory");
    }

    @And("Close the browser")
    public void close_the_browser() {
        if (driver != null) {
            driver.quit();
        }
    }
}
