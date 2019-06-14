package pages.loginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.test.NIMS.base.NIMSBase;
import com.test.NIMS.pages.LoginPage;

public class LoginTest extends NIMSBase{
	
	
	@Test(enabled = false)
	public void testLogin()
	{
	  // NIMSBase base = 	new NIMSBase();
		
		
		WebElement username = NIMSBase.wait.until(ExpectedConditions.
				visibilityOfElementLocated
				(By.xpath(LoginPage.username)));
		username.sendKeys(NIMSBase.prop.getProperty("username"));
		
		WebElement password = NIMSBase.wait.until(ExpectedConditions.
				visibilityOfElementLocated
				(By.xpath(LoginPage.password)));
		password.sendKeys(NIMSBase.prop.getProperty("password"));
		
		WebElement organization = NIMSBase.wait.until(ExpectedConditions.
				visibilityOfElementLocated
				(By.xpath(LoginPage.organization)));
		new Select(organization).selectByIndex(1);
		
		
		
		WebElement login = NIMSBase.wait.until(ExpectedConditions.
				visibilityOfElementLocated
				(By.xpath(LoginPage.login)));
		login.click();
	}

}
