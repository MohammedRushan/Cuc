package org.testrunner;

import org.baseclass.ReportingJVM;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", glue = "org.stepdef", plugin = { "pretty",
		"json:C:\\Users\\mohamemr\\eclipse-workspace\\Cuc\\target\\fb.json" })
public class TestRunner {
@AfterClass
public static void afterclass() {
ReportingJVM.generateJVMReport("C:\\Users\\mohamemr\\eclipse-workspace\\Cuc\\target\\fb.json");
}
}
