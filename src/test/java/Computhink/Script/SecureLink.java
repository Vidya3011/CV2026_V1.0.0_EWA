package Computhink.Script;

import org.testng.Reporter;
import org.testng.annotations.Test;

import Computhink.Pom.Print;



public class

SecureLink extends Computhink.Generic.BaseClass {


	@Test(priority = 1)
	public void Login() throws Exception {
	
		launchUrl();
		loginRNISHA47();
		
		Reporter.log("User logged in successfully... ");
		
	}

	@Test(priority = 2)
	public void TC_1_DocumentSendToSecureLink() throws Exception {
		Print pojo = new Print();
		pojo.DocumentSendToSecureLink();

	}

	/*@Test(priority = 5)
	public void TC_4_SentDocumentToView() throws Exception {
		Print pojo = new Print();
		pojo.SentDocumentToView();
	
	}*/

	@Test(priority = 4)
	public void TC_3_SecureLinkFromDocumentList() throws Exception {
		Reporter.log("Scenario 02: Document send to securelink from Document page");
		Print pojo = new Print();
		pojo.SecureLinkFromDocumentList();
	}

	@Test(priority = 3)
	public void TC_2_SecureLinkFromSearchTab() throws Exception {

		Print pojo = new Print();
		pojo.SecureLinkFromSearchTab();

	}

}
