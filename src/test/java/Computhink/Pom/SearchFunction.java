package Computhink.Pom;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.Keys;
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
public class SearchFunction extends BaseClass {

	public static WebElement element = null;

	public SearchFunction() {
		PageFactory.initElements(driver, this);
	}

	public String getSearchString() {
		String searchVal = "";
		// JDBC URL, username, and password of MySQL server
		String jdbcUrl = "jdbc:sqlserver://10.4.8.13:1433;DatabaseName=CV2024B2_64bitDB;SelectMethod=direct;";
		String username = "sa";
		String password = "Cipl@2024!";// syntax@10

		try {
			// Load Microsoft SQL JDBC driver
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

			// Create a connection to the database
			Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

			// Create a statement object
			Statement statement = connection.createStatement();

			// Define your SQL query
			
			String sqlQuery2 = "Select * from Indexer ";

			// Execute the query and get the result set
			ResultSet resultSet = statement.executeQuery(sqlQuery2);

			// Process the result set

			while (resultSet.next()) {
				// int id = resultSet.getInt("id");
				// String Nodeid = resultSet.getString("Nodeid");
				// int PageNo=resultSet.getInt("PageNo");
				String pagecontents = resultSet.getString("PageContents");

				// Add more columns as needed

				// Print the data
				System.out.println("PageContents" + pagecontents);
				// System.out.println("ID: " + id + ", Nodeid: " + Nodeid+ "PageContents"
				// +pagecontents);
				searchVal = pagecontents.substring(0, pagecontents.indexOf(" "));
				if (searchVal != null && searchVal.length() > 0) {
					System.out.println("SearchVal: " + searchVal);
					break;
				}
			}

			// Close resources
			resultSet.close();
			statement.close();
			connection.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return searchVal;
	}

	public String searchStringSQL() {
		String searchVal = "";
		// JDBC URL, username, and password of MySQL server
		String jdbcUrl = "jdbc:sqlserver://10.4.8.13:1433;DatabaseName=CV2024B2_64bitDB;SelectMethod=direct;";
		String username = "sa";
		String password = "Cipl@2024!";

		try {
			// Load Microsoft SQL JDBC driver
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

			// Create a connection to the database
			Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

			// Create a statement object
			Statement statement = connection.createStatement();

			// Define your SQL query
			
			String sqlQuery2 = "Select * from Indexer ";

			// Execute the query and get the result set
			ResultSet resultSet = statement.executeQuery(sqlQuery2);

			// Process the result set

			while (resultSet.next()) {
				// int id = resultSet.getInt("id");
				// String Nodeid = resultSet.getString("Nodeid");
				// int PageNo=resultSet.getInt("PageNo");
				String pagecontents = resultSet.getString("PageContents");

				// Add more columns as needed

				// Print the data
				System.out.println("PageContents" + pagecontents);
				// System.out.println("ID: " + id + ", Nodeid: " + Nodeid+ "PageContents"
				// +pagecontents);
				searchVal = pagecontents.substring(21, 28);
				if (searchVal != null && searchVal.length() > 0) {
					System.out.println("SearchVal: " + searchVal);
					break;
				}
			}

			// Close resources
			resultSet.close();
			statement.close();
			connection.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return searchVal;
	}

	@FindBy(xpath = ("//a[@id='advSearchMenuBtn']"))
	private WebElement SearchTab;

	@FindBy(xpath = ("//button[@id=\"clearSearchBtnLabel\"]"))
	private WebElement ClearButton;

	@FindBy(xpath = ("//input[@id='indexPhrase1']"))
	private WebElement IndexContainsSearch;

	@FindBy(xpath = ("//input[@id='indexPhrase2']"))
	private WebElement TextContainsSearch;

	@FindBy(xpath = ("//span[@id='docTypeSpan']"))
	private WebElement SearchDoctype;

	@FindBy(xpath = ("//span[@id='docCreatorSpan']"))
	private WebElement SearchDocCreator;

	@FindBy(xpath = ("//input[@id='createdDateFrom']"))
	private WebElement CreatedFrom;

	@FindBy(xpath = ("(//img[@id='labelSearchImage2'])[1]"))
	private WebElement fortextcontainsdrpdwnicon;

	@FindBy(xpath = ("//li[@id='textOptionMenu_0']"))
	private WebElement forallofthewordsinText;

	@FindBy(xpath = ("(//li[@id='textOptionMenu_2'])[1]"))
	private WebElement foratleasetoneofthewordText;

	@FindBy(xpath = ("(//li[@id='textOptionMenu_3'])[1]"))
	private WebElement forAtpartofthewordText;

	@FindBy(xpath = ("(//li[@id='indexOptionMenu_0'])[1]"))
	private WebElement forAllofthewords;

	@FindBy(xpath = ("(//input[@id='folderLocationForSearch'])[1]"))
	private WebElement Searchlocation;

	@FindBy(xpath = ("//*[@id='searchDocumentNavigator1']/ul/li[2]/a"))
	private WebElement cabinet;

	@FindBy(xpath = ("//*[@id='searchDocumentNavigator1']/ul/li[2]/ul/li[1]/a"))
	private WebElement drawer;

	@FindBy(xpath = ("//*[@id='searchDocumentNavigator1']/ul/li[2]/ul/li/ul/li[1]/a"))
	private WebElement folder;

	@FindBy(id = ("navigatorTreeOk1"))
	private WebElement OKbuttonforsearchlocation;

	@FindBy(xpath = ("(//th[text()='DOCUMENT NAME'])[5]"))
	private WebElement softAssertValidation;

	@FindBy(xpath = ("//*[@class='e-content e-dropdownbase']/ul/li[2]")) // Change the number
	private WebElement forCVReports;

	@FindBy(xpath = ("//*[@class='e-content e-dropdownbase']//ul//li")) // Change the number
	private WebElement DocumentTypeList;

	@FindBy(xpath = ("//*[@class='e-content e-dropdownbase']/ul/li[2]"))
	private WebElement forCVReportsCSR;

	@FindBy(xpath = ("(//div[@class='elementHeader'])[3]"))
	private WebElement forComments;

	@FindBy(xpath = ("(//div[@class='elementHeader'])[5]"))
	private WebElement forallversionshows;

	@FindBy(xpath = ("//*[@id=\"cancelComments\"]"))
	private WebElement CancelComments;

	@FindBy(xpath = ("(//a[normalize-space()='Summary'])[1]"))
	private WebElement SummaryBTNverify;

	@FindBy(xpath = ("(//h2[text()='Select search location'])[1]"))
	private WebElement SearchSelectLocation;

	@FindBy(xpath = ("//li[text()='aaa']"))
	private WebElement foraaaDoc;

	@FindBy(xpath = ("//input[@class='e-input-filter e-input']"))
	private WebElement forSelectcreatordropdownicon;

	@FindBy(xpath = ("(//select[@class='e-multi-hidden'])[2]"))
	private WebElement forSelectcreatordropdown;

	@FindBy(xpath = ("//*[@class='e-content e-dropdownbase']/ul/li[12]")) // u can change the number to change the																		// user//vwadmin
	private WebElement forDipakcreator;

	@FindBy(xpath = ("//input[@class='e-input-filter e-input']"))
	private WebElement forSelectDocdropdown;

	@FindBy(xpath = ("//*[@id=\"searchArea\"]/fieldset/div[6]/div[1]/div/div/span[5]"))
	private WebElement forSelectDocdropdownicon;

	@FindBy(xpath = ("//*[@class='e-content e-dropdownbase']/ul/li[1]"))
	private WebElement forworkflowReject;

	@FindBy(xpath = ("//*[@class='e-content e-dropdownbase']/ul/li[2]"))
	private WebElement forworkflowPending;

	@FindBy(xpath = ("//*[@class='e-content e-dropdownbase']/ul/li[3]"))
	private WebElement forworkflowCompleted;

	@FindBy(xpath = ("//*[@class='e-content e-dropdownbase']/ul/li[4]"))
	private WebElement forworkflowEndWorkflow;

	@FindBy(xpath = ("//*[@class='e-content e-dropdownbase']/ul/li[5]"))
	private WebElement forworkflowTaskcomplete;

	@FindBy(xpath = ("//a[@id='myTaskMenu']"))
	private WebElement TodolistTab;

	@FindBy(xpath = ("//a[@id='newItems']"))
	private WebElement NewItems;

	// forSeconndDochtml[1]/body[1]/div[56]/div[59]/div[4]/div[2]/div[4]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr[2]/td[3]

	@FindBy(xpath = ("(//td[@class=' document-option'])[5]"))
	private WebElement OpenDocumentForTodoSearch;

	@FindBy(xpath = ("(//a[normalize-space()='Update'])[1]"))
	private WebElement UpdateProperties;

	@FindBy(xpath = ("//*[@id=\"searchDynamicUser\"]"))
	private WebElement findBTN;

	@FindBy(xpath = ("//*[@id=\"spanCheckDynamicUser_ram\"]"))
	private WebElement RamUSer;

	@FindBy(xpath = ("//*[@id=\"navigatorTreeCancle5\"]"))
	private WebElement OKBTNADDName;

	@FindBy(xpath = ("(//a[normalize-space()='Save'])[1]"))
	private WebElement PropertiesUpdateSaveBTN;

	@FindBy(xpath = ("//*[@id=\"CommentsMessageModelOk\"]"))
	private WebElement UpdateDialogOKBTN;

	@FindBy(xpath = ("//*[@id=\"55\"]"))
	private WebElement DynamicNewDoc;

	@FindBy(xpath = ("(//span[@id='viewSendToWrkflw'])[1]"))
	private WebElement sendToWf;

	@FindBy(xpath = ("(//td[normalize-space()='Dynamic wf new'])[1]"))
	private WebElement dynamicwfnew;

	@FindBy(xpath = ("(//button[@id='sidbisendworkflowOk'])[1]"))
	private WebElement applyBTN;

	@FindBy(xpath = ("(//button[@id='CommentsMessageModelOk'])[1]"))
	private WebElement sendwfsuccessdialogOKBTN;

	@FindBy(id = ("Val_305"))
	private WebElement TextKey;

	@FindBy(xpath = ("//*[@id=\"Val_306\"]"))
	private WebElement User1;

	@FindBy(xpath = ("(//select[@id='viewDocumentTypeList'])[1]"))
	private WebElement docTypeDropDown;

	@FindBy(xpath = ("//*[@id=\"searchDynamicUser\"]"))
	private WebElement findbtn;

	@FindBy(xpath = ("//*[@id=\"spanCheckDynamicUser_vidya\"]"))
	private WebElement User1Vidya;

	@FindBy(xpath = ("//*[@id=\"navigatorTreeCancle5\"]"))
	private WebElement usergrpOKBtn;

	@FindBy(xpath = ("//*[@id=\"Val_307\"]"))
	private WebElement User2;

	@FindBy(xpath = ("//*[@id=\"spanCheckDynamicUser_RNisha\"]"))
	private WebElement RNishaUser;

	@FindBy(xpath = ("//*[@id=\"Val_308\"]"))
	private WebElement User3;

	@FindBy(xpath = ("//*[@id=\"todoListTable\"]/tbody/tr[1]/td[2]"))
	private WebElement Open1stDocument;

	@FindBy(xpath = ("//*[@id=\"cvDocumentClose\"]/span"))
	private WebElement PageCloseIcon;

	@FindBy(xpath = ("//*[@id=\"searchArea\"]/fieldset/div[8]/div/span"))
	private WebElement forworkflowdropdown;

	// public List<WebElement> VerifyMetaDataOptions=
	// driver.findElements(By.xpath("(//div[@class=\"detailsModel\"])[1]//span"));

	// public List<WebElement> ExpandMetaData3=
	// driver.findElements(By.xpath("(//div[@class=\"detailsModel\"])[3]//span"));

	@FindBy(xpath = ("//*[@id=\"1\"]/a"))
	private WebElement cabinetCSR;

	@FindBy(xpath = ("//*[@id=\"2\"]/a"))
	private WebElement drawerCSR;

	@FindBy(xpath = ("//*[@id=\"3\"]/a"))
	private WebElement folderCSR;

	@FindBy(xpath = ("//input[@id='indexPhrase2']"))
	private WebElement forExactPhraseText;

	@FindBy(xpath = ("(//button[@class='btn btn-danger summaryActionClass btn-default'])"))
	private WebElement CancelSummary;

	@FindBy(xpath = ("//li[@id='indexOptionMenu_1']"))
	private WebElement forExactPhraseinde;

	@FindBy(xpath = ("//a[@id='navigationMenuBtn']"))
	private WebElement fornavigatetofoldersearch;

	@FindBy(id = ("searchTree"))
	private WebElement searchTree;

	@FindBy(id = ("search-text"))
	private WebElement quicksearch;

	@FindBy(xpath = ("/html/body/div[62]/div[2]/div[2]/table/tbody/tr[2]/td[5]"))
	private WebElement CreatedToDate;

	@FindBy(xpath = ("/html/body/div[63]/div[2]/div[2]/table/tbody/tr[1]/td[6]"))
	private WebElement Createdfromdate;

	@FindBy(xpath = ("//*[@id=\"mc-btn__ok\"]"))
	private WebElement DatePickerOKBTN;

	@FindBy(xpath = ("//*[@id='searchListTable']/tbody/tr[1]/td[2]"))
	private WebElement Metadata;

	@FindBy(xpath = ("//*[@id='searchListTable']/tbody/tr[2]/td[2]"))
	private WebElement MetadataSearch;

	@FindBy(xpath = ("//*[@id=\"totalSearchCount\"]"))
	private WebElement ListedDocumentcount;

	public void getRandomSelectDoc() throws Exception {

		List<WebElement> names = driver.findElements(By.id("searchDiv1"));
		for (WebElement allname : names) {
			String options = allname.getText();
			if (options.contains("doc")) {
				jsclick(metaDataNum2);
				log("Click on metadata option");
				break;
			}

		}

	}

	@FindBy(xpath = ("//*[@id='viewDocumentnavigator']/ul/li[1]/ins"))
	private WebElement Cabinet1;

	@FindBy(xpath = ("//*[@id='viewDocumentnavigator']/ul/li[1]/ul/li/ins"))
	private WebElement Drawer2;

	@FindBy(xpath = ("//*[@id='viewDocumentnavigator']/ul/li[1]/ul/li/ul/li/a"))
	private WebElement FolderVidya;

	@FindBy(xpath = "//*[@id=\"documentListTable\"]/tbody/tr/td[3]")
	private WebElement SearchDocOpen;

	@FindBy(xpath = "(//input[@id='tableFilter'])[1]")
	private WebElement DocIdSearch;

	public void SearchDocumentsTabInPage() throws Exception {
		Thread.sleep(3000);
		log("Open a folder");
		jsclick(Cabinet1);

		// Assert that Cabinet1 is clicked successfully
		SoftAssert so = new SoftAssert();
		so.assertTrue(Cabinet1.isDisplayed(), "Cabinet1 is not opened successfully!");

		Thread.sleep(3000);
		log("Enter document name in folder search text box");
		jsclick(Drawer2);

		// Assert that Drawer2 is clicked successfully
		so.assertTrue(Drawer2.isDisplayed(), "Drawer2 is not opened successfully!");

		Thread.sleep(2000);
		selectElement(FolderVidya);
		log("It should display the particular document on the page");

		// Assert that FolderVidya is selected
		so.assertTrue(FolderVidya.isDisplayed(), "FolderVidya is not selected successfully!");

		Thread.sleep(8000);

		// Document ID Search
		jsclick(DocIdSearch);
		Thread.sleep(4000);
		DocIdSearch.sendKeys(readFromExSearch(3, 2));

		// Assert that the value is entered successfully
		so.assertEquals(DocIdSearch.getAttribute("value"), readFromExSearch(3, 2),
				"Document ID Search failed for input 1!");

		Thread.sleep(8000);

		// Clear and enter the next document ID
		DocIdSearch.clear();
		Thread.sleep(3000);
		DocIdSearch.sendKeys(readFromExSearch(3, 3));

		// Assert that the value is entered successfully
		so.assertEquals(DocIdSearch.getAttribute("value"), readFromExSearch(3, 3),
				"Document ID Search failed for input 2!");

		Thread.sleep(7000);

		// Clear and enter the next document ID
		DocIdSearch.clear();
		DocIdSearch.sendKeys(readFromExSearch(3, 4));

		// Assert that the value is entered successfully
		so.assertEquals(DocIdSearch.getAttribute("value"), readFromExSearch(3, 4),
				"Document ID Search failed for input 3!");

		Thread.sleep(8000);

		// Clear and enter the next document ID
		DocIdSearch.clear();
		DocIdSearch.sendKeys(readFromExSearch(3, 5));

		// Assert that the value is entered successfully
		so.assertEquals(DocIdSearch.getAttribute("value"), readFromExSearch(3, 5),
				"Document ID Search failed for input 4!");

		Thread.sleep(7000);

		// Final check for assertions
		so.assertAll();
	}

	public void SearchDocumentsInTodolistsearchtab() throws Exception {
		WebElement ele = (DocIdSearch);
		jsclick(ele);
		Thread.sleep(4000);
		ele.sendKeys("TestingDemoForSearchTodo");
		Thread.sleep(8000);
	}

	@FindBy(xpath = ("/html/body/div[62]/div[2]/div[2]/table/tbody/tr[2]/td[3]"))
	private WebElement Modifiedfromdate;

	@FindBy(xpath = ("/html/body/div[62]/div[2]/div[2]/table/tbody/tr[2]/td[5]"))
	private WebElement ModifiedTodate;

	@FindBy(xpath = ("(//input[@id='ModifiedDateFrom'])[1]"))
	private WebElement ModifiedFrom;

	@FindBy(xpath = ("(//input[@id='ModifiedDateTo'])[1]"))
	private WebElement ModifiedTo;

	@FindBy(id = ("savedSearchName"))
	private WebElement saveDropdown;

	@FindBy(xpath = ("//img[@id='saveBtnForSaveSearchName']"))
	private WebElement savebotton;

	@FindBy(xpath = ("(//option[@value='0'])[5]"))
	private WebElement newsearch;

	@FindBy(xpath = ("//*[@id='searchListTable']/tbody/tr[3]/td[3]"))
	private WebElement opendocfortext;

	@FindBy(xpath = ("//*[@id='searchListTable']/tbody/tr[4]/td[3]"))
	private WebElement opendocfortextSQL;

	@FindBy(xpath = ("//*[@id=\"docViewerMetaData\"]"))
	private WebElement newdocscroll;

	@FindBy(xpath = ("//*[@id=\"Screenshot_OTP.jpg\"]/div/img"))
	private WebElement highlightdocview;

	public static void ScrollDownBTNText() {
		WebElement scroll = driver.findElement(By.xpath("(//canvas[@class='lt-imageviewer-eventcanvas'])[1]"));
		scrollDown(scroll);

	}

	public static void ScrollDownButton() {
		WebElement scroll = driver.findElement(By.xpath("(//button[normalize-space()='LOAD MORE...'])[1]"));
		scrollDown(scroll);

	}

	@FindBy(xpath = ("//*[@id='searchListTable']/tbody/tr[4]/td[3]"))
	private WebElement opendocforallwrdtext;

	@FindBy(xpath = ("(//button[normalize-space()='LOAD MORE...'])[1]"))
	private WebElement loadMore;

	@FindBy(id = ("newSavedSearchName"))
	private WebElement newsearchvalueenter;

	@FindBy(xpath = ("//*[@id='searchListTable']/tbody/tr[1]/td[2]"))
	private WebElement inMiddleDocOFSeachMetaData;

	@FindBy(xpath = ("//*[@id='searchListTable']/tbody/tr[19]/td[2]"))
	private WebElement afterLoadmoreSeachMetaData;

	@FindBy(xpath = ("//*[@id='searchListTable']/tbody/tr[2]/td[2]"))
	private WebElement metaDataNum2;

	@FindBy(xpath = ("//*[@id='searchListTable']/tbody/tr[3]/td[2]"))
	private WebElement metaDataNum3;

	@FindBy(xpath = ("//*[@id='searchListTable']/tbody/tr[3]/td[3]"))
	private WebElement forRandomdocOpen;

	@FindBy(xpath = ("//select[@id='savedSearchName']"))
	private WebElement savedNamecheck;

	@FindBy(xpath = ("//input[@id='createdDateTo']"))
	private WebElement CreatedTo;

	@FindBy(xpath = ("//input[@id='allVersions']"))
	private WebElement AllVersion;

	@FindBy(xpath = ("//input[@id='includeComment']"))
	private WebElement IncludeComments;

	@FindBy(xpath = ("//input[@id='appendToHitList']"))
	private WebElement AppendToHitlist;

	@FindBy(xpath = ("//input[@id='findInHitList']"))
	private WebElement FindInHitlist;

	@FindBy(xpath = ("//button[@id='advFindBtnLabel']"))
	private WebElement FindButton;

	@FindBy(xpath = ("(//img[@id='labelSearchImage1'])[1]"))
	private WebElement forIndxdropdwnicon;

	@FindBy(xpath = ("(//li[@id='indexOptionMenu_2'])[1]"))
	private WebElement foratleastoneword;

	@FindBy(xpath = ("(//*[@id=\"doctypes\"]/div/div/span[contains(text(),'Document Type')])"))
	private WebElement MetaDataAssertVerify;

	public void SearchTabAssert() throws Exception {
		SoftAssert softAssert = new SoftAssert();

		log("User clicks on Search tab");
		jsclick(SearchTab);
		Thread.sleep(5000);

		if (SearchTab.isDisplayed()) {

			log("Search tab is displayed successfully.");
		} else {
			log("Search tab is NOT displayed.");
		}
		softAssert.assertTrue(SearchTab.isDisplayed(), "Search tab is not displayed");

	}

	public void BlankSearch() throws InterruptedException {
		log("Scenario 01: Search tab - blank search");
		
		Thread.sleep(3000);

		// Initializing SoftAssert
		SoftAssert softAssert = new SoftAssert();

		log("User clicks on Search tab");
		jsclick(SearchTab);
		Thread.sleep(5000);

		if (SearchTab.isDisplayed()) {

			log("Search tab is displayed successfully.");
		} else {
			log("Search tab is NOT displayed.");
		}
		softAssert.assertTrue(SearchTab.isDisplayed(), "Search tab is not displayed");

		log("Click on the Find button");
		jsclick(FindButton);
		Thread.sleep(8000);
		GenerateDocumentCount();

		// Assert if search results are displayed (replace 'documentList' with the
		// actual locator of your results)
		WebElement documentList = driver.findElement(By.xpath("//*[@id=\"documentListDiv\"]")); // Adjust the selector
																								// as needed

		if (documentList.isDisplayed()) {
			log("Document list is displayed after clicking Find button.");
		} else {
			log("Document list is NOT displayed after clicking Find button.");
		}
		softAssert.assertTrue(documentList.isDisplayed(), "Document list was not displayed after clicking Find button");

		log("Click on Clear button");

		jsclick(ClearButton);

		log("Searched document list cleared successfully");

		// Assert that the search results are cleared (i.e., document list is not
		// displayed after clearing)
		softAssert.assertFalse(documentList.isDisplayed(), "Document list was not cleared successfully");

	}

	public void ExactSearchInIndexWithLoadMoreCount() throws InterruptedException, IOException {
		SoftAssert softAssert = new SoftAssert(); // Initialize SoftAssert for collecting multiple assertions

		log("Scenario 02: Search - load more count");
		Thread.sleep(2000);

		// Click Search Tab and check visibility
		jsclick(SearchTab);
		log("User clicks on Search tab");
		Thread.sleep(5000);
		softAssert.assertTrue(SearchTab.isDisplayed(), "Search tab is not displayed.");

		if (SearchTab.isDisplayed()) {
			log("Search tab clicked successfully...");
		} else {
			log("Search tab not clicked");
		}

		// Click Find button and validate that it's clickable or visible
		log("Click on find button");
		jsclick(FindButton);

		WebElement documentList = driver.findElement(By.xpath("//*[@id=\"documentListDiv\"]"));
		Thread.sleep(8000);

		if (documentList.isDisplayed()) {
			log("Document list is displayed after clicking Find button.");
		} else {
			log("Document list is NOT displayed after clicking Find button.");
		}
		softAssert.assertTrue(documentList.isDisplayed(), "Document list is not visible after clicking Find button.");

		// Handle scrolling and clicking 'Load More' button
		try {
			movingclkElement(inMiddleDocOFSeachMetaData);
			Thread.sleep(5000);
			log("Click on metadata option");

			List<WebElement> verifyMetaDataOptions = driver
					.findElements(By.xpath("(//div[@class=\"detailsModel\"])[1]//span"));

			// Check if "Document" is not listed in metadata options
			if (!verifyMetaDataOptions.stream().anyMatch(option -> option.getText().equals("Document"))) {
				log("It should list the below-mentioned options:");
				for (WebElement option : verifyMetaDataOptions) {
					log(option.getText()); // Print each option
				}
			}

			log("Scroll down the searched list; user can now see the 'Load More' button.");
			ScrollDownButton();
			Thread.sleep(5000);

			// Assert that 'Load More' button is visible before clicking
			softAssert.assertTrue(loadMore.isDisplayed(), "'Load More' button is not visible.");
			log("Click on 'Load More' button");
			jsclick(loadMore);
			Thread.sleep(4000);

			if (loadMore.isDisplayed()) {
				log("Load More button clicked");
			} else {
				log("Load More button not present");
			}

			// After clicking Load More, ensure more results are loaded
			scrollDown(afterLoadmoreSeachMetaData);
			Thread.sleep(6000);
			jsclick(afterLoadmoreSeachMetaData);
			Thread.sleep(5000);
			log(
					"It should list the next set of documents; click another document and verify metadata options.");

			if (MetaDataAssertVerify.isDisplayed()) {
				if (!verifyMetaDataOptions.stream().anyMatch(option -> option.getText().equals("Document"))) {
					log("It should list the below-mentioned options:");
					for (WebElement option : verifyMetaDataOptions) {
						log(option.getText());
					}
				} else {
					log("Script failed to expand metadata options.");
				}

				Thread.sleep(8000);
				log("Scroll down the searched list again to show 'Load More' button");
				ScrollDownButton();
				jsclick(loadMore);
				Thread.sleep(3000);

				if (loadMore.isDisplayed()) {
					log("Load More button clicked again");
				} else {
					log("Load More button not present");
				}
			}
		} catch (Exception e) {
			log("Document not listed or an error occurred during loading more data.");
		}

		// Wait for the "No more data found" alert and accept it
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
			wait.until(ExpectedConditions.alertIsPresent());
			log("It should show 'No more data found' warning alert.");
			acceptAlert(); // Handle the alert
			log("Warning alert displayed successfully.");
		} catch (Exception e) {
			log("No alert is present.");
		}

		log("Click on OK button");
		log("It should close the alert dialog successfully.");

		// Clear search
		jsclick(ClearButton);
		log("Click on clear button");

		// Assert all
		softAssert.assertAll();
	}

	public void metaDataAssertVerification() {
		if (MetaDataAssertVerify.isDisplayed()) {
			List<WebElement> ExpandMetaData3 = driver
					.findElements(By.xpath("(//div[@class=\"detailsModel\"])[3]//span"));
			log("It should list below mentioned options:");

			for (WebElement option : ExpandMetaData3) {
				String opt = option.getText();
				log(opt); // This will print each option on a new line
			}
		} else {
			System.out.println("Script is fail to expand metadata option");
		}
	}

	public void GenerateDocumentCount() {

		String DocumentList = ListedDocumentcount.getText();
		log(DocumentList);
		if (DocumentList.contains("Search")) {
			log("Document list verified succesful");
		} else {
			log("Document not listed on the page,Failed");
		}
	}

	public void ExactSearchInIndex() throws Exception {

		log("Scenario 03: Search tab - Index search contains 'Exact Phrase'");
		jsclick(SearchTab);
		log("User clicks on search tab");
		Thread.sleep(5000);

		Actions act = new Actions(driver);
		act.moveToElement(IndexContainsSearch).click().build().perform();
		log("Click on index search contains textbox and select Exact phrase option");

		// Assert that the "IndexContainsSearch" field is visible and editable before
		// typing
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(IndexContainsSearch.isSelected(), "Index search field is not visible.");
		softAssert.assertTrue(IndexContainsSearch.isEnabled(), "Index search field is not enabled.");
		if (IndexContainsSearch.isDisplayed()) {
			log("Exact phrase option selected successful");
		} else {
			log("Exact phrase option NOT selected successful");
		}

		IndexContainsSearch.sendKeys(readFromExSearch(3, 1));
		Thread.sleep(5000);
		log("Click on find button");

		jsclick(FindButton);

		// Assert that the Find button is clicked and results are displayed
		Thread.sleep(8000);
		WebElement documentList = driver.findElement(By.xpath("//*[@id=\"documentListDiv\"]"));
		softAssert.assertTrue(documentList.isDisplayed(), "Document list is not displayed after search.");
		log("It should list the document on the page, document displayed successfully...");
		String DocumentList = ListedDocumentcount.getText();
		log("Generated Document Count = " + DocumentList);
		log("Search tab: Exact phrase index contains search working fine");

		// After selecting a document, validate if the document is selected
		getRandomSelectDoc();
		Thread.sleep(7000);

		// Add an assert here to confirm a document is selected

		softAssert.assertTrue(metaDataNum2.isDisplayed(), "Selected document is not visible.");

		log("Click on Clear button");
		jsclick(ClearButton);
		Thread.sleep(3000);

		// Add an assert here to confirm the search result is cleared

		// Log results
		log("It should clear the searched document list successfully");

	}

	// AlloftheWords search
	public void TextSearchWithSQLData() throws InterruptedException, IOException {

		log("Scenario 19:Search tab- TextContains search 'alloftheword' option");
		log(
				"NOTE:Start the indexer server then execute the mentioned SQL statement 'ALTER FULLTEXT INDEX ON Indexer START FULL POPULATION\r\n"
						+ "Select * from Indexer");
		log("Click on search tab");
		jsclick(SearchTab);
		Thread.sleep(3000);
		fortextcontainsdrpdwnicon.click();
		log("Select text contains 'alloftheword' option");
		Thread.sleep(3000);
		movingclkElement(forallofthewordsinText);
		log("Start the  indexer by using sql statement");
		movingclkElement(TextContainsSearch);
		TextContainsSearch.sendKeys(getSearchString());
		log("Click on find button");
		log("It will automatically  list all the indexed document relate to the search");
		Thread.sleep(3000);
		jsclick(FindButton);
		log("Click on find button");
		Thread.sleep(10000);

		try {
			jsclick(opendocfortext);
			log(
					"open the document from the list, verify the thumbnail it will be highlihted for the particular search.");
		} catch (Exception e) {

			log("AlertNotPresent");
		}
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		log(
				"open the document from the list, verify the thumbnail it will be highlihted for the particular search.");

		try {

			jsclick(opendocfortext);
			if (wait.until(ExpectedConditions.alertIsPresent()) != null) {
				// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				wait.until(ExpectedConditions.alertIsPresent());
				acceptAlert();
			}

		} catch (Exception e) {

			log("AlertNotPresent");
		}
		Thread.sleep(3000);
		scrollDown(newdocscroll);
		// log("It should highlight the document on thumbnail page");
		snap("SearchScrollDownBarIssue");
		Thread.sleep(8000);
		jsclick(Refresh_Button(driver));
		// log.info(" verify Search text contains functionality with all of the words
		// option.");
	}

	// AlloftheWords search
	public void TextSearchWithAllOftheWords() throws InterruptedException, IOException {
		log("Scenario 20:Search tab- TextContains search 'AtLeasetOneOFTheWord' option");
		log(
				"NOTE:Start the indexer server then execute the mentioned SQL statement 'ALTER FULLTEXT INDEX ON Indexer START FULL POPULATION\r\n"
						+ "Select * from Indexer");
		log("Click on search tab");

		jsclick(SearchTab);
		// log("User click on search tab");
		Thread.sleep(3000);
		jsclick(fortextcontainsdrpdwnicon);
		log("Select text contains 'AtLeastOneOFTheWord' option");
		Thread.sleep(3000);
		movingclkElement(forExactPhraseText);

		log("Start the  indexer by using sql statement");
		Thread.sleep(2000);
		jsclick(TextContainsSearch);
		log("It will automatically  list all the indexed document relate to the search");
		TextContainsSearch.sendKeys(readFromExSearch(2, 4));
		Thread.sleep(3000);
		log(
				"open the document from the list, verify the thumbnail it will be highlihted for the particular search.");
		// log("It should highlight the document on thumbnail page");
		jsclick(FindButton);
		Thread.sleep(10000);
		try {
			jsclick(opendocforallwrdtext);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

			if (wait.until(ExpectedConditions.alertIsPresent()) != null) {
				// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				wait.until(ExpectedConditions.alertIsPresent());
				acceptAlert();
			}

		} catch (Exception e) {

			log("AlertNotPresent");
		}
		Thread.sleep(3000);
		// jsclick(sr.gethighlightdocview());
		Thread.sleep(8000);

		jsclick(Refresh_Button(driver));

	}

	// AlloftheWords search
	public void TextSearchWithAtpartOftheWord() throws InterruptedException, IOException {
		log("Scenario 21:Search tab- TextContains search 'AtPartOFTheWord' option");
		log(
				"NOTE:Start the indexer server then execute the mentioned SQL statement 'ALTER FULLTEXT INDEX ON Indexer START FULL POPULATION\r\n"
						+ "Select * from Indexer");
		log("Click on search tab");
		SearchFunction sr = new SearchFunction();
		jsclick(SearchTab);
		log("Click on 'AtpartOFtheWord' word submenu");
		Thread.sleep(3000);
		log("It will automatically  list all the indexed document relate to the search");
		fortextcontainsdrpdwnicon.click();
		Thread.sleep(3000);
		try {
			movingclkElement(foratleasetoneofthewordText);
		} catch (JavascriptException e) {
			log("JavascriptException Handler");
		}
		Thread.sleep(2000);
		log("User click on Find button");
		movingclkElement(TextContainsSearch);
		TextContainsSearch.sendKeys(sr.searchStringSQL());
		Thread.sleep(3000);
		jsclick(FindButton);
		log(
				"open the document from the list, verify the thumbnail it will be highlihted for the particular search.");

		Thread.sleep(5000);
		try {
			jsclick(forRandomdocOpen);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

			if (wait.until(ExpectedConditions.alertIsPresent()) != null) {
				// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				wait.until(ExpectedConditions.alertIsPresent());
				acceptAlert();

				Thread.sleep(3000);

			
			}
		} catch (Exception e) {

			System.out.print("AlertNotPresent");
		}
		Thread.sleep(3000);

		// jsclick(sr.gethighlightdocview());
		Thread.sleep(3000);
		snap("SearchScrollDownBarIssue");
		Thread.sleep(8000);
		jsclick(Refresh_Button(driver));
		// log("User check the thumbnail view highlighted pages...");
		// log("Textcontains search with 'alloftheword' submenu working fine");
		// log.info(" verify Search text contains functionality with all of the words
		// option.");
	}

	public void VerifyDocumentListingOrNot() {
		// Assert document list is displayed
		SoftAssert softAssert = new SoftAssert();
		WebElement documentList = driver.findElement(By.xpath("//*[@id=\"documentListDiv\"]"));
		softAssert.assertTrue(documentList.isDisplayed(), "Document list is not displayed after clicking Find Button.");
		log("It should display document on the page");

	}

	// atleast one word
	public void AtLeastOneWordSeachIndex() throws Exception {
		
		log("Scenario 04: Search tab- Index contains 'AtleastOneOfTheWord'");

		// Assert Search Tab visibility and click on it
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(SearchTab.isDisplayed(), "Search Tab is not visible.");
		jsclick(SearchTab);
		log("User clicks on Search tab");
		Thread.sleep(3000);

		// Assert dropdown icon visibility and click on it
		softAssert.assertTrue(forIndxdropdwnicon.isDisplayed(), "Dropdown icon is not visible.");
		VisiblityOf(forIndxdropdwnicon);
		log("User click on 'AtleastOneOfTheWord' submenu");
		movingclkElement(forIndxdropdwnicon);

		if (foratleastoneword.isDisplayed()) {
			try {
				jsclick(foratleastoneword);
				log("'At least one of the word' option selected successful ");
			} catch (Exception e) {
				log("Atleaser one of the word is not selected script failed...");
			}
		} else {
			log("'At least one of the word' option NOT selected ");
		}

		// Assert IndexContainsSearch visibility and input value
		softAssert.assertTrue(IndexContainsSearch.isDisplayed(), "IndexContainsSearch text box is not visible.");
		softAssert.assertTrue(IndexContainsSearch.isEnabled(), "IndexContainsSearch text box is not enabled.");
		log("User enters the value into index contains text box");
		movingclkElement(IndexContainsSearch);

		sendvalue(IndexContainsSearch, readFromExSearch(1, 1));
		String SentValue = IndexContainsSearch.getAttribute("value");

		if (IndexContainsSearch.isDisplayed()) {
			log("Data entered successful");
			log("Entered Data details:" + SentValue);
		} else {
			log("Data NOT enter for search");
		}

		// Assert FindButton visibility and click on it
		softAssert.assertTrue(FindButton.isDisplayed(), "Find Button is not visible.");
		softAssert.assertTrue(FindButton.isEnabled(), "Find Button is not enabled.");
		movingclkElement(FindButton);
		log("User clicks on find button");
		Thread.sleep(10000);
		GenerateDocumentCount();
		// Assert document list is displayed
		WebElement documentList = driver.findElement(By.xpath("//*[@id=\"documentListDiv\"]"));
		softAssert.assertTrue(documentList.isDisplayed(), "Document list is not displayed after clicking Find Button.");
		log("It should display document on the page");

		// Validate Search functionality working correctly
		log("Search functionality with exact phrase index contains search working fine");

		// Assert ClearButton visibility and click on it
		softAssert.assertTrue(ClearButton.isDisplayed(), "Clear Button is not visible.");
		jsclick(ClearButton);
		log("Click on Clear button");

		// log.info(" verify Index contains search:atleast one of the words search");
	}

	// allofthe word search
	public void E_AllOfTheWordSearchIndex() throws Exception {
		log("Scenario 05:Search tab Index contains 'all of the word'");
		
		Thread.sleep(5000);

		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(SearchTab.isDisplayed(), "Search Tab is not visible.");
		log("Click on Index contains search 'all of the word' submenu");
		softAssert.assertTrue(forIndxdropdwnicon.isDisplayed(), "Dropdown icon is not visible.");
		VisiblityOf(forIndxdropdwnicon);
		movingclkElement(forIndxdropdwnicon);
		log("Enter value in index contains search textbox");

		if (forAllofthewords.isDisplayed()) {
			try {
				jsclick(forAllofthewords);
				log("'All of the word search' option selected successful ");
			} catch (Exception e) {
				//
			}

		} else {
			log("'All of the word search' option NOT selected ");
		}

		softAssert.assertTrue(IndexContainsSearch.isDisplayed(), "IndexContainsSearch text box is not visible.");
		softAssert.assertTrue(IndexContainsSearch.isEnabled(), "IndexContainsSearch text box is not enabled.");
		log("User enters the value into index contains text box");
		movingclkElement(IndexContainsSearch);

		sendvalue(IndexContainsSearch, readFromExSearch(1, 0));
		String SentValue = IndexContainsSearch.getAttribute("value");

		if (IndexContainsSearch.isDisplayed()) {
			log("Data entered successful");
			log("Entered Data details:" + SentValue);
		} else {
			log("Data NOT enter for search");
		}

		log("Click on find button");
		jsclick(FindButton);
		Thread.sleep(8000);
		GenerateDocumentCount();

		log("It should display the document on the page, Document dislpayed successfull...");
		try {

			movingclkElement(metaDataNum3);
			log("Click on meta data option");
			metaDataAssertVerification();
			log("Index contains search 'all of the word' working fine...");
			softAssert.assertTrue(metaDataNum3.isDisplayed(), "Document is not listing on the page");

		}

		catch (Exception e) {
			log("Metadata failed to expand");
		}

		Thread.sleep(8000);
		log("It should display the document on the page, Document dislpayed successfull...");

		log("Index contains search 'all of the word' working fine...");

		Thread.sleep(8000);
		log("Click on clear button");
		jsclick(ClearButton);
		// log.info(" verify Index contains search:all of the word search");
		softAssert.assertTrue(ClearButton.isSelected(), "Clear button NOT selected");
	}

	public void AppendToHit() throws InterruptedException, IOException {
		SoftAssert soft = new SoftAssert();

		Thread.sleep(3000);
		jsclick(SearchTab);
		log("Scenario 06:Search tab - AppendToHitlist checkbox");
		/*
		 * try { movingclkElement(IndexContainsSearch); } catch (JavascriptException e)
		 * { log("JavascriptException handled"); }
		 */
		log("Enter the value into index contains search text box");
		log("First do a normal search for listing the document purpose ");
		sendvalue(IndexContainsSearch, "Document");// readFromExSearch(1, 4)
		String SentValue = IndexContainsSearch.getAttribute("value");

		if (IndexContainsSearch.isDisplayed()) {
			log("Data entered successful");
			log("Entered Data details:" + SentValue);
		} else {
			log("Data NOT enter for search");
		}
		log("Click on find button");
		movingclkElement(FindButton);
		Thread.sleep(8000);
		GenerateDocumentCount();

		VerifyDocumentListingOrNot();
		log("It should list the document on document page");
		IndexContainsSearch.clear();
		log("Clear the index contains search text box,which has given before for normal search");
		Thread.sleep(3000);
		log("Click on append to hit list check box");

		AppendToHitlist.click();
		if (AppendToHitlist.isSelected()) {
			log("Append to hitlist option selected successful");
		} else {
			log("Append to hitlist option NOT selected successful");
		}
		log("After selecting append to hitlist checkbox, Enter the value into index contains search text box ");
		movingclkElement(IndexContainsSearch);
		Thread.sleep(2000);
		sendvalue(IndexContainsSearch, readFromExSearch(2, 3));// dsdfreadFromExSearch(2, 3)
		String AppendGivenData = IndexContainsSearch.getAttribute("value");
		Thread.sleep(2000);
		if (IndexContainsSearch.isDisplayed()) {
			log("Data entered successful");
			log("Entered Data details:" + AppendGivenData);
		} else {
			log("Data NOT enter for search");
		}
		log("User clicks on find button");
		movingclkElement(FindButton);
		Thread.sleep(8000);
		GenerateDocumentCount();
		VerifyDocumentListingOrNot();

		log("It appends the search document in the listed document");
		WebElement AppendDocumentDetails = driver.findElement(By.xpath("(//td[@class=\" customDocName\"])[1]"));
		String DocName = AppendDocumentDetails.getText();
		log("The given document name must match with the  searched document name,");
		if (DocName.isEmpty()) {
			log("Document NOT appends on the page, Failed");
		} else {
			log("Document appends on the page successful; given document name : " + AppendGivenData
					+ "\n Append Document name : " + DocName);
		}

		soft.assertTrue(!DocName.isEmpty(), "Document is failing to list");
		log("===========================================================================");

	}

	public void Find_In_Hit_List() throws InterruptedException, IOException {

		Thread.sleep(3000);
		log("scenario 07: Verify search tab - FindInHitlist checkbox");

		FindInHitlist.click();
		log("Enter the value in index contains search textbox");
		movingclkElement(FindButton);
		log("Click on find in hitlist check box");
		Thread.sleep(3000);
		log("Click on find button");
		FindInHitlist.click();
		Thread.sleep(3000);
		log("It should  display only the  searched document on the document page");
		IncludeComments.click();
		log("===========================================================================");
		log("Scneario 08: Search tab - Include comment checkbox");
		Thread.sleep(3000);
		IndexContainsSearch.clear();
		log("Enter the value in text contains search text box");

		sendvalue(TextContainsSearch, "new");// vidyareadFromExSearch(1, 3)

		movingclkElement(FindButton);
		log("Click on Inclue_comment check box");
		Thread.sleep(10000);
		log("Click on find button");
		try {

			movingclkElement(Metadata);
			Thread.sleep(5000);

			List<WebElement> VerifyMetaDataOptions = driver
					.findElements(By.xpath("(//div[@class=\"detailsModel\"])[1]//span"));

			if (!VerifyMetaDataOptions.contains("Document")) {
				log("It should list below mentioned options:");
				for (WebElement option : VerifyMetaDataOptions) {
					String opt = option.getText();
					log(opt); // This will print each option on a new line
				}
			} else {
				System.out.println("Script is fail to expand metadata option");

			}

			log("It should display the document which is containing the comment..");
			Thread.sleep(8000);
			// log("Expected result and actual result is same test case
			// passed...");
			jsclick(forComments);
			Thread.sleep(3000);
			jsclick(CancelComments);
			Thread.sleep(5000);
			log("Click  on clear button");
		} catch (Exception e) {
			//
		}
		Thread.sleep(2000);
		jsclick(ClearButton);
		log("It should clear the searched list successfully");
		Thread.sleep(3000);
		log("===========================================================================");

	}

	public void All_Version() throws InterruptedException, IOException {
		log("Scneario 09: Search tab - all version check box");
		movingElement(forIndxdropdwnicon);
		log("User enter the value in index contains search text box");
		jsclick(forExactPhraseinde);
		sendvalue(IndexContainsSearch, readFromExSearch(2, 0));
		AllVersion.click();
		log("Click on all version check box");
		movingclkElement(FindButton);
		log("Click on find button");
		Thread.sleep(10000);
		try {
			jsclick(Metadata);
		} catch (Exception e) {
			//
		}
		log("It should display the document which in containing version");
		Thread.sleep(3000);
		log("Click on Clear button");
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf(forallversionshows));
			forallversionshows.click();
			// log("All version function working fine");
			Thread.sleep(8000);
		} catch (Exception e) {
			//
		}

