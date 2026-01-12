package Computhink.Script;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Computhink.Pom.Supported_filesEWA;

//Dipak codes
public class

Supportedfiles_EWA extends Computhink.Generic.BaseClass {
	public static Actions act;

	private static org.apache.logging.log4j.Logger log = LogManager.getLogger(Supportedfiles_EWA.class);

	@BeforeClass
	public void ladBrowser() throws Exception {
		loadBrowser("Chrome");

		Reporter.log("Chrome Browser launched Successfully...");
		launchUrl();
		Reporter.log("Contentverse URL launched successfully...");

	}

	@Test(priority = 1)
	public void Login() throws Exception {

		LogDipakUser();
		Reporter.log("User logged in successfully... ");
	}

	@Test(priority = 2)
	public void TC_2_CreateDocumentWithSupportedFiles() throws Exception {

		Supported_filesEWA un = new Supported_filesEWA();
		un.create_document_Auto();

		log.info("Supported document created successful");

	}

	@Test(priority = 3)
	public void TC_3_Verify_SupportedFiles_Download () throws Exception {
		Supported_filesEWA un = new Supported_filesEWA();
		un.viewAndDownloadDocs(26);
		log.info("Download All Supported files successful");

	}
}