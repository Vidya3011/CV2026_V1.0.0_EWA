package Computhink.Script;

//Dipak Automation Coading

import org.testng.Reporter;
import org.testng.annotations.Test;

import Computhink.Generic.BaseClass;
import Computhink.Pom.My_Preferences;

public class Split_Merge_Documents extends BaseClass {

	

	@Test(priority = 1)

	public void Login_EWA() throws Exception {
		launchUrl();
		LogDipakUser();
		Reporter.log("User has logged in successfully.", true);

	}

	@Test(priority = 2)
	public void Create_Documents() throws Exception {

		My_Preferences pojo = new My_Preferences();
		pojo.Create_Documents_SplitMerge();
	}

	@Test(priority = 3)
	public void TC_01_Select_PdfPage_And_Verify_SplitAll() throws Exception {

		My_Preferences pojo = new My_Preferences();
		pojo.Select_PdfPage_SplitAll();
	}
}
