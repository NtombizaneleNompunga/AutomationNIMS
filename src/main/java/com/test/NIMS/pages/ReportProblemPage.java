package com.test.NIMS.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.test.NIMS.base.NIMSBase;
import com.test.NIMS.data.ReportProblemData;
import com.test.NIMS.locators.ReportProblemPageLocators;
import com.test.NIMS.util.Logout;
import com.test.NIMS.util.Utility;

public class ReportProblemPage  extends NIMSBase {
	
	
	public static void submitProblem() throws InterruptedException
	{
		  
		   WebElement group = NIMSBase.wait.until(ExpectedConditions.
					visibilityOfElementLocated
					(By.xpath(ReportProblemPageLocators.group)));
		   new Select(group).selectByIndex(3);
			
		   Thread.sleep(Utility.WAIT_TIME);
		   WebElement problemTitle = NIMSBase.wait.until(ExpectedConditions.
					visibilityOfElementLocated
					(By.xpath(ReportProblemPageLocators.problemTitle)));
		   new Select(problemTitle).selectByIndex(4);
		   
		   
		    Alert alert = NIMSBase.driver.switchTo().alert();
		    Thread.sleep(Utility.WAIT_TIME);
		    alert.dismiss();
		    NIMSBase.driver.switchTo().defaultContent();
		    
		    WebElement location = NIMSBase.wait.until(ExpectedConditions.
					visibilityOfElementLocated
					(By.xpath(ReportProblemPageLocators.location)));
		    new Select(location).selectByIndex(41);
		    
		    Thread.sleep(Utility.WAIT_TIME);
		    WebElement seatNumber = NIMSBase.wait.until(ExpectedConditions.
					visibilityOfElementLocated
					(By.xpath(ReportProblemPageLocators.seatNumber)));
		    seatNumber.sendKeys(ReportProblemData.seatNumber);
		    
		    Thread.sleep(Utility.WAIT_TIME);
		    WebElement description = NIMSBase.wait.until(ExpectedConditions.
					visibilityOfElementLocated
					(By.xpath(ReportProblemPageLocators.description)));
		    description.sendKeys(ReportProblemData.description);
		    
		    
		   WebElement submit = NIMSBase.wait.until(ExpectedConditions.
					visibilityOfElementLocated
					(By.xpath(ReportProblemPageLocators.submit)));
		   submit.click();  
	}
	
	public static void logOut()
	{
		  WebElement logout = NIMSBase.wait.until(ExpectedConditions.
					visibilityOfElementLocated
					(By.xpath(Logout.logout)));
		    logout.click();
	}
	
	

}
