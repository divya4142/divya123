package hrm.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import hrm.commonUtils.waits;
import hrm_Baseclass.baseclass;

public class asdfghjkpage extends baseclass {
	
	static By job = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/span");
	static By jobtitle = By.xpath("//a[text()='Job Titles']");
	static By Pgrads = By.xpath("//a[text()='Pay Grades']");
	static By Estatus = By.xpath("//a[text()='Employment Status']");
	static By Jobcategorius =By.xpath("//a[text()='Job Categories']");
	static By Work = By.xpath("//a[text()='Work Shifts']");
	
	public static String Validate_jobclick_Text() throws InterruptedException {
		waits.waitForVisiblityofallelements(job);
		WebElement element = driver.findElement(job);
		String text = element.getText();
		System.out.println(text);
		element.click();
		Thread.sleep(3000);
		return text;
	}
	public static String Validate_jobTitleclick_Text() throws InterruptedException {
		waits.waitForVisiblityofallelements(jobtitle);
		WebElement element = driver.findElement(jobtitle);
		String text = element.getText();
		System.out.println(text);
		element.click();
		Thread.sleep(3000);
		return text;
	}
	public static String Validate_Pgradsclick_Text() throws InterruptedException {
		waits.waitForVisiblityofallelements(Pgrads);
		WebElement element = driver.findElement(Pgrads);
		String text = element.getText();
		System.out.println(text);
		element.click();
		Thread.sleep(3000);
		return text;
	}
//	Estatus
	public static String Validate_Estatusclick_Text() throws InterruptedException {
		waits.waitForVisiblityofallelements(Estatus);
		WebElement element = driver.findElement(Estatus);
		String text = element.getText();
		System.out.println(text);
		element.click();
		Thread.sleep(3000);
		return text;
	}
//	Jobcategorius
	public static String Validate_Jobcategoriusclick_Text() throws InterruptedException {
		waits.waitForVisiblityofallelements(Jobcategorius);
		WebElement element = driver.findElement(Jobcategorius);
		String text = element.getText();
		System.out.println(text);
		element.click();
		Thread.sleep(3000);
		return text;
	}
//	Work status
	public static String Validate_Workclick_Text() throws InterruptedException {
		waits.waitForVisiblityofallelements(Work);
		WebElement element = driver.findElement(Work);
		String text = element.getText();
		System.out.println(text);
		element.click();
		Thread.sleep(3000);
		return text;
	}
			

}
