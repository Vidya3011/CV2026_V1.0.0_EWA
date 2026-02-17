package Computhink.Pom;

//Dipak Automation Coading

import java.time.Duration;
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

public class Customcolumns extends Computhink.Generic.BaseClass {

	private static WebElement element = null;

	public Customcolumns() {
		PageFactory.initElements(driver, this);
	}

	// Select From Document Navigator

	@FindBy(xpath = ".//div[@id='viewDocumentnavigator']/ul[1]/li[1]/a[1]")
	private WebElement Select_Cabinet;

	@FindBy(xpath = ".//div[@id='viewDocumentnavigator']/ul[1]/li[1]/ul[1]/li[1]/a[1]")
	private WebElement Select_Drawer;

	@FindBy(xpath = ".//div[@id='viewDocumentnavigator']/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]")
	private WebElement Select_Folder;

	// Select from Search Document Location

	@FindBy(xpath = ("//*[@id='searchDocumentNavigator1']/ul/li[1]/a"))
	private WebElement Search_Cabinet;

	@FindBy(xpath = ("//*[@id='searchDocumentNavigator1']/ul/li[1]/ul/li[1]/a"))
	private WebElement Search_Drawer;

	@FindBy(xpath = ("//*[@id='searchDocumentNavigator1']/ul/li[1]/ul/li/ul/li[1]/a"))
	private WebElement Search_Folder;

	@FindBy(xpath = "//*[@id=\"todoAll\"]")
	private WebElement Select_All_Item;

	@FindBy(xpath = "//*[@id=\"todoResetColumns\"]")
	private WebElement To_Do_Resetcolumn_Option;

	@FindBy(xpath = "//*[@id=\"resetColumsOk\"]")
	private WebElement Reset_Column_OK_Button;

	@FindBy(xpath = "//*[@id=\"spanCheckCustomValues_Document Size\"]")
	private WebElement Select_Indices01;

	@FindBy(xpath = "//*[@id=\"setCustomListdropdown\"]")
	private WebElement Click_DropdownOption;

	@FindBy(xpath = "//*[@id=\"messageButtonNo27\"]")
	private WebElement Nobutton;

	@FindBy(xpath = "//*[@id=\"Resetcolumns\"]")
	private WebElement Room_Reset_CustomColumns;

	@FindBy(xpath = "//*[@id=\"imgSettings\"]")
	private WebElement Setting_Icon;

	@FindBy(xpath = "//*[@id=\"myPreferencesSettingsNav\"]")
	private WebElement My_Preferencesetting;

	@FindBy(xpath = "//*[@id=\"myPreferencesSubmit\"]")
	private WebElement Apply_button;

	@FindBy(xpath = "//*[@id=\"culstomcolsearch\"]")
	private WebElement Search_Custom_Columns_option;

	@FindBy(xpath = "//*[@id=\"spanCheckCustomValues_Document Size\"]")
	private WebElement Search_Select_Indices01;

	@FindBy(xpath = "//*[@id=\"advSearchMenuBtn\"]")
	private WebElement Click_Search_Option;

	@FindBy(xpath = "//*[@id=\"advFindBtnLabel\"]")
	private WebElement Find_Button;

	@FindBy(xpath = "//*[@id=\"Defaultcolsearch\"]")
	private WebElement Search_ResetColumn;

	@FindBy(xpath = "//*[@id=\"todoCustomColumns\"]")
	private WebElement ToDoList_Custom_Columns_option;

	@FindBy(xpath = "//*[@id=\"navigationMenuBtn\"]")
	private WebElement MoveTo_Menu_RoomName;

	@FindBy(xpath = "//*[@id=\"CustomUserTitle\"]/h2")
	private WebElement titelvalidation;

	@FindBy(xpath = "//*[@id=\"setCustomListlabel\"]")
	private WebElement textlvalidation;

	@FindBy(xpath = "//*[@id=\"tittleofcustom\"]/h2")
	private WebElement textlvalidation2;

	@FindBy(xpath = "//*[@id=\"DefaultCustomList\"]")
	private static WebElement ele;

	@FindBy(xpath = "//*[@id=\"DefaultCustomList\"]")
	private static WebElement Default_Button_CustomList;

	@FindBy(xpath = "//button[@id='CustomListOK']")
	private static WebElement Ok_Button_CustomList;

	// Search *

