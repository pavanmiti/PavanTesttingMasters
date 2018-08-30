package com.screenfunctions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.genericfunctions.Genericfunctions;

public class Login extends Genericfunctions{
	@FindBy(how = How.XPATH, using = "//a[text()='Admin ']")
	public static WebElement AdminTab;
	
	@FindBy(how = How.XPATH, using = "//input[@name='uname']")
	public static WebElement uname;
	@FindBy(how = How.XPATH, using = "//input[@name='pwd']")
	public static WebElement pwd;
	@FindBy(how = How.XPATH, using = "//input[@name='submitBtn']")
	public static WebElement button;
	
	
	public void loginUser(String Username,String password)
	{
		clickElement(AdminTab);
		sendData(uname, Username);
		sendData(pwd, password);
		clickElement(button);
		
	}

}
