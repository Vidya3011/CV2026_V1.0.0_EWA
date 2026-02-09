package Computhink.Script;


import java.io.IOException;

import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;
import Computhink.Pom.Print;
import Computhink.Pom.SearchFunction;

//NishaR codes
public class SearchSelectDocumentLocation extends Computhink.Generic.BaseClass {
	public static Actions act;

	@Test(priority = 1)
	public void Login() throws Exception {
		launchUrl();
		loginRNISHA47();
		Reporter.log("User logged in successfully... ");
		
		Print pr = new Print();
		pr.OpenDocumentAndCheckPages();
	}

	@Test(priority = 2) // blank search
	public void A_BlankSearch() throws InterruptedException {
		Reporter.log("Scenario 01: Search tab - blank search");
		SearchFunction sr = new SearchFunction();
		sr.BlankSearch();

	}

	@Test(priority = 3)
	public void B_ExactSearchInIndexWithLoadMoreCount() throws InterruptedException, IOException {
		SearchFunction sr = new SearchFunction();
		sr.ExactSearchInIndexWithLoadMoreCount();

	}

	@Test(priority = 4)
	public void C_ExactSearchInIndex() throws Exception {
		SearchFunction sr = new SearchFunction();
		sr.ExactSearchInIndex();
		

	}

	@Test(priority = 5) // atleast one word
	public void D_AtLeastOneWordSeachIndex() throws Exception {
		SearchFunction sr = new SearchFunction();
		sr.AtLeastOneWordSeachIndex();
		
	}

	@Test(priority = 6) // allofthe word search
	public void E_AllOfTheWordSearchIndex() throws Exception {

		SearchFunction sr = new SearchFunction();
		sr.E_AllOfTheWordSearchIndex();

		
	}

	@Test(priority = 8) // Cabinet/drawer/folder level search in search document location
	public void G_FolderLevelSearch() throws InterruptedException {

		SearchFunction sr = new SearchFunction();
		sr.FolderLevelSearch();
		
	}

	@Test(priority = 9) // Cabinet/drawer/ level search in search document location
	public void H_DrawerLevelSearch() throws InterruptedException {

		SearchFunction sr = new SearchFunction();
		sr.DrawerLevelSearch();
		
	}

	@Test(priority = 10) // Cabinet level search in search document location
	public void I_CabinetLevel() throws InterruptedException {

		SearchFunction sr = new SearchFunction();
		sr.CabinetLevel();

		
	}

	@Test(priority = 11)
	public void J_DocumentDropDown() throws Exception {
		SearchFunction sr = new SearchFunction();
		sr.DocumentDropDown();
		
	}

	@Test(priority = 12) // enter value in field and select the user
	public void K_DocumentCreatorDropDown() throws Exception {
		Reporter.log("Scenario 14:Verify Search tab  ('document creator')");
		SearchFunction sr = new SearchFunction();
		sr.DocumentCreatorDropDown();
		

	}

	@Test(priority = 13)
	public void L_Reject_WF() throws InterruptedException {
		SearchFunction sr = new SearchFunction();
		sr.Reject_WF();
	}

	@Test(priority = 14)
	public void M_PendingWorkflow() throws InterruptedException {
		SearchFunction sr = new SearchFunction();
		sr.PendingWorkflow_Document();
	}

	@Test(priority = 16)
	public void N_CompletedWF_Document() throws Exception {
		SearchFunction sr = new SearchFunction();
		sr.CompletedWF_Document();
	}

	@Test(priority = 17)
	public void O_TaskCompletedWFDocumentt() throws InterruptedException {
		SearchFunction sr = new SearchFunction();
		sr.TaskCompletedWFDocument();
	}

	@Test(priority = 18) // AlloftheWords search
	public void N_TextSearchWithSQLData() throws InterruptedException, IOException {
		SearchFunction sr = new SearchFunction();
		sr.TextSearchWithSQLData();

		
	}

	@Test(priority = 19) // AlloftheWords search
	public void O_TextSearchWithAllOftheWords() throws InterruptedException, IOException {

		SearchFunction sr = new SearchFunction();
		sr.TextSearchWithAllOftheWords();

		
	}

	@Test(priority = 20) // AlloftheWords search
	public void P_TextSearchWithAtpartOftheWord() throws InterruptedException, IOException {

		SearchFunction sr = new SearchFunction();
		sr.TextSearchWithAtpartOftheWord();

	}

	@Test(priority = 21)
	public void AppendToHit() throws InterruptedException, IOException {
		SearchFunction sr = new SearchFunction();
		sr.AppendToHit();

	}

	/*@Test(priority = 22)
	public void Find_In_Hit_List() throws InterruptedException, IOException {
		SearchFunction sr = new SearchFunction();
		sr.Find_In_Hit_List();
		log.info("Find in hit list functionality working fine");
	}
*/
	@Test(priority = 23)
	public void All_Version() throws InterruptedException, IOException {
		SearchFunction sr = new SearchFunction();
		sr.All_Version();
		
	}

	@Test(priority = 24) // TreeIcon search
	public void Q_FolderSerchIcon() throws Exception {
		SearchFunction sr = new SearchFunction();
		sr.FolderSerchIcon();
		

	}

	@Test(priority = 25) // Quick search
	public void R_QuickSearch() throws Exception {
		SearchFunction sr = new SearchFunction();
		sr.QuickSearch();
		
		// Reporter.log("quick search works fine");

	}

	@Test(priority = 26)
	public void S_DocumentSearch() throws Exception {
		SearchFunction sr = new SearchFunction();
		Reporter.log("Scenario 24:Folder document search");
		sr.SearchDocumentsTabInPage();

		jsclick(Refresh_Button(driver));
		Thread.sleep(5000);
		Reporter.log("The documents Search from folder completed, working fine");
		
	}

	@Test(priority = 27)
	public void CreateAndModifyDate() throws InterruptedException, IOException {
		SearchFunction sr = new SearchFunction();
		sr.SavedDocumentDateEnter();
	}
}
