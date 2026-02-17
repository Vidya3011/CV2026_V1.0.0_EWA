package Computhink.Pom;

//Dipak Automation Coading


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
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

public class SpecialCharFilenames extends Computhink.Generic.BaseClass {

	public static WebElement element = null;

	public SpecialCharFilenames() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//*[@id=\"navigatorTreeCancle\"]")
	private WebElement Cancel_Button_BrowseforFolder;

	@FindBy(xpath = ("//*[@id=\"createDocument\"]"))
	private WebElement NewDocuments_MenuOption;

	@FindBy(xpath = "//*[@id=\"createDocuemtnLocation\"]")
	private WebElement Destination_Folder_Textbox;
	
	@FindBy(xpath = "//*[@id=\"cvDocumentClose\"]/span")
	private WebElement closedoc;

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

	@FindBy(xpath = "//*[@serialno=\"1\"]/div/img")
	private WebElement Open_tif_page;

	@FindBy(xpath = "//*[@serialno=\"2\"]/div/img")
	private WebElement Open_Tile_page;

	@FindBy(xpath = "//*[@serialno=\"3\"]/div/img")
	private WebElement Open_Attherate_page;

	@FindBy(xpath = "//*[@serialno=\"4\"]/div/img")
	private WebElement Open_Hash_page;

	@FindBy(xpath = "//*[@serialno=\"5\"]/div/img")
	private WebElement Open_Dollar_page;

	@FindBy(xpath = "//*[@serialno=\"6\"]/div/img")
	private WebElement Open_Plus_page;

	@FindBy(xpath = "//*[@serialno=\"7\"]/div/img")
	private WebElement Open_Caret_page;

	@FindBy(xpath = "//*[@serialno=\"8\"]/div/img")
	private WebElement Open_Equals_page;

	@FindBy(xpath = "//*[@serialno=\"9\"]/div/img")
	private WebElement Open_SingleQuote_page;

	@FindBy(xpath = "//*[@serialno=\"10\"]/div/img")
	private WebElement Open_Comma_page;

	@FindBy(xpath = "//*[@serialno=\"11\"]/div/img")
	private WebElement Open_Exclamatory_page;

	@FindBy(xpath = "//*[@serialno=\"12\"]/div/img")
	private WebElement Open_Hyphen_page;

	@FindBy(xpath = "//*[@id=\"commentMessage\"]")
	private WebElement FolderSelectMessage;

	@FindBy(xpath = "//*[@id=\"CommentsMessageModelOk\"]")
	private WebElement CommentOK;

	@FindBy(xpath = "//*[@id=\"createDocumentMessage\"]")
	private WebElement NavigateDoc;

	@FindBy(xpath = "//*[@id=\"modelHome\"]")
	private WebElement NavigateButton;

	@FindBy(xpath = "//*[@id=\"messageButtonNo27\"]")
	private WebElement Nobutton;

	@FindBy(xpath = "//*[@id=\"messageContent\"]")
	private WebElement Reportvaluevalidationerror;

	@FindBy(xpath = "//*[@id=\"messageButtonOK\"]")
	private WebElement CommentOKbutton;

	@FindBy(xpath = "//*[@id='docTypeIndicesTable']/tbody[1]/tr[1]/td[2]/input[1]")
	private WebElement Enter_Report_Name_Text;

	@FindBy(xpath = "//*[@id=\"addPagesDropDown\"]/span")
	private WebElement Move_To_PlusIcon;

	@FindBy(xpath = "//*[@id=\"viewDocumentAddPages\"]")
	private WebElement Browse_Option;

	@FindBy(xpath = "//*[@id=\"createDocumentSubmit\"]")
	private WebElement Create_Button;

	@FindBy(xpath = "//*[@id=\"viewCreatedDocument\"]")
	private WebElement View_Button;

	@FindBy(xpath = "//*[@id=\"saveAddedPages\"]/span")
	private WebElement Save_button;

	@FindBy(xpath = "//*[@id=\"messageButtonOK42\"]")
	private WebElement DocumentSave_Ok_button;

	@FindBy(xpath = "//*[@id=\"modelHome\"]")
	private WebElement Navigate_button;

	@FindBy(xpath = "//*[@id=\"documentListTable\"]/tbody/tr[1]/td[3]")
	private WebElement Open_Document;

	@FindBy(xpath = "//*[@class='editproperties']")
	private WebElement Update_Button;

	@FindBy(xpath = "//td[contains(text(),'ReportName')]/parent::tr//input") 
	private WebElement Update_ReportName;

	@FindBy(xpath = "(//a[normalize-space()='Save'])[1]")
	private WebElement Save_UpdateButton;

	@FindBy(xpath = "//button[@id='CommentsMessageModelOk']")
	private WebElement Update_Ok_button;

	@FindBy(xpath = "//*[@id=\"properties\"]/div/div[1]")
	private WebElement Properties_option;

	@FindBy(xpath = "//*[@serialno=\"13\"]/div/img")
	private WebElement Open_RoundBrackets_page;

	@FindBy(xpath = "//*[@serialno=\"14\"]/div/img")
	private WebElement Open_Accent_page;

	@FindBy(xpath = "//*[@serialno=\"15\"]/div/img")
	private WebElement Open_Ampersant_page;

