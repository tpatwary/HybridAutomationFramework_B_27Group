package luma.usa.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import luma.usa.BasePage.SuperClass;
import luma.usa.genaricfunctions.Utility;

public class Hooks extends SuperClass {
	// How to take screen
	public Scenario scenario;

	@Before
	public void setUp(Scenario scenario) {
		this.scenario = scenario;
		log.info(">>>>> Automation Start <<<<< ");

		initialization();

	}

	@After
	public void tearDown(Scenario scenario) {
		if (scenario.isFailed()) {
			Utility.getScreenshots(scenario);

		}
		log.info(">>>>> Automation Completed & Close the Browser <<<<< ");
		driver.quit();
	}

}
