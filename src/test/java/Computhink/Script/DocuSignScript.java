package Computhink.Script;

import org.testng.Reporter;
import org.testng.annotations.Test;

import Computhink.Generic.BaseClass;
import Computhink.Pom.AdvancedViewer;

public class

// codes~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
DocuSignScript extends BaseClass {
	


	
	@Test(priority = 1)
	public void Login() throws Exception {
	
	    launchUrl();
		loginRNISHA47();
		
		Reporter.log("User logged in successfully... ");
		
	}

	@Test(priority = 2)
	public void TC_1_DocusignDocument() throws Exception {
		AdvancedViewer ad = new AdvancedViewer();

		ad.DocuSignCreateDoc();

	}

}
