package Mobile;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AutomateMyPhone extends BaseScript {




    @Test

  public void nordVPN() {

        driver.findElement(By.xpath("//android.widget.TextView[@content-desc='NordVPN']")).click();





    }

}
