package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class OpentapsPage extends ProjectMethods{

	public OpentapsPage()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.ID,using="updateLeadForm_companyName")
	private WebElement companyName;
	public OpentapsPage ChangeCompanyName(String data)
	{
		companyName.clear();
		type(companyName,data);
		return this;
	}

	@FindBy(how=How.XPATH,using="//input[@value='Update']")
	private WebElement update;
	public ViewLeads Clickupdate()
	{
		click(update);
		return new ViewLeads();
		
	}
	
}
