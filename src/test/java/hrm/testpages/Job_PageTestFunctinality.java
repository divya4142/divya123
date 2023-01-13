package hrm.testpages;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import hrm.commonUtils.Screenshot;
import hrm.locators.AdminPageFunctionality;
import hrm.locators.JobpageFunctionality;
import hrm.locators.loginpage;
import hrm_Baseclass.baseclass;

public class Job_PageTestFunctinality extends baseclass{

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
		String actual = AdminPageFunctionality.Validate_AdminpageText();
		String expected = "Admin\n"+"PIM\n"+"Leave\n"+"Time\n"+"Recruitment\n"+"My Info\n"+"Performance\n"
				+"Dashboard\n"+"Directory\n"+"Maintenance\n"+"Buzz";
		Assert.assertEquals(actual, expected);
		Assert.assertEquals(AdminPageFunctionality.Validate_Adminclick_Text(), "Admin");
	}
	@Test(priority = 3)
	public void Vlaidate_JobPageclick() throws InterruptedException {
		Assert.assertEquals(JobpageFunctionality.Validate_jobclick_Text(),"Job");
		Assert.assertEquals(JobpageFunctionality.Validate_jobTitleclick_Text(),"Job Titles");
	}
	@Test(priority = 4)
	public void Vlaidate_JobPageTwoclick() throws InterruptedException {
		Assert.assertEquals(JobpageFunctionality.Validate_jobclick_Text(),"Job");
		Assert.assertEquals(JobpageFunctionality.Validate_Pgradsclick_Text(),"Pay Grades");
		Assert.assertEquals(JobpageFunctionality.Validate_jobclick_Text(),"Job");
		Assert.assertEquals(JobpageFunctionality.Validate_Estatusclick_Text(),"Employment Status");
	}
	@Test(priority = 5)
	public void Vlaidate_JobPagethreeclick() throws InterruptedException {
		Assert.assertEquals(JobpageFunctionality.Validate_jobclick_Text(),"Job");
		Assert.assertEquals(JobpageFunctionality.Validate_Jobcategoriusclick_Text(),"Job Categories");
		Assert.assertEquals(JobpageFunctionality.Validate_jobclick_Text(),"Job");
		Assert.assertEquals(JobpageFunctionality.Validate_Workclick_Text(),"Work Shifts");
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
