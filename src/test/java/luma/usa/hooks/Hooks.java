package luma.usa.hooks;



import io.cucumber.java.After;
import io.cucumber.java.Before;
import luma.usa.BasePage.SuperClass;

public class Hooks extends SuperClass {

	@Before
	public void setUp() {
		log.info(">>>>> Automation Start <<<<< ");

		initialization();

	}

	@After
	public void tearDown() {
		log.info(">>>>> Automation Completed & Close the Browser <<<<< ");

		driver.quit();

	}

}
