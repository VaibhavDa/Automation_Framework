package flipKart_Page_Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard_Page_Locator {
	public WebDriver driver;
	public Dashboard_Page_Locator(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Cart") 
	private WebElement cart;
	
	public WebElement getCart(){
		return cart;
	}
	
	@FindBy(xpath = "//input[@name='q']") 
	private WebElement searchProductTextBox;
	
	public WebElement getSearchProductTextBox(){
		return searchProductTextBox;
	}
	
	@FindBy(xpath = "//button") 
	private WebElement searchButton;
	
	public WebElement getSearchButton(){
		return searchButton;
	}
	
	@FindBy(xpath = "//div[@data-id='9781259005930']") 
	private WebElement firstBook;
	
	public WebElement getFirstBook(){
		return firstBook;
	}
	
	@FindBy(xpath = "//button[text()='ADD TO CART']") 
	private WebElement addCart;
	
	public WebElement getAddCart(){
		return addCart;
	}
}
