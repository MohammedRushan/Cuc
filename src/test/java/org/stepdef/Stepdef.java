package org.stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Stepdef {

	WebDriver driver;

	@Given("User is on facebook page #Browser url--> predefined")
	public void user_is_on_facebook_page_Browser_url_predefined() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@When("user need to enter username and password")
	public void user_need_to_enter_username_and_password() {
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("Rushan");
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("Rushan");

	}

	@When("User need to CLick Login button")
	public void user_need_to_CLick_Login_button() {
		WebElement login = driver.findElement(By.name("login"));
		login.click();

	}

	@Then("User need to validate Error message")
	public void user_need_to_validate_Error_message() {
		System.out.println("Valid Details");
	}

}
