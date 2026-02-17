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

import Computhink.Generic.BaseClass;

public class Language extends BaseClass {

	public static WebElement element = null;
	

	public Language() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//*[@id=\"logoutElement\"]")
	private WebElement Username;

	@FindBy(xpath = "//*[@id=\"idSidenav\"]/ul/li[1]/a")
	private WebElement Logout;

	@FindBy(xpath = "//*[@id=\"locale\"]/a[1]")
	private WebElement English_Language;

	@FindBy(xpath = "//*[@id=\"locale\"]/a[2]")
	private WebElement Spanish_Language;

	@FindBy(xpath = "//*[@id=\"locale\"]/a[3]")
	private WebElement French_Language;

	@FindBy(xpath = "//*[@id=\"locale\"]/a[4]")
	private WebElement Dutch_Language;

	@FindBy(xpath = "//*[@id=\"locale\"]/a[5]")
	private WebElement Hindi_Language;

	@FindBy(xpath = "//*[@id=\"imgSettings\"]")
	private WebElement Setting_Icon;

	@FindBy(xpath = "//*[@id=\"myPreferencesSettingsNav\"]")
	private WebElement My_Preferencesetting;

	@FindBy(xpath = "//*[@id=\"myPreferencesSubmit\"]")
	private WebElement Apply_button;

	@FindBy(xpath = "//*[@id=\"defaultOfficeDocViewListNo\"]")
	private WebElement Select_Office_document_Defaultviewing;

	@FindBy(xpath = "//*[@id=\"defaultPdfDocViewListNo\"]")
	private WebElement Pdf_document_Defaultviewing;

	@FindBy(xpath = "//*[@id=\"loginForm\"]/div[1]/div[2]/div[2]")
	private WebElement Passworderror;

	@FindBy(xpath = "//*[@id=\"loginForm\"]/div[1]/div[1]/div[2]")
	private WebElement Usernameerror;

	@FindBy(xpath = "//*[@id=\"loginError\"]")
	private WebElement Roomerror;

	// Spanish Language

	@FindBy(xpath = ("//*[@id=\"createDocument\"]"))
	private WebElement NewDocuments_MenuOption;

	@FindBy(xpath = "//*[@id=\"createDocuemtnLocation\"]")
	private WebElement Destination_Folder_Textbox;

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

	@FindBy(xpath = "//*[@id=\"ocrPopUp\"]")
	private WebElement ocrpopup;

	@FindBy(xpath = ".//div[@id='Underscore _.pdf']/div[1]/img[1]")
	private WebElement Open_Underscore_page;

	@FindBy(linkText = "bijwerken")
	private WebElement UpdateDutch_Button;

	@FindBy(linkText = "opslaan")
	private WebElement DutchSave_UpdateButton;

	@FindBy(xpath = "//button[@id='CommentsMessageModelOk']")
	private WebElement DutchUpdate_Ok_button;

	@FindBy(xpath = "//span[normalize-space()='EIGENSCHAPPEN']")
	private WebElement DutchProperties_option;

	@FindBy(xpath = "//td[contains(text(),'MORTHWEST MEDICAT')]")
	private static WebElement ReportNameValueBeforeDoc;

	@FindBy(xpath = "//div[@id='showcustomTodoListModel']//input[@id='searchInput']")
	private WebElement TODOSearchBox;

	@FindBy(xpath = "//td[contains(text(),'Export Documentary Credit (DC) Bill Ne')]")
	private static WebElement ReportNameValueAfterDoc;

	@FindBy(xpath = "//*[@id=\"Hyphen -.tif\"]/div/img")
	private WebElement Open_Hyphen_page;

	@FindBy(xpath = "//*[@id=\"recentMenuBtn\"]")
	private WebElement MoveTo_Menu_Recent;

	@FindBy(xpath = "//*[@id=\"recentFolders\"]/tbody/tr[1]/td")
	private WebElement Recent_Folder;

	@FindBy(xpath = "//*[@id=\"modelHome\"]")
	private WebElement Navigate_Button;

	@FindBy(xpath = "//span[@title='Document Close']")
	private WebElement Close_Document;

	@FindBy(xpath = "//*[@id=\"navigatorTreeOk\"]")
	private WebElement OK_Button_BrowseforFolder;

	@FindBy(xpath = "//*[@id=\"docTypeList\"]")
	private WebElement Click_Document_Type_Dropdown;

	@FindBy(xpath = "//*[@id=\"loginError\"]")
	private WebElement Usernotexist;

	@FindBy(xpath = "//*[@id=\"messageContent\"]")
	private WebElement Filenamevalidation;

	@FindBy(xpath = "//*[@id=\"Word document automation.docx\"]/div/img")
	private WebElement Open_Word_page;

	@FindBy(xpath = "//*[@id=\"Excel document automation.xlsx\"]/div/img")
	private WebElement Open_Excel_page;

	@FindBy(xpath = "//*[@id=\"templateOK\"]")
	private WebElement OKButton;

	@FindBy(xpath = "//*[@id=\"createDocumentMessage\"]")
	private WebElement NavigateDoc;

	@FindBy(xpath = "//*[@id=\"modelHome\"]")
	private WebElement NavigateButton;

	@FindBy(xpath = "//*[@id=\"messageContent\"]")
	private WebElement Formmappingvalidation;

	@FindBy(xpath = "//*[@id=\"messageButtonOK\"]")
	private WebElement FormOKbutton;

	@FindBy(xpath = "//*[@id=\"loadmorecount\"]")
	private WebElement Enter_Loadmorecount;

	@FindBy(xpath = "//span[@id='totalSearchCount']")
	private WebElement Verify_Loadmorecount_Searchresult;

	@FindBy(xpath = "//strong[@id='docCount']")
	private WebElement Verify_Loadmorecount_Document_Folder;

	@FindBy(xpath = "//*[@id=\"loadMoreDocList\"]/button")
	private WebElement Loadmorebutton;

	@FindBy(xpath = "//*[@id=\"advSearchMenuBtn\"]")
	private WebElement Click_Search_Option;

	@FindBy(xpath = "//*[@id=\"advFindBtnLabel\"]")
	private WebElement Find_Button;

	@FindBy(xpath = "//*[@id=\"loginError\"]")
	private WebElement Invalidpassword;

	@FindBy(xpath = "//*[@id=\"idSidenav\"]/h3")
	private WebElement MyaccountText;

	@FindBy(xpath = "//*[@id=\"createDocumentSubmit\"]")
	private WebElement Create_Button;

	@FindBy(xpath = "//*[@id=\"viewCreatedDocument\"]")
	private WebElement View_Button;

	@FindBy(xpath = "//*[@id=\"fileInfoButton\"]/span")
	private WebElement Click_FileInfo_Option;

	@FindBy(xpath = "//*[@id='docTypeIndicesTable']/tbody[1]/tr[1]/td[2]/input[1]")
	private WebElement Enter_Report_Name_Text;

	@FindBy(xpath = "//*[@id=\"addPagesDropDown\"]/span")
	private WebElement Move_To_PlusIcon;

	@FindBy(xpath = "//*[@id=\"viewDocumentAddPages\"]")
	private WebElement Browse_Option;

	@FindBy(xpath = "//*[@id=\"fileNameLabel\"]")
	private WebElement Click_FileInfo_OkButton_withFileName;

	@FindBy(xpath = "//*[@id=\"fileRenameOK\"]")
	private WebElement RemarkOk;

	@FindBy(xpath = "//*[@id=\"btnSignatureAdd\"]/span[1]")
	private WebElement Click_signature_Menuoption;

	@FindBy(xpath = ("//*[@id=\"imageViewerDiv\"]/div[2]/canvas"))
	private WebElement Add_Signature_Onpage;

	@FindBy(xpath = "//*[@id=\"signInputPasswordL\"]")
	private WebElement signinputpassword;

	@FindBy(xpath = "//*[@id=\"verifySignaturePasswordL\"]")
	private WebElement verifypassok;

	@FindBy(xpath = "//*[@id=\"menuDropDownButton\"]/span")
	private WebElement Move_to_Annotation_Option_inViewer;

	@FindBy(xpath = "//*[@id=\"lockenable1\"]")
	private WebElement Redaction_Option;

	@FindBy(xpath = ("//*[@id=\"imageViewerDiv\"]/div[2]/canvas"))
	private WebElement Page;

	@FindBy(xpath = ("//*[@id=\"fabButton\"]"))
	private WebElement fabbtn;

	@FindBy(xpath = "//*[@id=\"objectName\"]")
	private WebElement objectname;

	@FindBy(xpath = "//*[@id=\"dlgInput_Input\"]")
	private WebElement input;

	@FindBy(xpath = "//*[@id=\"objectConfirmPassword\"]")
	private WebElement confirmpassword;

	@FindBy(xpath = "//*[@id=\"dlgInput_Apply\"]")
	private WebElement Apply;

	@FindBy(xpath = "//*[@id=\"saveAddedPages\"]/span")
	private WebElement saveaddpage;

	@FindBy(xpath = "//*[@id=\"messageButtonOK42\"]")
	private WebElement okbutton;

	@FindBy(xpath = "//*[@id=\"cvDocumentClose\"]/span")
	private WebElement closedoc;

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

	@FindBy(xpath = "//button[@id='messageButtonOK']")
	private WebElement Okbutton;

	@FindBy(xpath = "//*[@id=\"messageButtonNo27\"]")
	private WebElement Nobutton;

	@FindBy(xpath = "//*[@id=\"commentMessage\"]")
	private WebElement FolderSelectMessage;

	@FindBy(xpath = "//*[@id=\"CommentsMessageModelOk\"]")
	private WebElement CommentOK;

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

	@FindBy(xpath = "//*[@id=\"documentLinkOk\"]")
	private WebElement doclinkok;

	@FindBy(xpath = "//*[@id=\"messageContentLink\"]")
	private WebElement CopyDoclink;

	@FindBy(xpath = "//*[@id=\"sendDocAsReference\"]")
	private WebElement Referencemail;

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

	@FindBy(xpath = "//*[@id=\"cutid\"]")
	private WebElement Cut_ID;

	@FindBy(xpath = "//*[@id=\"documentListTable\"]/tbody/tr[1]/td[1]/label/span")
	private WebElement check;

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

	@FindBy(xpath = "//*[@id=\"sendtoworkflow\"]")
	private WebElement Workflow;

	@FindBy(css = "#assignedWfTable .odd:nth-child(13) > td")
	private WebElement AutoWorkflow;

	@FindBy(css = ".odd:nth-child(1) > .customDocName")
	private WebElement customdoc;

	@FindBy(xpath = "//*[@id=\"ownershipMessageModelOk\"]")
	private WebElement ownershipok;

	@FindBy(xpath = "//*[@id=\"notificationSettings\"]")
	private WebElement notification;

	@FindBy(xpath = "//*[@id=\"contentverseRef\"]")
	private WebElement contref;

	@FindBy(xpath = "//*[@id=\"documentHistory\"]")
	private WebElement dochistory;

	@FindBy(css = "//*[@id=\"dropdownNotifylist\"]")
	private WebElement notifylist;

	@FindBy(xpath = "//*[@id=\"spanCheckNotifications_1\"]")
	private WebElement checknotification;

	@FindBy(xpath = "//*[@id=\"notifySaveBtn\"]")
	private WebElement savenotify;

	@FindBy(css = ".odd:nth-child(1) > .customDocName")
	private WebElement customdocname;

	@FindBy(xpath = "//*[@id=\"general\"]/div/div[1]/span")
	private WebElement general;

	@FindBy(xpath = "//th[contains(text(),'DOCUMENT SIZE')]")
	private static WebElement DocumentSize;

	@FindBy(xpath = "//th[contains(text(),'CURRENT DATE')]")
	private static WebElement Currentdate;

	@FindBy(xpath = "//th[contains(text(),'REPORTNAME')]")
	private static WebElement REPORTNAME;

	@FindBy(xpath = "//*[@id=\"myTaskMenu\"]")
	private WebElement MoveTo_ToDoList_Option;

	@FindBy(xpath = "//*[@id=\"CustomUserTitleToDoList\"]/h2")
	private static WebElement titlevalidation;

	@FindBy(xpath = "//*[@id=\"tittleoftodoListcustom\"]/h2")
	private static WebElement textvalidation;

	@FindBy(xpath = "//*[@id=\"CustomListTodoOK\"]")
	private static WebElement ToDoList_Ok_Button_CustomList;

	@FindBy(xpath = "//*[@id=\"folderLocationForSearch\"]")
	private static WebElement Document_Location;

	@FindBy(xpath = "//*[@id=\"navigatorTreeOk1\"]")
	private static WebElement Ok_button;

	@FindBy(xpath = "//*[@id=\"documentListSubMenu\"]")
	private WebElement MoveTo_Menu_Documents;

	// Custom Columns

	@FindBy(xpath = "//*[@id=\"CustomList\"]")
	private WebElement CustomColumnOptionRoom;

	@FindBy(xpath = "//*[@id=\"todoAll\"]")
	private WebElement Select_All_Item;

	@FindBy(xpath = "//*[@id=\"todoResetColumns\"]")
	private WebElement To_Do_Resetcolumn_Option;

	@FindBy(xpath = "//*[@id=\"spanCheckCustomValues_Text key\"]")
	private WebElement Select_Indices01;

	@FindBy(xpath = "//*[@id=\"spanCheckCustomValues_Numeric 123\"]")
	private WebElement Select_Indices02;

	@FindBy(xpath = "//*[@id=\"spanCheckCustomValues_Date 123\"]")
	private WebElement Select_Indices03;

	@FindBy(xpath = "//*[@id=\"setCustomListdropdown\"]")
	private WebElement Click_DropdownOption;

	@FindBy(xpath = "//*[@id=\"roomLevel\"]")
	private WebElement Set_RoomLevel_Indices;

	@FindBy(xpath = "//*[@id=\"Resetcolumns\"]")
	private WebElement Room_Reset_CustomColumns;

	@FindBy(xpath = "//*[@id=\"culstomcolsearch\"]")
	private WebElement Search_Custom_Columns_option;

	@FindBy(xpath = "//*[@id=\"spanCheckCustomValues_Document Size\"]")
	private WebElement Search_Select_Indices01;

	@FindBy(xpath = "//*[@id=\"spanCheckCustomValues_Student Name\"]")
	private WebElement Search_Select_Indices02;

	@FindBy(xpath = "//*[@id=\"spanCheckCustomValues_ReportName\"]")
	private WebElement Search_Select_Indices03;

	@FindBy(xpath = "//*[@id=\"Defaultcolsearch\"]")
	private WebElement Search_ResetColumn;

	@FindBy(xpath = "//*[@id=\"resetColumsOk\"]")
	private WebElement Reset_Column_OK_Button;

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

	@FindBy(xpath = "//*[@id=\"formMapper\"]")
	private WebElement Click_Formmapper;

	@FindBy(xpath = "//select[@id='formField1']")
	private WebElement Select_Formfield;

	@FindBy(xpath = "//button[@id='setFormMapping']")
	private WebElement FormOK;

	@FindBy(xpath = "//span[@id='messageContent']")
	private WebElement Verify_DuplicateTemp_Message;

	@FindBy(xpath = "//span[@id='pdfViewerDiv_formdesignerIcon']")
	private WebElement pdfViewer;

	@FindBy(xpath = "//*[@id=\"pdfViewerDiv_formdesigner_textbox\"]")
	private WebElement Textbox;

	@FindBy(css = "#pdfViewerDiv_textLayer_0")
	private WebElement Add_Textbox_Onpage;

	@FindBy(xpath = "//th[contains(text(),'DATE 123')]")
	private static WebElement DATE;

	@FindBy(xpath = "//th[contains(text(),'NUMERIC 123')]")
	private static WebElement NUMERIC;

	@FindBy(xpath = "//th[contains(text(),'TEXT KEY')]")
	private static WebElement TEXT;

	@FindBy(xpath = "//*[@id=\"DefaultCustomList\"]")
	private static WebElement Default_Button_CustomList;

	@FindBy(xpath = "//*[@id=\"CustomListCancel\"]")
	private static WebElement Cancel_Button_CustomList;

	@FindBy(xpath = "//*[@id=\"advSearchMenuBtn\"]")
	private WebElement MoveTo_Search_Option;

	@FindBy(xpath = "//*[@id=\"CustomUserTitle\"]/h2")
	private WebElement Search_titelvalidation;

	@FindBy(xpath = "//*[@id=\"tittleofcustom\"]/h2")
	private WebElement Search_textvalidation;

	@FindBy(xpath = "//*[@id=\"CustomListOK\"]")
	private static WebElement Search_Ok_Button_CustomList;

	@FindBy(xpath = ("//tbody/tr[1]/td[1]/label[1]/span[1]"))
	private WebElement Select_Document;

	@FindBy(xpath = "//*[@id=\"logoutElement\"]")
	private WebElement Click_Username;

	@FindBy(xpath = "//*[@id=\"idSidenav\"]/ul/li[1]/a")
	private WebElement Click_LogoutOption;

	@FindBy(xpath = "//*[@id=\"documentListTable\"]/tbody/tr[1]/td[3]")
	private WebElement Open_Document;

	@FindBy(xpath = "//*[@id=\"CustomListCancel\"]")
	private WebElement cancelbutton;

	@FindBy(xpath = "//*[@id=\"CustomListTodoCancel\"]")
	private WebElement cancelTODObutton;

	@FindBy(xpath = "//*[@id=\"customTodoListModelClose\"]")
	private WebElement CrosscancelTODObutton;

	@FindBy(xpath = "//*[@id=\"spanCheckCustomValuesTodolist_Workflow Status\"]")
	private WebElement ToDoList_Select_Indices01;

	@FindBy(xpath = "//*[@id=\"searchInput\"]")
	private WebElement SearchBoxTODO;

	@FindBy(xpath = "//th[contains(text(),'WORKFLOW STATUS')]")
	private static WebElement WORKFLOWSTATUS;

	@FindBy(xpath = "//tbody/tr[1]/td[1]/label[1]/span[1]")
	private static WebElement getSelect_Document;

	@FindBy(id = "sendtoworkflow")
	private static WebElement sendWorkflow;

	@FindBy(css = "#assignedWfTable td")
	private static WebElement WFAssign;

