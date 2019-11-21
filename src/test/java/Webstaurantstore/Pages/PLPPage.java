package Webstaurantstore.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;



public class PLPPage extends BasePage{

    @FindBy (id = "searchval")
    private static WebElement navigateSearchField;

    @FindBy (css = "[value='Search']")
    private static WebElement searchButton;

    @FindBy (css = "[itemprop='Name']")
    private static WebElement resultOfSearch;



    public PLPPage(WebDriver driver) {
        super(driver);
    }

    public static void searchField() {  wait.until(ExpectedConditions.elementToBeClickable(navigateSearchField)); }

    public static void searchForItem() {wait.until(ExpectedConditions.visibilityOf(navigateSearchField)).sendKeys("825CI25MS");  }

    public static void clickOnSearchButton() { wait.until(ExpectedConditions.elementToBeClickable(searchButton)).click();    }

    public static String verifySearchResult() {
       String item = (resultOfSearch).getText();
       return item;
//        Assert.assertEquals(item, "Valor 25 oz. Pre-Seasoned Mini Cast Iron Round Casserole Dish - 12/Case");
        }


}
