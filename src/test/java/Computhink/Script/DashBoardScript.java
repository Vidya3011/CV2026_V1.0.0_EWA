package Computhink.Script;

import org.testng.Reporter;
import org.testng.annotations.Test;


import Computhink.Pom.DashBoardPom;


public class DashBoardScript extends Computhink.Generic.BaseClass {

	
	@Test(priority = 1)
	public void Login() throws Exception {
	
		launchUrl();
		loginRNISHA47();
		
		Reporter.log("User logged in successfully... ");
		
	}

		@Test(priority = 2)
		public void TC_1_SearchIconDashBoardFunctionality() throws Exception {
	
			DashBoardPom db = new DashBoardPom();
			db.DashBoardSeachIcon();
		}
	
		@Test(priority = 3)
		public void TC_2_NotifiactionIconDashBoardFunctionality() throws Exception {
	
			DashBoardPom db = new DashBoardPom();
			db.NotificationIcon();
		}
	
		@Test(priority = 4)
		public void TodoListWFDetailsDashBoardFunctionality() throws Exception {
	
			DashBoardPom db = new DashBoardPom();
			db.TodoListWFDetailsfromDb();
		}
	
		@Test(priority = 5)
		public void TC_4_CreateNewDocumentFromDB() throws Exception {
	
			DashBoardPom db = new DashBoardPom();
			db.NewDocumentfromDb();
		}
	
	@Test(priority = 6)
	public void TC_5_Contentverse_Document_Report() throws Exception {

		DashBoardPom db = new DashBoardPom();
		db.ContentverseDocumentReport();

	}

	@Test(priority = 7)
	public void TC_6_Contentverse_WrokflowStatus_Report() throws Exception {

		DashBoardPom db = new DashBoardPom();
		db.ContentverseWorkflowReport();

	}

	@Test(priority = 8)
	public void TC_7_Contentverse_RejectDocumentInWFReport_Report() throws Exception {

		DashBoardPom db = new DashBoardPom();
		db.ContentverseRejectDocumentInWFReport();

	}

	@Test(priority = 9)
	public void TC_8_logoutFromDB() throws Exception {

		DashBoardPom db = new DashBoardPom();
		db.LogoutfromDb();
	}

}
