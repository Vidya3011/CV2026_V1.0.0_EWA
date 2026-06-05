package Computhink.Script;

import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Computhink.Generic.BaseClass;
import Computhink.Pom.RoomContextMenu;

 public class RoomContextMenu_CopyPaste extends BaseClass {
	
	 
	public static Actions act;

	@Test(priority = 1)
	public void Login() throws Exception {
		launchUrl();
		LogInAdmin();

		Reporter.log("User logged in successfully... ");
		
	}
	@Test(priority = 3)

	public void RoomContextMenu_CopyAndPasteDrawerLevel() throws Exception {
		RoomContextMenu rm = new RoomContextMenu();
		rm.CopyAndPasteDrawer();
		
		LogoutPage();
	}
	
}