	@FindBy(xpath = "//*[@serialno=\"16\"]/div/img")
	private WebElement Open_Underscore_page;

	@FindBy(xpath = "//*[@serialno=\"17\"]/div/img")
	private WebElement Open_Flowerbracket_Page;

	@FindBy(xpath = "//*[@serialno=\"18\"]/div/img")
	private WebElement Open_Squarebracket_page;

	@FindBy(xpath = "//*[@serialno=\"19\"]/div/img")
	private WebElement Open_SemiColon_page;

	@FindBy(xpath = "//*[@id=\"fileInfoButton\"]/span")
	private WebElement Click_FileInfo_Option;

	@FindBy(xpath = "//*[@id=\"fileNameLabel\"]")
	private WebElement Click_FileInfo_OkButton_withFileName;

	@FindBy(xpath = "//*[@id=\"fileRenameOK\"]")
	private WebElement RemarkOk;

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

	public void getClick_FileInfo_OkButton_withFileName() {
		WebElement Filename = Click_FileInfo_OkButton_withFileName;
		log("File name is:" + Filename.getText() + "this message should show");
		WebElement ele = RemarkOk;
		ele.click();
	}

	public void getFolderSelectMessage() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Please select a folder to create document";
		String actualtext = FolderSelectMessage.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verified");
		log(FolderSelectMessage.getText() + "this validation message should show");
		jsclick(CommentOK);
	}

	public void getReportvaluevalidationerror() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "ReportName*  	field is required";
		String actualtext = Reportvaluevalidationerror.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
		log(Reportvaluevalidationerror.getText() + "this validation message should show");
		jsclick(CommentOKbutton);
	}

	public void getNavigateDoc() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Document created successfully";
		String actualtext = NavigateDoc.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
		log(NavigateDoc.getText() + "this message should show");
		jsclick(NavigateButton);
	}

	public void Upload_and_verify_Allowing_Percentage_Characterfile() throws Exception {

		log("Test Scenario 1 : Upload and Verifying Allowing Percentage Characterfile");
		try {
			jsclick(Cancel_Button_BrowseforFolder);
			Thread.sleep(2000);
			Refresh_Button();
		} catch (Exception e) {
			// Folder navigation dialog not open
		}
		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		Thread.sleep(6000);
		Refresh_Button();
		Thread.sleep(6000);
		log("Click on Refresh button");
		jsclick(NewDocuments_MenuOption);
		Thread.sleep(6000);
		log("Click on New Document Tab");
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
		log("Folder is selected for Create New Documents");
		jsclick(OK_Button_BrowseforFolder);
		Thread.sleep(6000);
		log("Click on Ok button");
		jsclick(getSelect_Document_Type_Dropdown());
		Thread.sleep(6000);
		log("Select value from Document Type dropdown Option");
		Enter_Report_Name_Text.sendKeys(Specialchar_excelRead(1, 0));
		log("Enter Value into Report Name field");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(getMove_To_PlusIcon()));
		getMove_To_PlusIcon();
		Thread.sleep(2000);
		log("Browse Document Page from Local Path");
		//Upload file by using Browse option
		Browse_Option.sendKeys("D:\\DipakAutoit\\AllFiles\\Percentage%.tif");
		Thread.sleep(4000);
	
		
		try {
			WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait2.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		log("By using AutoIT add file from external folder");
		movingclkElement(Create_Button);
		Thread.sleep(6000);
		log("Click on Create button");
		jsclick(Navigate_button);
		Thread.sleep(6000);
		log("Click on Navigate button");
		jsclick(Open_Document);
		Thread.sleep(6000);
		log("Select and Open Document");
		Thread.sleep(6000);
		jsclick(Save_button);
		Thread.sleep(6000);
		log("Click on Save button menu Option");
		jsclick(DocumentSave_Ok_button);
		Thread.sleep(6000);
		log("Click on Ok button");
		log("Click on Properties Option from Document Viewer menu");
		log("Upload and Verifying Allowing Percentage Characterfile");
		log("****************************************************************************************************************");

	}

	public void Upload_and_verify_Allowing_Tile_Characterfile() throws Exception {

		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		Thread.sleep(6000);
		log("Test Scenario 2 : Upload and Verifying Allowing Tile Characterfile");
		jsclick(Update_Button);
		Thread.sleep(6000);
		log("Click on Update button");
		Update_ReportName.clear();
		log("Clear Report Name");
		Update_ReportName.sendKeys(Specialchar_excelRead(2, 0));
		log("Enter value into Report Name field");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(getMove_To_PlusIcon()));
		getMove_To_PlusIcon();
		Thread.sleep(2000);
		log("Browse Document Page from Local Path");
		//Upload file by using Browse option
		Browse_Option.sendKeys("D:\\DipakAutoit\\AllFiles\\Tile~.TIF");
		Thread.sleep(4000);
		jsclick(Open_Tile_page);
		Thread.sleep(6000);
		log("Select Uploaded Page");
		jsclick(Save_button);
		Thread.sleep(6000);
		log("Click on Save button menu Option");
		jsclick(DocumentSave_Ok_button);
		Thread.sleep(6000);
		log("Click on Ok button");
		jsclick(Save_UpdateButton);
		Thread.sleep(6000);
		log("Click on Update Save button");
		jsclick(Update_Ok_button);
		Thread.sleep(6000);
		log("Click on  Ok button");
		jsclick(Properties_option);
		log("Click on Properties Option from Document Viewer menu");
		log("Upload and Verifying Allowing Tile Characterfile");
		log("****************************************************************************************************************");
	}

	public void Upload_and_verify_Allowing_Atrate_Characterfile() throws Exception {

		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		Thread.sleep(6000);
		log("Test Scenario 3  Upload and Verifying Allowing Atrate Characterfile");
		jsclick(Update_Button);
		Thread.sleep(6000);
		log("Click on Update button");
		Update_ReportName.clear();
		log("Clear Report Name");
		Update_ReportName.sendKeys(Specialchar_excelRead(3, 0));
		Thread.sleep(2000);
		log("Enter value into Report Name field");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(getMove_To_PlusIcon()));
		getMove_To_PlusIcon();
		Thread.sleep(2000);
		log("Browse Document Page from Local Path");
		//Upload file by using Browse option
		Browse_Option.sendKeys("D:\\DipakAutoit\\AllFiles\\At the rate @.xls");
		Thread.sleep(4000);
		jsclick(Open_Attherate_page);
		Thread.sleep(6000);
		log("Select Uploaded Page");
		jsclick(Save_button);
		Thread.sleep(6000);
		log("Click on Save button menu Option");
		jsclick(DocumentSave_Ok_button);
		Thread.sleep(6000);
		log("Click on Ok button");
		jsclick(Save_UpdateButton);
		Thread.sleep(6000);
		log("Click on Update Save button");
		jsclick(Update_Ok_button);
		Thread.sleep(6000);
		log("Click on Ok button");
		jsclick(Properties_option);
		log("Click on Properties Option from Document Viewer menu");
		log("Upload and Verifying Allowing Atrate Characterfile");
		Thread.sleep(6000);
		log("****************************************************************************************************************");
	}

	public void Upload_and_verify_Allowing_Hash_Characterfile() throws Exception {

		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		Thread.sleep(6000);
		log("Test Scenario 4 :Upload and Verifying Allowing Hash Characterfile ");
		jsclick(Update_Button);
		Thread.sleep(6000);
		log("Click on Update button");
		Update_ReportName.clear();
		log("Clear Report Name");
		Update_ReportName.sendKeys(Specialchar_excelRead(4, 0));
		Thread.sleep(2000);
		log("Enter value into Report Name field");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(getMove_To_PlusIcon()));
		getMove_To_PlusIcon();
		Thread.sleep(2000);
		log("Browse Document Page from Local Path");
		//Upload file by using Browse option
		Browse_Option.sendKeys("D:\\DipakAutoit\\AllFiles\\Hash #.TIF");
		Thread.sleep(4000);
		jsclick(Open_Hash_page);
		Thread.sleep(6000);
		log("Select Uploaded Page");
		jsclick(Save_button);
		Thread.sleep(6000);
		log("Click on Save button menu Option");
		jsclick(DocumentSave_Ok_button);
		Thread.sleep(6000);
		log("Click on Ok button");
		jsclick(Save_UpdateButton);
		Thread.sleep(6000);
		log("Click on Update Save button");
		jsclick(Update_Ok_button);
		Thread.sleep(6000);
		log("Click on Ok button");
		jsclick(Properties_option);
		log("Click on Properties Option from Document Viewer menu");
		log("Upload and Verifying Allowing Hash Characterfile");
		log("****************************************************************************************************************");
	}

	public void Upload_and_verify_Allowing_Dollar_Characterfile() throws Exception {

		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		Thread.sleep(6000);
		log("Test Scenario 5 :Upload and Verifying Allowing Dollar Characterfile");
		jsclick(Update_Button);
		Thread.sleep(6000);
		log("Click on Update button");
		Update_ReportName.clear();
		log("Clear Report Name");
		Update_ReportName.sendKeys(Specialchar_excelRead(5, 0));
		Thread.sleep(2000);
		log("Enter value into Report Name field");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(getMove_To_PlusIcon()));
		getMove_To_PlusIcon();
		Thread.sleep(2000);
		log("Browse Document Page from Local Path");
		//Upload file by using Browse option
		Browse_Option.sendKeys("D:\\DipakAutoit\\AllFiles\\Dollar $.jpg");
		Thread.sleep(4000);
		jsclick(Open_Dollar_page);
		Thread.sleep(6000);
		log("Select Uploaded Page");
		jsclick(Save_button);
		Thread.sleep(6000);
		log("Click on Save button menu Option");
		jsclick(DocumentSave_Ok_button);
		Thread.sleep(6000);
		log("Click on Ok button");
		jsclick(Save_UpdateButton);
		Thread.sleep(6000);
		log("Click on Update Save button");
		jsclick(Update_Ok_button);
		Thread.sleep(6000);
		log("Click on Ok button");
		jsclick(Properties_option);
		log("Click on Properties Option from Document Viewer menu");
		log("Upload and Verifying Allowing Dollar Characterfile");
		log("****************************************************************************************************************");
	}

	public void Upload_and_verify_Allowing_Plus_Characterfile() throws Exception {

		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		Thread.sleep(6000);
		log("Test Scenario 6 :Upload and Verifying Allowing Plus Characterfile");
		jsclick(Update_Button);
		Thread.sleep(6000);
		log("Click on Update button");
		Update_ReportName.clear();
		log("Clear Report Name");
		Update_ReportName.sendKeys(Specialchar_excelRead(6, 0));
		Thread.sleep(2000);
		log("Enter value into Report Name field");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(getMove_To_PlusIcon()));
		getMove_To_PlusIcon();
		Thread.sleep(2000);
		log("Browse Document Page from Local Path");
		//Upload file by using Browse option
		Browse_Option.sendKeys("D:\\DipakAutoit\\AllFiles\\Plus +.TIF");
		Thread.sleep(4000);
		jsclick(Open_Plus_page);
		Thread.sleep(6000);
		log("Select Uploaded Page");

		jsclick(Save_button);
		Thread.sleep(6000);
		log("Click on Save button menu Option");
		jsclick(DocumentSave_Ok_button);
		Thread.sleep(6000);
		log("Click on Ok button");
		jsclick(Save_UpdateButton);
		Thread.sleep(6000);
		log("Click on Update Save button");
		jsclick(Update_Ok_button);
		Thread.sleep(6000);
		log("Click on Ok button");
		jsclick(Properties_option);
		log("Click on Properties Option from Document Viewer menu");
		log("Upload and Verifying Allowing Plus Characterfile");
		Thread.sleep(6000);
		log("****************************************************************************************************************");
	}

	public void Upload_and_verify_Allowing_Caret_Characterfile() throws Exception {

		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		Thread.sleep(6000);
		log("Test Scenario 7 : Upload and Verifying Allowing Caret Characterfile");
		jsclick(Update_Button);
		Thread.sleep(6000);
		log("Click on Update button");
		Update_ReportName.clear();
		log("Clear Report Name");
		Update_ReportName.sendKeys(Specialchar_excelRead(7, 0));
		Thread.sleep(2000);
		log("Enter value into Report Name field");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(getMove_To_PlusIcon()));
		getMove_To_PlusIcon();
		Thread.sleep(2000);
		log("Browse Document Page from Local Path");
		//Upload file by using Browse option
		Browse_Option.sendKeys("D:\\DipakAutoit\\AllFiles\\Caret ^.TIF");
		Thread.sleep(4000);
		jsclick(Open_Caret_page);
		Thread.sleep(6000);
		log("Select Uploaded Page");

		jsclick(Save_button);
		Thread.sleep(6000);
		log("Click on Save button menu Option");
		jsclick(DocumentSave_Ok_button);
		Thread.sleep(6000);
		log("Click on Ok button");
		jsclick(Save_UpdateButton);
		Thread.sleep(6000);
		log("Click on Update Save button");
		jsclick(Update_Ok_button);
		Thread.sleep(6000);
		log("Click on Ok button");
		jsclick(Properties_option);
		log("Click on Properties Option from Document Viewer menu");
		log("Upload and Verifying Allowing Caret Characterfile");
		log("****************************************************************************************************************");
	}

	public void Upload_and_verify_Allowing_Equals_Characterfile() throws Exception {

		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		Thread.sleep(6000);
		log("Test Scenario 8 :Upload and Verifying Allowing Equals Characterfile ");
		jsclick(Update_Button);
		Thread.sleep(6000);
		log("Click on Update button");
		Update_ReportName.clear();
		log("Clear Report Name");
		Update_ReportName.sendKeys(Specialchar_excelRead(8, 0));
		Thread.sleep(2000);
		log("Enter value into Report Name field");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(getMove_To_PlusIcon()));
		getMove_To_PlusIcon();
		Thread.sleep(2000);
		log("Browse Document Page from Local Path");
		//Upload file by using Browse option
		Browse_Option.sendKeys("D:\\DipakAutoit\\AllFiles\\Equal to =.TIF");
		Thread.sleep(4000);
		jsclick(Open_Equals_page);
		Thread.sleep(6000);
		log("Select Uploaded Page");

		jsclick(Save_button);
		Thread.sleep(6000);
		log("Click on Save button menu Option");
		jsclick(DocumentSave_Ok_button);
		Thread.sleep(6000);
		log("Click on Ok button");
		jsclick(Save_UpdateButton);
		Thread.sleep(6000);
		log("Click on Update Save button");
		jsclick(Update_Ok_button);
		Thread.sleep(6000);
		log("Click on Ok button");
		jsclick(Properties_option);
		log("Click on Properties Option from Document Viewer menu");
		log("Upload and Verifying Allowing Equals Characterfile");
		log("****************************************************************************************************************");
	}

	public void Upload_and_verify_Allowing_SingleQuote_Characterfile() throws Exception {

		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		Thread.sleep(6000);
		log("Test Scenario 9 :Upload and Verifying Allowing SingleQuote Characterfile ");
		jsclick(Update_Button);
		Thread.sleep(6000);
		log("Click on Update button");
		Update_ReportName.clear();
		log("Clear Report Name");
		Update_ReportName.sendKeys(Specialchar_excelRead(9, 0));
		Thread.sleep(2000);
		log("Enter value into Report Name field");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(getMove_To_PlusIcon()));
		getMove_To_PlusIcon();
		Thread.sleep(2000);
		log("Browse Document Page from Local Path");
		//Upload file by using Browse option
		Browse_Option.sendKeys("D:\\DipakAutoit\\AllFiles\\Single Quote '.png");
		Thread.sleep(4000);
		jsclick(Open_SingleQuote_page);
		Thread.sleep(6000);
		log("Select Uploaded Page");

		jsclick(Save_button);
		Thread.sleep(6000);
		log("Click on Save button menu Option");
		jsclick(DocumentSave_Ok_button);
		Thread.sleep(6000);
		log("Click on Ok button");
		jsclick(Save_UpdateButton);
		Thread.sleep(6000);
		log("Click on Update Save button");
		jsclick(Update_Ok_button);
		Thread.sleep(6000);
		log("Click on Ok button");
		jsclick(Properties_option);
		log("Click on Properties Option from Document Viewer menu");
		log("Upload and Verifying Allowing SingleQuote Characterfile");
		log("****************************************************************************************************************");
	}

	public void Upload_and_verify_Allowing_Comma_Characterfile() throws Exception {

		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		Thread.sleep(6000);
		log("Test Scenario 10 :Upload and Verifying Allowing Comma Characterfile");
		jsclick(Update_Button);
		Thread.sleep(6000);
		log("Click on Update button");
		Update_ReportName.clear();
		log("Clear Report Name");
		Update_ReportName.sendKeys(Specialchar_excelRead(10, 0));
		Thread.sleep(2000);
		log("Enter value into Report Name field");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(getMove_To_PlusIcon()));
		getMove_To_PlusIcon();
		Thread.sleep(2000);
		log("Browse Document Page from Local Path");
		//Upload file by using Browse option
		Browse_Option.sendKeys("D:\\DipakAutoit\\AllFiles\\Comm,.DOCX");
		Thread.sleep(4000);
		jsclick(Open_Comma_page);
		Thread.sleep(6000);
		log("Select Uploaded Page");

		jsclick(Save_button);
		Thread.sleep(6000);
		log("Click on Save button menu Option");
		jsclick(DocumentSave_Ok_button);
		Thread.sleep(6000);
		log("Click on Ok button");
		jsclick(Save_UpdateButton);
		Thread.sleep(6000);
		log("Click on Update Save button");
		jsclick(Update_Ok_button);
		Thread.sleep(6000);
		log("Click on Ok button");
		jsclick(Properties_option);
		log("Click on Properties Option from Document Viewer menu");
		log("Upload and Verifying Allowing Comma Characterfile");
		log("****************************************************************************************************************");
	}

	public void Upload_and_verify_Allowing_Exclamatory_Characterfile() throws Exception {

		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		Thread.sleep(6000);
		log("Test Scenario 11 :Upload and Verifying Allowing Exclamatory Characterfile ");
		jsclick(Update_Button);
		Thread.sleep(6000);
		log("Click on Update button");
		Update_ReportName.clear();
		log("Clear Report Name");
		Update_ReportName.sendKeys(Specialchar_excelRead(11, 0));
		Thread.sleep(2000);
		log("Enter value into Report Name field");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(getMove_To_PlusIcon()));
		getMove_To_PlusIcon();
		Thread.sleep(2000);
		log("Browse Document Page from Local Path");
		//Upload file by using Browse option
		Browse_Option.sendKeys("D:\\DipakAutoit\\AllFiles\\Exclamatory !.csv");
		Thread.sleep(4000);
		jsclick(Open_Exclamatory_page);
		Thread.sleep(6000);
		log("Select Uploaded Page");

		jsclick(Save_button);
		Thread.sleep(6000);
		log("Click on Save button menu Option");
		jsclick(DocumentSave_Ok_button);
		Thread.sleep(6000);
		log("Click on Ok button");
		jsclick(Save_UpdateButton);
		Thread.sleep(6000);
		log("Click on Update Save button");
		jsclick(Update_Ok_button);
		Thread.sleep(6000);
		log("Click on Ok button");
		jsclick(Properties_option);
		log("Click on Properties Option from Document Viewer menu");
		log("Upload and Verifying Allowing Exclamatory Characterfile");
		log("****************************************************************************************************************");
	}

	public void Upload_and_verify_Allowing_Hyphen_Characterfile() throws Exception {

		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		Thread.sleep(6000);
		log("Test Scenario 12 :Upload and Verifying Allowing Hyphen Characterfile ");
		jsclick(Update_Button);
		Thread.sleep(6000);
		log("Click on Update button");
		Update_ReportName.clear();
		log("Clear Report Name");
		Update_ReportName.sendKeys(Specialchar_excelRead(12, 0));
		Thread.sleep(2000);
		log("Enter value into Report Name field");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(getMove_To_PlusIcon()));
		getMove_To_PlusIcon();
		Thread.sleep(2000);
		log("Browse Document Page from Local Path");
		//Upload file by using Browse option
		Browse_Option.sendKeys("D:\\DipakAutoit\\AllFiles\\Hyphen -.tif");
		Thread.sleep(4000);
		jsclick(Open_Hyphen_page);
		Thread.sleep(6000);
		log("Select Uploaded Page");

		jsclick(Save_button);
		Thread.sleep(6000);
		log("Click on Save button menu Option");
		jsclick(DocumentSave_Ok_button);
		Thread.sleep(6000);
		log("Click on Ok button");
		jsclick(Save_UpdateButton);
		Thread.sleep(6000);
		log("Click on Update Save button");
		jsclick(Update_Ok_button);
		Thread.sleep(6000);
		log("Click on Ok button");
		jsclick(Properties_option);
		log("Click on Properties Option from Document Viewer menu");
		log("Upload and Verifying Allowing Hyphen Characterfile");
		log("****************************************************************************************************************");
	}

	public void Upload_and_verify_Allowing_RoundBrackets_Characterfile() throws Exception {

		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		Thread.sleep(6000);
		log("Test Scenario 13 :Upload and Verifying Allowing RoundBrackets Characterfile");
		jsclick(Update_Button);
		Thread.sleep(6000);
		log("Click on Update button");
		Update_ReportName.clear();
		log("Clear Report Name");
		Update_ReportName.sendKeys(Specialchar_excelRead(13, 0));
		Thread.sleep(2000);
		log("Enter value into Report Name field");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(getMove_To_PlusIcon()));
		getMove_To_PlusIcon();
		Thread.sleep(2000);
		log("Browse Document Page from Local Path");
		//Upload file by using Browse option
		Browse_Option.sendKeys("D:\\DipakAutoit\\AllFiles\\Round Brackets().docx");
		Thread.sleep(4000);
		jsclick(Open_RoundBrackets_page);
		Thread.sleep(6000);
		log("Select Uploaded Page");

		jsclick(Save_button);
		Thread.sleep(6000);
		log("Click on Save button menu Option");
		jsclick(DocumentSave_Ok_button);
		Thread.sleep(6000);
		log("Click on Ok button");
		jsclick(Save_UpdateButton);
		Thread.sleep(6000);
		log("Click on Update Save button");
		jsclick(Update_Ok_button);
		Thread.sleep(6000);
		log("Click on Ok button");
		jsclick(Properties_option);
		log("Click on Properties Option from Document Viewer menu");
		log("Upload and Verifying Allowing RoundBrackets Characterfile");
		log("****************************************************************************************************************");
	}

	public void Upload_and_verify_Allowing_Accent_Characterfile() throws Exception {

		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		Thread.sleep(6000);
		log("Test Scenario 14 : Upload and Verifying Allowing Accent Characterfile");
		jsclick(Update_Button);
		Thread.sleep(6000);
		log("Click on Update button");
		Update_ReportName.clear();
		log("Clear Report Name");
		Update_ReportName.sendKeys(Specialchar_excelRead(14, 0));
		Thread.sleep(2000);
		log("Enter value into Report Name field");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(getMove_To_PlusIcon()));
		getMove_To_PlusIcon();
		Thread.sleep(2000);
		log("Browse Document Page from Local Path");
		//Upload file by using Browse option
		Browse_Option.sendKeys("D:\\DipakAutoit\\AllFiles\\Accent `.pdf");
		Thread.sleep(4000);
		jsclick(Open_Accent_page);
		Thread.sleep(6000);
		log("Select Uploaded Page");

		jsclick(Save_button);
		Thread.sleep(6000);
		log("Click on Save button menu Option");
		jsclick(DocumentSave_Ok_button);
		Thread.sleep(6000);
		log("Click on Ok button");
		jsclick(Save_UpdateButton);
		Thread.sleep(6000);
		log("Click on Update Save button");
		jsclick(Update_Ok_button);
		Thread.sleep(6000);
		log("Click on Ok button");
		jsclick(Properties_option);
		log("Click on Properties Option from Document Viewer menu");
		log("Upload and Verifying Allowing Accent Characterfile");
		log("****************************************************************************************************************");
	}

	public void Upload_and_verify_Allowing_Ampersant_Characterfile() throws Exception {

		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		Thread.sleep(6000);
		log("Test Scenario 15 :Upload and Verifying Allowing Ampersant Characterfile ");
		jsclick(Update_Button);
		Thread.sleep(6000);
		log("Click on Update button");
		Update_ReportName.clear();
		log("Clear Report Name");
		Update_ReportName.sendKeys(Specialchar_excelRead(15, 0));
		Thread.sleep(2000);
		log("Enter value into Report Name field");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(getMove_To_PlusIcon()));
		getMove_To_PlusIcon();
		Thread.sleep(2000);
		log("Browse Document Page from Local Path");
		//Upload file by using Browse option
		Browse_Option.sendKeys("D:\\DipakAutoit\\AllFiles\\Ampersant &.djvu");
		Thread.sleep(4000);
		jsclick(Open_Ampersant_page);
		Thread.sleep(6000);
		log("Select Uploaded Page");
		Thread.sleep(6000);
		jsclick(Save_button);
		Thread.sleep(6000);
		log("Click on Save button menu Option");
		jsclick(DocumentSave_Ok_button);
		Thread.sleep(6000);
		log("Click on Ok button");
		jsclick(Save_UpdateButton);
		Thread.sleep(6000);
		log("Click on Update Save button");
		jsclick(Update_Ok_button);
		Thread.sleep(6000);
		log("Click on Ok button");
		jsclick(Properties_option);
		log("Click on Properties Option from Document Viewer menu");
		log("Upload and Verifying Allowing Ampersant Characterfile");
		log("****************************************************************************************************************");
	}

	public void Upload_and_verify_Allowing_Underscore_Characterfile() throws Exception {

		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		Thread.sleep(6000);
		log("Test Scenario 16 :Upload and Verifying Allowing Underscore Characterfile");
		jsclick(Update_Button);
		Thread.sleep(6000);
		log("Click on Update button");
		Update_ReportName.clear();
		log("Clear Report Name");
		Update_ReportName.sendKeys(Specialchar_excelRead(16, 0));
		Thread.sleep(2000);
		log("Enter value into Report Name field");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(getMove_To_PlusIcon()));
		getMove_To_PlusIcon();
		Thread.sleep(2000);
		log("Browse Document Page from Local Path");
		//Upload file by using Browse option
		Browse_Option.sendKeys("D:\\DipakAutoit\\AllFiles\\Underscore _.pdf");
		Thread.sleep(4000);
		log("By using AutoIT add file from external folder");
		jsclick(Open_Underscore_page);
		Thread.sleep(6000);
		log("Select Uploaded Page");
		jsclick(Save_button);
		Thread.sleep(6000);
		log("Click on Save button menu Option");
		jsclick(DocumentSave_Ok_button);
		Thread.sleep(6000);
		log("Click on Ok button");
		jsclick(Save_UpdateButton);
		Thread.sleep(6000);
		log("Click on Update Save button");
		jsclick(Update_Ok_button);
		Thread.sleep(6000);
		log("Click on Ok button");
		jsclick(Properties_option);
		log("Click on Properties Option from Document Viewer menu");
		log("Upload and Verifying Allowing Underscore Characterfile");
		log("****************************************************************************************************************");
	}

	public void Upload_and_verify_Allowing_Flowerbracket_Characterfile() throws Exception {

		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		Thread.sleep(6000);
		log("Test Scenario 17 : Upload and Verifying Allowing Flowerbracket Characterfile");
		jsclick(Update_Button);
		Thread.sleep(6000);
		log("Click on Update button");
		Update_ReportName.clear();
		log("Clear Report Name");
		Update_ReportName.sendKeys(Specialchar_excelRead(17, 0));
		Thread.sleep(2000);
		log("Enter value into Report Name field");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(getMove_To_PlusIcon()));
		getMove_To_PlusIcon();
		Thread.sleep(2000);
		log("Browse Document Page from Local Path");
		//Upload file by using Browse option
		Browse_Option.sendKeys("D:\\DipakAutoit\\AllFiles\\Flower or Curly bracket {}.JPG");
		Thread.sleep(4000);
		jsclick(Open_Flowerbracket_Page);
		Thread.sleep(6000);
		log("Select Uploaded Page");

		jsclick(Save_button);
		Thread.sleep(6000);
		log("Click on Save button menu Option");
		jsclick(DocumentSave_Ok_button);
		Thread.sleep(6000);
		log("Click on Ok button");
		jsclick(Save_UpdateButton);
		Thread.sleep(6000);
		log("Click on Update Save button");
		jsclick(Update_Ok_button);
		Thread.sleep(6000);
		log("Click on Ok button");
		jsclick(Properties_option);
		log("Click on Properties Option from Document Viewer menu");
		log("Upload and Verifying Allowing Flowerbracket Characterfile");
		log("****************************************************************************************************************");
	}

	public void Upload_and_verify_Allowing_Squarebracket_Characterfile() throws Exception {

		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		Thread.sleep(6000);
		log("Test Scenario 18 : Upload and Verifying Allowing Squarebracket Characterfile ");
		jsclick(Update_Button);
		Thread.sleep(6000);
		log("Click on Update button");
		Update_ReportName.clear();
		log("Clear Report Name");
		Update_ReportName.sendKeys(Specialchar_excelRead(18, 0));
		Thread.sleep(2000);
		log("Enter value into Report Name field");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(getMove_To_PlusIcon()));
		getMove_To_PlusIcon();
		Thread.sleep(2000);
		log("Browse Document Page from Local Path");
		//Upload file by using Browse option
		Browse_Option.sendKeys("D:\\DipakAutoit\\AllFiles\\Square Bracket [].tiff");
		Thread.sleep(4000);
		jsclick(Open_Squarebracket_page);
		Thread.sleep(6000);
		log("Select Uploaded Page");

		jsclick(Save_button);
		Thread.sleep(6000);
		log("Click on Save button menu Option");
		jsclick(DocumentSave_Ok_button);
		Thread.sleep(6000);
		log("Click on Ok button");
		jsclick(Save_UpdateButton);
		Thread.sleep(6000);
		log("Click on Update Save button");
		jsclick(Update_Ok_button);
		Thread.sleep(6000);
		log("Click on Ok button");
		jsclick(Properties_option);
		log("Click on Properties Option from Document Viewer menu");
		log("Upload and Verifying Allowing Squarebracket Characterfile");
		log("****************************************************************************************************************");
	}

	public void Upload_and_verify_Allowing_SemiColon_Characterfile() throws Exception {

		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		Thread.sleep(6000);
		log("Test Scenario 19 :Upload and Verifying Allowing SemiColon Characterfile ");
		jsclick(Update_Button);
		Thread.sleep(6000);
		log("Click on Update button");
		Update_ReportName.clear();
		log("Clear Report Name");
		Update_ReportName.sendKeys(Specialchar_excelRead(19, 0));
		Thread.sleep(2000);
		log("Enter value into Report Name field");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(getMove_To_PlusIcon()));
		getMove_To_PlusIcon();
		Thread.sleep(2000);
		log("Browse Document Page from Local Path");
		//Upload file by using Browse option
		Browse_Option.sendKeys("D:\\DipakAutoit\\AllFiles\\Semi Colon ;.tif");
		Thread.sleep(4000);
		jsclick(Open_SemiColon_page);
		Thread.sleep(6000);
		log("Select Uploaded Page");

		jsclick(Save_button);
		Thread.sleep(6000);
		log("Click on Save button menu Option");
		jsclick(DocumentSave_Ok_button);
		Thread.sleep(6000);
		log("Click on Ok button");
		jsclick(Save_UpdateButton);
		Thread.sleep(6000);
		log("Click on Update Save button");
		jsclick(Update_Ok_button);
		Thread.sleep(6000);
		log("Click on Ok button");
		jsclick(Properties_option);
		log("Click on Properties Option from Document Viewer menu");
		log("Upload and Verifying Allowing Semicolon Characterfile");
		Thread.sleep(6000);
		log("****************************************************************************************************************");
	}
	
	public void Verify_All_filetypes (int numberOfDocs) throws Exception {
		
	
		
		log("Scenario 20:Verify All Uploaded file types");
		
		for (int i = 1; i <= numberOfDocs; i++) {
			// Construct the XPath with the current index
			String xpath = "//*[@id='docViewerMetaData']/div[" + i + "]";

			System.out.println("print the downloaded xpath details" + xpath);
			WebElement element = driver.findElement(By.xpath(xpath));
			jsclick(element);
			log("Select Uploaded file");
			String Uploaded = element.getAttribute("title");
			log("Uploaded file name with file type is :" + Uploaded);
			Thread.sleep(5000);
			movingclkElement(closedoc);
			Thread.sleep(3000);
			LogoutPage();
			log("=====================================================================================");
		}
	}

	public void Verify_Destination_Folder() throws Exception {

		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		log("Test Scenario 1 : Verifying Destination Folder ");
		Thread.sleep(8000);
		Refresh_Button();
		Thread.sleep(6000);
		log("Click on Refresh button");
		jsclick(NewDocuments_MenuOption);
		Thread.sleep(6000);
		log("Click on New Document Tab");
		jsclick(Destination_Folder_Textbox);
		Thread.sleep(6000);
		log("Click on Destination Folder Textbox");
		jsclick(OK_Button_BrowseforFolder);
		Thread.sleep(6000);
		log("Click on Ok button");
		getFolderSelectMessage();
		Thread.sleep(6000);
		log("Verifying Validation Message");
		selectElement(Select_Cabinet1);
		Thread.sleep(6000);
		log("Expand a Cabinet");
		jsclick(OK_Button_BrowseforFolder);
		Thread.sleep(6000);
		log("Click on Ok button");
		getFolderSelectMessage();
		Thread.sleep(6000);
		log("Verifying Validation message");
		selectElement(Select_Drawer1);
		Thread.sleep(6000);
		log("Expand a Drawer");
		jsclick(OK_Button_BrowseforFolder);
		Thread.sleep(6000);
		log("select a Folder");
		getFolderSelectMessage();
		Thread.sleep(6000);
		log("Verifying Validation message");
		selectElement(Select_Folder1);
		Thread.sleep(6000);
		log("Folder is selected for Templates");
		jsclick(OK_Button_BrowseforFolder);
		log("Select Folder message verified");
		Thread.sleep(6000);
	}

	public void Verify_Asterrisk_Field() throws Exception {

		log("Test Scenario 2 : Verifying Asterrisk Field ");
		Thread.sleep(6000);
		jsclick(getSelect_Document_Type_Dropdown());
		Thread.sleep(6000);
		log("Select value from Document type dropdown");
		jsclick(Create_Button);
		Thread.sleep(6000);
		log("Click on Create button");
		getReportvaluevalidationerror();
		Thread.sleep(6000);
		log("Verifi validation message");
		log("Asterisk field verified");
	}

	public void Create_Emptypage_Document() throws Exception {

		log("Test Scenario 3 : Create Empty page Document ");
		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		Thread.sleep(6000);
		Enter_Report_Name_Text.sendKeys(Specialchar_excelRead(1, 0));
		Thread.sleep(6000);
		log("Enter value into Report Name field");
		jsclick(Create_Button);
		Thread.sleep(6000);
		log("Click on Create button");
		getNavigateDoc();
		log("Click on Navigate button");
		log("Empty page document Created successfully");
		Thread.sleep(6000);
		Refresh_Button();
		Thread.sleep(4000);
		log("Click on Refresh button");
	}

}
