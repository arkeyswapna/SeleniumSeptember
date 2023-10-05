package dynamicParameterStepDefinition;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLeadStepDefinition extends BaseClass{
	
	@Given("Click CRMSFA link")
	public void clickCRMSFA() throws InterruptedException {
		Thread.sleep(50);
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		

	}

	@And("Click Leads button")
	public void clickLeads() {

		driver.findElement(By.linkText("Leads")).click();
		
	}

	@And("Click CreateLeads button")
	public void clickCreatelead() {

		driver.findElement(By.linkText("Create Lead")).click();
		
	}

	@When("Enter the CompanyName as (.*)$")
	public void enterCompanyName(String companyname) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyname);
		
	}
	@And("Enter the FirstName as (.*)$")
	public void enterFirstname(String firstname) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstname);
		

	}

	@And("Enter the LastName as (.*)$")
	public void enterLastName(String lastname) {

		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastname);

	}
	@And("Click on the CreateLeads button")
	public void clickCreateLeadButton() {

		driver.findElement(By.name("submitButton")).click();
	}


}
