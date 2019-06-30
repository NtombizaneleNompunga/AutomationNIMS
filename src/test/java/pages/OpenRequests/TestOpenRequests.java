package pages.OpenRequests;


import org.testng.annotations.Test;
import com.test.NIMS.pages.OpenRequestsPage;


public class TestOpenRequests {
	
	
  @Test(enabled=false,priority = 5)
  public void testSearchForProbleByProblemNumber()throws InterruptedException {
	  
	  OpenRequestsPage.searchProblemBy();
	 	
  }
}
