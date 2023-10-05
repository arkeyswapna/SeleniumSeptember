package dynamicParameterStepDefinition;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition extends BaseClass{
	
	
	
	
	@Given("Enter the user name as {string}")
	
	public void enterUsername(String username) {
		driver.findElement(By.id("username")).sendKeys(username);



	}
	@And("Enter the password as {string}")
	public void enterPassword(String password) {

		driver.findElement(By.id("password")).sendKeys(password);
	}
	@When("Click on the Login button")
	public void clickLogin() {

		driver.findElement(By.className("decorativeSubmit")).click();
	}
	@Then("Home page should be displayed")
	public void verifyHomepage() {

		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		if(displayed)
			System.out.println("Home page is displayed");
		else
			System.out.println("Home page is not displayed");
	}

@Then("Error message should be displayed")
	public void erromsg() {
		String text = driver.findElement(By.xpath("//p[text()='The Following Errors Occurred:']")).getText();
		if (text.contains("The Following Errors Occurred:")) {
			System.out.println("Error msg is displayed");
	
			
		}

	}
}
