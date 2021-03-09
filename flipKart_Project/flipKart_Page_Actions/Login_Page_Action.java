package flipKart_Page_Actions;

import org.openqa.selenium.WebDriver;

import business_layer.JsonReader;
import commonFunctions.WebBrowser;
import commonFunctions.WebButton;
import commonFunctions.WebElementCommon;
import commonFunctions.WebTextBox;
import flipKart_Page_Locators.Login_Page_Locator;

public class Login_Page_Action {
	
	public WebDriver driver;
	public Login_Page_Locator loginPL = null;
	
	public Login_Page_Action(WebDriver driver){
		this.driver = driver;
		loginPL = new Login_Page_Locator(driver);
	}
	
	public boolean verifyTitle(){
		return WebBrowser.validatePageTitle(driver, JsonReader.readJsonFileDynamic("C:/OLDLaptop/Selenium/BDDImplementation/Automation_Framework/TestData/flipkart/testData.json",
					"$..Flipkart.loginWorkFlow[0].pageTitle",0));
	}
	
	public boolean validatePopUp(){
		boolean isPopUp = false;
		if(verifyTitle()){
			if(WebElementCommon.isClickable(loginPL.getLoginPopUp())){
				System.out.println("PopupValidated");
				isPopUp = true;
			}
		}
		return isPopUp;
	}
	public void enterUserName(){
			WebTextBox.sendInput(loginPL.getUserName(), JsonReader.readJsonFileDynamic("C:/OLDLaptop/Selenium/BDDImplementation/Automation_Framework/TestData/flipkart/testData.json",
					"$..Flipkart.loginWorkFlow[0].username",0));
	}
	
	public void enterPassword(){
		WebTextBox.sendInput(loginPL.getPassword(), JsonReader.readJsonFileDynamic("C:/OLDLaptop/Selenium/BDDImplementation/Automation_Framework/TestData/flipkart/testData.json",
				"$..Flipkart.loginWorkFlow[0].password",0));
	}
	
	public void clickLogin(){
		WebButton.clickBtn(loginPL.getLoginBtn());
	}
	/*
	 * Common method to access from Login Action
	 * We can add additional common methods for failure of login too
	 */
	public Dashboard_Page_Action succesfulLogin(){
		Dashboard_Page_Action dashboardPA = null;
		if(validatePopUp()){
			enterUserName();
			enterPassword();
			clickLogin();
			dashboardPA = new Dashboard_Page_Action(driver);
		}
		return dashboardPA;
	}
}
