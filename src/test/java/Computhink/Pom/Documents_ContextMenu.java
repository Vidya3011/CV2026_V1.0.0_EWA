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

import Computhink.Generic.BaseClass;

public class Documents_ContextMenu extends BaseClass {
	// Dipak Automation Pom
	public static WebElement element = null;
	

	public Documents_ContextMenu() {
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

	@FindBy(xpath = ("//*[@id=\"documentListTable\"]/tbody/tr[1]/td[1]/label/span"))
	private WebElement Select_Document;

	@FindBy(xpath = ("//tbody/tr[1]/td[1]/label[1]/span[1]"))
	private WebElement CheckfirstDocument;

	@FindBy(xpath = "//*[@id=\"documentListSubMenu\"]")
	private WebElement MoveTo_Menu_Documents;

	@FindBy(xpath = "//*[@id=\"logoutElement\"]")
	private WebElement Click_Username;

	@FindBy(xpath = "//*[@id=\"idSidenav\"]/ul/li[1]/a")
	private WebElement Click_LogoutOption;

	@FindBy(xpath = "//*[@id=\"messageButtonNo27\"]")
	private WebElement Nobutton;

	@FindBy(xpath = "//*[@id=\"takeOwnership\"]")
	private WebElement Select_Option_TakeOwnership;

	@FindBy(xpath = "//*[@id=\"documentListTable\"]/tbody/tr[1]/td[3]")
	private WebElement Open_Document;

	@FindBy(xpath = "//*[@id=\"docOwnerName\"]")
	private WebElement Docownername;

	@FindBy(xpath = "//*[@id=\"detailsBlock\"]/p[2]/span")
	private WebElement openviewonly;

	@FindBy(xpath = "//*[@id=\"ownershipMessageModelOk\"]")
	private WebElement ownershipmessageok;

	@FindBy(xpath = "//*[@id=\"releaseOwnership\"]")
	private WebElement Select_Option_ReleaseOwnership;

	@FindBy(xpath = "//*[@id=\"refreshDocuments\"]")
	private WebElement Select_Option_Refresh;

	@FindBy(xpath = "//*[@id=\"documentSetcolour\"]")
	private WebElement Select_Option_Catagories_andSet_Colors;

	@FindBy(xpath = "//*[@id=\"CustomColourid_5\"]")
	private WebElement Select_Colors;

	@FindBy(xpath = "//*[@id=\"copyId\"]")
	private WebElement Copy_ID;

	@FindBy(xpath = "//*[@id=\"pasteid\"]")
	private WebElement Paste_ID;

	@FindBy(xpath = "//*[@id=\"cutid\"]")
	private WebElement Cut_ID;

	@FindBy(xpath = "//*[@id=\"delDocument\"]")
	private WebElement deletedoc;

	@FindBy(xpath = "//*[@id=\"deleteMessageOk\"]")
	private WebElement deleteOK;

	@FindBy(xpath = "//*[@id=\"documentListTable\"]/tbody/tr[1]/td[1]/label/span")
	private WebElement checkdoc;

	@FindBy(xpath = "//*[@id=\"documentcreatefav\"]")
	private WebElement createFavorite;

	@FindBy(xpath = "//*[@id=\"createFavText\"]")
	private WebElement createFavoriteText;

	@FindBy(xpath = "//*[@id=\"createFavModelOk\"]")
	private WebElement createFavoriteOK;

	@FindBy(xpath = "//*[@id=\"bookmarkid\"]/img")
	private WebElement bookmark;

	@FindBy(xpath = "//*[@id=\"loadAllfavrites\"]")
	private WebElement loadfav;

	@FindBy(xpath = "//*[@id=\"searchFav\"]")
	private WebElement Searchfav;

	@FindBy(xpath = "//*[@id=\"createfavshowAllModelTabel\"]/tbody/tr[1]/td[1]")
	private WebElement doc;

	@FindBy(xpath = "//table[@id='documentListTable']/tbody/tr/td[3]")
	private WebElement customdoc;

	@FindBy(xpath = "//*[@id=\"ownershipMessageModelOk\"]")
	private WebElement ownershipok;

	@FindBy(xpath = "//*[@id=\"cvDocumentClose\"]/span")
	private WebElement closedoc;

	@FindBy(xpath = "//*[@id=\"btnSignatureAdd\"]/span[1]")
	private WebElement Click_signature_Menuoption;

	@FindBy(xpath = ("//*[@id=\"imageViewerDiv\"]/div[2]/canvas"))
	private WebElement Add_Signature_Onpage;

	@FindBy(xpath = "//*[@id=\"notificationSettings\"]")
	private WebElement notification;

	@FindBy(xpath = "//*[@id=\"contentverseRef\"]")
	private WebElement contref;
	@FindBy(xpath = "//*[@id=\"documentHistory\"]")
	private WebElement dochistory;

	@FindBy(xpath = "//*[@id=\"dropdownNotifylist\"]")
	private WebElement notifylist;

	@FindBy(xpath = "//*[@id=\"spanCheckNotifications_1\"]")
	private WebElement checknotification;

	@FindBy(xpath = "//*[@id=\"notifySaveBtn\"]")
	private WebElement savenotify;

	@FindBy(xpath = "//*[@id=\"general\"]/div/div[1]/span")
	private WebElement general;

	@FindBy(xpath = "//*[@id=\"saveAddedPages\"]/span")
	private WebElement saveaddpage;

	@FindBy(xpath = "//*[@id=\"messageButtonOK42\"]")
	private WebElement okbutton;

	@FindBy(xpath = "//*[@id=\"documentSendTo\"]")
	private WebElement sendTo;

	@FindBy(xpath = "//*[@id=\"sendToMail\"]")
	private WebElement sendToMail;

	@FindBy(xpath = "//*[@id=\"convertToPdfChk\"]")
	private WebElement converttopdf;

	@FindBy(xpath = "//*[@id=\"retainPdfColorExport1\"]")
	private WebElement colorexport;

	@FindBy(xpath = "//*[@id=\"convertToPdfQuality\"]")
	private WebElement pdfquality;

	@FindBy(xpath = "//*[@id=\"certifiedCoverPage\"]")
	private WebElement coverpage;

	@FindBy(xpath = "//*[@id=\"compressToZip\"]")
	private WebElement compresszip;

	@FindBy(xpath = "//*[@id=\"sendToPassword\"]")
	private WebElement sendtopassword;

	@FindBy(xpath = "//*[@id=\"zipPasswordInputpdf\"]")
	private WebElement zippassinput;

	@FindBy(xpath = "//*[@id=\"runAnnotations\"]")
	private WebElement Runannotation;

	@FindBy(xpath = "//*[@id=\"toEmial\"]")
	private WebElement toemail;

	@FindBy(xpath = "//*[@id=\"subjectid\"]")
	private WebElement subid;

	@FindBy(xpath = "//*[@id=\"saveSendToDocument\"]")
	private WebElement savesendto;

	@FindBy(xpath = "(//*[@id=\"messageButtonOK\"]")
	private WebElement sentmailOK;

	@FindBy(xpath = ("(//button[@class='modalDialogButtons'])[1]"))
	private WebElement EmailsuccessMessageDialogboxOK;

	@FindBy(xpath = "//*[@id=\"sendToPrint\"]")
	private WebElement sendtoPrint;

	@FindBy(xpath = "//*[@id=\"certifiedCoverPagePrint\"]")
	private WebElement pageprint;

	@FindBy(xpath = "//*[@id=\"includeRouteSummaryPrint\"]")
	private WebElement summaryprint;

	@FindBy(xpath = "//*[@id=\"unlockRedactionsWithPrint\"]")
	private WebElement withunlockredaction;

	@FindBy(xpath = "//*[@id=\"unlockRedactionsPwdPrint\"]")
	private WebElement pwdunlockredaction;

	@FindBy(xpath = "//*[@id=\"printDocumentOnView\"]")
	private WebElement printview;

	@FindBy(xpath = "//*[@id=\"sendToExport\"]")
	private WebElement sendexport;

	@FindBy(xpath = "//*[@id=\"retainFormatChkExport\"]")
	private WebElement retainchkexport;

	@FindBy(xpath = "//*[@id=\"includeRouteSummary\"]")
	private WebElement Routesummary;

	@FindBy(xpath = "//*[@id=\"zipPasswordInput\"]")
	private WebElement Zippassword;

	@FindBy(xpath = "//*[@id=\"convertToPdfChkExport\"]")
	private WebElement convertpdfexport;

	@FindBy(xpath = "//*[@id=\"exportAnnotations\"]")
	private WebElement exportannotation;

	@FindBy(xpath = "//*[@id=\"unlockRedactionsWithExport\"]")
	private WebElement exportwith;

	@FindBy(xpath = "//*[@id=\"unlockRedactionsPwdExport\"]")
	private WebElement exportPwd;

	@FindBy(xpath = "//*[@id=\"zipPasswordInput\"]")
	private WebElement Zippasswordinput;

	@FindBy(xpath = "//*[@id=\"pdfPasswordInput\"]")
	private WebElement Pdfpasswordinput;

	@FindBy(xpath = "//*[@id=\"sendToSecureMail\"]")
	private WebElement SecureMail;

	@FindBy(xpath = "//*[@id=\"recepientEmailId\"]")
	private WebElement recpmail;

	@FindBy(xpath = "//*[@id=\"confirmEmailIdSecure\"]")
	private WebElement Confirmemail;

	@FindBy(xpath = "//*[@id=\"modifyPermissionCheckbox\"]")
	private WebElement modifychk;

	@FindBy(xpath = "//*[@id=\"navigatorTreeOk32\"]")
	private WebElement navigateOK;

	@FindBy(xpath = "//*[@id=\"recipientMailIdSecond\"]")
	private WebElement recpmailsec;

	@FindBy(xpath = "//*[@id=\"confirmEmailIdSecureSecond\"]")
	private WebElement confirmemailsec;

	@FindBy(xpath = "//*[@id=\"navigatorTreeOk33\"]")
	private WebElement navigateOK2;

	@FindBy(xpath = "//*[@id=\"generateDocumentLink\"]")
	private WebElement generatedoc;

	@FindBy(xpath = "//*[@id=\"documentLinkOk\"]")
	private WebElement doclinkok;

	@FindBy(xpath = "//*[@id=\"messageContentLink\"]")
	private WebElement CopyDoclink;

	@FindBy(xpath = "(//a[normalize-space()='Accept'])[1]")
	private WebElement accept;

	@FindBy(xpath = "//*[@id=\"wfactionOk\"]")
	private WebElement action;

	@FindBy(xpath = "//*[@id=\"wfactionOk\"]")
	private WebElement messageOK;

	@FindBy(xpath = "//*[@id=\"wfcomments\"]")
	private WebElement WFComment;

	@FindBy(xpath = "//*[@id=\"wfactionOk\"]")
	private WebElement actionOK;

	@FindBy(xpath = "//*[@id=\"sendDocAsReference\"]")
	private WebElement Referencemail;

	@FindBy(xpath = "//*[@id=\"myTaskMenu\"]")
	private WebElement MoveTo_ToDoList_Option;

	@FindBy(xpath = "//*[@id=\"todoAll\"]")
	private WebElement Select_All_Item;

	@FindBy(xpath = "//*[@id=\"todoListTable\"]/tbody/tr[1]/td[2]")
	private WebElement Open_ToDoDocument;

	@FindBy(xpath = "//*[@id=\"imgSettings\"]")
	private WebElement Setting_Icon;

	@FindBy(xpath = "//*[@id=\"CommentsMessageModelOk\"]")
	private WebElement WorkflowOKBtn;

	@FindBy(xpath = "//*[@id=\"myPreferencesSettingsNav\"]")
	private WebElement My_Preferencesetting;

	@FindBy(xpath = "//*[@id=\"myPreferencesSubmit\"]")
	private WebElement Apply_button;

	@FindBy(xpath = "//*[@id=\"defaultOfficeDocViewListNo\"]")
	private WebElement Select_Office_document_Defaultviewing;

	@FindBy(xpath = "//*[@id=\"defaultPdfDocViewListNo\"]")
	private WebElement Pdf_document_Defaultviewing;

	@FindBy(xpath = "//*[@id=\"signInputPasswordL\"]")
	private WebElement signinputpassword;

	@FindBy(xpath = "//*[@id=\"verifySignaturePasswordL\"]")
	private WebElement verifypassok;

	@FindBy(xpath = "//*[@id=\"messageContent\"]")
	private WebElement messageContent;

	@FindBy(xpath = "//*[@id=\"messageButtonOK\"]")
	private WebElement messageok;

	@FindBy(xpath = "//*[@id=\"ccEmail\"]")
	private WebElement CCEmailID;

	@FindBy(xpath = "//*[@id=\"cancelSendToDocument\"]")
	private WebElement DialogCancel;

	@FindBy(xpath = "//*[@id=\"cancelPrintBtn\"]")
	private WebElement PrintDialogCancel;

	@FindBy(xpath = "//*[@id=\"navigatorTreeOk33\"]")
	private WebElement SecureOK;

	@FindBy(xpath = "//*[@id=\"navigatorTreeCancle33\"]")
	private WebElement SecureDialogCancel;

	@FindBy(xpath = "//*[@id=\"messageButtonOK\"]")
	private WebElement SecureMessageOK;

	@FindBy(xpath = "//*[@id=\"wfactionCancel\"]")
	private WebElement wfactionCancel;

	@FindBy(xpath = "//*[@id=\"wfactionTaskDescription\"]")
	private WebElement Workflowtask;

	@FindBy(xpath = "//div[@class='jconfirm-buttons']//button[@type='button'][normalize-space()='Cancel']")
	private WebElement CancelWorkflowtask;

	@FindBy(xpath = "//*[@id=\"wfactionOk\"]")
	private WebElement wfaction;

	@FindBy(xpath = "//button[@class='btn btn-danger summaryActionClass btn-default']")
	private WebElement SummaryCancel;

	// Offlline document

	@FindBy(xpath = "//input[@class='thumbnailOptionSelected']")
	private WebElement SelectCheckbox;

	@FindBy(xpath = ".//div[@id='toolbarId']/div[8]/div[1]/span[1]")
	private WebElement pageofflinemenu;

	@FindBy(xpath = "//button[@id='messageButtonOK']")
	private WebElement clickokbutton;

	@FindBy(xpath = "//*[@id=\"logoutElement\"]")
	private WebElement Username;

	@FindBy(xpath = "//a[@id='syncDocuments']")
	private WebElement offlinedoc;

	@FindBy(className = "document-sync")
	private WebElement checkofflinedoc;

	@FindBy(xpath = "//*[@id=\"releasesyncbtn\"]")
	private WebElement ReleaseDoc;

	@FindBy(xpath = "//*[@id=\"recentMenuBtn\"]")
	private WebElement MoveTo_Menu_Recent;

	@FindBy(xpath = "//*[@id=\"recentFolders\"]/tbody/tr[1]/td")
	private WebElement Recent_Folder;

	@FindBy(xpath = "(//a[normalize-space()='Comment'])[1]")
	private WebElement Comment;

	@FindBy(xpath = "(//a[normalize-space()='Reject'])[1]")
	private WebElement Reject;

	@FindBy(xpath = "(//a[normalize-space()='End Workflow'])[1]")
	private WebElement EndWorkflow;

	@FindBy(xpath = "(//a[normalize-space()='Summary'])[1]")
	private WebElement Summary;

	public void getVerify_Ownership_Message() throws InterruptedException {
		WebElement Message1 = Docownername;
		log(Message1.getText() + " this message should show");
		WebElement Message2 = openviewonly;
		log(Message2.getText() + " this message should show");
		jsclick(ownershipmessageok);

	}

	public void getSelect_Option_TakeOwnership() {
		element = Select_Option_TakeOwnership;
		WebElement ele1 = Select_Option_TakeOwnership;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele1);
	}

