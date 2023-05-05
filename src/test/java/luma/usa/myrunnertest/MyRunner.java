package luma.usa.myrunnertest;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions

		(
		plugin = {"pretty","json:target/cucumber.json" },//pretty- How you want see the reports 
		features = { ".//Feature/" }, // features = feature file locations where we write the automation test cases.

		glue = { "luma.usa.Stepdefination","luma.usa.hooks" } // glue = step definition locations where we implement the test cases.

)

public class MyRunner extends AbstractTestNGCucumberTests {

}
