package commonFunctions;

import org.openqa.selenium.WebElement;

public class WebTextBox {
	//SendInput
	//Clear Text
	/*
	 * @purpose - is to enter text in any text box
	 * @param 1: WebElement
	 * @param 2: String
	 * return: None
	 */
	public static void sendInput(WebElement textBox, String textToEnter){
		if(WebElementCommon.isClickable(textBox)){
			textBox.sendKeys(textToEnter);
		}
	}
	public static void clearTextBox(WebElement textBox){
		if(WebElementCommon.isClickable(textBox)){
			textBox.clear();;
		}
	}
}