		jsclick(ClearButton);
		// log.info(" verify Allversion/include comments/appendtohitlist /find in hit
		// list functionality working fine");
	}

	// Cabinet/drawer/folder level search in search document location
	public void FolderLevelSearch() throws InterruptedException {
		SoftAssert softAssert = new SoftAssert();
		

		log("Scenario 10: Verify 'Select document location' - folder");

		log("Click on search tab");
		jsclick(SearchTab);
		Thread.sleep(5000);

		log("Click on 'Select search location' textbox");
		movingElement(Searchlocation); // Ensure the element is visible and interactable
		softAssert.assertTrue(Searchlocation.isDisplayed(), "Search location textbox is not visible");
		jsclick(Searchlocation);
		Thread.sleep(5000);
		log("Search select location opened successful");
		if (SearchSelectLocation.isDisplayed()) {
			String NameValidation = SearchSelectLocation.getText();
			log(NameValidation);
			List<WebElement> CabinetNames = driver
					.findElements(By.xpath("//*[@id=\"searchDocumentNavigator1\"]//ul//li"));
			for (WebElement list : CabinetNames) {

				String CabinetDetails = list.getText();
				log("Cabinet list in current room: " + CabinetDetails);

			}
			softAssert.assertEquals(NameValidation, "Select search location");

		} else {
			log("Search select location is NOT opening successful");
		}
		Thread.sleep(5000);

		log("Expand a cabinet");
		ElementToBeClickable(cabinet);

		selectElement(cabinet); // Simulate expanding the cabinet
		Thread.sleep(2000);
		if (cabinet.isDisplayed()) {
			String CabName = cabinet.getText();

			log(CabName + "Cabinet expanded successfully...");
		} else {
			log("There is no cabinet");
		}
		softAssert.assertTrue(cabinet.isDisplayed(), "Cabinet is not displayed after clicking");
		Thread.sleep(5000);

		log("Expand a drawer");
		ElementToBeClickable(drawer);
		selectElement(drawer); // Simulate expanding the drawer
		if (drawer.isDisplayed()) {
			String DrawerName = drawer.getText();

			log(DrawerName + "Drawer expanded successfully...");
		} else {
			log("There is no drawer");
		}
		softAssert.assertTrue(drawer.isDisplayed(), "Drawer is not displayed after clicking");

		log("Select a folder");
		Thread.sleep(3000);
		jsclick(folder);
		if (folder.isDisplayed()) {
			String FolderName = folder.getText();

			log(FolderName + " Named folder selected successful");
		} else {
			log("Folder NOT selected failed");
		}
		softAssert.assertTrue(folder.isDisplayed(), "Folder is not selected properly");

		log("Click on 'Select search location' dialog OK button");
		Thread.sleep(3000);
		jsclick(OKbuttonforsearchlocation);

		softAssert.assertTrue(OKbuttonforsearchlocation.isDisplayed(), "OK button did not function as expected");

		log("Click on find button");
		Thread.sleep(2000);
		jsclick(FindButton);
		// Soft assertion to validate that search results are displayed
		Thread.sleep(5000);
		GenerateDocumentCount();
		VerifyDocumentListingOrNot();
		softAssert.assertTrue(FindButton.isDisplayed(), "Search results validation failed");
		log("It should display the particular selected folder documents on the page");

		Thread.sleep(6000);

		log("Clear search criteria");
		jsclick(ClearButton);
		log("Page cleared successful");
		softAssert.assertTrue(ClearButton.isDisplayed(), "Clear button functionality is not working");

		// log.info("Cabinet/drawer/folder level search in search document location
		// working fine");
	}

	// Robert Codes
	@FindBy(id = ("createdDateFrom"))
	private WebElement DateFrom;
	@FindBy(xpath = ("//tbody[@class='mc-table__body']//tr[1]//td[6]"))
	private WebElement EnterDateFrom;
	@FindBy(id = ("createdDateTo"))
	private WebElement DateTo;
	@FindBy(xpath = ("//tbody[@class='mc-table__body']//tr[2]//td[4]"))
	private WebElement EnterDateTo;
	@FindBy(id = ("mc-btn__ok"))
	private WebElement DataOKButton;

	public void SavedDocumentDateEnter() throws InterruptedException, IOException {
		log("Scenario 25:Verify Date enter functionality");
		log("Click on search tab");
		jsclick(SearchTab);
		Thread.sleep(5000);
		log("Click on Datefrom");
		jsclick(DateFrom);
		Thread.sleep(3000);
		log("Enter the datefrom");
		EnterDateFrom.click();
		Thread.sleep(2000);
		log("Click on ok button");
		jsclick(DataOKButton);
		Thread.sleep(2000);
		log("Click on Dateto");
		jsclick(DateTo);
		Thread.sleep(2000);
		log("Enter the Dateto");
		EnterDateTo.click();
		log("Click on ok button");
		jsclick(DataOKButton);
		Thread.sleep(2000);
		log("Click on find");
		FindButton.click();
		jsclick(Refresh_Button(driver));

	}

	// Cabinet/drawer/ level search in search document location
	public void DrawerLevelSearch() throws InterruptedException {
		SoftAssert softAssert = new SoftAssert();

		log("Scenario 11: Verify 'Select Document location' - drawer");
		

		log("Click on search tab");
		jsclick(SearchTab);
		Thread.sleep(5000);

		log("Click on 'Select Document location' textbox");
		movingElement(Searchlocation); // Used base class

		log("Expand a cabinet");
		jsclick(Searchlocation);
		Thread.sleep(3000);
		if (SearchSelectLocation.isDisplayed()) {
			String NameValidation = SearchSelectLocation.getText();
			log(NameValidation);
			List<WebElement> CabinetNames = driver
					.findElements(By.xpath("//*[@id=\"searchDocumentNavigator1\"]//ul//li"));
			for (WebElement list : CabinetNames) {

				String CabinetDetails = list.getText();
				log("Cabinet list in current room: " + CabinetDetails);

			}
			softAssert.assertEquals(NameValidation, "Select search location");

		} else {
			log("Search select location is NOT opening successful");
		}
		Thread.sleep(5000);

		log("Expand a cabinet");
		ElementToBeClickable(cabinet);

		selectElement(cabinet); // Simulate expanding the cabinet
		Thread.sleep(2000);
		if (cabinet.isDisplayed()) {
			String CabName = cabinet.getText();

			log(CabName + "Cabinet expanded successfully...");
		} else {
			log("There is no cabinet");
		}
		softAssert.assertTrue(cabinet.isDisplayed(), "Cabinet is not displayed after clicking");
		Thread.sleep(5000);

		log("Expand a drawer");
		ElementToBeClickable(drawer);
		selectElement(drawer); // Simulate expanding the drawer
		if (drawer.isDisplayed()) {
			String DrawerName = drawer.getText();

			log(DrawerName + "Drawer expanded successfully...");
		} else {
			log("There is no drawer");
		}
		softAssert.assertTrue(drawer.isDisplayed(), "Drawer is not displayed after clicking");

		log("Click on 'Select Document location' dialog OK button");
		jsclick(OKbuttonforsearchlocation);
		Thread.sleep(2000);
		log("Click on find button");
		jsclick(FindButton);
		Thread.sleep(5000);
		GenerateDocumentCount();
		VerifyDocumentListingOrNot();

		// Soft Assert: Check if the expected element is displayed
		softAssert.assertTrue(FindButton.isDisplayed(), "Soft Assert Failed: Expected element not found.");

		log("It should display the particular drawer document on the page");
		Thread.sleep(6000);

		// Optionally log a message about the status of the assertion
		log("Document list cleared...");

		// Clear the search (after validation)
		jsclick(ClearButton);
		// log.info("Cabinet/drawer/ level search in search document location working
		// fine");
	}

	// Cabinet level search in search document location
	public void CabinetLevel() throws InterruptedException {
		log("Scenario 12: Verify 'Select Document location'- cabinet ");
		SoftAssert softAssert = new SoftAssert();
		
		log("Click on search tab");
		jsclick(SearchTab);
		Thread.sleep(5000);
		log("Click on 'Select Document location' textbox");
		movingElement(Searchlocation);// used base class
		log("Expand a cabinet");
		jsclick(Searchlocation);
		if (SearchSelectLocation.isDisplayed()) {
			String NameValidation = SearchSelectLocation.getText();
			log(NameValidation);
			List<WebElement> CabinetNames = driver
					.findElements(By.xpath("//*[@id=\"searchDocumentNavigator1\"]//ul//li"));
			for (WebElement list : CabinetNames) {

				String CabinetDetails = list.getText();
				log("Cabinet list in current room: " + CabinetDetails);

			}
			softAssert.assertEquals(NameValidation, "Select search location");

		} else {
			log("Search select location is NOT opening successful");
		}
		Thread.sleep(5000);

		log("Expand a cabinet");
		ElementToBeClickable(cabinet);

		selectElement(cabinet); // Simulate expanding the cabinet
		Thread.sleep(4000);
		if (cabinet.isDisplayed()) {
			String CabName = cabinet.getText();

			log(CabName + "Cabinet expanded successfully...");
		} else {
			log("There is no cabinet");
		}
		softAssert.assertTrue(cabinet.isDisplayed(), "Cabinet is not displayed after clicking");
		Thread.sleep(5000);

		jsclick(OKbuttonforsearchlocation);
		Thread.sleep(2000);
		jsclick(FindButton);
		log("Click on find button");
		Thread.sleep(5000);
		GenerateDocumentCount();
		VerifyDocumentListingOrNot();
		// Assert.assertTrue(sr.getsoftAssertvalidation().isDisplayed());
		applyWaitsForAll();
		log("It should display the searched cabinet document on the page");
		Thread.sleep(8000);
		// log("Expected actuall result same.. Test Case passed");
		jsclick(ClearButton);
		log("Document list cleared...");
		// log.info("Cabinet level search in search document location working fine");
	}

	public void DocumentDropDown() throws Exception {
		SoftAssert softAssert = new SoftAssert();

		

		log("Scenario 13: Verify search tab ('Document Type')");

		log("Click on document type dropdown");

		log("User should select a document type");

		// Click on the document type dropdown icon
		movingclkElement(forSelectDocdropdownicon);
		Thread.sleep(3000);
		if (forSelectDocdropdownicon.isDisplayed()) {
			List<WebElement> DropdowndocList = driver
					.findElements(By.xpath("//*[@class='e-content e-dropdownbase']//ul//li"));
			for (WebElement list : DropdowndocList) {
				String DocumentType = list.getText();
				log("Document type List: " + DocumentType);
			}
		} else {
			log("Unable to print document type list");
		}

		Thread.sleep(3000);

		// Select the document type
		movingclkElement(forCVReports);
		Thread.sleep(2000);
		String SelectedDocumenttype = forCVReports.getText();

		if (forCVReports.isDisplayed()) {

			log("Selected document type details: " + SelectedDocumenttype);
			log("Document type selected successfully");
		} else {
			log("Document type NOT selected successfully");
		}

		// Assuming this action selects the document type

		// Soft assertion: Check if the document type is selected (example check)
		softAssert.assertTrue(forCVReports.isDisplayed(),
				"Soft Assert Failed: Document Type dropdown not displayed or selected.");

		jsclick(FindButton);
		log("Click on find button");

		Thread.sleep(8000);
		GenerateDocumentCount();
		WebElement SearchedListDocumentTypeName = driver
				.findElement(By.xpath("(//*[starts-with(@id,'searchTableRow')]//td[4])[1]"));
		if (SearchedListDocumentTypeName.isDisplayed()) {
			String DocumentTypename = SearchedListDocumentTypeName.getText();
			softAssert.assertEquals(DocumentTypename, SelectedDocumenttype);
			log("Selected document type name : " + SelectedDocumenttype + "  Listed document type name: "
					+ DocumentTypename + "  Both should be same name");
			log("Document type name matched successfully...");
		} else {
			log("Documeny type NOT listed successfully...");
		}

		VerifyDocumentListingOrNot();

		log("It should display the searched document type documents on the page");

		jsclick(ClearButton);
		log("Click on clear button; It should clear the search list ");
	}

	// enter value in field and select the user
	public void DocumentCreatorDropDown() throws Exception {

		SoftAssert softAssert = new SoftAssert();

		log("Scenario 14: Verify Search tab ('document creator')");

		

		// Click on search tab
		jsclick(SearchTab);
		log("Click on the search tab");
		Thread.sleep(3000);

		// Select a document creator from the dropdown
		movingclkElement(forSelectcreatordropdown);

		Thread.sleep(2000);
		if (forSelectcreatordropdown.isDisplayed()) {
			log("Document creator dropdown selected successful");

		} else {
			log("Document creator dropdown NOT selected successful");
		}

		log("Select a document creator from the dropdown");

		// Soft assertion: Verify if the document creator dropdown is displayed
		softAssert.assertTrue(forSelectcreatordropdown.isDisplayed(),
				"Soft Assert Failed: Document creator dropdown not displayed or not clickable.");

		Thread.sleep(5000);

		// Select a specific creator

		movingclkElement(forDipakcreator);
		Thread.sleep(3000);
		String SelectedCreator = forDipakcreator.getText();
		List<WebElement> ListedCreatorName = driver
				.findElements(By.xpath("//*[@class='e-content e-dropdownbase']//ul//li"));
		if (forDipakcreator.isDisplayed()) {

			for (WebElement list : ListedCreatorName) {
				String CreatorName = list.getText();
				log("Creator List: " + CreatorName);
			}
		} else {
			log("Document creator list NOT visible");
		}

		log("Select a specific document creator");

		log("Selected creator name details :" + SelectedCreator);

		// Soft assertion: Verify if the selected creator element is displayed
		softAssert.assertTrue(forDipakcreator.isDisplayed(),
				"Soft Assert Failed: Document creator 'Nisha' not selected or not visible.");

		// Click the Find button
		FindButton.click();

		log("Click on find button");

		Thread.sleep(8000);

		GenerateDocumentCount();
		VerifyDocumentListingOrNot();
		WebElement SearchedLstCreatorName = driver
				.findElement(By.xpath("(//*[starts-with(@id,'searchTableRow')]//td[5])[1]"));

		if (SearchedLstCreatorName.isDisplayed()) {
			String ListingCreatorName = SearchedLstCreatorName.getText();
			log("Given creator name :" + SelectedCreator + "Should be same as listed creator name: "
					+ ListingCreatorName);

			log("Document creator name selected successful...");
		} else {
			log("Document creator name NOT selected successful...");
		}

		log("It should display the searched creator documents on the page");

		// Click the Clear button
		ClearButton.click();

		// log.info("Document Creator dropdown working fine..");

	}

	public void Reject_WF() throws InterruptedException {

		log("Scenario 14:Verify Search tab-Workflow status(Reject option)");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		log("Click on workflow status dropdown");
		wait.until(ExpectedConditions.elementToBeClickable(forworkflowdropdown));

		(forworkflowdropdown).click();
		Thread.sleep(2000);
		if (forworkflowdropdown.isDisplayed()) {
			log("Workflowdropdown option expanded successful");
		} else {
			log("Workflowdropdown option NOT expanded successful");
		}

		log("Select Reject option");

		(forworkflowReject).click();
		if (forworkflowReject.isSelected()) {
			log("Workflowdropdown REJECT option selected successful");
		} else {
			log("Workflowdropdown REJECT option NOT selected successful");
		}
		log("Click on find button");
		Thread.sleep(2000);
		jsclick(FindButton);
		log("It should display the rejected workflow documents on the page");
		Thread.sleep(8000);
		GenerateDocumentCount();
		VerifyDocumentListingOrNot();

		movingclkElement(Metadata);
		Thread.sleep(8000);
		try {
			if (SummaryBTNverify.isDisplayed()) {

				jsclick(SummaryBTNverify);

				log("Click on summary button");

				WebElement table = driver.findElement(By.xpath("//*[@id='summaryShowAll']"));

				// Locate all rows within the table body
				List<WebElement> rows = table.findElements(By.xpath(".//tbody/tr"));

				log("<strong>Reject Document Summary Details Mentioned Below:</strong><br>");

				// Start the HTML table
				log("<table border='1' style='border-collapse: collapse; text-align: center;'>");

				log("Reject Document Summary Details Mentioned Below:");

				for (WebElement row : rows) {
					// Start a new table row
					log("<tr>");

					// Locate all cells within the current row
					List<WebElement> cells = row.findElements(By.tagName("td"));

					// Loop through each cell and add it to the table row
					for (WebElement cell : cells) {
						log("<td>" + cell.getText() + "</td>");
					}

					// End the table row
					log("</tr>");
				}

				// End the HTML table
				log("</table><br>");
			}

			log("Summary verified; Rejected Document Listed successfully.");

		} catch (Exception e) {
			log("Unable to REJECT summary Details; failed");
		}

		Thread.sleep(3000);
		jsclick(CancelSummary);

		Thread.sleep(3000);
		if (ClearButton.isDisplayed()) {
			log("Summary cancel button clicked successful");
		} else {
			log("Summary cancel button NOT clicked successfully");
		}

		jsclick(ClearButton);
		log("Click on clear button");
		log("Listed document cleared successfully...");

		log("=================================================================");

	}

	public void PendingWorkflow_Document() throws InterruptedException {
		log("Scenario 15:  Verify Search tab-Workflow status(Pending option)");

		forworkflowdropdown.click();// pending
		Thread.sleep(3000);
		log("Select the workflow dropdown pending Option");
		if (forworkflowdropdown.isDisplayed()) {
			log("Workflowdropdown option expanded successful");
		} else {
			log("Workflowdropdown option NOT expanded successful");
		}

		Thread.sleep(4000);
		forworkflowPending.click();

		Thread.sleep(2000);

		log("Click on find button");
		jsclick(FindButton);

		log("It should display the wrokflow status pending documents on the page");
		Thread.sleep(8000);

		GenerateDocumentCount();
		VerifyDocumentListingOrNot();

		movingclkElement(metaDataNum3);

		List<WebElement> WorkflowOptions = driver.findElements(By.xpath("//*[@id='todobuttons']"));
		if (WorkflowOptions.contains("Reject")) {
			for (WebElement wf : WorkflowOptions) {

				String WorkflowPendingDocOpt = wf.getText();
				log("Below Mentioned workflow options should be display: <br>" + WorkflowPendingDocOpt);
			}

			Thread.sleep(8000);
			
		} else if (SummaryBTNverify.isDisplayed()) {

			jsclick(SummaryBTNverify);

			log("Click on summary button");

			WebElement table = driver.findElement(By.xpath("//*[@id='summaryShowAll']"));

			// Locate all rows within the table body
			List<WebElement> rows = table.findElements(By.xpath(".//tbody/tr"));

			log("<br><strong>Pending Document Summary Details Mentioned Below:</strong><br>");

			// Start the HTML table
			log("<table border='1' style='border-collapse: collapse; text-align: center;'>");

			log("Pending Document Summary Details Mentioned Below:");

			for (WebElement row : rows) {
				// Start a new table row
				log("<tr>");

				// Locate all cells within the current row
				List<WebElement> cells = row.findElements(By.tagName("td"));

				// Loop through each cell and add it to the table row
				for (WebElement cell : cells) {
					log("<td>" + cell.getText() + "</td>");
				}

				// End the table row
				log("</tr>");
			}

			log("</table><br>");

			Thread.sleep(3000);

			jsclick(CancelSummary);

		}

		else {
			log("Document not Listing; failed");
		}

		Thread.sleep(4000);
		jsclick(ClearButton);
		// log.info("workflow pending: documents displayed successfully");
		log("Click on clear button");
		log("Listed document cleared successfully...");
		log("===============================================================================");

	}

	public void VerifySummaryTableDetail() throws Exception {
		if (SummaryBTNverify.isDisplayed()) {

			jsclick(SummaryBTNverify);

			log("Click on summary button");

			WebElement table = driver.findElement(By.xpath("//*[@id='summaryShowAll']"));

			// Locate all rows within the table body
			List<WebElement> rows = table.findElements(By.xpath(".//tbody/tr"));

			log("<br><strong>Worflow Document Summary Details Mentioned Below:</strong><br>");

			// Start the HTML table
			log("<table border='1' style='border-collapse: collapse; text-align: center;'>");

			for (WebElement row : rows) {
				// Start a new table row
				log("<tr>");

				// Locate all cells within the current row
				List<WebElement> cells = row.findElements(By.tagName("td"));

				// Loop through each cell and add it to the table row
				for (WebElement cell : cells) {
					log("<td>" + cell.getText() + "</td>");
				}

				// End the table row
				log("</tr>");

			}

			// End the HTML table
			log("</table><br>");
			Thread.sleep(3000);
			jsclick(CancelSummary);

		} else {
			log("Summary Not verified;Failed.");
		}

	}

	public void CompletedWF_Document() throws Exception {
		log("Scenario 16: Verify Search tab - Workflow status (Workflow Completed option)");
		Thread.sleep(4000);
		SoftAssert Assert = new SoftAssert();

		// Verify the workflow dropdown is clickable and visible
		Assert.assertTrue(forworkflowdropdown.isDisplayed(), "Workflow dropdown is not displayed");
		Assert.assertTrue(forworkflowdropdown.isEnabled(), "Workflow dropdown is not clickable");
		forworkflowdropdown.click();

		// Verify the "Workflow Completed" option is selectable
		Assert.assertTrue(forworkflowCompleted.isDisplayed(), "Workflow Completed option is not displayed");
		Thread.sleep(3000);
		forworkflowCompleted.click();
		log("Selected a workflow dropdown 'Workflow Completed' option");

		jsclick(FindButton);
		log("User clicked on the Find button");

		Thread.sleep(8000);
		GenerateDocumentCount();
		jsclick(metaDataNum2);
		Thread.sleep(4000);
		VerifySummaryTableDetail();
		Thread.sleep(3000);

		jsclick(ClearButton);
		log("Click on clear button");
		Thread.sleep(3000);
		log("Listed documents cleared successfully...");
		log("===============================================================================");

		// Scenario 17: Verify Search tab - Workflow status (End Workflow option)
		log("Scenario 17: Verify Search tab - Workflow status (End Workflow option)");

		forworkflowdropdown.click();
		log("Clicked on workflow dropdown");

		// Verify the "End Workflow" option is selectable
		Assert.assertTrue(forworkflowEndWorkflow.isDisplayed(), "End Workflow option is not displayed");
		forworkflowEndWorkflow.click();
		log("Selected a workflow dropdown 'End Workflow' option");

		jsclick(FindButton);

		log("User clicked on the Find button");

		Thread.sleep(8000);
		GenerateDocumentCount();
		try {
			jsclick(Metadata);
			VerifySummaryTableDetail();
		} catch (Exception e) {
			log("Summary NOT able to view");
		}

		jsclick(ClearButton);
		log("Click on clear button");
		Thread.sleep(3000);
		log("Listed documents cleared successfully...");
		log("===============================================================================");
	}

	public void TaskCompletedWFDocument() throws InterruptedException {
		Thread.sleep(8000);
		forworkflowdropdown.click();
		Thread.sleep(8000);
		log("Scenario 18: Verify Search tab-Workflow status(TaskCompleted option)");
		forworkflowTaskcomplete.click();// taskcompleted
		if (forworkflowTaskcomplete.isDisplayed()) {
			log("Task completed workflow selected successful");
		} else {
			log("Task completed workflow NOT selected successful");
		}
		log("Select a workflow dropdown  Task completed Option");
		jsclick(FindButton);
		log("Click on find button");
		Thread.sleep(8000);
		GenerateDocumentCount();
		try {
			jsclick(Metadata);
			Thread.sleep(3000);
			VerifySummaryTableDetail();
		} catch (Exception e) {
			log("SUmmary is NOT opening");
		}
		jsclick(ClearButton);
		Thread.sleep(3000);

		Thread.sleep(3000);
		// log.info("workflow completed: documents displayed successfully");
		log("Click on clear button");
		log("Listed document cleared successfully...");
		log("===============================================================================");
	}

	// showing saved documents
	public void SavingTheSearchDoc() throws InterruptedException, IOException {

		try {
			log("Select search tab");
			jsclick(saveDropdown);
		} catch (JavascriptException e) {
			//
		}

		log("Scenario 18:Verify Select saved search functionality");

		jsclick(SearchTab);
		log("Select search tab");
		jsclick(saveDropdown);

		log("Click on new search");
		Thread.sleep(3000);
		newsearch.click();
		log("Enter value into new search textbox");
		newsearchvalueenter.sendKeys(readFromExSearch(3, 0));
		Thread.sleep(5000);
		log("Enter value in index contains search textbox");
		sendvalue(IndexContainsSearch, "Document");// readFromExSearch(1, 3)
		sendvalue(IndexContainsSearch, readFromExSearch(1, 3));
		movingclkElement(forSelectDocdropdownicon);
		log("Select a document data type");
		// sr.getforSelectDocdropdown().sendKeys(readFromExSearch(1, 2));
		Thread.sleep(3000);
		log("Selecct a document creator");
		movingclkElement(forCVReports);
		FindButton.click();
		Thread.sleep(5000);
		log("Click on 'select saved search' save icon");
		movingElement(savebotton);

		jsclick(savebotton);
		Thread.sleep(3000);
		movingclkElement((savedNamecheck));
		log("Mouse hover on saved select search dropdown ");
		Thread.sleep(5000);
		log("Click on find");
		ClearButton.click();
		log("It should display the searched document on the page");
		log("Search tab: searched documents saved functionality working fine");
	}

	// TreeIcon search
	public void FolderSerchIcon() throws Exception {
		
		SoftAssert softAssert = new SoftAssert(); // Create an instance of SoftAssert

		log("Scenario 22: Navigation folder icon search");

		// Step 1: Click on navigation folder search icon
		log("Click on navigation folder search icon");
		jsclick(fornavigatetofoldersearch);
		Thread.sleep(3000);
		if (fornavigatetofoldersearch.isDisplayed()) {
			log("Navigation tree icon selected");
		} else {

		}
		log("Navigation tree icon NOT selected");

		// Step 2: Enter value into navigation folder search textbox
		log("Enter value into navigation folder search textbox");
		searchTree.sendKeys(readFromExSearch(1, 3));
		String SentValue = searchTree.getAttribute("value");
		Thread.sleep(3000);

		if (searchTree.isEnabled()) {
			log("Data entered successful; Entered Data Details: " + SentValue);
		} else {
			log("Failed to enter data");
		}

		// Step 3: Press ENTER key
		log("Click on Keyboard ENTER key");
		searchTree.sendKeys(Keys.RETURN); // Tree search
		Thread.sleep(8000);

		// Assertion: Verify folder search dialog is displayed
		log("Folder search dialog should be opened");
		WebElement folderSearchDialog = driver.findElement(By.xpath("//*[@id=\"modelHeaderFolderseachModel\"]/h2"));
		if (folderSearchDialog.isDisplayed()) {
			log("Folder search icon opened successful");
		} else {
			log("Folder search icon NOT opened successful");
		}

		softAssert.assertTrue(folderSearchDialog.isDisplayed(), "Folder search dialog is not displayed!");

		// Step 4: Validate that searched folder documents are displayed

		// Step 5: Close the dialog box
		WebElement CloseIcon = driver.findElement(By.xpath("//*[@id='FolderSearchModelHeaderClose']"));
		jsclick(CloseIcon);

		log("Click on folder document close icon");
		Thread.sleep(4000);

		// Assertion: Verify dialog is closed
		softAssert.assertFalse(folderSearchDialog.isDisplayed(),
				"Folder search dialog is still visible after clicking close!");

		// Log success message
		log("TreeIcon search functionality works fine");

	}

	// Quick search
	public void QuickSearch() throws Exception {
		// Step 1: Enter value into quick search textbox
		Thread.sleep(3000);

		log("Scenario 23: Search tab - Quick search");
		quicksearch.sendKeys(readFromExSearch(2, 1)); // Input search value
		String Enteredvalue = quicksearch.getAttribute("value");
		log("Enter value in quick search textbox");
		if (quicksearch.isDisplayed()) {
			log(Enteredvalue + " Data entered and searched successful");
		} else {
			log("Data is Failing to enter");
		}

		// Step 2: Press ENTER key to perform the quick search
		quicksearch.sendKeys(Keys.RETURN); // Perform the search
		log("Click on Keyboard ENTER key");
		Thread.sleep(15000);
		GenerateDocumentCount();
		VerifyDocumentListingOrNot();
		// Step 3: Add SoftAssert to validate the search results
		SoftAssert so = new SoftAssert();

		// Wait for the results to be visible
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(quicksearch));

		// Assertion: Verify page title contains the search term
		String PageTitle = driver.getTitle();
		so.assertTrue(PageTitle.contains("contentverse"), "Page title does not contain the expected search term!");

		// Reporter log for validation
		log("It should display the searched document on the page successfully...");

		// Step 4: Refresh the page after validation
		jsclick(Refresh_Button(driver));
		log("Page refreshed after search.");

		// Final check for SoftAssert
		// so.assertAll();

	}

	public void DocumentSearch() throws Exception {

		log("Scenario 24:Folder document search");
		SearchDocumentsTabInPage();

		jsclick(Refresh_Button(driver));
		Thread.sleep(5000);
		log("The documents Search from folder completed, working fine");
		// log.info("The documents Search from folder completed, working fine");
	}
}