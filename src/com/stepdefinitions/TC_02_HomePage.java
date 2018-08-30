package com.stepdefinitions;

import java.util.List;

import org.openqa.selenium.support.PageFactory;

import com.genericfunctions.Genericfunctions;
import com.screenfunctions.HomePage;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class TC_02_HomePage extends Genericfunctions {
	static boolean status = true;
	public static HomePage home = PageFactory.initElements(driver, HomePage.class);

	@Then("^check for  features$")
	public static void check_for_features() {
		home.verifyHomePageDisplay();

	}

	@Then("^verify Tab Order$")
	public static void verifyHomeTab() {
		home.verifyTabDisplay();

	}

	@Then("^validateTabs$")
	public void validatetabs() {
		home.validateTabs();
	}

	@And("close browser")
	public void closebrowser() {
		ClosingtheBrowser();
	}

}