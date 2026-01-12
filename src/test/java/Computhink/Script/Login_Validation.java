package Computhink.Script;

import java.util.ArrayList;
//Dipak Automation Coading

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Computhink.Pom.Login;

public class Login_Validation extends Computhink.Generic.BaseClass {

	@BeforeClass
	public void Launch_Browser() throws Exception {

		loadBrowser("Chrome");
		launchUrl();
		LogDipakUser();
		Reporter.log("CVS URL started Successfully", true);
	}

	@Test(priority = 1)
	public void TC_01_ContentVerseURLAndTitleValidation() throws Exception {

		Login pojo = new Login();
		pojo.ContentVerse_URLAndTitleAssertValidation();
		//pojo.ContentVerse_eyeIconValidation();
	}

	@Test(priority = 2)
	public void TC_02_ContentVerseURLValidation() throws Exception {

		Login pojo = new Login();
		Thread.sleep(2000);
		pojo.ContentVerse_URLValidation();
		
	}

	@Test(priority = 3)
	public void TC_03_Verifying_No_button_of_Session_for_user_is_already_active_dialog_box() throws Exception {

		Login pojo = new Login();
		Thread.sleep(4000);
		LogDipakUser();
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		launchUrl();
		Thread.sleep(4000);
		pojo.Verifying_No_button_of_Session_for_user_is_already_active_dialog_box();
	}

	@Test(priority = 4)
	public void TC_04_Verifying_Login_EWA_with_blank_Username() throws Exception {

		Login pojo = new Login();
		Thread.sleep(4000);
		pojo.Verifying_Login_EWA_with_blank_Username();
	}

	@Test(priority = 5)
	public void TC_05_Verifying_Login_EWA_with_blank_Password() throws Exception {

		Login pojo = new Login();
		pojo.Verifying_Login_EWA_with_blank_Password();

	}

	@Test(priority = 6)
	public void TC_06_Verifying_Login_EWA_without_Selecting_Roomname() throws Exception {

		Login pojo = new Login();
		pojo.Verifying_Login_EWA_without_Selecting_Roomname();

	}

	@Test(priority = 7)
	public void TC_07_Verifying_Login_EWA_with_Invalid_Username() throws Exception {

		Login pojo = new Login();
		pojo.Verifying_Login_EWA_with_Invalid_Username();

	}

	@Test(priority = 8)
	public void TC_08_Verifying_Login_EWA_with_Invalid_Password() throws Exception {

		Login pojo = new Login();
		pojo.Verifying_Login_EWA_with_Invalid_Password();

	}

	@Test(priority = 9)
	public void TC_09_Verifying_Yes_button_of_Session_for_user_is_already_active_dialog_box() throws Exception {
		Login pojo = new Login();
		pojo.Verifying_Yes_button_of_Session_for_user_is_already_active_dialog_box();
		//driver.quit();
	}
	
	@Test(priority = 10)
	public void TC_10_Verifying_Browser_Allowing_Only_OneUser_Login () throws Exception {
		Login pojo = new Login();
		pojo.Verifying_Browser_Allowing_Only_OneUser_Login ();
		LogoutPage();
		driver.quit();
	}
}
