package Computhink.Script;

//Dipak Automation Coading

import org.testng.Reporter;
import org.testng.annotations.Test;

import Computhink.Generic.BaseClass;
import Computhink.Pom.My_Preferences;

public class Negative_Mypreference_Redactionpassword extends BaseClass {


	@Test(priority = 1)

	public void Login_EWA() throws Exception {
		launchUrl();
		LogDipakUser();
		Reporter.log("User has logged in successfully.", true);

	}

	@Test(priority = 2)
	public void TC_01_Verify_Redaction_View_Password() throws Exception {

		My_Preferences pojo = new My_Preferences();

		Reporter.log("Test Scenario 1 : Verifying Redaction View Password", true);
		pojo.Verify_Redaction_View_Password();
	}

	@Test(priority = 3)
	public void TC_02_Verify_InvalidRedaction_View_Password() throws Exception {

		My_Preferences pojo = new My_Preferences();
		pojo.Verify_InvalidRedaction_View_Password();

	}

	@Test(priority = 4)
	public void TC_03_Verify_ResetInvalidPassword_My_Preferences() throws Exception {

		My_Preferences pojo = new My_Preferences();
		pojo.Verify_ResetInvalidPassword_My_Preferences();

	}
}
