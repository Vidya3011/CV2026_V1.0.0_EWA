package Computhink.Script;

import org.testng.Reporter;
import org.testng.annotations.Test;

import Computhink.Pom.Print;

public class ZeroPageDocumentCheckingCodesForAllFolder  extends Computhink.Generic.BaseClass {

	
		@Test(priority = 1)
		public void Login_To_EWA() throws Exception {
			
			launchUrl();
	    loginRNISHA47();
			Reporter.log("User logged in successful... ");
			
		}
	
	@Test(priority=2)
	public void TestCase_1_ZeroPageDocumentFindingCode() throws Exception {
		
		Print pr=new Print();
		pr.AutomatingAllCabinetAndDrawerAndFolderForZeroPageDocumentIssue();
	}
}
