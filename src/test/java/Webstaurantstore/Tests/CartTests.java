package Webstaurantstore.Tests;
import Webstaurantstore.Pages.CartPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CartTests extends BaseTest{

    @BeforeClass
    private  CartPage initSetUp() {
        CartPage cartPage = new CartPage(driver);
        return cartPage;
    }


    @Test(description = " Shoping cart functionality")
    public void cartFunctionality()throws NullPointerException {
        CartPage.openPage();
        CartPage.addToCart();
        CartPage.clickOnCartButton();
        CartPage.verifyItemInCart();
        Assert.assertTrue(CartPage.verifyItemInCart()); }

        @Test (description = "Verify shoping cart is empty")

       public void verifyCartIsEmpty() {
        CartPage.clickEmptyCart();
        Assert.assertEquals(CartPage.verifyCartIsEmpty(), "Are you sure you want to empty your cart?");
        CartPage.clickEmptyCartButtonConfirmation();
        }
    }


