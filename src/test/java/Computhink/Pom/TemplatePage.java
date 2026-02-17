package Computhink.Pom;

//Dipak Automation Coading

import java.time.Duration;
import org.openqa.selenium.Alert;
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

public class TemplatePage extends Computhink.Generic.BaseClass {

	public static WebElement element = null;

	public TemplatePage() {
		PageFactory.initElements(driver, this);

	}

	// Add Soft assert

	SoftAssert softAssert = new SoftAssert();

	// Select From Document Navigator

	@FindBy(xpath = "//*[@id=\"logoutElement\"]")
	private WebElement Username;

	@FindBy(xpath = "//*[@id=\"idSidenav\"]/ul/li[1]/a")
	private WebElement Logout;

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

	@FindBy(xpath = "//*[@id=\"templateDocumentPermissions\"]/a")
	private WebElement Select_Document_Template;

	@FindBy(xpath = "//div[@id='templatePrefs']/div[2]/div[3]/div/div/div")
	private WebElement Select_Userlist;

	@FindBy(xpath = "//*[@id='templateDocDrop_popup']/div/div/span[2]")
	private WebElement Select_AllUser;

	@FindBy(xpath = "//*[@id=\"documentTemplates\"]")
	private WebElement Templates_MenuOption;

	@FindBy(xpath = "//*[@id=\"createDocuemtnLocation\"]")
	private WebElement Destination_Folder_Textbox;

	@FindBy(xpath = "//*[@id=\"navigatorTreeOk\"]")
	private WebElement OK_Button_BrowseforFolder;

	@FindBy(xpath = "//*[@id=\"docTypeList\"]")
	private WebElement Click_Document_Type_Dropdown;

	@FindBy(xpath = "//*[@id=\"viewDocumentAddPages\"]")
	private WebElement Browse_Option;

	@FindBy(xpath = "//*[@id=\"createTemplateBtn\"]")
	private WebElement Save_Template_Button;

	@FindBy(xpath = "//div[@id='addPagesDropDown']/span")
	private WebElement Move_To_PlusIcon;

	@FindBy(xpath = "//*[@id=\"createTemplateCancel\"]")
	private WebElement Template_Description_No_button;

	@FindBy(xpath = "//*[@id=\"templateName\"]")
	private WebElement Template_NameTextbox;

	@FindBy(xpath = "//*[@id=\"templateDescription\"]")
	private WebElement Template_Description_Messagebox;

	@FindBy(xpath = "//*[@id=\"createTemplateOk\"]")
	private WebElement Template_Description_OK_button;

	@FindBy(xpath = "//*[@id=\"messageContent\"]")
	private WebElement Template_Created_Message_Verify;

	@FindBy(xpath = "//*[@id=\"messageButtonOK\"]")
	private WebElement Template_Created_OK_button;

	@FindBy(xpath = "//*[@id=\"documentTemplates\"]")
	private WebElement Moveto_Templates_Option;

	@FindBy(xpath = "//*[@id='docTypeIndicesTable']/tbody[1]/tr[1]/td[2]/input[1]")
	private WebElement Select_ReportName_Test;

	@FindBy(xpath = "//a[contains(text(),'Template_Automation1')]")
	private WebElement Select_Created_Template;

	@FindBy(xpath = "//*[@id=\"createDocumentSubmit\"]")
	private WebElement Created_button;

	@FindBy(xpath = "//*[@id=\"modelHome\"]")
	private WebElement Navigate_button;

	@FindBy(xpath = "//*[@id=\"editTemplate1\"]")
	private WebElement Click_Edit_Template_Button;

	@FindBy(xpath = "//*[@id=\"editTemplateDescription\"]")
	private WebElement EditTemplate_Description_Messagebox;

	@FindBy(xpath = "//*[@id=\"editTemplateOk\"]")
	private WebElement EditTemplate_Description_OK_button;

	@FindBy(xpath = "//*[@id=\"messageContent\"]")
	private WebElement EditTemplate_Created_Message_Verify;

	@FindBy(xpath = "//*[@id=\"messageButtonOK\"]")
	private WebElement EditTemplate_Created_OK_button;

	@FindBy(xpath = "//*[@id=\"delTemp\"]")
	private WebElement Delete_Template_Button;

	@FindBy(xpath = "//*[@id=\"deleteTemplateOk\"]")
	private WebElement Delete_Template_OK_Button;

	@FindBy(xpath = "//*[@id=\"editTemplateCancel\"]")
	private WebElement EditTemplate_Description_No_button;

	@FindBy(xpath = "//*[@id=\"imgSettings\"]")
	private WebElement Setting_Icon;

	@FindBy(xpath = "//*[@id=\"myPreferencesSettingsNav\"]")
	private WebElement My_Preferencesetting;

	@FindBy(xpath = "//*[@id=\"myPreferencesSubmit\"]")
	private WebElement Apply_button;

	@FindBy(xpath = "//*[@id=\"defaultOfficeDocViewListNo\"]")
	private WebElement Select_Office_document_Defaultviewing;

	@FindBy(xpath = "//select[@id='defaultOfficeDocViewListNo']")
	private WebElement Select_Office_document_Advancedviewing;

	@FindBy(xpath = "//*[@id=\"messageContent\"]")
	private WebElement addpagesMessage;

	@FindBy(xpath = "//*[@id=\"messageButtonOK\"]")
	private WebElement CommentOKbutton;

	@FindBy(xpath = "//*[@id=\"saveTemplate\"]")
	private WebElement savetemp;

	@FindBy(xpath = "//*[@id=\"createDocumentClear\"]")
	private WebElement ClearButton;

	@FindBy(xpath = "//*[@id=\"templateErr\"]")
	private WebElement validationerror;

	@FindBy(xpath = "//*[@id=\"createDocumentSubmit\"]")
	private WebElement Createdoc;

	@FindBy(xpath = "//*[@id=\"messageContent\"]")
	private WebElement Reportvaluevalidationerror;

	@FindBy(xpath = "//*[@id=\"Word document automation.docx\"]/div/img")
	private WebElement Open_Word_page;

	@FindBy(xpath = "//*[@id=\"Excel document automation.xlsx\"]/div/img")
	private WebElement Open_Excel_page;

	@FindBy(xpath = "//*[@id=\"templateOK\"]")
	private WebElement OKButton;

	@FindBy(xpath = "//*[@id=\"messageContent\"]")
	private WebElement Filenamevalidation;

	@FindBy(xpath = "//*[@id=\"createDocumentMessage\"]")
	private WebElement NavigateDoc;

	@FindBy(xpath = "//*[@id=\"modelHome\"]")
	private WebElement NavigateButton;

	@FindBy(xpath = "//*[@id=\"messageContent\"]")
	private WebElement Formmappingvalidation;

	@FindBy(xpath = "//*[@id=\"messageButtonOK\"]")
	private WebElement FormOKbutton;

	@FindBy(xpath = "//*[@id=\"newTemplateFileName\"]")
	private WebElement Enter_Word_File_Name;

	@FindBy(xpath = "//*[@id=\"templateOK\"]")
	private WebElement TemplateOK;

	@FindBy(xpath = "//*[@id=\"addExcelFile\"]")
	private WebElement New_Excel_Spreadsheet_Option;

	@FindBy(xpath = "//*[@id=\"newTemplateFileName\"]")
	private WebElement Enter_Excel_File_Name;

	@FindBy(xpath = "//select[@id='defaultPdfDocViewListNo']")
	private WebElement Pdf_document_Advancedviewing;

	@FindBy(xpath = "//*[@id=\"addPdfFile\"]")
	private WebElement New_pdf_Document_Option;

	@FindBy(xpath = "//*[@id=\"newTemplateFileName\"]")
	private WebElement Enter_pdf_File_Name;

	@FindBy(xpath = "//*[@id=\"templateOK\"]")
	private WebElement TempOK;

	@FindBy(xpath = "//span[@id='pdfViewerDiv_formdesignerIcon']")
	private WebElement pdfViewer;

	@FindBy(xpath = "//*[@id=\"pdfViewerDiv_formdesigner_textboxIcon\"]") 
	private WebElement Textbox;

	@FindBy(xpath = "//*[@id=\"navigatorTreeCancle\"]")
	private WebElement Cancel_Button_BrowseforFolder;

	@FindBy(xpath = "//*[@id=\"formMapper\"]")
	private WebElement Click_Formmapper;

	@FindBy(xpath = "//select[@id='formField1']")
	private WebElement Select_Formfield;

	@FindBy(xpath = ("//*[@id=\"addWordFile\"]"))
	private WebElement New_Word_Document_Option;

	@FindBy(xpath = "//*[@id=\"pdfViewerDiv_pageCanvas_0\"]") 
	private WebElement Add_Textbox_Onpage;

	@FindBy(xpath = "//button[@id='setFormMapping']")
	private WebElement FormOK;

	@FindBy(xpath = "//*[@id=\"defaultPdfDocViewListNo\"]")
	private WebElement Pdf_document_Defaultviewing;

	@FindBy(xpath = "//span[@id='messageContent']")
	private WebElement Verify_DuplicateTemp_Message;

	@FindBy(xpath = "//button[@id='messageButtonOK']")
	private WebElement Okbutton;

