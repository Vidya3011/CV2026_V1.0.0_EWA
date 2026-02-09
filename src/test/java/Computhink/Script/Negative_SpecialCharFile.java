package Computhink.Script;

//Dipak Automation Coading

import org.testng.Reporter;
import org.testng.annotations.Test;

import Computhink.Pom.SpecialCharFilenames;

public class Negative_SpecialCharFile extends Computhink.Generic.BaseClass {

	
	@Test(priority = 1)
	public void Login_EWA() throws Exception {
		launchUrl();
		LogDipakUser();
		Reporter.log("User has logged in successfully.", true);

	}

	@Test(priority = 2)
	public void TC_01_Verify_Destination_Folder() throws Exception {

		SpecialCharFilenames pojo = new SpecialCharFilenames();
		pojo.Verify_Destination_Folder();
	}

	@Test(priority = 3)
	public void TC_02_Verify_Asterrisk_Field() throws Exception {

		SpecialCharFilenames pojo = new SpecialCharFilenames();
		pojo.Verify_Asterrisk_Field();
	}

	@Test(priority = 4)
	public void TC_03_Create_Emptypage_Document() throws Exception {

		SpecialCharFilenames pojo = new SpecialCharFilenames();
		pojo.Create_Emptypage_Document();
	}
}
