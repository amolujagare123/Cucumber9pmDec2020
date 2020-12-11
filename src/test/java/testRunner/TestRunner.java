package testRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features" ,
        glue = "StepDefinitions"/*, dryRun = true*/
, tags = "@loginReal",monochrome = true,
 plugin = {"pretty","html:target/cucumber-reports.html",
         "json:target/cucumber.json",
         "junit:target/cuckes.xml",
"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"})

public class TestRunner {
}
