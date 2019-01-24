package com.qa.Dave.Test.usingDDTinBDD;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Home;
import pages.searchedPage;
import utility.Constant;

public class Steps {

	WebDriver driver;
	static ExtentTest test;
	
	@Before
	public void setup() {
	System.setProperty("webdriver.chrome.driver", Constant.driverLocation);
	driver = new ChromeDriver();
	test = Runner.report.startTest("Searching Through Bing");
	}
	
	@Given("^I go to \"([^\"]*)\" website$")
	public void i_go_to_website(String arg1){
	    driver.get(arg1);
	}

	@When("^I search for \"([^\"]*)\"$")
	public void i_search_for(String arg1){
	    Home page = PageFactory.initElements(driver, Home.class);
	    page.enterASearch(driver, arg1);
	}

	@Then("^I am taken to a list of data for that search$")
	public void i_am_taken_to_a_list_of_data_for_that_search(){
	    searchedPage page1 = PageFactory.initElements(driver, searchedPage.class);
		try {
	    assertEquals("Images", page1.whatsThatElement(driver));
	    test.log(LogStatus.PASS, "Successfully searched terms");
	} catch (Exception E) {
		test.log(LogStatus.FAIL, "Uanable to search");
		
	}
	}
	
	@After
	public void teardown() {
		Runner.report.endTest(test);
		driver.quit();
	}
	
}
