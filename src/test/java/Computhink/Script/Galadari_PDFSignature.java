package Computhink.Script;

import org.testng.Reporter;
import org.testng.annotations.Test;

import Computhink.Pom.My_Preferences;

public class Galadari_PDFSignature extends Computhink.Generic.BaseClass {
	
	@Test

	public void Login_EWA() throws Exception {
		launchUrl();
		LogDipakUser();
		Reporter.log("User has logged in successfully.", true);

	}

	@Test(priority=1,invocationCount = 60)
	public void TC_01_Create_and_Open_document_Default_View() throws Exception {

		My_Preferences pojo = new My_Preferences();
		pojo.Send_DocumenttoWorkflow();
	}
	

}
