package commonComponents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import business_layer.JsonReader;

public class Base_Class {
	public static WebDriver driver = null;
	@BeforeMethod
	public void beforeEachTest(){
		System.setProperty("webdriver.chrome.driver",
				"C:/OLDLaptop/Selenium/BDDImplementation/Automation_Framework/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(JsonReader.readJsonFileDynamic("C:/OLDLaptop/Selenium/BDDImplementation/Automation_Framework/TestData/flipkart/testData.json",
				"$..Flipkart.commonForProject.url",0));
	}
	
	@AfterMethod
	public void afterEachTest(){
		//driver.close();
	}
}
