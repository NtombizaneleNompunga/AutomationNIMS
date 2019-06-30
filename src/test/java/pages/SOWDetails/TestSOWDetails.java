package pages.SOWDetails;

import java.io.IOException;
import org.testng.annotations.Test;


import com.test.NIMS.pages.SOWDetailsPage;
import com.test.NIMS.util.Logout;

public class TestSOWDetails {
	
	
	@Test(enabled=true,priority = 6)
	  public void testSOWOpportunityDetails()throws InterruptedException {
		 
		SOWDetailsPage.populateSOWOpportunityDetails();
	  }
	
  @Test(enabled=true,priority = 7)
  public void testSOWDimensionDetails()
		  throws InterruptedException {
	 
	  SOWDetailsPage.populateSOWDimensionDetails();
  }
  
  @Test(enabled=true,priority = 8)
  public void testSOWDetails()throws 
  InterruptedException, IOException {
	 
	  SOWDetailsPage.populateSOWDetails();
  }
  
  @Test(enabled=true,priority = 9)
  public void testApprovals()
		  throws InterruptedException
  {
	  SOWDetailsPage.populateApprovals();
  }
  
  @Test(enabled=true,priority = 10)
  public void testBillingClientInformation()
   throws InterruptedException
  {
	  SOWDetailsPage.populateBillingInformationDetails();
  }
  
  @Test(enabled=true,priority = 11) 
  public void testProjectBillingInformation() 
		  throws InterruptedException
  {
	  SOWDetailsPage.populateProjectInformationDetails();
  }
  
  @Test(enabled=true,priority = 12) 
  public void testTeamSplit()
		  throws InterruptedException
  {
	 
	  SOWDetailsPage.populateteamSplit();
	  
	  
  }
  
  @Test(enabled=true,priority = 13) 
  public void testSubmitSOW()
		  throws InterruptedException
  {
	 
	  SOWDetailsPage.submit();
	  
	  
  }
  
  @Test(enabled=false,priority = 14) 
  public void testLogout()
		  throws InterruptedException
  {
	 
	 Logout.logout();
	  
	  
  }
}
