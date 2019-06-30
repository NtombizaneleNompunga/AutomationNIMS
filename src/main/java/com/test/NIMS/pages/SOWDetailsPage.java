package com.test.NIMS.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.test.NIMS.base.NIMSBase;
import com.test.NIMS.data.SOWDetailsData;
import com.test.NIMS.locators.SOWDetailsPageLocators;
import com.test.NIMS.util.Utility;

public class SOWDetailsPage {


	public static void populateSOWOpportunityDetails()
			throws InterruptedException
	{
		 
		  Thread.sleep(Utility.WAIT_TIME);
		  WebElement problemStartDateImage = SOWDetailsPageLocators.getDatePickers().get(0);
		  problemStartDateImage.click();
		  Thread.sleep(Utility.WAIT_TIME);
		  
		  WebElement problemStartDate =
		  NIMSBase.wait.until(ExpectedConditions.
				  visibilityOfElementLocated
		  (By.xpath(SOWDetailsPageLocators.problemStartDate))); 
		  Thread.sleep(Utility.WAIT_TIME);
		  problemStartDate.click();

		  
		  Thread.sleep(Utility.WAIT_TIME);
		  WebElement problemEndDateImage = SOWDetailsPageLocators.getDatePickers().get(1);
		  problemEndDateImage.click();
		  Thread.sleep(Utility.WAIT_TIME);
		  
		  WebElement problemEndDate =
		  NIMSBase.wait.until(ExpectedConditions.
				  visibilityOfElementLocated
		  (By.xpath(SOWDetailsPageLocators.problemEndDate))); 
		  Thread.sleep(Utility.WAIT_TIME);
		  problemEndDate.click();
		 
	}
	
	public static void populateSOWDimensionDetails() 
			throws InterruptedException
	{
		 
		  Thread.sleep(Utility.WAIT_TIME);
		  WebElement deliverySite =
		  NIMSBase.wait.until(ExpectedConditions.
				  visibilityOfElementLocated
		  (By.xpath(SOWDetailsPageLocators.deliverySite))); 
		  new Select(deliverySite).selectByIndex(42);
		  
		  //Thread.sleep(Utility.WAIT_TIME);
		  WebElement group =
		  NIMSBase.wait.until(ExpectedConditions.
				  visibilityOfElementLocated
		  (By.xpath(SOWDetailsPageLocators.group))); 
		  new Select(group).selectByIndex(15);
		 
	}
	
