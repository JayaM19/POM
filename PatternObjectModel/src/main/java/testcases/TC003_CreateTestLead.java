package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_CreateTestLead extends ProjectMethods{
	
	@BeforeTest
	public void setData() {
		testCaseName="TC003_CreateTestLead";
		testDescription="Create Test Leaf in LeafTaps Application";
		testNodes="Leads";
		category="Smoke";
		authors="Mukesh";
		browserName="chrome";
		dataSheetName="TC003";
	}
	
	
	@Test(dataProvider="fetchData")
	public void CreateLead(String UserName, String Password, String CompanyName, String FirstName, String LastName)
	{
		new LoginPage()
		.enterUserName(UserName)
		.enterPassword(Password)
		.clickLogIn()
		.clickCRSFAlink()
		.clickleads()
		.clickCreateLead()
		.EnterCompanyName(CompanyName)
		.EnterFirstName(FirstName)
		.EnterlastName(LastName)
		.ClickCreateLeadButton()
		.verifyFirstname(FirstName);
		
	}
	

}
