package stepDefinationClasses;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {
    @Given("^I am on the login page$")
    public void iAmOnTheLoginPage()
    {

    }

    @When("^I enter valid username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void iEnterValidUsernameAndPassword(String UN, String Pass) throws Throwable {

    }

    @And("^I click on the login button$")
    public void iClickOnTheLoginButton() {
    }

    @Then("^I should be logged in successfully$")
    public void iShouldBeLoggedInSuccessfully() {
    }
}
