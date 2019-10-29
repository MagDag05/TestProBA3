package Mobile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class AzatTestExample {

WebDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("BROWSER_NAME", "Android");
//        capabilities.setCapability("VERSION", "4.4.2");
        capabilities.setCapability("deviceName","emulator-5554");
        capabilities.setCapability("platformName","Android");


        capabilities.setCapability("appPackage", "com.android.calculator2");
// This package name of your app (you can get it from apk info app)
        capabilities.setCapability("appActivity","com.android.calculator2.Calculator"); // This is Launcher activity of your app (you can get it from apk info app)
//Create RemoteWebDriver instance and connect to the Appium server
        //It will launch the Calculator App in Android Device using the configurations specified in Desired Capabilities
        driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    @Test
    public void testCal() throws Exception {
        //locate the Text on the calculator by using By.name()
        WebElement two=driver.findElement(By.id("com.android.calculator2:id/digit_2"));
        two.click();
        WebElement plus=driver.findElement(By.id("com.android.calculator2:id/op_add"));
        plus.click();
        WebElement four=driver.findElement(By.id("com.android.calculator2:id/digit_4"));
        four.click();
        WebElement equalTo=driver.findElement(By.id("com.android.calculator2:id/eq"));
        equalTo.click();
        //locate the edit box of the calculator by using By.tagName()
        WebElement results=driver.findElement(By.id("com.android.calculator2:id/result"));
        //Check the calculated value on the edit box
        assert results.getText().equals("6"):"Actual value is : "+results.getText()+" did not match with expected value: 6";

    }

    @AfterClass
    public void teardown(){
        //close the app
        driver.quit();
    }
}


