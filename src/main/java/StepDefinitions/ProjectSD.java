package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProjectSD {


    static WebDriver driver =HooksSD.getDriver();

    @Given("I am on login page")
    public void i_am_on_login_page() {
        System.out.println("I am on login page");

        driver.get("http://stock.scriptinglogic.net/");
    }

    @When("I enter valid username and valid password")
    public void i_enter_valid_username_and_valid_password() {
        System.out.println("I enter valid username and valid password");

        driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys("admin");

    }

    @When("I click on login button")
    public void i_click_on_login_button() {
        System.out.println("I click on login button");

        driver.findElement(By.xpath("//input[@value='LOG IN']")).click();

    }

    @Then("I should be redirected to Home page")
    public void i_should_be_redirected_to_home_page() {
        System.out.println("I should be redirected to Home page");
        String expected = "POSNIC - Dashboard1";
        String actual = driver.getTitle();
        Assert.assertEquals("We are not on the home page",expected,actual);

    }



}
