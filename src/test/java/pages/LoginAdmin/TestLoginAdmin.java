package pages.LoginAdmin;

import org.testng.annotations.Test;

import com.test.NIMS.pages.LoginPage;

public class TestLoginAdmin {
	
	
  @Test(enabled=true,priority = 1)
  public void testLoginAdmin() throws InterruptedException {
	   
	  LoginPage.login();
	  //Assert.assertEquals(LoginData.adminPassword, "nihilent@1234");
  }
  
  @Test(enabled=false)
  public void testLoginAdmin2() throws InterruptedException {
	   
	  LoginPage.loginAdmin();
	  //Assert.assertEquals(LoginData.adminPassword, "nihilent@1234");
  }
}