	public void getMoveTo_Menu_Documents() {
		Actions action = new Actions(driver);
		action.moveToElement(MoveTo_Menu_Documents).build().perform();

	}

	public void getSelect_Option_ReleaseOwnership() {
		WebElement ele1 = Select_Option_ReleaseOwnership;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele1);

	}

	public void getSelect_Option_Refresh() {
		WebElement ele1 = Select_Option_Refresh;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele1);

	}

	public void getSelect_Option_Catagories_andSet_Colors() throws InterruptedException {
		Thread.sleep(2000);
		jsclick(Select_Option_Catagories_andSet_Colors);
		Thread.sleep(6000);
		jsclick(Select_Colors);

	}

	public void getVerify_CopyandPaste_Document() throws InterruptedException {
		jsclick(Copy_ID);
		Thread.sleep(6000);
		log("Click on the Copy Option");
		element = MoveTo_Menu_Documents;
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		Thread.sleep(6000);
		log("Move to the Menu Documents Tab");
		jsclick(Paste_ID);
		log("Click on the Paste Option");
	}

	public void getVerify_CutandPaste_Document() throws InterruptedException {

		jsclick(Cut_ID);
		Thread.sleep(6000);
		log("Click on the Cut Option");
		/*
		 * selectElement(Select_subFolder); Thread.sleep(6000);
		 * log("Select Subfolder");
		 */
		element = MoveTo_Menu_Documents;
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		Thread.sleep(6000);
		log("Move to the Mennu Documents");
		jsclick(Paste_ID);
		Thread.sleep(6000);
		log("Click on the Paste ID");
	}

	public void getVerify_Delete_Document() throws InterruptedException {

		Thread.sleep(6000);
		log("Check the Document ");
		element = MoveTo_Menu_Documents;
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		Thread.sleep(6000);
		log("Move to the menu Document Tab");
		jsclick(deletedoc);
		Thread.sleep(6000);
		log("Click on the Delete Document");
		jsclick(deleteOK);
		log("Click on the Ok Button and document deleted successfully");
	}

	public void getVerify_CreateFavorites_Document() throws Exception {

		Thread.sleep(6000);
		jsclick(checkdoc);
		Thread.sleep(6000);
		log("Check the Document");
		element = MoveTo_Menu_Documents;
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		log("Move to the Document page");
		jsclick(createFavorite);
		Thread.sleep(6000);
		log("Click on the create Favorite Option");
		createFavoriteText.clear();
		Thread.sleep(6000);
		log("Enter the Favorite document name");
		createFavoriteText.sendKeys(DocumentsContext_excelRead(1, 2));
		Thread.sleep(6000);
		jsclick(createFavoriteOK);
		log("Click on the Ok Button");
	}

	public void getOpen_CreateFavorites_Document() throws Exception {
		Thread.sleep(6000);
		Actions action = new Actions(driver);
		action.moveToElement(bookmark).perform();
		Thread.sleep(6000);
		jsclick(loadfav);
		Thread.sleep(6000);
		jsclick(Searchfav);
		Thread.sleep(6000);
		log("Search Favorite document");
		Searchfav.sendKeys(DocumentsContext_excelRead(1, 2));
		Thread.sleep(6000);
		jsclick(doc);

	}

	public void getClick_signature_Menuoption() throws Exception {
		Click_signature_Menuoption.click();
	}

	public void getAdd_Signature_Onpage() throws Exception {
		Actions action = new Actions(driver);
		action.dragAndDropBy(Add_Signature_Onpage, 200, 100).build().perform();

	}

	public void getCreate_Notification_Document() throws Exception {

		movingclkElement(notification);
		Thread.sleep(20000);
		log("Click on the Notification Option");
		jsclick(contref);
		Thread.sleep(6000);
		log("set references notifications");
		jsclick(dochistory);
		Thread.sleep(6000);
		jsclick(notifylist);
		Thread.sleep(6000);
		jsclick(checknotification);
		jsclick(savenotify);
		Thread.sleep(6000);
		jsclick(Select_Folder);
		Thread.sleep(6000);
		jsclick(customdoc);
		try {
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Thread.sleep(6000);
		jsclick(general);
		Thread.sleep(6000);
		log("Click on the General Option");
	}

	public void getSave_Signature_Document() throws Exception {
		jsclick(saveaddpage);
		Thread.sleep(6000);
		jsclick(okbutton);

	}

	public void getSentTo_Mail_asCopy() throws Exception {

		jsclick(sendTo);
		Thread.sleep(2000);
		log("Click on the Sent To Option");
		jsclick(sendToMail);
		Thread.sleep(6000);
		log("Click on the Send To then Mail Option");
		jsclick(converttopdf);
		Thread.sleep(6000);
		log("Select Convert to pdf Radio button");
		jsclick(colorexport);
		Thread.sleep(2000);
		log("Set Export ");
		jsclick(pdfquality);
		log("selct Pdf Quality");
		Thread.sleep(2000);
		Select sel = new Select(pdfquality);
		sel.selectByVisibleText("Best Quality");
		Thread.sleep(2000);
		log("set Best Quality dropdown Option");
		jsclick(coverpage);
		Thread.sleep(2000);
		log("Check Cover page");
		jsclick(compresszip);
		Thread.sleep(2000);
		log("Check Compress zip");
		jsclick(sendtopassword);
		Thread.sleep(2000);
		log("click on the Send to password Textbox");
		jsclick(zippassinput);
		Thread.sleep(2000);
		zippassinput.sendKeys(DocumentsContext_excelRead(2, 1));
		Thread.sleep(2000);
		log("Enter password for mail document");
		jsclick(Runannotation);
		Thread.sleep(2000);
		log("Check the Annotation checkbox");
		jsclick(toemail);
		Thread.sleep(2000);
		log("Click on the To Email Textbox");
		toemail.sendKeys(DocumentsContext_excelRead(1, 3));
		Thread.sleep(2000);
		jsclick(subid);
		Thread.sleep(2000);
		subid.sendKeys(DocumentsContext_excelRead(1, 4));
		Thread.sleep(6000);
		log("enter the Subject");
		jsclick(savesendto);
		Thread.sleep(6000);
		log("Click on the Ok Button");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		wait.until(ExpectedConditions.elementToBeClickable(EmailsuccessMessageDialogboxOK));
		jsclick(EmailsuccessMessageDialogboxOK);
		log("Mail sent successfully and click on the Ok Button");
	}

	public void getSentTo_Mail_asReference() throws Exception {

		jsclick(sendTo);
		Thread.sleep(6000);
		log("Click on the Send To Option");
		jsclick(sendToMail);
		Thread.sleep(6000);
		log("Click on the Mail Option");
		jsclick(Referencemail);
		Thread.sleep(6000);
		log("select Reference Email Radio button");
		Select sel = new Select(pdfquality);
		sel.selectByVisibleText("Best Quality");
		log("Select and set pdf quality Best Quality");
		jsclick(toemail);
		Thread.sleep(6000);
		toemail.sendKeys(DocumentsContext_excelRead(1, 3));
		Thread.sleep(6000);
		log("enter the To Email id");
		jsclick(subid);
		Thread.sleep(6000);
		subid.sendKeys(DocumentsContext_excelRead(1, 4));
		Thread.sleep(6000);
		log("Enter the Mail subject");
		jsclick(savesendto);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		wait.until(ExpectedConditions.elementToBeClickable(EmailsuccessMessageDialogboxOK));
		jsclick(EmailsuccessMessageDialogboxOK);

	}

	public void getSentTo_Print() throws Exception {
		Thread.sleep(6000);
		jsclick(checkdoc);
		Thread.sleep(6000);
		log("Check the Document");
		element = MoveTo_Menu_Documents;
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		log("Move to the menu Documents Tab");
		jsclick(sendTo);
		Thread.sleep(6000);
		log("Click on the Send To Option");
		jsclick(sendtoPrint);
		Thread.sleep(6000);
		log("Click on the Print Option");
		jsclick(pageprint);
		Thread.sleep(6000);
		jsclick(summaryprint);
		Thread.sleep(6000);
		jsclick(withunlockredaction);
		Thread.sleep(6000);
		jsclick(pwdunlockredaction);
		pwdunlockredaction.sendKeys(DocumentsContext_excelRead(2, 1));
		Thread.sleep(6000);
		jsclick(printview);

	}

	public void getSentTo_Export() throws Exception {

		Thread.sleep(6000);
		jsclick(checkdoc);
		Thread.sleep(6000);
		log("Check the document");
		element = MoveTo_Menu_Documents;
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		log("Move to the Menu Document tab");
		jsclick(sendTo);
		Thread.sleep(6000);
		log("Move to the Documents tab");
		jsclick(sendexport);
		Thread.sleep(6000);
		log("Click on the Send To Export Option");
		jsclick(retainchkexport);
		jsclick(Routesummary);
		Thread.sleep(6000);
		jsclick(Zippassword);
		Thread.sleep(6000);
		Zippassword.sendKeys(DocumentsContext_excelRead(2, 1));
		Thread.sleep(6000);
		log("enter Zip password");
		jsclick(savesendto);
		Thread.sleep(19000);
		log("Click on the Ok Button");
		jsclick(checkdoc);
		Thread.sleep(6000);
		log("Check the document");
		element = MoveTo_Menu_Documents;
		Actions action2 = new Actions(driver);
		action2.moveToElement(element).perform();
		log("Move to the Documents Tab");
		jsclick(sendTo);
		Thread.sleep(6000);
		log("Click on the Send To Option");
		jsclick(sendexport);
		Thread.sleep(6000);
		log("Click on the Export Option");
		jsclick(convertpdfexport);
		jsclick(exportannotation);
		jsclick(exportwith);
		jsclick(exportPwd);
		Thread.sleep(6000);
		exportPwd.sendKeys(DocumentsContext_excelRead(2, 1));
		Thread.sleep(6000);
		log("Export document with entering password");
		jsclick(Zippasswordinput);
		Thread.sleep(6000);
		Zippasswordinput.sendKeys(DocumentsContext_excelRead(2, 1));
		Thread.sleep(6000);
		jsclick(Pdfpasswordinput);
		Thread.sleep(6000);
		Pdfpasswordinput.sendKeys(DocumentsContext_excelRead(2, 1));
		Thread.sleep(6000);
		jsclick(savesendto);
		Thread.sleep(6000);
		log("Click on the Ok Button");
	}

	public void getSentTo_SecureLink() throws Exception {
		Thread.sleep(6000);
		element = MoveTo_Menu_Documents;
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		log("Move to the Documents Tab");
		jsclick(sendTo);
		Thread.sleep(6000);
		log("Click on the Send To Option");
		jsclick(SecureMail);
		Thread.sleep(6000);
		log("Click on the Secure Mail Option");
		jsclick(recpmail);
		Thread.sleep(6000);
		log("Enter Recepient mail ID");
		recpmail.sendKeys(DocumentsContext_excelRead(1, 3));
		Thread.sleep(6000);
		jsclick(Confirmemail);
		Thread.sleep(6000);
		Confirmemail.sendKeys(DocumentsContext_excelRead(1, 3));
		log("enter the Confirm mail ID");
		Thread.sleep(6000);
		jsclick(modifychk);
		log("check the Modify check ");
		jsclick(navigateOK);
		Thread.sleep(6000);
		log("Click on the Ok Button");
		recpmailsec.sendKeys(DocumentsContext_excelRead(1, 3));
		jsclick(confirmemailsec);
		Thread.sleep(6000);
		log("Enter again Confirmation Mail Id");
		confirmemailsec.sendKeys(DocumentsContext_excelRead(1, 3));
		Thread.sleep(6000);
		jsclick(navigateOK2);
		Thread.sleep(6000);
		log("click on the Ok Button");
	}

	public void getSentTo_GenerateDocumentLink() throws Exception {
		Thread.sleep(6000);
		jsclick(checkdoc);
		log("Check the Document");
		Thread.sleep(6000);
		element = MoveTo_Menu_Documents;
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		log("Move to the Documents Tab");
		jsclick(sendTo);
		Thread.sleep(6000);
		log("Click on the Send To Option");
		jsclick(generatedoc);
		Thread.sleep(6000);
		log("Click on the Generate document link Option");
		log("Generated Document link is " + CopyDoclink.getText());
		Thread.sleep(6000);
		jsclick(doclinkok);
		log("Click on the Ok Button");
	}

	public void getVerifyWF() throws Exception {

		Thread.sleep(6000);
		jsclick(accept);
		log("Click on the Accept Option");
		Thread.sleep(6000);
		jsclick(action);
		Thread.sleep(6000);
		jsclick(messageOK);
		Thread.sleep(6000);
		jsclick(WFComment);
		Thread.sleep(6000);
		WFComment.sendKeys(DocumentsContext_excelRead(2, 4));
		Thread.sleep(6000);
		jsclick(actionOK);
		log("Enter the Comment and Accept the Workflow");
	}

	public WebElement MoveTo_ToDoList_Option() {
		Actions action = new Actions(driver);
		action.moveToElement(MoveTo_ToDoList_Option).build().perform();
		return MoveTo_ToDoList_Option;
	}

	public void getSelect_Office_document_Defaultviewing() {
		Select sel = new Select(Select_Office_document_Defaultviewing);
		// sel.selectByVisibleText("Default viewing");
		sel.selectByIndex(0);

	}

	public void getPdf_document_Defaultviewing() {
		Select drop = new Select(Pdf_document_Defaultviewing);
		// drop.selectByVisibleText("Default viewing");
		drop.selectByIndex(0);

	}

	public void getinputpassword() throws Exception {
		jsclick(signinputpassword);
		signinputpassword.sendKeys("DocumentsContext_excelRead(3, 1)");
		jsclick(verifypassok);

	}

	public void getVerify_SendTo_Blankemailid() throws Exception {

		jsclick(sendTo);
		Thread.sleep(6000);
		log("Click on the Send To Option");
		jsclick(sendToMail);
		Thread.sleep(6000);
		log("Click on the Mail Option ");
		jsclick(Referencemail);
		Thread.sleep(6000);
		Select sel = new Select(pdfquality);
		sel.selectByIndex(2);
		Thread.sleep(6000);
		jsclick(savesendto);

	}

	public void getmessagevalidation() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Email id should not  be Blank.";
		String actualtext = messageContent.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verified");
		log(messageContent.getText() + " this validation message should show");
		jsclick(messageok);

	}

	public void getVerify_SendTo_InvalidEmail() throws Exception {
		Thread.sleep(6000);
		toemail.sendKeys(DocumentsContext_excelRead(3, 4));
		Thread.sleep(6000);
		jsclick(subid);
		subid.clear();
		Thread.sleep(6000);
		subid.sendKeys(DocumentsContext_excelRead(1, 4));
		Thread.sleep(6000);
		jsclick(savesendto);

	}

	public void getmessagevalidationInvalid() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Please enter a valid 'To E-mail id'";
		String actualtext = messageContent.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verified");
		log(messageContent.getText() + " this validation message should show");
		jsclick(messageok);

	}

	public void getVerify_SendTo_InvalidCCEmail() throws Exception {
		Thread.sleep(6000);
		toemail.clear();
		Thread.sleep(6000);
		toemail.sendKeys(DocumentsContext_excelRead(1, 3));
		Thread.sleep(6000);
		log("enter the TO Email ID");
		CCEmailID.sendKeys(DocumentsContext_excelRead(3, 4));
		Thread.sleep(6000);
		log("enter the CC Email ID");
		jsclick(subid);
		subid.clear();
		log("Enter the Mail subject");
		Thread.sleep(6000);
		subid.sendKeys(DocumentsContext_excelRead(1, 4));
		Thread.sleep(6000);
		jsclick(savesendto);
		log("click on the OK Button");
	}

	public void getmessagevalidationCCEmailInvalid() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Please enter a valid 'Cc E-mail id'";
		String actualtext = messageContent.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verified");
		log(messageContent.getText() + " this validation message should show");
		jsclick(messageok);

	}

	public void getSentTo_PrintValidation() throws Exception {

		jsclick(sendTo);
		Thread.sleep(6000);
		jsclick(sendtoPrint);
		Thread.sleep(6000);

	}

	public void getSentTo_ExportCancel() throws Exception {

		Thread.sleep(6000);
		jsclick(sendTo);
		Thread.sleep(6000);
		jsclick(sendexport);
		Thread.sleep(6000);

	}

	public void get_SecureLinkblankmail_Validation() throws Exception {

		Thread.sleep(6000);
		jsclick(sendTo);
		Thread.sleep(6000);
		jsclick(SecureMail);
		Thread.sleep(6000);
		jsclick(navigateOK);
		Thread.sleep(6000);

	}

	public void getmessagevalidationBlankmail() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Please enter recipient email id";
		String actualtext = messageContent.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verified");
		log(messageContent.getText() + " this validation message should show");
		jsclick(messageok);

	}

	public void getenter_SecureLinkRecipientaddress() throws Exception {

		Thread.sleep(6000);
		jsclick(recpmail);
		Thread.sleep(6000);
		recpmail.sendKeys(DocumentsContext_excelRead(1, 3));
		Thread.sleep(6000);
		jsclick(modifychk);
		jsclick(navigateOK);
		Thread.sleep(6000);

	}

	public void getmessagevalidationConfirmmail() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Please enter confirmation email id";
		String actualtext = messageContent.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verified");
		log(messageContent.getText() + " this validation message should show");
		jsclick(messageok);

	}

	public void getClearRecipientmail() throws Exception {

		Thread.sleep(6000);
		jsclick(recpmail);
		Thread.sleep(6000);
		recpmail.clear();
		Thread.sleep(6000);

	}

	public void getVerifyMismatch_SecureLink_Confirmmail() throws Exception {

		jsclick(Confirmemail);
		Thread.sleep(6000);
		Confirmemail.sendKeys(DocumentsContext_excelRead(1, 3));
		Thread.sleep(6000);
		jsclick(modifychk);
		jsclick(navigateOK);
		Thread.sleep(6000);

	}

	public void getenter_validemailmessage() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Please enter a valid  E-mail id";
		String actualtext = messageContent.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verified");
		log(messageContent.getText() + " this validation message should show");
		jsclick(messageok);

	}

	public void get_Mismatch_validation() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Email id Mismatch ";
		String actualtext = messageContent.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verified");
		log(messageContent.getText() + " this validation message should show");
		jsclick(messageok);

	}

	public void get_Confirmmail_Invalid() throws Exception {

		Thread.sleep(6000);
		jsclick(recpmail);
		Thread.sleep(6000);
		recpmail.sendKeys(DocumentsContext_excelRead(1, 3));
		Thread.sleep(6000);
		jsclick(Confirmemail);
		Thread.sleep(6000);
		Confirmemail.sendKeys(DocumentsContext_excelRead(3, 4));
		Thread.sleep(6000);
		jsclick(modifychk);
		jsclick(navigateOK);
		Thread.sleep(6000);

	}

	public void get_EnterConfirmmail() throws Exception {

		Thread.sleep(6000);
		jsclick(Confirmemail);
		Thread.sleep(6000);
		Confirmemail.sendKeys(DocumentsContext_excelRead(1, 3));
		Thread.sleep(6000);
		jsclick(modifychk);
		jsclick(navigateOK);
		Thread.sleep(6000);
	}

	public void getRecepientEmail_SecureLink() throws Exception {

		Thread.sleep(6000);
		recpmailsec.sendKeys(DocumentsContext_excelRead(1, 3));
		jsclick(confirmemailsec);
		Thread.sleep(6000);
		jsclick(navigateOK2);
		Thread.sleep(6000);
	}

	public void getRecepietConfirmEmail_SecureLink() throws Exception {

		Thread.sleep(6000);
		recpmailsec.clear();
		jsclick(confirmemailsec);
		Thread.sleep(6000);
		confirmemailsec.sendKeys(DocumentsContext_excelRead(1, 3));
		Thread.sleep(6000);
		jsclick(navigateOK2);
		Thread.sleep(6000);

	}

	public void getRecepietConfirmEmailInvalid_SecureLink() throws Exception {

		Thread.sleep(6000);
		recpmailsec.sendKeys(DocumentsContext_excelRead(1, 3));
		jsclick(confirmemailsec);
		Thread.sleep(6000);
		confirmemailsec.clear();
		Thread.sleep(6000);
		confirmemailsec.sendKeys(DocumentsContext_excelRead(3, 4));
		Thread.sleep(6000);
		jsclick(navigateOK2);
		Thread.sleep(6000);

	}

	public void getenterConfirmRecepietEmail_SecureLink() throws Exception {

		confirmemailsec.clear();
		Thread.sleep(6000);
		confirmemailsec.sendKeys(DocumentsContext_excelRead(1, 3));
		Thread.sleep(6000);
		jsclick(navigateOK2);
		Thread.sleep(6000);

	}

	public void getVerifyAccept() throws Exception {

		Thread.sleep(8000);
		(accept).click();
		log("Click on the Accept Option");
		Thread.sleep(6000);
		jsclick(Workflowtask);
		Thread.sleep(6000);
		log("Click on the Workflow Task Button");
		jsclick(CancelWorkflowtask);
		Thread.sleep(6000);
		log("Click on the Workflow task Cancel Button");
		jsclick(wfaction);
		log("Click on the Workflow action");
	}

	public void get_comment_Validation() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Please enter the comments.";
		String actualtext = messageContent.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verified");
		log(messageContent.getText() + " this validation message should show");
		jsclick(messageok);

	}

	public void getVerifyReject() throws Exception {

		Thread.sleep(6000);
		jsclick(Reject);
		Thread.sleep(6000);
		log("Click on the Reject Option");
		jsclick(Workflowtask);
		Thread.sleep(6000);
		log("Click on the Workflwo Task");
		jsclick(CancelWorkflowtask);
		log("Click on the Cancel Workflow task Button");
		Thread.sleep(6000);
		jsclick(wfaction);
		log("Click on the Workflow action");
	}

	public void getVerifyEndWorkflow() throws Exception {

		Thread.sleep(6000);
		jsclick(EndWorkflow);
		Thread.sleep(6000);
		log("Click on the End Workflow Option");
		jsclick(Workflowtask);
		Thread.sleep(6000);
		log("click on the Workflow Task Button");
		jsclick(CancelWorkflowtask);
		Thread.sleep(6000);
		log("click on the Cancel Workflow task Button");
		jsclick(wfaction);
		log("click on the Workflow action");
	}

	public void getverifySummary() throws Exception {
		Thread.sleep(6000);
		jsclick(Summary);

	}

	public void getverifyComment() throws Exception {

		Thread.sleep(6000);
		jsclick(Comment);
		Thread.sleep(6000);
		log("Click on the Comment box");
		jsclick(Workflowtask);
		Thread.sleep(6000);
		log("Click on theWorkflow Task Button");
		jsclick(CancelWorkflowtask);
		Thread.sleep(6000);
		log("Click on the Workflow task Cancel Button");
		jsclick(wfaction);
		log("Click on the Workflow action");
	}

	public void getMoveTo_Menu_Recent() {
		Actions action = new Actions(driver);
		action.moveToElement(MoveTo_Menu_Recent).perform();
	}

	public void Verify_TakeOwnership_ReleaseOwnership_OnDocuments() throws Exception {

		log("Test Scenario 1 : Verifying Take Ownership and Release Ownership On Document");
		try {
			LogDipakUser();
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("User is alreday Logged");
		}
		try {
			jsclick(Cancel_Button_BrowseforFolder);
			Thread.sleep(2000);
		} catch (Exception e) {
			// Folder navigation dialog not open
		}
		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
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
		jsclick(Select_Document);
		Thread.sleep(6000);
		log("Check Document from Document List ");
		getMoveTo_Menu_Documents();
		Thread.sleep(6000);
		log("Mousehover on Documents Tab");
		getSelect_Option_TakeOwnership();
		Thread.sleep(6000);
		log("Click on Take Ownership Option");
		log("Document OwnerShip Taken Successfully");
		LogoutPage();
		LoginAdminUser();
		Thread.sleep(6000);
		log("Login EWA with New User Credential");
		Refresh_Button();
		Thread.sleep(6000);
		log("Click on Refresh button");
		jsclick(My_Preferencesetting);
		Thread.sleep(6000);
		log("Click on My Preferences Option");
		getSelect_Office_document_Defaultviewing();
		Thread.sleep(6000);
		log("Select Office Document and set as Default View");
		getPdf_document_Defaultviewing();
		Thread.sleep(6000);
		log("Select Pdf Document and Set as Default View");
		movingclkElement(Apply_button);
		Thread.sleep(6000);
		log("Click on Apply button");
		selectElement(Select_Cabinet);
		Thread.sleep(6000);
		log("Expand a Cabinet");
		selectElement(Select_Drawer);
		Thread.sleep(6000);
		log("Expand a Drawer");
		selectElement(Select_Folder);
		Thread.sleep(6000);
		log("Expand a Folder");
		jsclick(Open_Document);
		Thread.sleep(6000);
		log("Select and Open Document from Document List");
		getVerify_Ownership_Message();
		Thread.sleep(6000);
		log("Verified Document is in Ownership");
		try {
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Thread.sleep(6000);
		log("Document Open successfully and verified");
		LogoutPage();
		LogDipakUser();
		Thread.sleep(6000);
		Refresh_Button();
		Thread.sleep(6000);
		log("Login EWA with another user Credential");
		selectElement(Select_Cabinet);
		Thread.sleep(6000);
		log("Expand a Cabinet");
		selectElement(Select_Drawer);
		Thread.sleep(6000);
		log("Expand a Drawer");
		selectElement(Select_Folder);
		Thread.sleep(6000);
		log("Expand a Folder");
		jsclick(Select_Document);
		Thread.sleep(6000);
		log("Check document from Document List");
		getMoveTo_Menu_Documents();
		Thread.sleep(6000);
		log("Mousehover on Documents Tab");
		getSelect_Option_ReleaseOwnership();
		Thread.sleep(6000);
		log("Click on Release Ownership Option ");
		LogoutPage();
		LoginAdminUser();
		Thread.sleep(6000);
		Refresh_Button();
		Thread.sleep(6000);
		log("Login EWA with another User Credential");
		selectElement(Select_Cabinet);
		Thread.sleep(6000);
		log("Expand a Cabinet");
		selectElement(Select_Drawer);
		Thread.sleep(6000);
		log("Expand a Drawer");
		selectElement(Select_Folder);
		Thread.sleep(6000);
		log("Expand a Folder");
		jsclick(Open_Document);
		try {
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Thread.sleep(6000);
		log("Take and Release Ownership Functionality verified Successfully");
		movingclkElement(closedoc);
		Thread.sleep(4000);
		log("Document Closed Successfully");
		LogoutPage();
		log("Login EWA with User Credential");
		LogDipakUser();
	}

	public void Verify_Refresh_Option() throws Exception {

		log("Test Scenario 2: Verifying Refresh Option");
		try {
			LogDipakUser();
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("User is alreday Logged");
		}
		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		Refresh_Button();
		Thread.sleep(6000);
		log("Click on Refresh button");
		getMoveTo_Menu_Recent();
		Thread.sleep(6000);
		log("Mousehover on Recent Tab");
		jsclick(Recent_Folder);
		Thread.sleep(6000);
		log("Click on Recent Folder");
		jsclick(Select_Document);
		Thread.sleep(6000);
		log("Check document from Document List");
		getMoveTo_Menu_Documents();
		Thread.sleep(6000);
		log("Mousehover on Documents Tab");
		getSelect_Option_Refresh();
		Thread.sleep(6000);
		log("Click Refresh Option");
		log("Refresh Functionality verified Successfully on Documents");
	}

	public void Verify_Categories_Option() throws Exception {

		log("Test Scenario 3:Verifying Categories Option ");

		try {
			LogDipakUser();
			Thread.sleep(6000);
			getMoveTo_Menu_Recent();
			Thread.sleep(6000);
			log("Mousehover on Recent Tab");
			jsclick(Recent_Folder);
			Thread.sleep(6000);
			log("Click on Recent Folder");
		} catch (Exception e) {
			System.out.println("User is alreday Logged");
		}
		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		jsclick(Select_Document);
		Thread.sleep(6000);
		log("Check document from Document List");
		getMoveTo_Menu_Documents();
		log("Mousehover on Documents Tab");
		getSelect_Option_Catagories_andSet_Colors();
		Thread.sleep(6000);
		log("Click on Catagories option and set Color");
		log("Categories on Documents Functionality verified Successfully");

	}

	public void Verify_copy_and_paste_Option() throws Exception {

		log("Test Scenario 4 : Verifying copy and paste Option ");
		try {
			LogDipakUser();
			Thread.sleep(6000);
			getMoveTo_Menu_Recent();
			Thread.sleep(6000);
			log("Mousehover on Recent Tab");
			jsclick(Recent_Folder);
			Thread.sleep(6000);
			log("Click on Recent Folder");
		} catch (Exception e) {
			System.out.println("User is alreday Logged");
		}
		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		Refresh_Button();
		Thread.sleep(6000);
		getMoveTo_Menu_Recent();
		Thread.sleep(6000);
		log("Mousehover on Recent Tab");
		jsclick(Recent_Folder);
		Thread.sleep(6000);
		jsclick(Select_Document);
		Thread.sleep(6000);
		getMoveTo_Menu_Documents();
		log("Mousehover on Documents Tab");
		getVerify_CopyandPaste_Document();
		Thread.sleep(6000);
		log("Copy and paste Document");
		log("copy and paste documents Functionality verified Successfully");
	}

	public void Verify_cut_and_paste_Option() throws Exception {

		log("Test Scenario 5 : Verifying cut and paste Option ");
		try {
			LogDipakUser();
			Thread.sleep(6000);
			getMoveTo_Menu_Recent();
			Thread.sleep(6000);
			log("Mousehover on Recent Tab");
			jsclick(Recent_Folder);
			Thread.sleep(6000);
			log("Click on Recent Folder");
		} catch (Exception e) {
			System.out.println("User is alreday Logged");
		}
		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		jsclick(Select_Document);
		Thread.sleep(6000);
		log("Check Document from Document List");
		getMoveTo_Menu_Documents();
		Thread.sleep(6000);
		log("Mousehover on Documents Tab");
		getVerify_CutandPaste_Document();
		Thread.sleep(6000);
		log("cut and paste Document Functionality verified Successfully");
	}

	public void Verify_Delete_Option() throws Exception {

		try {
			LogDipakUser();
			Thread.sleep(6000);
			getMoveTo_Menu_Recent();
			Thread.sleep(6000);
			log("Mousehover on Recent Tab");
			jsclick(Recent_Folder);
			Thread.sleep(6000);
			log("Click on Recent Folder");
		} catch (Exception e) {
			System.out.println("User is alreday Logged");
		}
		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		jsclick(CheckfirstDocument);
		Thread.sleep(6000);
		log("Test Scenario 6 : Verifying Delete Option ");
		getVerify_Delete_Document();
		Thread.sleep(6000);
		log("Document Delete Functionality verified Successfully");
	}

	public void Verify_CreateFavorites_Document() throws Exception {

		log("Test Scenario 7 : Verifying Create Favorites Document");
		try {
			LogDipakUser();
			Thread.sleep(6000);
			getMoveTo_Menu_Recent();
			Thread.sleep(6000);
			log("Mousehover on Recent Tab");
			jsclick(Recent_Folder);
			Thread.sleep(6000);
			log("Click on Recent Folder");
		} catch (Exception e) {
			System.out.println("User is alreday Logged");
		}
		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		getVerify_CreateFavorites_Document();
		Refresh_Button();
		Thread.sleep(6000);
		log("Click on Refresh button");
		getOpen_CreateFavorites_Document();
		Thread.sleep(6000);
		log("CreateFavorites Document Functionality verified Successfully");
	}

	public void Verify_Notification_on_Document() throws Exception {

		log("Test Scenario 9 : Verifying Notification on Document ");
		try {
			LogDipakUser();
			Thread.sleep(6000);
		} catch (Exception e) {
			// already logged
		}
		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		Refresh_Button();
		Thread.sleep(6000);
		log("Click on Refresh button");
		getMoveTo_Menu_Recent();
		Thread.sleep(6000);
		log("Mousehover on Recent Tab");
		jsclick(Recent_Folder);
		Thread.sleep(6000);
		log("Click on Recent Folder");
		jsclick(Select_Document);
		Thread.sleep(6000);
		log("Check Document from Document List");
		movingElement(MoveTo_Menu_Documents);
		log("Mousehover on Documents Tab");
		getVerify_CopyandPaste_Document();
		Thread.sleep(6000);
		log("Verified Copy and Paste Document");
		jsclick(Select_Document);
		Thread.sleep(6000);
		log("Check Document from Document List");
		movingElement(MoveTo_Menu_Documents);
		Thread.sleep(4000);
		log("Mousehover on Documents Tab");
		getCreate_Notification_Document();
		Thread.sleep(6000);
		log("Create and Verifying Notification Document ");
		getClick_signature_Menuoption();
		Thread.sleep(6000);
		log("Click on Signature Menu Option");
		getinputpassword();
		Thread.sleep(6000);
		log("Enter a Password");
		getAdd_Signature_Onpage();
		Thread.sleep(6000);
		log("Add New signature on page");
		getSave_Signature_Document();
		Thread.sleep(6000);
		log("Click on Save button and save page");
		movingclkElement(closedoc);
		log("Click on Close button on Viewer");
		log("Notification_on_Document Functionality verified Successfully");

	}

	public void Verify_SendTo_Mail_as_References() throws Exception {

		log("Test Scenario 10 : Verifying SendTo Mail as References ");
		try {
			LogDipakUser();
			Thread.sleep(6000);
			getMoveTo_Menu_Recent();
			Thread.sleep(6000);
			log("Mousehover on Recent Tab");
			jsclick(Recent_Folder);
			Thread.sleep(6000);
			log("Click on Recent Folder");
		} catch (Exception e) {
			System.out.println("User is alreday Logged");
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
		getMoveTo_Menu_Recent();
		Thread.sleep(6000);
		log("Mousehover on Recent Tab");
		jsclick(Recent_Folder);
		Thread.sleep(6000);
		log("Click on Recent Folder");
		jsclick(Select_Document);
		Thread.sleep(6000);
		log("Check Document from Document List");
		getMoveTo_Menu_Documents();
		Thread.sleep(2000);
		log("Mousehover on Documents Tab");
		getSentTo_Mail_asReference();
		Thread.sleep(6000);
		log("SendTo Mail asReference Functionality verified Successfully");
	}

	public void Verify_SendTo_Mail_ascopy() throws Exception {

		log("Test Scenario 11 : Verifying SendTo Mail as copy ");
		try {
			LogDipakUser();
			Thread.sleep(6000);
			getMoveTo_Menu_Recent();
			Thread.sleep(6000);
			log("Mousehover on Recent Tab");
			jsclick(Recent_Folder);
			Thread.sleep(6000);
			log("Click on Recent Folder");
		} catch (Exception e) {
			System.out.println("User is alreday Logged");
		}
		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		jsclick(Select_Document);
		Thread.sleep(6000);
		log("Check Document from Document List");
		getMoveTo_Menu_Documents();
		Thread.sleep(6000);
		log("Mousehover on Documents Tab");
		getSentTo_Mail_asCopy();
		Thread.sleep(2000);
		log("SendTo Mail asCopy Functionality verified Successfully");
	}

	public void Verify_SendTo_Print() throws Exception {

		log("Test Scenario 12 : Verifying SendTo Print ");
		try {
			LogDipakUser();
			Thread.sleep(6000);
			getMoveTo_Menu_Recent();
			Thread.sleep(6000);
			log("Mousehover on Recent Tab");
			jsclick(Recent_Folder);
			Thread.sleep(6000);
			log("Click on Recent Folder");
		} catch (Exception e) {
			System.out.println("User is alreday Logged");
		}
		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		// Add New code.

		getMoveTo_Menu_Recent();
		Thread.sleep(6000);
		log("Mousehover on Recent Tab");
		jsclick(Recent_Folder);
		Thread.sleep(6000);
		log("Click on Recent Folder");

		getSentTo_Print();
		log("SendTo Print Functionality verified Successfully");

	}

	public void Verify_SendTo_Export() throws Exception {

		log("Test Scenario 13 : Verifying SendTo Export ");
		try {
			LogDipakUser();
			Thread.sleep(6000);
			getMoveTo_Menu_Recent();
			Thread.sleep(6000);
			log("Mousehover on Recent Tab");
			jsclick(Recent_Folder);
			Thread.sleep(6000);
			log("Click on Recent Folder");
		} catch (Exception e) {
			System.out.println("User is alreday Logged");
		}
		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		getSentTo_Export();
		log("SendTo Export Functionality verified Successfully");

	}

	public void Verify_SendTo_GenerateDocumentLink() throws Exception {

		log("Test Scenario 14 : Verifying SendTo Generate Document Link ");
		try {
			LogDipakUser();
			Thread.sleep(6000);
			getMoveTo_Menu_Recent();
			Thread.sleep(6000);
			log("Mousehover on Recent Tab");
			jsclick(Recent_Folder);
			Thread.sleep(6000);
			log("Click on Recent Folder");
		} catch (Exception e) {
			System.out.println("User is alreday Logged");
		}
		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		Refresh_Button();
		Thread.sleep(6000);
		log("Click on Refresh button");
		getMoveTo_Menu_Recent();
		Thread.sleep(6000);
		log("Mousehover on Documents Tab");
		jsclick(Recent_Folder);
		Thread.sleep(6000);
		log("Click on Recent Folder");
		getSentTo_GenerateDocumentLink();
		Thread.sleep(6000);
		log("Document send to Generate Document");
		log("SendTo GenerateDocumentLink Functionality verified Successfully");
	}

	public void Verify_SendTo_SecureLink() throws Exception {

		log("Test Scenario 15 : Verifying Send To SecureLink ");
		try {
			LogDipakUser();
			Thread.sleep(6000);
			getMoveTo_Menu_Recent();
			Thread.sleep(6000);
			log("Mousehover on Recent Tab");
			jsclick(Recent_Folder);
			Thread.sleep(6000);
			log("Click on Recent Folder");
		} catch (Exception e) {
			System.out.println("User is alreday Logged");
		}
		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		Thread.sleep(6000);
		Refresh_Button();
		Thread.sleep(6000);
		getMoveTo_Menu_Recent();
		Thread.sleep(6000);
		log("Mousehover on Recent Tab");
		jsclick(Recent_Folder);
		Thread.sleep(6000);
		log("Click on Recent Folder");
		jsclick(Select_Document);
		Thread.sleep(6000);
		log("Check Document from Document List");
		getSentTo_SecureLink();
		Thread.sleep(6000);
		log("SendTo SecureLink Functionality verified Successfully");
		Refresh_Button();
		log("Click on Refresh button");
		Thread.sleep(6000);
	}

	public void Verify_BlankToemailID() throws Exception {

		log("Test Scenario 1 : Verifying Blank To email ID ");
		try {
			LogDipakUser();
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("User is alreday Logged");
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
		selectElement(Select_Cabinet);
		Thread.sleep(6000);
		log("Expand a Cabinet");
		selectElement(Select_Drawer);
		Thread.sleep(6000);
		log("Expand a Drawer");
		selectElement(Select_Folder);
		Thread.sleep(6000);
		log("select a Folder");
		jsclick(Select_Document);
		Thread.sleep(6000);
		log("Check Document name ");
		getMoveTo_Menu_Documents();
		Thread.sleep(6000);
		log("Mousehover to Documents Tab");
		getVerify_SendTo_Blankemailid();
		Thread.sleep(6000);
		log("Verified Send To Blank Email ID");
		getmessagevalidation();
		log("Verified Message Validation");
		log("Blank TOEmail ID Verified successfully");
	}

	public void Verify_InvalidToEmailId() throws Exception {

		log("Test Scenario 2 : Verifying Invalid To Email Id ");

		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		Thread.sleep(6000);
		getVerify_SendTo_InvalidEmail();
		Thread.sleep(6000);
		log("Verified Send To Invalid Email ID");
		getmessagevalidationInvalid();
		log("Verified message validation");
		log("Invalid TOEmail ID Verified successfully");
	}

	public void Verify_InvalidCCEmailId() throws Exception {

		log("Test Scenario 3 : Verifying Invalid CC Email Id");

		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		Thread.sleep(6000);
		getVerify_SendTo_InvalidCCEmail();
		Thread.sleep(6000);
		log("Verified Invalid Send TO CC Email ID");
		getmessagevalidationCCEmailInvalid();
		log("Verified message validation cc Invalid Email");
		log("Invalid CCEmail ID Verified successfully");
	}

	public void Verify_MailDialog_Cancel_button() throws Exception {

		log("Test Scenario 4: Verifying Mail Dialog Cancel button ");

		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		Thread.sleep(6000);
		jsclick(DialogCancel);
		log("Click on  Mail dialog Cancel button");
		log("Mail dialog Cancel button Verified successfully");
	}

	public void Verify_PrintDialog_Cancel_button() throws Exception {

		log("Test Scenario 5 : Verifying Print Dialog Cancel button ");
		try {
			LogDipakUser();
			Thread.sleep(6000);
			getMoveTo_Menu_Recent();
			Thread.sleep(6000);
			log("Mousehover on Recent Tab");
			jsclick(Recent_Folder);
			Thread.sleep(6000);
			log("Click on Recent Folder");
			jsclick(Select_Document);
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("User is alreday Logged");
		}
		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		Thread.sleep(6000);
		getMoveTo_Menu_Documents();
		Thread.sleep(6000);
		log("Mousehover to Document Tab");
		getSentTo_PrintValidation();
		Thread.sleep(6000);
		log("Verified Send to Print Validation");
		jsclick(PrintDialogCancel);
		log("Click on  Print dialog Cancel button");
		log("Print dialog Cancel button Verified successfully");
	}

	public void Verify_ExportDialog_Cancel_button() throws Exception {

		log("Test Scenario 6 : Verifying Export Dialog Cancel button ");
		try {
			LogDipakUser();
			Thread.sleep(6000);
			getMoveTo_Menu_Recent();
			Thread.sleep(6000);
			log("Mousehover on Recent Tab");
			jsclick(Recent_Folder);
			Thread.sleep(6000);
			log("Click on Recent Folder");
			jsclick(Select_Document);
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("User is alreday Logged");
		}
		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		Thread.sleep(6000);
		getMoveTo_Menu_Documents();
		Thread.sleep(6000);
		log("Mousehover to Document Tab");
		getSentTo_ExportCancel();
		Thread.sleep(6000);
		log("Click on Send TO Export Option");
		jsclick(DialogCancel);
		log("Click on Export dialog Cancel button");
		log("Export dialog Cancel button Verified successfully");
	}

	public void Verify_SecureLink_mailvalidation() throws Exception {

		log("Test Scenario 7 : Verifying SecureLink mail validation ");
		try {
			LogDipakUser();
			Thread.sleep(6000);
			getMoveTo_Menu_Recent();
			Thread.sleep(6000);
			log("Mousehover on Recent Tab");
			jsclick(Recent_Folder);
			Thread.sleep(6000);
			log("Click on Recent Folder");
			jsclick(Select_Document);
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("User is alreday Logged");
		}
		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		Thread.sleep(6000);
		getMoveTo_Menu_Documents();
		Thread.sleep(6000);
		log("Mousehover to Document Tab");
		get_SecureLinkblankmail_Validation();
		Thread.sleep(6000);
		log("Verified Secure Link Mail Validation");
		getmessagevalidationBlankmail();
		Thread.sleep(6000);
		log("Verified message validation blank Mail");
		getenter_SecureLinkRecipientaddress();
		Thread.sleep(6000);
		log("Enter  Secure link Recipient address");
		getmessagevalidationConfirmmail();
		Thread.sleep(6000);
		log("Verified message validation Confirm mail");
		getClearRecipientmail();
		Thread.sleep(6000);
		log("Verifying and clear Recipient Mail address");
		getenter_validemailmessage();
		Thread.sleep(6000);
		log("Enter  Validation message");
		getVerifyMismatch_SecureLink_Confirmmail();
		Thread.sleep(6000);
		log("Verified Mismatch secure link Confirm mail");
		get_Mismatch_validation();
		Thread.sleep(6000);
		log("Verified Mismatch Validation");
		get_Confirmmail_Invalid();
		Thread.sleep(6000);
		log("Enter Confirm mail Invalid");
		get_Mismatch_validation();
		Thread.sleep(6000);
		log("Verified Mismatch Validation");
		get_EnterConfirmmail();
		Thread.sleep(6000);
		log("Enter Confirm Mail ");
		jsclick(SecureOK);
		Thread.sleep(6000);
		log("Click on Secure OK button");
		get_Mismatch_validation();
		log("Verified Mismatch Validation");
		getRecepientEmail_SecureLink();
		Thread.sleep(6000);
		log("Enter Recepient Email securelink");
		get_Mismatch_validation();
		log("Verified Mismatch Validation");
		getRecepietConfirmEmail_SecureLink();
		Thread.sleep(6000);
		log("Enter Recepient Confirm mail");
		get_Mismatch_validation();
		log("Verified Mismatch Validation");
		getRecepietConfirmEmailInvalid_SecureLink();
		Thread.sleep(6000);
		log("Enter Invalid Recepient Confirm mail");
		get_Mismatch_validation();
		Thread.sleep(6000);
		log("Verified Mismatch Validation");
		getenterConfirmRecepietEmail_SecureLink();
		Thread.sleep(6000);
		log("Enter Confirm Recepient Email");
		try {
			jsclick(SecureMessageOK);
			Thread.sleep(6000);
			log("Click on Secure message Ok button");
			jsclick(SecureDialogCancel);
		} catch (Exception e1) {
			// Secure link not send

		}
		log("Securelink Mail validation Verified successfully");
	}

	public void Verify_Accept_Workflow_Validation() throws Exception {

		log("Test Scenario 8 : Verifying Accept Workflow Validation ");
		try {
			LogDipakUser();
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("User is alreday Logged");
		}
		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
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
		getSelect_Office_document_Defaultviewing();
		Thread.sleep(6000);
		log("Select Office document and set as Default View");
		getPdf_document_Defaultviewing();
		Thread.sleep(6000);
		log("Select Pdf document and set as Default View");
		movingclkElement(Apply_button);
		Thread.sleep(6000);
		log("Click on  Apply button");
		MoveTo_ToDoList_Option();
		log("Move to  To Do List Tab ");
		jsclick(Select_All_Item);
		Thread.sleep(6000);
		log("Click on All Item Option");
		jsclick(Open_ToDoDocument);
		Thread.sleep(6000);
		log("Select and Open To Do List Document");
		try {
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present");
		}
		log("Document open successfully ");
		Thread.sleep(6000);
		getVerifyAccept();
		Thread.sleep(6000);
		log("Verified Accept Tab");
		get_comment_Validation();
		Thread.sleep(6000);
		log("Verified Comment Validation");
		jsclick(wfactionCancel);
		Thread.sleep(6000);
		log("Verified Accept Workflow action Cancel button");
		log("Accept workflow validation Verified successfully");
	}

	public void Verify_Reject_Workflow_Validation() throws Exception {

		log("Test Scenario 9 : Verifying Reject Workflow Validation");

		try {
			LogDipakUser();
			Thread.sleep(6000);
			MoveTo_ToDoList_Option();
			log("Move to  To Do List Tab ");
			jsclick(Select_All_Item);
			Thread.sleep(6000);
			log("Click on All Item Option");
			jsclick(Open_ToDoDocument);
			Thread.sleep(6000);
			log("Select and Open To Do List Document");
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
			log("Document open successfully ");
			Thread.sleep(6000);
		} catch (Exception e) {
			log(" user alreday Logging and Workflow document open");
		}
		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		getVerifyReject();
		Thread.sleep(6000);
		log("Verified Reject Tab");
		get_comment_Validation();
		Thread.sleep(6000);
		log("Verified Comment Validation");
		jsclick(wfactionCancel);
		Thread.sleep(6000);
		log("Verified Reject Workflow action Cancel button");
		log("Reject workflow validation Verified successfully");

	}

	public void Verify_EndWorkflow_Workflow_Validation() throws Exception {

		log("Test Scenario 10 : Verifying EndWorkflow Workflow Validation ");
		try {
			LogDipakUser();
			Thread.sleep(6000);
			MoveTo_ToDoList_Option();
			log("Move to  To Do List Tab ");
			jsclick(Select_All_Item);
			Thread.sleep(6000);
			log("Click on All Item Option");
			jsclick(Open_ToDoDocument);
			Thread.sleep(6000);
			log("Select and Open To Do List Document");
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
			log("Document open successfully ");
			Thread.sleep(6000);
		} catch (Exception e) {
			log(" user alreday Logging and Workflow document open");
		}
		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		getVerifyEndWorkflow();
		Thread.sleep(6000);
		log("Verified End Workflow Tab");
		get_comment_Validation();
		Thread.sleep(6000);
		log("Verified Comment Validation");
		jsclick(wfactionCancel);
		Thread.sleep(6000);
		log("Verified End Workflow Action Cancel button");
		log("End workflow validation Verified successfully");

	}

	public void Verify_Summary_Workflow_Validation() throws Exception {

		log("Test Scenario 11 : Verifying Summary Workflow Validation");
		try {
			LogDipakUser();
			Thread.sleep(6000);
			MoveTo_ToDoList_Option();
			log("Move to  To Do List Tab ");
			jsclick(Select_All_Item);
			Thread.sleep(6000);
			log("Click on All Item Option");
			jsclick(Open_ToDoDocument);
			Thread.sleep(6000);
			log("Select and Open To Do List Document");
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
			log("Document open successfully ");
			Thread.sleep(6000);
		} catch (Exception e) {
			log(" user alreday Logging and Workflow document open");
		}
		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		getverifySummary();
		Thread.sleep(6000);
		log("Verified Workflow Summary Tab");
		jsclick(SummaryCancel);
		Thread.sleep(6000);
		log("Verified Workflow Summary Cancel button");
		log("Summary workflow validation Verified successfully");
	}

	public void Verify_Comment_Workflow_Validation() throws Exception {

		log("Test Scenario 12 : Verifying Comment Workflow Validation ");
		try {
			LogDipakUser();
			Thread.sleep(6000);
			MoveTo_ToDoList_Option();
			log("Move to  To Do List Tab ");
			jsclick(Select_All_Item);
			Thread.sleep(6000);
			log("Click on All Item Option");
			jsclick(Open_ToDoDocument);
			Thread.sleep(6000);
			log("Select and Open To Do List Document");
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
			log("Document open successfully ");
			Thread.sleep(6000);
		} catch (Exception e) {
			log(" user alreday Logging and Workflow document open");
		}
		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		getverifyComment();
		Thread.sleep(6000);
		log("Verified Workflow Comment Tab");
		get_comment_Validation();
		Thread.sleep(6000);
		log("Verified Workflow Comment Validation");
		jsclick(wfactionCancel);
		Thread.sleep(6000);
		log("Click on  Workflow action Cancel button");
		log("Comment workflow validation Verified successfully");
		Refresh_Button();
		log("Click on Refresh button");
	}

	// Offline Document

	public void Create_OfflineDocument() throws Exception {

		log("Test Scenario 1:Create Offline Document");

		Refresh_Button();
		Thread.sleep(6000);
		log("Click on the Refresh button");
		selectElement(Select_Cabinet);
		Thread.sleep(6000);
		log("Expand a cabinet");
		selectElement(Select_Drawer);
		Thread.sleep(6000);
		log("Expand a drawer");
		selectElement(Select_Folder);
		Thread.sleep(6000);
		log("select a folder");
		jsclick(Open_Document);
		try {
			WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait2.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Thread.sleep(6000);
		log("Document open Successfully");
		Thread.sleep(6000);
		jsclick(SelectCheckbox);
		Thread.sleep(6000);
		log("Select Document checkbox from Thumbnail");
		jsclick(pageofflinemenu);
		Thread.sleep(6000);
		log("Click on Offline page menu option");
		jsclick(clickokbutton);
		Thread.sleep(6000);
		log("Click on Document offline message ok button");
		log("Document Created successfully and send to Offline");
	}

	public void Open_Offline_Doc() throws Exception {

		log("Test Scenario 2:Open Offline Doc");
		try {
			LogDipakUser();
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("User is alreadyLogged");
		}
		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		Refresh_Button();
		Thread.sleep(6000);
		log("Click on Refresh button");
		getMoveTo_Menu_Recent();
		Thread.sleep(6000);
		log("Mousehover to Recent Tab");
		jsclick(Recent_Folder);
		Thread.sleep(6000);
		log("Click on Recent Folder");
		jsclick(Open_Document);
		Thread.sleep(6000);
		log("Document page open succesfully");
		getVerify_Ownership_Message();
		jsclick(clickokbutton);
		Thread.sleep(6000);
		log("Document Is in Offline message showing succesfully open document in View only mode");
		jsclick(closedoc);
		log("Document page Close succesfully");
	}

	public void Sync_New_Document_onOffline_Doc() throws Exception {

		log("Test Scenario 3:Sync New Document on Offline Doc");
		try {
			LogDipakUser();
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("User is alreadyLogged");
		}
		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		Refresh_Button();
		Thread.sleep(6000);
		log("Click on Refresh button");
		jsclick(Username);
		Thread.sleep(6000);
		log("Click on Username");
		jsclick(offlinedoc);
		Thread.sleep(6000);
		log("Click on Offline Document option");
		jsclick(checkofflinedoc);
		Thread.sleep(6000);
		log("Document showing Succesfully under Offline page and select offline document");

		log("New document sync successfully");
	}

	public void Release_Offline_Doc() throws Exception {

		log("Test Scenario 4: Release Offline Doc");
		try {
			LogDipakUser();
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("User is alreadyLogged");
		}
		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		Refresh_Button();
		Thread.sleep(6000);
		log("Click on Refresh button");
		jsclick(Username);
		Thread.sleep(6000);
		log("Click on Username");
		jsclick(offlinedoc);
		Thread.sleep(6000);
		log("Click on Offline Document option");
		jsclick(checkofflinedoc);
		Thread.sleep(6000);
		log("Select Offline Document page");
		jsclick(ReleaseDoc);
		Thread.sleep(6000);
		log("Click on Release option and Document Release succesfully");
		getMoveTo_Menu_Recent();
		Thread.sleep(6000);
		log("Mousehover to Recent Tab");
		jsclick(Recent_Folder);
		Thread.sleep(6000);
		log("Click on Recent Folder");
		jsclick(Open_Document);
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
		log("Document open Successfully");
		log("Document Release successfully");
		Refresh_Button();
		log("Click on Refresh button");

	}

}
