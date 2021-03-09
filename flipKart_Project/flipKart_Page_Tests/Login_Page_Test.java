package flipKart_Page_Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import commonComponents.Base_Class;
import flipKart_Page_Actions.Dashboard_Page_Action;
import flipKart_Page_Actions.Login_Page_Action;

public class Login_Page_Test extends Base_Class{
	/*
	 * Test to validate that user can login to Flipkart and able to search a book
	 * Additionally he/she can able to add to cart & proceed to checkout
	 */
	@Test
	public void loginFlipkart() throws InterruptedException{
		Login_Page_Action loginPA = new Login_Page_Action(driver);
		Dashboard_Page_Action dashboardPA = loginPA.succesfulLogin();
		Assert.assertEquals(dashboardPA.validateCart(), true);
		dashboardPA.getBookAddToCart();
	}
}
