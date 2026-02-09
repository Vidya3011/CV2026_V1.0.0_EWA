package Computhink.Script;

import org.testng.Reporter;
import org.testng.annotations.Test;

import Computhink.Pom.Print;


public class

SecureLink_Negative_Scenerio extends Computhink.Generic.BaseClass {

	
	@Test(priority = 1)
	public void Login() throws Exception {
	
		launchUrl();
		loginRNISHA47();
		
		Reporter.log("User logged in successfully... ");
		
	}

	@Test(priority = 2)
	public void TC_1_SecureLinkInvalidRecepient_Mail_ID_ValidConfirm_Mail() throws Exception {
		Print pojo = new Print();
		pojo.SecureLinkInvalidRecepient_Mail_ID_ValidConfirm_Mail();
	}

	@Test(priority = 3)
	public void TC_2_SendToSecureLinkwithout_Email_ID_BlankTest() throws Exception {
		Print pojo = new Print();
		pojo.SendToSecureLinkwithout_Email_ID_BlankTest();
	}

	@Test(priority = 4)
	public void TC_3_SecLinkReceipientDailogBoxInvalid_Email_ID() throws Exception {
		Print pojo = new Print();
		pojo.SecLinkReceipientDailogBoxInvalid_Email_ID();
	}

	@Test(priority = 5)
	public void TC_4_SecLinkReceipientMailBlank() throws Exception {
		Print pojo = new Print();
		pojo.SecLinkReceipientMailBlank();

	}

}
