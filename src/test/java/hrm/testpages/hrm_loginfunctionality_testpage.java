package hrm.testpages;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import hrm.commonUtils.Screenshot;
import hrm.locators.Gettitle;
import hrm.locators.loginpage;
import hrm_Baseclass.baseclass;

public class hrm_loginfunctionality_testpage extends baseclass {
	@Test(priority = 0)
	public void Vlaidate_Printer_Settings() {

		System.out.println("Welcome to R-Testing Tools, Manual & Automation");

	}
	@Test(priority = 1)
	public void Vlaidate_HomePageTiltes() {
		Gettitle.Validate_GetCurrentURl();
		Gettitle.Validate_Gettile();
	}
	@Test(priority = 2)
	public void Vlaidate_HomaPage_image() throws InterruptedException {
		loginpage.Validate_Image();

	}
	@Test(priority = 3)
	public void Vlaidate_HomaPage_text() throws InterruptedException {
		String actual =loginpage.Validate_Homepage_text();
		String expec = "Login\n"+"Username : Admin\n"+"Password : admin123\n"+"Username\n"+"Password\n"+
		"Login\n"+"Forgot your password?\n"+"\n"+"OrangeHRM OS 5.2\n"+"© 2005 - 2023 OrangeHRM, Inc. All rights reserved.";
		Assert.assertEquals(actual, expec);
	}
	@Test(priority = 4)
	public void Vlaidate_Sendkeys() throws InterruptedException {
		loginpage.Validate_loginclick_text();
		loginpage.Validate_errormessage_text();
		loginpage.Validate_usernames(prop.getProperty("empty"));
		loginpage.Validate_passwords(prop.getProperty("empties"));
		String actual = loginpage.Validate_loginclick_text();
		String expec = "Login";
		Assert.assertEquals(actual, expec);
	}
	@Test(priority = 5)
	public void Validate_ErrorMessage() {
		Assert.assertEquals(loginpage.Validate_errorText(), "Invalid credentials");
	}
	@Test(priority = 6)
	public void Vlaidate_InvalidSendkeys() throws InterruptedException {
		loginpage.Validate_usernames(prop.getProperty("user"));
		loginpage.Validate_passwords(prop.getProperty("pass"));
		String actual = loginpage.Validate_loginclick_text();
		String expec = "Login";
		Assert.assertEquals(actual, expec);
		Assert.assertEquals(loginpage.Validate_errorText(), "Invalid credentials"); 
	}
	@Test(priority = 7)
	public void Vlaidate_validSendkeys() throws InterruptedException {
		loginpage.Validate_usernames(prop.getProperty("users"));
		loginpage.Validate_passwords(prop.getProperty("passs"));
		String actual = loginpage.Validate_loginclick_text();
		String expec = "Login";
		Assert.assertEquals(actual, expec);
	}
	@AfterMethod
	public void takeScreenShot(ITestResult result) {
		Screenshot.ScreenshotTCF(result);
	}
	@BeforeClass
	public void Windowopen() {
		instalization();
	}
	@AfterClass
	public void Windowclose() {
		Teardown();
	}
}
