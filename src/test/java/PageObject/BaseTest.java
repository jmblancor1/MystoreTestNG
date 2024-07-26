package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseTest {
    WebDriver driver = new ChromeDriver();
    @BeforeTest
    void Setup(){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\chrome\\version_115\\chromedriver.exe");


        driver.get("http://www.testingyes.com/onlineshop/");

    }
    @AfterTest
    void TearDown(){

        driver.close();
        driver.quit();
    }
    @Test
    void test(){

        String title = driver.getTitle();
        System.out.println(title);

    }
}
