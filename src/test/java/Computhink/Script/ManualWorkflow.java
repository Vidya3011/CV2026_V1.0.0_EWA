package Computhink.Script;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import Computhink.Pom.ToDoListTab;

public class
ManualWorkflow extends Computhink.Generic.BaseClass {

	public static SoftAssert so;

	@Test(priority = 1)
	public void Login() throws Exception {

		launchUrl();
		loginRNISHA47();

		Reporter.log("User logged in successfully... ");

	}

	@Test(priority = 2)
	public void TC_1_SendDoc() throws Exception {
		ToDoListTab todo = new ToDoListTab();
		todo.SendingDocumentToworkflow();
		Thread.sleep(10000);

		Reporter.log("Logout the current session");

	}

	@Test(priority = 3)
	public void TC_2_refrshAndLogRnishaUser() throws Exception {
		ToDoListTab todo = new ToDoListTab();
		Thread.sleep(4000);
		todo.LogRnishaTaskUser1();
		jsclick(Refresh_Button(driver));

	}

	@Test(priority = 4)
	public void TC_3_SendAndNewItemsMetaDataAgree() throws Exception {

		ToDoListTab todo = new ToDoListTab();
		todo.SendAndNewItemsMetaDataAgree();
		Reporter.log("Successfully Document  Move to Task User2");
		Reporter.log("Task user1 Logout the Session...");
	}

	@Test(priority = 5)
	public void TC_4_Task2UserVidyaAccept() throws Exception {
		ToDoListTab todo = new ToDoListTab();
		Thread.sleep(8000);
		todo.refrshLogVidyaTaskUser();
		jsclick(Refresh_Button(driver));

	}

	@Test(priority = 6)
	public void TC_5_TaskUserVidyaAcceptTheDocument() throws Exception {
		ToDoListTab todo = new ToDoListTab();
		todo.TaskUser2RNishaRejectTheDocument();

	}

	@Test(priority = 7)
	public void TC_6_refrshAndLogDNishaC() throws Exception {
		ToDoListTab todo = new ToDoListTab();
		Thread.sleep(3000);
		todo.refrshLog3rdTaskUserNishaC();
		Thread.sleep(3000);

		jsclick(Refresh_Button(driver));
		Reporter.log("TaskUser3 Dipak Logged in successful");
	}

	// @Test(priority = 8)
	public void TC_7_SummaryStatusDialogBoxFucntions() throws InterruptedException {
		ToDoListTab todo = new ToDoListTab();
		todo.SummaryStatusDialogBoxFucntions();
	}

	@Test(priority = 9)
	public void TC_8_DocEndedFromTask3NishaCUser() throws Exception {
		ToDoListTab todo = new ToDoListTab();
		todo.DocEndedFromTask3NishaCUser();
	}

}
