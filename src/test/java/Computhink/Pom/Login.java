package Computhink.Pom;

//Dipak Automation Coading

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import Computhink.Generic.BaseClass;

public class Login extends BaseClass {

	// public static WebElement element = null;
	// private static final boolean False = false;

	public Login() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//*[@id=\"logedinusername\"]")
	private WebElement Username;

	@FindBy(xpath = "//*[@id=\"idSidenav\"]/ul/li[1]/a")
	private WebElement Logout;

	@FindBy(xpath = "//div[@class='nameValidation']")
	private WebElement Usernameerror;

	@FindBy(xpath = "//div[@class='passwordValidation']")
	private WebElement Passworderror;

	@FindBy(xpath = "//*[@id=\"loginError\"]")
	private WebElement error;

	@FindBy(xpath = "//*[@id=\"cvModelLoginValidationMessage\"]")
	private WebElement SessionActive;

	@FindBy(xpath = "//*[@id=\"cvModelLoginValidationCancel\"]")
	private WebElement sessionNOButton;

	@FindBy(xpath = "//*[@id=\"userName\"]")
	private WebElement UsernameTextbox;

	@FindBy(xpath = "//*[@id=\"loginPassword\"]")
	private WebElement PasswordTextbox;

	@FindBy(xpath = "//span[@id='ForgotpasswordClose']")
	private WebElement ForgotPassCancel;

	SoftAssert softAssert = new SoftAssert(); // Initialize SoftAssert to capture all assertions

