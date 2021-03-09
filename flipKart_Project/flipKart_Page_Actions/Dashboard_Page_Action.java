package flipKart_Page_Actions;

import org.openqa.selenium.WebDriver;

import business_layer.JsonReader;
import commonFunctions.WebBrowser;
import commonFunctions.WebButton;
import commonFunctions.WebElementCommon;
import commonFunctions.WebTextBox;
import flipKart_Page_Locators.Dashboard_Page_Locator;

public class Dashboard_Page_Action {

	public WebDriver driver;
	public Dashboard_Page_Locator dashboardPL = null;
	
	public Dashboard_Page_Action(WebDriver driver){
		this.driver = driver;
		dashboardPL = new Dashboard_Page_Locator(driver);
	}
	
	public boolean verifyTitle(){
		return WebBrowser.validatePageTitle(driver, JsonReader.readJsonFileDynamic("C:/OLDLaptop/Selenium/BDDImplementation/Automation_Framework/TestData/flipkart/testData.json",
					"$..Flipkart.loginWorkFlow[0].pageTitle",0));
	}
	
	public boolean validateCart(){		
		return WebElementCommon.isClickable(dashboardPL.getCart());
	}
	
	public void enterBookToSearch(){
		WebTextBox.sendInput(dashboardPL.getSearchProductTextBox(), JsonReader.readJsonFileDynamic("C:/OLDLaptop/Selenium/BDDImplementation/Automation_Framework/TestData/flipkart/testData.json",
				"$..Flipkart.loginWorkFlow[1].bookToSearch",0));
	}
	
	public void clickSearchButton(){
		WebButton.clickBtn(dashboardPL.getSearchButton());
	}
	
	public void clickFirstBook(){
		dashboardPL.getFirstBook().click();
	}
	
	public void clickAddCart(){
		dashboardPL.getAddCart().click();
	}
	
	public void getBookAddToCart(){
		enterBookToSearch();
		clickSearchButton();
		clickFirstBook();
		clickAddCart();
	}
}
