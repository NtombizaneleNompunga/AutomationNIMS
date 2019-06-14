package com.test.NIMS.pages;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.test.NIMS.base.NIMSBase;

public class OpenRequests  extends NIMSBase  {
	
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
