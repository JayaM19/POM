package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods{ 

	
	public CreateLeadPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement CompanyName;
	@And("Enter Company Name as (.*)")
	public CreateLeadPage EnterCompanyName(String data)
	{
		type(CompanyName, data);
		return this;
	}
	
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement FirstName;
	@And("Enter First Name as (.*)")
	public CreateLeadPage EnterFirstName(String data)
	{
		type(FirstName, data);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement LastName;
	@And("Enter Last Name as (.*)")
	public CreateLeadPage EnterlastName(String data)
	{
		type(LastName, data);
		return this;
	}
	

	@FindBy(how=How.NAME,using="submitButton")
	private WebElement ClickCreateLeadButton;
	@When("Click on Create Leads")
	public ViewLeads ClickCreateLeadButton()
	{
		click(ClickCreateLeadButton);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ViewLeads();
	}
	
		
	
	
}
