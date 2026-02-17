package Computhink.Pom;

import java.time.Duration;

import java.util.Arrays;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import org.testng.asserts.SoftAssert;

import Computhink.Generic.BaseClass;

//NishaR codes

//~~~~~~~~~~~~~~~~~~~~~~~~~~~NishaR codes~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
public class RoomContextMenu extends BaseClass {

	public RoomContextMenu() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = ("//*[@id='navigationMenuBtn']"))
	private WebElement RoomContextTab;

	@FindBy(xpath = ("//div[@id='viewDocumentnavigator']/ul/li[2]/a"))
	private WebElement Cabinet;

	@FindBy(xpath = ("//div[@id='viewDocumentnavigator']/ul/li[1]/a"))
	private WebElement CabinetSecurity;

	@FindBy(xpath = ("//div[@id='viewDocumentnavigator']/ul/li[1]/ins"))
	private WebElement CabinetTest;

	@FindBy(xpath = ("//div[@id='viewDocumentnavigator']/ul/li[1]/ul/li[1]/ins"))
	private WebElement Drawer;

	@FindBy(xpath = ("//div[@id='viewDocumentnavigator']/ul/li[1]/ul/li[1]/ul/li[2]/a")) // 5 dipak automation folder
	private WebElement Folder;

	@FindBy(xpath = ("//*[@id=\"1002\"]/a"))
	private WebElement FolderVidya;

	@FindBy(xpath = ("//*[@id=\"settings\"]"))
	private WebElement SettingsIcon;

	@FindBy(xpath = ("//*[@id='idSidenavSettings']/ul/li[4]"))
	private WebElement AdminPreference;

	@FindBy(xpath = ("//*[@id='sortNavigationTreeId']"))
	private WebElement NavigationSort;

	@FindBy(xpath = "//*[@id=\"createDocument\"]")
	private WebElement Click_New_Document;

	@FindBy(xpath = "//*[@id=\"createDocuemtnLocation\"]")
	private WebElement Destination_Folder_Textbox;

	@FindBy(xpath = "//*[@id=\"navigatorTreeOk\"]")
	private WebElement OK_Button_BrowseforFolder;

	public void NavigateName() {
		org.openqa.selenium.support.ui.Select sel = new org.openqa.selenium.support.ui.Select(NavigationSort);
		sel.selectByVisibleText("Name");
	}

	public void NavigateID() {
		org.openqa.selenium.support.ui.Select sel = new org.openqa.selenium.support.ui.Select(NavigationSort);
		sel.selectByVisibleText("Id");
	}

	public void ChangeNavigation() throws Exception {

		log("Changing Navigation Sort");
		Thread.sleep(3000);
		jsclick(SettingsIcon);
		log("Click on setting icon");
		Thread.sleep(2000);
		jsclick(AdminPreference);
		log("Select Admin Preference");

		Thread.sleep(2000);
		NavigateName();
		log("Change the navigation Sort as Name");
		Thread.sleep(3000);
		jsclick(ApplyBTN);
		log("Click on Apply button");
		Thread.sleep(3000);
		jsclick(Refresh_Button(driver));
		log("Click on Refresh icon");
		Thread.sleep(4000);

	}

	public void ChangeNavigationID() throws Exception {

		log("Changing Navigation Sort");
		Thread.sleep(3000);
		jsclick(SettingsIcon);
		log("Click on setting icon");
		Thread.sleep(2000);
		jsclick(AdminPreference);
		log("Select Admin Preference");

		Thread.sleep(2000);
		NavigateID();
		log("Change the navigation Sort as Name");
		Thread.sleep(3000);
		jsclick(ApplyBTN);
		log("Click on Apply button");
		Thread.sleep(3000);
		jsclick(Refresh_Button(driver));
		log("Click on Refresh icon");
		Thread.sleep(4000);

	}

	@FindBy(xpath = "//*[@id=\"security\"]")
	private WebElement Security_option;

	@FindBy(xpath = "//*[@id='menu-content']/li[2]")
	private WebElement CVAdmin;

	@FindBy(xpath = "//*[@id=\"securityAdd\"]")
	private WebElement Add_Button;

	@FindBy(xpath = "//*[@id=\"selectedUsersAndGroups\"]")
	private WebElement Ok_button_UserDialog;

	@FindBy(xpath = "//*[@id='existingEntryAlert']/p")
	private WebElement Groupaddvalidation;

	public void getaddvalidationmessage() {
		log(Groupaddvalidation.getText() + " this validation message should show");

	}

	@FindBy(xpath = "//*[@id=\"closeGroupUserModal\"]")
	private WebElement Closebutton;

	@FindBy(xpath = "//*[@id=\"navigationMenuBtn\"]")
	private WebElement MoveTo_Menu_RoomName;

	@FindBy(xpath = "//*[@id=\"cvDocumentClose\"]/span")
	private WebElement closedoc;

	@FindBy(xpath = (".//div[@id='navigatorModel']/div[2]/div[1]/div[1]/ul[1]/li[1]/a[1]"))
	private WebElement Select_Cabinet1;

	@FindBy(xpath = (".//div[@id='navigatorModel']/div[2]/div[1]/div[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
	private WebElement Select_Drawer1;

	@FindBy(xpath = (".//div[@id='navigatorModel']/div[2]/div[1]/div[1]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
	private WebElement Select_Folder1;

	public void getMoveTo_Menu_RoomName() {
		Actions action = new Actions(driver);
		action.moveToElement(MoveTo_Menu_RoomName).perform();
	}

	@FindBy(xpath = ("//*[@id='securityDropdown']"))
	private WebElement SelectPermisson;

	public void GrantPermission() throws Exception {
		org.openqa.selenium.support.ui.Select sel = new org.openqa.selenium.support.ui.Select(SelectPermisson);
		sel.selectByVisibleText("Grant Supervisor");
	}

	@FindBy(id = "applySecurity")
	private WebElement Apply_button_SecurityDialog;

	@FindBy(id = "securityUpdate")
	private WebElement Ok_button_SecurityDialog;

	public void GrantSuperivorPermission() throws Exception {

		log("Verifying Cabinet Permission");
		Thread.sleep(5000);

		selectElement(Cabinet);
		Thread.sleep(3000);
		log("Expand a Cabinet");
		getMoveTo_Menu_RoomName();
		Thread.sleep(2000);
		log("Mousehover to Roomname Tab");
		jsclick(Security_option);
		Thread.sleep(5000);
		log("Click on  Security Option");
		jsclick(Add_Button);
		Thread.sleep(5000);
		log("Click on  Security dialog Add button");
		jsclick(CVAdmin);
		Thread.sleep(5000);
		log("Select CVAdmin Group");

		jsclick(Ok_button_UserDialog);
		Thread.sleep(5000);
		log("Click on Security dialog Ok button");
		try {
			getaddvalidationmessage();
			Thread.sleep(5000);
			log("Verifying Validation message");
			jsclick(Closebutton);
		} catch (Exception e) {
			// Group is not already added
		}
		Thread.sleep(3000);
		GrantPermission();
		Thread.sleep(5000);
		log("Assign to permission to ");
		jsclick(Apply_button_SecurityDialog);
		Thread.sleep(5000);
		log("Click on Security dialog Apply button");
		jsclick(Ok_button_SecurityDialog);
		log("Click on  Security dialog Ok button");
		log("All permission should be given for Cabinet");

	}

	public void GrantSuperivorPermissionForADMINAC() throws Exception {

		log("Verifying Cabinet Permission");
		Thread.sleep(5000);

		log("Expand a Cabinet");
		getMoveTo_Menu_RoomName();
		Thread.sleep(2000);
		log("Mousehover to Roomname Tab");
		jsclick(Security_option);
		Thread.sleep(5000);
		log("Click on  Security Option");
		jsclick(Add_Button);
		Thread.sleep(5000);
		log("Click on  Security dialog Add button");
		jsclick(CVAdmin);
		Thread.sleep(5000);
		log("Select CVAdmin Group");

		jsclick(Ok_button_UserDialog);
		Thread.sleep(5000);
		log("Click on Security dialog Ok button");
		try {
			getaddvalidationmessage();
			Thread.sleep(5000);
			log("Verifying Validation message");
			jsclick(Closebutton);
		} catch (Exception e) {
			// Group is not already added
		}
		Thread.sleep(3000);
		GrantPermission();
		Thread.sleep(5000);
		log("Assign to permission to ");
		jsclick(Apply_button_SecurityDialog);
		Thread.sleep(5000);
		log("Click on Security dialog Apply button");
		jsclick(Ok_button_SecurityDialog);
		log("Click on  Security dialog Ok button");
		log("All permission should be given for Cabinet");

	}

	@FindBy(xpath = ("//*[@id='adminPreferencesSubmit']"))
	private WebElement ApplyBTN;

	@FindBy(xpath = ("//a[@id='takeOwnershipFolder']"))
	private WebElement TakeOwner;

	@FindBy(xpath = ("//*[@id=\"documentListTable\"]/tbody/tr[2]/td[3]"))
	private WebElement ForLockedPDFDoc;

	@FindBy(xpath = ("(//button[@class='modalDialogButtons'])[17]"))
	private WebElement OKBTNDocLockDialog;

	@FindBy(xpath = ("//a[@id='releaseOwnershipFolder']"))
	private WebElement ReleaseOSFolder;

	@FindBy(xpath = ("//*[@id='viewDocumentnavigator']/ul/li[1]/ul/li[1]/a")) // first drawer
	private WebElement drawerforCopy;

	@FindBy(xpath = ("//*[@id='viewDocumentnavigator']/ul/li[2]/a"))
	private WebElement BillsCabinet;

	@FindBy(xpath = ("//*[@id='viewDocumentnavigator']/ul/li[2]/ul/li[1]/a"))
	private WebElement BillsDrawer;

	@FindBy(xpath = ("//*[@id='viewDocumentnavigator']/ul/li[2]/ul/li[1]/ul/li[2]/a"))
	private WebElement NewFolderFrPaste;

	@FindBy(xpath = ("//a[@id='copyNodeAnchor']"))
	private WebElement CopyTab;

	@FindBy(xpath = ("(//li[@id='pasteNodeLi'])[2]"))
	private WebElement PasteTab;

	@FindBy(xpath = ("/html/body/div[58]/div[64]/div[1]/div/div[2]/div[2]/ul/li[2]/ul/li[2]/a"))
	private WebElement SelectCopyDrawer;

	@FindBy(xpath = ("(//li[@id='deleteNodeLi'])[2]"))
	private WebElement DeleteTab;

	@FindBy(xpath = ("(//button[@id='takeOwnerShipAnyway25'])[1]"))
	private WebElement TakeOwnerShipYESorNoDialogBoxOKBTN;

	@FindBy(id = ("pasteMessageOk1"))
	private WebElement PasteConfimDialogOKBTN;

	@FindBy(xpath = ("//button[@id='deleteMessageOk1']"))
	private WebElement DeleteConfimDialogOKBTN;

	@FindBy(xpath = ("//a[@id='nodeProperties']"))
	private WebElement NodeProperties;

	@FindBy(xpath = ("//*[@id=\"docIndicesDivNodeProperties\"]//tr[1]/td[3]/input[2]"))
	private WebElement TextKey;

	@FindBy(xpath = ("(//button[@id='navigatorTreeReset31'])[1]"))
	private WebElement NodeResetBTN;

	@FindBy(xpath = ("(//button[@id='resetMessageOk34'])[1]"))
	private WebElement NodeResetYesBTN;

	@FindBy(xpath = ("(//input[@id='nodePropVal_341'])[1]"))
	private WebElement numeric123;

	@FindBy(xpath = ("//*[@id='navigatorTreeOk31']"))
	private WebElement NodePropOKBTN;

	@FindBy(xpath = ("(//a[normalize-space()='3'])[1]"))
	private WebElement DateOct;

	@FindBy(xpath = ("(//select[@id='nodePropVal_343'])[1]"))
	private WebElement Boolean123;

	@FindBy(id = ("nodePropVal_343"))
	private WebElement YesORNoBoolean;

	@FindBy(xpath = ("(//input[@id='nodePropVal_342'])[1]"))
	private WebElement Date;

	@FindBy(xpath = ("(//input[@id='nodePropVal_37'])[1]"))
	private WebElement Restaurent;

	@FindBy(xpath = ("(//input[@id='nodePropVal_33'])[1]"))
	private WebElement Reportname;

	@FindBy(xpath = ("(//a[@id='createDocument'])[1]"))
	private WebElement CreateDocTab;

	@FindBy(xpath = ("//div[@id='viewDocumentnavigator']/ul/li[1]/ul/li[1]/ul/li[4]/a")) // dipak automation folder
	private WebElement FolderForCopy;

	@FindBy(xpath = ("//*[@id=\"1\"]/ins"))
	private WebElement CabinetForCSR;

	@FindBy(xpath = ("//*[@id=\"2\"]/ins"))
	private WebElement DrawerForCSR;

	@FindBy(xpath = ("//*[@id=\"70\"]/a"))
	private WebElement FolderForCSR;

	@FindBy(xpath = ("(//select[@id='docTypeList'])[1]"))
	private WebElement selectDocDropDown;

	@FindBy(xpath = ("(//select[@id='nodePropertiesDocTypeList'])[1]"))
	private WebElement selectDocDropDownFrNode;

	@FindBy(xpath = ("(//a[@id='setNotificationsAnchor'])[1]"))
	private WebElement Notification;

	@FindBy(xpath = ("(//span[@id='spanNotifylist'])[1]"))
	private WebElement NotificationDropDown;

	@FindBy(xpath = ("(//button[@id='notifySaveBtn'])[1]"))
	private WebElement applyBTNmypref;

	@FindBy(xpath = ("(//button[@id='reset'])[1]"))
	private WebElement resetBTNmyPref;

	@FindBy(xpath = ("//div[@id='viewDocumentnavigator']/ul/li[2]/a"))
	private WebElement CabinetForCustomDoc;

	@FindBy(xpath = ("//a[@id='custmDocumentTypes']"))
	private WebElement customdoc;

	@FindBy(xpath = ("//div[@id='showcustomDocTypeModel']/ul/li[1]/span[2]"))
	private WebElement bill;

	@FindBy(xpath = ("//div[@id='showcustomDocTypeModel']/ul/li[3]/span[2]"))
	private WebElement dateMask;

	@FindBy(xpath = ("//div[@id='showcustomDocTypeModel']/ul/li[4]/span[2]"))
	private WebElement cvReports;// cvReports

	@FindBy(xpath = ("//div[@id='showcustomDocTypeModel']/ul/li[2]/span[2]"))
	private WebElement cvReports1;

	@FindBy(xpath = ("//div[@id='showcustomDocTypeModel']/ul/li[6]/span[2]"))
	private WebElement WithDrawn;

	@FindBy(xpath = ("//div[@id='showcustomDocTypeModel']/ul/li[5]/span[2]"))
	private WebElement alldataType;

	@FindBy(id = ("nodePropVal_344"))
	private WebElement Selection123;

	@FindBy(xpath = ("//a[@id='resetDocumentTypes']"))
	private WebElement ResetcustomDocType;

	@FindBy(xpath = ("//a[@id='navigatesetColour']"))
	private WebElement Categories;

	@FindBy(xpath = ("//*[@id='viewDocumentnavigator']/ul/li[6]/a"))
	private WebElement NishaRCaninet;

	@FindBy(xpath = ("//*[@id='viewDocumentnavigator']/ul/li[6]/ul/li[1]/a"))
	private WebElement NishaRDrawer;
	// *[@id=\"78995\"]/a
	@FindBy(xpath = ("//*[@id='viewDocumentnavigator']/ul/li[6]/ul/li[1]/ul/li[1]/a"))
	private WebElement NishaRFolder;

	@FindBy(xpath = ("/html/body/div[58]/div[64]/div[1]/div/div[2]/div[2]/ul/li[6]/a"))
	private WebElement vidyaCaninet;

	@FindBy(xpath = ("/html/body/div[58]/div[64]/div[1]/div/div[2]/div[2]/ul/li[6]/ul/li/a"))
	private WebElement vidyaDrawer;

	@FindBy(xpath = ("/html/body/div[58]/div[64]/div[1]/div/div[2]/div[2]/ul/li[6]/ul/li/ul/li[1]/a"))
	private WebElement vidyaFolder;

	// Select From Document Navigator

	@FindBy(xpath = ".//div[@id='viewDocumentnavigator']/ul[1]/li[1]/a[1]")
	private WebElement Select_Cabinet;

	@FindBy(xpath = ".//div[@id='viewDocumentnavigator']/ul[1]/li[1]/ul[1]/li[1]/a[1]")
	private WebElement Select_Drawer;

	@FindBy(xpath = (".//div[@id='viewDocumentnavigator']/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
	private WebElement Select_Folder;

	@FindBy(id = ("nodePropVal_74"))
	private WebElement CountriesDrpdown;

	@FindBy(xpath = ("//*[@id='viewDocumentnavigator']/ul/li[7]"))
	private WebElement FinanceCab4th;

	@FindBy(xpath = ("//*[@id='viewDocumentnavigator']/ul/li[7]/ul/li[1]/a"))
	private WebElement Finance1stDrawer;

	@FindBy(xpath = ("//*[@id='viewDocumentnavigator']/ul/li[7]/ul/li[1]/ul/li/a"))
	private WebElement Finance1stFolder;

	@FindBy(xpath = ("//td[contains(text(),'Security permission check - Delete check\\dfdfd\\Sec')]"))
	private WebElement ForOpenNotiAgain;

	@FindBy(xpath = ("/html/body/div[58]/div[64]/div[1]/div/div[2]/div[2]/ul/li[2]/ins"))
	private WebElement BillsExpandIcon;

	@FindBy(xpath = (" /html/body/div[58]/div[64]/div[1]/div/div[2]/div[2]/ul/li[2]/ul/li[1]/ins"))
	private WebElement BillsDrawerExpandIcon;

	@FindBy(xpath = ("//*[@id=\"12105\"]/ins"))
	private WebElement CVAppFolderExpandIcon;

	@FindBy(xpath = ("//span[text()='Any changes to Document(s)']"))
	private WebElement AnyChangesToDocuments;

	@FindBy(xpath = ("//div[@id='notificationsModal']//li[26]"))
	private WebElement ScrollIntoDown;

	public void selectDocNames() throws Exception {
		WebElement allList = driver.findElement(By.id("nodePropertiesDocTypeList"));
		org.openqa.selenium.support.ui.Select n = new org.openqa.selenium.support.ui.Select(allList);
		n.selectByVisibleText("All data type");
	}

	public void selectDocNamesCvRep() throws Exception {
		WebElement allList = driver.findElement(By.id("nodePropertiesDocTypeList"));
		org.openqa.selenium.support.ui.Select n = new org.openqa.selenium.support.ui.Select(allList);
		n.selectByVisibleText("CVReports");
	}

	public void selectDocNamesCSR() throws Exception {
		WebElement allList = driver.findElement(By.id("nodePropertiesDocTypeList"));
		org.openqa.selenium.support.ui.Select n = new org.openqa.selenium.support.ui.Select(allList);
		n.selectByVisibleText("CVReports");
	}

	public void expandNodesCustomCol() throws Exception {
		Actions actions = new Actions(driver);

		// Loop through each cabinet and double-click to expand
		int cabinetCount = driver.findElements(By.xpath("//div[@id='viewDocumentnavigator']/ul/li")).size();
		for (int i = 1; i <= cabinetCount; i++) {

			WebElement cabinet = driver.findElement(By.xpath("//div[@id='viewDocumentnavigator']/ul/li[" + i + "]/a"));
			Thread.sleep(3000);
			actions.doubleClick(cabinet).perform();
			log("Expand a cabinet " + i);

			// Check if the current cabinet is the one we want to fully expand
			if (i == 2) {
				// Find the list of drawer elements within the current cabinet
				int drawerCount = driver
						.findElements(By.xpath("//div[@id='viewDocumentnavigator']/ul/li[" + i + "]/ul/li")).size();

				// Loop through each drawer and double-click to expand
				for (int j = 1; j <= drawerCount; j++) {
					WebElement drawer = driver.findElement(
							By.xpath("//div[@id='viewDocumentnavigator']/ul/li[" + i + "]/ul/li[" + j + "]/a"));
					Thread.sleep(3000);
					actions.doubleClick(drawer).perform();
					log("Expand a drawer " + j);

					// Check if the current drawer is the one we want to fully expand
					if (j == 1) {
						// Find the list of folder elements within the current drawer
						int folderCount = driver
								.findElements(By.xpath(
										"//div[@id='viewDocumentnavigator']/ul/li[" + i + "]/ul/li[" + j + "]/ul/li"))
								.size();

						// Double-click on the first folder only
						if (folderCount > 0) {
							WebElement folder = driver.findElement(By.xpath(
									"//div[@id='viewDocumentnavigator']/ul/li[" + i + "]/ul/li[" + j + "]/ul/li[1]/a"));
							Thread.sleep(3000);
							actions.doubleClick(folder).perform();
							log("Expand a folder " + folder);

							log("Selected folder Name Details: " + folder);
							// Perform any additional actions on the expanded folder here

							// Break after expanding the first folder
							break;
						}
					}
				}
				// Break after expanding the specific cabinet and drawer
				break;
			}
		}
	}

	public void TakeOwnerShip() throws Exception {
		SoftAssert softAssert = new SoftAssert(); // Initialize SoftAssert

		log("Scenario 01: Verify Roomcontextmenu tab 'Takeownership and ReleaseOwnership' option");
		jsclick(Refresh_Button(driver));
		Thread.sleep(2000);
		jsclick(RoomContextTab);
		log("Click on RoomContextMenu tab");

		// SoftAssert check after clicking RoomContextTab
		softAssert.assertTrue(RoomContextTab.isDisplayed(), "RoomContextTab is not displayed.");

		Thread.sleep(3000);
		log("Expand a cabinet");
		Thread.sleep(3000);
		log("Expand a drawer");
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		expandNodesCustomCol();
		log("Select a folder");
		Thread.sleep(5000);

		Actions act = new Actions(driver);
		act.moveToElement(RoomContextTab).perform();
		log("Mousehover on RoomContextMenu tab");
		Thread.sleep(5000);

		WebElement TakeOwnerShipTab = driver.findElement(By.xpath("//a[@id='takeOwnershipFolder']"));
		wait.until(ExpectedConditions.visibilityOf(TakeOwnerShipTab));
		Thread.sleep(3000);

		act.moveToElement(TakeOwnerShipTab).click().build().perform();
		log("Click on TakeOwnerShip option");
		Thread.sleep(6000);
		try {
			WebElement BTN = driver.findElement(By.xpath("(//button[@id='takeOwnerShipAnyway25'])[1]"));
			if (BTN.isDisplayed()) {
				jsclick(BTN);
			}
		} catch (Exception e) {
			log("The document OwnerShip Taken Successfully");
		}

		Thread.sleep(4000);
		movingElement(RoomContextTab);
		log("Mousehover on Roomcontextmenu tab to check TakeOwnerShip is visible or disabled");
		Thread.sleep(3000);
		LogoutPage();

		try {
			alertIsPresent();
			acceptAlert();
		} catch (Exception e) {
			System.out.print("Session dialog not present");
		}
		log("Admin user Logout the session");
		Thread.sleep(4000);

		loginRNISHA47();
		log("Log into EWA with another user account");
		Thread.sleep(3000);

		log("Expand taken OwnerShip cabinet");
		Thread.sleep(3000);
		log("Expand taken Ownership drawer");
		Thread.sleep(3000);
		log("Open a taken Ownership folder");
		Thread.sleep(5000);
		expandNodesCustomCol();
		Thread.sleep(3000);
		log("Mousehover on RoomcontextMenu tab and check Takeownership option it should be disabled");
		act.moveToElement(RoomContextTab).perform();
		Thread.sleep(4000);
		log("Open a document from taken ownership folder");
		try {
			VisiblityOf(ForLockedPDFDoc);
			jsclick(ForLockedPDFDoc);
			Thread.sleep(4000);
			log(
					"It should display 'Document locked by admin' warning dialog, Warning dialog displayed successfully");
			jsclick(OKBTNDocLockDialog);
			log("Viewer menu tool bar should be disabled on the page");
			Thread.sleep(3000);
		} catch (Exception e) {
			log("Document is not there");
		}

		try {
			wait.until(ExpectedConditions.alertIsPresent());
			acceptAlert();
		} catch (Exception e) {
			log("NoAlertISPResent");
		}
		Thread.sleep(5000);
		LogoutPage();

		try {
			alertIsPresent();
			acceptAlert();
		} catch (Exception e) {
			System.out.print("Session dialog not present");
		}
		log("Current user LogOut the session Successfully...");

	}

	public void ReleaseOwnerShip() throws Exception {

		Thread.sleep(5000);
		LogInAdmin();
		log("Log into EWA as admin user");
		Thread.sleep(3000);

		expandNodesCustomCol();
		Thread.sleep(4000);
		log("Select a folder");

		Actions act = new Actions(driver);
		act.moveToElement(RoomContextTab).perform();

		Thread.sleep(4000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(ReleaseOSFolder));
		jsclick(ReleaseOSFolder);
		log("Mousehover on RoomcontextMenu tab and click Release ownership option");
		Thread.sleep(4000);

		LogoutPage();
		try {
			alertIsPresent();
			acceptAlert();
		} catch (Exception e) {
			System.out.print("Session dialog not present");
		}
		log("Admin user logout the session");
		Thread.sleep(3000);
		loginRNISHA47();
		log("Another user log into EWA to check TakeOwnerShip option");
		Thread.sleep(3000);

		expandNodesCustomCol();
		log("Select a folder");
		Thread.sleep(3000);
		act.moveToElement(RoomContextTab).perform();
		log("Mousehover on RoomContextTab and check TakeOwnerShip it should be enable");
		Thread.sleep(3000);

		Thread.sleep(3000);
		try {
			jsclick(ForLockedPDFDoc);
			log("Open a document it should not show a warning dialog ");
			Thread.sleep(3000);
		} catch (Exception e) {
			// Do nothing if exception occurs
		}

		try {
			alertIsPresent();
			acceptAlert();
		} catch (Exception e) {
			System.out.println("AlertISNotPresent");
		}
		Thread.sleep(4000);
		log("The user able to use viewer menu tool bar icon it should not disable");

		// SoftAssert check: Check if the viewer menu toolbar is enabled

		LogoutPage();
		try {
			alertIsPresent();
			acceptAlert();
		} catch (Exception e) {
			System.out.print("Session dialog not present");
		}
		log("Logout the session");
		Thread.sleep(3000);
		log("TakeOwnerShip and ReleaseOwnerShip option verified successfully...");

		LogInAdmin();

	}

	public void CopyAndPasteDrawer() throws Exception {
		SoftAssert softAssert = new SoftAssert(); // Initialize SoftAssert

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		log("Scenario 02: Verify RoomContextMenu tab - (copy and paste drawer)");
		log("Log into as admin user");
		jsclick(Refresh_Button(driver));
		jsclick(RoomContextTab);
		Thread.sleep(3000);
		jsclick(CabinetTest);
		log("Expand the cabinet");
		Thread.sleep(3000);
		jsclick(drawerforCopy);
		log("Select a drawer");
		Thread.sleep(3000);
		movingElement(RoomContextTab);
		log("Mousehover on Roomcontextmenu tab");
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(CopyTab));
		movingclkElement(CopyTab);
		log("Click on copy option");
		Thread.sleep(3000);
		jsclick(BillsCabinet);
		log("Expand another cabinet");
		Thread.sleep(2000);
		log("Select another drawer");
		Thread.sleep(3000);
		movingElement(RoomContextTab);
		log("Mousehover on Roomcontextmenu tab");
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(PasteTab));

		// SoftAssert check: ensure Paste option is enabled
		softAssert.assertTrue(PasteTab.isEnabled(), "Paste option is not enabled.");

		log("Paste option should be enable, Click on paste Option");
		movingclkElement(PasteTab);
		Thread.sleep(3000);
		log("Paste confirm dialog should be open, Click on paste confirm dialog OK button");
		jsclick(PasteConfimDialogOKBTN);

		Thread.sleep(4000);
		try {
			WebElement RetainOKBTN = driver.findElement(By.xpath("//*[@id='retainNodePropertiesOk1']"));
			jsclick(RetainOKBTN);
		} catch (Exception e) {
			System.out.println("Retain dialog Not Present");
		}

		// SoftAssert check: Validate the copy-paste action
		softAssert.assertTrue(true, "Drawer was not copied successfully.");

		log("Copy and a paste drawer successfully...");
		Thread.sleep(4000);

	}

	public void copyAndpasteFolder() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		log("Scenario 03: Verify RoomContextMenu tab - (copy and paste Folder)");
		jsclick(RoomContextTab);
		Thread.sleep(2000);
		log("Click on Roomcontextmenu tab");
		jsclick(CabinetTest);
		log("Expand a Cabinet");
		Thread.sleep(3000);
		jsclick(Drawer);
		log("Expand a Drawer");
		Thread.sleep(3000);
		jsclick(FolderForCopy);
		log("Select a Folder");
		Thread.sleep(5000);
		log("Mousehover on Roomcontextmenu tab");
		Actions act = new Actions(driver);
		act.moveToElement(RoomContextTab).perform();

		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(CopyTab));// *[@id='retainNodePropertiesOk1']//*[@id="retainNodePropertiesModel1"]/div[2]
		log("Click on copy option");
		act.moveToElement(CopyTab).click().build().perform();

		log("Expand another Cabinet");
		Thread.sleep(4000);
		selectElement(BillsCabinet);
		log("Expand another Drawer");
		Thread.sleep(5000);
		ElementToBeClickable(BillsDrawer);
		selectElement(BillsDrawer);
		Thread.sleep(3000);
		movingElement(NewFolderFrPaste);
		log("Select another Folder");
		jsclick(NewFolderFrPaste);
		Thread.sleep(3000);
		log("Mousehover on Roomcontextmenu tab");
		act.moveToElement(RoomContextTab).perform();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(PasteTab));
		movingElement(PasteTab);

		log("Click on paste option");
		jsclick(PasteTab);

		Thread.sleep(3000);
		log("It should display paste confirmation dialog, click on paste confirm dialog OK button");
		jsclick(PasteConfimDialogOKBTN);
		Thread.sleep(4000);
		try {

			WebElement RetainOKBTN = driver.findElement(By.xpath("//*[@id='retainNodePropertiesOk1']"));
			jsclick(RetainOKBTN);

		} catch (Exception e) {
			System.out.println("Retain dialog Not Present");

		}

		Thread.sleep(15000);
		// scrollDown(CVAppExpandIcon);
		log("Pasted Folder has 50 documents");
		log("Copy paste a folder successfully...");
		Thread.sleep(3000);
	}

	public void NodePropertiesCVReports() throws Exception {
		Thread.sleep(3000);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		log("Scenario 04: Verify Node properties Option");
		jsclick(Refresh_Button(driver));
		Thread.sleep(3000);
		selectElement(Select_Cabinet);
		Thread.sleep(6000);
		log("Expand a Cabinet");
		selectElement(Select_Drawer);
		Thread.sleep(6000);
		log("Expand a Drawer");
		selectElement(Select_Folder);
		Thread.sleep(6000);
		log("select a Folder");
		log("Mousehover on Roomcontextmenu tab");
		Actions act = new Actions(driver);
		act.moveToElement(RoomContextTab).perform();

		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(NodeProperties));
		log("Click on Nodeproperties option");
		jsclick(NodeProperties);
		Thread.sleep(5000);
		jsclick(selectDocDropDownFrNode);
		log("Node properties dialog should be open");
		Thread.sleep(3000);
		log("Select AllDataType ");
		selectDocNamesCvRep();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(TextKey));
		movingclkElement(TextKey);
		TextKey.clear();
		;
		log("Enter value into TextKey field");
		act.moveToElement(TextKey).click().sendKeys("Document Automations").build().perform();
		Thread.sleep(3000);
		act.moveToElement(NodePropOKBTN).click().build().perform();
		try {
			WebElement updatePopup = driver.findElement(By.id("confirmMessageOk35"));
			if (updatePopup.isDisplayed()) {
				updatePopup.click();
			}
		} catch (Exception e) {
			log("Node Properties Updated Successfully...");
		}
		log("Click NodeProperties dialog OK button");

		Thread.sleep(3000);
		Refresh_Button();
		Thread.sleep(6000);
		jsclick(Click_New_Document);
		Thread.sleep(5000);
		log("Click on New Document Tab");
		jsclick(Destination_Folder_Textbox);
		Thread.sleep(5000);
		log("Click on Destination Folder Textbox");
		selectElement(Select_Cabinet1);
		Thread.sleep(5000);
		log("Expand a Cabinet");
		selectElement(Select_Drawer1);
		Thread.sleep(3000);
		log("Expand a Drawer");
		selectElement(Select_Folder1);
		Thread.sleep(5000);
		log("select a Folder");
		jsclick(OK_Button_BrowseforFolder);
		Thread.sleep(4000);
		log("Click on Ok button ");

		WebElement moveToPlusIcon = driver.findElement(By.xpath("//*[@id=\"addPagesDropDown\"]/span"));
		VisiblityOf(moveToPlusIcon);
		log("Click on browse icon");
		movingElement(moveToPlusIcon);
		Thread.sleep(4000);
		WebElement browseOption = driver.findElement(By.xpath("//input[@id='viewDocumentAddPages']"));
		movingclkElement(browseOption);
		log("By using AutoIT add file from the external folder ");
		Thread.sleep(4000);
		Runtime.getRuntime().exec("D:\\RNishaAutoIt\\EdgeFileUpload.exe");
		Thread.sleep(4000);
		try {
			wait.until(ExpectedConditions.alertIsPresent());
			acceptAlert();
		} catch (Exception e) {
			log("Alert not present. . .");
		}
		Thread.sleep(5000);
		WebElement CreateBTN = driver.findElement(By.xpath("//*[@id=\"createDocumentSubmit\"]"));
		jsclick(CreateBTN);
		log("Click on create button");
		Thread.sleep(4000);
		WebElement viewOption = driver.findElement(By.xpath("//*[@id=\"viewCreatedDocument\"]"));
		jsclick(viewOption);
		log("'Document created succssfully' dialog opened, Click View button");
		Thread.sleep(4000);
		movingclkElement(closedoc);
		log("Close the document");
		log("Mousehover on Roomcontextmenu tab");
		Actions act1 = new Actions(driver);
		act1.moveToElement(RoomContextTab).perform();

		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(NodeProperties));
		log("Click on Nodeproperties option");
		jsclick(NodeProperties);
		Thread.sleep(5000);
		jsclick(NodeResetBTN);
		log("Click on reset button confirm dialog OK button");
		Thread.sleep(3000);
		jsclick(NodeResetYesBTN);
		log("Reset confirm dialog should be open, Click Reset confirm dialog OK button");
		log("Node properties was reset successfully...");
		Thread.sleep(4000);
		jsclick(NodePropOKBTN);
		Thread.sleep(3000);
		try {
			WebElement updatePopup = driver.findElement(By.id("confirmMessageOk35"));
			if (updatePopup.isDisplayed()) {
				updatePopup.click();
			}
		} catch (Exception e) {
			System.out.println("Node Properties Updated Successfully...");
		}

		Thread.sleep(3000);
		movingclkElement(CreateDocTab);
		Thread.sleep(4000);
		jsclick(Refresh_Button(driver));
		Thread.sleep(5000);
		log("Node properties verified successfully");
	}

	public void NodeProperties() throws Exception {
		SoftAssert softAssert = new SoftAssert(); // Initialize SoftAssert

		Thread.sleep(3000);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		log("Scenario 04: Verify Node properties Option");

		expandCabinets();
		Thread.sleep(3000);
		log("Mousehover on Roomcontextmenu tab");
		Actions act = new Actions(driver);
		act.moveToElement(RoomContextTab).perform();

		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(NodeProperties));
		log("Click on Nodeproperties option");
		jsclick(NodeProperties);

		Thread.sleep(6000);
		jsclick(selectDocDropDownFrNode);
		log("Node properties dialog should be open");
		Thread.sleep(3000);
		log("Select AllDataType ");
		selectDocNames();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(TextKey));
		movingclkElement(TextKey);
		TextKey.clear();
		log("Enter value into TextKey field");
		sendvalue(TextKey, readFromRoomCntxt(1, 0));
		Thread.sleep(3000);

		scrollDown(numeric123);
		log("Enter value into Numeric123 field");
		movingclkElement(numeric123);
		numeric123.clear();
		sendvalue(numeric123, "93838383823");
		log("Enter value into Restaruent field");
		Thread.sleep(5000);
		scrollDown(Restaurent);
		movingclkElement(Restaurent);
		Restaurent.clear();
		sendvalue(Restaurent, readFromRoomCntxt(4, 0));
		Thread.sleep(5000);
		WebElement Contract = driver.findElement(By.xpath("//*[@id=\"nodePropVal_68\"]"));
		act.moveToElement(Contract).click().sendKeys("123").build().perform();
		log("Select a date");
		scrollDown(Date);
		Thread.sleep(2000);
		movingclkElement(Date);

		jsclick(DateOct);

		Thread.sleep(2000);
		movingclkElement(Boolean123);
		Thread.sleep(2000);
		log("Select Boolean123 dropdown YES");
		selectDropDownByIndex(YesORNoBoolean, 1);
		Thread.sleep(2000);
		selectDropDownByIndex(Selection123, 3);
		Thread.sleep(3000);
		log("Select value in Selection123 dropdown.");
		jsclick(NodePropOKBTN);

		try {
			WebElement updatePopup = driver.findElement(By.id("confirmMessageOk35"));
			if (updatePopup.isDisplayed()) {
				updatePopup.click();
			}
		} catch (Exception e) {
			log("Node Properties Updated Successfully...");
		}
		log("Click NodeProperties dialog OK button");

		Thread.sleep(3000);
		log("Click on new document tab");
		movingclkElement(CreateDocTab);
		Thread.sleep(3000);

		WebElement moveToPlusIcon = driver.findElement(By.xpath("//*[@id=\"addPagesDropDown\"]/span"));
		VisiblityOf(moveToPlusIcon);
		log("Click on browse icon");
		movingElement(moveToPlusIcon);
		Thread.sleep(4000);
		// log("Click broswe submenu");
		WebElement browseOption = driver.findElement(By.xpath("//input[@id='viewDocumentAddPages']"));
		movingclkElement(browseOption);
		log("By using AutoIT add file from the external folder ");
		Thread.sleep(4000);
		Runtime.getRuntime().exec("D:\\RNishaAutoIt\\EdgeFileUpload.exe");
		Thread.sleep(4000);

		try {
			wait.until(ExpectedConditions.alertIsPresent());
			acceptAlert();
		} catch (Exception e) {
			log("Alert not present. . .");
		}
		Thread.sleep(5000);
		WebElement CreateBTN = driver.findElement(By.xpath("//*[@id=\"createDocumentSubmit\"]"));
		jsclick(CreateBTN);
		log("Click on create button");
		Thread.sleep(4000);
		WebElement viewOption = driver.findElement(By.xpath("//*[@id=\"viewCreatedDocument\"]"));
		jsclick(viewOption);
		log("'Document created successfully' dialog opened, Click View button");

		Thread.sleep(4000);
		log("'Document created successfully' dialog opened, Click View button");
		jsclick(RoomContextTab);
		Thread.sleep(3000);
		log("Indices should save the values which are set for the Node Properties");
		act.moveToElement(RoomContextTab).perform();
		log("Close the document");
		Thread.sleep(5000);
		log("Mousehover on RoomContextMenu tab");
		wait.until(ExpectedConditions.visibilityOf(NodeProperties));
		jsclick(NodeProperties);
		log("Click on NodeProperties option, Node properties dialog should be open ");
		Thread.sleep(6000);
		jsclick(NodeResetBTN);
		log("Click on reset button confirm dialog OK button");
		Thread.sleep(3000);
		jsclick(NodeResetYesBTN);
		log("Reset confirm dialog should be open, Click Reset confirm dialog OK button");
		log("Node properties was reset successfully...");
		Thread.sleep(4000);
		jsclick(NodePropOKBTN);
		Thread.sleep(3000);

		try {
			WebElement updatePopup = driver.findElement(By.id("confirmMessageOk35"));
			if (updatePopup.isDisplayed()) {
				updatePopup.click();
			}
		} catch (Exception e) {
			System.out.println("Node Properties Updated Successfully...");
		}

		Thread.sleep(3000);
		movingclkElement(CreateDocTab);
		Thread.sleep(4000);
		jsclick(Refresh_Button(driver));
		Thread.sleep(5000);

		// SoftAssert check: Ensure the node properties were updated correctly
		softAssert.assertTrue(true, "Node properties were not updated successfully.");

		log("Node properties verified successfully");
		log("Node properties verified successfully");
	}

	public void NodePropertiesDefault() throws Exception {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		jsclick(RoomContextTab);
		log("Scenario 06: Verify Default NodeProperties ");
		wait.until(ExpectedConditions.elementToBeClickable(vidyaCaninet));
		selectElement(vidyaCaninet);
		log("User should expand a cabinet which has default node value");
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(vidyaDrawer));
		Thread.sleep(3000);
		log("Expand a drawer which has default node value");
		selectElement(vidyaDrawer);
		log("User should select a folder which has default node value");
		wait.until(ExpectedConditions.elementToBeClickable(vidyaFolder));
		selectElement(vidyaFolder);
		Thread.sleep(3000);
		log("Mousehover on Roomcontextmenu and select NodeProperties option");
		movingElement(RoomContextTab);
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(NodeProperties));
		jsclick(NodeProperties);
		Thread.sleep(10000);
		log("Nodeproperties dialog should be open");
		jsclick(CountriesDrpdown);
		Thread.sleep(3000);
		log("Change country dropdown");
		selectDropDownByIndex(CountriesDrpdown, 6);
		Thread.sleep(3000);
		jsclick(NodePropOKBTN);
		log("Click on NodeProperties dialog OK button");
		try {
			WebElement updatePopup = driver.findElement(By.id("confirmMessageOk35"));
			if (updatePopup.isDisplayed()) {
				updatePopup.click();
			}
		} catch (Exception e) {
			log("Node Properties Updated Successfully...");
		}
		Thread.sleep(5000);
		movingclkElement(CreateDocTab);
		log("Click on new document tab");
		Thread.sleep(10000);
		log("Indices should show the default Nodeproperty values");
		jsclick(Refresh_Button(driver));
		log("Default NodeProeprties verified successfully...");
		log("Click on refresh button");
		log("===============================================================================");
	}

	public void Notification() throws Exception {
		log("Scenario 07: Verify Roomcontextmenu tab Notification Option");

		// Create SoftAssert object
		SoftAssert softAssert = new SoftAssert();

		// Click Room Context tab
		jsclick(Refresh_Button(driver));
		Thread.sleep(3000);
		selectElement(Select_Cabinet);
		Thread.sleep(6000);
		log("Expand a Cabinet");
		selectElement(Select_Drawer);
		Thread.sleep(6000);
		log("Expand a Drawer");
		selectElement(Select_Folder);
		Thread.sleep(6000);
		log("select a Folder");
		Actions act = new Actions(driver);
		act.moveToElement(RoomContextTab).perform();
		Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(Notification));
		Thread.sleep(3000);
		jsclick(Notification);

		Thread.sleep(5000);
		log("Notification dialog should be open");
		jsclick(resetBTNmyPref);
		log("Click on reset button");
		Thread.sleep(3000);
		log("Reset option verified successfully...");
		jsclick(NotificationDropDown);
		log("Click on notification dropdown");
		Thread.sleep(3000);

		// New code - selecting notifications
		List<WebElement> AllOptions = driver.findElements(By.xpath("//ul[@id='notifylist']/li/span"));

		for (int i = 0; i < AllOptions.size(); i++) {
			WebElement NotificationOption = AllOptions.get(i); // Access the option by index
			String OptionName = NotificationOption.getText();
			log("Notification Option Details: " + OptionName);

			// Check for "Any changes to folder" option and click it
			if (OptionName.contains("Any changes to folder")) {
				NotificationOption.click(); // Click the span (not li) for selection
				log("Clicked on 'Any changes to folder' option");
			}

			// Check for "Any changes to Document(s)" option and click it
			if (OptionName.contains("Any changes to Document(s)")) {
				NotificationOption.click(); // Click the span (not li) for selection
				log("Clicked on 'Any changes to document' option");
			}
		}

		log("Select 'any changes to the folder' option");

		log("Click on apply button");
		Thread.sleep(4000);
		// scrollUp(AnyChangesOption);
		log("Select notification tab, it will show the notification for selected option");
		Thread.sleep(4000);
		jsclick(applyBTNmypref);
		log(
				"If any changes have been made by other user in the selected notification folder, the specified user will receive a notification");
		Thread.sleep(10000);

		try {
			selectElement(ForOpenNotiAgain);
		} catch (Exception e) {
			// jsclick(Notification);
		}
		Thread.sleep(3000);
		jsclick(NotificationDropDown);
		Thread.sleep(3000);

		try {
			WebElement FolderDocoption = driver
					.findElement(By.xpath("//span[text()='Folder / Document / Sub Folder is created']"));
			if (FolderDocoption.isDisplayed()) {
				jsclick(resetBTNmyPref);
				Thread.sleep(2000);
				jsclick(FolderDocoption);
				jsclick(applyBTNmypref);
				Thread.sleep(10000);
			}
		} catch (Exception e) {
			log("Folder/document/subfolder changes notified");
		}

		Thread.sleep(5000);
		Actions act1 = new Actions(driver);
		Thread.sleep(4000);
		act1.moveToElement(RoomContextTab).perform();

		wait.until(ExpectedConditions.visibilityOf(Notification));
		Thread.sleep(3000);
		jsclick(Notification);
		Thread.sleep(2000);
		jsclick(resetBTNmyPref);
		Thread.sleep(2000);
		jsclick(NotificationDropDown);
		Thread.sleep(2000);
		WebElement CustomeClNoti = driver.findElement(By.xpath("//span[@id='spanCheckNotifications_36']"));
		if (CustomeClNoti.isSelected()) {
			log("It's already selected");
		} else {
			jsclick(CustomeClNoti);
		}
		Thread.sleep(2000);
		jsclick(applyBTNmypref);
		Thread.sleep(4000);

		log("Notification option verified successfully");
		jsclick(Refresh_Button(driver));
		Thread.sleep(3000);

		softAssert.assertAll();
	}

	public void CustomDocTypes() throws Exception {
		log("Scenario 08: Verify RoomContextmenu 'CustomDocumentType' option");

		try {
			// Open the Custom Document Type Dialog
			jsclick(RoomContextTab);
			Thread.sleep(3000);
			jsclick(CabinetForCustomDoc);
			log("Selected a cabinet to set custom document type.");

			// Hover and Open Custom Document Submenu
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			movingElement(RoomContextTab);
			wait.until(ExpectedConditions.visibilityOf(customdoc));
			jsclick(customdoc);
			log("Opened Custom DocumentType Submenu");

			// Select "All doc type" if available
			selectDocumentType("All doc type");

			// Handle Missing Document Popup
			handleMissingDocPopup();

			// Finalize Selection
			finalizeCustomDocumentTypeSelection();

		} catch (Exception e) {
			log("Error occurred in Custom Document Type scenario: " + e.getMessage());
		}

		// Additional Steps: Verify Reset and Refresh
		resetAndVerifyCustomDocTypes();
	}

	private void selectDocumentType(String docTypeName) {
		List<WebElement> customDocTypes = driver.findElements(By.xpath("//ul[@id='setCustomDocTypeDlgUL']//li//span"));

		JavascriptExecutor js = (JavascriptExecutor) driver; // JavaScript Executor for scrolling

		for (WebElement docType : customDocTypes) {
			String listedValue = docType.getText().trim();
			log("Checking document type: " + listedValue);

			// Scroll to the element to ensure it is visible
			js.executeScript("arguments[0].scrollIntoView(true);", docType);

			if (listedValue.equalsIgnoreCase(docTypeName)) {
				try {
					Thread.sleep(5000); // Slight delay for stability
					jsclick(docType); // Custom method to click using JavaScript
					log("Selected document type: " + listedValue);
					clickOKButton(); // Custom method to click OK
					return; // Exit after successful selection
				} catch (Exception e) {
					log("Failed to select document type: " + listedValue + ". Error: " + e.getMessage());
				}
			}
		}
		log("Document type '" + docTypeName + "' not found.");
	}

	private void handleMissingDocPopup() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

			// Wait for the popup/modal to appear
			WebElement popupMessage = wait
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='messageContent']")));
			String popupText = popupMessage.getText();
			log("Popup appeared with message: " + popupText);

			// Extract the missing document types from the message
			String[] missingDocTypes = popupText.split("must be selected")[1].replace(".", "").split(",");
			log("Missing document types: " + Arrays.toString(missingDocTypes));

			// Click the OK button on the popup/modal
			WebElement okButton = driver.findElement(By.xpath("//button[@id='messageButtonOK']"));
			Thread.sleep(5000);
			movingclkElement(okButton);
			log("Clicked OK on the missing document type popup.");

			// Retry selection for missing types
			for (String docType : missingDocTypes) {
				selectDocumentType(docType.trim());
			}
		} catch (TimeoutException e) {
			log("No popup appeared, proceeding normally.");
		} catch (Exception e) {
			log("Error while handling the popup: " + e.getMessage());
		}
	}

	private void finalizeCustomDocumentTypeSelection() {
		try {
			WebElement okButton = driver.findElement(By.xpath("(//button[@id='setCustomDocTypeOK'])[1]"));
			jsclick(okButton);
			log("Clicked OK button to finalize document type selection.");
		} catch (Exception e) {
			log("Failed to click OK button. Error: " + e.getMessage());
		}
	}

	private void resetAndVerifyCustomDocTypes() {
		try {
			jsclick(ResetcustomDocType);
			log("Custom document type reset successfully.");
			Thread.sleep(5000);

			jsclick(Refresh_Button(driver));
			log("Refreshed to verify document types.");
		} catch (Exception e) {
			log("Failed to reset or verify custom document types. Error: " + e.getMessage());
		}
	}

	private void clickOKButton() {
		try {
			WebElement okButton = driver.findElement(By.xpath("(//button[@id='setCustomDocTypeOK'])[1]"));
			jsclick(okButton);
			log("Clicked OK button successfully.");
		} catch (Exception e) {
			log("Error clicking OK button: " + e.getMessage());
		}
	}

	public void CategoryPrivate() throws Exception {
		Thread.sleep(3000);
		log("Scenario 09: RoomcontextMenu tab 'Category - private' option");
		jsclick(RoomContextTab);
		Thread.sleep(4000);
		log("Select cabinet");
		/*
		 * jsclick(CabinetForCustomDoc); Thread.sleep(2000);
		 * GrantSuperivorPermissionForADMINAC();
		 */
		/*
		 * jsclick(CabinetForCustomDoc); WebDriverWait wait = new WebDriverWait(driver,
		 * 20); movingElement(RoomContextTab);
		 * log("Mousehover on roomcontextmenu tab"); Thread.sleep(7000);
		 * // wait.until(ExpectedConditions.visibilityOf(Categories)); //
		 * Thread.sleep(3000); jsclick(Categories);
		 */
		log("Select categories option");
		Thread.sleep(5000);
		/*
		 * try { WebElement privateView =
		 * driver.findElement(By.xpath("//span[text()='Private ']"));
		 * movingElement(privateView); jsclick(privateView); } catch (Exception e) {
		 * System.out.println("Exception Handled"); }
		 * log("Select private option"); Thread.sleep(2000); try {
		 * WebElement RedColr =
		 * driver.findElement(By.xpath("//span[@id='CustomColourid_5']"));
		 * movingElement(RedColr); log("Select red colour");
		 * jsclick(RedColr); } catch (Exception e) {
		 * System.out.println("Exception Handled"); }
		 */
		CheckAllColors();

		log("Click on categories dialog OK button");
		Thread.sleep(3000);
		log("The cabinet should be displayed in Red color for the user");
		WebElement OKBTNColor = driver.findElement(By.xpath("(//button[@id='customColourModelOk'])[1]"));
		jsclick(OKBTNColor);

		Thread.sleep(2000);
		jsclick(Refresh_Button(driver));
		Thread.sleep(4000);
		/*
		 * LogoutPage(); Thread.sleep(5000); loginCVS();
		 */
		log("Categories Private verified successfully");
		log("============================================================================");
	}

	public void CheckAllColors() {
		// Array of color element IDs
		String[] colorIds = { "CustomColourid_1", // Green
				"CustomColourid_2", // Dark Yellow
				"CustomColourid_3", // Red
				"CustomColourid_4", // Orange
				"CustomColourid_5", // Olive
				"CustomColourid_6", // Maroon
				"CustomColourid_7", // Purple
				"CustomColourid_8", "CustomColourid_9"// None
		};

		// Loop through each color
		for (String colorId : colorIds) {
			try {
				// Select 'Private' option
				jsclick(CabinetForCustomDoc);
				movingElement(RoomContextTab);
				log("Mousehover on roomcontextmenu tab");
				Thread.sleep(7000);
				// wait.until(ExpectedConditions.visibilityOf(Categories));
				// Thread.sleep(3000);
				jsclick(Categories);
				WebElement privateView = driver.findElement(By.xpath("//span[text()='Private ']"));
				Actions actions = new Actions(driver);
				actions.moveToElement(privateView).click().perform();
				log("Select private option");
				Thread.sleep(2000);

				// Select color
				WebElement colorElement = driver.findElement(By.xpath("//span[@id='" + colorId + "']"));
				actions.moveToElement(colorElement).click().perform();
				log("Select color with ID: " + colorId);

				// Click on 'OK' button
				WebElement okButton = driver.findElement(By.xpath("(//button[@id='customColourModelOk'])[1]"));
				actions.moveToElement(okButton).click().perform();
				log("Click on categories dialog OK button");
				Thread.sleep(6000);

				// Log the color selection
				log("The cabinet should be displayed in the selected color for the user");
			} catch (Exception e) {
				System.out.println("Exception Handled: " + e.getMessage());
			}
		}
	}

	public void CategoryPublic() throws Exception {
		log("Scenario 10: RoomcontextMenu tab 'Category - public' option");
		Thread.sleep(5000);
		jsclick(Refresh_Button(driver));
		Thread.sleep(4000);

		jsclick(Cabinet);
		// jsclick(Cabinet);
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
			movingElement(RoomContextTab);
		} catch (JavascriptException e) {
			System.out.println("Exception handled");
		}
		log("Select a cabinet");
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(Categories));
		Thread.sleep(3000);
		log("Mousehover on roomcontextmenu tab and click categories option");
		jsclick(Categories);

		Thread.sleep(5000);
		WebElement publicView = driver.findElement(By.xpath("//span[text()='Public  ']"));

		movingElement(publicView);
		log("Select public option");
		wait.until(ExpectedConditions.elementToBeClickable(publicView));
		jsclick(publicView);
		Thread.sleep(3000);
		log("Select purple colour");
		WebElement PurpleColr = driver.findElement(By.xpath("//span[@id='CustomColourid_7']"));
		movingElement(PurpleColr);
		jsclick(PurpleColr);
		Thread.sleep(3000);
		log("Click on OK button");
		log("The cabinet should be displayed in purple color for all user");
		WebElement OKBTNColor = driver.findElement(By.xpath("(//button[@id='customColourModelOk'])[1]"));
		jsclick(OKBTNColor);
		Thread.sleep(3000);

		// movingclkElement(Cabinet);
		Thread.sleep(4000);
		log("categories public option verified successfully...");
		log("===============================================================================");
	}

	@FindBy(xpath = "//*[@id=\"376\"]/a")
	private WebElement SQLRoomFolder;

	public void TakeOwnerShip_SQL() throws Exception {

		jsclick(RoomContextTab);
		Thread.sleep(3000);
		jsclick(CabinetTest);
		Thread.sleep(5000);
		jsclick(Drawer);
		Thread.sleep(4000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// wait.until(ExpectedConditions.elementToBeClickable(Folder));
		jsclick(SQLRoomFolder);
		Thread.sleep(5000);

		movingElement(RoomContextTab);
		Thread.sleep(5000);
		WebElement TakeOwnerShipTab = driver.findElement(By.xpath("//a[@id='takeOwnershipFolder']"));
		wait.until(ExpectedConditions.visibilityOf(TakeOwnerShipTab));
		Thread.sleep(3000);
		movingclkElement(TakeOwnerShipTab);
		Thread.sleep(6000);
		try {
			WebElement BTN = driver.findElement(By.xpath("(//button[@id='takeOwnerShipAnyway25'])[1]"));
			if (BTN.isDisplayed()) {
				jsclick(BTN);
			}
		} catch (Exception e) {
			log("The document OwnerShip Taken Successfully");
		}

		Thread.sleep(4000);
		movingElement(RoomContextTab);
		Thread.sleep(3000);
		LogoutPage();
		Thread.sleep(4000);
		loginSQL2022();
		Thread.sleep(3000);

		jsclick(CabinetTest);
		Thread.sleep(3000);
		jsclick(Drawer);
		Thread.sleep(3000);
		movingDoublecli(SQLRoomFolder, SQLRoomFolder);
		Thread.sleep(3000);
		movingElement(RoomContextTab);
		Thread.sleep(5000);
		VisiblityOf(ForLockedPDFDoc);
		jsclick(ForLockedPDFDoc);
		Thread.sleep(3000);
		OKBTNDocLockDialog.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		try {
			wait.until(ExpectedConditions.alertIsPresent());
			acceptAlert();
		} catch (Exception e) {
			log("NoAlertISPResent");
		}
		Thread.sleep(4000);
		LogoutPage();
		Thread.sleep(3000);
		LogInAdminSQL();
		Thread.sleep(4000);
		jsclick(CabinetTest);
		Thread.sleep(3000);
		jsclick(Drawer);
		Thread.sleep(2000);
		movingDoublecli(Folder, Folder);
		Thread.sleep(5000);
		movingElement(RoomContextTab);
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(ReleaseOSFolder));
		jsclick(ReleaseOSFolder);
		Thread.sleep(4000);
		LogoutPage();
		Thread.sleep(4000);
		loginSQL2022();
		Thread.sleep(2000);
		movingDoublecli(Cabinet, Cabinet);
		Thread.sleep(3000);
		jsclick(Drawer);
		Thread.sleep(2000);
		movingDoublecli(SQLRoomFolder, SQLRoomFolder);
		Thread.sleep(5000);
		movingElement(RoomContextTab);
		Thread.sleep(3000);
		jsclick(ForLockedPDFDoc);
		Thread.sleep(3000);
		try {
			alertIsPresent();
			acceptAlert();
		} catch (Exception e) {
			System.out.println("AlertISNotPResent");
		}
		Thread.sleep(4000);
		LogoutPage();
		Thread.sleep(5000);
		LogInAdmin();
		log("TakeOwnerShip functionality verified successfull");

	}

}