	public static void loginwithoutUsername() throws Exception {

		Reporter.log("Do not entered username into username field", true);
		Thread.sleep(2000);
		driver.findElement(By.id("loginPassword")).sendKeys(ExcelLogin(1, 1));
		Reporter.log("Enter valid Password into Password field", true);
		Thread.sleep(1000);
		RoomSelectionCVS();
		Thread.sleep(1000);
		try {
			Thread.sleep(2000);
			WebElement Captch = driver.findElement(By.xpath("//*[@id=\"image\"]"));
			WebElement enterCaptch = driver.findElement(By.xpath("//*[@id=\"captchaInput\"]"));
			enterCaptch.sendKeys(Captch.getText());
			Reporter.log("Enter a valid captch under textbox", true);
		} catch (Exception e) {
			// captch is not displayed
		}
		driver.findElement(By.id("submitid")).click();
		Reporter.log("Click on the Login button", true);
		Thread.sleep(1000);
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.alertIsPresent());
			acceptAlert();
		} catch (Exception e) {
			// Database alert is not present
		}
	}

	public static void loginwithoutPassword() throws Exception {

		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(ExcelLogin(1, 0));
		Reporter.log("Enter valid Username into Username field", true);
		driver.findElement(By.id("loginPassword")).clear();
		Thread.sleep(1000);
		Reporter.log("Do not entered password into password field", true);
		Thread.sleep(1000);
		RoomSelectionCVS();
		Thread.sleep(1000);
		try {
			Thread.sleep(2000);
			WebElement Captch = driver.findElement(By.xpath("//*[@id=\"image\"]"));
			WebElement enterCaptch = driver.findElement(By.xpath("//*[@id=\"captchaInput\"]"));
			enterCaptch.sendKeys(Captch.getText());
			Reporter.log("Enter a valid captch under textbox", true);
		} catch (Exception e) {
			// captch is not displayed
		}
		driver.findElement(By.id("submitid")).click();
		Reporter.log("Click on the Login button", true);
		Thread.sleep(1000);
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.alertIsPresent());
			acceptAlert();
		} catch (Exception e) {
			// Database alert is not present
		}
	}

	public void loginwithoutRoomname() throws Exception {

		SoftAssert as = new SoftAssert();
		driver.findElement(By.xpath("//input[@id='userName']")).clear();
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(ExcelLogin(1, 0));
		Reporter.log("Enter valid Username into Username field", true);
		Thread.sleep(1000);
		driver.findElement(By.id("loginPassword")).sendKeys(ExcelLogin(1, 1));
		Reporter.log("Enter valid Password into Password field", true);
		WebElement room = driver.findElement(By.xpath("//select[@id='rooms']"));
		as.assertTrue(room.isDisplayed(), "Room selection dropdown is not displayed.");
		Select sel = new Select(room);
		sel.selectByIndex(0);
		Reporter.log("Not select Room", true);
		Thread.sleep(1000);
		// Validate that the room has been selected correctly
		String selectedRoom = sel.getFirstSelectedOption().getText();
		Reporter.log("Selected Room name: " + selectedRoom, true);
		as.assertEquals(selectedRoom, "Room selection is not correct."); // Assuming "Room 3" is the option
		Thread.sleep(1000);

		try {
			Thread.sleep(2000);
			WebElement Captch = driver.findElement(By.xpath("//*[@id=\"image\"]"));
			WebElement enterCaptch = driver.findElement(By.xpath("//*[@id=\"captchaInput\"]"));
			enterCaptch.sendKeys(Captch.getText());
			Reporter.log("Enter a valid captch under textbox", true);
		} catch (Exception e) {
			// captch is not displayed
		}
		driver.findElement(By.id("submitid")).click();
		Reporter.log("Click on the Login button", true);
		Thread.sleep(1000);
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.alertIsPresent());
			acceptAlert();
		} catch (Exception e) {
			// Database alert is not present
		}
	}

	public void InvalidUsername() throws Exception {

		driver.findElement(By.xpath("//input[@id='userName']")).clear();
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(ExcelLogin(2, 1));
		Reporter.log("Enter Invalid Username into Username field", true);
		driver.findElement(By.id("loginPassword")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("loginPassword")).sendKeys(ExcelLogin(1, 1));
		Reporter.log("Enter valid Password into Password field", true);
		Thread.sleep(2000);
		RoomSelectionCVS();
		try {
			Thread.sleep(2000);
			WebElement Captch = driver.findElement(By.xpath("//*[@id=\"image\"]"));
			WebElement enterCaptch = driver.findElement(By.xpath("//*[@id=\"captchaInput\"]"));
			enterCaptch.sendKeys(Captch.getText());
			Reporter.log("Enter a valid captch under textbox", true);
		} catch (Exception e) {
			// captch is not displayed
		}
		driver.findElement(By.id("submitid")).click();
		Reporter.log("Click on the Login button", true);
		Thread.sleep(3000);

		try {
			WebElement sessionmsg = driver.findElement(By.xpath("//*[@id=\"cvModelLoginValidationMessageMulti\"]"));
			WebElement sessionmsgNO = driver.findElement(By.xpath("//*[@id=\"cvModelLoginValidationCancelMulti\"]"));
			if (sessionmsg.isDisplayed()) {
				Reporter.log("Session is already active in same browser. \r\n" + " Do you want to create new session?");
				jsclick(sessionmsgNO); // Click the No button
			}
		} catch (Exception e1) {
			// Session message is not displayed
		}
	}

	public void InvalidPassword() throws Exception {

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='userName']")).clear();
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(ExcelLogin(1, 0));
		Reporter.log("Enter valid Username into Username field", true);
		driver.findElement(By.id("loginPassword")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("loginPassword")).sendKeys(ExcelLogin(2, 1));
		Reporter.log("Enter Invalid Password into Password field", true);
		Thread.sleep(2000);
		RoomSelectionCVS();
		try {
			Thread.sleep(2000);
			WebElement Captch = driver.findElement(By.xpath("//*[@id=\"image\"]"));
			WebElement enterCaptch = driver.findElement(By.xpath("//*[@id=\"captchaInput\"]"));
			enterCaptch.sendKeys(Captch.getText());
			Reporter.log("Enter a valid captch under textbox", true);
		} catch (Exception e) {
			// captch is not displayed
		}
		driver.findElement(By.id("submitid")).click();
		Reporter.log("Click on the Login button", true);
		Thread.sleep(1000);
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.alertIsPresent());
			acceptAlert();
		} catch (Exception e) {
			// Database alert is not present
		}
		try {
			WebElement sessionmsg = driver.findElement(By.xpath("//*[@id=\"cvModelLoginValidationMessage\"]"));
			WebElement sessionmsgNO = driver.findElement(By.xpath("//*[@id=\"cvModelLoginValidationCancel\"]"));
			if (sessionmsg.isDisplayed()) {
				Reporter.log("Session for Dipak  is already active.Do you want to create new session?");
				jsclick(sessionmsgNO); // Click the No button
			}
		} catch (Exception e1) {
			// Session message is not displayed
		}
	}

	public void getUsernameerror() {

		String expectedtext = "Please enter username";
		String actualtext = Usernameerror.getText();
		softAssert.assertEquals(actualtext, expectedtext);
		Reporter.log(Usernameerror.getText() + " validation message should show", true);

	}

	public void getPassworderror() {

		String expectedtext = "Please enter password";
		String actualtext = Passworderror.getText();
		softAssert.assertEquals(actualtext, expectedtext);
		Reporter.log(Passworderror.getText() + " validation message should show", true);

	}

	public void getRoomerror() {

		String expectedtext = "Select a room";
		String actualtext = error.getText();
		softAssert.assertEquals(actualtext, expectedtext);
		Reporter.log(error.getText() + "validation message should show when none of above room selected for Login",
				true);

	}

	public void getUsernotexist() {

		String expectedtext = "Session is already active in same browser. \r\n" + " Do you want to create new session?";
		String actualtext = SessionActive.getText();
		softAssert.assertEquals(actualtext, expectedtext);
		Reporter.log(SessionActive.getText() + " this validation message should show", true);

	}

	// Login Validation

	public void Verifying_Login_EWA_with_blank_Username() throws Exception {

		Login pojo = new Login();

		Reporter.log("Test Scenario 2 : Verifying Login EWA with blank username ", true);
		Login.loginwithoutUsername();
		pojo.getUsernameerror();
	}

	public void Verifying_Login_EWA_with_blank_Password() throws Exception {

		Login pojo = new Login();

		Reporter.log("Test Scenario 3 : Verifying Login EWA with blank password", true);
		Thread.sleep(2000);
		Login.loginwithoutPassword();
		pojo.getPassworderror();
	}

	public void Verifying_Login_EWA_without_Selecting_Roomname() throws Exception {

		Login pojo = new Login();

		Reporter.log("Test Scenario 4 : Verifying Login EWA without selecting roomname ", true);
		Thread.sleep(2000);
		pojo.loginwithoutRoomname();
		pojo.getRoomerror();
	}

	public void Verifying_Login_EWA_with_Invalid_Username() throws Exception {

		Login pojo = new Login();

		Reporter.log("Test Scenario 5 : Verifying Login EWA with invalid username ", true);
		Thread.sleep(2000);
		pojo.InvalidUsername();

	}

	public void Verifying_Login_EWA_with_Invalid_Password() throws Exception {

		Login pojo = new Login();
		Reporter.log("Test Scenario 6 : Verifying Login EWA with invalid password ", true);
		Thread.sleep(2000);
		pojo.InvalidPassword();
		pojo.getUsernotexist();
		Thread.sleep(2000);
		jsclick(sessionNOButton);
	}

	public void Verifying_No_button_of_Session_for_user_is_already_active_dialog_box() throws Exception {

		Reporter.log("Test Scenario 1 : Verifying No button of Session for user is already active dialog box ", true);
		Already_Logged_User();
		Thread.sleep(3000);
		Reporter.log("Verified No button of Session for user is already active dialog box ", true);

	}

	public void Verifying_Yes_button_of_Session_for_user_is_already_active_dialog_box() throws Exception {

		Reporter.log("Test Scenario 7 : Verifying Yes button of Session for user is already active dialog box ", true);
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		launchUrl();
		Thread.sleep(1000);
		LogDipakUser();
		Reporter.log("Verified Yes button of Session for user is already active dialog box ", true);

	}

	public void Verifying_Browser_Allowing_Only_OneUser_Login() throws Exception {

		Reporter.log("Test Scenario 10 : Verifying Browser Allowing Only OneUser Login ", true);

		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		launchUrl();
		Thread.sleep(1000);
		LoginAdminUser();
		Reporter.log("Verified If User Session is active but we Closed Browser then it should "
				+ "allowing to Login to EWA for Any User without Showing Login validation", true);
		// Validate If User is active in Browser try To Login Deferenet User in Same
		// Browser

	}

	// 8. Contentverse URL Validation

	public void ContentVerse_URLAndTitleAssertValidation() throws Exception {
		
		// Get the current URL
		String currentUrl = driver.getCurrentUrl();

		// Initialize SoftAssert object
		SoftAssert as = new SoftAssert();

		// Log and print the launched URL
		Reporter.log("Launched Contentverse URL Details : " + currentUrl, true);

		// Check if the URL contains the expected path
		if (currentUrl.contains("8080/CVWeb/cvLgn")) {
			// Use regex to check if the URL starts with the expected base URL (IP address
			// check)
			boolean isValidUrl = currentUrl.matches("http://10.4.10\\.\\d{1,3}:8080/CVWeb/cvLgn");

			// Assert that the URL matches the pattern
			as.assertTrue(isValidUrl,
					"The URL is not valid. Expected a URL starting with http://10.4.10.x:8080/CVWeb/cvLgn");
		} else {
			// If URL does not contain the expected path, log a failure (optional)
			Reporter.log("Invalid URL path: " + currentUrl);
			System.out.println("Invalid URL path: " + currentUrl);
		}

		// Perform soft assert verification
		as.assertAll();

		// Validate the page title
		
		String title = driver.getTitle();
		if (title.contains("Contentverse")) {
			// Assert the title is exactly as expected
			as.assertEquals(title, "Contentverse", "Page title is not as expected.");
			System.out.println("Page title name is : " + title);
			Reporter.log("Page title name is : " + title);
		} else {
			System.out.println("Page Not launched Successfully: Expected title not found.");
			Reporter.log("Page Not launched Successfully: Expected title not found.");
		}

		// Validate Computhink Logo

		try {
			WebElement logo = driver.findElement(By.xpath("//img[@src='images/computhink_logo.png']"));
			if (logo.isDisplayed()) {
				System.out.println("Computhink Logo is present on the Page.");
			} else {
				System.out.println("Computhink logo element found on the page but not Visible.");
			}
		} catch (Exception e) {
			System.out.println("computhink Logo is not present on the page");
		}

		// Validate Contenverse logo

		try {
			WebElement logo = driver.findElement(By.xpath("//img[@alt='Computhink']"));
			if (logo.isDisplayed()) {
				System.out.println("Contentverse Logo is present on the Page.");
			} else {
				System.out.println("Contentverse logo element found on the page but not Visible.");
			}
		} catch (Exception e) {
			System.out.println("Contentverse Logo is not present on the page");
		}
	}

		// Validate Password

		// Step 1: Ensure password is initially hidden
		
		// Locate the password input field and eye icon
		
		public void ContentVerse_eyeIconValidation() throws Exception {
		

		WebElement passwordField = driver.findElement(By.id("loginPassword"));
		WebElement eyeIcon = driver.findElement(By.xpath("//i[@id='toggleLoginPassword']"));

		String initialType = passwordField.getAttribute("type");
		System.out.println("Initial type: " + initialType);

		if (initialType.equals("password")) {
			System.out.println("Password is initially hidden � OK");
		} else {
			System.out.println("FAIL: Password should be hidden initially.");
		}

		// Step 2: Click the eye icon to toggle visibility

		passwordField.sendKeys("syntax@10");
		Thread.sleep(2000);
		eyeIcon.click();
		Thread.sleep(2000);

		// Step 3: Validate password is now visible
		Thread.sleep(2000);
		String newType = passwordField.getAttribute("type");
		System.out.println("After clicking eye icon, type: " + newType);

		if (newType.equals("text")) {
			System.out.println("Password is now visible � Toggle works.");
		} else {
			System.out.println("FAIL: Password did not become visible.");
		}

		// Step 4 (Optional): Click again to hide password
		Thread.sleep(3000);
		eyeIcon.click();
		String finalType = passwordField.getAttribute("type");
		System.out.println("After clicking again, type: " + finalType);

		if (finalType.equals("password")) {
			System.out.println("Password visibility toggle works in both directions.");
		} else {
			System.out.println("FAIL: Password did not toggle back to hidden.");
		}
		
				
		// Validate Links on Login page

		// 1. Xpath of all avavailble links

		WebElement ForgotpasswordLink = driver.findElement(By.xpath("//button[@id='forgotPassword']"));

		WebElement EULALink = driver.findElement(By.xpath("//a[normalize-space()='|EULA|']"));

		if (ForgotpasswordLink.isDisplayed() && ForgotpasswordLink.isEnabled()) {
			System.out.println("Link is visible and enabled");
			ForgotpasswordLink.click();
			Thread.sleep(2000);
			ForgotPassCancel.click();
		} else {
			System.out.println("Forgot password Link is either hiden or disabled");
		}

		if (EULALink.isDisplayed() && EULALink.isEnabled()) {
			Thread.sleep(6000);
			System.out.println("EULA Contentverse website Link is visible and enabled");
			EULALink.click();
			Thread.sleep(5000);
			String title1 = driver.getTitle();
			System.out.println("The Page title is : " + title1);
		} else {
			System.out.println("Forgot password Link is either hiden or disabled");
		}
	}

	// Switch to Tab

	// Verify CvWebsite

	public void ContentVerse_URLValidation() throws Exception {

		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());

		driver.switchTo().window(tabs.get(0));
		launchUrl();

		WebElement CVWebsite = driver.findElement(By.xpath("//a[normalize-space()='contentverse.com']"));

		// Url Launch

		if (CVWebsite.isDisplayed() && CVWebsite.isEnabled()) {
			Thread.sleep(2000);
			System.out.println("Contentverse website Link is visible and enabled");
			CVWebsite.click();
			Thread.sleep(5000);
			String title = driver.getTitle();
			System.out.println("The Page title is : " + title);
		} else {
			System.out.println("Contentverse website Link is either hiden or disabled");
		}

		driver.switchTo().window(tabs.get(0));
		launchUrl();
	}
}
