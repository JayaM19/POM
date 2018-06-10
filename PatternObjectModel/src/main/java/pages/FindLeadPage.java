package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindLeadPage extends ProjectMethods {
	public FindLeadPage()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.XPATH,using="(//div[@class='x-form-item x-tab-item']//input[1])[2]")
	private WebElement EnterFname;
	public FindLeadPage EnterFName(String data)
	{
		type(EnterFname, data);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement clickFindLeads;
	public FindLeadPage ClickFindleads()
	{
		click(clickFindLeads);
		return this;
	}
	@FindBy(how=How.XPATH,using="(//table[@class='x-grid3-row-table']//a)[3]")
	private WebElement clickfirstResult;
	public ViewLeads ClickFirstResult()
	{
		click(clickfirstResult);
		return new ViewLeads();
	}
	@FindBy(how=How.XPATH,using="//span[text()='Phone']")
	private WebElement PhoneTab;
	public void clickphonetab()
	{
		click(PhoneTab);
	}

	public void enterPhoneNumber()
	{
		
	}






}

