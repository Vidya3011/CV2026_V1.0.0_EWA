package Computhink.Pom;

//Dipak Automation Coa

//Dipak Automation script

import java.time.Duration;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
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

public class Security extends Computhink.Generic.BaseClass {

	
	public static WebElement element = null;

	public Security() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//li[normalize-space()='dipak']")  
	private WebElement SelectAddedUser_Serachbox;

	@FindBy(xpath = "//li[normalize-space()='cvadmins']") 
	private WebElement SelectAddedAdminGroup_Serachbox;
	
	@FindBy(xpath = "//li[normalize-space()='cvnamed']")
	private WebElement SelectAddedcvnamedGroup_Serachbox;

	@FindBy(xpath = "//a[normalize-space()='cvnamed']") 
	private WebElement Selectcvnamedgrp; 
	
	@FindBy(xpath = "//a[normalize-space()='dipak']") 
	private WebElement SelectcvnamedUser;

	@FindBy(xpath = "//*[@id=\"menu-content\"]/li[3]/a/span/img")
	private WebElement cvnamedDownarrow;

	@FindBy(xpath = "//*[@id=\"menu-content\"]/li[2]")
	private WebElement cvadminsDownarrow; 

	@FindBy(xpath = "//*[@id=\"security\"]")
	private WebElement Security_option;

	@FindBy(xpath = "//*[@id=\"pUserList\"]")
	private WebElement UserSearchbox;

	public void getSelect_Added_User() throws Exception {

		jsclick(UserSearchbox);
		UserSearchbox.sendKeys(Security_excelRead(1, 0));
		Thread.sleep(5000);
		jsclick(SelectAddedUser_Serachbox);
	}

	// Select From Document Navigator

	@FindBy(xpath = ".//div[@id='viewDocumentnavigator']/ul[1]/li[1]/a[1]")
	private WebElement Select_Cabinet;

	@FindBy(xpath = ".//div[@id='viewDocumentnavigator']/ul[1]/li[1]/ul[1]/li[1]/a[1]")
	private WebElement Select_Drawer;

