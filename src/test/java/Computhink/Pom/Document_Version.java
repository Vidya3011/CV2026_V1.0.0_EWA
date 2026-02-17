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
import org.testng.Assert;
import org.testng.Reporter;

public class Document_Version extends Computhink.Generic.BaseClass {

	public static WebElement element = null;

	public Document_Version() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[@id=\"navigatorTreeCancle\"]")
	private WebElement Cancel_Button_BrowseforFolder;

	@FindBy(xpath = ".//div[@id='viewDocumentnavigator']/ul[1]/li[1]/a[1]")
	private WebElement Select_Cabinet;

	@FindBy(xpath = ".//div[@id='viewDocumentnavigator']/ul[1]/li[1]/ul[1]/li[1]/a[1]")
	private WebElement Select_Drawer;

	@FindBy(xpath = (".//div[@id='viewDocumentnavigator']/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
	private WebElement Select_Folder;

	@FindBy(xpath = ".//div[@id='viewDocumentnavigator']/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]")
	private WebElement Select_subFolder;

	@FindBy(xpath = ("//*[@id=\"documentListTable\"]/tbody/tr[1]/td[3]"))
	private WebElement Select_Document;

	@FindBy(xpath = "//*[@id=\"version\"]/div/div[1]/span")
	private WebElement Version_Option;

	@FindBy(xpath = "//*[@id=\"fabButton\"]")
	private WebElement Fab;

	@FindBy(xpath = "//*[@id=\"uploadFabButton\"]")
	private WebElement FloatingButton;

	@FindBy(xpath = "//*[@id=\"uploadFabButton\"]")
	private WebElement UploadFab;
	
	@FindBy(xpath = "//*[@id=\"messageButtonNo27\"]")
	private WebElement Nobutton;

	@FindBy(xpath = "//*[@id=\"saveFabButton\"]")
	private WebElement SaveFab;

	@FindBy(xpath = "//*[@id=\"messageButtonOK42\"]")
	private WebElement SaveOkButton;
	
	@FindBy(xpath = "//*[@id=\"versionRow_1.0\"]") 
	private WebElement CheckFirst_Version;
	
	@FindBy(xpath = "//*[@id=\"versionRow_1.0\"]/td[2]")
	private WebElement Verify_Version1;
	
	public void getVerify_FirstVersion() {
		
		jsclick(CheckFirst_Version);
		log("Select First Version");
		String expectedtext = "1.0";
		String actualtext = Verify_Version1.getText();
		Assert.assertEquals(actualtext, expectedtext);
		log( Verify_Version1.getText() + " this V/R should show");
	}
	
	@FindBy(xpath = "//*[@id=\"versionRow_2.0\"]/td[1]/input")
	private WebElement Checksecond_Version;
	
	@FindBy(xpath = "//*[@id=\"versionRow_2.0\"]/td[2]")
	private WebElement Verify_Version2;
	
	@FindBy(xpath = "//*[@id=\"versionRow_2.0\"]/td[5]")
	private WebElement Verify_commentversion2;
	
public void getVerify_secondVersion() {
		
		jsclick(Checksecond_Version);
		log("Select second Version");
		String expectedtext = "2.0";
		String actualtext = Verify_Version2.getText();
		Assert.assertEquals(actualtext, expectedtext);
		log(Verify_Version2.getText() + " this V/R should show");
		String expectedtext1 = "Pages Updated";
		String actualtext1 = Verify_commentversion2.getText();
		Assert.assertEquals(actualtext1, expectedtext1);
		log( Verify_commentversion2.getText() + " this Comment should show");
	}

public void getVerify_secondVersionupdateComment() {
	
	jsclick(Checksecond_Version);
	log("Select second Version");
	String expectedtext = "2.0";
	String actualtext = Verify_Version2.getText();
	Assert.assertEquals(actualtext, expectedtext);
	String expectedtext1 = "Document has been Updated Successfully";
	String actualtext1 = Verify_commentversion2.getText();
	Assert.assertEquals(actualtext1, expectedtext1);
	log(Verify_commentversion2.getText() + " this Updated Comment should show");
}

public void getVerify_ThirdVersion() {
	
	jsclick(Checksecond_Version);
	log("Select second Version");
	String expectedtext = "2.0";
	String actualtext = Verify_Version2.getText();
	Assert.assertEquals(actualtext, expectedtext);
	String expectedtext1 = "Document has been Updated Successfully";
	String actualtext1 = Verify_commentversion2.getText();
	Assert.assertEquals(actualtext1, expectedtext1);
	log(Verify_commentversion2.getText() + " this Updated Comment should show");
}
	
	

	@FindBy(xpath = "//td[normalize-space()='Pages Updated']")
	private WebElement Click_Message;

	@FindBy(xpath = "(//a[normalize-space()='Comments'])[1]")
	private WebElement Comments_Option;

	@FindBy(xpath = "//*[@id=\"vesioncomments\"]")
	private WebElement Comments_Box;

	@FindBy(xpath = "//*[@id=\"VersionCommentOk\"]")
	private WebElement Save_Comments;

	@FindBy(xpath = "//div[@class='class2']//input[@type='checkbox']")
	private WebElement Select_ThumbnailPage;

	@FindBy(xpath = "//*[@id=\"deleteFabButton\"]")
	private WebElement Delete_FabButton;

	@FindBy(xpath = "//*[@id=\"deleteMessageOk19\"]")
	private WebElement Delete_Yes;

	@FindBy(xpath = "//*[@id=\"messageButtonOKDEl\"]")
	private WebElement Delete_Ok;

	@FindBy(xpath = "(//a[normalize-space()='Delete all versions'])[1]")
	private WebElement Delete_AllVersions;

	@FindBy(xpath = "(//button[@id='deleteVersionMessageOk'])[1]")
	private WebElement Delete_VersionmessageOk;

	@FindBy(xpath = "//*[@id=\"fullScreenFabButton\"]")
	private WebElement FullScreen_Fabbutton;

	@FindBy(xpath = "//*[@id=\"cvDocumentClose\"]/span")
	private WebElement CloseDoc;

	@FindBy(xpath = "//tbody/tr[1]/td[1]/label[1]/span[1]")
	private WebElement CheckDoc;

	@FindBy(xpath = "//*[@id=\"copyId\"]")
	private WebElement Copy_ID;

	@FindBy(xpath = "//*[@id=\"pasteid\"]")
	private WebElement Paste_ID;

	@FindBy(xpath = "//*[@id=\"documentListSubMenu\"]")
	private WebElement MoveTo_Menu_Documents;

	@FindBy(xpath = "//*[@id=\"delDocument\"]")
	private WebElement deletedoc;

	@FindBy(xpath = "//*[@id=\"deleteMessageOk\"]")
	private WebElement deleteOK;

	@FindBy(xpath = "//*[@id=\"createDocument\"]")
	private WebElement Click_New_Document;

	@FindBy(xpath = "//*[@id=\"createDocuemtnLocation\"]")
	private WebElement Destination_Folder_Textbox;

	// Select from Destination folder Location

	@FindBy(xpath = (".//div[@id='navigatorModel']/div[2]/div[1]/div[1]/ul[1]/li[1]/a[1]"))
	private WebElement Select_Cabinet1;

	@FindBy(xpath = (".//div[@id='navigatorModel']/div[2]/div[1]/div[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
	private WebElement Select_Drawer1;

	@FindBy(xpath = (".//div[@id='navigatorModel']/div[2]/div[1]/div[1]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
	private WebElement Select_Folder1;

	@FindBy(xpath = "//*[@id=\"navigatorTreeOk\"]")
	private WebElement OK_Button_BrowseforFolder;

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

	@FindBy(xpath = "//*[@id=\"viewCreatedDocument\"]")
	private WebElement ViewDocument_Button;

	@FindBy(xpath = "//*[@id=\"btnSignatureAdd\"]/span[1]")
	private WebElement Click_signature_Menuoption;

	@FindBy(xpath = ("//*[@id=\"imageViewerDiv\"]/div[2]/canvas"))
	private WebElement Add_Signature_Onpage;

	@FindBy(xpath = "//*[@id=\"signInputPasswordL\"]")
	private WebElement signinputpassword;

	@FindBy(xpath = "//*[@id=\"verifySignaturePasswordL\"]")
	private WebElement verifypassok;

	@FindBy(xpath = "//*[@id=\"saveAddedPages\"]/span")
	private WebElement Save_button;

	@FindBy(xpath = "//*[@id=\"messageButtonOK42\"]")
	private WebElement DocumentSave_Ok_button;

	@FindBy(xpath = "//*[@id=\"versionRow_1.0\"]")
	private WebElement Set_active_version;

	@FindBy(xpath = "(//a[normalize-space()='Set active version'])[1]")
	private WebElement Set_active_version_button;

	@FindBy(xpath = "//*[@id=\"documentListTable\"]/tbody/tr[1]/td[2]")
	private WebElement Load_Metadata;

	@FindBy(xpath = "//tbody//span[contains(text(),'Versions')]")
	private WebElement Click_Metadata_Version_Option;

	@FindBy(xpath = "(//a[normalize-space()='Update'])[1]")
	private WebElement Update_Button;

	@FindBy(xpath = "//input[@type='text' and @value='My_Pereferences_Test_Doc']") 
	private WebElement Update_ReportName;

	@FindBy(xpath = "(//a[normalize-space()='Save'])[1]")
	private WebElement Save_UpdateButton;

	@FindBy(xpath = "//*[@id=\"CommentsMessageModelOk\"]")
	private WebElement Update_Ok_button;

	@FindBy(xpath = "//*[@id=\"recentMenuBtn\"]")
	private WebElement MoveTo_Menu_Recent;

	@FindBy(xpath = "//*[@id=\"recentFolders\"]/tbody/tr[1]/td")
	private WebElement Recent_Folder;
	
	@FindBy(xpath = "//*[@id=\"defaultPdfDocViewListNo\"]")
	private WebElement Pdf_document_Defaultviewing;
	
	@FindBy(xpath = "//*[@id=\"modelHome\"]")
	private WebElement Navigate_button;
	
	public void getPdf_document_Defaultviewing() throws Exception {
		Select sel = new Select(Pdf_document_Defaultviewing);
		// sel.selectByVisibleText("Default viewing");
		sel.selectByIndex(0);
	}
	
	@FindBy(xpath = "//*[@id=\"imgSettings\"]")
	private WebElement Setting_Icon;
	
	@FindBy(xpath = "//*[@id=\"myPreferencesSettingsNav\"]")
	private WebElement My_Preferencesetting;
	
	@FindBy(xpath = "//*[@id=\"myPreferencesSubmit\"]")
	private WebElement Apply_button;
	
	
	
	

	public void get_CopyandPaste_Document() throws InterruptedException {

		element = MoveTo_Menu_Documents;
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		jsclick(Copy_ID);
		Thread.sleep(2000);
		element = MoveTo_Menu_Documents;
		Actions action1 = new Actions(driver);
		action1.moveToElement(element).perform();
		Thread.sleep(8000);
		jsclick(Paste_ID);

	}

	public void getVerify_Delete_Document() throws InterruptedException {

		element = MoveTo_Menu_Documents;
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		Thread.sleep(8000);
		jsclick(deletedoc);
		Thread.sleep(8000);
		jsclick(deleteOK);

	}

	public void getSelect_Document_Type_Dropdown() {
		Select drop = new Select(Click_Document_Type_Dropdown);
		drop.selectByVisibleText("CVReports");
	}

	public void getEnter_ReportName() throws Exception {
		jsclick(Enter_ReportName);
		Enter_ReportName.sendKeys(DocumentVersion_excelRead(2, 0));

	}

	public WebElement getMove_To_PlusIcon() {
		WebElement ele = Move_To_PlusIcon;
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
		return ele;
	}

	public WebElement getBrowse_Option() {
		WebElement ele = Browse_Option;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele);
		return ele;
	}

	public void getAdd_Signature_Onpage() throws Exception {
		Actions action = new Actions(driver);
		WebElement element = Add_Signature_Onpage;
		action.dragAndDropBy(element, 200, 100).build().perform();

	}

	public void getinputpassword() throws Exception {
		jsclick(signinputpassword);
		signinputpassword.sendKeys(DocumentVersion_excelRead(3, 0));
		jsclick(verifypassok);

	}

	public void getMoveTo_Menu_Recent() {
		Actions action = new Actions(driver);
		action.moveToElement(MoveTo_Menu_Recent).perform();

	}

	public void Create_Document_Verify_Version() throws Exception {

		log("Test Scenario 1 : Create New Document and Verifying Document Versions ");
		try {
			LogDipakUser();
			Thread.sleep(8000);
		} catch (Exception e) {
			System.out.println("User is already logged");
		}
		try {
			jsclick(Cancel_Button_BrowseforFolder);
			Thread.sleep(2000);
		} catch (Exception e) {
			// Folder navigation dialog not open
		}
		if(Nobutton.isDisplayed()==true) {
			movingclkElement(Nobutton);
		}else {
			// Saving dialog not present
		}
		Refresh_Button();
		Thread.sleep(8000);
		jsclick(Click_New_Document);
		Thread.sleep(8000);
		log("Click on New Document Tab");
		jsclick(Destination_Folder_Textbox);
		Thread.sleep(8000);
		log("Click on Destination Folder Textbox");
		selectElement(Select_Cabinet1);
		Thread.sleep(8000);
		log("Expand a Cabinet");
		selectElement(Select_Drawer1);
		Thread.sleep(8000);
		log("Expand a Drawer");
		selectElement(Select_Folder1);
		Thread.sleep(8000);
		log("select a Folder");
		jsclick(OK_Button_BrowseforFolder);
		Thread.sleep(8000);
		log("Click on Ok button");
		getSelect_Document_Type_Dropdown();
		Thread.sleep(8000);
		log("Select Document type dropdown");
		getEnter_ReportName();
		Thread.sleep(2000);
		log("Enter value into Report Name field");
		movingElement(getMove_To_PlusIcon());
		getBrowse_Option();
		log("Browse Document Page");
		Thread.sleep(2000);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\FileUploadScript.exe");
		log("By using AutoIT add file from external folder");
		try {
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Thread.sleep(8000);
		log("PDF Page is uploaded successfully");
		movingclkElement(Create_button);
		Thread.sleep(8000);
		log("Click on Create button");
		
		jsclick(Navigate_button);
		jsclick(Select_Document);
		Thread.sleep(8000);
		try {
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		log("PDF is created successfully");
		jsclick(Version_Option);
		Thread.sleep(4000);
		log("Click on Version Option");
		getVerify_FirstVersion();
		log("Verified Current Document Version Successfully");
		
	}

	public void Add_Page_with_Comment() throws Exception {

		log("Test Scenario 2 : Upload and Save New page and Verifying Version with new Comments ");
		if(Nobutton.isDisplayed()==true) {
			movingclkElement(Nobutton);
		}else {
			// Saving dialog not present
		}
		Thread.sleep(8000);
		jsclick(Version_Option);
		Thread.sleep(4000);
		log("Click on Version Option");
		jsclick(Fab);
		Thread.sleep(8000);
		movingclkElement(FloatingButton);
		Thread.sleep(8000);
		log("Click on Floating button");
		jsclick(UploadFab);
		Thread.sleep(2000);
		log("Click on Upload Fab button");
		Runtime.getRuntime().exec("D:\\DipakAutoit\\FileUploadScriptpdf.exe");
		log("By using AutoIT add file from external folder");
		Thread.sleep(8000);
		jsclick(SaveFab);
		Thread.sleep(8000);
		log("Click on Save Fab button");
		jsclick(SaveOkButton);
		Thread.sleep(8000);
		log("Click on Save button");
		jsclick(Version_Option);
		Thread.sleep(8000);
		log("Click on Version Option");
		getVerify_secondVersion();
		Thread.sleep(8000);
		log("Message Verified");
		jsclick(Click_Message);
		Thread.sleep(8000);
		log("Click on Ok button");
		jsclick(Comments_Option);
		Thread.sleep(8000);
		log("Click on Comment Option");
		jsclick(Comments_Box);
		log("Click on Comment Textbox");
		Comments_Box.clear();
		Comments_Box.sendKeys(DocumentVersion_excelRead(1, 0));
		Thread.sleep(8000);
		log("Enter Comment into Comment field");
		jsclick(Save_Comments);
		Thread.sleep(8000);
		log("Click on Save button");
		getVerify_secondVersionupdateComment();
		
		log("Document Version Update with Comments and verified");
	}

	public void Delete_Page() throws Exception {

		log("Test Scenario 3 : Delete Page and Verifying Version ");
		if(Nobutton.isDisplayed()==true) {
			movingclkElement(Nobutton);
		}else {
			// Saving dialog not present
		}
		jsclick(Select_ThumbnailPage);
		Thread.sleep(8000);
		log("Check Thumbnail page");
		jsclick(Delete_FabButton);
		Thread.sleep(8000);
		log("Click on Delete Fab button");
		jsclick(Delete_Yes);
		Thread.sleep(8000);
		log("Click on Yes button");
		jsclick(Delete_Ok);
		Thread.sleep(8000);
		log("Click on Ok button");
		jsclick(SaveFab);
		Thread.sleep(8000);
		log("Click on Save Fab button");
		jsclick(SaveOkButton);
		Thread.sleep(8000);
		log("Click on Ok button");
		movingclkElement(Version_Option);
		Thread.sleep(8000);
		log("Click on Version Option");
		
		
		log("Document Page delete and Verified versions");
	}

	public void Delete_All_version_with_Fullscreen() throws Exception {

		log("Test Scenario 4 : Verifying Delete All versions and Full Screen Option ");
		if(Nobutton.isDisplayed()==true) {
			movingclkElement(Nobutton);
		}else {
			// Saving dialog not present
		}
		jsclick(Delete_AllVersions);
		Thread.sleep(8000);
		log("Click on All Version");
		jsclick(Delete_VersionmessageOk);
		Thread.sleep(8000);
		log("Click on Ok button");
		jsclick(Version_Option);
		Thread.sleep(8000);
		log("Click on Version Option");
		jsclick(FullScreen_Fabbutton);
		Thread.sleep(8000);
		log("Click on Full Screen Fab button");
		jsclick(CloseDoc);
		Thread.sleep(8000);
		log("Click on the Close button");
		log("Verified Delete All versions and Full screen Document from Floating button");
	}

	public void Add_Annotations() throws Exception {

		log("Test Scenario 5 : Verifying set Active version ");
		if(Nobutton.isDisplayed()==true) {
			movingclkElement(Nobutton);
		}else {
			// Saving dialog not present
		}
		Refresh_Button();
		Thread.sleep(8000);
		log("click on Refresh button ");
		movingclkElement(Setting_Icon);
		Thread.sleep(4000);
		log("Click on Setting Icon");
		jsclick(My_Preferencesetting);
		Thread.sleep(4000);
		log("Click on My preferences option");
		getPdf_document_Defaultviewing();
		Thread.sleep(8000);
		log("Select Pdf document and set Default view Option");
		movingclkElement(Apply_button);
		Thread.sleep(4000);
		log("Click on Apply button");
		selectElement(Select_Cabinet);
		Thread.sleep(8000);
		log("Expand a Cabinet");
		selectElement(Select_Drawer);
		Thread.sleep(8000);
		log("Expand a Drawer");
		selectElement(Select_Folder);
		Thread.sleep(8000);
		jsclick(Select_Document);
		Thread.sleep(8000);
		try {
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		log("open document from Document List");
		movingElement(FloatingButton);
		Thread.sleep(8000);
		log("Click on Floating button");
		jsclick(UploadFab);
		Thread.sleep(2000);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\FileUploadScriptpdf.exe");
		Thread.sleep(8000);
		log("By using AutoIT add file from external folder");
		jsclick(FloatingButton);
		log("Click on Floating button");
		jsclick(SaveFab);
		Thread.sleep(8000);
		log("Click on Save button");
		jsclick(SaveOkButton);
		Thread.sleep(9000);
		log("Click on Ok button");
		jsclick(Version_Option);
		Thread.sleep(8000);
		log("Click on Version Option");
		movingclkElement(Click_signature_Menuoption);
		Thread.sleep(8000);
		log("Click on signature menu Option");
		try {
			getinputpassword();
			Thread.sleep(8000);
			log("Enter a Password");
		} catch (Exception e) {
			System.out.println("signature is not password protected...");
		}
		getAdd_Signature_Onpage();
		Thread.sleep(8000);
		log("New signature added Successfully on  Document");
		jsclick(Save_button);
		Thread.sleep(8000);
		log("Click on Save button menu Option");
		jsclick(DocumentSave_Ok_button);
		Thread.sleep(8000);
		log("Click on Ok button");
		jsclick(Version_Option);
		Thread.sleep(8000);
		log("Click on Version Option");
		log("Verifying version Page annotated/modified ");
	}

	public void Set_ActiveVersion() throws Exception {

		log("Test Scenario 6 : Verifying set Active version ");

		try {
			LogDipakUser();
			Thread.sleep(8000);
			getMoveTo_Menu_Recent();
			Thread.sleep(4000);
			log("Move to Recent Tab");
			jsclick(Recent_Folder);
			Thread.sleep(8000);
			log("Click on Recent Folder");
			Thread.sleep(8000);
			jsclick(Select_Document);
			Thread.sleep(8000);
			Thread.sleep(8000);
			log("Open document from Document List");
			jsclick(Version_Option);
			Thread.sleep(8000);
			log("Click on Version Option");

			try {
				WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
				wait1.until(ExpectedConditions.alertIsPresent());
				Alert alt = driver.switchTo().alert();
				alt.accept();
			} catch (Exception e) {
				System.out.println("Alert is not present...");
			}

		} catch (Exception e) {
			System.out.println("User is already logged");
		}
		if(Nobutton.isDisplayed()==true) {
			movingclkElement(Nobutton);
		}else {
			// Saving dialog not present
		}
		jsclick(Set_active_version);
		Thread.sleep(8000);
		log("select version to set active version");
		jsclick(Set_active_version_button);
		log("Click on Set active Version button");
		Thread.sleep(8000);
		jsclick(Version_Option);
		Thread.sleep(9000);
		log("Click on Version Option");
		log("Active version set and verified successfully");
		
	}

	public void Update_Doc_Properties() throws Exception {

		log("Test Scenario 7 : Update document properties ");
		if(Nobutton.isDisplayed()==true) {
			movingclkElement(Nobutton);
		}else {
			// Saving dialog not present
		}
		jsclick(Update_Button);
		Thread.sleep(8000);
		log("Click on Update button");
		Update_ReportName.clear();
		log("Clear Report Name value from Reportname field");
		Update_ReportName.sendKeys(DocumentVersion_excelRead(4, 0));
		Thread.sleep(8000);
		log("Update Report Name value ");
		jsclick(Save_UpdateButton);
		Thread.sleep(8000);
		log("Click on Update Save button");
		jsclick(Update_Ok_button);
		Thread.sleep(8000);
		log("Click on Ok button");
		jsclick(CloseDoc);
		Thread.sleep(8000);
		log("Click on Close button");
		log("verified and updated Document properties");
		Refresh_Button();
		log("Click on Refresh button");
		Thread.sleep(8000);
	}
}
