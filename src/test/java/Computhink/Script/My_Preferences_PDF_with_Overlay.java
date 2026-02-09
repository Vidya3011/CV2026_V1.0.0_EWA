package Computhink.Script;

//Dipak Automation Coading

import org.testng.Reporter;
import org.testng.annotations.Test;

import Computhink.Generic.BaseClass;
import Computhink.Pom.My_Preferences;

public class My_Preferences_PDF_with_Overlay extends BaseClass {

	@Test(priority = 1)

	public void Login_EWA() throws Exception {
		launchUrl();
		LogDipakUser();
		Reporter.log("User has logged in successfully.", true);

	}

	@Test(priority = 2)
	public void TC_01_Verify_PDF_with_Overlay_Disable() throws Exception {

		My_Preferences pojo = new My_Preferences();
		pojo.Verify_PDF_with_Overlay_Disable();

	}

	@Test(priority = 3)
	public void TC_02_Verify_PDF_with_Overlay_Enable() throws Exception {

		My_Preferences pojo = new My_Preferences();
		pojo.Verify_PDF_with_Overlay_Enable();
	}
}