	@FindBy(xpath = "//*[@id=\"advSearchMenuBtn\"]")
	private WebElement MoveTo_Search_Option;

	@FindBy(xpath = "//*[@id=\"CustomUserTitle\"]/h2")
	private WebElement Search_titelvalidation;

	@FindBy(xpath = "//*[@id=\"tittleofcustom\"]/h2")
	private WebElement Search_textvalidation;

	// ToDoList *

	@FindBy(xpath = "//*[@id=\"myTaskMenu\"]")
	private WebElement MoveTo_ToDoList_Option;

	@FindBy(xpath = "//*[@id=\"CustomUserTitleToDoList\"]/h2")
	private static WebElement titlevalidation;

	@FindBy(xpath = "//*[@id=\"CustomListCancel\"]")
	private static WebElement Cancel_Button_CustomList;

	@FindBy(xpath = "//*[@id='CustomListTodoCancel']")
	private static WebElement Cancel_Button_TodoCustomList;

	@FindBy(xpath = "//*[@id=\"CustomListOK\"]")
	private static WebElement Search_Ok_Button_CustomList;

	@FindBy(xpath = "//*[@id=\"tittleoftodoListcustom\"]/h2")
	private static WebElement textvalidation;

	@FindBy(xpath = "//*[@id=\"CustomListTodoOK\"]")
	private static WebElement ToDoList_Ok_Button_CustomList;

	@FindBy(xpath = "//*[@id=\"folderLocationForSearch\"]")
	private static WebElement Document_Location;

	@FindBy(xpath = "//*[@id=\"navigatorTreeOk1\"]")
	private static WebElement Ok_button;

	@FindBy(xpath = "//*[@id=\"copyId\"]")
	private WebElement Copy_ID;

	@FindBy(xpath = "//*[@id=\"pasteid\"]")
	private WebElement Paste_ID;

	@FindBy(xpath = "//*[@id=\"searchInput\"]")
	private WebElement SearchBox;

	@FindBy(xpath = "//*[@id=\"customListModelClose\"]")
	private WebElement Crosscancel;

	@FindBy(xpath = "//*[@id=\"searchInput\"]")
	private WebElement SearchBoxTODO;

	@FindBy(xpath = "//*[@id=\"CustomListCancel\"]")
	private WebElement cancelbutton;

	@FindBy(xpath = "//*[@id=\"CustomListTodoCancel\"]")
	private WebElement cancelTODObutton;

	@FindBy(xpath = "//*[@id=\"customTodoListModelClose\"]")
	private WebElement CrosscancelTODObutton;

	@FindBy(xpath = "//*[@id=\"documentListSubMenu\"]")
	private WebElement MoveTo_Menu_Documents;

	@FindBy(xpath = "//th[contains(text(),'DOCUMENT SIZE')]")
	private static WebElement DocumentSize;

	@FindBy(xpath = "//th[contains(text(),'WORKFLOW STATUS')]")
	private static WebElement WorkflowStatus;

	@FindBy(xpath = "//div[@id='showcustomTodoListModel']//input[@id='searchInput']")
	private WebElement TODOSearchBox;

	@FindBy(xpath = ("//*[@id='spanCheckCustomValuesTodolist_Workflow Status']"))
	private WebElement Select_ToDoIndices;

	@FindBy(xpath = "//*[@id=\"newItems\"]")
	private WebElement ToDoNew_Item;

	@FindBy(xpath = "//*[@id=\"todoPending\"]")
	private WebElement ToDo_Pending;

	@FindBy(xpath = "//*[@id=\"todoReviewed\"]")
	private WebElement ToDoReviewed;

	@FindBy(xpath = "//*[@id=\"todoSentItems\"]")
	private WebElement ToDoSentItem;

	@FindBy(xpath = "//*[@id=\"todoListTable\"]/tbody/tr[1]/td[2]")
	private WebElement Open_ToDoDocument;

	@FindBy(xpath = "//*[@id=\"wfcomments\"]")
	private WebElement WfComment;

	@FindBy(xpath = "//*[@id=\"endwf\"]")
	private WebElement EndWorkflow;

	@FindBy(xpath = "//*[@id=\"wfactionOk\"]")
	private WebElement okbutton;

	@FindBy(xpath = "//*[@id=\"CustomList\"]")
	private WebElement CustomColumnOptionRoom;

	SoftAssert softAssert = new SoftAssert();

