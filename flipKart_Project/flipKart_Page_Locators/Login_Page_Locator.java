package flipKart_Page_Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page_Locator {
	public WebDriver driver;
	public Login_Page_Locator(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	/*
	 * purpose: is to return userName WebElement, if found return true
	 * param: none
	 * return: WebELement
	 */
	@FindBy(xpath = "//*[@class='_2QfC02']//following::input[@type='text']") 
	private WebElement userName;
	
	public WebElement getUserName(){
		return userName;
	}
	
	@FindBy(xpath = "//*[@class='_2QfC02']//following::input[@type='password']") 
	private WebElement password;
	
	public WebElement getPassword(){
		return password;
	}

	@FindBy(xpath = "//*[@class='_2QfC02']//following::button[@type='submit']") 
	private WebElement loginBtn;
	
	public WebElement getLoginBtn(){
		return loginBtn;
	}
	
	@FindBy(xpath = "//*[@class='_2QfC02']") 
	private WebElement loginPopUp;
	
	public WebElement getLoginPopUp(){
		return loginPopUp;
	}
}
