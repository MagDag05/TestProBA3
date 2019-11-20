package Webstaurantstore.Tests;

import Webstaurantstore.Pages.CartPage;
import Webstaurantstore.Pages.PLPPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CartTests extends BaseTest{

//
//    public CartTests(WebDriver driver) {
//        super(driver);
//    }

    @BeforeMethod
    private  CartPage initSetUp() {
        CartPage cartPage = new CartPage(driver);
        return cartPage;
    }

    @Test(description = " Shoping cart functionality")
    public void cartFunctionality()throws NullPointerException {
        CartPage cartPage = initSetUp();
        CartPage.openPage();
        CartPage.addToCart();
        CartPage.clickOnCartButton();
        CartPage.verifyItemInCart();

        CartPage.clickEmptyCart();
//        CartPage.verifyCartIsEmpty();
//        String emptyCart = wait.until(ExpectedConditions.visibilityOf (driver.findElement(By.cssSelector("[class*='modal-header ']>h3")))).getText();
        Assert.assertEquals(CartPage.verifyCartIsEmpty(), "Empty Cart");
        CartPage.clickEmptyCartButtonConfirmation();
    }

}
