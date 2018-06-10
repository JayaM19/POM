package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MyLeadsPage extends ProjectMethods{

	public MyLeadsPage()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	private WebElement CreateLead;
	@And("Click CreateLeads")
	public CreateLeadPage clickCreateLead()
	{
		click(CreateLead);
		return new CreateLeadPage();
	}
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement FindLead;
	public FindLeadPage clickFindlead()
	{
		click(FindLead);
		return new FindLeadPage();		
	}
	

}
