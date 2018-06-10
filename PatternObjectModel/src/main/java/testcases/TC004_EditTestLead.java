package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_EditTestLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC004_EditTestLead";
		testDescription="Edit Test Lead in LeafTaps Application";
		testNodes="Leads";
		category="Smoke";
		authors="Jaya";
		browserName="chrome";
		dataSheetName="TC004";
	}
	@Test(dataProvider="fetchData")
	public void EditLead(String UserName, String Pwd, String firstName, String companyName)
	{
		new LoginPage()
		.enterUserName(UserName)
		.enterPassword(Pwd)
		.clickLogIn()
		.clickCRSFAlink()
		.clickleads()
		.clickFindlead()
		.EnterFName(firstName)
		.ClickFindleads()
		.ClickFirstResult()
		.clickEdit()
		.ChangeCompanyName(companyName)
		.Clickupdate()
		.verifyFirstname(firstName);
	}
}
