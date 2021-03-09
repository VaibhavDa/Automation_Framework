package commonFunctions;

import org.openqa.selenium.WebDriver;

public class WebBrowser {
	public static boolean validatePageTitle(WebDriver driver, String expectedTitle){
		boolean isMatch = false;
		if(driver.getTitle().equals(expectedTitle)){
			isMatch = true;
		}
		return isMatch;
	}
}
