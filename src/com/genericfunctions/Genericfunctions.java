package com.genericfunctions;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Genericfunctions {

	public static WebDriver driver;
	public static Actions act;
	public static WebElement ele;
	public static boolean status = true;

	/***************************************************
	 * 
	 * ‘Method Name : launchBrowser() ‘Description : This Method is used to
	 * Launch Browser specified by the user. ‘Input parameters : String
	 * browsertype String url
	 * 
	 * 
	 * status: Return Value:Boolean Design Date : 14-8-2018
	 * 
	 * Reviewed by: Reviewed Date:
	 * 
	 * 
	 ***************************************************/
	public static boolean launchBrowser(String browsertype, String url)

	{

		//boolean status = true;
		try {

			// Convert the user given argument into lower case
			switch (browsertype.toLowerCase()) {
			case "ff":

				// launch the firefox browser with user given url
				driver = new FirefoxDriver();
				driver.get(url);
				break;
			}

			// Maximize the browser
			driver.manage().window().maximize();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			status = false;

		}
		return status;
		// Return the status whether it is pass or fail to the user
	}
	/***************************************************
	 * 
	 * ‘Method Name : sendData() ‘Description : This Method is used to
	 * Click and Clear data. ‘Input parameters : String xpathObj String Keys
	 * 
	 * status: Return Value:Boolean Design Date : 14-8-2018
	 * 
	 * Reviewed by: Reviewed Date:
	 ***************************************************/

	public static void sendData(WebElement ele,String data) {
		
		try {
			
			ele.sendKeys(data);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			status = false;

		}

	}
	/***************************************************
	 * 
	 * ‘Method Name : clickandClearSetTxt() ‘Description : This Method is used to
	 * Click and Clear data. ‘Input parameters : String xpathObj String Keys
	 * 
	 * status: Return Value:Boolean Design Date : 14-8-2018
	 * 
	 * Reviewed by: Reviewed Date:
	 ***************************************************/

	public static void clickandClearSetTxt(WebElement ele,String keys) {
		
		try {
			ele.click();// to click the element
			ele.clear();// to clear the element
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			status = false;

		}

	}

	/***************************************************
	 * 
	 * ‘Method Name : clickElement() ‘Description : This Method is used to Click
	 * on Element. ‘Input parameters : String browsertype String url
	 * 
	 * status: Return Value:Boolean Design Date : 14-8-2018
	 * 
	 * Reviewed by: Reviewed Date:
	 ***************************************************/
	public static void clickElement(WebElement ele) {
		
		try {
			ele.click();// to click the element
		} catch (Exception e) {
			System.out.println(e.getMessage());
			status = false;

		}

	}

	/***************************************************
	 * 
	 * ‘Method Name : mousehoverandClick() ‘Description : This Method is used to
	 * Move Mouse and Click on Object. ‘Input parameters : String xpathObj
	 * 
	 * 
	 * status: Return Value:Boolean Design Date : 14-8-2018
	 * 
	 * Reviewed by: Reviewed Date:
	 ***************************************************/
	public static void mousehoverandClick(String xpathObj) {
		act = new Actions(driver);
		ele = driver.findElement(By.xpath(xpathObj));
		act.moveToElement(ele).build().perform();
		ele.click();
	}

	/***************************************************
	 * 
	 * ‘Method Name : Displayed() ‘Description : This Method is used to Return
	 * Display Status. ‘Input parameters : String xpathObj
	 * 
	 * status: Return Value:Boolean Design Date : 14-8-2018
	 * 
	 * Reviewed by: Reviewed Date:
	 ***************************************************/
	public static boolean Displayed(WebElement ele) {
		
		try {

			
			ele.isDisplayed();
			status = true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			status = false;

		}
		return status;

	}

	/***************************************************
	 * 
	 * ‘Method Name : brokenLinks() ‘Description : This Method is used to return
	 * Broken links. ‘Input parameters : Null
	 * 
	 * status: Return Value:Boolean Design Date : 14-8-2018
	 * 
	 * Reviewed by: Reviewed Date:
	 ***************************************************/
	public static void brokenLinks() {

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Number of links: " + links.size());
		for (int i = 0; i < links.size(); i++) {
			ele = links.get(i);
			String url = ele.getAttribute("href");

			try {
				URL url1 = new URL(url);
				HttpURLConnection con = (HttpURLConnection) url1.openConnection();
				con.setConnectTimeout(3000);
				con.connect();
				if (con.getResponseCode() == 200) {
					System.out.println(con.getResponseMessage());
				} else {
					System.out.println(con.HTTP_NOT_FOUND);
				}
			} catch (Exception e) {
				e.printStackTrace();

			}
		}

	}

	/***************************************************
	 * 
	 * ‘Method Name : ClosingtheBrowser() ‘Description : This Method is used to
	 * close the browser. ‘Input parameters : Null
	 * 
	 * status: Return Value:Null Design Date : 14-8-2018
	 * 
	 * Reviewed by: Reviewed Date:
	 ***************************************************/
	public static void ClosingtheBrowser() {

		driver.close();
	}
}