	@FindBy(xpath = (".//div[@id='viewDocumentnavigator']/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
	private WebElement Select_Folder;

	@FindBy(xpath = ".//div[@id='viewDocumentnavigator']/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]")
	private WebElement Select_subFolder;

	// Select from Destination folder Location

	@FindBy(xpath = (".//div[@id='navigatorModel']/div[2]/div[1]/div[1]/ul[1]/li[1]/a[1]"))
	private WebElement Select_Cabinet1;

	@FindBy(xpath = (".//div[@id='navigatorModel']/div[2]/div[1]/div[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
	private WebElement Select_Drawer1;

	@FindBy(xpath = (".//div[@id='navigatorModel']/div[2]/div[1]/div[1]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
	private WebElement Select_Folder1;

	@FindBy(xpath = "//*[@id=\"securityAdd\"]")
	private WebElement Add_Button;

	@FindBy(xpath = "//*[@id=\"selectedUsersAndGroups\"]")
	private WebElement Ok_button_UserDialog;

	@FindBy(xpath = "//*[@id=\"messageButtonNo27\"]")
	private WebElement Nobutton;

	@FindBy(xpath = "//*[@id=\"applySecurity\"]")
	private WebElement Apply_button_SecurityDialog;

	@FindBy(xpath = "//*[@id=\"securityUpdate\"]")
	private WebElement Ok_button_SecurityDialog;

	@FindBy(xpath = "//button[@id='securityRemove']")
	private WebElement Remove_Button;

	@FindBy(xpath = "//button[@id='cancelSecurity']")
	private WebElement Cancel_Button_SecurityDialog;

	@FindBy(xpath = "//span[@id='navigatorModelClose36']")
	private WebElement Cross_Button_SecurityDialog;

	@FindBy(xpath = "//*[@id=\"resetSecurity\"]")
	private WebElement Reset_Button_SecurityDialog;

	@FindBy(xpath = "//*[@id=\"resetNo\"]")
	private WebElement No_Button_Securitypopup;

	@FindBy(xpath = "//*[@id=\"navigatorTreeOk\"]")
	private WebElement OK_Button_BrowseforFolder;

	@FindBy(xpath = "//*[@id=\"resetYes\"]")
	private WebElement Yes_Button_Securitypopup;

	@FindBy(xpath = "//*[@id=\"imgDelete\"]")
	private WebElement Delete_Permission;

	@FindBy(xpath = "//*[@id=\"docTypeList\"]")
	private WebElement Click_Document_Type_Dropdown;

	@FindBy(xpath = "//*[@id='docTypeIndicesTable']/tbody[1]/tr[1]/td[2]/input[1]")
	private WebElement Enter_ReportName;

	@FindBy(xpath = "//*[@id=\"addPagesDropDown\"]/span")
	private WebElement Move_To_PlusIcon;

	@FindBy(xpath = "//*[@id=\"viewDocumentAddPages\"]")
	private WebElement Browse_Option;

	@FindBy(xpath = "//*[@id=\"createDocumentSubmit\"]")
	private WebElement Create_button;

	@FindBy(xpath = "//*[@id=\"modelHome\"]")
	private WebElement Navigate_button;

	@FindBy(xpath = "//*[@id=\"imgShare\"]")
	private WebElement Share_Permission;

	@FindBy(xpath = "//*[@id=\"imgModify\"]")
	private WebElement Modify_Permission;

	@FindBy(xpath = "//*[@id=\"logoutElement\"]")
	private WebElement Username;

	@FindBy(xpath = "//*[@id=\"idSidenav\"]/ul/li[1]/a")
	private WebElement Logout;

	@FindBy(xpath = "//*[@id=\"docOwnerName\"]")
	private WebElement Docownername;

	@FindBy(xpath = "//*[@id=\"detailsBlock\"]/p[2]/span")
	private WebElement openviewonly;

	@FindBy(xpath = "//*[@id=\"ownershipMessageModelOk\"]")
	private WebElement ownershipmessageok;

	@FindBy(xpath = "//button[@id='ownershipMessageModelOk']")
	private WebElement View_WorkflowDoc;

	@FindBy(xpath = "//*[@id=\"navigationMenuBtn\"]")
	private WebElement MoveTo_Menu_RoomName;

	@FindBy(xpath = "//*[@id=\"imgAssign\"]")
	private WebElement DoubleClick_CrossBar;

	@FindBy(xpath = "//*[@id=\"documentListTable\"]/tbody/tr[1]/td[3]")
	private WebElement Open_Document_UnderFolder;

	@FindBy(xpath = "//input[@class='thumbnailOptionSelected']")
	private WebElement Select_Document;

	@FindBy(xpath = "//*[@id=\"createDocument\"]")
	private WebElement Click_New_Document;

	@FindBy(xpath = "//*[@id=\"createDocuemtnLocation\"]")
	private WebElement Destination_Folder_Textbox;

	@FindBy(xpath = "//*[@id=\"toolbarId\"]/div[6]")
	private WebElement Verify_Share_Document_Option_Disable;

	@FindBy(xpath = "//*[@id=\"cvDocumentClose\"]/span")
	private WebElement Close_Document;

	@FindBy(xpath = "//*[@id=\"documentListTable\"]/tbody/tr[1]/td[3]")
	private WebElement Open_subfolder_Document;

	@FindBy(xpath = "//*[@id=\"imgSettings\"]")
	private WebElement Setting_Icon;

	@FindBy(xpath = "//*[@id=\"myPreferencesSettingsNav\"]")
	private WebElement My_Preferencesetting;

	@FindBy(xpath = "//*[@id=\"myPreferencesSubmit\"]")
	private WebElement Apply_button;

	@FindBy(xpath = "//*[@id=\"defaultPdfDocViewListNo\"]")
	private WebElement Pdf_document_Defaultviewing;

	@FindBy(xpath = "//*[@id=\"defaultOfficeDocViewListNo\"]")
	private WebElement Select_Office_document_Defaultviewing;

	@FindBy(xpath = "//*[@id=\"existingEntryAlert\"]/p")
	private WebElement Groupaddvalidation;

	@FindBy(xpath = "//*[@id=\"closeGroupUserModal\"]")
	private WebElement Closebutton;

	@FindBy(xpath = "//*[@id=\"cancelSecurity\"]")
	private WebElement CancelSecuritydialog;

	@FindBy(xpath = "//*[@id=\"newEntry\"]")
	private WebElement NewEntry;

	@FindBy(xpath = "//*[@id=\"recentMenuBtn\"]")
	private WebElement MoveTo_Menu_Recent;

	@FindBy(xpath = "//*[@id=\"recentFolders\"]/tbody/tr[1]/td")
	private WebElement Recent_Folder;

	@FindBy(xpath = "//*[@id='fileControl_delete']/span")
	private WebElement DeleteFromViewer;

	@FindBy(xpath = "//i[@id='deleteFabButton']")
	private WebElement DeleteFromFab;

	@FindBy(xpath = "//*[@id=\"menuWebWrapper\"]/div[3]")
	private WebElement saveviewer;

	@FindBy(xpath = "//*[@id=\"menuWebWrapper\"]/div[10]")
	private WebElement ocrviewer;

	@FindBy(xpath = "//*[@id=\"documentSendTo\"]")
	private WebElement sendTo;

	@FindBy(xpath = "//*[@id=\"sendToMail\"]")
	private WebElement Verify_sendTomail_option;

	@FindBy(xpath = "//*[@id=\"sendToPrint\"]")
	private WebElement Verify_sendToprint_option;

	@FindBy(xpath = "//*[@id=\"sendToExport\"]")
	private WebElement Verify_sendToExport_option;

	@FindBy(xpath = "//*[@id=\"cutNodeLi\"]")
	private WebElement cutnode;

	@FindBy(xpath = "//*[@id=\"copyNodeLi\"]")
	private WebElement copynode;
	
	
	@FindBy(xpath = "//*[@id=\"pasteNodeAnchor\"]")
	private WebElement pastenode;

	@FindBy(xpath = "//*[@id=\"renameNodeAnchor\"]")
	private WebElement Renamenode;

	@FindBy(xpath = "//a[@id='deleteNodeAnchor']")
	private WebElement deletenode;

	@FindBy(xpath = "//*[@id=\"cutid\"]")
	private WebElement doclistcut;

	@FindBy(xpath = "//*[@id=\"copyId\"]")
	private WebElement doclistcopy;

	@FindBy(xpath = "//*[@id=\"delDocument\"]")
	private WebElement doclistdelete;

	@FindBy(xpath = "//*[@id=\"generateDocumentLink\"]")
	private WebElement doclistgeneratedoclink;

	@FindBy(xpath = ("(//span[@class='checkmark'])[1]"))
	private WebElement Select_DocumentList;

	@FindBy(xpath = "//*[@id=\"documentListSubMenu\"]")
	private WebElement MoveTo_Menu_Documents;

	@FindBy(xpath = "//*[@id=\"sendToSecureMail\"]")
	private WebElement Verify_sendTosecuremail_option;

	SoftAssert softAssert = new SoftAssert();

	public void getMoveTo_Menu_Documents() {
		Actions action = new Actions(driver);
		action.moveToElement(MoveTo_Menu_Documents).build().perform();
	}

	public void getMoveTo_Menu_Recent() {
		Actions action = new Actions(driver);
		action.moveToElement(MoveTo_Menu_Recent).perform();
	}

	public void getSelect_Added_Group() throws Exception {
		jsclick(UserSearchbox);
		UserSearchbox.sendKeys(Security_excelRead(3, 0));
		Thread.sleep(2000);
		jsclick(SelectAddedAdminGroup_Serachbox);
	}

	public void getSelect_Added_CvnamedGroup() throws Exception {
		jsclick(UserSearchbox);
		UserSearchbox.sendKeys(Security_excelRead(4, 0));
		Thread.sleep(2000);
		jsclick(SelectAddedcvnamedGroup_Serachbox);
		
	}

	public WebElement getSelect_Document_Type_Dropdown() {
		Select drop = new Select(Click_Document_Type_Dropdown);
		drop.selectByVisibleText("CVReports");
		return Click_Document_Type_Dropdown;
	}

	public void getEnter_ReportName() throws Exception {

		jsclick(Enter_ReportName);
		Enter_ReportName.sendKeys(MyPreferences_excelRead(1, 0));
	}

	public void getMoveTo_Menu_RoomName() {
		Actions action = new Actions(driver);
		action.moveToElement(MoveTo_Menu_RoomName).build().perform();
	}

	public WebElement getBrowse_Option() {
		WebElement ele = Browse_Option;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele);
		return ele;
	}

	public void getDoubleClick_CrossBar() {
		Actions builder = new Actions(driver);
		builder.doubleClick(DoubleClick_CrossBar).build().perform();
	}

	public void getSelect_Office_document_Defaultviewing() {
		Select sel = new Select(Select_Office_document_Defaultviewing);
		//sel.selectByVisibleText("Default viewing");
		sel.selectByIndex(0);

	}

	public void getPdf_document_Defaultviewing() {
		Select drop = new Select(Pdf_document_Defaultviewing);
		//drop.selectByVisibleText("Default viewing");
		drop.selectByIndex(0);
	}

	public void getaddvalidationmessage() {
		log(Groupaddvalidation.getText() + " this validation message should show");

	}

	public void getVerify_Ownership_Message() throws InterruptedException {
		jsclick(ownershipmessageok);

	}

	public void getSelect_Added_User_Folder() throws Exception {
		Thread.sleep(3000);
		jsclick(UserSearchbox);
		UserSearchbox.sendKeys(Security_excelRead(1, 0));
		Thread.sleep(2000);
		jsclick(SelectAddedUser_Serachbox);

	}

	public void getVerify_Share_Document_Option_Disable() {

		softAssert.assertTrue(Verify_Share_Document_Option_Disable.isEnabled());
	}

	public void getVerify_DisableOptions_FromDocList() throws Exception {

		softAssert.assertTrue(Verify_sendTomail_option.isEnabled());
		softAssert.assertTrue(Verify_sendToprint_option.isEnabled());
		softAssert.assertTrue(Verify_sendToExport_option.isEnabled());
		softAssert.assertTrue(Verify_sendTosecuremail_option.isEnabled());

	}

	public void All_permission_To_Cabinet() throws Exception {

		log("Test Scenario 1 : Give All permission for Cabinet ");
		try {
			LogDipakUser();
			Thread.sleep(5000);
		} catch (Exception e) {
			System.out.println("User is already Logged");
		}
		try {
			Thread.sleep(2000);
			jsclick(CancelSecuritydialog);
		} catch (Exception e) {
			// Security dialog not open
		}
		Refresh_Button();
		Thread.sleep(6000);
		log("Click on Refresh button");
		jsclick(Username);
		Thread.sleep(6000);
		log("Click on Username");
		jsclick(Logout);
		Thread.sleep(6000);
		log("Click on Logout Option");
		LoginAdminUser();
		Thread.sleep(6000);
		log("Login EWA with  User");
		selectElement(Select_Cabinet);
		Thread.sleep(3000);
		log("Expand a Cabinet");
		getMoveTo_Menu_RoomName();
		Thread.sleep(2000);
		log("Mousehover to Roomname Tab");
		jsclick(Security_option);
		Thread.sleep(6000);
		log("Click on  Security Option");
		jsclick(Add_Button);
		Thread.sleep(6000);
		log("Click on  Security dialog Add button");
		jsclick(Selectcvnamedgrp);
		Thread.sleep(6000);
		log("Select User Group");
		jsclick(Ok_button_UserDialog);
		Thread.sleep(6000);
		log("Click on Security dialog Ok button");
		try {
			getaddvalidationmessage();
			Thread.sleep(6000);
			log("Verifying Validation message");
			jsclick(Closebutton);
		} catch (Exception e) {
			// Group is not already added
		}
		getSelect_Added_CvnamedGroup();
		Thread.sleep(6000);
		log("Select Added Group");
		jsclick(NewEntry);
		Thread.sleep(3000);
		log("Click on  New Entry Security button");
		getDoubleClick_CrossBar();
		Thread.sleep(6000);
		log("Assign all permission to Group");
		jsclick(Apply_button_SecurityDialog);
		Thread.sleep(6000);
		log("Click on Security dialog Apply button");
		jsclick(Add_Button);
		Thread.sleep(6000);
		log("Click on  Security dialog Add button");
		jsclick(cvnamedDownarrow);
		Thread.sleep(6000);
		log("Click_UserGroup Downarrow which you want to select");
		jsclick(SelectcvnamedUser);
		Thread.sleep(6000);
		log("Select User from Group");
		jsclick(Ok_button_UserDialog);
		Thread.sleep(6000);
		log("Click on Security dialog Ok button");
		try {
			getaddvalidationmessage();
			Thread.sleep(6000);
			log("Verifying Validation message");
			jsclick(Closebutton);
		} catch (Exception e) {
			// Group is not already added
		}

		getSelect_Added_User_Folder();
		Thread.sleep(6000);
		log("Select a User");
		jsclick(NewEntry);
		log("Click on  New Enty button");
		getDoubleClick_CrossBar();
		Thread.sleep(6000);
		log("Assign all permission to User");
		jsclick(Apply_button_SecurityDialog);
		Thread.sleep(6000);
		log("Click on Security dialog Apply button");
		jsclick(Ok_button_SecurityDialog);
		Thread.sleep(5000);
		LogoutPage();
		log("Click on  Security dialog Ok button");
		log("All permission should be given for Cabinet");
	}

	public void Verify_Permission_CabinetLevel() throws Exception {

		log("Test Scenario 2 : Verifying All permission for Cabinet");

		LogDipakUser();
		Thread.sleep(6000);
		log("Login EWA with User credential");
		Refresh_Button();
		Thread.sleep(6000);
		log("Click on Refresh button");
		jsclick(Setting_Icon);
		Thread.sleep(6000);
		log("Click on Setting Icon");
		jsclick(My_Preferencesetting);
		Thread.sleep(6000);
		log("Click on My Preferences Option");
		getSelect_Office_document_Defaultviewing();
		Thread.sleep(6000);
		log("Select Office Document and set Default View");
		getPdf_document_Defaultviewing();
		Thread.sleep(6000);
		log("Select Pdf Document and set Default View");
		movingclkElement(Apply_button);
		Thread.sleep(6000);
		log("Click on Security dialog Apply button");
		Refresh_Button();
		Thread.sleep(8000);
		jsclick(Click_New_Document);
		Thread.sleep(4000);
		log("Click on New Document Tab");
		jsclick(Destination_Folder_Textbox);
		Thread.sleep(4000);
		log("Click on Destination Folder Textbox");
		selectElement(Select_Cabinet1);
		Thread.sleep(2000);
		log("Expand a Cabinet");
		selectElement(Select_Drawer1);
		Thread.sleep(3000);
		log("Expand a Drawer");
		selectElement(Select_Folder1);
		Thread.sleep(2000);
		log("select a Folder");
		movingclkElement(OK_Button_BrowseforFolder);
		Thread.sleep(6000);
		log("Click on Ok button ");
		getSelect_Document_Type_Dropdown();
		Thread.sleep(4000);
		log("Select Value from Document type dropdown");
		getEnter_ReportName();
		Thread.sleep(3000);
		log("Enter value into Report Name field");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(Move_To_PlusIcon));
		movingElement(Move_To_PlusIcon);
		getBrowse_Option();
		Thread.sleep(3000);
		log("Browse a Document Page");
		Runtime.getRuntime().exec("D:\\DipakAutoit\\PdfDoc\\FileUploadUpdate.exe");
		log("By using AutoIT add file from external folder");
		try {
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Thread.sleep(6000);
		movingclkElement(Create_button);
		Thread.sleep(4000);
		log("Click on Create button");
		jsclick(Navigate_button);
		Thread.sleep(7000);
		Refresh_Button();
		Thread.sleep(8000);
		selectElement(Select_Cabinet);
		Thread.sleep(6000);
		log("Expand a Cabinet");
		selectElement(Select_Drawer);
		Thread.sleep(6000);
		log("Expand a Drawer");
		selectElement(Select_Folder);
		Thread.sleep(6000);
		log("select a Folder");
		getMoveTo_Menu_RoomName();
		log("Mousehover to Roomname Tab");
		
		Thread.sleep(1000);
		softAssert.assertTrue(cutnode.isEnabled());
		softAssert.assertTrue(copynode.isEnabled());
		
		WebElement delteatt=driver.findElement(By.xpath("//a[@id='deleteNodeAnchor']"));//i made changes
		if(delteatt.isEnabled()){
		System.out.println("The delete button is enabled");
			
		}
				
	
		Thread.sleep(2000);
		
		// For Paste
		
		WebElement pasteatt=driver.findElement(By.xpath("//*[@id=\"pasteNodeAnchor\"]"));//i made changes
		String pastetribute = pasteatt.getAttribute("class");
		System.out.println(pastetribute);
		
		softAssert.assertEquals(pastetribute, "disabled");
	
	    
		Thread.sleep(2000);
		
		
		System.out.println("Update visible");
	    
		softAssert.assertTrue(!Security_option.isEnabled());
		Thread.sleep(2000);
		
		jsclick(Select_DocumentList);
		Thread.sleep(6000);
		log("Check Document from Document List ");
		getMoveTo_Menu_Documents();
		Thread.sleep(2000);
		log("Mousehover on Documents Tab");
		softAssert.assertTrue(doclistcut.isEnabled());
		softAssert.assertTrue(doclistcopy.isEnabled());
		softAssert.assertTrue(doclistdelete.isEnabled());
		Thread.sleep(1000);
		jsclick(sendTo);
		Thread.sleep(1000);
		log("Click on the Send To Option");
		softAssert.assertTrue(Verify_sendTomail_option.isEnabled());
		softAssert.assertTrue(Verify_sendToprint_option.isEnabled());
		softAssert.assertTrue(Verify_sendToExport_option.isEnabled());
		softAssert.assertTrue(Verify_sendTosecuremail_option.isEnabled());
		softAssert.assertTrue(doclistgeneratedoclink.isEnabled());
		Thread.sleep(1000);
		jsclick(Open_Document_UnderFolder);
		Thread.sleep(9000);
		log("Click on Document from Document List");
		try {
			getVerify_Ownership_Message();
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("Document Open successfuly");
		}
		try {
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Thread.sleep(8000);
		log("Document Open successfully");
		jsclick(Select_Document);
		Thread.sleep(8000);
		log("Click on First Page Thumbnail");
		softAssert.assertTrue(Verify_Share_Document_Option_Disable.isEnabled());
		softAssert.assertTrue(DeleteFromViewer.isEnabled());
		softAssert.assertTrue(DeleteFromFab.isEnabled());
		Thread.sleep(2000);
		movingclkElement(Close_Document);
		Thread.sleep(2000);
		log("Verified All permission for Cabinet");
		LogoutPage();
		log("Logout the user account ");
	}

	public void Remove_All_permission_Cabinet() throws Exception {

		log("Test Scenario 3 : Remove All permission To  for Cabinet");

		LoginAdminUser();
		Thread.sleep(6000);
		log("Login EWA with admin User ");
		selectElement(Select_Cabinet);
		Thread.sleep(6000);
		log("Expand a Cabinet");
		getMoveTo_Menu_RoomName();
		log("Mousehover to Roomname Tab");
		jsclick(Security_option);
		Thread.sleep(6000);
		log("Click on Security Option");
		getSelect_Added_User();
		Thread.sleep(6000);
		log("Select added User");
		jsclick(Remove_Button);
		Thread.sleep(6000);
		log("Click on Remove button");
		jsclick(Ok_button_SecurityDialog);
		Thread.sleep(6000);
		log("Click on Security dialog Ok button");
		log("Added Remove Successfully on Cabinet level");
	}

	public void Set_Delete_Denied_onFolder() throws Exception {

		log("Test Scenario 4 : Set Delete permission Denied for Folder");
		try {
			LoginAdminUser();
			Thread.sleep(5000);
		} catch (Exception e) {
			System.out.println("User is already Logged");
		}
		try {
			Thread.sleep(2000);
			jsclick(CancelSecuritydialog);
		} catch (Exception e) {
			// Security dialog not open
		}
		Refresh_Button();
		Thread.sleep(6000);
		log("Click on Refresh button");
		selectElement(Select_Cabinet);
		Thread.sleep(6000);
		log("Expand a Cabinet");
		selectElement(Select_Drawer);
		Thread.sleep(6000);
		log("Expand a Drawer");
		selectElement(Select_Folder);
		Thread.sleep(6000);
		log("select a Folder");
		getMoveTo_Menu_RoomName();
		Thread.sleep(6000);
		log("Mousehover to Roomname Tab");
		jsclick(Security_option);
		Thread.sleep(6000);
		log("Click on Security Option");
		jsclick(Add_Button);
		Thread.sleep(6000);
		log("Click on Security dialog Add button");
		jsclick(cvnamedDownarrow);
		Thread.sleep(6000);
		log("Select Click_UserGroup Group");
		jsclick(SelectcvnamedUser);
		Thread.sleep(6000);
		log("Select User from Group");
		jsclick(Ok_button_UserDialog);
		Thread.sleep(6000);
		log("Click on Security dialog Ok button");
		try {
			getaddvalidationmessage();
			Thread.sleep(6000);
			log("Verifying Valialidation message");
			jsclick(Closebutton);
		} catch (Exception e) {
			// Group is not already added
		}
		getSelect_Added_User_Folder();
		Thread.sleep(6000);
		log("Select added User");
		jsclick(NewEntry);
		log("Click on New Entry button");
		getDoubleClick_CrossBar();
		Thread.sleep(6000);
		log("Assign Permission to added User");
		jsclick(Delete_Permission);
		Thread.sleep(6000);
		log("Denied Delete Permission for Folder");
		jsclick(Apply_button_SecurityDialog);
		Thread.sleep(6000);
		log("Click on Security dialog Apply button");
		jsclick(Ok_button_SecurityDialog);
		Thread.sleep(6000);
		log("Click on Security dialog Ok button");
		log("Delete permission should be Denied Selected  for Drawer");
		LogoutPage();
		Thread.sleep(6000);
	}

	public void Verify_Delete_permission_Denied_Folder() throws Exception {

		log("Test Scenario 5 : Verifying Delete permission Denied for Folder ");

		LogDipakUser();
		Thread.sleep(6000);
		log("Login EWA with User Credential ");
		selectElement(Select_Cabinet);
		Thread.sleep(6000);
		log("Expand a Cabinet");
		selectElement(Select_Drawer);
		Thread.sleep(6000);
		log("Expand a Drawer");
		selectElement(Select_Folder);
		Thread.sleep(7000);
		log("select a Folder");
		getMoveTo_Menu_RoomName();
		log("Mousehover to Roomname Tab");
		Thread.sleep(2000);

		if (Security_option.isEnabled()) {
			System.out.println("Security option found enabled");
		} else {
			System.out.println("Security option found disabled");
		}

		if (deletenode.isEnabled()) {
			System.out.println("delete option found enabled");
		} else {
			System.out.println("delete option found disabled");
		}

		Thread.sleep(3000);
		jsclick(Select_DocumentList);
		Thread.sleep(6000);
		log("Check Document from Document List ");
		getMoveTo_Menu_Documents();
		Thread.sleep(2000);
		log("Mousehover on Documents Tab");

		if (doclistdelete.isEnabled()) {
			System.out.println("delete option found enabled");
		} else {
			System.out.println("delete option found disabled");
		}

		jsclick(Open_Document_UnderFolder);
		log("Open Document from document List ");
		try {
			getVerify_Ownership_Message();
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("Document Open successfuly");
		}
		try {
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		log("Document Open successfully");
		Thread.sleep(9000);
		jsclick(Select_Document);
		Thread.sleep(6000);
		log("Select First page Thumbnail");

		if (DeleteFromViewer.isEnabled()) {
			System.out.println("delete option found enabled from viewer");
		} else {
			System.out.println("delete option found disabled from viewer");
		}
		if (DeleteFromFab.isEnabled()) {
			System.out.println("delete option found enabled from viewer");
		} else {
			System.out.println("delete option found disabled from viewer");
		}

		Thread.sleep(6000);
		log("Verified Delete Option is Disable from Fab button and Delete Menu Option");
		movingclkElement(Close_Document);
		Thread.sleep(5000);
		log("Click on Cross button and Close Document");
		LogoutPage();
		Thread.sleep(5000);

	}

	public void Remove_Delete_Denied_Folder() throws Exception {

		log("Test Scenario 6 : Remove Delete Permission Denied for Folder");

		LoginAdminUser();
		Thread.sleep(5000);
		log("Login EWA with  User");
		selectElement(Select_Cabinet);
		Thread.sleep(6000);
		log("Expand a Cabinet");
		selectElement(Select_Drawer);
		Thread.sleep(6000);
		log("Expand a Drawer");
		selectElement(Select_Folder);
		Thread.sleep(7000);
		log("select a Folder");
		getMoveTo_Menu_RoomName();
		log("Mousehover into Roomname Tab");
		jsclick(Security_option);
		Thread.sleep(6000);
		log("Click on Security Option");
		getSelect_Added_User();
		Thread.sleep(6000);
		log("Select added User");
		jsclick(Remove_Button);
		Thread.sleep(6000);
		log("Click on Remove button");
		jsclick(Ok_button_SecurityDialog);
		Thread.sleep(6000);
		log("Click on Security dialog Ok button");
		log("Added user Remove Successfully on Folder level");
		log("Delete permission is denied for Folder verified Successfully...");

	}

	public void Share_permission_Denied_Folder() throws Exception {

		log("Test Scenario 7 : Share permission Denied for Folder ");

		try {
			LoginAdminUser();
			Thread.sleep(5000);
		} catch (Exception e) {
			System.out.println("User is already Logged");
		}
		try {
			Thread.sleep(2000);
			jsclick(CancelSecuritydialog);
		} catch (Exception e) {
			// Security dialog not open
		}
		Refresh_Button();
		Thread.sleep(6000);
		log("Click on Refresh button");
		selectElement(Select_Cabinet);
		Thread.sleep(6000);
		log("Expand a Cabinet");
		selectElement(Select_Drawer);
		Thread.sleep(6000);
		log("Expand a Drawer");
		selectElement(Select_Folder);
		Thread.sleep(6000);
		log("select a Folder");
		getMoveTo_Menu_RoomName();
		Thread.sleep(6000);
		log("Mousehover to Roomname ");
		jsclick(Security_option);
		Thread.sleep(6000);
		log("Click on Security Option");
		jsclick(Add_Button);
		Thread.sleep(6000);
		log("Click on Security dialog Add button");
		jsclick(cvnamedDownarrow);
		Thread.sleep(6000);
		log("Click on Click_UserGroup Group");
		jsclick(SelectcvnamedUser);
		Thread.sleep(6000);
		log("Select from Group");
		jsclick(Ok_button_UserDialog);
		Thread.sleep(6000);
		log("Click on Security dialog Ok button");
		try {
			getaddvalidationmessage();
			Thread.sleep(6000);
			log("Verifying Validation message");
			jsclick(Closebutton);
		} catch (Exception e) {
			// Group is not already added
		}
		getSelect_Added_User_Folder();
		Thread.sleep(6000);
		log("Select added User");
		jsclick(NewEntry);
		log("Click on New Entry button");
		getDoubleClick_CrossBar();
		Thread.sleep(6000);
		log("Assign permission to Selected ");
		jsclick(Share_Permission);
		Thread.sleep(6000);
		log("Denied Share permission to Selected ");
		jsclick(Apply_button_SecurityDialog);
		Thread.sleep(6000);
		log("Click on Security dialog Apply button");
		jsclick(Ok_button_SecurityDialog);
		Thread.sleep(6000);
		log("Click on Security dialog Ok button");
		log("Share permission should be Denied Selected  for Folder");
		jsclick(Username);
		Thread.sleep(6000);
		log("Click on Username");
		jsclick(Logout);
		Thread.sleep(6000);
		log("Click on Logout Option");
		LogDipakUser();
		Thread.sleep(2000);
		log("Login EWA with User Credential");
		Refresh_Button();
		Thread.sleep(6000);
		log("Click on Refresh button");
		selectElement(Select_Cabinet);
		Thread.sleep(6000);
		log("Expand a Cabinet");
		selectElement(Select_Drawer);
		Thread.sleep(6000);
		log("Expand a Drawer");
		selectElement(Select_Folder);
		Thread.sleep(6000);
		log("select a Folder");
		jsclick(Select_DocumentList);
		Thread.sleep(6000);
		log("Check Document from Document List ");
		getMoveTo_Menu_Documents();
		Thread.sleep(2000);
		log("Mousehover on Documents Tab");
		jsclick(sendTo);
		Thread.sleep(1000);
		log("Click on the Send To Option");
		getVerify_DisableOptions_FromDocList();
		Thread.sleep(2000);
		jsclick(Open_Document_UnderFolder);
		try {
			getVerify_Ownership_Message();
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("Document Open successfuly");
		}
		try {
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		log("Document open successfully under Folder");
		Thread.sleep(6000);
		jsclick(Select_Document);
		Thread.sleep(6000);
		log("Click on First page Thumbnail");
		getVerify_Share_Document_Option_Disable();
		Thread.sleep(6000);
		log("Verified Share option is Disable from Viewer menu");
		movingclkElement(Close_Document);
		Thread.sleep(6000);
		log("Click on Cross button and Close document");
		LogoutPage();
		LoginAdminUser();
		Thread.sleep(6000);
		log("Login EWA with admin User ");
		selectElement(Select_Cabinet);
		Thread.sleep(6000);
		log("Expand a Cabinet");
		selectElement(Select_Drawer);
		Thread.sleep(6000);
		log("Expand a Drawer");
		selectElement(Select_Folder);
		Thread.sleep(6000);
		log("select a Folder");
		getMoveTo_Menu_RoomName();
		log("Mousehover to Roomname Tab");
		jsclick(Security_option);
		Thread.sleep(6000);
		log("Click on Security Tab");
		getSelect_Added_User_Folder();
		Thread.sleep(6000);
		log("Select added User ");
		jsclick(Remove_Button);
		Thread.sleep(6000);
		log("Click on Remove button");
		jsclick(Ok_button_SecurityDialog);
		log("Click on  Security dialog Ok button");
		log("Added  Remove Successfully on Folder level");
		log("Share permission is denied for Folder verified Successfully...");
	}

	public void Modify_Denied_Subfolder() throws Exception {

		log("Test Scenario 8 : Verifying Modify Permissions Denied on subFolder ");
		try {
			LoginAdminUser();
			Thread.sleep(5000);
		} catch (Exception e) {
			System.out.println("User is already Logged");
		}
		try {
			Thread.sleep(2000);
			jsclick(CancelSecuritydialog);
		} catch (Exception e) {
			// Security dialog not open
		}
		Refresh_Button();
		Thread.sleep(15000);
		log("Click on Refresh button");
		selectElement(Select_Cabinet);
		Thread.sleep(6000);
		log("Expand a Cabinet");
		selectElement(Select_Drawer);
		Thread.sleep(6000);
		log("Expand a Drawer");
		selectElement(Select_Folder);
		Thread.sleep(6000);
		log("select a Folder");
		selectElement(Select_subFolder);
		Thread.sleep(6000);
		log("select a SubFolder");
		getMoveTo_Menu_RoomName();
		Thread.sleep(6000);
		log("Mousehover to Roomname Tab");
		jsclick(Security_option);
		Thread.sleep(6000);
		log("Click on Security Option");
		jsclick(Add_Button);
		Thread.sleep(6000);
		log("Click on Security Dialog Add button");
		jsclick(cvnamedDownarrow);
		Thread.sleep(6000);
		log("Select Cvnamed Group");
		jsclick(SelectcvnamedUser);
		Thread.sleep(3000);
		log("Select User from Group");
		movingclkElement(Ok_button_UserDialog);
		Thread.sleep(3000);
		log("Click on Security dialog Ok button");
		try {
			getaddvalidationmessage();
			Thread.sleep(6000);
			log("Verifying Validation message");
			jsclick(Closebutton);
		} catch (Exception e) {
			// Group is not already added
		}
		getSelect_Added_User_Folder();
		Thread.sleep(6000);
		log("Select added User");
		jsclick(NewEntry);
		log("Click on  New Entry button");
		getDoubleClick_CrossBar();
		Thread.sleep(6000);
		log("Assign all permission to Selected ");
		jsclick(Modify_Permission);
		Thread.sleep(6000);
		log("Denied Modify Permission to Selected ");
		jsclick(Apply_button_SecurityDialog);
		Thread.sleep(6000);
		log("Click on Security dialog Apply button");
		jsclick(Ok_button_SecurityDialog);
		log("Click on the Ok button");
		log("Modify permission should be Denied Selected  for SubFolder");
		LogoutPage();
		LogDipakUser();
		log("Login EWA with User Credential");
		Thread.sleep(6000);
		selectElement(Select_Cabinet);
		Thread.sleep(6000);
		log("Expand a Cabinet");
		selectElement(Select_Drawer);
		Thread.sleep(6000);
		log("Expand a  Drawer");
		selectElement(Select_Folder);
		Thread.sleep(6000);
		log("select a Folder");
		selectElement(Select_subFolder);
		Thread.sleep(6000);
		log("select a SubFolder");
		getMoveTo_Menu_RoomName();
		log("Mousehover to Roomname Tab");
		Thread.sleep(1000);
		softAssert.assertTrue(Renamenode.isEnabled());
		softAssert.assertTrue(copynode.isEnabled());
		softAssert.assertTrue(Security_option.isEnabled());
		Thread.sleep(3000);
		jsclick(Select_DocumentList);
		Thread.sleep(6000);
		log("Check Document from Document List ");
		getMoveTo_Menu_Documents();
		Thread.sleep(2000);
		log("Mousehover on Documents Tab");
		softAssert.assertTrue(doclistcopy.isEnabled());
		Thread.sleep(2000);
		jsclick(Open_subfolder_Document);
		log("Click on SubFolder Document");
		try {
			getVerify_Ownership_Message();
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("Document Open successfuly");
		}
		try {
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		log("Document Open successfully");
		Thread.sleep(11000);
		jsclick(Select_Document);
		Thread.sleep(9000);
		log("Select First page Thumbnail");
		softAssert.assertTrue(DeleteFromViewer.isEnabled());
		softAssert.assertTrue(DeleteFromFab.isEnabled());
		softAssert.assertTrue(saveviewer.isEnabled());
		softAssert.assertTrue(ocrviewer.isEnabled());
		Thread.sleep(3000);
		movingclkElement(Close_Document);
		Thread.sleep(3000);
		log("Click on Cross button and Close Document");
		LogoutPage();
		LoginAdminUser();
		Thread.sleep(6000);
		log("Login EWA with  User");
		selectElement(Select_Cabinet);
		Thread.sleep(6000);
		log("Expand a Cabinet");
		selectElement(Select_Drawer);
		Thread.sleep(6000);
		log("Expand a Drawer");
		selectElement(Select_Folder);
		Thread.sleep(6000);
		log("select a Folder");
		selectElement(Select_subFolder);
		Thread.sleep(6000);
		log(" select a SubFolder");
		getMoveTo_Menu_RoomName();
		Thread.sleep(6000);
		log("Mousehover to Roomname Tab");
		jsclick(Security_option);
		Thread.sleep(6000);
		log("Click on Security Option");
		getSelect_Added_User_Folder();
		Thread.sleep(6000);
		log("Select Added User");
		jsclick(Remove_Button);
		Thread.sleep(6000);
		log("Click on  Security dialog Remove button");
		jsclick(Ok_button_SecurityDialog);
		log("Click on  Security dialog Ok button");
		log("Added  Remove Successfully on subFolder level");
		log("Modify permission is denied for Subfolder verified Successfully...");
	}

	public void Diffrenet_permissions_Group() throws Exception {

		log("Test Scenario 9 : Give Different permission To Group for AllNodes");
		try {
			LoginAdminUser();
			Thread.sleep(5000);
		} catch (Exception e) {
			System.out.println("User is already Logged");
		}
		try {
			Thread.sleep(2000);
			jsclick(CancelSecuritydialog);
		} catch (Exception e) {
			// Security dialog not open
		}
		Refresh_Button();
		Thread.sleep(6000);
		selectElement(Select_Cabinet);
		Thread.sleep(6000);
		log("Expand a Cabinet");
		getMoveTo_Menu_RoomName();
		Thread.sleep(2000);
		log("Mousehover to Roomname Tab");
		jsclick(Security_option);
		Thread.sleep(6000);
		log("Click on Security Option");
		jsclick(Add_Button);
		Thread.sleep(6000);
		log("Click on Security dialog Add button");
		jsclick(cvadminsDownarrow);
		Thread.sleep(6000);
		log("Click on cvadmins Group Name");
		jsclick(Ok_button_UserDialog);
		Thread.sleep(6000);
		log("Click on Security dialog Ok button");
		try {
			getaddvalidationmessage();
			Thread.sleep(6000);
			log("Verifying Group added already Validation Message");
			jsclick(Closebutton);
		} catch (Exception e) {
			// Group is not already added
		}
		getSelect_Added_Group();
		Thread.sleep(6000);
		log("Select Added Group");
		jsclick(NewEntry);
		Thread.sleep(3000);
		log("Click on  New Entry Security button");
		getDoubleClick_CrossBar();
		Thread.sleep(6000);
		log("Assign all permission to Group");
		jsclick(Apply_button_SecurityDialog);
		Thread.sleep(6000);
		log("Click on Security dialog Apply button");
		jsclick(Ok_button_SecurityDialog);
		log("Click on  Security dialog Ok button");
		log("All permission should be given to  for Cabinet");
		Refresh_Button();
		Thread.sleep(6000);
		log("Click on Refresh button");
		selectElement(Select_Cabinet);
		Thread.sleep(6000);
		log("Expand a Cabinet");
		selectElement(Select_Drawer);
		Thread.sleep(6000);
		log("Expand a Drawer");
		getMoveTo_Menu_RoomName();
		Thread.sleep(6000);
		log("Mousehover to Roomname Tab");
		jsclick(Security_option);
		Thread.sleep(6000);
		log("Click on Security Option");
		jsclick(Add_Button);
		Thread.sleep(6000);
		log("Click on Security dialog Add button");
		jsclick(cvadminsDownarrow);
		Thread.sleep(6000);
		log("Select cvadmins Group");
		jsclick(Ok_button_UserDialog);
		Thread.sleep(6000);
		log("Click on Security dialog Ok button");
		try {
			getaddvalidationmessage();
		} catch (Exception e) {
			System.out.println("Validation message not showing");
		}
		Thread.sleep(6000);
		log("Verifying Validation message");
		jsclick(Closebutton);
		Thread.sleep(6000);
		log("Click on Close button");
		getSelect_Added_Group();
		Thread.sleep(6000);
		log("Select Added Group");
		jsclick(NewEntry);
		Thread.sleep(6000);
		log("Click on New Entry button");
		getDoubleClick_CrossBar();
		Thread.sleep(6000);
		log("Assign all permission to Group");
		jsclick(Delete_Permission);
		Thread.sleep(6000);
		log("Denied Delete permission to Group");
		jsclick(Apply_button_SecurityDialog);
		Thread.sleep(6000);
		log("Click on Security Dialog Apply button");
		jsclick(Ok_button_SecurityDialog);
		Thread.sleep(6000);
		log("Click on Security Dialog Ok button");
		log("Delete permission should be Denied Selected  for Drawer");
		Refresh_Button();
		Thread.sleep(6000);
		log("Click on Refresh button");
		selectElement(Select_Cabinet);
		Thread.sleep(6000);
		log("Expand a Cabinet");
		selectElement(Select_Drawer);
		Thread.sleep(6000);
		log("Expand a Drawer");
		selectElement(Select_Folder);
		Thread.sleep(6000);
		log("select a Folder");
		getMoveTo_Menu_RoomName();
		Thread.sleep(6000);
		log("Mousehover to Roomname Tab");
		jsclick(Security_option);
		Thread.sleep(6000);
		log("Click on Security Option");
		jsclick(Add_Button);
		Thread.sleep(6000);
		log("Click on Security Dialog Add button");
		jsclick(cvadminsDownarrow);
		Thread.sleep(6000);
		log("Select cvadmins Group");
		jsclick(Ok_button_UserDialog);
		Thread.sleep(6000);
		log("Click on Security dialog Ok button");
		getaddvalidationmessage();
		Thread.sleep(6000);
		log("Verifying Validation message");
		jsclick(Closebutton);
		Thread.sleep(6000);
		log("Click on Close button");
		getSelect_Added_Group();
		Thread.sleep(6000);
		log("Select added Group");
		jsclick(NewEntry);
		Thread.sleep(6000);
		log("Click on New Entry button");
		getDoubleClick_CrossBar();
		Thread.sleep(6000);
		log("Assign all permission to selected Group");
		jsclick(Share_Permission);
		Thread.sleep(6000);
		log("Denied share permission");
		jsclick(Apply_button_SecurityDialog);
		Thread.sleep(6000);
		log("Click on Security Dialog Apply button");
		jsclick(Ok_button_SecurityDialog);
		Thread.sleep(6000);
		log("Click on Security Dialog Ok button");
		log("Share permission should be Denied Selected  for Folder");
		Refresh_Button();
		Thread.sleep(6000);
		log("Click on Refresh button");
		selectElement(Select_Cabinet);
		Thread.sleep(6000);
		log("Expand a Cabinet");
		selectElement(Select_Drawer);
		Thread.sleep(6000);
		log("Expand a Drawer");
		selectElement(Select_Folder);
		Thread.sleep(6000);
		log("select a Folder");
		selectElement(Select_subFolder);
		Thread.sleep(6000);
		log("select a SubFolder");
		getMoveTo_Menu_RoomName();
		Thread.sleep(6000);
		log("Mousehover to Roomname Tab");
		jsclick(Security_option);
		Thread.sleep(6000);
		log("Click on Security Option");
		jsclick(Add_Button);
		Thread.sleep(6000);
		log("Click on Security Dialog Add button");
		jsclick(cvadminsDownarrow);
		Thread.sleep(6000);
		log("Select cvadmins Group ");
		jsclick(Ok_button_UserDialog);
		Thread.sleep(6000);
		log("Click on Security dialog  Ok button");
		getaddvalidationmessage();
		Thread.sleep(6000);
		log("Verifying Validation Message");
		jsclick(Closebutton);
		Thread.sleep(6000);
		log("Click on Close button");
		getSelect_Added_Group();
		Thread.sleep(6000);
		log("Select added Group");
		jsclick(NewEntry);
		Thread.sleep(6000);
		log("Click on New Entry Tab");
		getDoubleClick_CrossBar();
		Thread.sleep(6000);
		log("Assign all Permission to Group");
		jsclick(Modify_Permission);
		Thread.sleep(6000);
		log("Denied Modify Permission");
		jsclick(Apply_button_SecurityDialog);
		Thread.sleep(6000);
		log("Click on Security dialog Apply button");
		jsclick(Ok_button_SecurityDialog);
		Thread.sleep(6000);
		log("Click on Security dialog Ok button");
		log("Modify permission should be Denied Selected  for SubFolder");

	}

	public void Verify_Respective_Group_permission() throws Exception {

		log("Test Scenario 10 :Verifying Respective permission To Group for AllNodes ");

		try {
			LoginAdminUser();
			Thread.sleep(5000);
		} catch (Exception e) {
			System.out.println("User is already Logged");
		}
		log("Login with Security permission assign Group");
		try {
			Thread.sleep(2000);
			jsclick(CancelSecuritydialog);
		} catch (Exception e) {
			// Security dialog not open
		}
		Refresh_Button();
		Thread.sleep(6000);
		log("Click on Refresh button");
		jsclick(Setting_Icon);
		Thread.sleep(6000);
		log("Click on Setting Icon");
		jsclick(My_Preferencesetting);
		Thread.sleep(6000);
		log("Click on My Preferences Option");
		getSelect_Office_document_Defaultviewing();
		Thread.sleep(6000);
		log("Select Office Document and set Default View Option ");
		getPdf_document_Defaultviewing();
		Thread.sleep(6000);
		log("Select Pdf Document and set Default View Option");
		movingclkElement(Apply_button);
		Thread.sleep(6000);
		log("Click on Security Dialog Apply button");
		selectElement(Select_Cabinet);
		Thread.sleep(6000);
		log("Expand a Cabinet");
		selectElement(Select_Drawer);
		Thread.sleep(6000);
		log("Expand a Drawer");
		getMoveTo_Menu_RoomName();
		Thread.sleep(2000);
		log("Mousehover to Roomname Tab");
		softAssert.assertTrue(deletenode.isEnabled());
		Thread.sleep(6000);
		log("Delete permission should be Denied Selected  for Drawer");
		Refresh_Button();
		Thread.sleep(6000);
		log("Click on Refresh button");
		selectElement(Select_Cabinet);
		Thread.sleep(6000);
		log("Expand a Cabinet");
		selectElement(Select_Drawer);
		Thread.sleep(6000);
		log("Expand a Drawer");
		selectElement(Select_Folder);
		Thread.sleep(9000);
		log("select a Folder");
		jsclick(Select_DocumentList);
		Thread.sleep(6000);
		log("Check Document from Document List ");
		getMoveTo_Menu_Documents();
		Thread.sleep(2000);
		log("Mousehover on Documents Tab");
		jsclick(sendTo);
		Thread.sleep(1000);
		log("Click on the Send To Option");
		getVerify_DisableOptions_FromDocList();
		Thread.sleep(2000);
		jsclick(Open_Document_UnderFolder);
		try {
			getVerify_Ownership_Message();
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("Document Open successfuly");
		}
		try {
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		log("Document open successfully under Folder");
		Thread.sleep(6000);
		jsclick(Select_Document);
		Thread.sleep(6000);
		log("Click on First page Thumbnail");
		getVerify_Share_Document_Option_Disable();
		Thread.sleep(6000);
		log("Verified Share option is Disable from Viewer menu");
		movingclkElement(Close_Document);
		Thread.sleep(6000);
		log("Click on Cross button and Close document");
		Refresh_Button();
		Thread.sleep(6000);
		log("Click on Refresh button");
		selectElement(Select_Cabinet);
		Thread.sleep(6000);
		log("Expand a Cabinet");
		selectElement(Select_Drawer);
		Thread.sleep(6000);
		log("Expand a Drawer");
		selectElement(Select_Folder);
		Thread.sleep(6000);
		log("select a Folder");
		selectElement(Select_subFolder);
		Thread.sleep(6000);
		log("select a SubFolder");
		getMoveTo_Menu_RoomName();
		log("Mousehover to Roomname Tab");
		Thread.sleep(1000);
		softAssert.assertTrue(Renamenode.isEnabled());
		softAssert.assertTrue(copynode.isEnabled());
		softAssert.assertTrue(Security_option.isEnabled());
		Thread.sleep(2000);
		jsclick(Select_DocumentList);
		Thread.sleep(6000);
		log("Check Document from Document List ");
		getMoveTo_Menu_Documents();
		Thread.sleep(2000);
		log("Mousehover on Documents Tab");
		softAssert.assertTrue(doclistcopy.isEnabled());
		Thread.sleep(2000);
		jsclick(Open_subfolder_Document);
		log("Click on SubFolder Document");
		try {
			getVerify_Ownership_Message();
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("Document Open successfuly");
		}
		try {
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		log("Document Open successfully");
		Thread.sleep(11000);
		jsclick(Select_Document);
		Thread.sleep(9000);
		log("Select First page Thumbnail");
		softAssert.assertTrue(DeleteFromViewer.isEnabled());
		softAssert.assertTrue(DeleteFromFab.isEnabled());
		softAssert.assertTrue(saveviewer.isEnabled());
		softAssert.assertTrue(ocrviewer.isEnabled());
		Thread.sleep(3000);
		movingclkElement(Close_Document);
		Thread.sleep(3000);
		log("Click on Cross button and Close Document");
		LogoutPage();
		Thread.sleep(6000);
		LoginAdminUser();
		Thread.sleep(6000);
		log("Login EWA with  User");
		selectElement(Select_Cabinet);
		Thread.sleep(3000);
		log("Expand a Cabinet");
		getMoveTo_Menu_RoomName();
		Thread.sleep(2000);
		log("Mousehover to Roomname Tab");
		jsclick(Security_option);
		Thread.sleep(6000);
		log("Click on  Security Option");
		jsclick(Add_Button);
		Thread.sleep(6000);
		log("Click on  Security dialog Add button");
		jsclick(cvnamedDownarrow);
		Thread.sleep(6000);
		log("Select Click_UserGroup Group");
		jsclick(SelectcvnamedUser);
		Thread.sleep(6000);
		log("Select User from Group");
		jsclick(Ok_button_UserDialog);
		Thread.sleep(6000);
		log("Click on Security dialog Ok button");
		try {
			getaddvalidationmessage();
			Thread.sleep(6000);
			log("Verifying Validation message");
			jsclick(Closebutton);
		} catch (Exception e) {
			// Group is not already added
		}
		getSelect_Added_User_Folder();
		Thread.sleep(6000);
		log("Select User");
		jsclick(NewEntry);
		log("Click on  New Enty button");
		getDoubleClick_CrossBar();
		Thread.sleep(6000);
		log("Assign all to permission to cabinet");
		jsclick(Apply_button_SecurityDialog);
		Thread.sleep(6000);
		log("Click on Security dialog Apply button");
		jsclick(Ok_button_SecurityDialog);
		Thread.sleep(5000);
		Refresh_Button();
		Thread.sleep(6000);
		log("Click on Refresh button");
		selectElement(Select_Cabinet);
		Thread.sleep(6000);
		log("Expand a Cabinet");
		selectElement(Select_Drawer);
		Thread.sleep(6000);
		log("Expand a Drawer");
		getMoveTo_Menu_RoomName();
		Thread.sleep(6000);
		log("Mousehover to Roomname Tab");
		jsclick(Security_option);
		Thread.sleep(6000);
		log("Click on Security Option");
		jsclick(Add_Button);
		Thread.sleep(6000);
		log("Click on Security dialog Add button");
		jsclick(cvadminsDownarrow);
		Thread.sleep(6000);
		log("Select cvadmins Group");
		jsclick(Ok_button_UserDialog);
		Thread.sleep(6000);
		log("Click on Security dialog Ok button");
		try {
			getaddvalidationmessage();
		} catch (Exception e) {
			System.out.println("Validation message not showing");
		}
		Thread.sleep(6000);
		log("Verifying Validation message");
		jsclick(Closebutton);
		Thread.sleep(6000);
		log("Click on Close button");
		getSelect_Added_Group();
		Thread.sleep(6000);
		log("Select Added Group");
		jsclick(NewEntry);
		Thread.sleep(6000);
		log("Click on New Entry button");
		getDoubleClick_CrossBar();
		Thread.sleep(6000);
		log("Assign all permission to Group");
		jsclick(Apply_button_SecurityDialog);
		Thread.sleep(6000);
		log("Click on Security Dialog Apply button");
		jsclick(Ok_button_SecurityDialog);
		Thread.sleep(6000);
		log("Click on Security Dialog Ok button");
		Refresh_Button();
		Thread.sleep(6000);
		log("Click on Refresh button");
		selectElement(Select_Cabinet);
		Thread.sleep(6000);
		log("Expand a Cabinet");
		selectElement(Select_Drawer);
		Thread.sleep(6000);
		log("Expand a Drawer");
		selectElement(Select_Folder);
		Thread.sleep(6000);
		log("select a Folder");
		getMoveTo_Menu_RoomName();
		Thread.sleep(6000);
		log("Mousehover to Roomname Tab");
		jsclick(Security_option);
		Thread.sleep(6000);
		log("Click on Security Option");
		jsclick(Add_Button);
		Thread.sleep(6000);
		log("Click on Security Dialog Add button");
		jsclick(cvadminsDownarrow);
		Thread.sleep(6000);
		log("Select cvadmins Group");
		jsclick(Ok_button_UserDialog);
		Thread.sleep(6000);
		log("Click on Security dialog Ok button");
		getaddvalidationmessage();
		Thread.sleep(6000);
		log("Verifying Validation message");
		jsclick(Closebutton);
		Thread.sleep(6000);
		log("Click on Close button");
		getSelect_Added_Group();
		Thread.sleep(6000);
		log("Select added Group");
		jsclick(NewEntry);
		Thread.sleep(6000);
		log("Click on New Entry button");
		getDoubleClick_CrossBar();
		Thread.sleep(6000);
		log("Assign all permission to selected Group");
		jsclick(Apply_button_SecurityDialog);
		Thread.sleep(6000);
		log("Click on Security Dialog Apply button");
		jsclick(Ok_button_SecurityDialog);
		Thread.sleep(6000);
		log("Click on Security Dialog Ok button");
		Refresh_Button();
		Thread.sleep(6000);
		log("Click on Refresh button");
		selectElement(Select_Cabinet);
		Thread.sleep(6000);
		log("Expand a Cabinet");
		selectElement(Select_Drawer);
		Thread.sleep(6000);
		log("Expand a Drawer");
		selectElement(Select_Folder);
		Thread.sleep(6000);
		log("select a Folder");
		selectElement(Select_subFolder);
		Thread.sleep(6000);
		log("select a SubFolder");
		getMoveTo_Menu_RoomName();
		Thread.sleep(6000);
		log("Mousehover to Roomname Tab");
		jsclick(Security_option);
		Thread.sleep(6000);
		log("Click on Security Option");
		jsclick(Add_Button);
		Thread.sleep(6000);
		log("Click on Security Dialog Add button");
		jsclick(cvadminsDownarrow);
		Thread.sleep(6000);
		log("Select cvadmins Group ");
		jsclick(Ok_button_UserDialog);
		Thread.sleep(6000);
		log("Click on Security dialog  Ok button");
		getaddvalidationmessage();
		Thread.sleep(6000);
		log("Verifying Validation Message");
		jsclick(Closebutton);
		Thread.sleep(6000);
		log("Click on Close button");
		getSelect_Added_Group();
		Thread.sleep(6000);
		log("Select added Group");
		jsclick(NewEntry);
		Thread.sleep(6000);
		log("Click on New Entry Tab");
		getDoubleClick_CrossBar();
		Thread.sleep(6000);
		log("Assign all Permission to Group");
		jsclick(Apply_button_SecurityDialog);
		Thread.sleep(6000);
		log("Click on Security dialog Apply button");
		jsclick(Ok_button_SecurityDialog);
		Thread.sleep(6000);
		log("Click on Security dialog Ok button");
		LogoutPage();
		LogDipakUser();
		Thread.sleep(5000);
		Refresh_Button();
		Thread.sleep(4000);
		log("Click on Refresh button");
	}

	public void Security_Dialog_Cancel_Button() throws Exception {

		log("Test Scenario 1 : Open Security Dialog And Verifying Title and Cancel button ");
		try {
			LogDipakUser();
			Thread.sleep(5000);
		} catch (Exception e) {
			System.out.println("User is already Logged");
		}
		try {
			Thread.sleep(2000);
			jsclick(CancelSecuritydialog);
		} catch (Exception e) {
			// Security dialog not open
		}
		Thread.sleep(7000);
		Refresh_Button();
		Thread.sleep(7000);
		log("Click on Refresh button");
		jsclick(Setting_Icon);
		Thread.sleep(7000);
		log("Click on Setting Icon");
		jsclick(My_Preferencesetting);
		Thread.sleep(7000);
		log("Click on My Preferences");
		getSelect_Office_document_Defaultviewing();
		Thread.sleep(7000);
		log("Select Office Document and set as Default View");
		getPdf_document_Defaultviewing();
		Thread.sleep(7000);
		log("Select Pdf Document and set as Default View");
		movingclkElement(Apply_button);
		Thread.sleep(7000);
		log("Click on Apply button");
		selectElement(Select_Cabinet);
		Thread.sleep(7000);
		log("Expand a Cabinet");
		getMoveTo_Menu_RoomName();
		Thread.sleep(7000);
		log("Mousehover to Roomname Tab");
		jsclick(Security_option);
		Thread.sleep(7000);
		log("Click on Security Option");
		log("Security dialog title Verified");
		jsclick(Cancel_Button_SecurityDialog);
		Thread.sleep(7000);
		log("Click on cancel button");
		log("Open security dialog Verifying title and cancel button successfully");
	}

	public void Added_Users_Validation() throws Exception {

		log("Test Scenario 2 : Verifying Already added  showing Validation ");
		try {
			LogDipakUser();
			Thread.sleep(5000);
		} catch (Exception e) {
			System.out.println("User is already Logged");
		}
		try {
			Thread.sleep(2000);
			jsclick(CancelSecuritydialog);
		} catch (Exception e) {
			// Security dialog not open
		}
		Refresh_Button();
		Thread.sleep(7000);
		log("Click on Refresh button");
		selectElement(Select_Cabinet);
		Thread.sleep(7000);
		log("Expand a Cabinet");
		getMoveTo_Menu_RoomName();
		Thread.sleep(7000);
		log("Mousehover to Roomname Tab");
		jsclick(Security_option);
		Thread.sleep(7000);
		log("Click on Security Option");
		jsclick(Add_Button);
		Thread.sleep(7000);
		log("Click on Security dialog Add button");
		jsclick(cvnamedDownarrow);
		Thread.sleep(7000);
		log("Select Cvnamed Group");
		jsclick(SelectcvnamedUser);
		Thread.sleep(7000);
		log("Select from Group");
		jsclick(Ok_button_UserDialog);
		Thread.sleep(7000);
		log("Click on Security Dialog Ok button");
		try {
			getaddvalidationmessage();
			Thread.sleep(7000);
			log("Verified Validation Message");
			jsclick(Closebutton);
		} catch (Exception e) {
			// Group is not already added
		}
		jsclick(Cancel_Button_SecurityDialog);
		Thread.sleep(7000);
		log("Click on Cancel button");
		log("Already added showing validation Verified");
	}

	public void Added_Group_Validation() throws Exception {
		log("Test Scenario 3 : Verifying Already added Group showing Validation ");
		try {
			LogDipakUser();
			Thread.sleep(5000);
		} catch (Exception e) {
			System.out.println("User is already Logged");
		}
		try {
			Thread.sleep(2000);
			jsclick(CancelSecuritydialog);
		} catch (Exception e) {
			// Security dialog not open
		}
		Refresh_Button();
		Thread.sleep(7000);
		log("Click on Refresh button");
		selectElement(Select_Cabinet);
		Thread.sleep(7000);
		log("Expand a Cabinet");
		getMoveTo_Menu_RoomName();
		Thread.sleep(7000);
		log("Mousehover to Roomname Tab");
		jsclick(Security_option);
		Thread.sleep(7000);
		log("Click on Security Option");
		jsclick(Add_Button);
		Thread.sleep(7000);
		log("Click on Security dialog Add button");
		jsclick(cvadminsDownarrow);
		Thread.sleep(7000);
		log("Click on cvadmins Group");
		jsclick(Ok_button_UserDialog);
		Thread.sleep(7000);
		log("Click on Ok button");
		try {
			getaddvalidationmessage();
			Thread.sleep(7000);
			log("Verifying Validation message");
			jsclick(Closebutton);
		} catch (Exception e) {
			// Group is not already added
		}
		jsclick(Cancel_Button_SecurityDialog);
		Thread.sleep(7000);
		log("Click on Cancel button");
		log("Already added Group showing validation Verified");
		Refresh_Button();
		Thread.sleep(6000);
		log("Click on Refresh button");
		
	}
}
