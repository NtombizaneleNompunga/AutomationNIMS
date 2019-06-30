package com.test.NIMS.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.test.NIMS.base.NIMSBase;
import com.test.NIMS.locators.MainMenuPageLocators;

public class MainMenuPage  extends NIMSBase {
	
    
	public static void navigateToProblem() throws InterruptedException
	{

		  Thread.sleep(2000);
		  WebElement myProfile = NIMSBase.wait.until(ExpectedConditions.
					visibilityOfElementLocated
					(By.xpath(MainMenuPageLocators.myProfile)));
		  myProfile.click();
			
		  Thread.sleep(2000);
	      WebElement myRequest = NIMSBase.wait.until(ExpectedConditions.
					visibilityOfElementLocated
					(By.xpath(MainMenuPageLocators.myRequest)));
		  myRequest.click(); 
		  
		  Thread.sleep(2000); 
		  WebElement reportProblem = NIMSBase.wait.until(ExpectedConditions.
					visibilityOfElementLocated
					(By.xpath(MainMenuPageLocators.reportProblem)));
		  reportProblem.click();
	}
}
