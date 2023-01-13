package hrm.commonUtils;


import org.openqa.selenium.JavascriptExecutor;

import hrm_Baseclass.baseclass;

public class pagescrolling extends baseclass{

	public static void pageDown_one() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,100)", "");
	}
	public static void pageDown_two() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)", "");
	}
	public static void pageDown_three() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)", "");
	}
	public static void pageDown_four() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)", "");
	}
	public static void pageDown_five() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)", "");
	}
	public static void pageDown_siz() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)", "");
	}
	public static void pageDown_seven() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,700)", "");
	}
	public static void pageUp_one() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(700,-200)", "");
	}
	public static void pageUp_two() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(500,-200)", "");
	}

}
