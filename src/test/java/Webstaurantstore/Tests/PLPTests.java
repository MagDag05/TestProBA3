package Webstaurantstore.Tests;

import Webstaurantstore.Pages.PLPPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PLPTests extends BaseTest {


    @BeforeMethod
    private PLPPage initSetUp() {
        PLPPage plpPage = new PLPPage(driver);
        return plpPage;
    }

  @Test(description = "Search on PLP page")
    public void searchOnPlpPage() {
        PLPPage plpPage = initSetUp();
        PLPPage.searchField();
        PLPPage.searchForItem();
        PLPPage.clickOnSearchButton();
        PLPPage.verifySearchResult();
      Assert.assertEquals(PLPPage.verifySearchResult(), "Valor 25 oz. Pre-Seasoned Mini Cast Iron Round Casserole Dish - 12/Case");


  }
}