	@FindBy(xpath = "//*[@id=\"copyId\"]")
	private WebElement Copy_ID;

	@FindBy(xpath = "//*[@id=\"pasteid\"]")
	private WebElement Paste_ID;

	@FindBy(xpath = "//*[@id=\"searchInput\"]")
	private WebElement SearchBox;

	@FindBy(xpath = "//*[@id=\"customListModelClose\"]")
	private WebElement Crosscancel;

	@FindBy(xpath = "//*[@id=\"viewerZoomId\"]")
	private WebElement Select_Dropdown_Actual_Size;

	@FindBy(xpath = "//*[@id=\"saveAddedPages\"]/span")
	private WebElement Save_button;

	@FindBy(xpath = "//*[@id=\"messageButtonOK42\"]")
	private WebElement DocumentSave_Ok_button;

	@FindBy(linkText = "actualizar")
	private WebElement UpdateSpanish_Button;

	@FindBy(linkText = "salvar")
	private WebElement SpanishSave_UpdateButton;

	@FindBy(xpath = "//button[@id='CommentsMessageModelOk']")
	private WebElement SpanishUpdate_Ok_button;

	@FindBy(xpath = "//span[normalize-space()='PROPIEDADES']")
	private WebElement SpanishProperties_option;

	@FindBy(linkText = "ReportName")
	private WebElement ReportName;

	@FindBy(xpath = "//*[@id=\"showHideThumbnail\"]/span")
	private WebElement showHideThumbnail;

	@FindBy(xpath = "//*[@id=\"documentTemplates\"]")
	private WebElement Templates_MenuOption;

	@FindBy(xpath = "//*[@id=\"navigatorTreeCancle\"]")
	private WebElement Cancel_Button_BrowseforFolder;

	@FindBy(xpath = "//*[@id=\"createTemplateBtn\"]")
	private WebElement Save_Template_Button;

	@FindBy(xpath = "//*[@id=\"createTemplateCancel\"]")
	private WebElement Template_Description_No_button;

	@FindBy(xpath = "//*[@id=\"templateName\"]")
	private WebElement Template_NameTextbox;

	@FindBy(xpath = "//*[@id=\"messageButtonOK\"]")
	private WebElement Template_Created_OK_button;

	@FindBy(xpath = "//*[@id=\"documentTemplates\"]")
	private WebElement Moveto_Templates_Option;;

	@FindBy(xpath = "//*[@id=\"templateDescription\"]")
	private WebElement Template_Description_Messagebox;

	@FindBy(xpath = "//*[@id=\"createTemplateOk\"]")
	private WebElement Template_Description_OK_button;

	@FindBy(xpath = "//*[@id=\"messageContent\"]")
	private WebElement Template_Created_Message_Verify;

	@FindBy(id = "Template_Automation1")
	private WebElement Select_Created_Template;

	@FindBy(xpath = "//*[@id=\"createDocumentSubmit\"]")
	private WebElement Created_button;

	@FindBy(xpath = "//*[@id=\"modelHome\"]")
	private WebElement Navigate_button;

	@FindBy(xpath = "//*[@id=\"editTemplate1\"]")
	private WebElement Click_Edit_Template_Button;

	@FindBy(xpath = "//*[@id=\"editTemplateDescription\"]")
	private WebElement EditTemplate_Description_Messagebox;

	@FindBy(xpath = "//*[@id=\"messageButtonOK\"]")
	private WebElement EditTemplate_Created_OK_button;

	@FindBy(xpath = "//*[@id=\"delTemp\"]")
	private WebElement Delete_Template_Button;

	@FindBy(xpath = "//*[@id=\"deleteTemplateOk\"]")
	private WebElement Delete_Template_OK_Button;

	@FindBy(xpath = "//*[@id=\"editTemplateCancel\"]")
	private WebElement EditTemplate_Description_No_button;

	@FindBy(xpath = "//select[@id='defaultOfficeDocViewListNo']")
	private WebElement Select_Office_document_Advancedviewing;

	@FindBy(xpath = ("//*[@id=\"addWordFile\"]"))
	private WebElement New_Word_Document_Option;

	@FindBy(xpath = "//*[@id=\"editTemplateOk\"]")
	private WebElement EditTemplate_Description_OK_button;

	@FindBy(xpath = "//*[@id=\"messageContent\"]")
	private WebElement EditTemplate_Created_Message_Verify;

	@FindBy(xpath = "//*[@id=\"rubberBandInteractiveMode_shortcut\"]/span")
	private WebElement ClickOCR;

	@FindBy(xpath = ("//*[@id='searchDocumentNavigator1']/ul/li[1]/a"))
	private WebElement Search_Cabinet;

	@FindBy(xpath = ("//*[@id='searchDocumentNavigator1']/ul/li[1]/ul/li[1]/a"))
	private WebElement Search_Drawer;

	@FindBy(xpath = ("//*[@id='searchDocumentNavigator1']/ul/li[1]/ul/li/ul/li[1]/a"))
	private WebElement Search_Folder;

	@FindBy(xpath = "//button[@id='CustomListOK']")
	private static WebElement Ok_Button_CustomList;

	public void Verify_Reset_CustomColumsnRoom() {

		if (Room_Reset_CustomColumns.isEnabled() == true) {
			jsclick(Room_Reset_CustomColumns);
		}
	}

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

