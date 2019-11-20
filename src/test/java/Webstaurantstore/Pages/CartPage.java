package Webstaurantstore.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.List;

public class CartPage extends BasePage{


    @FindBy (css = "https://www.webstaurantstore.com/valor-25-oz-pre-seasoned-cast-iron-round-server-pack/825CI25MS.html")
     private static WebElement openPage;

    @FindBy ( id = "buyButton")
    private static WebElement buyButton;

    @FindBy (css = "[class*='emptyCartButton']")
    private static WebElement emptyCartButton;

    @FindBy (css = "[class='itemDescription description']>a")
    private static List <WebElement> listOfElementsInCart;

    @FindBy (css = "[class*='modal-header ']>h3")
    public static WebElement textOnEmptyCart;

//    @FindBy (xpath = "//button[contains(text(),'Empty')")
//    private static EmptyCartButtonConfirmation;

    public CartPage(WebDriver driver) {
        super(driver);

    }


    public  static void openPage() { driver.get("https://www.webstaurantstore.com/valor-25-oz-pre-seasoned-cast-iron-round-server-pack/825CI25MS.html"); }

    public static void addToCart() { wait.until(ExpectedConditions.elementToBeClickable(buyButton)).click();  }

    public static void clickOnCartButton() { wait.until(ExpectedConditions.elementToBeClickable(By.id("cartItemCountSpan"))).click();  }

    public static boolean verifyItemInCart() {
        List<WebElement> Cart = listOfElementsInCart;
        System.out.println(Cart.size());
        Boolean quantity = false;
        for (int i =0; i<=Cart.size(); i++)
        {String cartText = Cart.get(i).getText();
            if (cartText.equals("Valor 25 oz. Pre-Seasoned Mini Cast Iron Round Casserole Dish - 12/Case"))
            {quantity = true;
                break;}}
        return quantity;
    }


    public static void clickEmptyCart() { wait.until(ExpectedConditions.elementToBeClickable(emptyCartButton)).click();   }

//
//    public static String verifyCartIsEmpty() {
//        String emptyCart = wait.until(ExpectedConditions.visibilityOf (textOnEmptyCart)).getText();
//       return  emptyCart;
//        Assert.assertEquals(emptyCart, "Empty Cart");
//    }

    public static void clickEmptyCartButtonConfirmation() { wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Empty')]"))).click();  }

}
