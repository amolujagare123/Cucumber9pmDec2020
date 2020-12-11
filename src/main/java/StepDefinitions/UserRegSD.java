package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserRegSD {

    @Given("^I am on the user registration page$")
    public void i_am_on_the_user_registration_page() throws Throwable {

        System.out.println("I am on the user registration page");

    }

    @When("^I enter  data (.+) , (.+) , (.+) , (.+)$")
    public void i_enter_data_(String name, String email, String phone, String city)
             {
                 System.out.println("name="+name);
                 System.out.println("email="+email);
                 System.out.println("phone="+phone);
                 System.out.println("city="+city);

             }

    @Then("^I verify that the user registred successfully$")
    public void i_verify_that_the_user_registred_successfully() throws Throwable {
        System.out.println("I verify that the user registred successfully");
    }

    @And("^I click on submit button$")
    public void i_click_on_submit_button() throws Throwable {
        System.out.println("I click on submit button");
    }

}
