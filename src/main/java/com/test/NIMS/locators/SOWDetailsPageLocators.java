package com.test.NIMS.locators;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.test.NIMS.base.NIMSBase;

public class SOWDetailsPageLocators extends NIMSBase {
	
	//Opportunity Details
	public static String problemStartDate = "//a[@class='ui-state-default' and text()='12']";
	public static String problemEndDate = "//a[@class='ui-state-default' and text()='21']";
	
	//Opportunity Details Text
	public static String problemStartDateText = "//img[@class='ui-datepicker-trigger']";
	public static String problemEndDateText = "//input[@id='probableEndDate']";
	
	
	
	
	
	//Dimension Details
	public static String deliverySite = "//select[@id='deliverySiteId']";
	public static String group = "//select[@id='costCentreId']";
	
	//SOW Details
	public static String linkToProject = "//input[@id='isExistingFlagNo']";
	public static String linkToMSA = "//select[@id='linkToMsaName']";
 	public static String linkToContract = "//select[@id='linkToContract']";
    public static String tentativeClosureDate = "//a[@class='ui-state-default' and text()='12']";
    public static String reasonForWorkHead = "//textarea[@id='reasonForWorkAhead']";
    
    public static String duration = "//select[@id='projectDuration']";
    public static String preparedBy = "//input[@id='preparedByList[0].associateName']";
    public static String preparedBySearchText = "//div[text()='85630 ,Amruta Patil']";
    public static String reviewedBy = "//input[@id='reviewedByList[0].associateName']";
    public static String reviewedBySearchText = "//div[text()='91786 ,Suraj Girolkar']";
    public static String peakSize = "//input[@id='peakTeamSize']";
    
    public static String scopeOrTechnology = "//textarea[@id='scopeOrTechnology']";
    public static String previouslyUploadedVersion = " //select[@id='documentId']";
    public static String reviewedDate = "//a[@class='ui-state-default' and text()='12']";
    public static String uploadFile = "//input[@id='file']";
    
    
    //SOW Details Text
   
    
    
    
    //Approvals
    public static String approvalName = "//select[@id='mssApprover']";
    public static String workApprovalName = "//select[@id='seniorManagementApprover']";
    
    
    
    //Client Information
    //Billing Contact
    public static String billingName = "//input[@id='billingClientname']";
    public static String billingDesignation = "//input[@id='billingClientDesignation']";
    public static String billingContactNumber = "//input[@id='billingClientContact']";
    public static String billingEmail = "//input[@id='billingClientEmail']";
    
  
  //Project Contact
    public static String projectName = "//input[@id='projectContactName']";
    public static String projectDesignation = "//input[@id='projectDesignation']";
    public static String projectContactNumber = "//input[@id='projectContact']";
    public static String projectEmail = "//input[@id='projectEmail']";
    
  
    
    
    //Team Split
    public static String role = "//input[@id='contractResourceSplitFormList[0].role']";
    public static String quantity = "//input[@id='quantity_0']";
    public static String rate = "//input[@id='rate_0']";
    public static String unitOfMeasure = "//select[@id='contractResourceSplitFormList[0].unitOfMeasure']";
    public static String location = "//select[@id='contractResourceSplitFormList[0].location']";
    public static String startDate = "//a[@class='ui-state-default' and text()='26']";
    public static String endDate = "//a[@class='ui-state-default' and text()='28']";
    public static String noOfHours = "//input[@id='noofhours_0']";
    public static String percentageAllocation = "//input[@id='percentalloaction_0']";
    public static String description = "//input[@id='contractResourceSplitFormList[0].description']";
    
    //Start And End Dates Inputs
    public static String startDateInput = "//input[@id='startDate_0']";
    public static String endDateInput = "//input[@id='endDate_0']";
    //startDate_0
    
    public static String submit = "//input[@id='submitBtn']";
    public static String approve = "//input[@id='approveBtn']";
  
    
    public static String saveButton = "//input[@id='saveBtn']";
    public static String submitButton = "//input[@id='submitBtn']";
    
    public static String toBeClosedByDate = "//a[@class='ui-state-default' and text()='28']";//from date picker images//select index 0\
    public static String approverComment = "//textarea[@id='workaheadCommentBySeniorManagement']"; 
   
    

  //input[@id='approveBtn']
    
    public  static  List<WebElement> getDatePickers()
    {
    	String datePicker = "//img[@class='ui-datepicker-trigger']";
    	List<WebElement> datePickers = driver.findElements(By.xpath(datePicker));
    	return datePickers;
    }
    
    public  static  List<WebElement> getSpanMessages()
    {
    	String spanMessage = "//span[@class='msg']//img[@class='icon_messages']";
    	List<WebElement> spanMessages = driver.findElements(By.xpath(spanMessage));
    	return spanMessages;
    }
    
    
    public static String getCurrentDate()
	{
	    Date date = new Date();
	    SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yy");
		String currentDateInFormatDDMMYY = formatter.format(date);
		return currentDateInFormatDDMMYY;
	}
    
    public static String getProblemStartDate()
   	{
   	    Date date = new Date();
   	    SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yy");
   		String currentDateInFormatDDMMYY = formatter.format(date);
   		return currentDateInFormatDDMMYY;
   	}
    
    public static String getProblemEndDate()
   	{
   	    Date date = new Date();
   	    SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yy");
   		String currentDateInFormatDDMMYY = formatter.format(date);
   		return currentDateInFormatDDMMYY;
   	}
}