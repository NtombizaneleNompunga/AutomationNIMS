package com.test.NIMS.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.test.NIMS.base.NIMSBase;
import com.test.NIMS.data.SearchSOWDetailsData;
import com.test.NIMS.locators.AdminMainMenuPageLocators;
import com.test.NIMS.locators.SearchSOWDetailsLocators;
import com.test.NIMS.util.Utility;

public class AdminMainMenuPage extends NIMSBase {
	
	
	public static void navigatePendingWorkHead() throws InterruptedException
	{
		  Thread.sleep(Utility.WAIT_TIME);
	      WebElement myProfile = NIMSBase.wait.until(ExpectedConditions.
			visibilityOfElementLocated
			(By.xpath(AdminMainMenuPageLocators.myProfile)));
	      myProfile.click();
	      
		  Thread.sleep(Utility.WAIT_TIME);
	      WebElement myApprovals = NIMSBase.wait.until(ExpectedConditions.
			visibilityOfElementLocated
			(By.xpath(AdminMainMenuPageLocators.myApprovals)));
	      myApprovals.click();
	      
		  Thread.sleep(Utility.WAIT_TIME);
	      WebElement pendingWorkHead = NIMSBase.wait.until(ExpectedConditions.
			visibilityOfElementLocated
			(By.xpath(AdminMainMenuPageLocators.pendingWorkHead)));
	      pendingWorkHead.click();
	}
	
	
	public static void navigateToMarketingAndSales() throws InterruptedException
	{
		 Thread.sleep(Utility.WAIT_TIME);
		      WebElement mss = NIMSBase.wait.until(ExpectedConditions.
				visibilityOfElementLocated
				(By.xpath(AdminMainMenuPageLocators.mss)));
		      mss.click();
		   

			  Thread.sleep(Utility.WAIT_TIME);
			  WebElement marketingAndSalesService =
			  NIMSBase.wait.until(ExpectedConditions.
					  visibilityOfElementLocated
			  (By.xpath(AdminMainMenuPageLocators.marketingAndSalesService))); 
			  marketingAndSalesService.click();
			  
			  
			  Thread.sleep(Utility.WAIT_TIME);
			  WebElement SOWWorkhead =
			  NIMSBase.wait.until(ExpectedConditions.
					  visibilityOfElementLocated
			  (By.xpath(AdminMainMenuPageLocators.SOWWorkhead))); 
			  SOWWorkhead.click();
	}
	
	public static void clickOnCRFLink() throws InterruptedException
	{

		  Thread.sleep(Utility.WAIT_TIME);
		  WebElement crmRefNr =
		  NIMSBase.wait.until(ExpectedConditions.
				  visibilityOfElementLocated
		  (By.xpath(SearchSOWDetailsLocators.searchByCRMRefNo))); 
		  crmRefNr.sendKeys(SearchSOWDetailsData.searchByCRMRefNo);
		  
		  
		  Thread.sleep(Utility.WAIT_TIME);
		  WebElement search =
		  NIMSBase.wait.until(ExpectedConditions.
				  visibilityOfElementLocated
		  (By.xpath(SearchSOWDetailsLocators.search))); 
		  search.click();
		 
		  
		  Thread.sleep(Utility.WAIT_TIME);
		  //sort this out
		  //WebElement crmRefNrFound = SearchSOWDetailsLocators.getTableData().get(0);
		  Thread.sleep(Utility.WAIT_TIME);
		  WebElement searchByProposalNumber = NIMSBase.wait.until(ExpectedConditions.
				  visibilityOfElementLocated
		  (By.xpath(AdminMainMenuPageLocators.crmRefNr))); 
		  searchByProposalNumber.sendKeys(SearchSOWDetailsData.searchByProposalNo);
		  
		  search.click();
		  
		  Thread.sleep(Utility.WAIT_TIME);
		  WebElement  crmRefNrFound = 
		  NIMSBase.wait.until(ExpectedConditions.
				  visibilityOfElementLocated
		  (By.xpath(AdminMainMenuPageLocators.crmRefNr))); 
		  crmRefNrFound.click();
		  
		 
	} 
	
}
