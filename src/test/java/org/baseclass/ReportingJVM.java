package org.baseclass;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import gherkin.deps.com.google.gson.FieldAttributes;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ReportingJVM {
	public static void generateJVMReport(String json) {
		File file = new File("C:\\Users\\mohamemr\\eclipse-workspace\\Cuc\\target");
		Configuration configuration = new Configuration(file, "facebook Login page");
		configuration.addClassifications("Browser name", "Chrome browser");
		configuration.addClassifications("Platform", "Windows 10");
		configuration.addClassifications("Environment", "QA");
		configuration.addClassifications("Sprint", "12");

		
		List<String> l=new ArrayList<String>();
		l.add(json);
		
		ReportBuilder builder=new ReportBuilder(l, configuration);
		builder.generateReports();
	}
}
