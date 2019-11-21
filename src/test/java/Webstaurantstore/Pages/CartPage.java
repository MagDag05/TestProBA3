package Webstaurantstore.Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.List;

public class CartPage extends BasePage{


    @FindBy (css = "https://www.webstaurantstore.com/valor-25-oz-pre-seasoned-cast-iron-round-server-pack/825CI25MS.html")
     private static WebElement openPage;

    @FindBy ( id = "buyButton")
    private static WebElement addToCartButton;

    @FindBy (id = "cartItemCountSpan")
    private static WebElement cartButton;

    @FindBy (css = "[class='itemDescription description']>a")
    private static List <WebElement> listOfElementsInCart;

    @FindBy (css = "[class*='emptyCartButton']")
    private static WebElement emptyCartButton;

    @FindBy (xpath = "//*[contains(text(), 'Are you sure you want to empty your cart?')]")
    private static WebElement textOnEmptyCart;

    @FindBy (xpath = "//button[contains(text(),'Empty')]")
    private static WebElement emptyButtonConfirmation;



    public CartPage(WebDriver driver) {
        super(driver);

    }

    public  static void openPage() {  driver.get("https://www.webstaurantstore.com/valor-25-oz-pre-seasoned-cast-iron-round-server-pack/825CI25MS.html"); }


    public static void addToCart() { wait.until(ExpectedConditions.elementToBeClickable(addToCartButton)).click();  }


    public static void clickOnCartButton() { wait.until(ExpectedConditions.elementToBeClickable(cartButton)).click();  }

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


    public static String verifyCartIsEmpty() {
      String emptyCart = wait.until(ExpectedConditions.visibilityOf (textOnEmptyCart)).getText();
       return  emptyCart;
    }

    public static void clickEmptyCartButtonConfirmation() { wait.until(ExpectedConditions.elementToBeClickable(emptyButtonConfirmation)).click();  }

}