	public static void populateSOWDetails()
			throws InterruptedException, IOException
	{
		 
		  Thread.sleep(Utility.WAIT_TIME);
		  WebElement linkToProject =
		  NIMSBase.wait.until(ExpectedConditions.
				  visibilityOfElementLocated
		  (By.xpath(SOWDetailsPageLocators.linkToProject))); 
		  linkToProject.click();
		
		  Thread.sleep(Utility.WAIT_TIME);
		  WebElement linkToMSA =
		  NIMSBase.wait.until(ExpectedConditions.
				  visibilityOfElementLocated
		  (By.xpath(SOWDetailsPageLocators.group))); 
		  new Select(linkToMSA).selectByIndex(0);
		  
		  Thread.sleep(Utility.WAIT_TIME);
		  WebElement linkToContract =
		  NIMSBase.wait.until(ExpectedConditions.
				  visibilityOfElementLocated
		  (By.xpath(SOWDetailsPageLocators.linkToContract))); 
		  new Select(linkToContract).selectByIndex(50);
		  

		  WebElement group =
				  NIMSBase.wait.until(ExpectedConditions.
						  visibilityOfElementLocated
				  (By.xpath(SOWDetailsPageLocators.group))); 
				  new Select(group).selectByIndex(15);
		  
		  
		  Thread.sleep(Utility.WAIT_TIME);
		  WebElement tentativeClosureDateImage = SOWDetailsPageLocators.getDatePickers().get(2);
		  Thread.sleep(Utility.WAIT_TIME);
		  tentativeClosureDateImage.click();
		  
		  WebElement tentativeClosureDate = 
		  NIMSBase.wait.until(ExpectedConditions.
				  visibilityOfElementLocated
		  (By.xpath(SOWDetailsPageLocators.tentativeClosureDate))); 
		  tentativeClosureDate.click();
		  
		  
		  Thread.sleep(Utility.WAIT_TIME);
		  WebElement reasonForWorkHead =
		  NIMSBase.wait.until(ExpectedConditions.
				  visibilityOfElementLocated
		  (By.xpath(SOWDetailsPageLocators.reasonForWorkHead))); 
		  reasonForWorkHead.sendKeys(SOWDetailsData.reasonForWorkHeadText);
		  
		  Thread.sleep(Utility.WAIT_TIME);
		  WebElement duration =
		  NIMSBase.wait.until(ExpectedConditions.
				  visibilityOfElementLocated
		  (By.xpath(SOWDetailsPageLocators.duration))); 
		  new Select(duration).selectByIndex(2);
		  
		  Thread.sleep(Utility.WAIT_TIME);
		  WebElement uploadFile =
		  NIMSBase.wait.until(ExpectedConditions.
				  visibilityOfElementLocated
		  (By.xpath(SOWDetailsPageLocators.uploadFile))); 
		  uploadFile.click();
		  
		  Thread.sleep(Utility.WAIT_TIME);
		  Runtime.getRuntime().exec("C:\\Users\\Vuyo\\Desktop\\AutoIt\\fileupload.exe");
		  Thread.sleep(Utility.WAIT_TIME);
		  
		  
		  Thread.sleep(Utility.WAIT_TIME);
		  WebElement preparedBy =
		  NIMSBase.wait.until(ExpectedConditions.
				  visibilityOfElementLocated
		  (By.xpath(SOWDetailsPageLocators.preparedBy))); 
		  preparedBy.sendKeys(SOWDetailsData.preparedByText);
		  preparedBy.sendKeys(Keys.ENTER);
		  Thread.sleep(Utility.WAIT_TIME);
		  preparedBy.sendKeys(Keys.ENTER);
		  
		  
		  Thread.sleep(Utility.WAIT_TIME);
		  WebElement preparedBySearchText =
		  NIMSBase.wait.until(ExpectedConditions.
				  visibilityOfElementLocated
		  (By.xpath(SOWDetailsPageLocators.preparedBySearchText))); 
		  preparedBySearchText.click();
		  
		  Thread.sleep(Utility.WAIT_TIME);
		  WebElement reviewedBy =
		  NIMSBase.wait.until(ExpectedConditions.
				  visibilityOfElementLocated
		  (By.xpath(SOWDetailsPageLocators.reviewedBy))); 
		  reviewedBy.sendKeys(SOWDetailsData.reviewedByText);
		  reviewedBy.sendKeys(Keys.ENTER);
		  Thread.sleep(Utility.WAIT_TIME);
		  reviewedBy.sendKeys(Keys.ENTER);
		  
		  
		  Thread.sleep(Utility.WAIT_TIME);
		  WebElement reviewedBySearchText =
		  NIMSBase.wait.until(ExpectedConditions.
				  visibilityOfElementLocated
		  (By.xpath(SOWDetailsPageLocators.reviewedBySearchText))); 
		  reviewedBySearchText.click();
		  
		  Thread.sleep(Utility.WAIT_TIME);
		  WebElement reviewedDateImage = SOWDetailsPageLocators.getDatePickers().get(3);
		  Thread.sleep(Utility.WAIT_TIME);
		  reviewedDateImage.click();
		  
		  WebElement reviewedDate =
		  NIMSBase.wait.until(ExpectedConditions.
				  visibilityOfElementLocated
		  (By.xpath(SOWDetailsPageLocators.reviewedDate)));
		  Thread.sleep(Utility.WAIT_TIME);
		  reviewedDate.click();
		  
		  
		  
		  Thread.sleep(Utility.WAIT_TIME);
		  WebElement peakSize =
		  NIMSBase.wait.until(ExpectedConditions.
				  visibilityOfElementLocated
		  (By.xpath(SOWDetailsPageLocators.peakSize))); 
		  peakSize.sendKeys(SOWDetailsData.peakSizeText);
		  
		 
		  
		  Thread.sleep(Utility.WAIT_TIME);
		  WebElement scopeOrTechnology =
		  NIMSBase.wait.until(ExpectedConditions.
				  visibilityOfElementLocated
		  (By.xpath(SOWDetailsPageLocators.scopeOrTechnology))); 
		  scopeOrTechnology.sendKeys(SOWDetailsData.scopeOrTechnologyText); 
	}
	
