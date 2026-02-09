package Computhink.Script;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Computhink.Pom.Supported_filesEWA;

//Dipak codes
public class

Supportedfiles_EWA extends Computhink.Generic.BaseClass {
	public static Actions act;
	

	@Test(priority = 1)
	public void Login() throws Exception {
		launchUrl();
		LogDipakUser();
		Reporter.log("User logged in successfully... ");
	}

	@Test(priority = 2)
	public void TC_2_CreateDocumentWithSupportedFiles() throws Exception {

		Supported_filesEWA un = new Supported_filesEWA();
		un.create_document_Auto();


	}

	@Test(priority = 3)
	public void TC_3_Verify_SupportedFiles_Download () throws Exception {
		Supported_filesEWA un = new Supported_filesEWA();
		un.viewAndDownloadDocs(26);

	}
}