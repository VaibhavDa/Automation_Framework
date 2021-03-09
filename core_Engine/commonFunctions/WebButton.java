package commonFunctions;

import org.openqa.selenium.WebElement;

public class WebButton {
	/*
	 * @purpose - click any available web button
	 * @Param - WebElement
	 * @Return - None
	 */
	public static void clickBtn(WebElement button){
		if(WebElementCommon.isClickable(button)){
			button.click();
		}
	}
}
