package Computhink.Pom;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

//NishaR codes

//~~~~~~~~~~~~~~~~~~~~~~~~~~~NishaR codes~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
public class Export extends Computhink.Generic.BaseClass {

	public Export() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"logoutElement\"]")
	private WebElement MyAccount;

	@FindBy(xpath = "//*[@id='idSidenav']/ul/li[5]/a")
	private WebElement Export;

	@FindBy(xpath = ("//*[@id='viewDocumentnavigator']/ul/li[1]/a"))
	private WebElement Select_CabinetDest;

	@FindBy(xpath = ("//*[@id='viewDocumentnavigator']/ul/li[1]/ul/li/a"))
	private WebElement Select_DrawerDest;

	@FindBy(xpath = ("//*[@id=\"notificationMenu\"]"))
	private WebElement NotificationTab;

	@FindBy(xpath = ("//a[@id='advSearchMenuBtn']"))
	private WebElement SearchTab;

	@FindBy(xpath = ("//*[@id=\"advFindBtnLabel\"]"))
	private WebElement findBTN;

	@FindBy(xpath = ("//*[@id='viewDocumentnavigator']/ul/li[1]/ul/li/ul/li/a"))
	private WebElement Select_FolderDest;

	public void ExportBlankDocumenList() throws Exception {
		Thread.sleep(3000);
		log("Step Details: Exporting blank document list");
		jsclick(MyAccount);
		log("Click on  My account tab.");
		Actions act = new Actions(driver);
		log(
				"Logout, What's New, HelpExport, Offline documents, DocuSign documents,Download Outlook drag and dropChange password options are available ");
		act.moveToElement(Export).click().build().perform();
		log("Click on Export button. ");
		log("DocumentList(Current Date)_(DocumentID).csv file will get downloaded");
		log("Click on the downloaded .csv file");
		log(
				"An excel file with following headings will open:Document name, Type, Pages, Created on, Last modified.\r\n"
						+ "If there is no data then it will display as ' No data available in table'");

	}

	public void ExportDocumenList() throws Exception {
		Thread.sleep(3000);
		log("Step Details: Exporting document list");
		Actions act = new Actions(driver);
		log("Navigate a tree till folder level\r\n" + "Lists the documents present in that folder");
		act.moveToElement(Select_CabinetDest).doubleClick().build().perform();
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.until(ExpectedConditions.visibilityOf(Select_DrawerDest));
		act.moveToElement(Select_DrawerDest).doubleClick().build().perform();
		wait.until(ExpectedConditions.visibilityOf(Select_FolderDest));
		Thread.sleep(3000);

		act.moveToElement(Select_FolderDest).doubleClick().build().perform();
		Thread.sleep(8000);
		log("Go to My accounts Tab");
		jsclick(MyAccount);
		log("Export button is enabled");
		Thread.sleep(4000);
		log("Click on Export Button");
		log("DocumentList(Current Date)_(DocumentID).csv file will get downloaded");
		act.moveToElement(Export).click().build().perform();
		log("An excel file with following headings will open \r\n"
				+ "Document name, Type, Pages, Created on, Last modified, Comments, References");

	}

	public void ExportingDocumentListSearchListWithCustomColumns() throws Exception {

	}

	public void ExportingBlankSearch() throws Exception {
		log("Step Details: Exporting blank search list");
		Thread.sleep(3000);
		log("Click on  Search tab and search any value.");
		jsclick(SearchTab);
		Thread.sleep(5000);
		VisiblityOf(findBTN);
		log("Click on My accounts tab.");
		jsclick(findBTN);
		log("Export button is enabled");
		Thread.sleep(8000);
		log("Click on Export button.");
		jsclick(MyAccount);
		Thread.sleep(3000);
		log("SearchList(CurentDate)_(DocumentID).csv file will get downloaded. ");
		VisiblityOf(Export);
		jsclick(Export);
		log(
				"A Downloaded excel file has following headings:Document name, Type, Pages, Created on, Last modified.\r\n"
						+ "As there is no values, it will display as 'No data available in table'");
		jsclick(Refresh_Button(driver));
		Thread.sleep(3000);

	}

	public void DisabledExport() throws Exception {

		log("Step Details: Disabled Export");
		Thread.sleep(4000);
		jsclick(NotificationTab);
		Thread.sleep(5000);
		jsclick(MyAccount);
		log("Click on My accounts tab.");

		log("Export button is disabled");

	}

}