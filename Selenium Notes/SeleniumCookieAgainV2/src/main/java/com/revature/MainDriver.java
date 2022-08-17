package com.revature;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class MainDriver {

	// This is the execution 
	public static void main(String[] args) {
		
		/*
		 * What are the steps or things we need to have for Selenium to automate something 
		 * 
		 * 1) First goal was to configure the driver and instantiate it
		 * 
		 * 2) To open up our desired webpage 
		 * 
		 * 3) We want to open up the page and leave it in a state so that we can click the cookie 
		 * 		a) We're are clicking the inital language prompt to get the cookie clickable 
		 * 
		 * 	What steps do I need in Java to click an element?
		 * 		1) Find the element on the webpage 
		 * 			a) By using Selenium Locators - Class, TagName, Id, Name, LinkText and PartialLinkText, XPath 
		 * 			(With LinkText and Partial Link Text we use to find <a>)
		 * 			(Name is used to find <input> tags, e.g. <input type="text name='username'>)
		 * 
		 * 		2) Store the element as a variable in Java, to able to do 'operations' or methods on it. 
		 * 
		 * 		3) In Java, we use the .click() method to click the element 
		 * 			
		 * 		
		 * 
		 */
		
		// We will tell Selenium where to look for th ChromeDriver.exe
		System.setProperty("webdriver.chrome.driver", "./chromerdriver.exe");
		
		//Setup/Configure the ChromeDriver
		io.github.bonigarcia.wdm.WebDriverManager.chromedriver().setup();
		
		// Initiate the WebDriver 
		WebDriver driver = new ChromeDriver();
		
		//Do we need the wait time? 
		//  When we are running the test, we need to give it some time to initialize 
		// implicit vs explicit?
		// Why should I use one over the other? 
		// Can i use both at the same time?
		
		//Implicit wait means that any element method, e.g. click() will be attempted for 10 seconds 
		//before giving up and throwing an error. 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//We need the url of the webpage 
		driver.get("https://orteil.dashnet.org/cookieclicker/");
		
		
		//Clicking the language element 
		WebElement languageElement; //declare the variable
		
		languageElement = driver.findElement(By.id("langSelect-EN")); //store the element in the variable 
		
		languageElement.click();
		
		
		while(true) {
			
			//Clicking the cookie element 
			WebElement cookieElement; 
			
			cookieElement = driver.findElement(By.xpath("//*[@id=\"bigCookie\"]"));
			//Make sure you can explain every syntax, what is //, * , [] , @id , etc ... 
			//relative XPath vs Full XPath ?
			
			cookieElement.click();
			
		}
		
		
		
		
		
	
		
		
		
		
		
	}
}