	public void getSet_OCR_ToDocument() throws Exception {
		Actions action = new Actions(driver);
		WebElement element = Page;
		action.dragAndDropBy(element, -300, -20).build().perform();
		jsclick(Page);
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

	public void loginwithoutUsername() throws Exception {
		driver.findElement(By.xpath("//input[@id='userName']")).clear();
		log("Do not entered username into username field");
		driver.findElement(By.id("loginPassword")).sendKeys(ExcelLogin(1, 1));
		log("Enter valid Password into Password field");
		WebElement room = driver.findElement(By.xpath("//select[@id='rooms']"));
		Select sel = new Select(room);
		sel.selectByVisibleText(ExcelLogin(1, 2));
		log("Select a Room");
		Thread.sleep(3000);
		try {
			Thread.sleep(6000);
			WebElement Captch = driver.findElement(By.xpath("//*[@id=\"image\"]"));
			WebElement enterCaptch = driver.findElement(By.xpath("//*[@id=\"captchaInput\"]"));
			enterCaptch.sendKeys(Captch.getText());
			log("Enter a valid captch under textbox");
		} catch (Exception e) {
			// captch is not displayed
		}
		driver.findElement(By.id("submitid")).click();
		log("Click on the Login button");
		Thread.sleep(6000);

		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.alertIsPresent());
			acceptAlert();
		} catch (Exception e) {
			// Database alert is not present
		}
	}

	public void loginwithoutPassword() throws Exception {

		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(ExcelLogin(1, 0));
		log("Enter valid Username into Username field");
		driver.findElement(By.id("loginPassword")).clear();
		log("Do not entered password into password field");
		WebElement room = driver.findElement(By.xpath("//select[@id='rooms']"));
		Select sel = new Select(room);
		sel.selectByVisibleText(ExcelLogin(1, 2));
		log("Select a Room");
		Thread.sleep(3000);
		try {
			Thread.sleep(6000);
			WebElement Captch = driver.findElement(By.xpath("//*[@id=\"image\"]"));
			WebElement enterCaptch = driver.findElement(By.xpath("//*[@id=\"captchaInput\"]"));
			enterCaptch.sendKeys(Captch.getText());
			log("Enter a valid captch under textbox");
		} catch (Exception e) {
			// captch is not displayed
		}
		driver.findElement(By.id("submitid")).click();
		log("Click on the Login button");
		Thread.sleep(6000);

		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.alertIsPresent());
			acceptAlert();
		} catch (Exception e) {
			// Database alert is not present
		}
	}

	public void loginwithoutRoomname() throws Exception {

		driver.findElement(By.xpath("//input[@id='userName']")).clear();
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(ExcelLogin(1, 0));
		log("Enter valid Username into Username field");
		driver.findElement(By.id("loginPassword")).sendKeys(ExcelLogin(1, 1));
		log("Enter valid Password into Password field");
		WebElement room = driver.findElement(By.xpath("//select[@id='rooms']"));
		Select sel = new Select(room);
		sel.selectByIndex(0);
		log("Select Please select a room Option");
		Thread.sleep(3000);
		try {
			Thread.sleep(6000);
			WebElement Captch = driver.findElement(By.xpath("//*[@id=\"image\"]"));
			WebElement enterCaptch = driver.findElement(By.xpath("//*[@id=\"captchaInput\"]"));
			enterCaptch.sendKeys(Captch.getText());
			log("Enter a valid captch under textbox");
		} catch (Exception e) {
			// captch is not displayed
		}
		driver.findElement(By.id("submitid")).click();
		log("Click on the Login button");
		Thread.sleep(6000);

		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.alertIsPresent());
			acceptAlert();
		} catch (Exception e) {
			// Database alert is not present
		}
	}

	public void getUsernameerror() {

		String expectedtext = "Please enter username";
		String actualtext = Usernameerror.getText();
		Assert.assertEquals(actualtext, expectedtext);
		log(Usernameerror.getText() + " validation message should show");

	}

	public void getPassworderror() {

		String expectedtext = "Please enter password";
		String actualtext = Passworderror.getText();
		Assert.assertEquals(actualtext, expectedtext);
		log(Passworderror.getText() + " validation message should show");

	}

	public void getRoomerror() {

		String expectedtext = "Select a room";
		String actualtext = Roomerror.getText();
		Assert.assertEquals(actualtext, expectedtext);
		log(Roomerror.getText() + " validation message should show when none of above room selected for Login");

	}

	public void InvalidUsername() throws Exception {

		driver.findElement(By.xpath("//input[@id='userName']")).clear();
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(ExcelLogin(1, 1));
		log("Enter Invalid Username into Username field");
		driver.findElement(By.id("loginPassword")).clear();
		driver.findElement(By.id("loginPassword")).sendKeys(ExcelLogin(1, 1));
		log("Enter valid Password into Password field");
		WebElement room = driver.findElement(By.xpath("//select[@id='rooms']"));
		Select sel = new Select(room);
		sel.selectByVisibleText(ExcelLogin(1, 2));
		log("Select a Room");
		Thread.sleep(3000);
		try {
			Thread.sleep(6000);
			WebElement Captch = driver.findElement(By.xpath("//*[@id=\"image\"]"));
			WebElement enterCaptch = driver.findElement(By.xpath("//*[@id=\"captchaInput\"]"));
			enterCaptch.sendKeys(Captch.getText());
			log("Enter a valid captch under textbox");
		} catch (Exception e) {
			// captch is not displayed
		}
		driver.findElement(By.id("submitid")).click();
		log("Click on the Login button");
		Thread.sleep(6000);

		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.alertIsPresent());
			acceptAlert();
		} catch (Exception e) {
			// Database alert is not present
		}
	}

	public void InvalidPassword() throws Exception {

		driver.findElement(By.xpath("//input[@id='userName']")).clear();
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(ExcelLogin(1, 0));
		log("Enter valid Username into Username field");
		driver.findElement(By.id("loginPassword")).clear();
		driver.findElement(By.id("loginPassword")).sendKeys(ExcelLogin(1, 0));
		log("Enter Invalid Password into Password field");
		WebElement room = driver.findElement(By.xpath("//select[@id='rooms']"));
		Select sel = new Select(room);
		sel.selectByVisibleText(ExcelLogin(1, 2));
		log("Select a Room");
		Thread.sleep(3000);
		try {
			Thread.sleep(6000);
			WebElement Captch = driver.findElement(By.xpath("//*[@id=\"image\"]"));
			WebElement enterCaptch = driver.findElement(By.xpath("//*[@id=\"captchaInput\"]"));
			enterCaptch.sendKeys(Captch.getText());
			log("Enter a valid captch under textbox");
		} catch (Exception e) {
			// captch is not displayed
		}
		driver.findElement(By.id("submitid")).click();
		log("Click on the Login button");
		Thread.sleep(6000);

		try {
			WebElement sessionmsg = driver.findElement(By.xpath("//*[@id=\"cvModelLoginValidationMessage\"]"));
			WebElement sessionmsgNO = driver.findElement(By.xpath("//*[@id=\"cvModelLoginValidationCancel\"]"));
			log(sessionmsg.getText() + "this message is displayed");
			sessionmsgNO.click();
			Thread.sleep(2000);
			log("Click on the No button");

		} catch (Exception e1) {
			// Session message is not displayed
		}

		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.alertIsPresent());
			acceptAlert();
		} catch (Exception e) {
			// Database alert is not present
		}
	}

	public void getUsernotexist() {

		String expectedtext = "The username or password was incorrect";
		String actualtext = Usernotexist.getText();
		Assert.assertEquals(actualtext, expectedtext);
		log(Usernotexist.getText() + " validation message should show");

	}

	public void getInvalidpassword() {

		String expectedtext = "The username or password was incorrect";
		String actualtext = Invalidpassword.getText();
		Assert.assertEquals(actualtext, expectedtext);
		log(Invalidpassword.getText() + " validation message should show");

	}

	public void French_Myaccount_Text_Laguage() throws InterruptedException {

		Thread.sleep(4000);
		String expectedtext2 = "Mon compte";
		String actualtext2 = MyaccountText.getText();
		Assert.assertEquals(actualtext2, expectedtext2, "Laguage verification failed");
		log("Change Laguage in French and My Account Text is: " + MyaccountText.getText());

	}

	public void Dutch_Myaccount_Text_Laguage() throws InterruptedException {

		Thread.sleep(4000);
		String expectedtext2 = "Mijn rekening";
		String actualtext2 = MyaccountText.getText();
		Assert.assertEquals(actualtext2, expectedtext2, "Laguage verification failed");
		log("Change Laguage in Dutch and My Account Text is: " + MyaccountText.getText());

	}

	public void Hindi_Myaccount_Text_Laguage() throws InterruptedException {

		Thread.sleep(4000);
		String expectedtext2 = "";
		String actualtext2 = MyaccountText.getText();
		Assert.assertEquals(actualtext2, expectedtext2, "Laguage verification failed");
		log("Change Laguage in Hindi and My Account Text is: " + MyaccountText.getText());

	}

	public void English_Myaccount_Text_Laguage() throws InterruptedException {

		Thread.sleep(4000);
		String expectedtext2 = "My Account";
		String actualtext2 = MyaccountText.getText();
		Assert.assertEquals(actualtext2, expectedtext2, "Laguage verification failed");
		log("Change Laguage in English and My Account Text is: " + MyaccountText.getText());

	}

	public void Spanish_Myaccount_Text_Laguage() throws InterruptedException {

		Thread.sleep(4000);
		String expectedtext2 = "Mi cuenta";
		String actualtext2 = MyaccountText.getText();
		Assert.assertEquals(actualtext2, expectedtext2, "Laguage verification failed");
		log("Change Laguage in spanish and My Account Text is : " + MyaccountText.getText());

	}

	public WebElement getgetSelect_Document_Type_Dropdown() {
		Select drop = new Select(Click_Document_Type_Dropdown);
		drop.selectByVisibleText("CVReports");
		return Click_Document_Type_Dropdown;
	}

	public WebElement getMove_To_PlusIcon() {
		WebElement ele = Move_To_PlusIcon;
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
		return ele;
	}

	public void getBrowse_Option() {
		WebElement ele = Browse_Option;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele);
	}

	public void getClick_FileInfo_Option() {
		WebElement ele = Click_FileInfo_Option;
		ele.click();
	}

	public void getClick_FileInfo_OkButton_withFileName() {
		WebElement Filename = Click_FileInfo_OkButton_withFileName;
		log("File name is:" + Filename.getText());
		WebElement ele = RemarkOk;
		ele.click();

	}

	public void getAdd_Signature_Onpage() throws Exception {
		Actions action = new Actions(driver);
		WebElement element = Add_Signature_Onpage;
		action.dragAndDropBy(element, 200, 100).build().perform();
	}

	public void getinputpassword() throws Exception {
		jsclick(signinputpassword);
		signinputpassword.sendKeys(Language_excelRead(2, 1));
		jsclick(verifypassok);

	}

	public void getMove_to_Annotation_Option_inViewer() throws Exception {
		WebElement ele = Move_to_Annotation_Option_inViewer;
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();

	}

	public void getRedaction_Option() throws Exception {
		WebElement ele1 = Redaction_Option;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele1);

	}

	public void getSet_Redaction_ToDocument() throws Exception {

		Actions act = new Actions(driver);
		act.click(Redaction_Option).clickAndHold(Page).moveToElement(fabbtn).release().build().perform();
		Thread.sleep(3000);
		objectname.sendKeys(Language_excelRead(2, 1));
		Thread.sleep(3000);
		jsclick(input);
		Thread.sleep(6000);
		input.sendKeys(Language_excelRead(2, 1));
		Thread.sleep(6000);
		jsclick(confirmpassword);
		Thread.sleep(6000);
		confirmpassword.sendKeys(Language_excelRead(2, 1));
		Thread.sleep(3000);
		jsclick(Apply);

	}

	public void getSelect_Dropdown_Actual_Size() {
		Select sel = new Select(Select_Dropdown_Actual_Size);
		sel.selectByVisibleText("Actual Size");
	}

	public void getSet_OCR_ToDocumentPDF() throws Exception {

		Actions action = new Actions(driver);
		WebElement element = Page;
		action.dragAndDropBy(element, -150, -20).build().perform();
		jsclick(Page);

	}

	public void getTemplate_Description_Messageboxvalue() throws Exception {
		Template_Description_Messagebox.sendKeys(Language_excelRead(2, 2));

	}

	public void getTemplate_NameTextboxvalue() throws Exception {
		Template_NameTextbox.sendKeys(Language_excelRead(1, 2));

	}

	public void getTemplate_Created_Message_Verify() {

		String expectedtext = "Template Created Successfully!";
		String actualtext = Template_Created_Message_Verify.getText();
		Assert.assertEquals(actualtext, expectedtext, "Text verification failed");

	}

	public void getMoveto_Templates_Option() {
		WebElement ele = Moveto_Templates_Option;
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();

	}

	public void getSelect_ReportName_Testvalue() throws Exception {
		Enter_Report_Name_Text.sendKeys(Language_excelRead(3, 2));
	}

	public void getEditTemplate_Description_Messageboxvalue() throws Exception {
		EditTemplate_Description_Messagebox.sendKeys(Language_excelRead(4, 2));
	}

	public void getEditTemplate_Created_Message_Verify() {

		String expectedtext = "Template Edited Successfully!";
		String actualtext = EditTemplate_Created_Message_Verify.getText();
		Assert.assertEquals(actualtext, expectedtext, "Text verification failed");

	}

	public void getSelect_Office_document_Advancedviewing() {
		Select sel = new Select(Select_Office_document_Advancedviewing);
		sel.selectByVisibleText("Advanced viewing");

	}

	public void getNew_Word_Document_Option() {
		WebElement ele1 = New_Word_Document_Option;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele1);

	}

	public void getEnter_Word_File_Name() throws Exception {
		WebElement ele = Enter_Word_File_Name;
		ele.sendKeys(Language_excelRead(5, 2));
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
		ele1.sendKeys(Language_excelRead(6, 2));
		TemplateOK.click();

	}

	public void getPdf_document_Advancedviewing() {
		Select drop = new Select(Pdf_document_Advancedviewing);
		drop.selectByVisibleText("Advanced viewing");

	}

	public void getNew_pdf_Document_Option() {
		WebElement ele1 = New_pdf_Document_Option;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele1);
	}

	public void getEnter_pdf_File_Name() throws Exception {
		WebElement ele1 = Enter_pdf_File_Name;
		ele1.sendKeys(Language_excelRead(7, 2));
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

	public void getVerify_DuplicateTemp_Message() {
		WebElement Message = Verify_DuplicateTemp_Message;
		log(Message.getText());

	}

	public void getFolderSelectMessage() {

		String expectedtext = "Please select a folder to create document";
		String actualtext = FolderSelectMessage.getText();
		Assert.assertEquals(actualtext, expectedtext);
		log(FolderSelectMessage.getText());
		jsclick(CommentOK);
	}

	public void getFolder_ErrorMessage() {

		String expectedtext = "Please add pages to the template before creating!";
		String actualtext = addpagesMessage.getText();
		Assert.assertEquals(actualtext, expectedtext, "Text verification failed");
		log(addpagesMessage.getText());
		jsclick(CommentOKbutton);

	}

	public void getvalidationerror() {

		String expectedtext = "*Template name should be specified.";
		String actualtext = validationerror.getText();
		Assert.assertEquals(actualtext, expectedtext, "Text verification failed");
		log(validationerror.getText());

	}

	public void getReportvaluevalidationerror() {

		String expectedtext = "ReportName*  	field is required";
		String actualtext = Reportvaluevalidationerror.getText();
		Assert.assertEquals(actualtext, expectedtext, "Text verification failed");
		log(Reportvaluevalidationerror.getText());
		jsclick(CommentOKbutton);

	}

	public void getFilenamevalidation() {

		String expectedtext = "Please enter file name ";
		String actualtext = Filenamevalidation.getText();
		Assert.assertEquals(actualtext, expectedtext, "Text verification failed");
		log(Filenamevalidation.getText());
		jsclick(CommentOKbutton);

	}

	public void getNavigateDoc() {

		String expectedtext = "Document created successfully";
		String actualtext = NavigateDoc.getText();
		Assert.assertEquals(actualtext, expectedtext, "Text verification failed");
		log(NavigateDoc.getText());
		jsclick(NavigateButton);

	}

	public void getFormmappingvalidation() {

		String expectedtext = "Please add form fields before mapping.";
		String actualtext = Formmappingvalidation.getText();
		Assert.assertEquals(actualtext, expectedtext);
		log(Formmappingvalidation.getText());
		jsclick(FormOKbutton);

	}
	// Load More count

	public void getEnter_Loadmorecount() throws Exception {
		WebElement ele = Enter_Loadmorecount;
		ele.clear();
		ele.sendKeys(CountexcelRead(1, 4));

	}

	public void getVerify_Loadmorecount_Searchresult() throws Exception {
		WebElement count = Verify_Loadmorecount_Searchresult;
		log("The " + count.getText());

	}

	public void getVerify_Loadmorecount_Document_Folder() throws Exception {
		WebElement DocDisplay = Verify_Loadmorecount_Document_Folder;
		log("Verify and " + DocDisplay.getText());

	}

	public WebElement getMoveTo_Menu_RoomName() {
		Actions action = new Actions(driver);
		action.moveToElement(MoveTo_Menu_RoomName).perform();
		return MoveTo_Menu_RoomName;
	}

	public void gettitelvalidation() {

		String expectedtext = "Custom List";
		String actualtext = titelvalidation.getText();
		Assert.assertEquals(actualtext, expectedtext, "Text verification failed");

	}

	public void getextvalidation() {

		String expectedtext = "Set custom columns";
		String actualtext = textlvalidation.getText();
		Assert.assertEquals(actualtext, expectedtext, "Text verification failed");
		String expectedtext2 = "Select the indices you want display for documents";
		String actualtext2 = textlvalidation2.getText();
		Assert.assertEquals(actualtext2, expectedtext2, "Text verification failed");

	}

	public void Verify_Indicess_Value() throws InterruptedException {

		Thread.sleep(4000);

		String expectedtext = "DATE 123";
		String actualtext = DATE.getText();
		Assert.assertEquals(actualtext, expectedtext, "Text verification failed");
		log("Indices01 value displayed successfully" + DATE.getText());
		Thread.sleep(4000);
		String expectedtext1 = "NUMERIC 123";
		String actualtext1 = NUMERIC.getText();
		Assert.assertEquals(actualtext1, expectedtext1, "Text verification failed");
		log("Indices02 value displayed successfully" + NUMERIC.getText());
		Thread.sleep(4000);
		String expectedtext2 = "TEXT KEY";
		String actualtext2 = TEXT.getText();
		Assert.assertEquals(actualtext2, expectedtext2, "Text verification failed");
		log("Indices03 value displayed successfully" + TEXT.getText());

	}

	public static void Default_Button_CustomList() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", Default_Button_CustomList);
	}

	public static void Cancel_Button_CustomList() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", Cancel_Button_CustomList);

	}

	public void Select_DropdownValue() {
		WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"setCustomListdropdown\"]"));
		jsclick(dropdown.findElement(By.xpath("//*[@id=\"roomLevel\"]")));

	}

	public void Verify_CompactView_checkbox() {
		if (driver.findElement(By.id("displayCompactViewOfList")).isSelected() == true) {
			jsclick(driver.findElement(By.id("displayCompactViewOfList")));
		}

	}

	// Search *

	public void MoveTo_Search_Option() {
		Actions action = new Actions(driver);
		action.moveToElement(MoveTo_Search_Option).perform();

	}

	public void getSearch_titelvalidation() {

		String expectedtext = "Custom List";
		String actualtext = Search_titelvalidation.getText();
		Assert.assertEquals(actualtext, expectedtext, "Text verification failed");

	}

	public void getSearch_textvalidation() {

		String expectedtext = "Select the indices you want display for documents";
		String actualtext = Search_textvalidation.getText();
		Assert.assertEquals(actualtext, expectedtext, "Text verification failed");

	}

	public static void Search_Ok_Button_CustomList() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", Search_Ok_Button_CustomList);
	}

	public void Search_Verify_Indicess_Value4() throws InterruptedException {

		Thread.sleep(4000);

		String expectedtext = "DOCUMENT SIZE";
		String actualtext = DocumentSize.getText();
		Assert.assertEquals(actualtext, expectedtext, "Text verification failed");
		log("Indices value displayed successfully" + DocumentSize.getText());

	}

	public void Search_Verify_Indicess_Value5() throws InterruptedException {

		Thread.sleep(4000);

		String expectedtext = "CURRENT DATE";
		String actualtext = Currentdate.getText();
		Assert.assertEquals(actualtext, expectedtext, "Text verification failed");
		log("Indices value displayed successfully" + Currentdate.getText());

	}

	public void Search_Verify_Indicess_Value6() throws InterruptedException {

		Thread.sleep(4000);

		String expectedtext = "REPORTNAME";
		String actualtext = REPORTNAME.getText();
		Assert.assertEquals(actualtext, expectedtext, "Text verification failed");
		log("Indices value displayed successfully" + REPORTNAME.getText());

	}

	// ToDoList

	public void MoveTo_ToDoList_Option() {
		Actions action = new Actions(driver);
		action.moveToElement(MoveTo_ToDoList_Option).perform();

	}

	public void ToDoList_titelvalidation() {

		String expectedtext = "Custom List";
		String actualtext = titlevalidation.getText();
		Assert.assertEquals(actualtext, expectedtext, "Text verification failed");

	}

	public void ToDoList_textvalidation() {

		String expectedtext = "Select the indices you want display for documents";
		String actualtext = textvalidation.getText();
		Assert.assertEquals(actualtext, expectedtext, "Text verification failed");

	}

	public void getMoveTo_Menu_Documents() {
		element = MoveTo_Menu_Documents;
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
	}

	public void getVerify_CopyandPaste_Document() throws InterruptedException {

		jsclick(Copy_ID);
		Thread.sleep(4000);
		element = MoveTo_Menu_Documents;
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		Thread.sleep(3000);
		jsclick(Paste_ID);

	}

	public void getSearchBoxIndices1() throws Exception {
		SearchBox.sendKeys(Language_excelRead(1, 3));

	}

	public void getSearchBoxIndices2() throws Exception {
		SearchBox.sendKeys(Language_excelRead(2, 3));

	}

	public void getSearchBoxIndices3() throws Exception {
		SearchBox.sendKeys(Language_excelRead(3, 3));

	}

	public void getSearchBoxIndices4() throws Exception {
		SearchBox.sendKeys(Language_excelRead(4, 3));
	}

	public void getSearchBoxIndices5() throws Exception {
		SearchBox.sendKeys(Language_excelRead(5, 3));

	}

	public void getSearchBoxIndices6() throws Exception {
		SearchBox.sendKeys(Language_excelRead(6, 3));

	}

	public void getSearchBoxIndices7() throws Exception {
		jsclick(SearchBoxTODO);
		SearchBoxTODO.sendKeys(Language_excelRead(7, 3));

	}

	public void ToDoList_Verify_Indicess_Value() throws InterruptedException {

		Thread.sleep(4000);
		String expectedtext2 = "WORKFLOW STATUS";
		String actualtext2 = WORKFLOWSTATUS.getText();
		Assert.assertEquals(actualtext2, expectedtext2, "Text verification failed");
		log("Indices value displayed successfully" + WORKFLOWSTATUS.getText());

	}

	public void getVerify_Ownership_Message() throws InterruptedException {

		jsclick(ownershipmessageok);

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
		Thread.sleep(6000);
		jsclick(Select_Option_Catagories_andSet_Colors);
		Thread.sleep(4000);
		jsclick(Select_Colors);

	}

	public void getVerify_CutandPaste_Document() throws InterruptedException {

		jsclick(Cut_ID);
		Thread.sleep(6000);
		jsclick(Select_subFolder);
		Thread.sleep(6000);
		element = MoveTo_Menu_Documents;
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		Thread.sleep(6000);
		jsclick(Paste_ID);

	}

	public void getVerify_Delete_Document() throws InterruptedException {
		jsclick(check);
		Thread.sleep(6000);
		element = MoveTo_Menu_Documents;
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		Thread.sleep(6000);
		jsclick(deletedoc);
		Thread.sleep(6000);
		jsclick(deleteOK);

	}

	public void getVerify_CreateFavorites_Document() throws Exception {

		Thread.sleep(6000);
		jsclick(checkdoc);
		Thread.sleep(4000);
		element = MoveTo_Menu_Documents;
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		jsclick(createFavorite);
		Thread.sleep(4000);
		createFavoriteText.clear();
		Thread.sleep(4000);
		createFavoriteText.sendKeys(Language_excelRead(8, 2));
		Thread.sleep(6000);
		jsclick(createFavoriteOK);

	}

	public void getOpen_CreateFavorites_Document() throws Exception {
		Thread.sleep(6000);
		element = bookmark;
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		Thread.sleep(4000);
		jsclick(loadfav);
		Thread.sleep(8000);
		jsclick(Searchfav);
		Thread.sleep(8000);
		Searchfav.sendKeys(Language_excelRead(8, 2));
		Thread.sleep(8000);
		jsclick(doc);

	}

	public void getCreate_SendToWorkflow_Document() throws Exception {

		jsclick(Workflow);
		Thread.sleep(4000);
		jsclick(AutoWorkflow);
		Thread.sleep(4000);
		jsclick(customdoc);
		Thread.sleep(6000);
		WebElement Message1 = Docownername;
		log("Take Ownership Message " + Message1.getText());
		Thread.sleep(4000);
		WebElement Message2 = openviewonly;
		log("Take Ownership Message " + Message2.getText());
		Thread.sleep(4000);
		jsclick(ownershipok);
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.alertIsPresent());
		Alert alt1 = driver.switchTo().alert();
		alt1.accept();
		Thread.sleep(4000);
		movingclkElement(closedoc);

	}

	public void getCreate_Notification_Document() throws Exception {

		Thread.sleep(6000);
		jsclick(notification);
		Thread.sleep(110000);
		jsclick(contref);
		jsclick(dochistory);
		Thread.sleep(6000);
		jsclick(notifylist);
		Thread.sleep(6000);
		jsclick(checknotification);
		jsclick(savenotify);
		Thread.sleep(6000);
		jsclick(Select_Folder);
		Thread.sleep(6000);
		jsclick(customdocname);
		Thread.sleep(6000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alt = driver.switchTo().alert();
		alt.accept();
		Thread.sleep(4000);
		jsclick(general);
		Thread.sleep(8000);

	}

	public void getSave_Signature_Document() throws Exception {
		jsclick(saveaddpage);
		Thread.sleep(8000);
		jsclick(okbutton);

	}

	public void getSentTo_Mail_asCopy() throws Exception {

		jsclick(sendTo);
		Thread.sleep(6000);
		jsclick(sendToMail);
		Thread.sleep(3000);
		jsclick(converttopdf);
		Thread.sleep(3000);
		jsclick(colorexport);
		Thread.sleep(6000);
		jsclick(pdfquality);
		Thread.sleep(6000);
		Select sel = new Select(pdfquality);
		sel.selectByVisibleText("Best Quality");
		Thread.sleep(6000);
		jsclick(coverpage);
		Thread.sleep(6000);
		jsclick(compresszip);
		Thread.sleep(6000);
		jsclick(sendtopassword);
		Thread.sleep(6000);
		jsclick(zippassinput);
		Thread.sleep(6000);
		zippassinput.sendKeys(Language_excelRead(2, 1));
		Thread.sleep(6000);
		jsclick(Runannotation);
		Thread.sleep(6000);
		jsclick(toemail);
		Thread.sleep(6000);
		toemail.sendKeys(Language_excelRead(1, 4));
		Thread.sleep(6000);
		jsclick(subid);
		Thread.sleep(6000);
		subid.sendKeys(Language_excelRead(9, 2));
		Thread.sleep(4000);
		jsclick(savesendto);
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		wait.until(ExpectedConditions.elementToBeClickable(EmailsuccessMessageDialogboxOK));
		jsclick(EmailsuccessMessageDialogboxOK);

	}

	public void getSentTo_Mail_asReference() throws Exception {

		jsclick(sendTo);
		Thread.sleep(3000);
		jsclick(sendToMail);
		Thread.sleep(3000);
		jsclick(Referencemail);
		Thread.sleep(3000);
		Select sel = new Select(pdfquality);
		sel.selectByVisibleText("Best Quality");
		jsclick(toemail);
		Thread.sleep(3000);
		toemail.sendKeys(Language_excelRead(1, 4));
		Thread.sleep(3000);
		jsclick(subid);
		Thread.sleep(3000);
		subid.sendKeys(Language_excelRead(9, 2));
		Thread.sleep(4000);
		jsclick(savesendto);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		wait.until(ExpectedConditions.elementToBeClickable(EmailsuccessMessageDialogboxOK));
		jsclick(EmailsuccessMessageDialogboxOK);

	}

	public void getSentTo_Print() throws Exception {
		Thread.sleep(6000);
		jsclick(checkdoc);
		Thread.sleep(6000);
		element = MoveTo_Menu_Documents;
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		jsclick(sendTo);
		Thread.sleep(3000);
		jsclick(sendtoPrint);
		Thread.sleep(4000);
		jsclick(pageprint);
		Thread.sleep(4000);
		jsclick(summaryprint);
		Thread.sleep(4000);
		jsclick(withunlockredaction);
		Thread.sleep(4000);
		jsclick(pwdunlockredaction);
		pwdunlockredaction.sendKeys(Language_excelRead(2, 1));
		Thread.sleep(4000);
		jsclick(printview);

	}

	public void getSentTo_Export() throws Exception {
		Thread.sleep(6000);
		jsclick(checkdoc);
		Thread.sleep(6000);
		element = MoveTo_Menu_Documents;
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		jsclick(sendTo);
		Thread.sleep(3000);
		jsclick(sendexport);
		Thread.sleep(3000);
		jsclick(retainchkexport);
		jsclick(Routesummary);
		Thread.sleep(3000);
		jsclick(savesendto);
		Thread.sleep(19000);
		jsclick(checkdoc);
		Thread.sleep(6000);
		element = MoveTo_Menu_Documents;
		Actions action2 = new Actions(driver);
		action2.moveToElement(element).perform();
		jsclick(sendTo);
		Thread.sleep(3000);
		jsclick(sendexport);
		Thread.sleep(3000);
		jsclick(convertpdfexport);
		jsclick(exportannotation);
		jsclick(exportwith);
		jsclick(exportPwd);
		Thread.sleep(3000);
		exportPwd.sendKeys(Language_excelRead(2, 1));
		Thread.sleep(3000);
		jsclick(Zippasswordinput);
		Thread.sleep(3000);
		Zippasswordinput.sendKeys(Language_excelRead(2, 1));
		Thread.sleep(3000);
		jsclick(Pdfpasswordinput);
		Thread.sleep(3000);
		Pdfpasswordinput.sendKeys(Language_excelRead(2, 1));
		Thread.sleep(3000);
		jsclick(savesendto);
		Thread.sleep(6000);
	}

	public void getSentTo_SecureLink() throws Exception {
		Thread.sleep(6000);
		element = MoveTo_Menu_Documents;
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		jsclick(sendTo);
		Thread.sleep(3000);
		jsclick(SecureMail);
		Thread.sleep(4000);
		jsclick(recpmail);
		Thread.sleep(3000);
		recpmail.sendKeys(Language_excelRead(1, 4));
		Thread.sleep(3000);
		jsclick(Confirmemail);
		Thread.sleep(3000);
		Confirmemail.sendKeys(Language_excelRead(1, 4));
		Thread.sleep(3000);
		jsclick(modifychk);
		jsclick(navigateOK);
		Thread.sleep(3000);
		recpmailsec.sendKeys(Language_excelRead(1, 4));
		jsclick(confirmemailsec);
		Thread.sleep(3000);
		confirmemailsec.sendKeys(Language_excelRead(1, 4));
		Thread.sleep(3000);
		jsclick(navigateOK2);
		Thread.sleep(6000);
	}

	public void getSentTo_GenerateDocumentLink() throws Exception {
		Thread.sleep(3000);
		jsclick(checkdoc);
		Thread.sleep(6000);
		element = MoveTo_Menu_Documents;
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		jsclick(sendTo);
		Thread.sleep(3000);
		jsclick(generatedoc);
		Thread.sleep(4000);
		jsclick(doclinkok);
		Thread.sleep(6000);
	}

	public void getOCRReportnamevalidation_BeforeCreateDOC() {

		String expectedtext = "MORTHWEST MEDICAT";
		String actualtext = ReportNameValueBeforeDoc.getText();
		Assert.assertEquals(actualtext, expectedtext);
		log("Report Name is: " + ReportNameValueBeforeDoc.getText());

	}

	public void getOCRReportnamevalidation_AfterCreateDOC() {

		String expectedtext = "Export Documentary Credit (DC) Bill Ne";
		String actualtext = ReportNameValueAfterDoc.getText();
		Assert.assertEquals(actualtext, expectedtext);
		log("Report Name is: " + ReportNameValueAfterDoc.getText());
	}

	public void getMoveTo_Menu_Recent() {
		Actions action = new Actions(driver);
		action.moveToElement(MoveTo_Menu_Recent).perform();
	}

	// Test Login Language validations

	public void verify_Spanish_Language() throws Exception {

		log("Test Scenario 1 : Verifying Spanish Language ");
		Refresh_Button();
		Thread.sleep(8000);
		log("Click on Refresh button");
		movingclkElement(Setting_Icon);
		Thread.sleep(4000);
		log("Click on Setting Icon");
		jsclick(My_Preferencesetting);
		Thread.sleep(4000);
		log("Click on My Preferences option");
		getSelect_Office_document_Defaultviewing();
		Thread.sleep(4000);
		log("Select Office document and set as Default View");
		getPdf_document_Defaultviewing();
		Thread.sleep(4000);
		log("Select Pdf Document and set as Default view");
		movingclkElement(Apply_button);
		Thread.sleep(4000);
		log("Click on Apply button");
		LogoutPage();
		jsclick(Spanish_Language);
		Thread.sleep(4000);
		log("Click on Spanish Language");
		LogDipakUser();
		Thread.sleep(4000);
		log("Login EWA With User credential");
		Refresh_Button();
		Thread.sleep(4000);
		log("Click on Refresh button");
		jsclick(Username);
		Thread.sleep(4000);
		log("Click on Username");
		Spanish_Myaccount_Text_Laguage();
		Thread.sleep(4000);
		log("Verified My Account name in Spanish laguage");
		LogoutPage();
		Thread.sleep(4000);
		log("Click on Logout Option");
		log("Spanish Language verified Successfully");
	}

	public void verify_French_Language() throws Exception {

		log("Test Scenario 2 : Verifying French Language ");
		jsclick(French_Language);
		Thread.sleep(4000);
		log("Click on French Language");
		LogDipakUser();
		Thread.sleep(4000);
		log("Login EWA with User credential ");
		Refresh_Button();
		Thread.sleep(4000);
		log("Click on Refresh button");
		jsclick(Username);
		Thread.sleep(4000);
		log("Click on Username");
		French_Myaccount_Text_Laguage();
		Thread.sleep(4000);
		log("Verified My Account text in French Language");
		LogoutPage();
		Thread.sleep(4000);
		log("Click on Logout Option");
		log("French Language verified Successfully");
	}

	public void verify_Dutch_Language() throws Exception {

		log("Test Scenario 3 : Verifying Dutch Language ");
		jsclick(Dutch_Language);
		Thread.sleep(4000);
		log("Click on Dutch Language");
		LogDipakUser();
		Thread.sleep(4000);
		log("Login EWA with User credential ");
		Refresh_Button();
		Thread.sleep(4000);
		log("Click on Refresh button");
		jsclick(Username);
		Thread.sleep(4000);
		log("Click on Username");
		Dutch_Myaccount_Text_Laguage();
		Thread.sleep(4000);
		log("Verified My Account text in Dutch language");
		LogoutPage();
		Thread.sleep(4000);
		log("Click on Logout Option");
		log("Dutch Language verified Successfully");
	}

	public void verify_Hindi_Language() throws Exception {

		log("Test Scenario 4 : Verifying Hindi Language ");
		jsclick(Hindi_Language);
		Thread.sleep(4000);
		log("Click on Hindi Language");
		LogDipakUser();
		Thread.sleep(4000);
		log("Login EWA with User credential");
		Refresh_Button();
		Thread.sleep(4000);
		log("Click on Refresh button");
		jsclick(Username);
		Thread.sleep(4000);
		log("Click on Username");
		//Hindi_Myaccount_Text_Laguage();
		Thread.sleep(4000);
		log("Verified My Account Text in Hindi Language");
		LogoutPage();
		Thread.sleep(4000);
		log("Click on Logout Option");
		log("Hindi Language verified Successfully");
	}

	public void verify_English_Language() throws Exception {

		log("Test Scenario 5 : Verifying English Language ");
		jsclick(English_Language);
		Thread.sleep(4000);
		log("Click on English Language Option");
		LogDipakUser();
		Thread.sleep(4000);
		Refresh_Button();
		Thread.sleep(6000);
		log("Login EWA with User credential");
		jsclick(Username);
		Thread.sleep(4000);
		log("Click on Username");
		English_Myaccount_Text_Laguage();
		Thread.sleep(4000);
		log("Verified My Account in English Language");
		Refresh_Button();
		Thread.sleep(4000);
		log("Click on Refresh button");
		log("English Language verified Successfully");

	}

	// Verifying Dutch Language //

	public void CreateandOpen_NewDocument_Dutch_Language() throws Exception {

		log("Test Scenario 1 : Verifying Create and Open New Document Dutch Language ");
		Refresh_Button();
		Thread.sleep(6000);
		movingclkElement(Setting_Icon);
		Thread.sleep(6000);
		log("Click on Setting Icon");
		jsclick(My_Preferencesetting);
		Thread.sleep(6000);
		log("Click on My Preferences");
		getSelect_Office_document_Defaultviewing();
		Thread.sleep(6000);
		log("Select Office documentv and set as Default View");
		getPdf_document_Defaultviewing();
		Thread.sleep(6000);
		log("Select Pdf documentv and set as Default View");
		getSelect_Dropdown_Actual_Size();
		Thread.sleep(6000);
		log("Select Viewer zoom and set as Actual Size");
		movingclkElement(Apply_button);
		Thread.sleep(6000);
		log("Click on Apply button");
		LogoutPage();
		jsclick(Dutch_Language);
		Thread.sleep(6000);
		log("Click on Dutch Language");
		LogDipakUser();
		Thread.sleep(6000);
		log("Login EWA with User credential");
		Refresh_Button();
		Thread.sleep(6000);
		jsclick(NewDocuments_MenuOption);
		Thread.sleep(6000);
		log("Click on New Documents Tab");
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
		OK_Button_BrowseforFolder.click();
		Thread.sleep(6000);
		log("Click on Ok button");
		getgetSelect_Document_Type_Dropdown();
		Thread.sleep(6000);
		log("Select a Document Type dropdown");
		Enter_Report_Name_Text.sendKeys(Language_excelRead(11, 2));
		Thread.sleep(6000);
		log("Enter value into Report Name field");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(getMove_To_PlusIcon()));
		movingclkElement(getMove_To_PlusIcon());
		getBrowse_Option();
		Thread.sleep(6000);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Hyphen.exe");
		Thread.sleep(6000);
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
		log("Document Uploaded successfully");
		jsclick(ClickOCR);
		Thread.sleep(6000);
		log("Click on OCR menu Option");
		getSet_OCR_ToDocumentPDF();
		Thread.sleep(6000);
		log("Set OCR On page");
		jsclick(ReportName);
		Thread.sleep(6000);
		log("Click on Report Name and set OCR Value as Report Name");
		jsclick(Create_Button);
		Thread.sleep(6000);
		log("Click on Create button");
		jsclick(Navigate_Button);
		Thread.sleep(6000);
		log("Click on Navigate button");
		getOCRReportnamevalidation_BeforeCreateDOC();
		Thread.sleep(6000);
		log("Verifying OCR Report name ");
		jsclick(ReportNameValueBeforeDoc);
		Thread.sleep(6000);
		log("Report name Verified and Open Document");
		getClick_FileInfo_Option();
		Thread.sleep(6000);
		log("Click on File Info Menu Option");
		getClick_FileInfo_OkButton_withFileName();
		Thread.sleep(6000);
		log("Click on Ok button");
		log("New Document Create and open in Dutch language");

	}

	public void Verify_OCR_afterCreatingDocument() throws Exception {

		log("Test Scenario 2 : Verifying OCR after Creating Document ");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(getMove_To_PlusIcon()));
		movingElement(getMove_To_PlusIcon());
		getBrowse_Option();
		Thread.sleep(3000);
		log("Browse Document Page");
		Runtime.getRuntime()
				.exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Underscore.exe");
		Thread.sleep(6000);
		log("By using AutoIT add file from external folder");
		jsclick(Open_Underscore_page);
		Thread.sleep(6000);
		log("Open Document Page from Document List");
		jsclick(UpdateDutch_Button);
		Thread.sleep(6000);
		log("Click on Update button");
		jsclick(ClickOCR);
		Thread.sleep(6000);
		log("Click on OCR button");
		getSet_OCR_ToDocument();
		Thread.sleep(6000);
		log("Set OCR To Document");
		jsclick(ReportName);
		Thread.sleep(6000);
		log("Click on Report Name and set OCR Extarcted Name");
		jsclick(DutchSave_UpdateButton);
		Thread.sleep(6000);
		log("Click on Save button");
		jsclick(DutchUpdate_Ok_button);
		Thread.sleep(6000);
		log("Click on Ok button");
		jsclick(Save_button);
		Thread.sleep(6000);
		log("Click on Save button");
		jsclick(DocumentSave_Ok_button);
		Thread.sleep(6000);
		log("Click on Ok button");
		jsclick(DutchProperties_option);
		Thread.sleep(6000);
		log("Click on Properties Option");
		movingclkElement(closedoc);
		Thread.sleep(6000);
		log("Close the document Page");
		getOCRReportnamevalidation_AfterCreateDOC();
		Thread.sleep(6000);
		log("Verifying OCR Name as Document name");
		jsclick(ReportNameValueAfterDoc);
		log("After Creating Document OCR Functionality verified Sucessfully");

	}

	public void Addsignature_Dutch_Language() throws Exception {

		log("Test Scenario 3 : Add signature Dutch Language ");
		Thread.sleep(6000);
		jsclick(Click_signature_Menuoption);
		Thread.sleep(6000);
		log("Click on Signature menu Option");
		try {
			getinputpassword();
			Thread.sleep(6000);
			log("Enter a Password");
		} catch (Exception e) {
			System.out.println("signature is not password protected...");
		}
		getAdd_Signature_Onpage();
		Thread.sleep(6000);
		log("Add signature on page");
		log("signature added Successfully on  Document");
	}

	public void getAddRedaction_Dutch_Language() throws Exception {

		log("Test Scenario 4 : Add Redaction Dutch Language ");
		Thread.sleep(6000);
		getMove_to_Annotation_Option_inViewer();
		Thread.sleep(6000);
		log("Mousehover on Annotation menu Option");
		getRedaction_Option();
		Thread.sleep(6000);
		log("Click on Redaction Option");
		getSet_Redaction_ToDocument();
		Thread.sleep(6000);
		log("Set Redaction on Page");
		jsclick(Save_button);
		Thread.sleep(6000);
		log("Click on Save button");
		jsclick(DocumentSave_Ok_button);
		Thread.sleep(6000);
		log("Click on Ok button");
		log("Redaction added Successfully on  Document");
	}

	public void getShowHideThumbnail_Dutch_Language() throws Exception {

		log("Test Scenario 5 : Show Hide Thumbnail Dutch Language ");
		Thread.sleep(6000);
		jsclick(showHideThumbnail);
		Thread.sleep(6000);
		log("Click on Show Hide Thumbnail");
		jsclick(showHideThumbnail);
		Thread.sleep(6000);
		log("Verifying showing Thumbnail and Again Click Show Hide Thumbnail");
		Refresh_Button();
		Thread.sleep(6000);
		log("Click on Refresh button");
		log("Show Hide Thumbnail options verified");
	}

	// Create Template in Dutch laguage

	public void getverify_to_CreateorBrowse_Template_Defaultviewing() throws Exception {

		log("Test Scenario 6 : Verifying to Create or Browse Template Default viewing ");
		Refresh_Button();
		Thread.sleep(6000);
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
		log("Click on Apply button");
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
		jsclick(getgetSelect_Document_Type_Dropdown());
		Thread.sleep(6000);
		log("Select Document type dropdown");
		jsclick(Enter_Report_Name_Text);
		Thread.sleep(6000);
		log("Click on Report Name");
		getSelect_ReportName_Testvalue();
		Thread.sleep(6000);
		log("Enter Report Name");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(getMove_To_PlusIcon()));
		movingclkElement(getMove_To_PlusIcon());
		getBrowse_Option();
		log("Browse Document Page");
		Thread.sleep(6000);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\FileUploadScriptpdf.exe");
		try {
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		log("By using AutoIT add file from external folder");
		Thread.sleep(6000);
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait2.until(ExpectedConditions.elementToBeClickable(getMove_To_PlusIcon()));
		movingclkElement(getMove_To_PlusIcon());
		getBrowse_Option();
		log("Browse Document Page");
		Thread.sleep(6000);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\FileUploadScript.exe");
		log("By using AutoIT add file from external folder");
		jsclick(Save_Template_Button);
		log("Save Template button clicked successfully");
		jsclick(Template_Description_No_button);
		Thread.sleep(6000);
		log("Click on No button");
		jsclick(Save_Template_Button);
		Thread.sleep(6000);
		log("Click on Save Template button");
		jsclick(Template_NameTextbox);
		Thread.sleep(6000);
		log("Click on Template Name Textbox");
		getTemplate_NameTextboxvalue();
		Thread.sleep(6000);
		log("Enter Template Name into Template Name field");
		jsclick(Template_Description_Messagebox);
		Thread.sleep(6000);
		log("Click on Template Description message box");
		getEditTemplate_Description_Messageboxvalue();
		Thread.sleep(6000);
		log("Enter Template Description message into Description field");
		jsclick(Template_Description_OK_button);
		Thread.sleep(6000);
		log("Click on Ok button");
		getTemplate_Created_Message_Verify();
		Thread.sleep(6000);
		log("Verified Template Created successfully");
		jsclick(Template_Created_OK_button);
		Thread.sleep(6000);
		log("Verifying to CreateorBrowse Template Defaultviewing");
		Refresh_Button();
		Thread.sleep(6000);
		log("Click on Refresh button");
	}

	public void getVerify_to_Edit_and_Delete_DefaultTemplate() throws Exception {

		log("Test Scenario 7 : Verifying to Edit and Delete Default Template ");
		getMoveto_Templates_Option();
		Thread.sleep(6000);
		log("Mousehover on Template Tab");
		jsclick(Select_Created_Template);
		try {
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Thread.sleep(6000);
		log("Select Created Template");
		jsclick(Click_Edit_Template_Button);
		Thread.sleep(6000);
		log("Click on Edit Template Fab button");
		EditTemplate_Description_Messagebox.clear();
		Thread.sleep(6000);
		log("Click on Template Description message box");
		getEditTemplate_Description_Messageboxvalue();
		Thread.sleep(6000);
		log("Edit Template Description");
		jsclick(EditTemplate_Description_OK_button);
		Thread.sleep(6000);
		log("Click on Ok button");
		getEditTemplate_Created_Message_Verify();
		log("Template edited successfully");
		jsclick(EditTemplate_Created_OK_button);
		Thread.sleep(6000);
		log("Click on  Ok button");
		getMoveto_Templates_Option();
		Thread.sleep(6000);
		log("Mousehover on Template Tab");
		jsclick(Select_Created_Template);
		Thread.sleep(6000);
		log("Select Created Template");
		jsclick(Delete_Template_Button);
		Thread.sleep(6000);
		log("Click on  Delete Template Fab button");
		jsclick(Delete_Template_OK_Button);
		log("Click on  Ok button");
		log("Template Deleted Successfully");

	}

	public void getverify_to_CreateorBrowse_Template_Advancedviewing_OfficeDoc() throws Exception {

		log("Test Scenario 8 : Verifying to Create or Browse Template Advanced viewing OfficeDoc ");
		Refresh_Button();
		Thread.sleep(6000);
		log("Click on Refresh button");
		movingclkElement(Setting_Icon);
		Thread.sleep(6000);
		log("Click on Setting Icon");
		jsclick(My_Preferencesetting);
		Thread.sleep(6000);
		log("Click on My Preferences");
		getSelect_Office_document_Advancedviewing();
		Thread.sleep(6000);
		log("Select Office Document and set as Advanced View");
		movingclkElement(Apply_button);
		Thread.sleep(6000);
		log("Click on Apply button");
		jsclick(Templates_MenuOption);
		Thread.sleep(6000);
		log("Mousehover on Template Tab");
		jsclick(Destination_Folder_Textbox);
		Thread.sleep(6000);
		log("Click on  Destination Folder Textbox");
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
		jsclick(getgetSelect_Document_Type_Dropdown());
		Thread.sleep(6000);
		log("Select Document Type dropdown");
		jsclick(Enter_Report_Name_Text);
		Thread.sleep(6000);
		log("Click on  Report Name Textbox");
		getSelect_ReportName_Testvalue();
		Thread.sleep(6000);
		log("Enter value Report Name field");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(getMove_To_PlusIcon()));
		movingclkElement(getMove_To_PlusIcon());
		getBrowse_Option();
		log("Browse Document Page");
		Thread.sleep(6000);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\OfficeDoc\\FileUploadOfficeDoc.exe");
		log("By using AutoIT add file from external folder");
		Thread.sleep(6000);
		jsclick(Save_Template_Button);
		log("Save Template button clicked successfully");
		jsclick(Template_Description_No_button);
		Thread.sleep(6000);
		log("Click on No button");
		jsclick(Save_Template_Button);
		Thread.sleep(6000);
		log("Click on Save Template button");
		jsclick(Template_NameTextbox);
		Thread.sleep(6000);
		log("Click on Template Name  Textbox");
		getTemplate_NameTextboxvalue();
		Thread.sleep(6000);
		log("Enter value Template Name field");
		jsclick(Template_Description_Messagebox);
		Thread.sleep(6000);
		log("Click on Template Description messagebox");
		getTemplate_Description_Messageboxvalue();
		Thread.sleep(6000);
		log("Enter message Template Description field");
		jsclick(Template_Description_OK_button);
		Thread.sleep(6000);
		log("Click on Ok button");
		getTemplate_Created_Message_Verify();
		Thread.sleep(6000);
		log("Template Created successfully Verified");
		jsclick(Template_Created_OK_button);
		log("Click on Ok button");
		log("Verifying to CreateorBrowse OfficeDoc Template advancedviewing");

	}

	public void getVerify_to_Edit_and_Delete_AdvancedTemplate_OfficeDoc() throws Exception {

		log("Test Scenario 9 : Verifying to Edit and Delete Advanced Template Office Doc ");
		Refresh_Button();
		Thread.sleep(6000);
		getMoveto_Templates_Option();
		Thread.sleep(6000);
		log("Mousehover on Template Tab");
		jsclick(Select_Created_Template);
		Thread.sleep(6000);
		log("Select Created Template");
		jsclick(Click_Edit_Template_Button);
		Thread.sleep(6000);
		log("Click on Edit Template");
		EditTemplate_Description_Messagebox.clear();
		Thread.sleep(6000);
		log("Click on Edit Template Description messagebox");
		getEditTemplate_Description_Messageboxvalue();
		Thread.sleep(6000);
		log("Edit Template Description");
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
		log("Mousehover on Template Tab");
		jsclick(Select_Created_Template);
		Thread.sleep(6000);
		log("Select Created Template");
		jsclick(Delete_Template_Button);
		Thread.sleep(6000);
		log("Click on Delete Template Fab button");
		jsclick(Delete_Template_OK_Button);
		log("Template Deleted Successfully");

	}

	public void getverify_to_Create_Formmapping_PDFTemplate_Advancedviewing() throws Exception {

		log("Test Scenario 10 : Verifying to Create Formmapping PDF Template Advanced viewing ");
		Refresh_Button();
		Thread.sleep(6000);
		Thread.sleep(6000);
		movingclkElement(Setting_Icon);
		Thread.sleep(6000);
		log("Click on Setting Icon");
		jsclick(My_Preferencesetting);
		Thread.sleep(6000);
		log("Click on My Preferences");
		getPdf_document_Advancedviewing();
		Thread.sleep(6000);
		log("Select Pdf Document and set as Advanced View");
		movingclkElement(Apply_button);
		Thread.sleep(6000);
		log("Click on Apply button");
		Refresh_Button();
		Thread.sleep(6000);
		log("Click on Refresh button");
		jsclick(Templates_MenuOption);
		Thread.sleep(6000);
		log("Click on Template Tab");
		Destination_Folder_Textbox.click();
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
		jsclick(getgetSelect_Document_Type_Dropdown());
		Thread.sleep(6000);
		log("Select Document type dropdown");
		jsclick(Enter_Report_Name_Text);
		Thread.sleep(6000);
		log("Click on Report Name Textbox");
		getSelect_ReportName_Testvalue();
		Thread.sleep(6000);
		log("Enter value Report Name field");
		getMove_To_PlusIcon();
		getNew_pdf_Document_Option();
		Thread.sleep(6000);
		log("Browse a Document");
		getEnter_pdf_File_Name();
		Thread.sleep(6000);
		log("Enter Pdf File Name");
		jsclick(pdfViewer);
		Thread.sleep(6000);
		log("Click on Pdf Viewerr");
		jsclick(Textbox);
		Thread.sleep(6000);
		log("Click on Textbox");
		jsclick(Add_Textbox_Onpage);
		Thread.sleep(6000);
		log("Select and add Textbox on  Page");
		jsclick(Click_Formmapper);
		log("Click on  Form mapping");
		getSelect_Formfield();
		Thread.sleep(6000);
		log("Select Form field");
		jsclick(FormOK);
		Thread.sleep(6000);
		log("Click on Ok button");
		jsclick(Save_Template_Button);
		Thread.sleep(6000);
		log("Click on Save Template button");
		jsclick(Template_NameTextbox);
		Thread.sleep(6000);
		log("Click on Template name textbox");
		getTemplate_NameTextboxvalue();
		Thread.sleep(6000);
		log("Enter Template Name");
		jsclick(Template_Description_Messagebox);
		Thread.sleep(6000);
		log("Click on Template Description messagebox");
		getTemplate_Description_Messageboxvalue();
		Thread.sleep(6000);
		log("Enter message in Template Description");
		jsclick(Template_Description_OK_button);
		Thread.sleep(6000);
		log("Click on Ok button");
		getTemplate_Created_Message_Verify();
		Thread.sleep(6000);
		log("Verified Template Created successfully");
		jsclick(Template_Created_OK_button);
		log("Click on Ok button");
		log("Verifying to CreateorBrowse Formmapping Template advancedviewing");

	}

	public void getVerify_to_Edit_and_Delete_Formfield() throws Exception {

		log("Test Scenario 11: Verifying to Edit and Delete Form field ");
		Refresh_Button();
		Thread.sleep(6000);
		getMoveto_Templates_Option();
		Thread.sleep(6000);
		log("Mousehover on Template Tab");
		jsclick(Select_Created_Template);
		Thread.sleep(6000);
		log("Select Created Template");
		jsclick(Click_Edit_Template_Button);
		Thread.sleep(6000);
		log("Click on Edit Template Fab button");
		EditTemplate_Description_Messagebox.clear();
		Thread.sleep(6000);
		log("Click on Edit Template Description messagebox");
		getEditTemplate_Description_Messageboxvalue();
		Thread.sleep(6000);
		log("Edit a Template");
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
		log("Mousehover on Template Tab");
		jsclick(Select_Created_Template);
		Thread.sleep(6000);
		log("Select Created Template");
		jsclick(Delete_Template_Button);
		Thread.sleep(6000);
		log("Click on Delete Template Fab button");
		jsclick(Delete_Template_OK_Button);
		log("Formmapping Template Deleted Successfully");
	}

	public void getSet_Defaultview() throws Exception {

		log("Test Scenario 12 :Set Default view ");
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
		log("Select Office Document and set as Default view");
		getPdf_document_Defaultviewing();
		Thread.sleep(6000);
		log("Select Pdf Document and set as Default view");
		movingclkElement(Apply_button);
		Thread.sleep(6000);
		log("Click on Apply button");
	}

	// Verifying Load more in Search and Folder in Spanish laguage

	public void getVerify_Load_MoreCount_On_Search() throws Exception {

		log("Test Scenario 13 : Verifying Load More Count On Search ");
		Refresh_Button();
		Thread.sleep(6000);
		movingclkElement(Setting_Icon);
		Thread.sleep(6000);
		log("Click on  Setting Icon");
		jsclick(My_Preferencesetting);
		Thread.sleep(6000);
		log("Click on My Preferences");
		getEnter_Loadmorecount();
		Thread.sleep(6000);
		log("Enter Load more count");
		movingclkElement(Apply_button);
		Thread.sleep(6000);
		log("Click on Apply button");
		jsclick(Click_Search_Option);
		Thread.sleep(6000);
		log("Click on Search Tab");
		jsclick(Find_Button);
		Thread.sleep(6000);
		log("Click on Find button");
		getVerify_Loadmorecount_Searchresult();
		Thread.sleep(6000);
		log("Verified Load more count on Search Result");
		jsclick(Loadmorebutton);
		Thread.sleep(6000);
		log("Click on Load More button");
		getVerify_Loadmorecount_Searchresult();
		Thread.sleep(6000);
		log("Minumum number of Load More count on Search Verified successfully");
	}

	public void getVerify_Load_MoreCount_On_Folder() throws Exception {

		log("Test Scenario 14 : Verifying Load More Count On Folder ");
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
		getVerify_Loadmorecount_Document_Folder();
		Thread.sleep(6000);
		log("Verified Load More count On Folder Document");
		jsclick(Loadmorebutton);
		Thread.sleep(6000);
		log("Click on Load more button");
		getVerify_Loadmorecount_Document_Folder();
		Thread.sleep(6000);
		log("Minumum number of Load More count on Folder Verified successfully");

	}

	// Verifying Custom Columns in Spanish Language

	// Custom columns for Room

	public void getOpen_Custom_List_Dialog_And_Verify_Title_Roomcolumn() throws InterruptedException {

		log("Test Scenario 15 : Open Custom List Dialog And Verifying Title Room column ");
		Refresh_Button();
		Thread.sleep(6000);
		log("Click on Refresh button");
		getMoveTo_Menu_Recent();
		Thread.sleep(6000);
		log("Mousehover on Recent Tab");
		jsclick(Recent_Folder);
		Thread.sleep(6000);
		log("Click on Recent Folder");
		getMoveTo_Menu_RoomName();
		Thread.sleep(6000);
		log("Mousehover to Roomname Tab");
		try {
			Verify_Reset_CustomColumsnRoom();
			Thread.sleep(6000);
			log("Click on Reset Column Option");
			jsclick(Reset_Column_OK_Button);
			log("Click on Ok button");
			Thread.sleep(6000);
			log("Custom columns Reset Successfully on Room Level");
			movingElement(MoveTo_Menu_RoomName);
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println(" Reset Column Option is Disable");
		}
		jsclick(CustomColumnOptionRoom);
		Thread.sleep(12000);
		log("Click on Custom Column Option");
		gettitelvalidation();
		log("Custom List title validate");
	}

	public void getVerify__Text_of_Custom_List_Dialog_Roomcolumn() throws InterruptedException {

		log("Test Scenario 16 : Verifying  Text of Custom List Dialog Room column ");
		Thread.sleep(6000);
		getextvalidation();
		log("Custom List Dialog Text verified");
	}

	public void getSet_And_Verify_Custom_Columns_NodeLevel() throws Exception {

		log("Test Scenario 17 : Set And Verifying Custom Columns Node Level ");
		Thread.sleep(6000);
		getSearchBoxIndices1();
		Thread.sleep(6000);
		log("Enter Indices Value In Search box");
		jsclick(Select_Indices01);
		Thread.sleep(6000);
		log("Select Entered Indices");
		getSearchBoxIndices2();
		Thread.sleep(6000);
		log("Enter Indices Value In Search box");
		jsclick(Select_Indices02);
		Thread.sleep(6000);
		log("Select Entered Indices");
		getSearchBoxIndices3();
		Thread.sleep(6000);
		log("Enter Indices Value In Search box");
		jsclick(Select_Indices03);
		Thread.sleep(6000);
		log("Select Entered Indices");
		jsclick(Ok_Button_CustomList);
		log("All Indices Selected Successfully");
		Thread.sleep(6000);
		movingclkElement(Setting_Icon);
		Thread.sleep(6000);
		log("Click on Setting Icon");
		jsclick(My_Preferencesetting);
		Thread.sleep(6000);
		log("Click on My Preferences");
		Verify_CompactView_checkbox();
		Thread.sleep(6000);
		log("Check Compact View Checkbox");
		movingclkElement(Apply_button);
		Thread.sleep(6000);
		log("Click on Apply button");
		Refresh_Button();
		Thread.sleep(6000);
		log("Click on Refresh button");
		getMoveTo_Menu_Recent();
		Thread.sleep(6000);
		log("Mousehover on Recent Tab");
		jsclick(Recent_Folder);
		Thread.sleep(6000);
		log("Click on Recent Folder");
		Verify_Indicess_Value();
		Thread.sleep(6000);
		log("Custom Columns is set Node Level successfully");

	}

	public void getVerify_Default_Custom_Columns() throws InterruptedException {

		log("Test Scenario 18 : Verifying Default Custom Columns ");
		Refresh_Button();
		Thread.sleep(6000);
		log("Click on Refresh button");
		getMoveTo_Menu_Recent();
		Thread.sleep(6000);
		log("Mousehover on Recent Tab");
		jsclick(Recent_Folder);
		Thread.sleep(6000);
		log("Click on Recent Folder");
		getMoveTo_Menu_RoomName();
		Thread.sleep(6000);
		log("Mousehover on Roomname  Tab");
		jsclick(CustomColumnOptionRoom);
		Thread.sleep(6000);
		log("Click on Custom Columns Option");
		Default_Button_CustomList();
		Thread.sleep(6000);
		log("Click on Custom List Default button");
		jsclick(Ok_Button_CustomList);
		log("Set and Verifying Default Custom columns successfully");
	}

	public void getVerify_Cancel_Button_of_CustomList() throws InterruptedException {

		log("Test Scenario 19 : Verifying Cancel button of Custom List ");
		getMoveTo_Menu_RoomName();
		log("Mousehover on Roomname Tab");
		jsclick(CustomColumnOptionRoom);
		Thread.sleep(6000);
		log("Click on Custom Column Option");
		Cancel_Button_CustomList();
		log("Cancle button is clicked");
		log("Verified Cancel button of Custom List ");
	}

	public void getVerify_Custom_Columns_RoomLevel() throws InterruptedException {

		log("Test Scenario 20 : Verifying Custom Columns Room Level ");
		getMoveTo_Menu_RoomName();
		log("Mousehover on Roomname Tab");
		jsclick(CustomColumnOptionRoom);
		Thread.sleep(6000);
		log("Click on Custom Column Option");
		jsclick(Click_DropdownOption);
		log("Click on dropdown Option");
		Select_DropdownValue();
		Thread.sleep(6000);
		log("Select Dropdown Value");
		jsclick(Set_RoomLevel_Indices);
		Thread.sleep(6000);
		log("Set Room Level Indices");
		jsclick(Ok_Button_CustomList);
		log("Indices is Selected Successfully for RoomLevel");

	}

	public void getVerify_Reset_Columns_Functionality() throws InterruptedException {

		log("Test Scenario 21 : Verifying Reset Columns Functionality ");
		getMoveTo_Menu_RoomName();
		log("Mousehover on Roomname Tab");
		jsclick(Room_Reset_CustomColumns);
		Thread.sleep(6000);
		log("Click on Reset Columns");
		jsclick(Reset_Column_OK_Button);
		log("Custom columns Reset Successfully");

	}

	// Custom columns for Search

	public void getOpen_Custom_List_Dialog_And_Verify_Title_Searchcolumn() throws InterruptedException {

		log("Test Scenario 22:Open Custom List Dialog And Verifying Title Search column ");
		MoveTo_Search_Option();
		Thread.sleep(6000);
		log("Mousehover on Search Tab");
		try {
			Verify_Reset_CustomColumsnSearch();
			Thread.sleep(6000);
			log("Click on Reset Column Option");
			jsclick(Reset_Column_OK_Button);
			Thread.sleep(6000);
			log("Click on Ok button");
			Thread.sleep(6000);
			log("Custom columns Reset Successfully on Search Level");
			movingElement(MoveTo_Search_Option);
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println(" Reset Column Option is Disable");
		}
		jsclick(Search_Custom_Columns_option);
		Thread.sleep(12000);
		log("Click on  Custom Column Option");
		getSearch_titelvalidation();
		log("Search Custom List title validate");
	}

	public void getVerify__Text_of_Custom_List_Dialog_Searchcolumn() throws InterruptedException {

		log("Test Scenario 23 :Verifying  Text of Custom List Dialog Search column ");
		Thread.sleep(6000);
		getSearch_textvalidation();
		log("Search Custom List Dialog Text verified");
	}

	public void getVerify_Set_Custom_Columns_for_Search() throws Exception {

		log("Test Scenario 24 : Verifying Set Custom Columns for Search ");
		Thread.sleep(6000);
		getSearchBoxIndices4();
		Thread.sleep(6000);
		log("Search Indices 1 in Search box");
		jsclick(Search_Select_Indices01);
		Thread.sleep(6000);
		log("Select Search Indices 1");
		getSearchBoxIndices5();
		Thread.sleep(6000);
		log("Search Indices 2 in Search box");
		jsclick(Search_Select_Indices02);
		Thread.sleep(6000);
		log("Select Search Indices 2");
		getSearchBoxIndices6();
		Thread.sleep(6000);
		log("Search Indices 3 in Search box");
		jsclick(Search_Select_Indices03);
		Thread.sleep(6000);
		log("Select Search Indices 3");
		jsclick(Search_Ok_Button_CustomList);
		log("All Indices Selected Successfully");
		Thread.sleep(6000);
		jsclick(Click_Search_Option);
		Thread.sleep(6000);
		log("Click on Search Tab");
		jsclick(Document_Location);
		Thread.sleep(6000);
		log("Click on Document Location");
		selectElement(Search_Cabinet);
		Thread.sleep(6000);
		log("Expand a Cabinet");
		selectElement(Search_Drawer);
		Thread.sleep(6000);
		log("Expand a Drawer");
		selectElement(Search_Folder);
		Thread.sleep(6000);
		log("Expand a Folder");
		jsclick(Ok_button);
		Thread.sleep(6000);
		log("Click on Ok button");
		jsclick(Find_Button);
		Thread.sleep(6000);
		log("Click on Find button");
		Search_Verify_Indicess_Value4();
		Thread.sleep(6000);
		log("Verified Selected Indices 1");
		Search_Verify_Indicess_Value5();
		Thread.sleep(6000);
		log("Verified Selected Indices 2");
		Search_Verify_Indicess_Value6();
		Thread.sleep(6000);
		log("Verified Selected Indices 3");
		log("Custom column is set successfully for Search Functionality");
	}

	public void getVerify_Reset_Columns_for_Search() throws InterruptedException {

		log("Test Scenario 25 : Verifying Reset Columns for Search ");
		MoveTo_Search_Option();
		Thread.sleep(6000);
		log("Mousehover on Search Tab");
		jsclick(Search_ResetColumn);
		Thread.sleep(6000);
		log("Click on Reset Column");
		jsclick(Reset_Column_OK_Button);
		Thread.sleep(6000);
		log("Click on Ok button");
		jsclick(Find_Button);
		Thread.sleep(6000);
		log("Click on  Find button");
		log("Reset Custom Columns Successfully for Search");

	}

	// Custom column for ToDolist

	public void getOpen_Custom_List_Dialog_And_Verify_Title_ToDoList() throws InterruptedException {

		log("Test Scenario 26 : Open Custom List Dialog And Verifying Title ToDoList ");
		Refresh_Button();
		Thread.sleep(6000);
		log("Click on Refresh button");
		MoveTo_ToDoList_Option();
		Thread.sleep(6000);
		log("Mousehover on ToDoList Tab");
		try {
			Verify_Reset_CustomColumsnTodolist();
			Thread.sleep(6000);
			log("Click on Reset Column Option");
			jsclick(Reset_Column_OK_Button);
			log("Click on Ok button");
			Thread.sleep(6000);
			log("Custom columns Reset Successfully on TodoList Level");
			movingElement(MoveTo_ToDoList_Option);
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println(" Reset Column Option is Disable");
		}
		jsclick(ToDoList_Custom_Columns_option);
		Thread.sleep(12000);
		log("Click on  Custom Column Option");
		ToDoList_titelvalidation();
		log("ToDoList Custom List title validate");
	}

	public void getVerify__Text_of_Custom_List_Dialog_ToDoList() throws Exception {

		log("Test Scenario 27 : Verifying  Text of Custom List Dialog ToDoList ");
		Thread.sleep(6000);
		ToDoList_textvalidation();
		Thread.sleep(6000);
		log("Custom List Dialog Text verified");
		jsclick(ToDoList_Select_Indices01);
		Thread.sleep(6000);
		log("Select Indices 1");
		jsclick(ToDoList_Ok_Button_CustomList);
		log("Click on  Ok button");
		log("Indices Selected Successfully");
	}

	public void getVerify_Set_Custom_Columns_for_ToDoList() throws Exception {

		log("Test Scenario 28 : Verifying Set Custom Columns for ToDoList ");
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
		log("Check Document from document List");
		getMoveTo_Menu_Documents();
		Thread.sleep(6000);
		log("Mousehover on Documents Tab");
		jsclick(sendWorkflow);
		Thread.sleep(6000);
		log("Click on SendToWorkflow Option");
		jsclick(WFAssign);
		Thread.sleep(6000);
		log("Send document to Workflow");
		jsclick(Select_Document);
		Thread.sleep(6000);
		log("Check Document from Document List");
		getMoveTo_Menu_Documents();
		Thread.sleep(6000);
		log("Mousehover on Documents Tab");
		getVerify_CopyandPaste_Document();
		Thread.sleep(6000);
		log("Copy and Paste Document Successfully");
		Refresh_Button();
		Thread.sleep(6000);
		log("Click on Refresh button");
		MoveTo_ToDoList_Option();
		Thread.sleep(6000);
		log("Mousehover on ToDoList Tab");
		jsclick(Select_All_Item);
		Thread.sleep(6000);
		log("Click on All Item Option");
		log("Custom column is set successfully for ToDoList Functionality");
	}

	public void getReset_Custom_Columns_for_ToDoList() throws InterruptedException {

		log("Test Scenario 29 : Reset Custom Columns for ToDoList ");
		Thread.sleep(6000);
		MoveTo_ToDoList_Option();
		Thread.sleep(6000);
		log("Mousehover on ToDoList Tab");
		jsclick(To_Do_Resetcolumn_Option);
		Thread.sleep(6000);
		log("Click on Reset Column Option");
		jsclick(Reset_Column_OK_Button);
		log("ToDoList Custom column Reset Successfully");

	}

	// Document Context Menu

	public void getVerify_Refresh_Option() throws Exception {

		log("Test Scenario 30 : Verifying Refresh Option ");
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
		log("Check Document from document List");
		getMoveTo_Menu_Documents();
		Thread.sleep(6000);
		log("Mousehover on Documents Tab");
		getSelect_Option_Refresh();
		Thread.sleep(6000);
		log("Click on Reffresh Option");
		log("Refresh Functionality verified Successfully on Documents");
	}

	public void getVerify_Categories_Option() throws Exception {

		log("Test Scenario 31 : Verifying Categories Option ");
		jsclick(Select_Document);
		Thread.sleep(6000);
		log("Check Document from document List");
		getMoveTo_Menu_Documents();
		log("Mousehover on Documents Tab");
		getSelect_Option_Catagories_andSet_Colors();
		log("Click on  Catagories Option and set");
		log("Categories on Documents Functionality verified Successfully");

	}

	public void getVerify_copy_and_paste_Option() throws Exception {

		log("Test Scenario 32 : Verifying copy and paste Option ");
		Thread.sleep(6000);
		getMoveTo_Menu_Documents();
		log("Mousehover on Documents Tab");
		getVerify_CopyandPaste_Document();
		Thread.sleep(6000);
		log("copy and paste Documents Functionality verified Successfully");
	}

	public void getVerify_cut_and_paste_Option() throws Exception {

		log("Test Scenario 33 : Verifying cut and paste Option ");
		jsclick(Select_Document);
		Thread.sleep(6000);
		log("Check Document from document List");
		getMoveTo_Menu_Documents();
		Thread.sleep(6000);
		log("Mousehover on Documents Tab");
		getVerify_CutandPaste_Document();
		Thread.sleep(6000);
		log("cut and paste Document Functionality verified Successfully");
	}

	public void getVerify_Delete_Option() throws Exception {

		log("Test Scenario 34 : Verifying Delete Option ");
		getVerify_Delete_Document();
		Thread.sleep(6000);
		log("Document Delete Functionality verified Successfully");
	}

	public void Verify_CreateFavorites_Documents() throws Exception {

		log("Test Scenario 35 : Verifying Create Favorites Document ");
		Verify_CreateFavorites_Document();
		log("Verified Create Favorites Document ");
		Refresh_Button();
		Thread.sleep(6000);
		log("Click on Refresh button");
		getOpen_CreateFavorites_Document();
		log("CreateFavorites Document Functionality verified Successfully");
	}

	public void getVerify_Notification_on_Document() throws Exception {

		log("Test Scenario 36 : Verifying Notification on Document ");

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
		log("Check Document from document List");
		getMoveTo_Menu_Documents();
		Thread.sleep(6000);
		log("Mousehover on Documents Tab");
		getVerify_CopyandPaste_Document();
		Thread.sleep(6000);
		log("Copy and Paste Document");
		jsclick(Select_Document);
		Thread.sleep(6000);
		log("Check Document from document List");
		getMoveTo_Menu_Documents();
		Thread.sleep(6000);
		log("Mousehover on Documents Tab");
		getCreate_Notification_Document();
		Thread.sleep(6000);
		log("Create Notification on Document");
		jsclick(Click_signature_Menuoption);
		Thread.sleep(6000);
		log("Click on Signature option");
		getinputpassword();
		Thread.sleep(6000);
		log("Enter a Password");
		getAdd_Signature_Onpage();
		Thread.sleep(6000);
		log("Add signature on page");
		getSave_Signature_Document();
		Thread.sleep(6000);
		log("Click save button and save added signature");
		movingclkElement(closedoc);
		log("Close Document");
		log("Notification_on_Document Functionality verified Successfully");

	}

	public void getVerify_SendTo_Mail() throws Exception {

		log("Test Scenario 37 : Verifying SendTo Mail ");
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
		log("Check a Document from document List");
		getMoveTo_Menu_Documents();
		Thread.sleep(6000);
		log("Mousehover on Documents Tab");
		getSentTo_Mail_asReference();
		Thread.sleep(6000);
		log("SendTo Mail asReference Functionality verified Successfully");
		jsclick(Select_Document);
		Thread.sleep(6000);
		log("Check Document from document List");
		getMoveTo_Menu_Documents();
		Thread.sleep(6000);
		log("Mousehover on Documents Tab");
		getSentTo_Mail_asCopy();
		Thread.sleep(6000);
		log("SendTo Mail asCopy Functionality verified Successfully");
	}

	public void getVerify_SendTo_Print() throws Exception {

		log("Test Scenario 38 : Verifying Send To Print ");
		getSentTo_Print();
		log("SendTo Print Functionality verified Successfully");

	}

	public void getVerify_SendTo_Export() throws Exception {

		log("Test Scenario 39 : Verifying Send To Export ");
		getSentTo_Export();
		log("SendTo Export Functionality verified Successfully");

	}

	public void getVerify_SendTo_GenerateDocumentLink() throws Exception {

		log("Test Scenario 40 : Verifying SendTo Generate Document Link ");
		Refresh_Button();
		Thread.sleep(6000);
		log("Click on Refresh button");
		getMoveTo_Menu_Recent();
		Thread.sleep(6000);
		log("Mousehover on Recent Tab");
		jsclick(Recent_Folder);
		Thread.sleep(6000);
		log("Click on Recent Folder");
		getSentTo_GenerateDocumentLink();
		Thread.sleep(6000);
		log("Send document to Generate Document Link");
		Refresh_Button();
		log("Click on Refresh button");
		log("SendTo GenerateDocumentLink Functionality verified Successfully");
	}

	public void getVerify_SendTo_SecureLink() throws Exception {

		log("Test Scenario 41 : Verifying SendTo SecureLink ");
		Thread.sleep(6000);
		getMoveTo_Menu_Recent();
		Thread.sleep(6000);
		log("Mousehover on Recent Tab");
		jsclick(Recent_Folder);
		Thread.sleep(6000);
		log("Click on Recent Folder");
		jsclick(Select_Document);
		Thread.sleep(6000);
		log("Check Document from document List");
		getSentTo_SecureLink();
		Thread.sleep(6000);
		log("Send document to Secure Link");
		Refresh_Button();
		Thread.sleep(6000);
		log("Click on Refresh button");
		log("SendTo SecureLink Functionality verified Successfully");

	}

	// Verifying Spanish Language

	public void CreateandOpen_NewDocument_Spanish_Language_with_OCR() throws Exception {

		log("Test Scenario 1 :Create and Open New Document Spanish Language with OCR Functionality ");
		Thread.sleep(6000);
		movingclkElement(Setting_Icon);
		Thread.sleep(6000);
		log("Click on Setting Icon");
		jsclick(My_Preferencesetting);
		Thread.sleep(6000);
		log("Click on My Preferences OptionS");
		getSelect_Office_document_Defaultviewing();
		Thread.sleep(6000);
		log("Select Office document and set as Default View");
		getPdf_document_Defaultviewing();
		Thread.sleep(6000);
		log("Select Pdf Document and set as Default View");
		getSelect_Dropdown_Actual_Size();
		Thread.sleep(6000);
		log("Select Viewer zoom and set as Actual size Option");
		movingclkElement(Apply_button);
		Thread.sleep(6000);
		log("Click on Apply button");
		LogoutPage();
		jsclick(Spanish_Language);
		Thread.sleep(6000);
		log("Click on Spanish Laguage Option");
		LogDipakUser();
		Thread.sleep(6000);
		log("Login EWA with User credintial");
		jsclick(NewDocuments_MenuOption);
		Thread.sleep(6000);
		log("Click on New Documents Tab");
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
		log(" select a Folder");
		log("Folder is selected for Create New Documents");
		OK_Button_BrowseforFolder.click();
		Thread.sleep(6000);
		log("Click on Ok button");
		jsclick(getgetSelect_Document_Type_Dropdown());
		Thread.sleep(6000);
		log("Select Document type Dropdown");
		Enter_Report_Name_Text.sendKeys(Language_excelRead(10, 2));
		Thread.sleep(6000);
		log("Enter value into Report Name field");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(getMove_To_PlusIcon()));
		movingElement(getMove_To_PlusIcon());
		getBrowse_Option();
		Thread.sleep(3000);
		log("Browse Document Page");
		Runtime.getRuntime()
				.exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Underscore.exe");
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
		jsclick(ClickOCR);
		Thread.sleep(6000);
		log("Click on OCR menu Option");
		getSet_OCR_ToDocument();
		Thread.sleep(6000);
		log("Set OCR and Extract Report Name");
		jsclick(ReportName);
		Thread.sleep(6000);
		log("Click on Report Name Message");
		jsclick(Create_Button);
		Thread.sleep(6000);
		log("Click on Create button");
		jsclick(Navigate_Button);
		Thread.sleep(6000);
		log("Click on Navigate button");
		getOCRReportnamevalidation_AfterCreateDOC();
		Thread.sleep(6000);
		log("Validate Document name with Report name");
		jsclick(ReportNameValueAfterDoc);
		Thread.sleep(6000);
		log("Verifying after create Document OCR Report name");
		getClick_FileInfo_Option();
		Thread.sleep(6000);
		log("Click on File Info Menu option");
		getClick_FileInfo_OkButton_withFileName();
		Thread.sleep(6000);
		log("Verifying file name and Click on  Ok button");
		log("New Document Create and open in Spanish language");
		log("OCR Functionality verified successfully");
		movingElement(getMove_To_PlusIcon());
		getBrowse_Option();
		Thread.sleep(6000);
		log("Browse Document page");
		Runtime.getRuntime().exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Hyphen.exe");
		Thread.sleep(6000);
		jsclick(Open_Hyphen_page);
		Thread.sleep(6000);
		log("By using AutoIT add file from external folder");
		jsclick(UpdateSpanish_Button);
		Thread.sleep(6000);
		log("Click on Update button");
		jsclick(ClickOCR);
		Thread.sleep(6000);
		log("Click on OCR menu Option");
		getSet_OCR_ToDocumentPDF();
		Thread.sleep(6000);
		log("Set Ocr to Document page");
		jsclick(ReportName);
		Thread.sleep(6000);
		log("Click on Report Name");
		jsclick(SpanishSave_UpdateButton);
		Thread.sleep(6000);
		log("Click on Save button");
		jsclick(SpanishUpdate_Ok_button);
		Thread.sleep(6000);
		log("Click on Ok button");
		jsclick(Save_button);
		Thread.sleep(6000);
		log("Click on Save menu button");
		jsclick(DocumentSave_Ok_button);
		Thread.sleep(6000);
		log("Click on Ok button");
		jsclick(SpanishProperties_option);
		Thread.sleep(6000);
		log("Click on Properties Option");
		movingclkElement(closedoc);
		Thread.sleep(6000);
		log("Click on Viewer Close button ");
		getOCRReportnamevalidation_BeforeCreateDOC();
		Thread.sleep(6000);
		log("Verifying Report Name as Document Name");
		jsclick(ReportNameValueBeforeDoc);
		Thread.sleep(6000);
		log("OCR Functionality Verified successfully");
	}

	public void Addsignature_Spanish_Language() throws Exception {

		log("Test Scenario 2 :Add signature Spanish Language ");
		Thread.sleep(6000);
		jsclick(Click_signature_Menuoption);
		Thread.sleep(6000);
		log("Click on Signature menu Option");
		try {
			getinputpassword();
			Thread.sleep(6000);
			log("Enter Signature password in password textbox");
		} catch (Exception e) {
			System.out.println("signature is not password protected...");
		}
		getAdd_Signature_Onpage();
		Thread.sleep(6000);
		log("Click on signature menu and add signature on  Page");
		log("signature added Successfully on  Document");
	}

	public void AddRedaction_Spanish_Language() throws Exception {

		log("Test Scenario 3 :Add Redaction Spanish Language");
		Thread.sleep(6000);
		getMove_to_Annotation_Option_inViewer();
		Thread.sleep(6000);
		log("Move to Annotation menu Option in Viewer");
		getRedaction_Option();
		Thread.sleep(6000);
		log("Select Redaction from Annotation Menu");
		getSet_Redaction_ToDocument();
		Thread.sleep(6000);
		log("Set Redaction on Page");
		jsclick(Save_button);
		Thread.sleep(6000);
		log("Click on save button");
		jsclick(DocumentSave_Ok_button);
		Thread.sleep(6000);
		log("Click on Ok button");
		log("Redaction added Successfully on  Document");
	}

	public void ShowHideThumbnail_Spanish_Language() throws Exception {

		log("Test Scenario 4 :Show Hide Thumbnail Spanish Language");
		Thread.sleep(6000);
		jsclick(showHideThumbnail);
		Thread.sleep(6000);
		log("Click on Show Hide Thumbnail Menu Option");
		jsclick(showHideThumbnail);
		Thread.sleep(6000);
		log("again Click on Show Hide Thumbnail Menu Option");
		Refresh_Button();
		log("Click on Refresh button");
		log("Show Hide Thumbnail options verified");
	}

	// Create Template in Spanish laguage

	public void verify_to_CreateorBrowse_Template_Defaultviewing() throws Exception {

		log("Test Scenario 5 :Verifying to Create or Browse Template Default viewing ");
		movingclkElement(Setting_Icon);
		Thread.sleep(6000);
		log("Click on Setting Icon");
		jsclick(My_Preferencesetting);
		Thread.sleep(6000);
		log("Click on My Preferences");
		getSelect_Office_document_Defaultviewing();
		Thread.sleep(6000);
		log("Select Office Document and set as Default View");
		getPdf_document_Defaultviewing();
		Thread.sleep(6000);
		log("Select Pdf Document and set as Default View");
		movingclkElement(Apply_button);
		Thread.sleep(6000);
		log("Click on Apply button");
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
		jsclick(getgetSelect_Document_Type_Dropdown());
		Thread.sleep(6000);
		log("Select Document Type value");
		jsclick(Enter_Report_Name_Text);
		Thread.sleep(6000);
		log("Click on Report Name textbox");
		getSelect_ReportName_Testvalue();
		Thread.sleep(6000);
		log("Enter value into Report Name field");
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.elementToBeClickable(getMove_To_PlusIcon()));
		movingclkElement(getMove_To_PlusIcon());
		getBrowse_Option();
		Thread.sleep(6000);
		log("Browse Document page");
		Runtime.getRuntime().exec("D:\\DipakAutoit\\FileUploadScriptpdf.exe");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alt = driver.switchTo().alert();
		alt.accept();
		log("By using AutoIT add file from external folder");
		Thread.sleep(6000);
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait2.until(ExpectedConditions.elementToBeClickable(getMove_To_PlusIcon()));
		movingclkElement(getMove_To_PlusIcon());
		getBrowse_Option();
		Thread.sleep(6000);
		log("Browse Document page2");
		Runtime.getRuntime().exec("D:\\DipakAutoit\\FileUploadScript.exe");
		jsclick(Save_Template_Button);
		log("By using AutoIT add file from external folder");
		jsclick(Template_Description_No_button);
		Thread.sleep(6000);
		log("Click on Template Description No button ");
		jsclick(Save_Template_Button);
		Thread.sleep(6000);
		log("Click on Save Template button");
		jsclick(Template_NameTextbox);
		Thread.sleep(6000);
		log("Click on Template Name Textbox");
		getTemplate_NameTextboxvalue();
		Thread.sleep(6000);
		log("Enter Template Name");
		jsclick(Template_Description_Messagebox);
		Thread.sleep(6000);
		log("Click on Template Description messagebox");
		getTemplate_Description_Messageboxvalue();
		Thread.sleep(6000);
		log("Enter message under Template Description message box");
		jsclick(Template_Description_OK_button);
		Thread.sleep(6000);
		log("Click on Template Description Ok button");
		getTemplate_Created_Message_Verify();
		Thread.sleep(6000);
		log("Verified Template created successfully");
		jsclick(Template_Created_OK_button);
		Thread.sleep(6000);
		log("Click on Ok button");
		log("Verifying to CreateorBrowse Template Defaultviewing");
		Refresh_Button();
		log("Click on Refresh button");
		Thread.sleep(6000);

	}

	public void Verify_to_Edit_and_Delete_DefaultTemplate() throws Exception {

		log("Test Scenario 6 :Verifying to Edit and Delete Default Template ");
		getMoveto_Templates_Option();
		Thread.sleep(6000);
		log("Mousehover to Template Tab");
		jsclick(Select_Created_Template);
		try {
			WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait2.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Thread.sleep(6000);
		log("Select and open Created Template");
		jsclick(Click_Edit_Template_Button);
		Thread.sleep(6000);
		log("Click on Edit Template Fab button");
		EditTemplate_Description_Messagebox.clear();
		Thread.sleep(6000);
		log("Click on Edit Template Description and Clear it");
		getEditTemplate_Description_Messageboxvalue();
		Thread.sleep(6000);
		log("Enter message into Edited messagebox field");
		jsclick(EditTemplate_Description_OK_button);
		Thread.sleep(6000);
		log("Click on Ok button");
		getEditTemplate_Created_Message_Verify();
		log("Template edited successfully");
		jsclick(EditTemplate_Created_OK_button);
		Thread.sleep(6000);
		log("Verifying Template edited successfully and click on  Ok button");
		getMoveto_Templates_Option();
		Thread.sleep(6000);
		log("Mousehover to Template Tab");
		jsclick(Select_Created_Template);
		Thread.sleep(6000);
		log("Select Created Template ");
		jsclick(Delete_Template_Button);
		Thread.sleep(6000);
		log("Click on Delete Template Fab button");
		jsclick(Delete_Template_OK_Button);
		log("Click on Ok button");
		log("Template Deleted Successfully");

	}

	public void verify_to_CreateorBrowse_Template_Advancedviewing_OfficeDoc() throws Exception {

		log("Test Scenario 7 :Verifying to Create or Browse Template Advanced viewing Office Doc");
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
		log("Select Office Document and set as Advanced view");
		movingclkElement(Apply_button);
		Thread.sleep(6000);
		log("Click on Apply button");
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
		jsclick(getgetSelect_Document_Type_Dropdown());
		Thread.sleep(6000);
		log("Select Document Type Dropdown");
		jsclick(Enter_Report_Name_Text);
		Thread.sleep(6000);
		log("Click on Report name");
		getSelect_ReportName_Testvalue();
		Thread.sleep(6000);
		log("Enter value into Report name field");
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait2.until(ExpectedConditions.elementToBeClickable(getMove_To_PlusIcon()));
		movingclkElement(getMove_To_PlusIcon());
		getBrowse_Option();
		Thread.sleep(6000);
		log("Browse Document page");
		Runtime.getRuntime().exec("D:\\DipakAutoit\\OfficeDoc\\FileUploadOfficeDoc.exe");
		log("By using AutoIT add file from external folder");
		Thread.sleep(6000);
		jsclick(Save_Template_Button);
		log("Save Template button clicked successfully");
		jsclick(Template_Description_No_button);
		Thread.sleep(6000);
		log("Click on No button");
		jsclick(Save_Template_Button);
		Thread.sleep(6000);
		log("Click on Save Template button");
		jsclick(Template_NameTextbox);
		Thread.sleep(6000);
		log("Click on Template Name Textbox");
		getTemplate_NameTextboxvalue();
		Thread.sleep(6000);
		log("Enter value into Template Name textbox");
		jsclick(Template_Description_Messagebox);
		Thread.sleep(6000);
		log("Click on Template Description messagebox");
		getTemplate_Description_Messageboxvalue();
		Thread.sleep(6000);
		log("Enter Template Description");
		jsclick(Template_Description_OK_button);
		Thread.sleep(6000);
		log("Click on Ok button");
		getTemplate_Created_Message_Verify();
		Thread.sleep(6000);
		log("Verified and Template created succesfully");
		jsclick(Template_Created_OK_button);
		log("Click on Ok button");
		log("Verifying to CreateorBrowse OfficeDoc Template advancedviewing");

	}

	public void Verify_to_Edit_and_Delete_AdvancedTemplate_OfficeDoc() throws Exception {

		log("Test Scenario 8 :Verifying to Edit and Delete Advanced Template Office Doc");
		getMoveto_Templates_Option();
		Thread.sleep(6000);
		log("Mousehover to Template Tab");
		jsclick(Select_Created_Template);
		Thread.sleep(6000);
		log("Select Created Template");
		jsclick(Click_Edit_Template_Button);
		Thread.sleep(6000);
		log("Click on Edit Template Fab button");
		EditTemplate_Description_Messagebox.clear();
		Thread.sleep(6000);
		log("Click on Edit Template description messagebox");
		getEditTemplate_Description_Messageboxvalue();
		Thread.sleep(6000);
		log("Enter message in Edit Template Description");
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
		log("Mousehover to Template Tab");
		jsclick(Select_Created_Template);
		Thread.sleep(6000);
		log("Select Created Template");
		jsclick(Delete_Template_Button);
		Thread.sleep(6000);
		log("Click on Delete Template Fab button");
		jsclick(Delete_Template_OK_Button);
		log("Template Deleted Successfully");

	}

	public void verify_to_Create_Formmapping_PDFTemplate_Advanced_viewing() throws Exception {

		log("Test Scenario 9 :Verifying to Create Formmapping PDFTemplate Advanced viewing");
		Refresh_Button();
		Thread.sleep(6000);
		log("Click on Refresh button");
		movingclkElement(Setting_Icon);
		Thread.sleep(6000);
		log("Click on Setting Icon");
		jsclick(My_Preferencesetting);
		Thread.sleep(6000);
		log("Click on My Preferences Option");
		getPdf_document_Advancedviewing();
		Thread.sleep(6000);
		log("Select Pdf Document and set as Advanced View");
		movingclkElement(Apply_button);
		Thread.sleep(6000);
		log("Click on Apply button");
		jsclick(Templates_MenuOption);
		Thread.sleep(6000);
		log("Click on Template Tab");
		jsclick(Destination_Folder_Textbox);
		Thread.sleep(6000);
		log("Click on Destination Folder TextBox");
		selectElement(Select_Cabinet1);
		Thread.sleep(6000);
		log("Expand a Cabinet");
		selectElement(Select_Drawer1);
		Thread.sleep(6000);
		log("Expand a Drawer");
		selectElement(Select_Folder1);
		Thread.sleep(6000);
		log("select a Folder");
		log("Folder is selected for Templates");
		jsclick(OK_Button_BrowseforFolder);
		Thread.sleep(6000);
		log("Click on Ok button");
		jsclick(getgetSelect_Document_Type_Dropdown());
		Thread.sleep(6000);
		log("Select Document type dropdown ");
		jsclick(Enter_Report_Name_Text);
		Thread.sleep(6000);
		log("Click on Report name Textbox");
		getSelect_ReportName_Testvalue();
		Thread.sleep(3000);
		log("Enter value into Report name field");
		getMove_To_PlusIcon();
		getNew_pdf_Document_Option();
		Thread.sleep(6000);
		log("Browse Document");
		getEnter_pdf_File_Name();
		Thread.sleep(6000);
		log("Enter pdf file name");
		jsclick(pdfViewer);
		Thread.sleep(6000);
		log("Click on Pdf Viewer Option");
		jsclick(Textbox);
		Thread.sleep(6000);
		log("Select TextBox from Viewer");
		jsclick(Add_Textbox_Onpage);
		Thread.sleep(6000);
		log("Select and add Textbox on  Page");
		jsclick(Click_Formmapper);
		Thread.sleep(6000);
		log("Click on Form mapping Option");
		getSelect_Formfield();
		Thread.sleep(6000);
		log("Select Form field");
		jsclick(FormOK);
		Thread.sleep(6000);
		log("Click on Form mapping dialog Ok button");
		jsclick(Save_Template_Button);
		Thread.sleep(6000);
		log("Click on  Save Template button");
		jsclick(Template_NameTextbox);
		Thread.sleep(6000);
		log("Click on Template name Textbox");
		getTemplate_NameTextboxvalue();
		Thread.sleep(6000);
		log("Enter Template name");
		jsclick(Template_Description_Messagebox);
		Thread.sleep(6000);
		log("Click on Template Description message box");
		getTemplate_Description_Messageboxvalue();
		Thread.sleep(6000);
		log("Enter message Template Description box");
		jsclick(Template_Description_OK_button);
		Thread.sleep(6000);
		log("Click on Ok button");
		getTemplate_Created_Message_Verify();
		Thread.sleep(6000);
		log("Template Created Successfully Verified");
		jsclick(Template_Created_OK_button);
		log("Click on ok button");
		log("Verifying to CreateorBrowse Formmapping Template advancedviewing");

	}

	public void Verify_to_Edit_and_Delete_Formfield() throws Exception {

		log("Test Scenario 10 :Verifying to Edit and Delete Form field ");
		getMoveto_Templates_Option();
		Thread.sleep(6000);
		log("Mousehover to Template Tab");
		jsclick(Select_Created_Template);
		Thread.sleep(6000);
		log("Select created Template");
		jsclick(Click_Edit_Template_Button);
		Thread.sleep(6000);
		log("Click on Edit Template Fab button");
		EditTemplate_Description_Messagebox.clear();
		Thread.sleep(6000);
		log("Click on Edit Template Description message box");
		getEditTemplate_Description_Messageboxvalue();
		Thread.sleep(6000);
		log("Enter message in Edit Template Description messagebox");
		jsclick(EditTemplate_Description_OK_button);
		Thread.sleep(6000);
		log("Click on Ok button");
		getEditTemplate_Created_Message_Verify();
		log("Template edited successfully");
		jsclick(EditTemplate_Created_OK_button);
		Thread.sleep(6000);
		log("Click on Template edited Ok button");
		getMoveto_Templates_Option();
		Thread.sleep(6000);
		log("Mousehover to Template Tab");
		jsclick(Select_Created_Template);
		Thread.sleep(6000);
		log("Select Created Template");
		jsclick(Delete_Template_Button);
		Thread.sleep(6000);
		log("Click on Delete Template button");
		jsclick(Delete_Template_OK_Button);
		log("Click on OK button");
		log("Formmapping Template Deleted Successfully");

	}

	public void Set_Defaultview() throws Exception {

		log("Test Scenario 11 : Set Defaultview");
		Refresh_Button();
		Thread.sleep(6000);
		log("Click on Refresh button");
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
		log("Select Pdf Document and set as Default View");
		movingclkElement(Apply_button);
		Thread.sleep(6000);
		log("Click on Apply button");
	}

	// Verifying Load more in Search and Folder in Spanish laguage

	public void Verify_Load_MoreCount_On_Search() throws Exception {

		log("Test Scenario 12 :Verifying Load More Count On Search ");
		Refresh_Button();
		Thread.sleep(6000);
		log("Click on Refresh button");
		movingclkElement(Setting_Icon);
		Thread.sleep(6000);
		log("Click on Setting Icon");
		jsclick(My_Preferencesetting);
		Thread.sleep(6000);
		log("Click My Preferences");
		getEnter_Loadmorecount();
		Thread.sleep(6000);
		log("Enter Load more value");
		movingclkElement(Apply_button);
		Thread.sleep(6000);
		log("Click on Apply button");
		jsclick(Click_Search_Option);
		Thread.sleep(6000);
		log("Click on Search Tab");
		jsclick(Find_Button);
		Thread.sleep(6000);
		log("Click on Find button");
		getVerify_Loadmorecount_Searchresult();
		Thread.sleep(6000);
		log("Verifying Load more count Search");
		jsclick(Loadmorebutton);
		Thread.sleep(6000);
		log("Click on Load more button");
		getVerify_Loadmorecount_Searchresult();
		Thread.sleep(6000);
		log("Verifying Load more Result");
		log("Minumum number of Load More count on Search Verified successfully");

	}

	public void Verify_Load_MoreCount_On_Folder() throws Exception {

		log("Test Scenario 13 :Verifying Load More Count On Folder");
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
		log(" select a Folder");
		getVerify_Loadmorecount_Document_Folder();
		Thread.sleep(6000);
		log("Verified Load more count On Folder Document");
		jsclick(Loadmorebutton);
		Thread.sleep(6000);
		log("Click on Load more button");
		getVerify_Loadmorecount_Document_Folder();
		log("Verifying Load more count Document Folder");
		Refresh_Button();
		Thread.sleep(6000);
		log("Click on Refresh button");
		log("Minumum number of Load More count on Folder Verified successfully");

	}

	// Verifying Custom Columns in Spanish Language

	// Custom columns for Room

	public void Open_Custom_List_Dialog_And_Verify_Title_Roomcolumn() throws InterruptedException {

		log("Test Scenario 14 :Open Custom List Dialog And Verifying Title Room column ");
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
		getMoveTo_Menu_RoomName();
		Thread.sleep(6000);
		log("Mousehover to Roomname Tab");
		try {
			Verify_Reset_CustomColumsnRoom();
			Thread.sleep(6000);
			log("Click on Reset Column Option");
			jsclick(Reset_Column_OK_Button);
			log("Click on Ok button");
			Thread.sleep(6000);
			log("Custom columns Reset Successfully on Room Level");
			movingElement(MoveTo_Menu_RoomName);
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println(" Reset Column Option is Disable");
		}
		jsclick(CustomColumnOptionRoom);
		Thread.sleep(12000);
		log("Click on Custom Column Option");
		gettitelvalidation();
		log("Custom List title validate");
	}

	public void Verify__Text_of_Custom_List_Dialog_Roomcolumn() throws InterruptedException {

		log("Test Scenario 15 :Verifying  Text of Custom List Dialog Roomcolumn ");
		Thread.sleep(6000);
		getextvalidation();
		log("Custom List Dialog Text verified");
	}

	public void Set_And_Verify_Custom_Columns_NodeLevel() throws Exception {

		log("Test Scenario 16 :Set And Verifying Custom Columns NodeLevel");
		Thread.sleep(6000);
		getSearchBoxIndices1();
		Thread.sleep(6000);
		log("Enter Indices 1 value in search Box");
		jsclick(Select_Indices01);
		Thread.sleep(6000);
		log("Select Entered Indices 1 Value");
		getSearchBoxIndices2();
		Thread.sleep(6000);
		log("Enter Indices 2 value in search Box");
		jsclick(Select_Indices02);
		Thread.sleep(6000);
		log("Select Entered Indices 2 Value");
		getSearchBoxIndices3();
		Thread.sleep(6000);
		log("Enter Indices 3 value in search Box");
		jsclick(Select_Indices03);
		Thread.sleep(6000);
		log("Select Entered Indices 3 Value");
		jsclick(Ok_Button_CustomList);
		log("Indices Selected Successfully");
		Thread.sleep(6000);
		movingclkElement(Setting_Icon);
		Thread.sleep(6000);
		log("Click on Setting Icon");
		jsclick(My_Preferencesetting);
		Thread.sleep(6000);
		log("Click on My Preferences");
		Verify_CompactView_checkbox();
		Thread.sleep(6000);
		log("Check Compact View Checkbox");
		movingclkElement(Apply_button);
		Thread.sleep(6000);
		log("Click on Apply button");
		Refresh_Button();
		Thread.sleep(6000);
		log("Click on Refresh button");
		getMoveTo_Menu_Recent();
		Thread.sleep(6000);
		log("Mousehover to Recent Tab");
		jsclick(Recent_Folder);
		Thread.sleep(6000);
		log("Click on Recent Folder");
		Verify_Indicess_Value();
		Thread.sleep(6000);
		log("Verifying Added Indices Value");
		log("Custom Columns is set Node Level successfully");

	}

	public void Verify_Default_Custom_Columns() throws InterruptedException {

		log("Test Scenario 17 : Verifying Default Custom Columns");
		Refresh_Button();
		Thread.sleep(6000);
		log("Click on Refresh button");
		getMoveTo_Menu_Recent();
		Thread.sleep(6000);
		log("Mousehover to Recent Tab");
		jsclick(Recent_Folder);
		Thread.sleep(6000);
		log("Click on Recent Folder");
		getMoveTo_Menu_RoomName();
		Thread.sleep(6000);
		log("Click on Room name Tab");
		jsclick(CustomColumnOptionRoom);
		Thread.sleep(6000);
		Default_Button_CustomList();
		Thread.sleep(6000);
		log("Click on Custom List dialog Default ButtonC");
		jsclick(Ok_Button_CustomList);
		log("Click on Ok button");
		log("Set and Verifying Default Custom columns successfully");

	}

	public void Verify_Cancel_Button_of_CustomList() throws InterruptedException {

		log("Test Scenario 18 :Verifying Cancel button of Custom List ");
		getMoveTo_Menu_RoomName();
		log("Mousehover to Roomname Tab");
		jsclick(CustomColumnOptionRoom);
		Thread.sleep(6000);
		log("Click on Custom Column Option");
		Cancel_Button_CustomList();
		log("Click on Custom Column Cancel button");

	}

	public void Verify_Custom_Columns_RoomLevel() throws InterruptedException {

		log("Test Scenario 19 :Verifying Custom Columns Room Level");
		getMoveTo_Menu_RoomName();
		log("Mousehover to Roomname Tab");
		jsclick(CustomColumnOptionRoom);
		Thread.sleep(6000);
		log("Click on Custom Column Option");
		jsclick(Click_DropdownOption);
		log("Click on  Custom columns Dropdown option and select Indices Level");
		Select_DropdownValue();
		Thread.sleep(6000);
		log("Select Room Level Indices");
		jsclick(Set_RoomLevel_Indices);
		Thread.sleep(6000);
		jsclick(Ok_Button_CustomList);
		log("Click on Ok button");
		log("Indices is Selected Successfully for RoomLevel");

	}

	public void Verify_Reset_Columns_Functionality() throws InterruptedException {

		log("Test Scenario 20 :Verifying Reset Columns Functionality ");
		getMoveTo_Menu_RoomName();
		log("Mousehover to Roomname Tab");
		jsclick(Room_Reset_CustomColumns);
		Thread.sleep(6000);
		log("Click on Reset Custom column Option");
		jsclick(Reset_Column_OK_Button);
		log("Click on Ok button ");
		log("Custom columns Reset Successfully");

	}

	// Custom columns for Search

	public void Open_Custom_List_Dialog_And_Verify_Title_Searchcolumn() throws InterruptedException {

		log("Test Scenario 21 : Open Custom List Dialog And Verifying Title Search column ");
		MoveTo_Search_Option();
		Thread.sleep(6000);
		log("	Mousehover to Search Tab");
		try {
			Verify_Reset_CustomColumsnSearch();
			Thread.sleep(6000);
			log("Click on Reset Column Option");
			jsclick(Reset_Column_OK_Button);
			Thread.sleep(6000);
			log("Click on Ok button");
			Thread.sleep(6000);
			log("Custom columns Reset Successfully on Search Level");
			movingElement(MoveTo_Search_Option);
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println(" Reset Column Option is Disable");
		}
		jsclick(Search_Custom_Columns_option);
		Thread.sleep(12000);
		log("Click on Custom Column Option");
		getSearch_titelvalidation();
		log("Search Custom List title validate");

	}

	public void Verify__Text_of_Custom_List_Dialog_Searchcolumn() throws InterruptedException {

		log("Test Scenario 22 : Verifying Text of Custom List Dialog Search column ");
		Thread.sleep(6000);
		getSearch_textvalidation();
		log("Search Custom List Dialog Text verified");

	}

	public void Verify_Set_Custom_Columns_for_Search() throws Exception {

		log("Test Scenario 23 :Verifying Set Custom Columns for Search ");
		Thread.sleep(6000);
		getSearchBoxIndices4();
		Thread.sleep(6000);
		log("Enter Indices 4 value in Search Box");
		jsclick(Search_Select_Indices01);
		Thread.sleep(6000);
		log("Select Search Indices ");
		getSearchBoxIndices5();
		Thread.sleep(6000);
		log("Enter Indices 5 value in Search Box");
		jsclick(Search_Select_Indices02);
		Thread.sleep(6000);
		log("Select Search Indices ");
		getSearchBoxIndices6();
		Thread.sleep(6000);
		log("Enter Indices 6 value in Search Box");
		jsclick(Search_Select_Indices03);
		Thread.sleep(6000);
		log("Select Search Indices");
		jsclick(Search_Ok_Button_CustomList);
		log("Click on Ok button");
		log("Indices Selected Successfully");
		Thread.sleep(6000);
		Refresh_Button();
		Thread.sleep(6000);
		log("Click on Refresh button");
		jsclick(Click_Search_Option);
		Thread.sleep(6000);
		log("Click on Search Tab");
		jsclick(Document_Location);
		Thread.sleep(6000);
		log("Click on  Document Location textbox");
		selectElement(Search_Cabinet);
		Thread.sleep(6000);
		log("Expand a Cabinet");
		selectElement(Search_Drawer);
		Thread.sleep(6000);
		log("Expand a Drawer");
		selectElement(Search_Folder);
		Thread.sleep(6000);
		log(" select a Folder");
		jsclick(Ok_button);
		Thread.sleep(6000);
		log("Click on Ok button");
		jsclick(Find_Button);
		Thread.sleep(6000);
		log("Click on Find button");
		Search_Verify_Indicess_Value4();
		Thread.sleep(6000);
		log("Verified added Indices Custom Columns");
		Search_Verify_Indicess_Value5();
		Thread.sleep(6000);
		log("Verified Indices Value");
		Search_Verify_Indicess_Value6();
		Thread.sleep(6000);
		log("Custom column is set successfully for Search Functionality");

	}

	public void Verify_Reset_Columns_for_Search() throws InterruptedException {

		log("Test Scenario 24 :Verifying Reset Columns for Search ");
		MoveTo_Search_Option();
		Thread.sleep(6000);
		log("	Mousehover to Search Tab");
		jsclick(Search_ResetColumn);
		Thread.sleep(6000);
		log("Click on Reset Columns Option");
		jsclick(Reset_Column_OK_Button);
		Thread.sleep(6000);
		log("Verifying pop up and click on  Ok button");
		jsclick(Find_Button);
		Thread.sleep(6000);
		log("Click on Find button");
		log("Reset Custom Columns Successfully for Search");

	}

	// Custom column for ToDolist

	public void Open_Custom_List_Dialog_And_Verify_Title_ToDoList() throws InterruptedException {

		log("Test Scenario 25 : Open Custom List Dialog And Verifying Title ToDoList ");
		Refresh_Button();
		Thread.sleep(6000);
		log("Click on Refresh button");
		MoveTo_ToDoList_Option();
		Thread.sleep(6000);
		log("Mousehover to ToDoList Tab");
		try {
			Verify_Reset_CustomColumsnTodolist();
			Thread.sleep(6000);
			log("Click on Reset Column Option");
			jsclick(Reset_Column_OK_Button);
			log("Click on Ok button");
			Thread.sleep(6000);
			log("Custom columns Reset Successfully on TodoList Level");
			movingElement(MoveTo_ToDoList_Option);
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println(" Reset Column Option is Disable");
		}
		jsclick(ToDoList_Custom_Columns_option);
		Thread.sleep(12000);
		log("Click on Custom Column Option");
		ToDoList_titelvalidation();
		log("ToDoList Custom List title validate");

	}

	public void Verify__Text_of_Custom_List_Dialog_ToDoList() throws Exception {

		log("Test Scenario 26 :Verifying  Text of Custom List Dialog ToDoList");
		Thread.sleep(6000);
		ToDoList_textvalidation();
		Thread.sleep(6000);
		log("Verified TodoList Custom column dialog Text");
		log("Custom List Dialog Text verified");

	}

	public void Verify_Set_Custom_Columns_for_ToDoList() throws Exception {

		log("Test Scenario 27 :Verifying Set Custom Columns for ToDoList ");
		jsclick(ToDoList_Select_Indices01);
		Thread.sleep(6000);
		jsclick(ToDoList_Ok_Button_CustomList);
		log("Indices value Selected Successfully");
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
		log("Check Document page");
		getMoveTo_Menu_Documents();
		Thread.sleep(6000);
		log("Move to Documents Tab");
		jsclick(sendWorkflow);
		Thread.sleep(6000);
		log("Click on Send to Workflow");
		jsclick(WFAssign);
		Thread.sleep(6000);
		log("Select and click Workflow name");
		jsclick(Select_Document);
		Thread.sleep(6000);
		log("Check document page from document list");
		getMoveTo_Menu_Documents();
		Thread.sleep(6000);
		log("Mousehover to Documents Tab");
		getVerify_CopyandPaste_Document();
		Thread.sleep(6000);
		log("Select Document and do Copy and Paste Document successfully");
		Refresh_Button();
		Thread.sleep(6000);
		log("Click on Refresh button");
		MoveTo_ToDoList_Option();
		Thread.sleep(6000);
		log("Mousehover to ToDoList Tab");
		jsclick(Select_All_Item);
		Thread.sleep(6000);
		log("Click on All Item Option");
		ToDoList_Verify_Indicess_Value();
		log("Custom column is set successfully for ToDoList Functionality");

	}

	public void Reset_Custom_Columns_for_ToDoList() throws InterruptedException {

		log("Test Scenario 28 :Reset Custom Columns for ToDoList ");
		Thread.sleep(6000);
		MoveTo_ToDoList_Option();
		Thread.sleep(6000);
		log("Mousehover to ToDoList Tab");
		jsclick(To_Do_Resetcolumn_Option);
		Thread.sleep(6000);
		log("Click on Reset Column");
		jsclick(Reset_Column_OK_Button);
		log("Click on Ok button");
		log("ToDoList Custom column Reset Successfully");

	}

	// Document Context Menu

	public void Verify_Refresh_Option() throws Exception {

		log("Test Scenario 29  Verifying Refresh Option ");
		try {
			LogDipakUser();
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("User is alreday Logged");
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
		jsclick(Select_Document);
		Thread.sleep(6000);
		log("Check Document from document List");
		getMoveTo_Menu_Documents();
		Thread.sleep(6000);
		log("Mousehover to Documents Tab");
		getSelect_Option_Refresh();
		Thread.sleep(6000);
		log("Click on Refresh button");
		log("Refresh Functionality verified Successfully on Documents");
	}

	public void Verify_Categories_Option() throws Exception {

		log("Test Scenario 30 : Verifying Categories Option ");
		jsclick(Select_Document);
		Thread.sleep(6000);
		log("Check Document from document List");
		getMoveTo_Menu_Documents();
		log("Mousehover to Documents Tab");
		getSelect_Option_Catagories_andSet_Colors();
		log("Select Option Catagories and set Color");
		log("Categories on Documents Functionality verified Successfully");

	}

	public void Verify_copy_and_paste_Option() throws Exception {

		log("Test Scenario 31 :Verifying copy and paste Option ");
		Thread.sleep(6000);
		getMoveTo_Menu_Documents();
		log("Mousehover to Documents Tab");
		getVerify_CopyandPaste_Document();
		Thread.sleep(6000);
		log("Verified Copy and Paste Document successfully");

	}

	public void Verify_cut_and_paste_Option() throws Exception {

		log("Test Scenario 32 :Verifying cut and paste Option ");
		jsclick(Select_Document);
		Thread.sleep(6000);
		log("Check Document from document List");
		getMoveTo_Menu_Documents();
		Thread.sleep(6000);
		log("Mousehover to Documents Tab");
		getVerify_CutandPaste_Document();
		Thread.sleep(6000);
		log("cut and paste Document Functionality verified Successfully");
	}

	public void Verify_Delete_Option() throws Exception {

		log("Test Scenario 33 :Verifying Delete Option");
		getVerify_Delete_Document();
		Thread.sleep(6000);
		log("Document Delete Functionality verified Successfully");
	}

	public void Verify_CreateFavorites_Document() throws Exception {

		log("Test Scenario 34 :Verifying Create Favorites Document");
		Verify_CreateFavorites_Document();
		log("Verified and Create Favorites Document");
		Refresh_Button();
		Thread.sleep(6000);
		log("Click on Refresh button");
		getOpen_CreateFavorites_Document();
		log("CreateFavorites Document Functionality verified Successfully");
	}

	public void Verify_Notification_on_Document() throws Exception {

		log("Test Scenario 35 : Verifying Notification on Document ");
		try {
			LogDipakUser();
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("User is alreday Logged");
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
		jsclick(Select_Document);
		Thread.sleep(6000);
		log("Check Document from document List");
		getMoveTo_Menu_Documents();
		log("Mousehover to Documents Tab");
		getVerify_CopyandPaste_Document();
		Thread.sleep(6000);
		log("Verified Copy and Paste Document successfully");
		jsclick(Select_Document);
		Thread.sleep(6000);
		log("Check Document from document List");
		getMoveTo_Menu_Documents();
		Thread.sleep(6000);
		log("Mousehover to Documents Tab");
		getCreate_Notification_Document();
		Thread.sleep(6000);
		log("Verified and Create Notification on Document");
		jsclick(Click_signature_Menuoption);
		Thread.sleep(6000);
		log("Click on Signature menu option");
		getinputpassword();
		Thread.sleep(6000);
		log("Enter a Password");
		getAdd_Signature_Onpage();
		Thread.sleep(6000);
		log("add signature successfully on page ");
		getSave_Signature_Document();
		Thread.sleep(6000);
		log("Click on save document menu option");
		movingclkElement(closedoc);
		log("Click on Close document Viewer option");
		log("Notification_on_Document Functionality verified Successfully");

	}

	public void Verify_SendTo_Mail() throws Exception {

		log("Test Scenario 36 :Verifying SendTo Mail ");
		try {
			LogDipakUser();
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("User is alreday Logged");
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
		jsclick(Select_Document);
		Thread.sleep(6000);
		log("Check Document from document List");
		getMoveTo_Menu_Documents();
		Thread.sleep(6000);
		log("Mousehover to Documents Tab");
		getSentTo_Mail_asReference();
		Thread.sleep(6000);
		log("SendTo Mail asReference Functionality verified Successfully");
		jsclick(Select_Document);
		Thread.sleep(6000);
		log("Check Document from document List");
		getMoveTo_Menu_Documents();
		Thread.sleep(6000);
		log("Mousehover to Documents Tab");
		getSentTo_Mail_asCopy();
		Thread.sleep(6000);
		log("SendTo Mail asCopy Functionality verified Successfully");
	}

	public void Verify_SendTo_Print() throws Exception {

		log("Test Scenario 37 :Verifying Send To Print");
		getSentTo_Print();
		log("SendTo Print Functionality verified Successfully");

	}

	public void Verify_SendTo_Export() throws Exception {

		log("Test Scenario 38 :Verifying Send To Export ");
		getSentTo_Export();
		log("SendTo Export Functionality verified Successfully");

	}

	public void Verify_SendTo_GenerateDocumentLink() throws Exception {

		log("Test Scenario 39:Verifying Send To Generate DocumentLink ");
		try {
			LogDipakUser();
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("User is alreday Logged");
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
		getSentTo_GenerateDocumentLink();
		Thread.sleep(6000);
		log("Verified and sent Generate Document Link");
		Refresh_Button();
		log("Click on Refresh button");
		log("SendTo GenerateDocumentLink Functionality verified Successfully");
	}

	public void Verify_SendTo_SecureLink() throws Exception {

		log("Test Scenario 40 :Verifying Send To SecureLink ");
		Thread.sleep(6000);
		getMoveTo_Menu_Recent();
		Thread.sleep(6000);
		log("Mousehover to Recent Tab");
		jsclick(Recent_Folder);
		Thread.sleep(6000);
		log("Click on Recent Folder");
		jsclick(Select_Document);
		Thread.sleep(6000);
		log("Check Document from document List");
		getSentTo_SecureLink();
		Thread.sleep(6000);
		log("Verifying and send document to Secure link");
		log("SendTo SecureLink Functionality verified Successfully");

	}

	// Login Validation

	public void Verifying_Login_EWA_with_blank_Username() throws Exception {

		Language pojo = new Language();

		log("Test Scenario 2 : Verifying Login EWA with blank username ");
		pojo.loginwithoutUsername();
		Thread.sleep(2000);
		pojo.getUsernameerror();
	}

	public void Verifying_Login_EWA_with_blank_Password() throws Exception {

		Language pojo = new Language();

		log("Test Scenario 3 : Verifying Login EWA with blank password");
		Thread.sleep(2000);
		pojo.loginwithoutPassword();
		Thread.sleep(2000);
		pojo.getPassworderror();
	}

	public void Verifying_Login_EWA_without_Selecting_Roomname() throws Exception {

		Language pojo = new Language();

		log("Test Scenario 4 : Verifying Login EWA without selecting roomname ");
		Thread.sleep(2000);
		pojo.loginwithoutRoomname();
		Thread.sleep(2000);
		pojo.getRoomerror();
	}

	public void Verifying_Login_EWA_with_Invalid_Username() throws Exception {

		Language pojo = new Language();

		log("Test Scenario 5 : Verifying Login EWA with invalid username ");
		Thread.sleep(2000);
		pojo.InvalidUsername();
		Thread.sleep(4000);
		pojo.getUsernotexist();
		Thread.sleep(2000);
	}

	public void Verifying_Login_EWA_with_Invalid_Password() throws Exception {

		Language pojo = new Language();
		log("Test Scenario 6 : Verifying Login EWA with invalid password ");
		Thread.sleep(2000);
		pojo.InvalidPassword();
		Thread.sleep(4000);
	}

	public void Verifying_No_button_of_Session_for_user_is_already_active_dialog_box() throws Exception {

		log("Test Scenario 1 : Verifying No button of Session for user is already active dialog box ");
		Already_Logged_User();
		Thread.sleep(2000);
		log("Verified No button of Session for user is already active dialog box ");

	}

	public void Verifying_Yes_button_of_Session_for_user_is_already_active_dialog_box() throws Exception {

		log("Test Scenario 7 : Verifying Yes button of Session for user is already active dialog box ");
		Thread.sleep(2000);
		LogDipakUser();
		Thread.sleep(2000);
		log("Verified Yes button of Session for user is already active dialog box ");
		Refresh_Button();
	}
}