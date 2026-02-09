package Computhink.Script;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Computhink.Pom.Print;

public class


PrintFunctionality extends Computhink.Generic.BaseClass {

	public static SoftAssert so;
	
	@Test(priority = 1)
	public void Login() throws Exception {
	
		launchUrl();
		loginRNISHA47();
		
		Reporter.log("User logged in successfully... ");
		
	}
	
	

	 @Test(priority=9)
	public void PrintWithcertifiedCoverPageUnlockRedaction() throws Exception {
		Print pojo = new Print();
		pojo.PrintWithcertifiedCoverPageUnlockRedaction();

	}

}

/*
 * Robot r=new Robot(); String fol="nisha"; for (char c:fol.toCharArray()) { int
 * keyCode=KeyEvent.getExtendedKeyCodeForChar(c); r.keyPress(keyCode);
 * r.keyRelease(keyCode); } r.keyPress(KeyEvent.VK_ENTER);
 * r.keyRelease(KeyEvent.VK_ENTER);
 * 
 * r.keyPress(KeyEvent.VK_ENTER); r.keyRelease(KeyEvent.VK_ENTER);
 */
