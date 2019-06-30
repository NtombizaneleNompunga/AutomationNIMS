package pages.SOWDetails;

import org.testng.annotations.Test;
import com.test.NIMS.pages.SearchSOWDetailsPage;

public class TestSearchAndApproveSOWWorkHead {
	
	@Test(enabled=true,priority = 16)
	  public void testSearchByCRMRefNo()throws InterruptedException {
		 
		SearchSOWDetailsPage.searchByCRMRefNo();
		
	  }
	
	@Test(enabled=true,priority = 17)
	  public void testApproveWorkhead()throws InterruptedException {
		 
		SearchSOWDetailsPage.approveWorkHead();
	  }

}
