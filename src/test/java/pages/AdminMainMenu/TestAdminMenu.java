package pages.AdminMainMenu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.test.NIMS.base.NIMSBase;
import com.test.NIMS.pages.AdminMainMenuPage;
import com.test.NIMS.util.Utility;

public class TestAdminMenu {
	
	
  @Test(enabled=true,priority = 4)
  public void testNavigateToMarketingAndSalesService() throws InterruptedException {
	  
	  Thread.sleep(5000);
	  WebElement mss = NIMSBase.wait.until(ExpectedConditions.
				visibilityOfElementLocated
				(By.xpath(AdminMainMenuPage.mss)));
	   mss.click();
	 // helpDesk.sendKeys(Keys.ARROW_DOWN);
	  //Thread.sleep(Utility.WAIT_TIME);
	  //helpDesk.sendKeys(Keys.ENTER);
	  //Thread.sleep(Utility.WAIT_TIME);
	  //helpDesk.sendKeys(Keys.ENTER);
	  //helpDesk.sendKeys(Keys.ARROW_RIGHT);
	  //take key down from this one
	  
		  Thread.sleep(Utility.WAIT_TIME);
		  WebElement marketingAndSalesService =
		  NIMSBase.wait.until(ExpectedConditions.
				  visibilityOfElementLocated
		  (By.xpath(AdminMainMenuPage.marketingAndSalesService))); 
		  marketingAndSalesService.click();
		  
		  
		  Thread.sleep(Utility.WAIT_TIME);
		  WebElement SOWWorkhead =
		  NIMSBase.wait.until(ExpectedConditions.
				  visibilityOfElementLocated
		  (By.xpath(AdminMainMenuPage.SOWWorkhead))); 
		  SOWWorkhead.click();
		
  }
}