	@FindBy(xpath = "//*[@id=\"messageButtonNo27\"]")
	private WebElement Nobutton;

	@FindBy(xpath = "//*[@id=\"commentMessage\"]")
	private WebElement FolderSelectMessage;

	@FindBy(xpath = "//*[@id=\"CommentsMessageModelOk\"]")
	private WebElement CommentOK;

	@FindBy(xpath = "//*[@id=\"messageContent\"]")
	private WebElement TemplateDeniedmessage;

	@FindBy(xpath = "//*[@id=\"messageButtonOK\"]")
	private WebElement TemplateDeniedmessageok;

	@FindBy(xpath = "//*[@id=\"templateDocumentPermissions\"]/a")
	private WebElement DocumentTempOption;
	@FindBy(xpath = "//*[@id=\"templateDocumentPermissions\"]/p")
	private WebElement DocumentTempOptionDescription;
	@FindBy(xpath = "//h3[normalize-space()='Document Templates']")
	private WebElement DocumentTemplate_Dialog;
	@FindBy(xpath = "//small[contains(text(),'*selected users and groups will have the permissio')]")
	private WebElement DocumentTemplatetext_Dialog;
	@FindBy(xpath = "//h5[normalize-space()='Users List']")
	private WebElement UserList_Dialog;
	@FindBy(xpath = "//h5[normalize-space()='Template User Permission']")
	private WebElement Template_UserPermission_Dialog;
	@FindBy(xpath = "//*[@id=\"templatePermissionApply\"]")
	private WebElement TemplateApply;
	@FindBy(xpath = "//button[@id='templatePermissionClose']")
	private WebElement TemplateClose;

	// New Word Document

