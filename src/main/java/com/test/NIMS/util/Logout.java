package com.test.NIMS.util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.test.NIMS.base.NIMSBase;


public class Logout extends NIMSBase {
	
	public static String logout = "//a[@class='linkblack' and text()='Signout']";
	public static void logout() throws InterruptedException
	{
		  Thread.sleep(Utility.WAIT_TIME);
		  WebElement logout =
		  NIMSBase.wait.until(ExpectedConditions.
				  visibilityOfElementLocated
		  (By.xpath(Logout.logout))); 
		  logout.click();
	}


}
