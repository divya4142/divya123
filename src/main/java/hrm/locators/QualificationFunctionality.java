package hrm.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import hrm.commonUtils.waits;
import hrm_Baseclass.baseclass;

public class QualificationFunctionality extends baseclass{

	
	static By qualification = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[4]/span");
	static By skills = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[4]/ul/li[1]/a");
	static By addclick = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[1]/div/button");
	static By addskillstext = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div");
	static By name = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input");
	static By description = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea");
	static By save = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]");
	static By cancel = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[1]");
	static By education = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[4]/ul/li[2]/a");
	static By licenses = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[4]/ul/li[3]/a");
	static By languages = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[4]/ul/li[4]/a");
	static By memberships = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[4]/ul/li[5]/a");
	static By Ecancel = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[1]");
//    static By Addcancel = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[1]")
	
	
	//	qualification
	public static String Validate_qualification_Text() throws InterruptedException {
		waits.waitForElement_Clickable(qualification);
		WebElement element = driver.findElement(qualification);
		String text = element.getText();
		System.out.println(text);
		element.click();
		Thread.sleep(3000);
		return text;
	}
//	skills
	public static String Validate_skills_Text() throws InterruptedException {
		waits.waitForElement_Clickable(skills);
		WebElement element = driver.findElement(skills);
		String text = element.getText();
		System.out.println(text);
		element.click();
		Thread.sleep(3000);
		return text;
	}
//	addskills
	public static String Validate_addclick_Text() throws InterruptedException {
		waits.waitForElement_Clickable(addclick);
		WebElement element = driver.findElement(addclick);
		String text = element.getText();
		System.out.println(text);
		element.click();
		Thread.sleep(3000);
		return text;
	}
//	addskillstext
	public static String Validate_addskillstext_Text() throws InterruptedException {
		waits.waitForElement_Clickable(addskillstext);
		WebElement element = driver.findElement(addskillstext);
		String text = element.getText();
		System.out.println(text);
//		element.click();
		Thread.sleep(3000);
		return text;
	}
//	name
	public static void Validate_NameField(String an) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(name));
		WebElement element = driver.findElement(name);
		boolean b = element.isDisplayed();
		if(b) {
	     	System.out.println("The sendkeys passed");
		}
		else {
			System.out.println("Not passed");
		}
		element.click();
     	element.sendKeys(an);
		Thread.sleep(3000);
	}
//	description
	public static void Validate_description(String en) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(description));
		WebElement element = driver.findElement(description);
		boolean b = element.isDisplayed();
		if(b) {
	     	System.out.println("The sendkeys passed");
		}
		else {
			System.out.println("Not passed");
		}
		element.click();
     	element.sendKeys(en);
		Thread.sleep(3000);
	}
//	save
	public static String Validate_save_Text() throws InterruptedException {
		waits.waitForElement_Clickable(save);
		WebElement element = driver.findElement(save);
		String text = element.getText();
		System.out.println(text);
		element.click();
		Thread.sleep(3000);
		return text;
	}
//	cancel
	public static String Validate_cancel_Text() throws InterruptedException {
		waits.waitForElement_Clickable(cancel);
		WebElement element = driver.findElement(cancel);
		String text = element.getText();
		System.out.println(text);
		element.click();
		Thread.sleep(3000);
		return text;
	}
//	education
	public static String Validate_education_Text() throws InterruptedException {
		waits.waitForElement_Clickable(education);
		WebElement element = driver.findElement(education);
		String text = element.getText();
		System.out.println(text);
		element.click();
		Thread.sleep(3000);
		return text;
	}
//	licenses
	public static String Validate_licenses_Text() throws InterruptedException {
		waits.waitForElement_Clickable(licenses);
		WebElement element = driver.findElement(licenses);
		String text = element.getText();
		System.out.println(text);
		element.click();
		Thread.sleep(3000);
		return text;
	}
//	languages
	public static String Validate_languages_Text() throws InterruptedException {
		waits.waitForElement_Clickable(languages);
		WebElement element = driver.findElement(languages);
		String text = element.getText();
		System.out.println(text);
		element.click();
		Thread.sleep(3000);
		return text;
	}
//	memberships
	public static String Validate_memberships_Text() throws InterruptedException {
		waits.waitForElement_Clickable(memberships);
		WebElement element = driver.findElement(memberships);
		String text = element.getText();
		System.out.println(text);
		element.click();
		Thread.sleep(3000);
		return text;
	}
//	cancel
	public static String Validate_Ecancel_Text() throws InterruptedException {
		waits.waitForElement_Clickable(Ecancel);
		WebElement element = driver.findElement(Ecancel);
		String text = element.getText();
		System.out.println(text);
		element.click();
		Thread.sleep(3000);
		return text;
	}
	
	
}
