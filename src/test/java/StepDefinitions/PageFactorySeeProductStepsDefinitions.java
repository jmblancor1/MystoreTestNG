package StepDefinitions;

import Utilities.PropertiesReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pageFactory.homePageFactory;
import pageFactory.loginPageFactory;
import pageFactory.seeProductDPageFactory;
import pageFactory.seeProductsPageFactory;

public class PageFactorySeeProductStepsDefinitions {
    private WebDriver driver = Hooks.driver;
    private WebDriverWait wait;

    public PageFactorySeeProductStepsDefinitions() throws Exception {

        PropertiesReader propertiesReader = new PropertiesReader();
        this.wait = new WebDriverWait(driver,propertiesReader.getTimeout());
    }


    loginPageFactory login;
    homePageFactory home;
    seeProductDPageFactory seeProduct;
    seeProductsPageFactory seeProducts;

    @Given("User is accessing myStore login Page")
    public void user_is_accessing_my_store_login_page() {
        login = new loginPageFactory(driver,wait);
        login.loginPageisDisplayed();
        login.clickSignin();
    }
    @When("User enters valid username and password")
    public void user_enters_valid_username_and_password() {
        loginPageFactory login = new loginPageFactory(driver,wait);
        login.loginPageisDisplayed();
        login.enterUsername("jmbr2004@gmail.com");
        login.enterPassword("Joyce.1984");
        login.clickLogin();
    }
    @Then("User should be able to navigate to Home Page")
    public void user_should_be_able_to_navigate_to_home_page() {
        homePageFactory home=new homePageFactory(driver,wait);
        home.validateCar();
        Assert.assertTrue(home.homePageIsDisplayed());
    }
    @And("User access to the clothes link")
    public void user_access_to_the_clothes_link() {
        homePageFactory home=new homePageFactory(driver,wait);
        home.clickClothes();
        Assert.assertTrue(home.homePageIsDisplayed());
    }
    @And("Click on the product")
    public void click_on_the_product() {
        seeProductsPageFactory seeProducts=new seeProductsPageFactory(driver,wait);
        seeProducts.clickShirt();
        seeProducts.productsClothesIsDisplayed();

    }
    @Then("User can see the details of the product")
    public void user_can_see_the_details_of_the_product() {

    }
    @Then("Clicks on Add to button")
    public void clicks_on_add_to_button() {

    }
    @Then("Item should be added to the car")
    public void item_should_be_added_to_the_car() {

    }

}
