package org.stepdef;

import java.io.File;
import java.io.IOException;

import org.baseclass.BaseClass;
import org.junit.After;
import org.junit.AfterClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import cucumber.api.Scenario;


public class HooksClass extends BaseClass {
@After
public void after(Scenario s)  {
	TakesScreenshot tk=(TakesScreenshot) driver;
	final byte[] screenshotAs = tk.getScreenshotAs(OutputType.BYTES);
	s.embed(screenshotAs,"C:\\Users\\mohamemr\\eclipse-workspace\\Cuc\\target\\Screenshot\\fb.png");
	
	

	
	
//	public void after(Scenario s){
//if (s.isFailed()) {
//	final byte[] screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
// 
//	s.embed(screenshot,"fb.png");
//}
}
}