	public void getNew_Word_Document_Option() {
		WebElement ele1 = New_Word_Document_Option;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele1);

	}

	public void getEnter_Word_File_Name() throws Exception {
		WebElement ele = Enter_Word_File_Name;
		ele.sendKeys(Templates_excelRead(2, 0));
		TemplateOK.click();

	}

	// New Excel Spreadsheet

	public void getNew_Excel_Spreadsheet_Option() {
		WebElement ele1 = New_Excel_Spreadsheet_Option;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele1);

	}

	public void getEnter_Excel_File_Name() throws Exception {
		WebElement ele1 = Enter_Excel_File_Name;
		ele1.sendKeys(Templates_excelRead(3, 0));
		TemplateOK.click();

	}

	public void getPdf_document_Advancedviewing() {
		Select drop = new Select(Pdf_document_Advancedviewing);
		//drop.selectByVisibleText("Advanced viewing");
		drop.selectByIndex(1);

	}

	public void getNew_pdf_Document_Option() {
		WebElement ele1 = New_pdf_Document_Option;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele1);

	}

	public void getEnter_pdf_File_Name() throws Exception {
		WebElement ele1 = Enter_pdf_File_Name;
		ele1.sendKeys(Templates_excelRead(7, 0));
		Thread.sleep(3000);
		TempOK.click();

	}

	public WebElement getAdd_Textbox_Onpage() throws Exception {
		Actions action = new Actions(driver);
		WebElement element = Add_Textbox_Onpage;
		action.dragAndDropBy(element, 200, 100).build().perform();
		return Add_Textbox_Onpage;
	}

	public void getSelect_Formfield() {
		Select sel = new Select(Select_Formfield);
		sel.selectByVisibleText("Textbox1");
	}

	public void getPdf_document_Defaultviewing() {
		Select drop = new Select(Pdf_document_Defaultviewing);
		//drop.selectByVisibleText("Default viewing");
		drop.selectByIndex(0);

	}

	public void getVerify_DuplicateTemp_Message() {
		WebElement Message = Verify_DuplicateTemp_Message;
		log(Message.getText() + " this popup message should show");

	}

	public WebElement getSelect_Document_Type_Dropdown() {
		Select drop = new Select(Click_Document_Type_Dropdown);
		drop.selectByVisibleText("CVReports");
		return Click_Document_Type_Dropdown;

	}

	public WebElement getMove_To_PlusIcon() {
		WebElement ele = Move_To_PlusIcon;
		Actions action = new Actions(driver);
		action.moveToElement(ele).build().perform();
		return ele;
	}

	public WebElement getBrowse_Option() {
		WebElement ele = Browse_Option;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele);
		return ele;
	}

	public void getTemplate_Created_Message_Verify() {

		String expectedtext = "Template Created Successfully!";
		String actualtext = Template_Created_Message_Verify.getText();
		softAssert.assertEquals(actualtext, expectedtext, "Text verification failed");
		softAssert.assertAll();
	}

	public void getMoveto_Templates_Option() {

		Actions action = new Actions(driver);
		action.moveToElement(Moveto_Templates_Option).build().perform();

	}

	public void getEditTemplate_Created_Message_Verify() {

		String expectedtext = "Template Edited Successfully!";
		String actualtext = EditTemplate_Created_Message_Verify.getText();
		softAssert.assertEquals(actualtext, expectedtext, "Text verification failed");
		softAssert.assertAll();

	}

	public void getTemplate_Denied_Message_Verify() {

		String expectedtext = "Permission to create template denied.";
		String actualtext = EditTemplate_Created_Message_Verify.getText();
		softAssert.assertEquals(actualtext, expectedtext, "Text verification failed");
		softAssert.assertAll();
	}

	public void Verify_Document_Template_OptionDescription() {

		String expectedtext = "Document Templates";
		String actualtext = DocumentTempOption.getText();
		softAssert.assertEquals(actualtext, expectedtext, "Text verification failed");

		String expectedtext1 = "Setting the document templates permission...";
		String actualtext1 = DocumentTempOptionDescription.getText();
		softAssert.assertEquals(actualtext1, expectedtext1, "Text verification failed");
		softAssert.assertAll();
	}

	public void Verify_Document_Template_AllOptions_onDialog() {

		softAssert.assertTrue(TemplateApply.isDisplayed(), "Apply button is not displayed on the page.");
		softAssert.assertTrue(TemplateApply.isEnabled(), "Apply button is not enable on the page.");
		softAssert.assertTrue(TemplateClose.isDisplayed(), "Close button is not displayed on the page.");
		softAssert.assertTrue(TemplateClose.isEnabled(), "Close button is not enable on the page.");

		String expectedtext = "Document Templates";
		String actualtext = DocumentTemplate_Dialog.getText();
		softAssert.assertEquals(actualtext, expectedtext, "Text verification failed");

		String expectedtext1 = "*selected users and groups will have the permission to create,modify and delete document templates.";
		String actualtext1 = DocumentTemplatetext_Dialog.getText();
		softAssert.assertEquals(actualtext1, expectedtext1, "Text verification failed");

		String expectedtext2 = "Users List";
		String actualtext2 = UserList_Dialog.getText();
		softAssert.assertEquals(actualtext2, expectedtext2, "Text verification failed");

		String expectedtext3 = "Template User Permission";
		String actualtext3 = Template_UserPermission_Dialog.getText();
		softAssert.assertEquals(actualtext3, expectedtext3, "Text verification failed");
		softAssert.assertAll();
	}

	public void getSelect_Office_document_Defaultviewing() {
		Select sel = new Select(Select_Office_document_Defaultviewing);
		//sel.selectByVisibleText("Default viewing");
		sel.selectByIndex(0);
	}

	public void getSelect_Office_document_Advancedviewing() {
		Select sel = new Select(Select_Office_document_Advancedviewing);
		//sel.selectByVisibleText("Advanced viewing");
		sel.selectByIndex(1);

	}

	public void getFolderSelectMessage() {

		String expectedtext = "Please select a folder to create document";
		String actualtext = FolderSelectMessage.getText();
		softAssert.assertEquals(actualtext, expectedtext);
		log(FolderSelectMessage.getText() + " this validation message should show");
		movingclkElement(CommentOK);
		softAssert.assertAll();

	}

	public void getFolder_ErrorMessage() {

		String expectedtext = "Please add pages to the template before creating!";
		String actualtext = addpagesMessage.getText();
		softAssert.assertEquals(actualtext, expectedtext, "Text verification failed");
		log(addpagesMessage.getText() + " this validation message should show");
		movingclkElement(CommentOKbutton);
		softAssert.assertAll();

	}

	public void getvalidationerror() {

		String expectedtext = "*Template name should be specified.";
		String actualtext = validationerror.getText();
		softAssert.assertEquals(actualtext, expectedtext, "Text verification failed");
		log(validationerror.getText() + " this validation message should show");
		softAssert.assertAll();

	}

	public void getReportvaluevalidationerror() {

		String expectedtext = "ReportName*   field is required";
		String actualtext = Reportvaluevalidationerror.getText();
		softAssert.assertEquals(actualtext, expectedtext, "Text verification failed");
		log(Reportvaluevalidationerror.getText() + " this validation message should show");
		jsclick(CommentOKbutton);
		softAssert.assertAll();

	}

	public void getFilenamevalidation() {

		String expectedtext = "Please enter file name";
		String actualtext = Filenamevalidation.getText();
		softAssert.assertEquals(actualtext, expectedtext, "Text verification failed");
		log(Filenamevalidation.getText() + " this validation message should show");
		jsclick(CommentOKbutton);
		softAssert.assertAll();

	}

	public void getNavigateDoc() {

		String expectedtext = "Document created successfully";
		String actualtext = NavigateDoc.getText();
		softAssert.assertEquals(actualtext, expectedtext, "Text verification failed");
		log(NavigateDoc.getText() + " this message should show");
		jsclick(NavigateButton);
		softAssert.assertAll();
	}

	public void getFormmappingvalidation() {

		String expectedtext = "Please add form fields before mapping.";
		String actualtext = Formmappingvalidation.getText();
		softAssert.assertEquals(actualtext, expectedtext);
		log(Formmappingvalidation.getText() + " this validation message should show");
		jsclick(FormOKbutton);
		softAssert.assertAll();
	}

	public void verify_to_CreateorBrowse_Template_Defaultviewing() throws Exception {

		log("Test Scenario 1 :Verifying to Create or Browse Template Default Viewing");

		try {
			LogDipakUser();
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("user alreday Logged");
		}
		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		try {
			jsclick(Cancel_Button_BrowseforFolder);
			Thread.sleep(2000);
		} catch (Exception e) {
			// Folder navigation dialog not open
		}
		Thread.sleep(6000);
		log("Click on Refresh button");
		movingclkElement(Setting_Icon);
		Thread.sleep(6000);
		log("Click on Setting Icon");
		jsclick(My_Preferencesetting);
		Thread.sleep(6000);
		log("Click on My preferences option");
		getSelect_Office_document_Defaultviewing();
		Thread.sleep(6000);
		log("Select Office Document and set Default View Option");
		getPdf_document_Defaultviewing();
		Thread.sleep(6000);
		log("Select Pdf Document and set Default View Option");
		movingclkElement(Apply_button);
		Thread.sleep(2000);
		log("Click on Apply button");
		getToastmessage();
		Refresh_Button();
		Thread.sleep(6000);
		log("Click on Refresh button");

		// Validate Template Tab

		if (Templates_MenuOption.isDisplayed()) {

			log("Template tab is displayed successfully.");
		} else {
			log("Template tab is NOT displayed.");
		}

		softAssert.assertTrue(Templates_MenuOption.isDisplayed(), "Template tab is not displayed");
		Thread.sleep(6000);
		movingclkElement(Templates_MenuOption);
		Thread.sleep(6000);
		log("Click on Template Tab");

		// If Create Template perssion is Denied then Assign Permission to User
		if (TemplateDeniedmessageok.isDisplayed() == true) {
			Thread.sleep(3000);
			log("Document Template permission is Denied for Selected User need to assign Document Template permission");
			getTemplate_Denied_Message_Verify();
			Thread.sleep(2000);
			jsclick(TemplateDeniedmessageok);
			Thread.sleep(4000);
			LogoutPage();
			LoginAdminUser();
			movingclkElement(Setting_Icon);
			Thread.sleep(3000);
			log("Click on Setting Icon");
			Verify_Document_Template_OptionDescription();
			Thread.sleep(2000);
			jsclick(Select_Document_Template);
			Thread.sleep(3000);
			log("Click on Document Template");
			Verify_Document_Template_AllOptions_onDialog();
			Thread.sleep(4000);
			movingclkElement(Select_Userlist);
			Thread.sleep(3000);
			log("Click on User List dropdown");
			movingclkElement(Select_AllUser);
			Thread.sleep(3000);
			log("Select all Users from Dropdown");
			movingclkElement(TemplateApply);
			log("Click on Apply button");
			Thread.sleep(2000);
			getToastmessage();
			LogoutPage();
			LogDipakUser();
			movingclkElement(Templates_MenuOption);
		} else {
			System.out.println("user have Template document permission");
		}
		Thread.sleep(6000);
		jsclick(Destination_Folder_Textbox);
		Thread.sleep(6000);
		log("Click on Destination Folder Textbox");
		selectElement(Select_Cabinet1);
		Thread.sleep(6000);
		log("Expand a Cabinet");
		selectElement(Select_Drawer1);
		Thread.sleep(6000);
		log("Expand a Drawer");
		selectElement(Select_Folder1);
		Thread.sleep(6000);
		log("select a Folder");
		jsclick(OK_Button_BrowseforFolder);
		Thread.sleep(6000);
		log("Click on Ok button");
		movingclkElement(Move_To_PlusIcon);
		getBrowse_Option();
		Thread.sleep(2000);
		log("Browse Document page");
		Runtime.getRuntime().exec("D:\\DipakAutoit\\FileUploadScriptpdf.exe");
		Thread.sleep(6000);
		try {
			WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait2.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		log("By using AutoIT add file from external folder");
		jsclick(getSelect_Document_Type_Dropdown());
		Thread.sleep(8000);
		log("Select Value from Document type Dropdown");
		Select_ReportName_Test.sendKeys(Templates_excelRead(1, 0));
		log("Enter value into Report Name field");
		Thread.sleep(8000);
		movingclkElement(Move_To_PlusIcon);
		getBrowse_Option();
		Thread.sleep(3000);
		log("Browse Document page");
		Runtime.getRuntime().exec("D:\\DipakAutoit\\FileUploadScript.exe");
		Thread.sleep(6000);
		jsclick(Save_Template_Button);
		log("Click on Save Template button");
		log("Save Template button clicked successfully");
		jsclick(Template_Description_No_button);
		Thread.sleep(6000);
		log("Click on Template Description dialog No button");
		jsclick(Save_Template_Button);
		Thread.sleep(6000);
		log("Click again on Save Template button");
		jsclick(Template_NameTextbox);
		Thread.sleep(6000);
		log("Click on Template Name Textbox");
		Template_NameTextbox.sendKeys(Templates_excelRead(4, 0));
		Thread.sleep(6000);
		log("Enter value into Template Name field ");
		jsclick(Template_Description_Messagebox);
		Thread.sleep(6000);
		log("Click on Template Description Textbox");
		Template_Description_Messagebox.sendKeys(Templates_excelRead(5, 0));
		Thread.sleep(6000);
		log("Enter Template Description message");
		jsclick(Template_Description_OK_button);
		Thread.sleep(6000);
		log("Click on Template Description Yes button");

		if (driver.getPageSource()
				.contains("Template already exists with the same name.Please try creating with a different name.")) {
			System.out.println("Same name Template alreday exist we need to Create another name Template");

			// Delete Existing Template and create new

			jsclick(Template_Created_OK_button);
			Thread.sleep(6000);
			getMoveto_Templates_Option();
			Thread.sleep(6000);
			log("Mousehover to Template Tab");
			movingclkElement(Select_Created_Template);
			log("Select Created Template Page");
			try {
				WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
				wait2.until(ExpectedConditions.alertIsPresent());
				Alert alt = driver.switchTo().alert();
				alt.accept();
			} catch (Exception e) {
				System.out.println("Alert is not present...");
			}
			Thread.sleep(6000);
			log("Created Template page open successfully");
			jsclick(Delete_Template_Button);
			Thread.sleep(6000);
			log("Click on Delete Template Fab Option");
			jsclick(Delete_Template_OK_Button);
			Thread.sleep(6000);
			log("Click on Delete Template Dialog Ok button");
			log("Template Deleted Successfully");
			Refresh_Button();
			Thread.sleep(6000);
			log("Click on Refresh button");
			movingclkElement(Templates_MenuOption);
			Thread.sleep(6000);
			log("Click on Template Tab");
			jsclick(Destination_Folder_Textbox);
			Thread.sleep(6000);
			log("Click on Destination Folder Textbox");
			selectElement(Select_Cabinet1);
			Thread.sleep(6000);
			log("Expand a Cabinet");
			selectElement(Select_Drawer1);
			Thread.sleep(6000);
			log("Expand a Drawer");
			selectElement(Select_Folder1);
			Thread.sleep(6000);
			log("select a Folder");
			jsclick(OK_Button_BrowseforFolder);
			Thread.sleep(9000);
			log("Click on Ok button");
			jsclick(getSelect_Document_Type_Dropdown());
			Thread.sleep(8000);
			log("Select Value from Document type Dropdown");
			Select_ReportName_Test.sendKeys(Templates_excelRead(1, 0));
			log("Enter value into Report Name field");
			Thread.sleep(8000);
			movingclkElement(Move_To_PlusIcon);
			getBrowse_Option();
			Thread.sleep(3000);
			log("Browse Document page");
			Runtime.getRuntime().exec("D:\\DipakAutoit\\FileUploadScriptpdf.exe");
			Thread.sleep(6000);
			try {
				WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
				wait2.until(ExpectedConditions.alertIsPresent());
				Alert alt = driver.switchTo().alert();
				alt.accept();
			} catch (Exception e) {
				System.out.println("Alert is not present...");
			}
			log("By using AutoIT add file from external folder");
			Thread.sleep(6000);
			movingclkElement(Move_To_PlusIcon);
			Thread.sleep(2000);
			getBrowse_Option();
			Thread.sleep(3000);
			log("Browse Document page");
			Runtime.getRuntime().exec("D:\\DipakAutoit\\FileUploadScript.exe");
			Thread.sleep(6000);
			jsclick(Save_Template_Button);
			log("Click on Save Template button");
			log("Save Template button clicked successfully");
			Thread.sleep(6000);
			jsclick(Template_NameTextbox);
			Thread.sleep(6000);
			log("Click on Template Name Textbox");
			Template_NameTextbox.sendKeys(Templates_excelRead(4, 0));
			Thread.sleep(6000);
			log("Enter value into Template Name field ");
			jsclick(Template_Description_Messagebox);
			Thread.sleep(6000);
			log("Click on Template Description Textbox");
			Template_Description_Messagebox.sendKeys(Templates_excelRead(5, 0));
			Thread.sleep(6000);
			log("Enter Template Description message");
			jsclick(Template_Description_OK_button);
			Thread.sleep(6000);
			log("Click on Template Description Yes button");

		} else {
			System.out.println("Template Created succesfully");
		}

		Thread.sleep(6000);
		getTemplate_Created_Message_Verify();
		Thread.sleep(6000);
		log("Verifying Template Created succesfully Message");
		jsclick(Template_Created_OK_button);
		Thread.sleep(6000);
		log("Click on Ok button");
		log("Verifying to CreateorBrowse Template Defaultviewing");

	}

	public void Verify_to_Edit_and_Delete_DefaultTemplate() throws Exception {

		log("Test Scenario 2: Verifying to  Edit and Delete Default Template");

		try {
			LogDipakUser();
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("user alreday Logged");
		}
		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		try {
			jsclick(Cancel_Button_BrowseforFolder);
			Thread.sleep(2000);
		} catch (Exception e) {
			// Folder navigation dialog not open
		}

		getMoveto_Templates_Option();
		Thread.sleep(6000);
		log("Mousehover to Template Tab");
		movingclkElement(Select_Created_Template);
		log("Select Created Template Page");
		try {
			WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait2.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Thread.sleep(6000);
		log("Created Template page open successfully");
		jsclick(Click_Edit_Template_Button);
		Thread.sleep(6000);
		log("Click on Edit Template Fab Option");
		EditTemplate_Description_Messagebox.clear();
		Thread.sleep(6000);
		log("Click on Edit Template Description Textbox");
		EditTemplate_Description_Messagebox.sendKeys(Templates_excelRead(6, 0));
		Thread.sleep(6000);
		log("Enter Message under Description Box");
		jsclick(EditTemplate_Description_OK_button);
		Thread.sleep(6000);
		log("Click on Edit Template Dialog Ok button");
		getEditTemplate_Created_Message_Verify();
		log("Template edited successfully");
		jsclick(EditTemplate_Created_OK_button);
		Thread.sleep(6000);
		log("Click on Template Edited Succesfully Ok button");
		getMoveto_Templates_Option();
		Thread.sleep(6000);
		log("Mousehover to Template Tab");
		movingclkElement(Select_Created_Template);
		Thread.sleep(6000);
		log("Select Created Template Page");
		try {
			WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait3.until(ExpectedConditions.alertIsPresent());
			Alert alt1 = driver.switchTo().alert();
			alt1.accept();
		} catch (Exception e) {
			// Alert not present
		}
		jsclick(Delete_Template_Button);
		Thread.sleep(6000);
		log("Click on Delete Template Fab Option");
		jsclick(Delete_Template_OK_Button);
		log("Click on Delete Template Dialog Ok button");
		log("Template Deleted Successfully");

	}

	public void verify_CreateorBrowse_Template_Advancedviewing_Officedoc() throws Exception {

		log("Test Scenario 3: Verifying to  Create or Browse Template In Advanced Viewing");

		try {
			LogDipakUser();
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("user alreday Logged");
		}
		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		try {
			jsclick(Cancel_Button_BrowseforFolder);
			Thread.sleep(2000);
		} catch (Exception e) {
			// Folder navigation dialog not open
		}

		movingclkElement(Setting_Icon);
		Thread.sleep(6000);
		log("Click on Setting Icon");
		jsclick(My_Preferencesetting);
		Thread.sleep(6000);
		log("Click on My Preferences Option");
		getSelect_Office_document_Advancedviewing();
		Thread.sleep(6000);
		log("Select Office Document and set Advanced View Option");
		movingclkElement(Apply_button);
		Thread.sleep(2000);
		log("Click on Apply button");
		getToastmessage();
		Refresh_Button();
		Thread.sleep(6000);
		log("Click on Refresh button");
		jsclick(Templates_MenuOption);
		Thread.sleep(6000);
		log("Click on Template Tab");
		jsclick(Destination_Folder_Textbox);
		Thread.sleep(6000);
		log("Click on Destination Folder Textbox");
		selectElement(Select_Cabinet1);
		Thread.sleep(6000);
		log("Expand a Cabinet");
		selectElement(Select_Drawer1);
		Thread.sleep(6000);
		log("Expand a Drawer");
		selectElement(Select_Folder1);
		Thread.sleep(6000);
		log("selecta  Folder");
		jsclick(OK_Button_BrowseforFolder);
		Thread.sleep(6000);
		log("Click on Ok button of Browse for folder Dialog");
		jsclick(getSelect_Document_Type_Dropdown());
		Thread.sleep(8000);
		log("Select Value from Document Type Dropdown ");
		Select_ReportName_Test.sendKeys(Templates_excelRead(1, 0));
		log("Enter value into Report Name field");
		Thread.sleep(8000);
		movingclkElement(Move_To_PlusIcon);
		getBrowse_Option();
		Thread.sleep(3000);
		log("Browse Document page");
		Runtime.getRuntime().exec("D:\\DipakAutoit\\OfficeDoc\\FileUploadOfficedoc.exe");
		log("By using AutoIT add file from external folder");
		Thread.sleep(8000);
		jsclick(Save_Template_Button);
		log("Click on Save Template button");
		jsclick(Template_Description_No_button);
		Thread.sleep(6000);
		log("Click on Template Description Dialog No button");
		jsclick(Save_Template_Button);
		Thread.sleep(6000);
		log("Click again on Save Template button");
		jsclick(Template_NameTextbox);
		Thread.sleep(6000);
		log("Click on Template Name Textbox");
		Template_NameTextbox.sendKeys(Templates_excelRead(4, 0));
		Thread.sleep(6000);
		log("Enter Name under Template Name Textbox");
		jsclick(Template_Description_Messagebox);
		Thread.sleep(6000);
		log("Click on Template Description Messagebox");
		Template_Description_Messagebox.sendKeys(Templates_excelRead(5, 0));
		Thread.sleep(6000);
		log("Enter Template Description Message Under Description box");
		jsclick(Template_Description_OK_button);
		Thread.sleep(6000);
		log("Click on Template Description box Ok button");
		getTemplate_Created_Message_Verify();
		Thread.sleep(6000);
		log("Verifying Template created successfully Message");
		jsclick(Template_Created_OK_button);
		log("Click on Template Created Ok button");
		log("Verifying to CreateorBrowse Officedoc Template advancedviewing");

	}

	public void Verify_to_Edit_and_Delete_AdvancedTemplate_Officedoc() throws Exception {

		log("Test Scenario 4: Verifying to  Edit and Delete Advanced View Officedocument");
		try {
			LogDipakUser();
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("user alreday Logged");
		}
		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		try {
			jsclick(Cancel_Button_BrowseforFolder);
			Thread.sleep(2000);
		} catch (Exception e) {
			// Folder navigation dialog not open
		}

		getMoveto_Templates_Option();
		Thread.sleep(6000);
		log("Mousehover to Template Tab");
		movingclkElement(Select_Created_Template);
		Thread.sleep(6000);
		log("Select Created Template page");
		try {
			WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait3.until(ExpectedConditions.alertIsPresent());
			Alert alt1 = driver.switchTo().alert();
			alt1.accept();
		} catch (Exception e) {
			// Alert not present
		}
		jsclick(Click_Edit_Template_Button);
		Thread.sleep(6000);
		log("Click on Edit Template Fab button");
		EditTemplate_Description_Messagebox.clear();
		Thread.sleep(6000);
		log("Click on Edit Template Description Messagebox ");
		EditTemplate_Description_Messagebox.sendKeys(Templates_excelRead(6, 0));
		Thread.sleep(6000);
		log("Enter Message under Edit Template Description Messagebox");
		jsclick(EditTemplate_Description_OK_button);
		Thread.sleep(6000);
		log("Click on Ok button");
		getEditTemplate_Created_Message_Verify();
		log("Template edited successfully");
		jsclick(EditTemplate_Created_OK_button);
		Thread.sleep(6000);
		log("Click on Template Edited successfully dialog Ok button");
		getMoveto_Templates_Option();
		Thread.sleep(6000);
		log("Mousehover to Template Tab");
		movingclkElement(Select_Created_Template);
		Thread.sleep(6000);
		log("Select Created Template page");
		try {
			WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait3.until(ExpectedConditions.alertIsPresent());
			Alert alt1 = driver.switchTo().alert();
			alt1.accept();
		} catch (Exception e) {
			// Alert not present
		}
		jsclick(Delete_Template_Button);
		Thread.sleep(6000);
		log("Click on Delete Template Fab button");
		jsclick(Delete_Template_OK_Button);
		log("Template Deleted Successfully");

	}

	public void verify_to_Create_Formmapping_PDFTemplate_Advancedviewing() throws Exception {

		log("Test Scenario 5: Verifying to  Create Form mapping in Advanced viewing");
		try {
			LogDipakUser();
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("user alreday Logged");
		}
		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		try {
			jsclick(Cancel_Button_BrowseforFolder);
			Thread.sleep(2000);
		} catch (Exception e) {
			// Folder navigation dialog not open
		}

		movingclkElement(Setting_Icon);
		Thread.sleep(6000);
		log("Click on Setting Icon");
		jsclick(My_Preferencesetting);
		Thread.sleep(6000);
		log("Click on My Preferences Option");
		getPdf_document_Advancedviewing();
		Thread.sleep(6000);
		log("Select Pdf Document and set Advanced view Option");
		movingclkElement(Apply_button);
		Thread.sleep(2000);
		log("Click on Apply button");
		getToastmessage();
		Refresh_Button();
		Thread.sleep(6000);
		jsclick(Templates_MenuOption);
		Thread.sleep(6000);
		log("Click on Template Tab");
		jsclick(Destination_Folder_Textbox);
		Thread.sleep(6000);
		log("Click on Destination Folder Textbox");
		selectElement(Select_Cabinet1);
		Thread.sleep(6000);
		log("Expand a Cabinet");
		selectElement(Select_Drawer1);
		Thread.sleep(6000);
		log("Expand a Drawer");
		selectElement(Select_Folder1);
		Thread.sleep(6000);
		log("Folder is selected for Templates");
		jsclick(OK_Button_BrowseforFolder);
		Thread.sleep(6000);
		log("Click on Ok button");
		jsclick(getSelect_Document_Type_Dropdown());
		Thread.sleep(8000);
		log("Select value from Document type dropdown");
		Select_ReportName_Test.sendKeys(Templates_excelRead(1, 0));
		Thread.sleep(8000);
		log("Enter value into Report Name field");
		movingclkElement(Move_To_PlusIcon);
		Thread.sleep(2000);
		getNew_pdf_Document_Option();
		Thread.sleep(4000);
		log("Browse Document Page");
		getEnter_pdf_File_Name();
		Thread.sleep(4000);
		log("Enter Pdf file Name");
		jsclick(pdfViewer);
		Thread.sleep(6000);
		log("Click on PdfViewer menu option");

		Actions act = new Actions(driver);
		act.click(Textbox).moveToElement(Add_Textbox_Onpage).click().build().perform();

		Thread.sleep(6000);
		log("Select and Add Textbox on  Page");
		jsclick(Click_Formmapper);
		Thread.sleep(6000);
		log("Click on Form mapping Option");
		getSelect_Formfield();
		Thread.sleep(6000);
		log("Select Form field");
		jsclick(FormOK);
		Thread.sleep(6000);
		log("Click on  Ok button");
		jsclick(Save_Template_Button);
		Thread.sleep(6000);
		log("Click on Save Template button");
		jsclick(Template_NameTextbox);
		Thread.sleep(6000);
		log("Click on Template Name Textbox");
		Template_NameTextbox.sendKeys(Templates_excelRead(4, 0));
		Thread.sleep(6000);
		log("Enter value into Template Name field");
		jsclick(Template_Description_Messagebox);
		Thread.sleep(6000);
		log("Click on  Template Description Messagebox");
		Template_Description_Messagebox.sendKeys(Templates_excelRead(5, 0));
		Thread.sleep(6000);
		log("Enter Description Message into Description field");
		jsclick(Template_Description_OK_button);
		Thread.sleep(6000);
		log("Click on Ok button");
		getTemplate_Created_Message_Verify();
		Thread.sleep(6000);
		log("Template Created Successfully");
		jsclick(Template_Created_OK_button);
		log("Verifying to CreateorBrowse Formmapping Template advancedviewing");
		Thread.sleep(6000);
	}

	public void Verify_to_Edit_and_Delete_Formfield() throws Exception {

		log("Test Scenario 6: Verifying to  Edit and Delete Form field");
		try {
			LogDipakUser();
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("user alreday Logged");
		}
		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		try {
			jsclick(Cancel_Button_BrowseforFolder);
			Thread.sleep(2000);
		} catch (Exception e) {
			// Folder navigation dialog not open
		}

		Thread.sleep(6000);
		getMoveto_Templates_Option();
		Thread.sleep(6000);
		log("Click on Template Tab");
		movingclkElement(Select_Created_Template);
		Thread.sleep(6000);
		log("Select Created Template Document page");
		try {
			WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait3.until(ExpectedConditions.alertIsPresent());
			Alert alt1 = driver.switchTo().alert();
			alt1.accept();
		} catch (Exception e) {
			// Alert not present
		}
		jsclick(Click_Edit_Template_Button);
		Thread.sleep(6000);
		log("Click on Edit Template Fab button");
		EditTemplate_Description_Messagebox.clear();
		Thread.sleep(6000);
		log("Clik on Edit Template Description Messagebox");
		EditTemplate_Description_Messagebox.sendKeys(Templates_excelRead(6, 0));
		Thread.sleep(6000);
		log("Enter Description Message into Description field");
		jsclick(EditTemplate_Description_OK_button);
		Thread.sleep(6000);
		log("Click on Ok button");
		getEditTemplate_Created_Message_Verify();
		log("Template edited successfully");
		jsclick(EditTemplate_Created_OK_button);
		Thread.sleep(6000);
		log("Click on Ok button");
		getMoveto_Templates_Option();
		Thread.sleep(6000);
		log("Click on Template Tab");
		movingclkElement(Select_Created_Template);
		Thread.sleep(6000);
		log("Select Created Template page");
		try {
			WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait3.until(ExpectedConditions.alertIsPresent());
			Alert alt1 = driver.switchTo().alert();
			alt1.accept();
		} catch (Exception e) {
			// Alert not present
		}
		jsclick(Delete_Template_Button);
		Thread.sleep(6000);
		log("Click on Delete Template Fab button");
		jsclick(Delete_Template_OK_Button);
		log("Formmapping Template Deleted Successfully");

	}

	public void Set_Defaultview() throws Exception {

		log("Test Scenario 7: Set Office and Pdf document option in Default view");
		try {
			LogDipakUser();
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("user alreday Logged");
		}
		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		try {
			jsclick(Cancel_Button_BrowseforFolder);
			Thread.sleep(2000);
		} catch (Exception e) {
			// Folder navigation dialog not open
		}

		movingclkElement(Setting_Icon);
		Thread.sleep(6000);
		log("Click on Setting Icon");
		jsclick(My_Preferencesetting);
		Thread.sleep(6000);
		log("Click on My Preferences Option");
		getSelect_Office_document_Defaultviewing();
		Thread.sleep(6000);
		log("Select Office Documentand set Default View Option");
		getPdf_document_Defaultviewing();
		Thread.sleep(6000);
		log("Select PdfDocument and set Default View Option");
		movingclkElement(Apply_button);
		Thread.sleep(2000);
		log("Click on Apply button");
		getToastmessage();
		Refresh_Button();
		Thread.sleep(6000);
		log("Click on Refresh button");
	}

	public void Login_Template_permissionassign_User_and_verify_message_Select_Folder_ToCreateDoc() throws Exception {

		log("Test Scenario 1 : Verifying message Select Folder To Create Document ");

		try {
			LogDipakUser();
			Thread.sleep(6000);
		} catch (Exception e) {
			log(" user alreday Logged");
		}
		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		try {
			jsclick(Cancel_Button_BrowseforFolder);
			Thread.sleep(2000);
		} catch (Exception e) {
			// Folder navigation dialog not open
		}

		movingclkElement(Setting_Icon);
		Thread.sleep(6000);
		log("Click on Setting Icon");
		jsclick(My_Preferencesetting);
		Thread.sleep(6000);
		log("Click on My Preferences Option");
		getSelect_Office_document_Defaultviewing();
		Thread.sleep(6000);
		log("Select Office Documnet and set as Default view");
		getPdf_document_Defaultviewing();
		Thread.sleep(6000);
		log("Select Pdf Documnet and set as Default view");
		movingclkElement(Apply_button);
		Thread.sleep(2000);
		log("Click on Apply button");
		getToastmessage();
		Refresh_Button();
		Thread.sleep(6000);
		log("Click on Refresh button");

		// Validate Template Tab

		if (Templates_MenuOption.isDisplayed()) {

			log("Search tab is displayed successfully.");
		} else {
			log("Search tab is NOT displayed.");
		}

		softAssert.assertTrue(Templates_MenuOption.isDisplayed(), "Template tab is not displayed");
		Thread.sleep(6000);
		jsclick(Templates_MenuOption);
		Thread.sleep(3000);
		log("Click on Template Tab");

		// If Create Template perssion is Denied then Assign Permission to User
		if (TemplateDeniedmessageok.isDisplayed() == true) {
			Thread.sleep(3000);
			getTemplate_Denied_Message_Verify();
			Thread.sleep(2000);
			jsclick(TemplateDeniedmessageok);
			Thread.sleep(4000);
			LogoutPage();
			LoginAdminUser();
			movingclkElement(Setting_Icon);
			Thread.sleep(3000);
			log("Click on Setting Icon");
			Verify_Document_Template_OptionDescription();
			Thread.sleep(2000);
			jsclick(Select_Document_Template);
			Thread.sleep(3000);
			log("Click on Document Template");
			Verify_Document_Template_AllOptions_onDialog();
			Thread.sleep(4000);
			movingclkElement(Select_Userlist);
			Thread.sleep(3000);
			log("Click on User List dropdown");
			movingclkElement(Select_AllUser);
			Thread.sleep(3000);
			log("Select all Users from Dropdown");
			movingclkElement(TemplateApply);
			Thread.sleep(2000);
			log("Click on Apply button");
			getToastmessage();
			LogoutPage();
			LogDipakUser();
			movingclkElement(Templates_MenuOption);
		} else {
			System.out.println("user have Template document permission");
		}

		jsclick(Destination_Folder_Textbox);
		Thread.sleep(6000);
		log("Click on Destination Folder TextBox");
		jsclick(OK_Button_BrowseforFolder);
		Thread.sleep(6000);
		log("Click on Ok button");
		getFolderSelectMessage();
		Thread.sleep(6000);
		log("Verified Select Folder Validation message");
		selectElement(Select_Cabinet1);
		Thread.sleep(6000);
		log("Expand a Cabinet");
		jsclick(OK_Button_BrowseforFolder);
		Thread.sleep(6000);
		log("Click on Ok button");
		getFolderSelectMessage();
		Thread.sleep(6000);
		log("Verified Select Folder Validation message");
		selectElement(Select_Drawer1);
		Thread.sleep(6000);
		log("Expand a Drawer");
		jsclick(OK_Button_BrowseforFolder);
		Thread.sleep(6000);
		log("Click on Ok button");
		getFolderSelectMessage();
		Thread.sleep(6000);
		log("Verified Select Folder validation message");
		selectElement(Select_Folder1);
		Thread.sleep(6000);
		log(" select a Folder");
		log("Folder is selected for Templates");
		jsclick(OK_Button_BrowseforFolder);
		log("Click on Ok button");
		Thread.sleep(6000);
	}

	public void verify_message_addPages_Using_SaveandClearButton() throws Exception {

		log("Test Scenario 2 : Verifying message add Pages Using Save and Clear button ");

		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		try {
			jsclick(Cancel_Button_BrowseforFolder);
			Thread.sleep(2000);
		} catch (Exception e) {
			// Folder navigation dialog not open
		}
		Thread.sleep(6000);
		jsclick(Save_Template_Button);
		Thread.sleep(6000);
		log("Click on Save Template button");
		getFolder_ErrorMessage();
		Thread.sleep(6000);
		log("Verified Error message");
		jsclick(savetemp);
		Thread.sleep(6000);
		log("Click on Save Template button");
		getFolder_ErrorMessage();
		Thread.sleep(6000);
		log("Verified Error message");
		jsclick(ClearButton);
		Thread.sleep(6000);
		log("Click on Clear button");
		jsclick(Save_Template_Button);
		Thread.sleep(6000);
		log("Click on Save Template button");
		getFolder_ErrorMessage();
		Thread.sleep(6000);
		log("Verified Error message");
		jsclick(savetemp);
		Thread.sleep(6000);
		log("Click on Save Template button");
		getFolder_ErrorMessage();
		Thread.sleep(6000);
		log("Verified Error message");
		log("Add pages message verified");
	}

	public void Verify_TextboxName_and_Templatename_validation() throws Exception {

		log("Test Scenario 3 : Verifying Textbox Name and Templatename validation ");

		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		try {
			jsclick(Cancel_Button_BrowseforFolder);
			Thread.sleep(2000);
		} catch (Exception e) {
			// Folder navigation dialog not open
		}
		Thread.sleep(6000);
		jsclick(getSelect_Document_Type_Dropdown());
		Thread.sleep(3000);
		log("Select Value from Document type Dropdown");
		movingclkElement(Move_To_PlusIcon);
		Thread.sleep(1000);
		getBrowse_Option();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\FileUploadScriptpdf.exe");
		Thread.sleep(6000);
		try {
			WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait2.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Thread.sleep(6000);
		log("By using AutoIT add file from external folder");
		jsclick(Save_Template_Button);
		Thread.sleep(6000);
		log("Click on Save Template button");
		jsclick(Template_Description_OK_button);
		Thread.sleep(6000);
		log("Click on Template Description Ok button");
		getvalidationerror();
		Thread.sleep(6000);
		log("Verified Validation error message");
		jsclick(Template_NameTextbox);
		Thread.sleep(6000);
		log("Click on Template Name Textbox");
		Template_NameTextbox.sendKeys(Templates_excelRead(4, 0));
		Thread.sleep(6000);
		log("Enter Value Template Name Name Textbox");
		jsclick(Template_Description_OK_button);
		Thread.sleep(6000);
		log("Click on Ok button");

		if (driver.getPageSource()
				.contains("Template already exists with the same name.Please try creating with a different name.")) {
			System.out.println("Same name Template alreday exist we need to Create another name Template");

			// Delete Existing Template and create new

			jsclick(Template_Created_OK_button);
			Thread.sleep(6000);
			getMoveto_Templates_Option();
			Thread.sleep(6000);
			log("Mousehover to Template Tab");
			movingclkElement(Select_Created_Template);
			log("Select Created Template Page");
			try {
				WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
				wait2.until(ExpectedConditions.alertIsPresent());
				Alert alt = driver.switchTo().alert();
				alt.accept();
			} catch (Exception e) {
				System.out.println("Alert is not present...");
			}
			Thread.sleep(6000);
			log("Created Template page open successfully");
			jsclick(Delete_Template_Button);
			Thread.sleep(6000);
			log("Click on Delete Template Fab Option");
			jsclick(Delete_Template_OK_Button);
			Thread.sleep(6000);
			log("Click on Delete Template Dialog Ok button");
			log("Template Deleted Successfully");
			Refresh_Button();
			Thread.sleep(6000);
			log("Click on Refresh button");
			movingclkElement(Templates_MenuOption);
			Thread.sleep(6000);
			log("Click on Template Tab");
			jsclick(Destination_Folder_Textbox);
			Thread.sleep(6000);
			log("Click on Destination Folder Textbox");
			selectElement(Select_Cabinet1);
			Thread.sleep(6000);
			log("Expand a Cabinet");
			selectElement(Select_Drawer1);
			Thread.sleep(6000);
			log("Expand a Drawer");
			selectElement(Select_Folder1);
			Thread.sleep(6000);
			log("select a Folder");
			jsclick(OK_Button_BrowseforFolder);
			Thread.sleep(9000);
			log("Click on Ok button");
			jsclick(getSelect_Document_Type_Dropdown());
			Thread.sleep(3000);
			log("Select Value from Document type Dropdown");
			movingclkElement(Move_To_PlusIcon);
			Thread.sleep(1000);
			getBrowse_Option();
			Thread.sleep(3000);
			log("Browse Document page");
			Runtime.getRuntime().exec("D:\\DipakAutoit\\FileUploadScriptpdf.exe");
			Thread.sleep(6000);
			try {
				WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
				wait2.until(ExpectedConditions.alertIsPresent());
				Alert alt = driver.switchTo().alert();
				alt.accept();
			} catch (Exception e) {
				System.out.println("Alert is not present...");
			}
			log("By using AutoIT add file from external folder");
			Thread.sleep(6000);
			movingclkElement(Move_To_PlusIcon);
			Thread.sleep(1000);
			getBrowse_Option();
			Thread.sleep(2000);
			log("Browse Document page");
			Runtime.getRuntime().exec("D:\\DipakAutoit\\FileUploadScript.exe");
			Thread.sleep(6000);
			jsclick(Save_Template_Button);
			log("Click on Save Template button");
			log("Save Template button clicked successfully");
			Thread.sleep(6000);
			jsclick(Template_NameTextbox);
			Thread.sleep(6000);
			log("Click on Template Name Textbox");
			Template_NameTextbox.sendKeys(Templates_excelRead(4, 0));
			Thread.sleep(6000);
			log("Enter value into Template Name field ");
			jsclick(Template_Description_Messagebox);
			Thread.sleep(6000);
			log("Click on Template Description Textbox");
			Template_Description_Messagebox.sendKeys(Templates_excelRead(5, 0));
			Thread.sleep(6000);
			log("Enter Template Description message");
			jsclick(Template_Description_OK_button);
			Thread.sleep(6000);
			log("Click on Template Description Yes button");

		} else {
			System.out.println("Template Created succesfully");
		}

		getTemplate_Created_Message_Verify();
		Thread.sleep(6000);
		log("Verified Template created successfully");
		jsclick(Template_Created_OK_button);
		Thread.sleep(6000);
		log("Click on Ok button");
		getMoveto_Templates_Option();
		Thread.sleep(6000);
		log("Mousehover to Template Tab");
		movingclkElement(Select_Created_Template);
		Thread.sleep(6000);
		log("Select Created Template from Template Tab");
		try {
			WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait3.until(ExpectedConditions.alertIsPresent());
			Alert alt1 = driver.switchTo().alert();
			alt1.accept();
		} catch (Exception e) {
			// Alert not present
		}
		jsclick(Createdoc);
		Thread.sleep(6000);
		log("Click on Create button");
		getReportvaluevalidationerror();
		Thread.sleep(6000);
		log("Verified validation Error");
		jsclick(Delete_Template_Button);
		Thread.sleep(6000);
		log("Click on Delete Template Fab button");
		jsclick(Delete_Template_OK_Button);
		log("Template Deleted Successfully");
		log("Texbox and Template name validate");
	}

	public void Verify_validation_Duplicate_Template_Created() throws Exception {

		log("Test Scenario 4 : Verifying validation Duplicate Template Created ");
		try {
			LogDipakUser();
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("user alreday Logged");
		}
		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		try {
			jsclick(Cancel_Button_BrowseforFolder);
			Thread.sleep(2000);
		} catch (Exception e) {
			// Folder navigation dialog not open
		}
		Thread.sleep(6000);
		Refresh_Button();
		Thread.sleep(6000);
		movingclkElement(Setting_Icon);
		Thread.sleep(6000);
		log("Click on Setting Icon");
		jsclick(My_Preferencesetting);
		Thread.sleep(6000);
		log("Click on My Preferences Option");
		getSelect_Office_document_Defaultviewing();
		Thread.sleep(6000);
		log("Select Office Document and set as Default View");
		getPdf_document_Defaultviewing();
		Thread.sleep(6000);
		log("Select PdfC Document and set as Default View");
		movingclkElement(Apply_button);
		Thread.sleep(4000);
		log("Click on Apply button");
		getToastmessage();
		Thread.sleep(4000);
		Refresh_Button();
		Thread.sleep(6000);
		log("Click on Refresh button");
		jsclick(Templates_MenuOption);
		Thread.sleep(6000);
		log("Click on Template Tab");
		jsclick(Destination_Folder_Textbox);
		Thread.sleep(6000);
		log("Click on Destination Folder Textbox");
		selectElement(Select_Cabinet1);
		Thread.sleep(6000);
		log("Expand a Cabinet");
		selectElement(Select_Drawer1);
		Thread.sleep(6000);
		log("Expand a Drawer");
		selectElement(Select_Folder1);
		Thread.sleep(6000);
		log("Folder is selected for Templates");
		jsclick(OK_Button_BrowseforFolder);
		Thread.sleep(6000);
		log("Click on Ok button");
		jsclick(getSelect_Document_Type_Dropdown());
		Thread.sleep(6000);
		log("Select Document type dropdown");
		jsclick(Select_ReportName_Test);
		Thread.sleep(3000);
		log("Click on Report Name textbox");
		Select_ReportName_Test.sendKeys(Templates_excelRead(1, 0));
		log("Enter Report value into ReportName textbox");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(Move_To_PlusIcon));
		movingclkElement(Move_To_PlusIcon);
		Thread.sleep(1000);
		getBrowse_Option();
		Thread.sleep(3000);
		log("Browse a Document Page");
		Runtime.getRuntime().exec("D:\\DipakAutoit\\FileUploadScriptpdf.exe");
		Thread.sleep(6000);
		try {
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		log("By using AutoIT add file from external folder");
		Thread.sleep(2000);
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait2.until(ExpectedConditions.elementToBeClickable(Move_To_PlusIcon));
		movingclkElement(Move_To_PlusIcon);
		Thread.sleep(1000);
		getBrowse_Option();
		Thread.sleep(3000);
		log("Browse a Document Page");
		Runtime.getRuntime().exec("D:\\DipakAutoit\\FileUploadScript.exe");
		Thread.sleep(6000);
		jsclick(Save_Template_Button);
		log("By using AutoIT add file from external folder");
		jsclick(Template_Description_No_button);
		Thread.sleep(6000);
		log("Click on Template Description No button");
		jsclick(Save_Template_Button);
		Thread.sleep(6000);
		log("Click on Save Template button");
		jsclick(Template_NameTextbox);
		Thread.sleep(6000);
		log("Click on Template Name textbox");
		Template_NameTextbox.sendKeys(Templates_excelRead(4, 0));
		Thread.sleep(6000);
		log("Enter Template Name");
		jsclick(Template_Description_Messagebox);
		Thread.sleep(6000);
		log("Click on Template Description messagebox");
		Template_Description_Messagebox.sendKeys(Templates_excelRead(5, 0));
		Thread.sleep(6000);
		log("Enter message under Template Description");
		jsclick(Template_Description_OK_button);
		Thread.sleep(6000);
		log("Click on Template Description dialog OK button");
		getTemplate_Created_Message_Verify();
		Thread.sleep(6000);
		log("Verified Template created successfully");
		jsclick(Template_Created_OK_button);
		Thread.sleep(6000);
		log("Click on Ok button");
		log("Verifying to CreateorBrowse Template Defaultviewing");
		Refresh_Button();
		Thread.sleep(6000);
		log("Click on Refresh button");
		jsclick(Templates_MenuOption);
		Thread.sleep(6000);
		log("Click on Template Tab");
		jsclick(Destination_Folder_Textbox);
		Thread.sleep(6000);
		log("Click on Destination Folder Textbox");
		selectElement(Select_Cabinet1);
		Thread.sleep(6000);
		log("Expand a Cabinet");
		selectElement(Select_Drawer1);
		Thread.sleep(6000);
		log("Expand a Drawer");
		selectElement(Select_Folder1);
		Thread.sleep(6000);
		log("Folder is selected for Templates");
		jsclick(OK_Button_BrowseforFolder);
		Thread.sleep(6000);
		log("Click on Ok button");
		jsclick(getSelect_Document_Type_Dropdown());
		Thread.sleep(6000);
		log("Select Document type dropdown");
		jsclick(Select_ReportName_Test);
		log("Select Report name textbox");
		Select_ReportName_Test.sendKeys(Templates_excelRead(1, 0));
		Thread.sleep(2000);
		log("Enter value into Report Name field");
		WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait3.until(ExpectedConditions.elementToBeClickable(Move_To_PlusIcon));
		movingclkElement(Move_To_PlusIcon);
		Thread.sleep(1000);
		getBrowse_Option();
		Thread.sleep(3000);
		log("Browse a Document Page");
		Runtime.getRuntime().exec("D:\\DipakAutoit\\FileUploadScriptpdf.exe");
		Thread.sleep(6000);
		try {
		WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait4.until(ExpectedConditions.alertIsPresent());
		Alert alt1 = driver.switchTo().alert();
		alt1.accept();
		}catch(Exception e) {
			System.out.println("Alert is not Present");
		}
		log("By using AutoIT add file from external folder");
		Thread.sleep(3000);
		WebDriverWait wait5 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait5.until(ExpectedConditions.elementToBeClickable(Move_To_PlusIcon));
		movingclkElement(Move_To_PlusIcon);
		Thread.sleep(1000);
		getBrowse_Option();
		Thread.sleep(3000);
		log("Browse a Document Page");
		Runtime.getRuntime().exec("D:\\DipakAutoit\\FileUploadScript.exe");
		Thread.sleep(6000);
		jsclick(Save_Template_Button);
		log("By using AutoIT add file from external folder");
		jsclick(Template_Description_No_button);
		Thread.sleep(6000);
		log("Click on Template Description No button");
		jsclick(Save_Template_Button);
		Thread.sleep(6000);
		log("Click on Save Template button");
		jsclick(Template_NameTextbox);
		Thread.sleep(2000);
		log("Click on Template Name textbox");
		Template_NameTextbox.sendKeys(Templates_excelRead(4, 0));
		Thread.sleep(6000);
		log("Enter Template Name");
		jsclick(Template_Description_Messagebox);
		Thread.sleep(6000);
		log("Click on Template Decription messagebox");
		Template_Description_Messagebox.sendKeys(Templates_excelRead(5, 0));
		Thread.sleep(6000);
		log("Enter message in Template description textbox");
		jsclick(Template_Description_OK_button);
		Thread.sleep(6000);
		log("Click on Ok button");
		getVerify_DuplicateTemp_Message();
		Thread.sleep(6000);
		log("Verified Template already exist validation message");
		movingclkElement(Okbutton);
		Thread.sleep(6000);
		log("Click on Ok button");
		jsclick(Nobutton);
		Thread.sleep(6000);
		log("Click on No button");
		log("Duplicate Template not creating validate");
		Refresh_Button();
		Thread.sleep(6000);
		log("Click on  Refresh button");
		getMoveto_Templates_Option();
		Thread.sleep(6000);
		movingclkElement(Select_Created_Template);
		try {
			WebDriverWait wait6 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait6.until(ExpectedConditions.alertIsPresent());
			Alert alt2 = driver.switchTo().alert();
			alt2.accept();
		} catch (Exception e) {
			log("Alert not present");
		}
		Thread.sleep(6000);
		log("Select created Template from Template Tab");
		jsclick(Delete_Template_Button);
		Thread.sleep(6000);
		log("Click on Delete Template Fab button");
		jsclick(Delete_Template_OK_Button);
		log("Template Deleted Successfully");

	}

	public void verify_to_CreateorBrowse_Template_Advancedviewing_Officedoc() throws Exception {

		log("Test Scenario 5 : Verifying to Create or Browse Template Advancedviewing Officedoc");
		try {
			LogDipakUser();
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("user alreday Logged");
		}

		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		try {
			jsclick(Cancel_Button_BrowseforFolder);
			Thread.sleep(2000);
		} catch (Exception e) {
			// Folder navigation dialog not open
		}
		Thread.sleep(6000);
		Refresh_Button();
		Thread.sleep(6000);
		log("Click on Refresh button");
		movingclkElement(Setting_Icon);
		Thread.sleep(6000);
		log("Click on Setting Icon");
		jsclick(My_Preferencesetting);
		Thread.sleep(6000);
		log("Click on My Preferences Option");
		getSelect_Office_document_Advancedviewing();
		Thread.sleep(6000);
		log("Select Office document and set as Advanced view");
		movingclkElement(Apply_button);
		Thread.sleep(2000);
		log("Click on Apply button");
		getToastmessage();
		jsclick(Templates_MenuOption);
		Thread.sleep(6000);
		log("Click on Templates Tab");
		jsclick(Destination_Folder_Textbox);
		Thread.sleep(6000);
		log("Click on Destination Folder textbox");
		selectElement(Select_Cabinet1);
		Thread.sleep(6000);
		log("Expand a Cabinet");
		selectElement(Select_Drawer1);
		Thread.sleep(6000);
		log("Expand a Drawer");
		selectElement(Select_Folder1);
		Thread.sleep(6000);
		log("Folder is selected for Templates");
		jsclick(OK_Button_BrowseforFolder);
		Thread.sleep(6000);
		log("Click on Ok button");
		jsclick(getSelect_Document_Type_Dropdown());
		Thread.sleep(6000);
		log("Select Document type dropdown value");
		jsclick(Select_ReportName_Test);
		log("Click on Report Name");
		Select_ReportName_Test.sendKeys(Templates_excelRead(1, 0));
		Thread.sleep(2000);
		log("Enter value into Report Name field");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(Move_To_PlusIcon));
		movingclkElement(Move_To_PlusIcon);
		Thread.sleep(1000);
		getNew_Word_Document_Option();
		Thread.sleep(2000);
		log("Browse Word document");
		jsclick(OKButton);
		Thread.sleep(6000);
		log("Click on Ok button");
		getFilenamevalidation();
		Thread.sleep(6000);
		log("Verified Validation error");
		getEnter_Word_File_Name();
		Thread.sleep(2000);
		log("Enter Word file name");
		jsclick(Open_Word_page);
		Thread.sleep(2000);
		log("Select word page");
		log("Advanced Viewing New Word Document Created");
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.elementToBeClickable(Move_To_PlusIcon));
		movingclkElement(Move_To_PlusIcon);
		getNew_Excel_Spreadsheet_Option();
		Thread.sleep(6000);
		log("Browse Excel document");
		jsclick(OKButton);
		Thread.sleep(6000);
		log("Click on Ok button");
		getFilenamevalidation();
		Thread.sleep(6000);
		log("Verified Validation error message");
		getEnter_Excel_File_Name();
		Thread.sleep(6000);
		log("Enter Excel file name");
		jsclick(Open_Excel_page);
		Thread.sleep(6000);
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait2.until(ExpectedConditions.elementToBeClickable(Move_To_PlusIcon));
		movingclkElement(Move_To_PlusIcon);
		Thread.sleep(1000);
		getBrowse_Option();
		Thread.sleep(3000);
		log("Browse  Document Page");
		Runtime.getRuntime().exec("D:\\DipakAutoit\\OfficeDoc\\FileUploadOfficedoc.exe");
		log("By using AutoIT add file from external folder");
		Thread.sleep(6000);
		log("Advanced Viewing New Excel Document Created");
		jsclick(Save_Template_Button);
		log("Save Template button clicked successfully");
		jsclick(Template_Description_No_button);
		Thread.sleep(6000);
		log("Click on Template description No button");
		jsclick(Save_Template_Button);
		Thread.sleep(6000);
		log("Click on Save Template button");
		jsclick(Template_NameTextbox);
		Thread.sleep(6000);
		log("Click on Template name Textbox");
		Template_NameTextbox.sendKeys(Templates_excelRead(4, 0));
		Thread.sleep(6000);
		log("Enter Template Name");
		jsclick(Template_Description_Messagebox);
		Thread.sleep(6000);
		log("Click on Template Description messagebox");
		Template_Description_Messagebox.sendKeys(Templates_excelRead(5, 0));
		Thread.sleep(6000);
		log("Enter message under Template Description");
		jsclick(Template_Description_OK_button);
		Thread.sleep(8000);
		log("Click on Ok button");
		getTemplate_Created_Message_Verify();
		Thread.sleep(6000);
		log("Verified Template created successfully");
		jsclick(Template_Created_OK_button);
		Thread.sleep(6000);
		log("Click on Ok button");
		log("Verifying to CreateorBrowse Officedoc Template advancedviewing");
		Refresh_Button();
		Thread.sleep(6000);
		log("Click on Refresh button");
		getMoveto_Templates_Option();
		Thread.sleep(6000);
		log("Mousehover to Template Tab");
		movingclkElement(Select_Created_Template);
		Thread.sleep(6000);
		log("Select created Template");
		try {
			WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait3.until(ExpectedConditions.alertIsPresent());
			Alert alt1 = driver.switchTo().alert();
			alt1.accept();
		} catch (Exception e) {
			// Alert not present
		}
		jsclick(Createdoc);
		Thread.sleep(6000);
		log("Click on Create button");
		getNavigateDoc();
		Thread.sleep(6000);
		log("Click on Navigate button");
		Refresh_Button();
		Thread.sleep(6000);
		getMoveto_Templates_Option();
		Thread.sleep(3000);
		log("Mousehover to Template Tab");
		log("Click on Refresh button");
		movingclkElement(Select_Created_Template);
		Thread.sleep(6000);
		log("Select Created Template");
		try {
			WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait3.until(ExpectedConditions.alertIsPresent());
			Alert alt1 = driver.switchTo().alert();
			alt1.accept();
		} catch (Exception e) {
			// Alert not present
		}
		Thread.sleep(6000);
		jsclick(Delete_Template_Button);
		Thread.sleep(6000);
		log("Click on Delete Template Fab button");
		jsclick(Delete_Template_OK_Button);
		log("Click on Ok button");
		log("Template Deleted Successfully");
	}

	public void verify_Validation_Formmapping_PDFTemplate_Advancedviewing() throws Exception {

		log("Test Scenario 6 : Verifying Validation Formmapping PDF Template Advancedviewing ");
		try {
			LogDipakUser();
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("user alreday Logged");
		}

		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		try {
			jsclick(Cancel_Button_BrowseforFolder);
			Thread.sleep(2000);
		} catch (Exception e) {
			// Folder navigation dialog not open
		}
		Refresh_Button();
		Thread.sleep(6000);
		log("Click on Refresh button");
		movingclkElement(Setting_Icon);
		Thread.sleep(6000);
		log("Click on Setting Icon");
		jsclick(My_Preferencesetting);
		Thread.sleep(6000);
		log("Click on My Preferences");
		getPdf_document_Advancedviewing();
		Thread.sleep(6000);
		log("Select Pdf document and set as Advanced view");
		movingclkElement(Apply_button);
		Thread.sleep(2000);
		log("Click on Apply button");
		getToastmessage();
		jsclick(Templates_MenuOption);
		Thread.sleep(6000);
		log("Click on Template Tab");
		jsclick(Destination_Folder_Textbox);
		Thread.sleep(6000);
		log("Click on Destination Folder Textbox");
		selectElement(Select_Cabinet1);
		Thread.sleep(6000);
		log("Expand a Cabinet");
		selectElement(Select_Drawer1);
		Thread.sleep(6000);
		log("Expand a Drawer");
		selectElement(Select_Folder1);
		Thread.sleep(6000);
		log("Folder is selected for Templates");
		OK_Button_BrowseforFolder.click();
		Thread.sleep(6000);
		log("Click on Ok button");
		jsclick(getSelect_Document_Type_Dropdown());
		Thread.sleep(6000);
		log("Select Document type dropdown");
		jsclick(Select_ReportName_Test);
		Thread.sleep(6000);
		log("Click on Report Name");
		Select_ReportName_Test.sendKeys(Templates_excelRead(1, 0));
		log("Enter value Report Name Textbox");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(Move_To_PlusIcon));
		movingclkElement(Move_To_PlusIcon);
		Thread.sleep(1000);
		getNew_pdf_Document_Option();
		Thread.sleep(6000);
		log("Browse New Pdf document");
		jsclick(OKButton);
		Thread.sleep(6000);
		log("Click on  Ok button");
		getFilenamevalidation();
		Thread.sleep(6000);
		log("Verified Validation error message ");
		getEnter_pdf_File_Name();
		Thread.sleep(6000);
		log("Enter value Pdf file name field");
		jsclick(Click_Formmapper);
		Thread.sleep(6000);
		log("Click on Form mapping");
		getFormmappingvalidation();
		log("Verified Form mapping validation message");
		Refresh_Button();
		Thread.sleep(6000);
		log("Click on Refresh button");
		jsclick(Nobutton);
		Thread.sleep(6000);
		log("Click on No button");
		Refresh_Button();
		Thread.sleep(6000);
		log("Click on Refresh button");
		log("Form mapping validation verified");
	}
}