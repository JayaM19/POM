package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import wdMethods.SeMethods;

public class Hooks extends SeMethods  {
	@Before
	public void beforeScenario(Scenario Sc)
	{
		startResult();
		startTestModule(Sc.getName(), Sc.getId());
		test = startTestCase(Sc.getName());
		test.assignCategory("Smoke");
		test.assignAuthor("Jaya");
		startApp("chrome");	
	}
	@After
	public void afterScenario()
	{
		closeAllBrowsers();
		endResult();
	}
}
