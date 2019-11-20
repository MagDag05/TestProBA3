package Webstaurantstore.Tests;

import Webstaurantstore.Pages.PLPPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PLPTests extends BaseTest {

//
//    public PLPTests(WebDriver driver) {
//        super(driver);
//    }


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


  }
}