	public static void populateApprovals()
			throws InterruptedException
	{
		 Thread.sleep(Utility.WAIT_TIME);
		  WebElement approvalName =
		  NIMSBase.wait.until(ExpectedConditions.
				  visibilityOfElementLocated
		  (By.xpath(SOWDetailsPageLocators.approvalName))); 
		  new Select(approvalName).selectByIndex(11);
		  
		  
		  Thread.sleep(Utility.WAIT_TIME);
		  WebElement workApprovalName =
		  NIMSBase.wait.until(ExpectedConditions.
				  visibilityOfElementLocated
		  (By.xpath(SOWDetailsPageLocators.workApprovalName))); 
		  new Select(workApprovalName).selectByIndex(11);
	}
	
	public static void populateBillingInformationDetails()
			throws InterruptedException
	{
		Thread.sleep(Utility.WAIT_TIME);
		  WebElement billingName =
		  NIMSBase.wait.until(ExpectedConditions.
				  visibilityOfElementLocated
		  (By.xpath(SOWDetailsPageLocators.billingName))); 
		  billingName.sendKeys(SOWDetailsData.billingNameText);
		  
		  Thread.sleep(Utility.WAIT_TIME);
		  WebElement billingDesignation =
		  NIMSBase.wait.until(ExpectedConditions.
				  visibilityOfElementLocated
		  (By.xpath(SOWDetailsPageLocators.billingDesignation))); 
		  billingDesignation.sendKeys(SOWDetailsData.billingDesignationText);
		  
		  Thread.sleep(Utility.WAIT_TIME);
		  WebElement billingContactNumber =
		  NIMSBase.wait.until(ExpectedConditions.
				  visibilityOfElementLocated
		  (By.xpath(SOWDetailsPageLocators.billingContactNumber))); 
		  billingContactNumber.sendKeys(SOWDetailsData.billingContactNumberText);
		  
		  Thread.sleep(Utility.WAIT_TIME);
		  WebElement billingEmail =
		  NIMSBase.wait.until(ExpectedConditions.
				  visibilityOfElementLocated
		  (By.xpath(SOWDetailsPageLocators.billingEmail))); 
		  billingEmail.sendKeys(SOWDetailsData.billingEmailText);
	}
	
	public static void populateProjectInformationDetails() throws InterruptedException
	{
		 Thread.sleep(Utility.WAIT_TIME);
		  WebElement projectName =
		  NIMSBase.wait.until(ExpectedConditions.
				  visibilityOfElementLocated
		  (By.xpath(SOWDetailsPageLocators.projectName))); 
		  projectName.sendKeys(SOWDetailsData.projectNameText);
		  
		  Thread.sleep(Utility.WAIT_TIME);
		  WebElement projectDesignation =
		  NIMSBase.wait.until(ExpectedConditions.
				  visibilityOfElementLocated
		  (By.xpath(SOWDetailsPageLocators.projectDesignation))); 
		  projectDesignation.sendKeys(SOWDetailsData.projectDesignationText);
		  
		  Thread.sleep(Utility.WAIT_TIME);
		  WebElement projectContactNumber =
		  NIMSBase.wait.until(ExpectedConditions.
				  visibilityOfElementLocated
		  (By.xpath(SOWDetailsPageLocators.projectContactNumber))); 
		  projectContactNumber.sendKeys(SOWDetailsData.projectContactNumberText);
		  
		  Thread.sleep(Utility.WAIT_TIME);
		  WebElement projectEmail =
		  NIMSBase.wait.until(ExpectedConditions.
				  visibilityOfElementLocated
		  (By.xpath(SOWDetailsPageLocators.projectEmail))); 
		  projectEmail.sendKeys(SOWDetailsData.projectEmailText);
	}
			
