package Computhink.Script;

import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Computhink.Generic.BaseClass;
import Computhink.Pom.RoomContextMenu;

public class RoomContextMenu_Categories extends BaseClass {
	public static Actions act;

	@Test(priority = 1)
	public void Login() throws Exception {

		launchUrl();
		LogInAdmin();

		Reporter.log("User logged in successfully... ");
		
	}

	@Test(priority = 2)
	public void TC_1_CategoriesPrivateFunction() throws Exception {
		RoomContextMenu rm = new RoomContextMenu();
		rm.CategoryPrivate();
		

	}
	

	@Test(priority = 3)
	public void TC_2_CategoriesPublic() throws Exception {
		RoomContextMenu rm = new RoomContextMenu();
		rm.CategoryPublic();
		jsclick(Refresh_Button(driver));
		
	
	}
	
	@Test(priority = 4)
	public void TC_3_ChangeNavigationToID() throws Exception {
		RoomContextMenu rm = new RoomContextMenu();
		rm.ChangeNavigationID();
	
	}

}
