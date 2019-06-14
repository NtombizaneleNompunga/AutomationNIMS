package pages.OpenRequests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.test.NIMS.base.NIMSBase;
import com.test.NIMS.pages.OpenRequests;
import com.test.NIMS.util.Utility;


public class TestOpenRequests {
	
	
  @Test(enabled=false,priority = 5)
  public void testSearchForProbleByProblemNumber()throws InterruptedException {
	  
		WebElement problemTitle = NIMSBase.wait.until(ExpectedConditions.
				visibilityOfElementLocated
				(By.xpath(OpenRequests.problemTitle)));
		//problemTitle.sendKeys(NIMSBase.prop.getProperty("username_admin"));
		//problemTitle.sendKeys("Hello World");
		
		
		WebElement searchBySubmittedOn = NIMSBase.wait.until(ExpectedConditions.
				visibilityOfElementLocated
				(By.xpath(OpenRequests.searchBySubmittedOn)));
		//problemTitle.sendKeys(NIMSBase.prop.getProperty("username_admin"));
		searchBySubmittedOn.sendKeys(OpenRequests.getCurrentDate());
		
		Thread.sleep(Utility.WAIT_TIME);
		WebElement getFirstAppearingDocketNumber = NIMSBase.wait.until(ExpectedConditions.
				visibilityOfElementLocated
				(By.xpath(OpenRequests.getFirstAppearingDocketNumber)));
		getFirstAppearingDocketNumber.click();
		getFirstAppearingDocketNumber.click();
		
		
		
		
		
  }
}
