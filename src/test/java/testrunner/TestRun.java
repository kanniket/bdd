package testrunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(features=".//features/SignUp.feature",
glue="stepdefinitions",
dryRun=false,
monochrome=true,
plugin= {
		"pretty", "html:test-output"
})

public class TestRun {

}
