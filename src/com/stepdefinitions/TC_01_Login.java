package com.stepdefinitions;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.genericfunctions.Genericfunctions;
import com.screenfunctions.HomePage;
import com.screenfunctions.Login;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class TC_01_Login extends Genericfunctions{
		
	
	static boolean status =true;
	@Given("^Launch \"([^\"]*)\" browser and enter \"([^\"]*)\"$")
	
	public static boolean launchBrowser(String browser, String url, DataTable table)
	{
		System.out.println("Launching application");
		System.out.println("************************");
		List<List<String>> data = table.raw();
		System.out.println("Browser used is "+ data.get(0).get(0));
		url=data.get(0).get(1);
		System.out.println("URL of the application is:"+ url);
		System.out.println("************************");
		return status=launchBrowser(browser,url);
	}
	
	@Then("^Enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public static void login(String username,String password,DataTable table)
	{
		List<List<String>> data = table.raw();
		username =data.get(0).get(0);
		password =data.get(0).get(1);
		System.out.println("Username is:"+ username +"\n password is :"+ password);
		Login l=PageFactory.initElements(driver, Login.class);
		l.loginUser(username,password);
		
	
		
	}
	
	@Then("^Verify the Homepage is displayed$")
	public static void display()
	{
		status = Displayed(ele);
		System.out.println("Status of Display:" +status);
	}
	
	@Then("^VerifyBrokenlinks$")
	public static void broken()
	{
		brokenLinks();
	}
	@Then("^Logout and close the browser$")
	public static void logout()
	{
		HomePage hp=PageFactory.initElements(driver, HomePage.class);
		hp.logoutAndClose();
	}
	
}
