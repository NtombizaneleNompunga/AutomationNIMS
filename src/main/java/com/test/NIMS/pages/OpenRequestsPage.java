package com.test.NIMS.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.test.NIMS.base.NIMSBase;
import com.test.NIMS.locators.OpenRequestsPageLocators;
import com.test.NIMS.util.Utility;

public class OpenRequestsPage  extends NIMSBase  {


	public static void searchProblemBy() throws InterruptedException
	{
		//WebElement problemTitle = NIMSBase.wait.until(ExpectedConditions.
		//	visibilityOfElementLocated
		//	(By.xpath(OpenRequests.problemTitle)));
	//problemTitle.sendKeys(NIMSBase.prop.getProperty("username_admin"));
	//problemTitle.sendKeys("Hello World");
	
	
	WebElement searchBySubmittedOn = NIMSBase.wait.until(ExpectedConditions.
			visibilityOfElementLocated
			(By.xpath(OpenRequestsPageLocators.searchBySubmittedOn)));
	searchBySubmittedOn.sendKeys(OpenRequestsPageLocators.getCurrentDate());
	
	Thread.sleep(Utility.WAIT_TIME);
	WebElement getFirstAppearingDocketNumber = NIMSBase.wait.until(ExpectedConditions.
			visibilityOfElementLocated
			(By.xpath(OpenRequestsPageLocators.getFirstAppearingDocketNumber)));
	getFirstAppearingDocketNumber.click();
	getFirstAppearingDocketNumber.click();		
	
	
	}
}