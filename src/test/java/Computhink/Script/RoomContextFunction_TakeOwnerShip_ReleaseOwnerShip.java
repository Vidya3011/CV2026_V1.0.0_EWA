package Computhink.Script;

import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Computhink.Pom.RoomContextMenu;


//NishaR codes
public class
RoomContextFunction_TakeOwnerShip_ReleaseOwnerShip extends Computhink.Generic.BaseClass {
	public static Actions act;


	@Test(priority = 1)
	public void Login() throws Exception {

		launchUrl();
		LogInAdmin();

		Reporter.log("User logged in successfully... ");
		
	}

	//@Test(priority = 2)
	public void TC_01_ChangeNavigation() throws Exception {
		RoomContextMenu rm = new RoomContextMenu();
		rm.ChangeNavigation();
	
	}

//	@Test(priority = 3)
	public void TC_02_Checking_Cabinet_SecurityPermission() throws Exception {

		RoomContextMenu rm = new RoomContextMenu();
		rm.GrantSuperivorPermission();


	}

	@Test(priority = 4)
	public void TC_03_TakeOwnerShip() throws Exception {
		RoomContextMenu rm = new RoomContextMenu();
		rm.TakeOwnerShip();
		
	}

	@Test(priority = 5)
	public void TC_04_ReleaseOwnerShip() throws Exception {
		RoomContextMenu rm = new RoomContextMenu();
		rm.ReleaseOwnerShip();
		Thread.sleep(3000);

		LogoutPage();																																											// }

	}
}
