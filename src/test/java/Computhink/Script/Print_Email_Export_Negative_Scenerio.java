package Computhink.Script;

import org.testng.Reporter;
import org.testng.annotations.Test;

import Computhink.Generic.BaseClass;
import Computhink.Pom.Print;


public class

Print_Email_Export_Negative_Scenerio extends BaseClass {


	
	@Test(priority = 1)
	public void Login() throws Exception {
	
		launchUrl();
		loginRNISHA47();
		
		Reporter.log("User logged in successfully... ");
		
	}

	@Test(priority = 2)
	private void TC_1_Email_Print_Export_Negative_Script() throws Exception {
		Print pojo = new Print();
		pojo.Email_ConvertPDF_WithAll_Annotations_Invalid();
	}

}
