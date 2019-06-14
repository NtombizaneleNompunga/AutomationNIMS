package pages.ReportProblem;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.test.NIMS.base.NIMSBase;
import com.test.NIMS.pages.ReportProblemPage;
import com.test.NIMS.util.Logout;
import com.test.NIMS.util.Utility;

public class ReportProblem {
	
 	
  @Test(enabled = false,priority = 1)
  public void testSubmitReportProblem()throws InterruptedException {
	  
	   WebElement group = NIMSBase.wait.until(ExpectedConditions.
				visibilityOfElementLocated
				(By.xpath(ReportProblemPage.group)));
	   new Select(group).selectByIndex(3);
		
	   Thread.sleep(Utility.WAIT_TIME);
	   WebElement problemTitle = NIMSBase.wait.until(ExpectedConditions.
				visibilityOfElementLocated
				(By.xpath(ReportProblemPage.problemTitle)));
	   new Select(problemTitle).selectByIndex(4);
	   
	   
	    Alert alert = NIMSBase.driver.switchTo().alert();
	    Thread.sleep(Utility.WAIT_TIME);
	    alert.dismiss();
	    NIMSBase.driver.switchTo().defaultContent();
	    
	    WebElement location = NIMSBase.wait.until(ExpectedConditions.
				visibilityOfElementLocated
				(By.xpath(ReportProblemPage.location)));
	    new Select(location).selectByIndex(41);
	    
	    Thread.sleep(Utility.WAIT_TIME);
	    WebElement seatNumber = NIMSBase.wait.until(ExpectedConditions.
				visibilityOfElementLocated
				(By.xpath(ReportProblemPage.seatNumber)));
	    seatNumber.sendKeys("112");
	    
	    Thread.sleep(Utility.WAIT_TIME);
	    WebElement description = NIMSBase.wait.until(ExpectedConditions.
				visibilityOfElementLocated
				(By.xpath(ReportProblemPage.description)));
	    description.sendKeys("On AC, fan is not working");
	    
	    
	   WebElement submit = NIMSBase.wait.until(ExpectedConditions.
				visibilityOfElementLocated
				(By.xpath(ReportProblemPage.submit)));
	   submit.click();  
	    
	    
  }
  
  @Test(enabled = false,priority = 2)
  public void testLogout()
  {
	  WebElement logout = NIMSBase.wait.until(ExpectedConditions.
				visibilityOfElementLocated
				(By.xpath(Logout.logout)));
	    logout.click();
  }
}
