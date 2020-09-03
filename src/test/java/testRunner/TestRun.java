package testRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features = ".\\src\\test\\resources\\Feature\\homePageVerify.feature",
		glue = "stepDefinitions",
		dryRun=false,
		monochrome=true,
		plugin= {"pretty", "html:/target/reports"}
		)
public class TestRun {

}
