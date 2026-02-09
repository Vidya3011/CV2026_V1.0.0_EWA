package Computhink.Script;


import org.testng.annotations.Test;
import Computhink.Pom.LanguageHindiFrench;


public class

Language_Hindi extends Computhink.Generic.BaseClass {


	@Test(priority = 1)
	public void Login() throws Exception {

		launchUrl();
		LanguageHindiFrench ln = new LanguageHindiFrench();
		ln.HindiLanguageScript();
		Thread.sleep(3000);
		loginCVS();
	}

}
