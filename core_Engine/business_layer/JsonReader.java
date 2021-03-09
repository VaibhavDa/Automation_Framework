package business_layer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.spi.json.GsonJsonProvider;
import com.jayway.jsonpath.spi.mapper.GsonMappingProvider;


public class JsonReader {
	public static void abcvvmain(String [] args){
		System.out.println("--- 0th JSon path ---");
		String a = readJsonFileDynamic("C:/OLDLaptop/Selenium/BDDImplementation/Automation_Framework/TestData/flipkart/testData.json",
				"$..Flipkart.loginWorkFlow[0].username",0);
		System.out.println(a);
		/*System.out.println("--- 1st JSon path ---");
		readJsonFileDynamic("C:/OLDLaptop/Selenium/August2020/Complex_Architecture_Framework/TestData/SelleniumQTP/testData.json",
				"$..seleniumQTP.registerPageTwo.firstname");
		System.out.println("--- 2nd JSon path ---");
		readJsonFileDynamic("C:/OLDLaptop/Selenium/August2020/Complex_Architecture_Framework/TestData/SelleniumQTP/testData.json",
				"$..seleniumQTP.login[2].username");
		System.out.println("--- 3rd JSon path ---");
		readJsonFileDynamic("C:/OLDLaptop/Selenium/August2020/Complex_Architecture_Framework/TestData/SelleniumQTP/testData.json",
				"$..seleniumQTP.login[*].username");
		/* Alternate way of doing above operation */
		/*System.out.println("--- 4th JSon path ---");
		readJsonFileDynamic("C:/OLDLaptop/Selenium/August2020/Complex_Architecture_Framework/TestData/SelleniumQTP/testData.json",
				"$..['seleniumQTP'].['registerPageTwo'].['firstname']");
		System.out.println("--- 5th JSon path ---");
		readJsonFileDynamic("C:/OLDLaptop/Selenium/August2020/Complex_Architecture_Framework/TestData/SelleniumQTP/testData.json",
				"$..['seleniumQTP'].['login'][0].['username']");
		System.out.println("--- 6th JSon path ---");
		readJsonFileDynamic("C:/OLDLaptop/Selenium/August2020/Complex_Architecture_Framework/TestData/SelleniumQTP/testData.json",
				"$..['seleniumQTP'].['login'][*].['username']");
		System.out.println("--- 7th JSon path ---");
		readJsonFileDynamic("C:/OLDLaptop/Selenium/August2020/Complex_Architecture_Framework/TestData/SelleniumQTP/testData.json",
				"$..seleniumQTP.login.[?(@.username == 'Mahesh')].password");	
		System.out.println("--- 8th JSon path ---");
		readJsonFileDynamic("C:/OLDLaptop/Selenium/August2020/Complex_Architecture_Framework/TestData/SelleniumQTP/testData.json",
				"$..seleniumQTP.login.[?(@.age > 25)].username");*/
	}
	@SuppressWarnings("unchecked")
	public static List<String> readJsonFileDynamic(String filePath, String jsonPath) {
		List<String> returnJsonList = new ArrayList<String>();
	    System.out.println("jsonpath - "+jsonPath);
	    try
	    {
	        String fileContent = new String(Files.readAllBytes(Paths.get(filePath)));
	        Configuration conf = Configuration.builder()
	                .jsonProvider(new GsonJsonProvider())
	                .mappingProvider(new GsonMappingProvider())
	                .build();
	     
	        DocumentContext docContext = JsonPath.using(conf).parse(fileContent);
	        returnJsonList = docContext.read(jsonPath, List.class);//List 
	        for(String listElement:returnJsonList){
	        	System.out.println(listElement.toString());
	        }
	        //System.out.println(returnJsonList.get(0).toString());
	    } catch (IOException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	        System.out.println("exception");
	    } 
	    return returnJsonList;
	}
	
	@SuppressWarnings("unchecked")
	public static String readJsonFileDynamic(String filePath, String jsonPath, int index) {
		List<String> returnJsonList = new ArrayList<String>();
	    System.out.println("jsonpath - "+jsonPath);
	    try
	    {
	        String fileContent = new String(Files.readAllBytes(Paths.get(filePath)));
	        Configuration conf = Configuration.builder()
	                .jsonProvider(new GsonJsonProvider())
	                .mappingProvider(new GsonMappingProvider())
	                .build();
	     
	        DocumentContext docContext = JsonPath.using(conf).parse(fileContent);
	        returnJsonList = docContext.read(jsonPath, List.class);//List 
	        /*String listElement = null;
	        for(listElement:returnJsonList){
	        	System.out.println(listElement.toString());
	        }*/
	        //System.out.println(returnJsonList.get(0).toString());
	    } catch (IOException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	        System.out.println("exception");
	    } 
	    return returnJsonList.get(index);
	}
	
}
