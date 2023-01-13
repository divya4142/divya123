package hrm_Baseclass;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseclass {
	public static WebDriver driver;
	public static Properties prop;

	public baseclass() {
		try {
			prop = new Properties();
			FileInputStream narendra = new FileInputStream("./config/configs.properties");
			prop.load(narendra);
			narendra.close();
		} catch (Exception e) {
			System.out.println("The exception taken is:"+e.getMessage());

		}
	}
	public void instalization() {
		String browsername = prop.getProperty("Browser");
		if(browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./webdrivers/chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("the browser is open");
		}else {
			System.out.println("the browser is not open");
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("URL"));
		System.out.println("the browser open as"+driver.getClass());
	}
	
	public void Teardown() {
		driver.close();
		System.out.println("The window closed is"+ driver.getClass());
	}
}
