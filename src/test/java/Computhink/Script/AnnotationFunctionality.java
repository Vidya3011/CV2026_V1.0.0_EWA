package Computhink.Script;

import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;
import Computhink.Pom.AdvancedViewer;
import Computhink.Pom.AnnotaionsPom;

public class AnnotationFunctionality extends Computhink.Generic.BaseClass {

	public static Actions act;

	@Test(priority = 1)
	public void Login() throws Exception {

		launchUrl();
		loginRNISHA47();
		Reporter.log("User logged in successfully... ");

	}

	@Test(priority = 2)
	public void TC_A_DefaultView() throws Exception {

		AdvancedViewer ad = new AdvancedViewer();
		ad.DefaultView();

	}

	@Test(priority = 3)
	public void TC_B_Redaction_UnlockRedaction() throws Exception {
		AnnotaionsPom an = new AnnotaionsPom();
		an.RedactionAnnotation();

	}

	@Test(priority = 4)
	public void TC_C_HighLight_Annotation() throws Exception {
		AnnotaionsPom an = new AnnotaionsPom();
		an.HighLighFunction();

	}

	@Test(priority = 5)
	public void TC_E_StikyNote_Annotation() throws Exception {
		AnnotaionsPom an = new AnnotaionsPom();
		an.StickyNoteAnnotation();

		Thread.sleep(3000);
	}

	@Test(priority = 6)
	public void TC_F_RubberStampAnnotation() throws Exception {
		AnnotaionsPom an = new AnnotaionsPom();
		an.RubberStampAnnotation();

	}

	@Test(priority = 7)
	public void TC_G_Rectangle_Annotation() throws Exception {
		AnnotaionsPom an = new AnnotaionsPom();
		an.rectangleAnnotation();

	}

	@Test(priority = 8)
	public void TC_H_StampAnnotation() throws Exception {
		AnnotaionsPom an = new AnnotaionsPom();
		an.StampAnnotation();

	}

	@Test(priority = 9)
	public void TC_I_LineAnnotation_Ellipse_Annotation() throws Exception {
		AnnotaionsPom an = new AnnotaionsPom();
		an.LineAnnotation();

		an.ellipseAnnotation();

	}

	@Test(priority = 10)
	public void TC_J_Signature_Annotation() throws Exception {
		AnnotaionsPom an = new AnnotaionsPom();
		an.signatureAnnotation();

	}

	@Test(priority = 11)
	public void TC_K_Polygon() throws Exception {
		AnnotaionsPom an = new AnnotaionsPom();

		an.PolygonAnnotation();
		an.closeAndReopenThePage();
		Thread.sleep(8000);

		jsclick(Refresh_Button(driver));
		Thread.sleep(5000);
	}

}
