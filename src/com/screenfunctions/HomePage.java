
package com.screenfunctions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.genericfunctions.Genericfunctions;
import com.google.common.cache.CacheBuilder;
import com.stepdefinitions.TC_01_Login;

import cucumber.api.java.en.Then;

public class HomePage extends Genericfunctions {

	//WebElement for Secure Login
	@FindBy(how = How.XPATH, using = "//span[text()='Secure Login']")
	public static WebElement secureLogin;

	//WebElement for Logout
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Logout')]")
	public static WebElement logout;
	
	//WebElement for username
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Username')]")
	public static WebElement username;
	
	//WebElement for password
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Password')]")
	public static WebElement password;
	
	//WebElement for SubmitButton
	@FindBy(how = How.XPATH, using = "//input[@name='submitBtn']")
	public static WebElement button;
	
	//WebElement for Features text
	@FindBy(how = How.XPATH, using = "//h3[contains(text(),'Features')]")
	public static WebElement featurestext;
	
	//WebElement for AdminLogin Section  
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Admin Login')]")
	public static WebElement AdminLogin;
	
	//WebElement for StaffLogin Section
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Staff Login')]")
	public static WebElement StaffLogin;
	
	//WebElement for Online Banking Features section
	@FindBy(how = How.XPATH, using = "//*[text()='Online Banking features']")
	public static WebElement onlinebankingfeatures;
	
	//WebElement for contact section
	@FindBy(how = How.XPATH, using = "//*[(text()='Contact Us')]")
	public static WebElement contact;
	
	//WebElement for list of tabs
	@FindBy(how = How.XPATH, using = "//a[normalize-space(text())='Home']/parent::li/following-sibling::li/a")
	public List<WebElement> alltabs ;
	
	public static List<String> tabs = new ArrayList<String>();

	/***************************************************
	 * 
	 * ‘Method Name : verifyHomePageDisplay() ‘Description : This Method is used
	 * to Verify the Features whether displayed or not ‘Input parameters :
	 * 
	 * status: Return Value:Boolean Design Date : 14-8-2018
	 * 
	 * Reviewed by: Reviewed Date:
	 * 
	 ***************************************************/

	public boolean verifyHomePageDisplay() {
		boolean status = true;

		try {
			// Secure Login is Displayed
			if (secureLogin.isDisplayed())
				System.out.println("Secure Login Feature is displayed");
			// Username is Displayed
			if (username.isDisplayed())
				System.out.println("Username is displayed");
			// password is Displayed
			if (password.isDisplayed())
				System.out.println("Password is displayed");
			// Button is Displayed
			if (button.isDisplayed())
				System.out.println("Login Button is displayed");
			// Features is Displayed
			if (featurestext.isDisplayed())
				System.out.println("Features is displayed");

		} catch (Exception e) {
			status = false;
			System.out.println(e.getMessage());
			System.out.println("Unable to find Secure Login");
		}
		return status;
	}

	/***************************************************
	 * 
	 * ‘Method Name : verifyTabDisplay() ‘Description : This Method is used to
	 * Verify the Tabs displayed or not ‘Input parameters :
	 * 
	 * status: Return Value:Boolean Design Date : 14-8-2018
	 * 
	 * Reviewed by: Reviewed Date:
	 * 
	 ***************************************************/
	public boolean verifyTabDisplay() {
		boolean status = true;
		
		System.out.println("************************");
		System.out.println("Verifying Tabs Display");
		System.out.println("************************");
		try {
			for (int i = 0; i < alltabs.size(); i++) {

				tabs.add(alltabs.get(i).getText().trim());
				System.out.println(tabs);//Display Tabs

			}

			String[] taborder = { "Admin", "Staff", "Features", "Contact Us" };
			System.out.println("************************");
			for (int j = 0; j < taborder.length; j++) {
				if (tabs.get(j).equals(taborder[j])) {
					System.out.println(tabs.get(j) + " Is in Expected Order");

				}

				else {
					System.out.println(tabs.get(j) + " Is not in Expected Order");
				}

			}
		} catch (Exception e) {
			status = false;
			System.out.println(e.getMessage());
			System.out.println("Unable to find tabs");
		}
		return status;
	}

	/***************************************************
	 * 
	 * ‘Method Name : validateTabs() ‘Description : This Method is used to
	 * Verify the Tabs displayed or not ‘Input parameters :
	 * 
	 * status: Return Value:Boolean Design Date : 14-8-2018
	 * 
	 * Reviewed by: Reviewed Date:
	 * 
	 ***************************************************/

	public void validateTabs() {
		boolean status = true;
		

		try {
			for (int i = 0; i < alltabs.size(); i++) {
				String tabslabel = alltabs.get(i).getText().trim();
				System.out.println("************************");
				System.out.println(tabslabel);
				alltabs.get(i).click();

				switch (tabslabel) {

				case "Admin":
					
					Displayed(AdminLogin);

					break;
				case "Staff":
					
					Displayed(StaffLogin);
		
					break;
				case "Features":
					
					Displayed(onlinebankingfeatures);
					
					break;
				case "Contact Us":
					
					Displayed(contact);
					
					break;
				}
			
				driver.findElement(By.xpath("//a[text()='Home']")).click();
				
				
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
	
	public  void logoutAndClose()
	{
		//clickElement(logout);
		ClosingtheBrowser();
	}
}
