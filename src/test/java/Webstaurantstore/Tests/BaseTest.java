package Webstaurantstore.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    WebDriver driver;
    WebDriverWait wait;
//
//    //it defines what driver to use
//    public BaseTest(WebDriver driver){
//        this.driver = driver;
//        WebDriverWait wait = new WebDriverWait(driver,10);
//    }


    @BeforeMethod
    public void setupBeforeMethodp() {
        driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver,10);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.webstaurantstore.com/");
    }

    @AfterMethod
    public void setupAfterMethod() {
        driver.quit();
    }
}


