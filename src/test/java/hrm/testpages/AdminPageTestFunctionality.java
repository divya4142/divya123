package hrm.testpages;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import hrm.commonUtils.Screenshot;
import hrm.locators.AdminPageFunctionality;
import hrm.locators.loginpage;
import hrm_Baseclass.baseclass;

public class AdminPageTestFunctionality extends baseclass {

	@Test(priority = 0)
	public void Vlaidate_Printer_Settings() {

		System.out.println("Welcome to R-Testing Tools, Manual & Automation");
	}
	@Test(priority = 1)
	public void Vlaidate_validSendkeys() throws InterruptedException {
		loginpage.Validate_usernames(prop.getProperty("users"));
		loginpage.Validate_passwords(prop.getProperty("passs"));
		String actual = loginpage.Validate_loginclick_text();
		String expec = "Login";
		Assert.assertEquals(actual, expec);
	}
	@Test(priority = 2)
	public void Vlaidate_AdminPage() throws InterruptedException {
		AdminPageFunctionality.Validate_AdminpageText();
		AdminPageFunctionality.Validate_Adminclick_Text();
	}
	@Test(priority = 3)
	public void Vlaidate_SystemUserpage() throws InterruptedException {
		AdminPageFunctionality.Validate_systemUsers_Text();
		AdminPageFunctionality.Validate_username_Text(prop.getProperty("admin"));
		AdminPageFunctionality.Validate_userrole_Text();
	}
	@Test(priority = 4)
	public void Vlaidate_SystemUserpage_One() throws InterruptedException {
		AdminPageFunctionality.Validate_UsaerRoleAdminClick();
		AdminPageFunctionality.Validate_Ename_Click(prop.getProperty("paul"));
		AdminPageFunctionality.Validate_Paul_Click();

	}
	@Test(priority = 5)
	public void Vlaidate_SystemUserpage_two() throws InterruptedException {
		AdminPageFunctionality.Validate_status_Click();
		AdminPageFunctionality.Validate_statusname_Click();
		AdminPageFunctionality.Validate_searchclick_Text();
		AdminPageFunctionality.Validate_resetclick_Text();
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
