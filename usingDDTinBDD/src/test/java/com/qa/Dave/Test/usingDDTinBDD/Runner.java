package com.qa.Dave.Test.usingDDTinBDD;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.relevantcodes.extentreports.ExtentReports;

import cucumber.api.CucumberOptions;
import utility.Constant;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = Constant.featurePath)

public class Runner {

	static ExtentReports report;
	
	@BeforeClass
	public static void setup() {
		report = new ExtentReports(Constant.folderPath + Constant.reportFile, true);
	}
	
	@AfterClass
	public static void teardown() {
		report.flush();
	}
	}
	
	

