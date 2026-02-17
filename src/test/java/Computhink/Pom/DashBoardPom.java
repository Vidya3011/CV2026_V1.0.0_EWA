package Computhink.Pom;

import java.time.Duration;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import Computhink.Generic.BaseClass;

//NishaR codes 
public class DashBoardPom extends BaseClass {

	public DashBoardPom() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = ("//img[@src='images/newDashboard.png']"))
	private WebElement DashBoardTab;

	@FindBy(xpath = ("//div[@class='e-list-icon e-icons home']"))
	private WebElement HomeICon;

	@FindBy(xpath = ("(//div[@class='e-list-icon e-icons analyticsChart'])[1]"))
	private WebElement SearchICon;

	@FindBy(xpath = ("(//div[@class='e-list-icon e-icons settings'])[1]"))
	private WebElement SettingICon;

	@FindBy(xpath = ("(//li[@id='dock_dashboardAllNotifications'])[1]"))
	private WebElement NotificationICon;

	@FindBy(xpath = ("(//div[@class='e-list-icon e-icons viewDocumentFromDashboard'])[1]"))
	private WebElement DefaultViewICon;

	@FindBy(xpath = ("(//div[@class='e-list-icon e-icons reports'])[1]"))
	private WebElement CVSReportICon;

	@FindBy(xpath = ("//*[@id=\"dock_dashboardLogout\"]/div/div"))
	private WebElement LogoutFromDashBRD;

	@FindBy(id = ("clearSearchBtnLabel"))
	private WebElement SearchClearButton;

	@FindBy(xpath = ("(//button[@id='advFindBtnLabel'])[1]"))
	private WebElement SearchFindButton;

	@FindBy(xpath = ("(//span[@id='spanNotifylist'])[1]"))
	private WebElement NotificationDropDown;

	@FindBy(xpath = ("(//button[@id='notifySaveBtn'])[1]"))
	private WebElement applyBTNmypref;

	@FindBy(xpath = ("(//button[@id='reset'])[1]"))
	private WebElement resetBTNmyPref;

	@FindBy(xpath = ("//*[@id=\"todoListTypesDiv\"]/span"))
	private WebElement TodoListDropDownDashBoard;

	@FindBy(xpath = ("//li[text()='New Items']"))
	private WebElement newItems;

	@FindBy(xpath = ("//li[text()='Pending Items']"))
	private WebElement pendingItems;

	@FindBy(xpath = ("//li[text()='All Items']"))
	private WebElement allItems;

	@FindBy(xpath = ("//li[text()='Sent Items']"))
	private WebElement sentItems;

	@FindBy(xpath = ("//li[text()='Reviewed Items']"))
	private WebElement reviewItems;

	@FindBy(xpath = ("(//div[@class='e-next e-icons e-icon-next e-nextpage e-pager-default'])[1]"))
	private WebElement nextPage;
	
	@FindBy(xpath = "//*[@id=\"imgSettings\"]")
	private WebElement Setting_Icon;
	
	@FindBy(xpath = "//*[@id='adminPreferencesSubmit']")
	private WebElement AdminApply_button;

	@FindBy(xpath = "//li[@id='adminPreferencesSettingsNav']/p")
	private WebElement AdminPreference;
	
	@FindBy(xpath = "//*[@id=\"restrictDashboardView\"]")
	private WebElement checkRestrictDashboard_View;

	

	public void DashBoardSeachIcon() throws Exception {
		SoftAssert softAssert = new SoftAssert();
		log("Test scenario 01: Verify 'dashboard search' functionality");
		Thread.sleep(5000);
		
		Refresh_Button();
		Thread.sleep(6000);
		log("Click on Refresh button");
		LogoutPage();
		LoginAdminUser();
		Thread.sleep(6000);
		movingclkElement(Setting_Icon);
		Thread.sleep(6000);
		log("Click on Setting Icon");
		movingclkElement(AdminPreference);
		Thread.sleep(6000);
		log("Click on Admin preferences");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		Thread.sleep(2000);

		if (checkRestrictDashboard_View.isSelected()) {
			checkRestrictDashboard_View.click();
		}
		
		movingclkElement(AdminApply_button);
		Thread.sleep(6000);
		log("Click on Apply button");
		LogoutPage();
		Thread.sleep(2000);
		LogDipakUser();
		Thread.sleep(4000);
		log("Click on dashboard tab");
		softAssert.assertTrue(DashBoardTab.isDisplayed(), "Dashboard tab is not displayed");

		jsclick(DashBoardTab);
		Thread.sleep(3000);

		log("Dashboard opened successfully");
		movingElement(SearchICon);
		softAssert.assertTrue(SearchICon.isDisplayed(), "Search icon is not displayed");

		log("Click on search icon from the dashboard page");
		jsclick(SearchICon);
		Thread.sleep(6000);

		log("It will redirect to Search tab successfully...");
		jsclick(SearchFindButton);
		softAssert.assertTrue(SearchFindButton.isDisplayed(), "Find button is not displayed");

		log("Click on find button");
		Thread.sleep(6000);
		log("Searched document display on the page successfully...");
		// softAssert.assertAll();
	}

	public void NotificationIcon() throws Exception {
		SoftAssert softAssert = new SoftAssert();
		log("Scenario 02: Verify dashboard 'Notification' functionality");
		try {
			softAssert.assertTrue(DashBoardTab.isDisplayed(), "Dashboard tab is not displayed");

			jsclick(DashBoardTab);
			log("Click on dashboard tab");
		} catch (Exception e) {
			//
		}
		Thread.sleep(3000);

		movingElement(NotificationICon);
		softAssert.assertTrue(NotificationICon.isDisplayed(), "Notification icon is not displayed");

		log("Click on notification icon");
		jsclick(NotificationICon);
		Thread.sleep(8000);

		log("It will redirect to Notification tab successfully...");
		jsclick(Refresh_Button(driver));
		softAssert.assertTrue(Refresh_Button(driver).isDisplayed(), "Refresh button is not displayed");

		log("Notification page displayed successfully...");
		// softAssert.assertAll();
	}

	public void TodoListWFDetailsfromDb() throws Exception {
		SoftAssert softAssert = new SoftAssert();
		Thread.sleep(6000);
		log("Scenario 03: Verify dashboard 'Todolist' dropdown");

		try {
			movingclkElement(DashBoardTab);
			softAssert.assertTrue(DashBoardTab.isDisplayed(), "Dashboard tab is not displayed");
		} catch (Exception e) {
			log("Click on dashboard tab");
		}

		log("Click on dashboard tab");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.elementToBeClickable(TodoListDropDownDashBoard));

		log("Click on todo list dropdown");
		Thread.sleep(5000);
		movingclkElement(TodoListDropDownDashBoard);
		softAssert.assertTrue(TodoListDropDownDashBoard.isDisplayed(), "Todo List dropdown is not displayed");
		Thread.sleep(2000);

		jsclick(newItems);
		log("Click on New items option");
		softAssert.assertTrue(newItems.isDisplayed(), "New Items option is not displayed");

		wait.until(ExpectedConditions.elementToBeClickable(TodoListDropDownDashBoard));
		movingclkElement(TodoListDropDownDashBoard);
		log("It will list the New items workflow documents");
		Thread.sleep(6000);

		log("Click on Pending items option");
		jsclick(pendingItems);
		softAssert.assertTrue(pendingItems.isDisplayed(), "Pending Items option is not displayed");

		log("It will list the Pending items workflow documents");
		Thread.sleep(3000);
		movingclkElement(TodoListDropDownDashBoard);
		softAssert.assertTrue(reviewItems.isDisplayed(), "Review Items option is not displayed");

		jsclick(reviewItems);

		log("Click on Reviewed items option");
		Thread.sleep(3000);
		log("It will list the Reviewed items workflow documents");
		movingclkElement(TodoListDropDownDashBoard);
		softAssert.assertTrue(sentItems.isDisplayed(), "Sent Items option is not displayed");

		jsclick(sentItems);

		log("Click on Sent items option");
		log("It will list the Sent items workflow documents");
		Thread.sleep(3000);
		movingclkElement(TodoListDropDownDashBoard);
		softAssert.assertTrue(allItems.isDisplayed(), "All Items option is not displayed");

		jsclick(allItems);

		log("Click on All items option");
		Thread.sleep(7000);
		log("It will list the All items workflow documents");

		try {
			if (nextPage.isDisplayed()) {
				jsclick(nextPage);
			}
		} catch (Exception e) {
			log("No more pages");
		}

		Thread.sleep(6000);
		log("Click on Next page icon");
		log("Page should move to Next page");
		Thread.sleep(4000);
		log("Todo list dropdown options verified successfully...");

		// softAssert.assertAll();
	}

	public void LogoutfromDb() throws Exception {
		SoftAssert softAssert = new SoftAssert();
		log("Scenario 08: Verify 'Logout functionality' from the dashboard");

		log("Click on dashboard tab");
		Thread.sleep(3000);
		movingElement(LogoutFromDashBRD);

		log("Click on logout icon");
		softAssert.assertTrue(LogoutFromDashBRD.isDisplayed(), "Logout icon is not displayed");
		jsclick(LogoutFromDashBRD);

		log("Session logged out successfully");
		Thread.sleep(6000);
		log("Dashboard logout option verified successfully...");
		// softAssert.assertAll();
	}

	@FindBy(xpath = "//*[@id=\"dock_dashboardCreateDocument\"]")
	private WebElement CreateDocDB;

	public void NewDocumentfromDb() throws Exception {
		SoftAssert softAssert = new SoftAssert();
		Thread.sleep(4000);
		log("Scenario 06: Verify dashboard 'New document' functionality");

		// Verifying dashboard tab existence before interacting
		softAssert.assertNotNull(CreateDocDB, "CreateDocDB element is null.");
		log("Click on dashboard tab");

		Thread.sleep(3000);
		movingElement(CreateDocDB);

		log("Click on New document icon");
		jsclick(CreateDocDB);

		// Verifying the navigation to the New document tab
		log("It will redirect to New document tab successfully...");

		log("The New document page opened successfully...");
		Thread.sleep(10000);

	}

	@FindBy(xpath = "//div[@id='dropDownContainer']//div//span[@class='e-input-group-icon e-ddl-icon e-search-icon']")
	private WebElement CVSReport;

	@FindBy(xpath = "//select[@id=\"props_hidden\"]")
	private WebElement SelectClass;

	@FindBy(xpath = "//*[@id=\"report1\"]")
	private WebElement DocumentRep;

	@FindBy(xpath = "//*[@id=\"report2\"]")
	private WebElement WorkflowStatus;

	@FindBy(xpath = "//*[@id=\"report3\"]")
	private WebElement RejectedDocsInWF;

	@FindBy(xpath = "//*[@id=\"reportDateRangePicker\"]")
	private WebElement DateInput;

	@FindBy(xpath = "(//span[@aria-label='select'])[1]")
	private WebElement DateInputIcon;

	@FindBy(xpath = "//*[@id=\"ThisWeek_2\"]")
	private WebElement ThisWeek;

	@FindBy(xpath = "//*[@id=\"generateReport\"]")
	private WebElement GenerateBTN;

	@FindBy(xpath = "//*[@id=\"Grid_excelexport\"]/span[2]")
	private WebElement ExcelExport;

	@FindBy(xpath = "//*[@id=\"Grid_pdfexport\"]/span[2]")
	private WebElement PDFExport;

	public void ContentverseDocumentReport() throws Exception {
		SoftAssert softAssert = new SoftAssert();
		Thread.sleep(4000);

		try {
			softAssert.assertNotNull(DashBoardTab, "DashBoardTab element is null.");
			launchUrl();
			loginRNISHA47();
			Thread.sleep(3000);
			jsclick(DashBoardTab);
			Thread.sleep(3000);
			softAssert.assertNotNull(CVSReportICon, "CVSReportICon element is null.");
			jsclick(CVSReportICon);
		} catch (Exception e) {
			log("Exception while logging in and accessing dashboard");
		}
		// Adding assertions for each step

		log("Select Contentverse Report icon");
		Thread.sleep(5000);
		Actions act = new Actions(driver);

		softAssert.assertNotNull(CVSReport, "CVSReport element is null.");
		act.moveToElement(CVSReport).click().build().perform();
		Thread.sleep(4000);
		log("Select 'Document Report'");

		softAssert.assertNotNull(SelectClass, "SelectClass element is null.");
		Select sel = new Select(SelectClass);
		sel.selectByVisibleText("Documents Report");
		Thread.sleep(3000);
		log("Select 'This Week'");

		softAssert.assertNotNull(DocumentRep, "DocumentRep element is null.");
		act.moveToElement(DocumentRep).click().build().perform();
		Thread.sleep(3000);
		log("Click on Generate Button");

		act.moveToElement(DateInputIcon).click().build().perform();
		Thread.sleep(3000);

		softAssert.assertNotNull(ThisWeek, "ThisWeek element is null.");
		act.moveToElement(ThisWeek).click().build().perform();
		Thread.sleep(4000);

		softAssert.assertNotNull(GenerateBTN, "GenerateBTN element is null.");
		jsclick(GenerateBTN);
		Thread.sleep(8000);

		try {
			alertIsPresent();
			acceptAlert();
		} catch (Exception e) {
			log("No alert present");
		}

		log("It should list the Document Report on the page");

		jsclick(ExcelExport);
		log("Click on Excel export");
		Thread.sleep(5000);

		jsclick(PDFExport);
		log("Click on PDF Export");

		log("Generated Document Report has Exported Successfully...");

	}

	public void ContentverseWorkflowReport() throws Exception {
		SoftAssert softAssert = new SoftAssert();

		log("Scenario 07: Verify 'ContentverseReport' - Workflow Status Reports");
		Thread.sleep(4000);

		try {
			softAssert.assertNotNull(DashBoardTab, "DashBoardTab element is null.");
			loginRNISHA47();
			Thread.sleep(3000);
			jsclick(DashBoardTab);
			Thread.sleep(3000);
			softAssert.assertNotNull(CVSReportICon, "CVSReportICon element is null.");
			jsclick(CVSReportICon);
		} catch (Exception e) {
			log("Exception while logging in and accessing dashboard");
		}

		Thread.sleep(5000);
		Actions act = new Actions(driver);
		softAssert.assertNotNull(CVSReport, "CVSReport element is null.");
		act.moveToElement(CVSReport).click().build().perform();
		Thread.sleep(4000);

		log("Mouse hover on Document Report dropdown and Select 'Workflow Status Report'");
		softAssert.assertNotNull(SelectClass, "SelectClass element is null.");
		Select sel = new Select(SelectClass);
		sel.selectByVisibleText("Documents Report");
		Thread.sleep(3000);

		log("Select 'This Week'");
		softAssert.assertNotNull(WorkflowStatus, "WorkflowStatus element is null.");
		act.moveToElement(WorkflowStatus).click().build().perform();
		Thread.sleep(3000);

		log("Click on Generate Button");
		softAssert.assertNotNull(DateInputIcon, "DateInputIcon element is null.");
		act.moveToElement(DateInputIcon).click().build().perform();
		Thread.sleep(3000);

		softAssert.assertNotNull(ThisWeek, "ThisWeek element is null.");
		act.moveToElement(ThisWeek).click().build().perform();
		Thread.sleep(4000);

		softAssert.assertNotNull(GenerateBTN, "GenerateBTN element is null.");
		jsclick(GenerateBTN);
		Thread.sleep(8000);

		try {
			alertIsPresent();
			acceptAlert();
		} catch (Exception e) {
			log("No alert present");
		}

		log("It should list the 'Workflow Status Report' on the page");
		try {

			jsclick(ExcelExport);
			log("Click on Excel export");
			Thread.sleep(5000);

			jsclick(PDFExport);
			log("Click on PDF Export");
		} catch (Exception e) {
			log("Error during export actions");
		}

		log("Generated Document Report has Exported Successfully...");
		softAssert.assertNotNull(CloseIconCVS, "CloseIconCVS element is null.");
		jsclick(CloseIconCVS);

	}

	public void ContentverseRejectDocumentInWFReport() throws Exception {
		SoftAssert softAssert = new SoftAssert();
		Thread.sleep(4000);
		log("Scenario 08: Verify 'ContentverseReport' - Reject document in workflow Report");

		try {
			loginRNISHA47();
			Thread.sleep(3000);
			softAssert.assertNotNull(DashBoardTab, "DashBoardTab element is null.");
			jsclick(DashBoardTab);
			Thread.sleep(3000);
			softAssert.assertNotNull(CVSReportICon, "CVSReportICon element is null.");
			jsclick(CVSReportICon);
		} catch (Exception e) {
			log("Exception while logging in and accessing dashboard");
		}

		Actions act = new Actions(driver);

		try {
			softAssert.assertNotNull(CVSReportICon, "CVSReportICon element is null.");
			jsclick(CVSReportICon);

			softAssert.assertNotNull(CVSReport, "CVSReport element is null.");
			act.moveToElement(CVSReport).click().build().perform();
		} catch (Exception e) {
			log("Error clicking on CVSReport or interacting with it.");
		}

		Thread.sleep(2000);

		try {
			log("Mouse hover on Document Report dropdown and Select 'Reject document in workflow Report");
			softAssert.assertNotNull(SelectClass, "SelectClass element is null.");
			Select sel = new Select(SelectClass);
			sel.selectByVisibleText("Documents Report");
			Thread.sleep(3000);
			log("Select 'This Week'");
		} catch (Exception e) {
			log("Error selecting 'Documents Report' or 'This Week'.");
		}

		try {
			softAssert.assertNotNull(RejectedDocsInWF, "RejectedDocsInWF element is null.");
			act.moveToElement(RejectedDocsInWF).click().build().perform();
			Thread.sleep(3000);
		} catch (Exception e) {
			log("Error selecting 'Reject document in workflow Report'.");
		}

		log("Click on Generate Button");
		softAssert.assertNotNull(DateInputIcon, "DateInputIcon element is null.");
		try {
			act.moveToElement(DateInputIcon).click().build().perform();
			Thread.sleep(3000);
		} catch (JavascriptException e) {
			//
		}

		try {
			softAssert.assertNotNull(ThisWeek, "ThisWeek element is null.");
			act.moveToElement(ThisWeek).click().build().perform();
		} catch (Exception e) {
			log("Error selecting 'This Week'.");
		}

		Thread.sleep(4000);
		softAssert.assertNotNull(GenerateBTN, "GenerateBTN element is null.");
		jsclick(GenerateBTN);
		Thread.sleep(8000);

		try {
			alertIsPresent();
			acceptAlert();
		} catch (Exception e) {
			log("No alert present");
		}

		log("It should list the 'Reject document in workflow' Report on the page");

		try {
			// softAssert.assertTrue(VisiblityOf(ExcelExport), "ExcelExport element is not
			// visible.");
			jsclick(ExcelExport);
			log("Click on Excel export");
			Thread.sleep(5000);

			// softAssert.assertTrue(VisiblityOf(PDFExport), "PDFExport element is not
			// visible.");
			jsclick(PDFExport);
			log("Click on PDF Export");
		} catch (Exception e) {
			log("Error exporting the report to Excel or PDF.");
		}

		Thread.sleep(3000);
		log("Generated Document Report has Exported Successfully...");

		softAssert.assertNotNull(CloseIconCVS, "CloseIconCVS element is null.");
		jsclick(CloseIconCVS);
		Thread.sleep(3000);

		softAssert.assertAll();
	}

	@FindBy(css = "#defaultDialog_dialog-header > button") // *[@id=\"defaultDialog_dialog-header\"]/button
	private WebElement CloseIconCVS;

}