package hrm.locators;

import hrm_Baseclass.baseclass;

public class Gettitle extends baseclass {
	
	public static void Validate_Gettile() {
		String element = "OrangeHRM";
		if(driver.getTitle().equalsIgnoreCase(element)) {
			System.out.println("The title is matched");
		}else {
			System.out.println("The title is not matched");
		}
	}
	
	public static void Validate_GetCurrentURl() {
		String element = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		if(driver.getTitle().equalsIgnoreCase(element)) {
			System.out.println("The URL is matched");
		}else {
			System.out.println("The URL is not matched");
		}
	}

}
