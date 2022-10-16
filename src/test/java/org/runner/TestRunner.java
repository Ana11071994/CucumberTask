package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.jvm.JvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features",glue="org.steps",dryRun=false,monochrome=true,strict=true,tags="@confidence",
plugin = {"pretty","html:C:\\Users\\Kannan\\eclipse-workspace\\Cucumber\\Reports\\HTML Report","json:C:\\Users\\Kannan\\eclipse-workspace\\Cucumber\\Reports\\JSON REPORT\\jsonreport.json","junit:C:\\Users\\Kannan\\eclipse-workspace\\Cucumber\\Reports\\JUNIT REPORT\\junitreport.xml"})



public class TestRunner {
	@AfterClass
	public static void jvm() {
		JvmReport.jvmReportGeneration("C:\\Users\\Kannan\\eclipse-workspace\\Cucumber\\Reports\\JSON REPORT\\jsonreport.json");

	}


}

