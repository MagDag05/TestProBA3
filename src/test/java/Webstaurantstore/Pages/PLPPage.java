package Webstaurantstore.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;


public class PLPPage extends BasePage{


    public PLPPage(WebDriver driver) {
        super(driver);
    }

//    public static void openPage() { driver.get("https://www.webstaurantstore.com/");  }

    public static void searchField() {  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("searchval"))); }

    public static void searchForItem() {wait.until(ExpectedConditions.presenceOfElementLocated(By.id("searchval"))).sendKeys("825CI25MS");  }

    public static void clickOnSearchButton() { wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[value='Search']"))).click();    }

    public static void verifySearchResult() {
        String item = driver.findElement(By.cssSelector("[itemprop='Name']")).getText();
        Assert.assertEquals(item, "Valor 25 oz. Pre-Seasoned Mini Cast Iron Round Casserole Dish - 12/Case"); }


}
