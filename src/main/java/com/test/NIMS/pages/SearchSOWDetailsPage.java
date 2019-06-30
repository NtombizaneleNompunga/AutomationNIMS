package com.test.NIMS.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.test.NIMS.base.NIMSBase;
import com.test.NIMS.data.SOWDetailsData;
import com.test.NIMS.data.SearchSOWDetailsData;
import com.test.NIMS.locators.SOWDetailsPageLocators;
import com.test.NIMS.locators.SearchSOWDetailsLocators;
import com.test.NIMS.util.Utility;

public class SearchSOWDetailsPage {
	
	
	
	public static void searchByCRMRefNo() throws InterruptedException
	{
		
		Thread.sleep(Utility.WAIT_TIME);
 	   WebElement searchByCRMRefNo =
	       NIMSBase.wait.until(ExpectedConditions.
			   visibilityOfElementLocated
		    (By.xpath(SearchSOWDetailsLocators.searchByCRMRefNo))); 
		  
 	     searchByCRMRefNo.sendKeys(SearchSOWDetailsData.searchByCRMRefNo);
 	     
 		   Thread.sleep(Utility.WAIT_TIME);
 	 	   WebElement search =
 		    NIMSBase.wait.until(ExpectedConditions.
 			      visibilityOfElementLocated
 			(By.xpath(SearchSOWDetailsLocators.search))); 
 	    	search.click();
 	    	
 	   	     Thread.sleep(Utility.WAIT_TIME);
 	    	 WebElement foundItem =
 	     		    NIMSBase.wait.until(ExpectedConditions.
 	     			      visibilityOfElementLocated
 	     			(By.xpath(SearchSOWDetailsLocators.foundItem))); 
 	    	foundItem.click();
 	 	 //one last line

	}
   

	public static void searchByProposalNo()  throws InterruptedException
	{
		Thread.sleep(Utility.WAIT_TIME);
		WebElement searchByProposalNo =
			       NIMSBase.wait.until(ExpectedConditions.
					   visibilityOfElementLocated
				    (By.xpath(SearchSOWDetailsLocators.searchByProposalNo))); 
				  
		searchByProposalNo.sendKeys(SearchSOWDetailsData.searchByProposalNo);
		 	     
		 	
		Thread.sleep(Utility.WAIT_TIME);
	    WebElement search =
		 		  NIMSBase.wait.until(ExpectedConditions.
		 			      visibilityOfElementLocated
		 			(By.xpath(SearchSOWDetailsLocators.search))); 
		 	    	search.click();
		 	    	
		 	    	 Thread.sleep(Utility.WAIT_TIME);
		 	    	 WebElement foundItem =
		 	     		    NIMSBase.wait.until(ExpectedConditions.
		 	     			      visibilityOfElementLocated
		 	     			(By.xpath(SearchSOWDetailsLocators.foundItem))); 
		 	    	foundItem.click();
	}

	

	public static void searchByClientName()  throws InterruptedException
	{
		Thread.sleep(Utility.WAIT_TIME);
		WebElement searchByClientName =
			       NIMSBase.wait.until(ExpectedConditions.
					   visibilityOfElementLocated
				    (By.xpath(SearchSOWDetailsLocators.searchByClientName))); 
				  
		searchByClientName.sendKeys(SearchSOWDetailsData.searchByClientName);
		 	     
		Thread.sleep(Utility.WAIT_TIME);	
	    WebElement search =
		 		  NIMSBase.wait.until(ExpectedConditions.
		 			      visibilityOfElementLocated
		 			(By.xpath(SearchSOWDetailsLocators.search))); 
		 	    	search.click();
		 	    	
		 	    	 Thread.sleep(Utility.WAIT_TIME);
		 	    	 WebElement foundItem =
		 	     		    NIMSBase.wait.until(ExpectedConditions.
		 	     			      visibilityOfElementLocated
		 	     			(By.xpath(SearchSOWDetailsLocators.foundItem))); 
		 	    	foundItem.click();   	
	}

	
 
	public static void searchByContractType()  throws InterruptedException
	{
		Thread.sleep(Utility.WAIT_TIME);
		WebElement searchByContractType =
			       NIMSBase.wait.until(ExpectedConditions.
					   visibilityOfElementLocated
				    (By.xpath(SearchSOWDetailsLocators.searchByContractType))); 
				  
		searchByContractType.sendKeys(SearchSOWDetailsData.searchByClientName);
		 	     
		Thread.sleep(Utility.WAIT_TIME);	
	    WebElement search =
		 		  NIMSBase.wait.until(ExpectedConditions.
		 			      visibilityOfElementLocated
		 			(By.xpath(SearchSOWDetailsLocators.search))); 
		 	    	search.click();
		 	    	
		 	    	 Thread.sleep(Utility.WAIT_TIME);
		 	    	 WebElement foundItem =
		 	     		    NIMSBase.wait.until(ExpectedConditions.
		 	     			      visibilityOfElementLocated
		 	     			(By.xpath(SearchSOWDetailsLocators.foundItem))); 
		 	    	foundItem.click();
	}
	
	public static void approveWorkHead() throws InterruptedException
	{
		  Thread.sleep(Utility.WAIT_TIME);
		  WebElement tobeClosedByImage =  SOWDetailsPageLocators.getDatePickers().get(0);
		  Thread.sleep(Utility.WAIT_TIME);
		  tobeClosedByImage.click();
		  
		  WebElement toBeClosedByDate =
		  NIMSBase.wait.until(ExpectedConditions.
				  visibilityOfElementLocated
		  (By.xpath(SOWDetailsPageLocators.toBeClosedByDate)));
		  Thread.sleep(Utility.WAIT_TIME);
		  toBeClosedByDate.click();
		  
		  
		  WebElement approverComment =
				  NIMSBase.wait.until(ExpectedConditions.
						  visibilityOfElementLocated
				  (By.xpath(SOWDetailsPageLocators.approverComment)));
				  Thread.sleep(Utility.WAIT_TIME);
				  approverComment.sendKeys(SOWDetailsData.approverComment);
				  
				  WebElement approve =
						  NIMSBase.wait.until(ExpectedConditions.
								  visibilityOfElementLocated
						  (By.xpath(SOWDetailsPageLocators.approve)));
						  Thread.sleep(Utility.WAIT_TIME);
						  approve.click();
						  
		  Alert alert = NIMSBase.driver.switchTo().alert();
		  alert.accept();		  
		  
	}
	
	public static void searchAndClickOnCRMRefNoOfChoice()
	{
		
	}

}
