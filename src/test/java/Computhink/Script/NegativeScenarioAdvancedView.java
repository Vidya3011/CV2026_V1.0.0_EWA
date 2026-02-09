package Computhink.Script;

import org.testng.annotations.Test;

import Computhink.Pom.AdvancedViewer;

//NishaR codes
public class
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~NishaR
// codes~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
NegativeScenarioAdvancedView extends Computhink.Generic.BaseClass {


	@Test(priority = 1)
	public void Login() throws Exception {
		launchUrl();
		loginLocalCVS();

		
	}

	@Test(priority = 2)
	public void TC_1_AdvancedViewerOptionSelection() throws Exception {

		AdvancedViewer ad = new AdvancedViewer();
		ad.AdvancedViewerOption();
		Thread.sleep(5000);
	}

	@Test(priority = 3)
	public void TC_2_AdvancedViewPDFDocNegativeScript() throws Exception {

		AdvancedViewer ad = new AdvancedViewer();

		ad.AdvancedViewPDFDocument_WithSpcialCharacterFileName();
		Thread.sleep(5000);
		
	}

}