	public void Verify_Reset_CustomColumsnSearch() {

		if (Search_ResetColumn.isEnabled() == true) {
			jsclick(Search_ResetColumn);
		}
	}

	public void Verify_Reset_CustomColumsnTodolist() {

		if (To_Do_Resetcolumn_Option.isEnabled() == true) {
			jsclick(To_Do_Resetcolumn_Option);
		}
	}

	public void titelvalidation() {

		String expectedtext = "Custom List";
		String actualtext = titelvalidation.getText();
		softAssert.assertEquals(actualtext, expectedtext);

	}

	public void textvalidation() {

		String expectedtext = "Set custom columns :";
		String actualtext = textlvalidation.getText();
		softAssert.assertEquals(actualtext, expectedtext);
		String expectedtext2 = "Select the indices you want display for documents";
		String actualtext2 = textlvalidation2.getText();
		softAssert.assertEquals(actualtext2, expectedtext2);

	}

	public static void Default_Button_CustomList() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click", Default_Button_CustomList);

	}

	public static void Cancel_Button_CustomList() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click", Cancel_Button_CustomList);

	}

	public WebElement Select_DropdownValue() {

		Select drop = new Select(Click_DropdownOption);
		drop.selectByVisibleText("Room level");
		return element;
	}

	public void Verify_CompactView_checkbox() {
		if (driver.findElement(By.xpath("//*[@id=\"displayCompactViewOfList\"]")).isSelected() == true) {
			jsclick(driver.findElement(By.xpath("//*[@id=\"displayCompactViewOfList\"]")));
		}

	}

	public void Search_titelvalidation() {

		String expectedtext = "Custom List";
		String actualtext = Search_titelvalidation.getText();
		softAssert.assertEquals(actualtext, expectedtext);

	}

	public void Search_textvalidation() {

		String expectedtext = "Select the indices you want display for documents";
		String actualtext = Search_textvalidation.getText();
		softAssert.assertEquals(actualtext, expectedtext);

	}

	public static void Search_Ok_Button_CustomList() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click", Search_Ok_Button_CustomList);

	}

	public void ToDoList_titelvalidation() {

		String expectedtext = "Custom List";
		String actualtext = titlevalidation.getText();
		softAssert.assertEquals(actualtext, expectedtext);

	}

	public void ToDoList_textvalidation() {

		String expectedtext = "Select the indices to display for To Do List documents";
		String actualtext = textvalidation.getText();
		softAssert.assertEquals(actualtext, expectedtext);

	}

	public void MoveTo_Menu_Documents() {
		element = MoveTo_Menu_Documents;
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();

	}

	public void Verify_CopyandPaste_Document() throws InterruptedException {

		jsclick(Copy_ID);
		Thread.sleep(4000);
		element = MoveTo_Menu_Documents;
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		Thread.sleep(9000);
		jsclick(Paste_ID);

	}

	public WebElement SearchBoxIndices1() throws Exception {
		SearchBox.sendKeys(CustomColumns_excelRead(1, 0));
		return SearchBox;
	}

	public WebElement Crosscancel() throws Exception {
		return Crosscancel;
	}

	public void SearchBoxIndices4() throws Exception {
		SearchBox.sendKeys(CustomColumns_excelRead(1, 0));

	}

	public void Verify_Indicess_Value() throws InterruptedException {

		Thread.sleep(4000);
		String expectedtext2 = "DOCUMENT SIZE";
		String actualtext2 = DocumentSize.getText();
		softAssert.assertEquals(actualtext2, expectedtext2);
		log("Indices value displayed successfully " + DocumentSize.getText());
	}

	public void VerifyTodo_Indicess_Value() throws InterruptedException {

		Thread.sleep(4000);
		String expectedtext2 = "WORKFLOW STATUS";
		String actualtext2 = WorkflowStatus.getText();
		softAssert.assertEquals(actualtext2, expectedtext2);
		log("Indices value displayed successfully " + WorkflowStatus.getText());
	}

	public void ToDoEndWorkflow() throws Exception {

		Thread.sleep(9000);
		jsclick(EndWorkflow);
		Thread.sleep(4000);
		jsclick(WfComment);
		Thread.sleep(9000);
		WfComment.sendKeys(CustomColumns_excelRead(3, 0));
		Thread.sleep(9000);
		jsclick(okbutton);

	}

	public void Verify_Custom_List_Dialog() throws Exception {

		log("Test Scenario 1 : Verifying open custom List dialog title ");

		try {
			LogDipakUser();
			Thread.sleep(9000);
		} catch (Exception e) {
			System.out.println("User is alreday Logged");
		}
		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		if (Cancel_Button_CustomList.isDisplayed() == true) {
			movingclkElement(Cancel_Button_CustomList);
		} else {
			// Custom List Dialog not present
		}

		Refresh_Button();
		Thread.sleep(9000);
		log("Click on Refresh button");
		selectElement(Select_Cabinet);
		Thread.sleep(9000);
		log("Expand a Cabinet");
		selectElement(Select_Drawer);
		Thread.sleep(9000);
		log("Expand a Drawer");
		selectElement(Select_Folder);
		Thread.sleep(9000);
		log("Expand a Folder");
		movingElement(MoveTo_Menu_RoomName);
		Thread.sleep(9000);
		log("Moousehover on Roomname Tab");
		try {
			if (Room_Reset_CustomColumns.isEnabled() == true) {
				Thread.sleep(3000);
				jsclick(Room_Reset_CustomColumns);
				log("Click on Reset Column Option");
				jsclick(Reset_Column_OK_Button);
				log("Click on Ok button");
				Thread.sleep(9000);
				log("Custom columns Reset Successfully on Room Level");
			}
		} catch (Exception e) {
			System.out.println("Reset Column Option is Disable");

		}

	}

	public void Verify_Custom_List_Dialog_Text() throws Exception {

		log("Test Scenario 2 : Verifying  text of custom List dialog");

		Refresh_Button();
		Thread.sleep(9000);
		log("Click on Refresh button");
		selectElement(Select_Cabinet);
		Thread.sleep(9000);
		log("Expand a Cabinet");
		selectElement(Select_Drawer);
		Thread.sleep(9000);
		log("Expand a Drawer");
		selectElement(Select_Folder);
		Thread.sleep(9000);
		log("Expand a Folder");
		movingElement(MoveTo_Menu_RoomName);
		Thread.sleep(2000);
		log("Moousehover on Roomname Tab");
		movingclkElement(CustomColumnOptionRoom);
		log("Click on Custom column Option");
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"showcustomlistModel\"]")));
		titelvalidation();
		log("Custom List title validate");
		Thread.sleep(9000);
		textvalidation();
		log("Custom List dialog text verified");
	}

	public void Set_Custom_Column_Node_Level() throws Exception {

		log("Test Scenario 3 : Set and verifying Custom Columns Node Level ");
		Thread.sleep(9000);
		SearchBoxIndices1();
		Thread.sleep(9000);
		log("Enter Indices Name in search textbox field");
		jsclick(Select_Indices01);
		Thread.sleep(9000);
		log("Select entered Indices");
		jsclick(Ok_Button_CustomList);
		log("Click on Ok button");
		log("Indices selected successfully");
		Thread.sleep(12000);
		jsclick(Setting_Icon);
		Thread.sleep(9000);
		log("Click on setting Icon");
		jsclick(My_Preferencesetting);
		Thread.sleep(9000);
		log("Click on My Preferences Option");
		Verify_CompactView_checkbox();
		Thread.sleep(9000);
		log("Uncheck Compact View checkbox");
		movingclkElement(Apply_button);
		Thread.sleep(9000);
		log("Click on Apply button");
		Refresh_Button();
		Thread.sleep(9000);
		log("Click on Refresh button");
		selectElement(Select_Cabinet);
		Thread.sleep(9000);
		log("Expand a Cabinet");
		selectElement(Select_Drawer);
		Thread.sleep(9000);
		log("Expand a Drawer");
		selectElement(Select_Folder);
		Thread.sleep(7000);
		log("Expand a Folder");
		Verify_Indicess_Value();
		log("Verifying Indices and Custom Columns is set Node Level successfully");

	}

	public void Default_Custom_Columns() throws Exception {

		log("Test Scenario 4 : Verifying Default Custom Columns ");
		try {
			LogDipakUser();
			Thread.sleep(9000);
		} catch (Exception e) {
			System.out.println("User is alreday Logged");
		}
		if (Cancel_Button_CustomList.isDisplayed() == true) {
			movingclkElement(Cancel_Button_CustomList);
		} else {
			// Custom List Dialog not present
		}
		Refresh_Button();
		Thread.sleep(9000);
		log("Click on Refresh button");
		selectElement(Select_Cabinet);
		Thread.sleep(9000);
		log("Expand a Cabinet");
		selectElement(Select_Drawer);
		Thread.sleep(9000);
		log("Expand a Drawer");
		selectElement(Select_Folder);
		Thread.sleep(9000);
		log("Expand a Folder");
		movingElement(MoveTo_Menu_RoomName);
		Thread.sleep(9000);
		log("Mousehover on Roomname Tab");
		movingclkElement(CustomColumnOptionRoom);
		log("Click on Custom Column Option");
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(40));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"showcustomlistModel\"]")));
		Default_Button_CustomList();
		Thread.sleep(9000);
		log("Click on Default button");
		jsclick(Ok_Button_CustomList);
		log("Click on Ok button");
		Thread.sleep(9000);
		log("Set and Verifying Default Custom columns successfully");
	}

	public void Cancel_Button_Custom_List() throws Exception {

		log("Test Scenario 5 : Verifying Cancel button of Custom List ");

		if (Cancel_Button_CustomList.isDisplayed() == true) {
			movingclkElement(Cancel_Button_CustomList);
		} else {
			// Custom List Dialog not present
		}
		movingElement(MoveTo_Menu_RoomName);
		log("Mousehover on Roomname Tab");
		Thread.sleep(9000);
		movingclkElement(CustomColumnOptionRoom);
		log("Click on Custom Column Option");
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(40));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"showcustomlistModel\"]")));
		Thread.sleep(9000);
		Cancel_Button_CustomList();
		log("Click on Cancel button");
	}

	public void Custom_Columns_RoomLevel() throws Exception {

		log("Test Scenario 6 : Verifying Custom Columns Room Level ");

		if (Cancel_Button_CustomList.isDisplayed() == true) {
			movingclkElement(Cancel_Button_CustomList);
		} else {
			// Custom List Dialog not present
		}
		Thread.sleep(9000);
		movingElement(MoveTo_Menu_RoomName);
		log("Mousehover on Roomname Tab");
		Thread.sleep(9000);
		movingclkElement(CustomColumnOptionRoom);
		log("Click on Custom Column Option");
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(40));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"showcustomlistModel\"]")));
		Thread.sleep(9000);
		jsclick(Click_DropdownOption);
		log("Click on Dropdown");
		Select_DropdownValue();
		Thread.sleep(9000);
		log("Select Dropdown value");
		jsclick(Ok_Button_CustomList);
		log("Click on Ok button");
		Thread.sleep(9000);
		log("Indices is Selected Successfully for RoomLevel");

	}

	public void Reset_Columns_RoomLevel() throws Exception {

		log("Test Scenario 7 : Verifying Reset Columns Functionality ");
		if (Cancel_Button_CustomList.isDisplayed() == true) {
			movingclkElement(Cancel_Button_CustomList);
		} else {
			// Custom List Dialog not present
		}
		movingElement(MoveTo_Menu_RoomName);
		log("Mousehover on Roomname Tab");
		Thread.sleep(9000);
		jsclick(Room_Reset_CustomColumns);
		Thread.sleep(9000);
		log("Click on Reset Column Option");
		jsclick(Reset_Column_OK_Button);
		log("Click on Ok button");
		log("Custom columns Reset Successfully on Room Level");
	}

	public void Title_Custom_Columns_Search() throws Exception {

		log("Test Scenario 8 : Open Custom List Dialog And Verifying Title Search column ");
		try {
			LogDipakUser();
			Thread.sleep(9000);
		} catch (Exception e) {
			System.out.println("User is alreday Logged");
		}
		if (Cancel_Button_CustomList.isDisplayed() == true) {
			movingclkElement(Cancel_Button_CustomList);
		} else {
			// Custom List Dialog not present
		}
		movingElement(MoveTo_Search_Option);
		Thread.sleep(9000);
		log("Mousehover on Search Tab");
		try {
			Verify_Reset_CustomColumsnSearch();
			Thread.sleep(9000);
			log("Click on Reset Column Option");
			jsclick(Reset_Column_OK_Button);
			Thread.sleep(9000);
			log("Click on Ok button");
			Thread.sleep(9000);
			log("Custom columns Reset Successfully on Search Level");
			movingElement(MoveTo_Search_Option);
			Thread.sleep(9000);
		} catch (Exception e) {
			System.out.println(" Reset Column Option is Disable");
		}
		jsclick(Search_Custom_Columns_option);
		Thread.sleep(12000);
		log("Click on Custom Column Option");
		Search_titelvalidation();
		log("Search Custom List title validate");
	}

	public void Text_Custom_Columns_Search() throws Exception {

		log("Test Scenario 9 : Verifying  Text of Custom List Dialog Search column ");
		Thread.sleep(9000);
		Search_textvalidation();
		log("Search Custom List Dialog Text verified");

	}

	public void Set_Custom_Columns_Search() throws Exception {

		log("Test Scenario 10 : Verifying Set Custom Columns for Search ");
		Thread.sleep(9000);
		SearchBoxIndices4();
		Thread.sleep(9000);
		log("Enter Indices value in Search textbox field");
		jsclick(Search_Select_Indices01);
		Thread.sleep(9000);
		log("Select Entered Indices");
		jsclick(Search_Ok_Button_CustomList);
		log("Click on Ok button");
		log("Indices Selected Successfully");
		Thread.sleep(9000);
		Refresh_Button();
		Thread.sleep(9000);
		log("Click on Refresh button");
		jsclick(Click_Search_Option);
		Thread.sleep(9000);
		log("Click on Search Tab");
		jsclick(Document_Location);
		Thread.sleep(9000);
		log("Click on Document Location textbox");
		selectElement(Search_Cabinet);
		Thread.sleep(9000);
		log("Expand a Cabinet");
		selectElement(Search_Drawer);
		Thread.sleep(9000);
		log("Expand a Drawer");
		selectElement(Search_Folder);
		Thread.sleep(9000);
		log("Expand a Folder");
		jsclick(Ok_button);
		Thread.sleep(9000);
		log("Click on Ok button");
		jsclick(Find_Button);
		Thread.sleep(50000);
		log("Click on Find button");
		Verify_Indicess_Value();
		Thread.sleep(4000);
		log("Verifying and Select Indices Custom Column");
		log("Custom column is set successfully for Search Functionality");
	}

	public void Reset_Custom_Columns_Search() throws Exception {

		log("Test Scenario 11 : Verifying Reset Columns for Search ");
		try {
			LogDipakUser();
			Thread.sleep(9000);
		} catch (Exception e) {
			System.out.println("User is alreday Logged");
		}
		if (Cancel_Button_CustomList.isDisplayed() == true) {
			movingclkElement(Cancel_Button_CustomList);
		} else {
			// Custom List Dialog not present
		}
		movingElement(MoveTo_Search_Option);
		Thread.sleep(9000);
		log("Mousehover on Search Tab");
		jsclick(Search_ResetColumn);
		Thread.sleep(9000);
		log("Click on Reset Column Option ");
		jsclick(Reset_Column_OK_Button);
		Thread.sleep(9000);
		log("Click on Ok button");
		jsclick(Find_Button);
		Thread.sleep(9000);
		log("Click on Find button");
		log("Reset Custom Columns Successfully for Search");
	}

	public void Title_Custom_Columns_TodoList() throws Exception {

		log("Test Scenario 12 : Open Custom List Dialog And Verifying Title ToDoLis ");
		if (Cancel_Button_CustomList.isDisplayed() == true) {
			movingclkElement(Cancel_Button_CustomList);
		} else {
			// Custom List Dialog not present
		}
		if (Cancel_Button_TodoCustomList.isDisplayed() == true) {
			movingclkElement(Cancel_Button_TodoCustomList);
		} else {
			// Custom List Dialog not present
		}
		Refresh_Button();
		Thread.sleep(9000);
		log("Click on Refresh button");
		movingElement(MoveTo_ToDoList_Option);
		Thread.sleep(9000);
		log("Mousehover on ToDoList Tab");
		try {
			Verify_Reset_CustomColumsnTodolist();
			Thread.sleep(9000);
			log("Click on Reset Column Option");
			jsclick(Reset_Column_OK_Button);
			log("Click on Ok button");
			Thread.sleep(9000);
			log("Custom columns Reset Successfully on TodoList Level");
			movingElement(MoveTo_ToDoList_Option);
			Thread.sleep(9000);
		} catch (Exception e) {
			System.out.println(" Reset Column Option is Disable");
		}
		jsclick(ToDoList_Custom_Columns_option);
		Thread.sleep(12000);
		log("Click on Custom Column Option");
		ToDoList_titelvalidation();
		log("ToDoList Custom List title validate");
	}

	public void Text_Custom_Columns_TodoList() throws Exception {

		log("Test Scenario 13: Verifying  Text of Custom List Dialog ToDoList ");
		Thread.sleep(9000);
		ToDoList_textvalidation();
		log("Custom List Dialog Text verified");
		Thread.sleep(9000);

	}

	public void Set_Custom_Columns_TodoList() throws Exception {

		log("Test Scenario 14 : Verifying Set Custom Columns for ToDoList ");

		Thread.sleep(9000);
		TODOSearchBox.click();
		TODOSearchBox.sendKeys(CustomColumns_excelRead(2, 0));
		log("Search Indices value");
		Thread.sleep(9000);
		jsclick(Select_ToDoIndices);
		log("Select Indices value");
		jsclick(ToDoList_Ok_Button_CustomList);
		log("Click on Ok button");
		log("Indices Selected Successfully");
		Thread.sleep(12000);
		Refresh_Button();
		Thread.sleep(9000);
		log("Click on Refresh button");
		movingElement(MoveTo_ToDoList_Option);
		Thread.sleep(9000);
		log("Mousehover on ToDoList Tab");
		jsclick(ToDoNew_Item);
		Thread.sleep(9000);
		log("Click on New Items and Verified Indices Value");
		VerifyTodo_Indicess_Value();
		log("Indices Value display in New Item");
		movingElement(MoveTo_ToDoList_Option);
		Thread.sleep(9000);
		log("Mousehover on ToDoList Tab");
		jsclick(ToDo_Pending);
		Thread.sleep(9000);
		log("Click on Pending Items and Verified Indices Value");
		VerifyTodo_Indicess_Value();
		log("Indices Value display in Pending Item");
		movingElement(MoveTo_ToDoList_Option);
		Thread.sleep(9000);
		log("Mousehover on ToDoList Tab");
		jsclick(ToDoReviewed);
		Thread.sleep(9000);
		log("Click on Reviewed Items and Verified Indices Value");
		VerifyTodo_Indicess_Value();
		log("Indices Value display in Reviewed Item");
		movingElement(MoveTo_ToDoList_Option);
		Thread.sleep(9000);
		log("Mousehover on ToDoList Tab");
		jsclick(ToDoSentItem);
		Thread.sleep(9000);
		log("Click on Sent Items and Verified Indices Value");
		VerifyTodo_Indicess_Value();
		log("Indices Value display in Sent Item");
		movingElement(MoveTo_ToDoList_Option);
		Thread.sleep(9000);
		log("Mousehover on ToDoList Tab");
		jsclick(Select_All_Item);
		Thread.sleep(9000);
		VerifyTodo_Indicess_Value();
		log("Indices Value display in All Item");
		log("Custom column is Verified successfully for ToDoList Functionality");
	}

	public void Reset_Custom_Columns_TodoList() throws Exception {

		log("Test Scenario 15 : Reset Custom Columns for ToDoList ");
		try {
			LogDipakUser();
			Thread.sleep(9000);
		} catch (Exception e) {
			System.out.println("User is alreday Logged");
		}
		if (Cancel_Button_TodoCustomList.isDisplayed() == true) {
			movingclkElement(Cancel_Button_TodoCustomList);
		} else {
			// Custom List Dialog not present
		}
		Thread.sleep(9000);
		movingElement(MoveTo_ToDoList_Option);
		Thread.sleep(9000);
		log("Mousehover on ToDoList Tab");
		jsclick(To_Do_Resetcolumn_Option);
		Thread.sleep(9000);
		log("Click on Reset Column Option");
		jsclick(Reset_Column_OK_Button);
		log("Click on Ok button");
		log("ToDoList Custom column Reset Successfully");
		Refresh_Button();
		log("Click on Refresh button");
		Thread.sleep(9000);
	}

	public void Negative_Default_Custom_Columns_RoomLevel() throws Exception {

		log("Test Scenario 1: Verifying Default Custom Columns RoomLevel");
		try {
			LogDipakUser();
			Thread.sleep(9000);
		} catch (Exception e) {
			System.out.println("User is alreday Logged");
		}
		if (Cancel_Button_CustomList.isDisplayed() == true) {
			movingclkElement(Cancel_Button_CustomList);
		} else {
			// Custom List Dialog not present
		}
		Thread.sleep(9000);
		Refresh_Button();
		Thread.sleep(9000);
		log("Click on Refresh button");
		selectElement(Select_Cabinet);
		Thread.sleep(9000);
		log("Expand a Cabinet");
		selectElement(Select_Drawer);
		Thread.sleep(9000);
		log("Expand a Drawer");
		selectElement(Select_Folder);
		Thread.sleep(9000);
		log("select a Folder");
		movingElement(MoveTo_Menu_RoomName);
		Thread.sleep(4000);
		log("Mousehover to Roomname Tab");
		movingclkElement(CustomColumnOptionRoom);
		log("Click on  Custom Column Option");
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"showcustomlistModel\"]")));
		jsclick(Default_Button_CustomList);
		log("Default Custom Columns Roomlevel Verified");
	}

	public void CrossCancelButton_RoomLevel() throws Exception {

		log("Test Scenario 2: Verifying Cross Cancel button Room Custom Columns");
		Thread.sleep(9000);
		jsclick(Crosscancel);
		log("Click on  Cross button and Close Custom Column dialog");
		log("Cross Cancel button Roomlevel Verified");
	}

	public void CancelButton_RoomCustomColumns() throws Exception {

		log("Test Scenario 3 : Verifying Cancel button Room Custom Columns ");
		Thread.sleep(5000);
		movingElement(MoveTo_Menu_RoomName);
		Thread.sleep(4000);
		log("Mousehover to Roomname Tab");
		movingclkElement(CustomColumnOptionRoom);
		log("Click on  Custom Column Option");
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"showcustomlistModel\"]")));
		jsclick(cancelbutton);
		log("Cancel button Room level Custom columns Verified");
	}

	public void Cross_CancelButton_Search() throws Exception {

		log("Test Scenario 4 : Verifying Cross Cancel button Search Custom Columns");
		try {
			LogDipakUser();
			Thread.sleep(9000);
		} catch (Exception e) {
			System.out.println("User is alreday Logged");
		}
		Thread.sleep(9000);
		movingElement(MoveTo_Search_Option);
		Thread.sleep(9000);
		log("Mousehover to Search Tab");
		jsclick(Search_Custom_Columns_option);
		Thread.sleep(12000);
		log("Click on Search Custom Column Option");
		jsclick(Crosscancel);
		log("Click on Cross cancel button");
		log("Cross cancel button Search custom columns Verified");
	}

	public void CancelButton_Search() throws Exception {

		log("Test Scenario 5: Verifying Cancel button Search Custom Columns");
		try {
			LogDipakUser();
			Thread.sleep(9000);
		} catch (Exception e) {
			System.out.println("User is alreday Logged");
		}
		Thread.sleep(9000);
		movingElement(MoveTo_Search_Option);
		Thread.sleep(9000);
		log("Mousehover to Search Tab");
		jsclick(Search_Custom_Columns_option);
		Thread.sleep(12000);
		log("Click on Custom Column Option");
		jsclick(cancelbutton);
		log("Click on  Cancel button");
		log("Cancel button Search Custom Columns Verified");
	}

	public void Cross_CancelButton_TodoList() throws Exception {

		log("Test Scenario 6: Verifying Cross Cancel button TO DOCustom Columns");
		Thread.sleep(9000);
		movingElement(MoveTo_ToDoList_Option);
		Thread.sleep(9000);
		log("Moushover to ToDoList Tab");
		jsclick(ToDoList_Custom_Columns_option);
		Thread.sleep(9000);
		log("Click on Custom Column Option");
		jsclick(CrosscancelTODObutton);
		log("Click on Cross cancel button");
		log("Cross cancel button TODO List Custom columns Verified");
	}

	public void CancelButton_TodoList() throws Exception {

		log("Test Scenario 7 : Verifying Cancel button TO DOCustom Columns");
		Thread.sleep(9000);
		movingElement(MoveTo_ToDoList_Option);
		Thread.sleep(9000);
		log("Mousehover to ToDoList Tab");
		jsclick(ToDoList_Custom_Columns_option);
		Thread.sleep(12000);
		log("Click on To Do List Custom column Option");
		jsclick(cancelTODObutton);
		Thread.sleep(9000);
		log("Click on Cancel  button ToDo List Dialog ");
		log("TODO list Custom columns Cancel button Verified");
		Refresh_Button();
		log("Click on Refresh button");
	}
}
