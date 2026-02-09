package Computhink.Script;


import org.testng.Reporter;
import org.testng.annotations.Test;

import Computhink.Pom.My_Preferences;

//Dipak Automation Coading

public class My_Preferences_Defaultviewing extends Computhink.Generic.BaseClass {


	@Test(priority = 1)

	public void Login_EWA() throws Exception {
		launchUrl();
		LogDipakUser();
		Reporter.log("User has logged in successfully.", true);

	}

	@Test(priority = 2)
	public void TC_01_Verify_Defaultviewing_Convert_To_PDF() throws Exception {

		My_Preferences pojo = new My_Preferences();
		pojo.Verify_Defaultviewing_Convert_To_PDF();

	}

	@Test(priority = 3)
	public void TC_02_Verify_Defaultviewing_Native_Format() throws Exception {

		My_Preferences pojo = new My_Preferences();
		pojo.Verify_Defaultviewing_Native_Format();
	}
}