	public static void populateteamSplit() throws InterruptedException
	{
		
		 Thread.sleep(Utility.WAIT_TIME);
		  WebElement role =
		  NIMSBase.wait.until(ExpectedConditions.
				  visibilityOfElementLocated
		  (By.xpath(SOWDetailsPageLocators.role))); 
		  role.sendKeys(SOWDetailsData.roleText);
		  
		  Thread.sleep(Utility.WAIT_TIME);
		  WebElement quantity =
		  NIMSBase.wait.until(ExpectedConditions.
				  visibilityOfElementLocated
		  (By.xpath(SOWDetailsPageLocators.quantity))); 
		  quantity.sendKeys(SOWDetailsData.quantityText);
		  
		  
		  Thread.sleep(Utility.WAIT_TIME);
		  WebElement rate =
		  NIMSBase.wait.until(ExpectedConditions.
				  visibilityOfElementLocated
		  (By.xpath(SOWDetailsPageLocators.rate))); 
		  rate.sendKeys(SOWDetailsData.rateText);
		  
		  
		  Thread.sleep(Utility.WAIT_TIME);
		  WebElement unitOfMeasure =
		  NIMSBase.wait.until(ExpectedConditions.
				  visibilityOfElementLocated
		  (By.xpath(SOWDetailsPageLocators.unitOfMeasure))); 
		  new Select(unitOfMeasure).selectByIndex(1);
		  
		  
		  Thread.sleep(Utility.WAIT_TIME);
		  WebElement location =
		  NIMSBase.wait.until(ExpectedConditions.
				  visibilityOfElementLocated
		  (By.xpath(SOWDetailsPageLocators.location)));
		  new Select(location).selectByIndex(2);
		  
		  
		  Thread.sleep(Utility.WAIT_TIME);
		  WebElement startDateInput =
			        NIMSBase.wait.until(ExpectedConditions.
						  visibilityOfElementLocated
				  (By.xpath(SOWDetailsPageLocators.startDateInput)));
		  startDateInput.click();
				  
				  
		  Thread.sleep(Utility.WAIT_TIME);
		  WebElement startDateImage = SOWDetailsPageLocators.getDatePickers().get(4);
		  Thread.sleep(Utility.WAIT_TIME);
		  startDateImage.click();
		  
		  
		  WebElement startDate =
		  NIMSBase.wait.until(ExpectedConditions.
				  visibilityOfElementLocated
		  (By.xpath(SOWDetailsPageLocators.startDate)));
		  Thread.sleep(Utility.WAIT_TIME);
		  startDate.click();
		  
		 
		  
		  Thread.sleep(Utility.WAIT_TIME);
		  WebElement endDateImage =  SOWDetailsPageLocators.getDatePickers().get(5);
		  Thread.sleep(Utility.WAIT_TIME);
		  endDateImage.click();
		  
		  WebElement endDate =
		  NIMSBase.wait.until(ExpectedConditions.
				  visibilityOfElementLocated
		  (By.xpath(SOWDetailsPageLocators.endDate)));
		  Thread.sleep(Utility.WAIT_TIME);
		  endDate.click();
		  
		  
		  Thread.sleep(Utility.WAIT_TIME);
		  WebElement noOfHours =
		  NIMSBase.wait.until(ExpectedConditions.
				  visibilityOfElementLocated
		  (By.xpath(SOWDetailsPageLocators.noOfHours))); 
		  noOfHours.sendKeys(SOWDetailsData.noOfHoursText);
		  
		   
		  Thread.sleep(Utility.WAIT_TIME);
		  WebElement percentageAllocation =
		  NIMSBase.wait.until(ExpectedConditions.
				  visibilityOfElementLocated
		  (By.xpath(SOWDetailsPageLocators.percentageAllocation))); 
		  percentageAllocation.sendKeys(SOWDetailsData.percentageAllocationText);
		  
		  
		  Thread.sleep(Utility.WAIT_TIME);
		  WebElement description =
		  NIMSBase.wait.until(ExpectedConditions.
				  visibilityOfElementLocated
		  (By.xpath(SOWDetailsPageLocators.description))); 
		  description.sendKeys(SOWDetailsData.descriptionText);
	}
	
	public static void submit() throws InterruptedException
	{
		  Thread.sleep(Utility.WAIT_TIME);
		  WebElement submit =
		  NIMSBase.wait.until(ExpectedConditions.
				  visibilityOfElementLocated
		  (By.xpath(SOWDetailsPageLocators.submit))); 
		  submit.click();
	}
	
	
	
	
	
}
