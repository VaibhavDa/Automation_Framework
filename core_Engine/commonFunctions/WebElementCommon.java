package commonFunctions;

import org.openqa.selenium.WebElement;

public class WebElementCommon {
	public static boolean isPresent(WebElement element){
		boolean isDisp = false;
		if(element.isDisplayed()){
			isDisp = true;
		}
		return isDisp;
	}
	public static boolean isClickable(WebElement element){
		boolean isClick = false;
		if(isPresent(element)){
			if(element.isEnabled()){
				isClick = true;
			}
		}
		return isClick;
	}
}
