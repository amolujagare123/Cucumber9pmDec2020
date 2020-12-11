package StepDefinitions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static util.configReader.getReportConfigPath;

public class HooksSD {

   static WebDriver driver;
    ExtentSparkReporter reporter;
    ExtentReports extent;
    @Before
    public void beforeScenario()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        reporter = new ExtentSparkReporter("Report\\report.html");
        extent = new ExtentReports();
        extent.attachReporter(reporter);
    }

    @After
    public void forFaiureScreenshot(Scenario scenario) throws IOException {
        if(scenario.isFailed())
        {
            // 1. create a refernce of an Interface  TakesScreenshot
            // assign the driver to it
            TakesScreenshot ts = (TakesScreenshot) driver;

            // 2. create object file using the method  getScreenshotAs
            byte[] scrFile = ts.getScreenshotAs(OutputType.BYTES);

            scenario.attach(scrFile,"image/png","screenshot");

        }


        reporter.loadXMLConfig(new File(getReportConfigPath()));
    }


    public static WebDriver getDriver()
    {
        return driver;
    }
}
