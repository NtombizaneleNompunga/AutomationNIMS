package pages.MainMenu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.test.NIMS.base.NIMSBase;
import com.test.NIMS.pages.MainMenuPage;

public class MainMenu {
	
  @Test(enabled = false)
  public void testNavigateToReportProblem()throws InterruptedException {
	
	  Thread.sleep(2000);
	  WebElement myProfile = NIMSBase.wait.until(ExpectedConditions.
				visibilityOfElementLocated
				(By.xpath(MainMenuPage.myProfile)));
	  myProfile.click();
		
	  Thread.sleep(2000);
      WebElement myRequest = NIMSBase.wait.until(ExpectedConditions.
				visibilityOfElementLocated
				(By.xpath(MainMenuPage.myRequest)));
	  myRequest.click(); 
	  
	  Thread.sleep(2000); 
	  WebElement reportProblem = NIMSBase.wait.until(ExpectedConditions.
				visibilityOfElementLocated
				(By.xpath(MainMenuPage.reportProblem)));
	  reportProblem.click();
  }
}
