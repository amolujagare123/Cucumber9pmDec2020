package testRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features\\Project2.feature" ,
        glue = "StepDefinitions", dryRun = true)

public class TestRunner {
}
