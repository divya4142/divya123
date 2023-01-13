package hrm.testpages;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import hrm.commonUtils.Screenshot;
import hrm.locators.AdminPageFunctionality;
import hrm.locators.QualificationFunctionality;
import hrm.locators.loginpage;
import hrm_Baseclass.baseclass;

public class Membership_TestFunctionality3 extends baseclass{
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
	public void Validate_qualification() throws InterruptedException {
		Assert.assertEquals(QualificationFunctionality.Validate_qualification_Text(),"Qualifications");
		Assert.assertEquals(QualificationFunctionality.Validate_skills_Text(),"Skills");
		Assert.assertEquals(QualificationFunctionality.Validate_qualification_Text(),"Qualifications");
	}
	@Test(priority = 4)
	public void Validate_qualification_One() throws InterruptedException {
		Assert.assertEquals(QualificationFunctionality.Validate_education_Text(),"Education");
		Assert.assertEquals(QualificationFunctionality.Validate_qualification_Text(),"Qualifications");
		Assert.assertEquals(QualificationFunctionality.Validate_licenses_Text(),"Licenses");
		Assert.assertEquals(QualificationFunctionality.Validate_qualification_Text(),"Qualifications");
	}
	@Test(priority = 5)
	public void Validate_qualification_Two() throws InterruptedException {
		Assert.assertEquals(QualificationFunctionality.Validate_languages_Text(),"Languages");
		Assert.assertEquals(QualificationFunctionality.Validate_qualification_Text(),"Qualifications");
		Assert.assertEquals(QualificationFunctionality.Validate_memberships_Text(),"Memberships");
		Assert.assertEquals(QualificationFunctionality.Validate_qualification_Text(),"Qualifications");
	}
	@Test(priority = 6)
	public void Validate_qualification_Sendkeys() throws InterruptedException {
		Assert.assertEquals(QualificationFunctionality.Validate_memberships_Text(),"Memberships");
		QualificationFunctionality.Validate_addclick_Text();
		QualificationFunctionality.Validate_addskillstext_Text();
		QualificationFunctionality.Validate_NameField(prop.getProperty("skills"));
		Assert.assertEquals(QualificationFunctionality.Validate_Ecancel_Text(), "Cancel");
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
