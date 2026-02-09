package Computhink.Script;

//Dipak Automation Coading

import org.testng.Reporter;
import org.testng.annotations.Test;

import Computhink.Generic.BaseClass;
import Computhink.Pom.My_Preferences;

public class My_Preferences_DateFormat extends BaseClass {


	@Test(priority = 1)

	public void Login_EWA() throws Exception {
		launchUrl();
		LogDipakUser();
		Reporter.log("User has logged in successfully", true);

	}

	@Test(priority = 2)
	public void TC_01_Verify_DateFormat_YYYY_MM_DD() throws Exception {

		My_Preferences pojo = new My_Preferences();
		pojo.Verify_DateFormat_YYYY_MM_DD();

	}

	@Test(priority = 3)
	public void TC_02_Verify_DateFormat_DD_MM_YYYY() throws Exception {

		My_Preferences pojo = new My_Preferences();
		pojo.Verify_DateFormat_DD_MM_YYYY();

	}

	@Test(priority = 4)
	public void TC_03_Verify_DateFormat_MM_DD_YYYY() throws Exception {

		My_Preferences pojo = new My_Preferences();
		pojo.Verify_DateFormat_MM_DD_YYYY();

	}

	@Test(priority = 5)
	public void TC_04_Verify_DateFormat_Default() throws Exception {

		My_Preferences pojo = new My_Preferences();
		pojo.Verify_DateFormat_Default();

	}
}
