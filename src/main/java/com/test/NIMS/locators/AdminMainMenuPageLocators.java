package com.test.NIMS.locators;

import com.test.NIMS.base.NIMSBase;

public class AdminMainMenuPageLocators extends NIMSBase {
	
	public static String helpDesk = "//a[@class='drop has-submenu' and text()='Admin']";
	public static String helpDeskInner = "//a[@class='hyperlinkrclick has-submenu' and text()='Help Desk']";
	
	public static String myProfile = "//a[text()='My Profile']";  
	public static String myApprovals = "//a[@class= 'hyperlinkrclick has-submenu' and text()='My Approvals']";
	public static String pendingWorkHead = "//a[@class= 'hyperlinkrclick' and text()=' Pending Workahead ']";
	public static String openRequests = "//a[text()=' Open Requests ']";
	public static String mss = "//a[@class='drop has-submenu' and text()='MSS']";
 	public static String marketingAndSalesService = "//a[@class='hyperlinkrclick has-submenu' and text()='Marketing Sales And Service']";
    public static String SOWWorkhead = "//a[@class='hyperlinkrclick' and text()=' Sow WorkAhead ']";
    public static String crmRefNr = "//td[@class='sorting_1']//descendant::a";
    public static String proposalNumber = "//input[@id='proposalNo']";
    //"Amruta-test-sow2"
}