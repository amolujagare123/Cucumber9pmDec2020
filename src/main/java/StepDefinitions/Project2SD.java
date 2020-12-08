package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Project2SD {
    @Given("I am on login page")
    public void i_am_on_login_page() {
        System.out.println("I am on login page");
    }

    @When("I enter valid username and valid password")
    public void i_enter_valid_username_and_valid_password() {
        System.out.println("I enter valid username and valid password");
    }

    @When("I enter invalid username and valid password")
    public void i_enter_invalid_username_and_valid_password() {
        System.out.println("I enter invalid username and valid password");
    }

    @When("I enter another valid username and valid password")
    public void i_enter_another_valid_username_and_valid_password() {
        System.out.println("I enter another valid username and valid password");
    }

   /* @When("I enter username {string} and password as {string}")
    public void i_enter_username_and_password_as(String username, String password) {

        System.out.println("I enter username:"+username);
        System.out.println("I enter password:"+password);
    }
*/

    @When("I click on login button")
    public void i_click_on_login_button() {
        System.out.println("I click on login button");
    }
    @Then("I should be redirected to Home page")
    public void i_should_be_redirected_to_home_page() {
        System.out.println("I should be redirected to Home page");
    }

    @Then("I should get error message")
    public void i_should_get_error_message() {
        System.out.println("I should get error message");
    }

}
