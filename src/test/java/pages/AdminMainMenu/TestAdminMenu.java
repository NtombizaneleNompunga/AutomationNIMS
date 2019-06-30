package pages.AdminMainMenu;

import org.testng.annotations.Test;

import com.test.NIMS.pages.AdminMainMenuPage;

public class TestAdminMenu {
	
	
  @Test(enabled=true,priority = 4)
  public void testNavigateToMarketingAndSalesService() throws InterruptedException {
	 

	  AdminMainMenuPage.navigateToMarketingAndSales();
		
  }
  
  
  @Test(enabled=false,priority = 5)
  public void testNavigateToPendingSOWWorkHead() throws InterruptedException {
	 

	  AdminMainMenuPage.navigatePendingWorkHead();
		
  }
  
  
  
  @Test(enabled=true,priority = 6)
  public void testClickOnCRMRefNr() throws InterruptedException
  {
	  
	  AdminMainMenuPage.clickOnCRFLink();
  }

}
