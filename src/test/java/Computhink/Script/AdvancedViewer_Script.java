package Computhink.Script;

import org.testng.Reporter;
import org.testng.annotations.Test;
import Computhink.Pom.AdvancedViewer;

public class AdvancedViewer_Script extends Computhink.Generic.BaseClass {


	@Test(priority = 1)
	public void Login_To_EWA() throws Exception { //
		launchUrl();
		Reporter.log("Contentverse URL launched successfully...");
		loginRNISHA47();
		Reporter.log("User logged in successful... ");
		
	}

	@Test(priority = 2)
	public void TestCase_1_AdvancedViewerOptionSelection() throws Exception {

		AdvancedViewer ad = new AdvancedViewer();
		ad.AdvancedViewerOption();
		Thread.sleep(5000);
	}

	@Test(priority = 3)
	public void TestCase_2_AdvancedViewerWordDocument() throws Exception {

		AdvancedViewer ad = new AdvancedViewer();

		ad.CreateDocumentAdvancedViewWordDocument();
		Reporter.log("Word Document verified successful");
	}

	@Test(priority = 4)
	public void TestCase_3_Verify_Link_Option() throws Exception {

		AdvancedViewer ad = new AdvancedViewer();
		ad.LinkWord();
		Reporter.log("Word Document verified successful");
	}

	@Test(priority = 5)
	public void TestCase_4_Verify_Header_Option() throws Exception {

		AdvancedViewer ad = new AdvancedViewer();
		ad.HeaderWord();
		Reporter.log("Word Document verified successful");
	}

	@Test(priority = 6)
	public void TestCase_5_Verify_Footer_Option() throws Exception {

		AdvancedViewer ad = new AdvancedViewer();
		ad.FooterWord();
		Reporter.log("Word Document verified successful");
	}

	@Test(priority = 7)
	public void TestCase_6_Save_And_Reopen() throws Exception {

		AdvancedViewer ad = new AdvancedViewer();
		ad.SaveDocumentAndReopen();

		Reporter.log("Word Document verified successful");
	}

	@Test(priority = 8)
	public void TestCase_7_AdvancedViewerPDfDocument() throws Exception {
		AdvancedViewer ad = new AdvancedViewer();
		ad.AdvancedViewPDFDocument();
		Reporter.log("PDF Document verified successfull");

	}

	@Test(priority = 9)
	public void TestCase_8_AdvancedViewerExcelDocument() throws Exception {
		AdvancedViewer ad = new AdvancedViewer();
		ad.AdvancedViewExcelDocumentt();
		Reporter.log("Excel spread sheet verified successfull");

	}
}