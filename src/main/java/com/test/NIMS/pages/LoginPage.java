package com.test.NIMS.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.test.NIMS.base.NIMSBase;
import com.test.NIMS.data.LoginData;
import com.test.NIMS.locators.*;
import com.test.NIMS.util.Utility;

public class LoginPage extends NIMSBase{
	
	
	public static void login()throws InterruptedException
	{
		 Thread.sleep(Utility.WAIT_TIME);
		 Thread.sleep(Utility.WAIT_TIME);
		WebElement usernameElement = NIMSBase.wait.until(ExpectedConditions.
				visibilityOfElementLocated
				(By.xpath(LoginPageLocators.username)));
		usernameElement.sendKeys(LoginData.username);
		
		WebElement passwordElement = NIMSBase.wait.until(ExpectedConditions.
				visibilityOfElementLocated
				(By.xpath(LoginPageLocators.password)));
		passwordElement.sendKeys(LoginData.password);
		
		WebElement organization = NIMSBase.wait.until(ExpectedConditions.
				visibilityOfElementLocated
				(By.xpath(LoginPageLocators.organization)));
		new Select(organization).selectByIndex(1);
		
		
		
		WebElement login = NIMSBase.wait.until(ExpectedConditions.
				visibilityOfElementLocated
				(By.xpath(LoginPageLocators.login)));
		login.click();
	}
	
	
	public static void loginAdmin()
	{
		WebElement username = NIMSBase.wait.until(ExpectedConditions.
				visibilityOfElementLocated
				(By.xpath(LoginPageLocators.username)));
		username.sendKeys(LoginData.adminUsername);
		
		WebElement password = NIMSBase.wait.until(ExpectedConditions.
				visibilityOfElementLocated
				(By.xpath(LoginPageLocators.password)));
		password.sendKeys(LoginData.adminPassword);
		
		WebElement organization = NIMSBase.wait.until(ExpectedConditions.
				visibilityOfElementLocated
				(By.xpath(LoginPageLocators.organization)));
		new Select(organization).selectByIndex(1);
		
		
		
		WebElement login = NIMSBase.wait.until(ExpectedConditions.
				visibilityOfElementLocated
				(By.xpath(LoginPageLocators.login)));
		login.click();
	}
	
}
