package com.test.NIMS.locators;

import java.text.SimpleDateFormat;
import java.util.Date;

public class OpenRequestsPageLocators {
	
	
	public static String problemTitle = "//input[@id='problemNumber']";
	public static String searchBySubmittedOn  = "//input[@placeholder='Problem Submitted On']";
	public static String getFirstAppearingDocketNumber = "//td[@class='center sorting_1']//descendant::a";
	public static String login = "//input[@id='loginBtn']";
	
	
	public static String getCurrentDate()
	{
	    Date date = new Date();
	    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		String currentDateInFormatDDMMYY = formatter.format(date);
		return currentDateInFormatDDMMYY;
	}

}