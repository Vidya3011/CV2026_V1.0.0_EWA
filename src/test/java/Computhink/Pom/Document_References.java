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

public class Document_References extends Computhink.Generic.BaseClass {

	public static WebElement element = null;

	public Document_References() {
		PageFactory.initElements(driver, this);
	}
	
	

	@FindBy(xpath = ".//div[@id='viewDocumentnavigator']/ul[1]/li[1]/a[1]")
	private WebElement Select_Cabinet;

	@FindBy(xpath = ".//div[@id='viewDocumentnavigator']/ul[1]/li[1]/ul[1]/li[1]/a[1]")
	private WebElement Select_Drawer;

	@FindBy(xpath = (".//div[@id='viewDocumentnavigator']/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
	private WebElement Select_Folder;

	@FindBy(xpath = ("//*[@id=\"documentListTable\"]/tbody/tr[1]/td[3]"))
	private WebElement Select_Document;

	@FindBy(xpath = ("//*[@id=\"documentListTable\"]/tbody/tr[1]/td[1]/label/span"))
	private WebElement Check_Document1;

	@FindBy(xpath = ("//*[@id=\"documentListTable\"]/tbody/tr[2]/td[1]/label/span"))
	private WebElement Check_Document2;
	
	@FindBy(xpath = "//*[@id=\"navigatorTreeCancle\"]")
	private WebElement Cancel_Button_BrowseforFolder;

	@FindBy(xpath = "//*[@id=\"copyId\"]")
	private WebElement Copy_ID;
	
	@FindBy(xpath = "//*[@id=\"messageButtonNo27\"]")
	private WebElement Nobutton;

	@FindBy(xpath = "//*[@id=\"docReferencePaste\"]")
	private WebElement ReferencePaste;

	@FindBy(xpath = " //*[@id='documentMetaDataViewer']/div/div/div[4]/div/div/span")
	private WebElement Click_References;

	@FindBy(xpath = ("//*[@id=\"referenceTable\"]/tbody/tr[1]/td[1]"))
	private WebElement Open_ReferenceDOC;

	@FindBy(xpath = "//*[@id=\"floatRefButton\"]/i")
	private WebElement DeleteReferenceDoc;

	@FindBy(xpath = "//div[@class='jconfirm-buttons']//button[@type='button'][normalize-space()='Cancel']")
	private WebElement ReferencedocCancelbutton;

	@FindBy(xpath = "//*[@id=\"recentFolders\"]/tbody/tr[1]/td")
	private WebElement Recent_Folder;

	@FindBy(xpath = "//*[@id=\"documentListSubMenu\"]")
	private WebElement MoveTo_Menu_Documents;

	@FindBy(xpath = "//*[@id=\"recentMenuBtn\"]")
	private WebElement MoveTo_Menu_Recent;
	
	@FindBy(xpath = "//*[@id=\"createDocument\"]")
	private WebElement Click_New_Document;
	
	@FindBy(xpath = "//*[@id=\"createDocuemtnLocation\"]")
	private WebElement Destination_Folder_Textbox;

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

	@FindBy(xpath = "//*[@id=\"modelHome\"]")
	private WebElement Navigate_button;
	
	public WebElement getBrowse_Option() {
		WebElement ele = Browse_Option;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele);
		return ele;
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


	public void getMoveTo_Menu_Recent() {
		Actions action = new Actions(driver);
		action.moveToElement(MoveTo_Menu_Recent).build().perform();
	}

	public void getMoveTo_Menu_Documents() {
		Actions action = new Actions(driver);
		action.moveToElement(MoveTo_Menu_Documents).build().perform();

	}

	public void getVerify_CopyandPasteReferences_Document() throws InterruptedException {

		jsclick(Copy_ID);
		Thread.sleep(6000);
		jsclick(Check_Document1);
		jsclick(Check_Document2);
		Thread.sleep(6000);
		Actions action = new Actions(driver);
		action.moveToElement(MoveTo_Menu_Documents).build().perform();
		Thread.sleep(6000);
		jsclick(ReferencePaste);
		Thread.sleep(6000);

	}

	public void Copy_PasteAsReference() throws Exception {

		log("Test Scenario 1 : Verifying Copy and Paste References On documents ");
		try {
			LogDipakUser();
			Thread.sleep(6000);
		}catch (Exception e){
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
		log("Expand a Folder");
		jsclick(Check_Document1);
		Thread.sleep(6000);
		log("Check document Thumbnail");
		getMoveTo_Menu_Documents();
		Thread.sleep(6000);
		log("Mousehover on documents Tab");
		getVerify_CopyandPasteReferences_Document();
		log("Copy and Paste References document");
		Thread.sleep(6000);
		jsclick(Select_Document);
		Thread.sleep(6000);
		try {
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Thread.sleep(6000);
		log("Verified copy and paste References document");
		
		Actions action = new Actions(driver);
		action.moveToElement(Click_References).click().build().perform();
		Thread.sleep(6000);
		log("Click on References Option");
		jsclick(Open_ReferenceDOC);
		Thread.sleep(15000);
		log("Copy and Paste References verified successfully");
		Refresh_Button();
		log("Click on Refresh button");
		Thread.sleep(6000);
	}

	public void Open_Delete_Reference_Document() throws Exception {

		log("Test Scenario 2 : Verifying and Delete References Documents ");
		try {
			LogDipakUser();
			Thread.sleep(6000);
		}catch (Exception e){
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
		Thread.sleep(6000);
		getMoveTo_Menu_Recent();
		Thread.sleep(6000);
		log("Mousehover on Recent Tab");
		jsclick(Recent_Folder);
		Thread.sleep(6000);
		log("Click on Recent Folder");
		Thread.sleep(6000);
		jsclick(Select_Document);
		try {
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Thread.sleep(6000);
		log("Verified Copy and Paste References Document");
		jsclick(Click_References);
		Thread.sleep(6000);
		log("Click on References");
		jsclick(DeleteReferenceDoc);
		Thread.sleep(6000);
		log("Delete added References document");
		jsclick(ReferencedocCancelbutton);
		Thread.sleep(6000);
		log("Click on  Cancel button");
		log("Deleted added References document successfully");
		Refresh_Button();
		log("Click on Refresh button");
		
	}
	
	public void Create_pdf_Documents() throws Exception {
		
		try {
			LogDipakUser();
			Thread.sleep(6000);
		}catch (Exception e){
			System.out.println("User is alreday Logged");
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
		Thread.sleep(6000);
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
		jsclick(OK_Button_BrowseforFolder);
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
		Thread.sleep(6000);
}
}