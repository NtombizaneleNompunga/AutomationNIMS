package pages.ReportProblem;

import org.testng.annotations.Test;

import com.test.NIMS.pages.ReportProblemPage;

public class ReportProblem {
	
 	
  @Test(enabled = false,priority = 1)
  public void testSubmitReportProblem()throws InterruptedException {
	 
	  ReportProblemPage.submitProblem();
	    
	    
  }
  
  @Test(enabled = false,priority = 2)
  public void testLogout()
  {
	  ReportProblemPage.logOut();
  }
}
