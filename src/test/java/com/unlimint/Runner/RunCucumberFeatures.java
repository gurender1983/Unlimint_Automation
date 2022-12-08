package com.unlimint.Runner;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;
import com.github.mkolisnyk.cucumber.runner.ExtendedTestNGRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@ExtendedCucumberOptions(//jsonReport = "src/main/java/results/cucumber-reports/cucumber.json",
retryCount = 3,
detailedReport = true,
overviewReport = true,
knownErrorsReport = true,
detailedAggregatedReport = true,
//jsonUsageReport = "src/results/cucumber-reports/cucumber-usage.json",
usageReport = true,
toPDF = true,
knownErrorsConfig = "src/main/resources/known-errors-source/sample_model.json",
outputFolder = "src/main/java/results")

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:path/report.html" },
		features = {"src/test/java/Features"},
		glue = {"StepDefinitions"},
		tags = { "@HomePage" }
		)

public class RunCucumberFeatures extends ExtendedTestNGRunner{
	
	private TestNGCucumberRunner testRunner;
	
	@BeforeSuite
	public void setUP() throws IOException
	{
		
		  testRunner = new TestNGCucumberRunner(RunCucumberFeatures.class);
		  FileUtils.deleteDirectory(new File("screenshots/FailedScreenshots"));
		 
	}
	
	
	
	 

}
