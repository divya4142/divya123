package hrm.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import hrm.commonUtils.pagescrolling;
import hrm.commonUtils.waits;
import hrm_Baseclass.baseclass;

public class AdminPageFunctionality extends baseclass{
	static By AdminpageText = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul");
	static By Adminclick = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a");
	static By systemUsers = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]");
	static By username = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input");
	static By role = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[1]");
	static By admin = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[1]");
	static By Ename = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/input");
	static By pual = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/input");
	static By status = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div/div[1]");
	static By statusname = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div/div[1]");
	static By search = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]");
	static By reset = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[1]");

//	AdminpageText
	public static String Validate_AdminpageText() throws InterruptedException {
		pagescrolling.pageDown_one();
		waits.waitForVisiblityofallelements(AdminpageText);
		WebElement element = driver.findElement(AdminpageText);
		String text = element.getText();
		System.out.println(text);
		Thread.sleep(3000);
		return text;
	}
//	AdminCLick
	public static String Validate_Adminclick_Text() throws InterruptedException {
		waits.waitForPresenceLocator(Adminclick);
		WebElement element = driver.findElement(Adminclick);
		String text = element.getText();
		System.out.println(text);
		element.click();
		Thread.sleep(3000);
		return text;
	}
//	systemUsers
	public static String Validate_systemUsers_Text() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(systemUsers));
		WebElement element = driver.findElement(systemUsers);
		String text = element.getText();
		System.out.println(text);
		Thread.sleep(3000);
		return text;
	}
//	username
	public static void Validate_username_Text(String user) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(username));
		WebElement element = driver.findElement(username);
		boolean b = element.isDisplayed();
		if(b) {
			element.sendKeys(user);
	     	System.out.println("The sendkeys passed");
		}
		else {
			System.out.println("Not passed");
		}
		Thread.sleep(3000);
	}
//	user role
	public static void Validate_userrole_Text() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(role));
		WebElement element = driver.findElement(role);
		element.click();
		Thread.sleep(3000);
	}
//	admin click
	public static void Validate_UsaerRoleAdminClick() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(admin));
		WebElement element = driver.findElement(admin);
		element.click();
		Thread.sleep(3000);
	}
//	Employee name
	public static void Validate_Ename_Click(String en) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Ename));
		WebElement element = driver.findElement(Ename);
		boolean b = element.isDisplayed();
		if(b) {
	     	element.click();
	     	element.sendKeys(en);
	     	System.out.println("The sendkeys passed");
		}
		else {
			System.out.println("Not passed");
		}
		Thread.sleep(3000);
	}
//	pual
	public static void Validate_Paul_Click() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(pual));
		WebElement element = driver.findElement(pual);
		element.click();
		Thread.sleep(3000);
	}
//	status
	public static void Validate_status_Click() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(status));
		WebElement element = driver.findElement(status);
		element.click();
		Thread.sleep(3000);
	}
//	statusname
	public static void Validate_statusname_Click() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(statusname));
		WebElement element = driver.findElement(statusname);
		element.click();
		Thread.sleep(3000);
	}
//	search
	public static String Validate_searchclick_Text() {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(search));
		WebElement element = driver.findElement(search);
		String text = element.getText();
		System.out.println(text);
		element.click();
		return text;
	}
//	reset
	public static String Validate_resetclick_Text() {
		waits.waitForElement_Clickable(reset);
		WebElement element = driver.findElement(reset);
		String text = element.getText();
		System.out.println(text);
		element.click();
		return text;
	}
}
