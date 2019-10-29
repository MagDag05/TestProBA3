package Mobile;


import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidSampleTest {

//    public AndroidDriver driver;
//
//    public static void main(String[] args) throws MalformedURLException {

    WebDriver driver;

    @BeforeMethod

      public void driverStarts() throws MalformedURLException{


        String AppiumServerURL = "http://127.0.0.1:4723/wd/hub";

            DesiredCapabilities dc = new DesiredCapabilities();
            dc.setCapability("BROWSER_NAME", "Android");
            dc.setCapability("platformName", "Android");
//            dc.setCapability("deviceName", "emulator-5554");
            dc.setCapability("deviceName", "HT73X0204745");
//            dc.setCapability("PlatformVersion", "9.0");
            dc.setCapability("appPackage", "com.android.calculator2");

            dc.setCapability("appActivity","com.android.calculator2.Calculator");

//            dc.setCapability("AutomationName", "UiAutomator2");

            driver = new RemoteWebDriver(new URL(AppiumServerURL), dc);
        }

            @Test
            public void firstTest () throws InterruptedException {
                driver.findElement(By.id("com.android.calculator2:id/digit_7")).click();


            }

@AfterMethod
   public void driverQuite() {
    driver.quit();
}}


//    }










