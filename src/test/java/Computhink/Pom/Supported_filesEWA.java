package Computhink.Pom;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import Computhink.Generic.BaseClass;

//Dipak codes

//~~~~~~~~~~~~~~~~~~~~~~~~~~~Dipak codes~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
public class Supported_filesEWA extends BaseClass {
	public Supported_filesEWA() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = ("//a[@id='createDocument']"))
	private WebElement NewDocumentID;

	// @FindBy(xpath=("//*[@id='viewDocumentTypeList']"))
	// private WebElement DocTypeList;

	@FindBy(xpath = ("//*[@id='addPagesDropDown']/span"))
	private WebElement AddFileicon;

	@FindBy(xpath = ("//*[@id='createDocuemntNavigator']/ul/li[1]/a"))
	private WebElement NishaCabinet;

	@FindBy(xpath = ("//*[@id='createDocuemntNavigator']/ul/li[1]/ul/li/a"))
	private WebElement NishaDrawer;

	@FindBy(xpath = ("//*[@id='createDocuemntNavigator']/ul/li[1]/ul/li/ul/li[1]/a"))
	private WebElement NishFolder;

	@FindBy(xpath = ("//input[@id='viewDocumentAddPages']"))
	private WebElement Browse;

	@FindBy(xpath = ("//*[@id=\"docTypeList\"]"))
	private WebElement DocTypeList;

	@FindBy(xpath = ("//input[@id='indices_33']"))
	private WebElement IndexValuetextbox;

	@FindBy(xpath = ("//*[@id='createDocuemtnLocation']"))
	private WebElement DestinationFolder;

	@FindBy(xpath = ("//div[@id='addDocdropdwn']"))
	private WebElement menuitem;

	@FindBy(xpath = ("//*[@id='viewCreatedDocument']"))
	private WebElement ViewOption;

	@FindBy(xpath = ("//*[@id='createDocumentSubmit']"))
	private WebElement CreateBTN;

	@FindBy(xpath = ("//div[@id='saveAddedPages']//span[1]"))
	private WebElement SaveTab;

	@FindBy(xpath = ("(//button[@id='messageButtonOK42'])[1]"))
	private WebElement SaveTabOKBTN;

	@FindBy(xpath = ("//*[@id=\"navigatorTreeOk\"]"))
	private WebElement DestinationLocationOKBTN;

	@FindBy(xpath = ("//div[@id='locationDiv']"))
	private WebElement Docfolderdiv;

	@FindBy(id = "docTypeList")
	private WebElement Click_Document_Type_Dropdown;

	@FindBy(xpath = "//*[@id=\"addPagesDropDown\"]/span")
	private WebElement Move_To_PlusIcon;

	@FindBy(xpath = "//*[@id='viewDocumentAddPages']")
	private WebElement Browse_Option;

	@FindBy(xpath = "//*[@id=\"docTypeIndicesTable\"]/tbody/tr/td[2]")
	private WebElement DocumentCVRep;

	@FindBy(xpath = "//*[@id='takeOffLine']")
	private WebElement OfflineBTN;
	
	@FindBy(xpath = "//*[@id=\"messageButtonOK\"]")
	private WebElement SaveOKBTN;
	
	
	@FindBy(xpath = "//*[@id=\"modelHome\"]")
	private WebElement Navigate_button;
	
	@FindBy(xpath = "//*[@id=\"documentListTable\"]/tbody/tr[1]/td[3]")
	private WebElement Open_Document;

	// *[@id="docViewerMetaData"]/div[1]/div/img

	@FindBy(xpath = "//*[@id='docViewerMetaData']/div[1]/div/img")
	private WebElement FirstFileThumbnail;

	// *[@id="messageButtonOK26"]

	@FindBy(xpath = "//*[@id='messageButtonOK26']")
	private WebElement DownloadBTN;

	@FindBy(xpath = "//*[@id=\"messageButtonOK\"]")
	private WebElement DownloadConfirmOKBTN;

	@FindBy(xpath = "//*[@id=\"loadAgainBtn43\"]")
	private WebElement UnableToLoad;
	
	@FindBy(xpath = "//*[@id=\"cvDocumentClose\"]/span")
	private WebElement closedoc;

	public void getSelect_Document_Type_Dropdown() {
		Select drop = new Select(Click_Document_Type_Dropdown);
		drop.selectByVisibleText("CVReports");

	}

	public void create_document_Auto() throws Exception {
		Reporter.log("Scenario 01: Verifying Supported Files", true);
		Thread.sleep(2000);
		jsclick(NewDocumentID);
		Reporter.log("Click on New Document tab", true);
		Thread.sleep(2000);

		jsclick(DestinationFolder);
		Reporter.log("Open Desitination folder dialog", true);
		Thread.sleep(3000);
		selectElement(NishaCabinet);
		Reporter.log("Select Folder", true);
		Thread.sleep(3000);
		selectElement(NishaDrawer);

		Thread.sleep(3000);
		selectElement(NishFolder);
		Thread.sleep(3000);
		jsclick(DestinationLocationOKBTN);
		Thread.sleep(3000);
		Reporter.log("Click on Destination folder dialog OK button", true);
		getSelect_Document_Type_Dropdown();
		Reporter.log("Select a Document type", true);
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		try {

			act.click(DocumentCVRep).sendKeys(readFrmXLNEgative(6, 1)).build().perform();
			Reporter.log("Enter indices value", true);
		} catch (Exception e) {
			System.out.println("Document name not enter failed");
		}

		Thread.sleep(4000);
		jsclick(CreateBTN);
		Reporter.log("Click on Create button", true);
		Thread.sleep(4000);

		jsclick(Navigate_button);
		Thread.sleep(6000);
		Reporter.log("Click on Navigate button", true);
		jsclick(Open_Document);
		Thread.sleep(6000);
		Reporter.log("Select and Open Document", true);
		
		Thread.sleep(6000);
		movingElement(Move_To_PlusIcon);
		Reporter.log("Select Browse icon", true);
		try {

			act.moveToElement(Browse_Option).click().build().perform();
		} catch (JavascriptException e) {
			System.out.println("Exception there");
		}

		Thread.sleep(25000);
		Reporter.log("Add Supported files by using AutoIT script", true);
		String path1 = "D:\\SupporterFiles";  
		File directory = new File(path1);

		// Ensure the directory exists and is not empty
		if (directory.exists() && directory.isDirectory()) {
			File[] flist = directory.listFiles();
			if (flist != null && flist.length > 0) {
				// Prepare a string of file paths for the first 10 files
				StringBuilder filePaths = new StringBuilder();
				int fileCount = 0;
				for (File file : flist) {
					if (file.isFile() && fileCount < 26) {
						if (fileCount > 0) {
							filePaths.append(" "); // Use space to separate file paths
						}
						filePaths.append("\"").append(file.getAbsolutePath()).append("\"");
						fileCount++;
					}
				}

				if (filePaths.length() > 0) {
					try {
						// Execute the AutoIt script with the full file paths as argument
						String command = "D:\\RNishaAutoIt\\FileuploadForFolder.exe " + filePaths.toString();
						Reporter.log("Supported File names With Extention : " + command, true); // Log the command
																									// for verification
						Process process = Runtime.getRuntime().exec(command);
						process.waitFor();
						Reporter.log("All Supported files are uploaded successful", true);
					} catch (IOException | InterruptedException e) {
						System.out.println("Upload Failed");
						e.printStackTrace();
					}
				}
			} else {
				Reporter.log("No files found in directory: " + path1);
			}
		} else {
			Reporter.log("Directory does not exist or is not a directory : " + path1);
		}
		Thread.sleep(8000);

		try {
			WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait2.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Thread.sleep(4000);
		Reporter.log("Click on save button", true);
		jsclick(SaveTab);
		Thread.sleep(3000);
		VisiblityOf(SaveTabOKBTN);
		Reporter.log("Added Supported files are saved successfully...", true);
		jsclick(SaveTabOKBTN);
		Thread.sleep(4000);

	}

	public void FirstDocView() throws Exception {
		Reporter.log("Scenario 02: Verify Supported files Download", true);
		Thread.sleep(3000);
		jsclick(FirstFileThumbnail);
		Reporter.log("Select Supported file", true);
		Thread.sleep(5000);
		jsclick(DownloadBTN);
		Reporter.log("Select Supported file and download successfully", true);

	}

	public void viewAndDownloadDocs(int numberOfDocs) throws Exception {
		
		Reporter.log("Scenario 02:Verify Supported files and Download", true);
		for (int i = 1; i <= numberOfDocs; i++) {
			// Construct the XPath with the current index
			String xpath = "//*[@id='docViewerMetaData']/div[" + i + "]";

			System.out.println("print the downloaded xpath details" + xpath);

			WebElement element = driver.findElement(By.xpath(xpath));
			jsclick(element);
			Reporter.log("Select Supported file", true);
			String Uploaded = element.getAttribute("title");
			Reporter.log("Supported file name with file type :" + Uploaded, true);
			Thread.sleep(5000);
			try {
				jsclick(SaveOKBTN);
			}catch (Exception e) {
				System.out.println("Alert not Present Document opening and supported");
			}
			Thread.sleep(5000);
			jsclick(DownloadBTN);
			Reporter.log("File Downloaded successfully", true);
			Thread.sleep(5000);

				Reporter.log(
						"==============================================================================================================================",
						true);
		}
		
		jsclick(closedoc);
		Reporter.log("Verified All supported files and Closed document successfully", true);
		
	}
	
	

}
