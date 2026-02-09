package Computhink.Script;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Computhink.Pom.ToDoListTab;

//NishaR codes
public class

DynamicWorkflow extends Computhink.Generic.BaseClass {

	public static SoftAssert so;

	@Test(priority = 1)
	public void Login() throws Exception {

		launchUrl();
		loginRNISHA47();

		Reporter.log("User logged in successfully... ");

	}

	@Test(priority = 2)
	public void DynamicWf() throws Exception {

		ToDoListTab todo = new ToDoListTab();
		todo.DynamicWorkFlowTodoListFunctionality();
	}

	@Test(priority = 3)
	public void dyanamic_wf_AndLogVidyaUser() throws Exception {
		ToDoListTab todo = new ToDoListTab();
		Thread.sleep(8000);
		todo.LogVidyaTaskUser1();

	}

	@Test(priority = 4)
	public void TC_1_dynamicWF_MetaDataAgree_Vidya() throws Exception {

		ToDoListTab todo = new ToDoListTab();
		todo.dynamicWF_MetaDataAgree_Vidya();
	}

	@Test(priority = 5)
	public void TC_2_dynamic_WF_Task2UserNisha() throws Exception {
		ToDoListTab todo = new ToDoListTab();
		Thread.sleep(8000);
		todo.LogRnishaTaskUser1();

	}

	@Test(priority = 6)
	public void TC_3_DynamicWF_user2_RNishaAcceptTheDocument() throws Exception {
		ToDoListTab todo = new ToDoListTab();
		todo.DynamicWF_user2_RNishaAcceptTheDocument();

	}

	@Test(priority = 7)
	public void TC_4_DynamicWFrefrshAndLogDipak() throws Exception {
		ToDoListTab todo = new ToDoListTab();
		Thread.sleep(3000);
		todo.refrshLogDipakTaskUser();

	}

	@Test(priority = 8)
	public void TC_5_DynamicWF_user3_DipakRejectTheDocument() throws Exception {
		ToDoListTab todo = new ToDoListTab();
		todo.DynamicWF_user3_DipakRejectTheDocument();

	}

	@Test(priority = 8)
	public void dynamic_WF_OriginatorRnisha() throws Exception {
		ToDoListTab todo = new ToDoListTab();
		Thread.sleep(8000);
		todo.LogRnishaTaskUser1();

	}

	@Test(priority = 9)
	public void Originator_Reviewing_Workflow_Document() throws Exception {
		ToDoListTab todo = new ToDoListTab();
		Thread.sleep(8000);
		todo.Originator_Pending_Items();

	}
}
