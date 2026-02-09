package Computhink.Script;

import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Computhink.Pom.UnSupporterFiles;

public class

UnsupportedFiles extends Computhink.Generic.BaseClass {
	public static Actions act;


	@Test(priority = 1)
	public void Login() throws Exception {

		launchUrl();
		loginRNISHA47();

		Reporter.log("User logged in successfully... ");
	}

	@Test(priority = 2)
	public void TC_2_CreateDocumentWithUnsupportedFiles() throws Exception {

		UnSupporterFiles un = new UnSupporterFiles();
		un.create_document_Auto();

		

	}

	@Test(priority = 3)
	public void TC_3_Verify_UnsupportedFiles_Download_Offline() throws Exception {
		UnSupporterFiles un = new UnSupporterFiles();
		un.viewAndDownloadDocs(16);
		
		driver.close();
		
	}
}