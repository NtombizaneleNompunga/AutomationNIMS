package com.test.NIMS.locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.test.NIMS.base.NIMSBase;

public class SearchSOWDetailsLocators extends NIMSBase {
	
	public static  String searchByCRMRefNo = "//input[@id='crmRefNo']";
	public static  String searchByProposalNo = "//input[@id='proposalNo']";
	public static  String searchByClientName = "//select[@id='clientId'";
	public static  String searchByContractType = "//select[@id='contractType']";
	public static  String search = "//input[@value='Search']";
	public static  String foundItem = "//td[@align='middle']/a";
	
	public  static  List<WebElement> getTableData()
    {
    	String tableData = "//td[@class='sorting_1']";
    	List<WebElement> tableItems = driver.findElements(By.xpath(tableData));
    	return tableItems;
    }
}
