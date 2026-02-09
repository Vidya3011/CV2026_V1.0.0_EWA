package Computhink.Script;

import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

import org.testng.annotations.Test;

import Computhink.Pom.FavoritesPom;

 
public class Favorites extends Computhink.Generic.BaseClass {
	public static Actions act;


  @Test(priority = 1)
	public void Login() throws Exception {
		launchUrl();
		LogoutPage();
		LogInAdmin();
		
		Reporter.log("User logged in successfully... ");
		
	}
	



	@Test(priority = 2)

	public static void TC_1_FavoriteInUserLevel() throws Exception {

		FavoritesPom fav = new FavoritesPom();
		fav.FavoriteInUserLevel();
		
	}

	@Test(priority = 3)

	public static void TC_2_FavoriteInSystemLevel() throws Exception {

		FavoritesPom fav = new FavoritesPom();
		fav.FavoriteInSystemLevel();
		Reporter.log("The Favorite System option verified successfully...");
	}

}
