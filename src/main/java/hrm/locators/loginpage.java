package hrm.locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import hrm_Baseclass.baseclass;

public class loginpage extends baseclass{

	static By image = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/img");
	static By hometext = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]");
	static By names = By.name("username");
	static By pass = By.name("password");
	static By loginclick = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
    static By error = By.xpath("//*[text()='Required']");
    static By errorM = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p");
	
    
    public static boolean Validate_Image() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(image));
		WebElement element = driver.findElement(image);
		boolean b = element.isDisplayed();
		if(b) {
			System.out.println("yaa image is displayed");
		}else {
			System.out.println("yaa image is not displayed");
		}
		Thread.sleep(2000);
		return b;
	}


	public static String Validate_Homepage_text() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(hometext));
		WebElement element = driver.findElement(hometext);
		String text = element.getText();
		System.out.println(text);
		Thread.sleep(2000);
		return text;
	}
	public static void Validate_usernames(String na) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(names));
		WebElement element = driver.findElement(names);
		boolean b = element.isSelected();
		if(b) {
			System.out.println("yes filed element is there");
		}else {
			System.out.println("yes filed element is not there");
		}
		element.click();
		Thread.sleep(2000);
		element.clear();
		element.sendKeys(na);
		System.out.println(element.getAttribute("value"));
		System.out.println(element.getAttribute("type"));
		Thread.sleep(2000);

	}
	public static void Validate_passwords(String pa) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(pass));
		Thread.sleep(2000);
		WebElement element = driver.findElement(pass);
		boolean b = element.isSelected();
		if(b) {
			System.out.println("yes filed element is there");
		}else {
			System.out.println("yes filed element is not there");
		}
		element.click();
		Thread.sleep(2000);
		element.clear();
		element.sendKeys(pa);
		System.out.println(element.getAttribute("value"));
		System.out.println(element.getAttribute("type"));
		Thread.sleep(2000);

	}

	public static String Validate_loginclick_text() throws InterruptedException {
		Thread.sleep(2000);
		WebElement element = driver.findElement(loginclick);
		String text = element.getText();
		System.out.println(text);
		element.click();
		Thread.sleep(2000);
		return text;
		
	}
	public static void Validate_errormessage_text() throws InterruptedException {
		Thread.sleep(5000);
		List<WebElement> element = driver.findElements(loginclick);
		int size = element.size();
		System.out.println(size);
		for(int i = 0; i<size; i++) {
			String text = element.get(i).getText();
			System.out.println(text);
		}
		Thread.sleep(2000);	
	}
	public static String Validate_errorText() {
		WebElement element = driver.findElement(errorM);
		String text = element.getText();
		System.out.println(text);
		return text;
	}
}
