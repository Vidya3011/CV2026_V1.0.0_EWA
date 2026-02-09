package Computhink.Script;


import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import Computhink.Generic.FailedRetry;
import Computhink.Pom.Print;

public class

SendToMail extends Computhink.Generic.BaseClass {

	public static SoftAssert so;


	@Test(priority = 1)
	public void Login() throws Exception {
	
		launchUrl();
		loginRNISHA47();
		
		Reporter.log("User logged in successfully... ");
		
	}


	@Test(priority = 4)
	public void TC_C_Email_ConvertPDF_WithAll_Annotations() throws Exception {
		Print pojo = new Print();
		pojo.Email_ConvertPDF_With_Annotation();
	}

	@Test(priority = 2)
	public void TC_A_Email_Reference() throws Exception {
		Print pojo = new Print();
		pojo.Email_Reference();
		
	}

	@Test(priority = 3, retryAnalyzer = FailedRetry.class)
	public void TC_B_Email_Copy_WithMsgBox_SubjectBox() throws Exception {
		Print pojo = new Print();
		pojo.Email_Copy_WithMsgBox_SubjectBox();
		

	}

}
