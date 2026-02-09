package Computhink.Script;

import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Computhink.Generic.BaseClass;
import Computhink.Pom.RoomContextMenu;

public class RMC_Custom_Document_Types  extends BaseClass {
	public static Actions act;

	@Test(priority = 1)
	public void Login() throws Exception {

		launchUrl();
		LogInAdmin();

		Reporter.log("User logged in successfully... ");
		
	}
	
	@Test(priority = 2)
	public void TC_1_CustomDocumentTypes() throws Exception {
		RoomContextMenu rm = new RoomContextMenu();
		rm.CustomDocTypes();
		

	}

}
