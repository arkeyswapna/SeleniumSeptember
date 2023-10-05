package stepDefinition;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	
	public ChromeDriver driver;
	
	@Given("Open the chrome browser")
	public void OpenBrowser() {
		driver= new ChromeDriver();


	}
	@And("Load the application url")
	public void loadApplication() {
		driver.get("http://leaftaps.com/opentaps/control/main");

	}
	@And("Enter the user name as Demosalesmanager")
	public void enterUsername() {
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");



	}
	@And("Enter the password as crmsfa")
	public void enterPassword() {

		driver.findElement(By.id("password")).sendKeys("crmsfa");
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


}
