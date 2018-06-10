package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLeadSteps {
	RemoteWebDriver driver;
	/*@Given("Invoke leaftaps application")
	public void invokeLeaftaps()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps/");	
	}
	@And("Enter UserName as (.*)")
	public void enterUserName(String UserName)
	{
		driver.findElementById("username").sendKeys(UserName);
	}
	
	@And("Enter Password as (.*)")
	public void enterPassword(String Password)
	{
		driver.findElementById("password").sendKeys(Password);
	}
	@And("Click on Login Button")
	public void clickLogin()
	{
		driver.findElementByClassName("decorativeSubmit").click();
	}
	@And("Click CRM/SFA")
	public void clickCRMSFA()
	{
		driver.findElementByLinkText("CRM/SFA").click();
	}
	@And("Click Leads")
	public void clickLeads()
	{
		driver.findElementByLinkText("Leads").click();
	}
	@And("Click CreateLeads")
	public void clickCreateLeads()
	{
		driver.findElementByLinkText("Create Lead").click();
	}
	@And("Enter MandatoryFields as (.*,.*,.*)")
	public void enterMandatoryFields(String CompanyName, String FirstName, String LastName)
	{
		driver.findElementById("createLeadForm_companyName").sendKeys(CompanyName);
		driver.findElementById("createLeadForm_firstName").sendKeys(FirstName);
		driver.findElementById("createLeadForm_lastName").sendKeys(LastName);
	}
	@When("Click on Create Leads")
	public void clickCreatelead()
	{
		driver.findElementByName("submitButton").click();
	}
	@Then("Verify First Name is (.*)")
	public void verifyFname(String FirstName)
	{
		String text = driver.findElementById("viewLead_firstName_sp").getText();
		if(text.equals(FirstName))
		{
			System.out.println("Lead Created and first name verified");
		}
		else
		{
			System.out.println("Lead creation failed, first name not matched");
		}
	}*/
}
