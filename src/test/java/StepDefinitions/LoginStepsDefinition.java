//package StepDefinitions;
//
//import PageObject.LoginPage;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class LoginStepsDefinition {
//    WebDriver driver;
//    LoginPage login;
//    @Given("User is on login page")
//    public void user_is_on_login_page() {
//        WebDriverManager.chromedriver().setup();
//        //System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\chrome\\version_115\\chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        //driver.manage().deleteAllCookies();
//        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//        driver.get("http://www.testingyes.com/onlineshop/");
//        login = new LoginPage(driver);
//        login.clickSignIn();
//
//    }
//
//    @When("User enters valid {string} and {string}")
//    public void user_enters_valid_and(String username, String password) throws InterruptedException {
//
//        login = new LoginPage(driver);
//        login.enterUserName(username);
//        login.enterPassword(password);
//    }
//
//    @And("Clicks on Login Button")
//    public void clicks_on_login_button() {
//
//        login.clickLogin();
//    }
//
//    @Then("User is navigated to Home Page")
//    public void user_is_navigated_to_home_page() {
//        login.isLogoDisplayed();
//    }

//    @And("Close the browser")
//    public void close_the_browser() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }
//}
