package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import wdMethods.ProjectMethods;

public class ViewLeads extends ProjectMethods{

	public ViewLeads()
	{
		PageFactory.initElements(driver, this);
	}


	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	private WebElement verifyFN;
	@Then("Verify First Name is (.*)")
	public ViewLeads verifyFirstname(String data)
	{
		verifyExactText(verifyFN, data);
		return this;
	}
	
	@FindBy(how=How.LINK_TEXT,using="Edit")
	private WebElement clickEdit;
	public OpentapsPage clickEdit()
	{
		click(clickEdit);
		return new OpentapsPage();
	}
	
	
}
