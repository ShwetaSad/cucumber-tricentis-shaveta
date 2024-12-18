package com.tricentis.demowebshop.steps;

import com.tricentis.demowebshop.pages.HomePage;
import com.tricentis.demowebshop.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginSteps {
    @Given("I am on the home page")
    public void iAmOnTheHomePage() {

    }

    @When("I click on the login link")
    public void iClickOnTheLoginLink() {
        new HomePage().clickOnLoginLink();
    }

    @Then("I should see the message {string}")
    public void iShouldSeeTheMessage(String message) {
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = new LoginPage().getWelcomeText();
        Assert.assertEquals(expectedMessage, actualMessage, "Login page not displayed");

    }

    @And("I enter email {string}")
    public void iEnterEmail(String email) {
        new LoginPage().enterEmailId(email);
    }

    @And("I enter password {string}")
    public void iEnterPassword(String password) {
        new LoginPage().enterPassword(password);
    }

    @And("I click on login button")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("I should log in successfully")
    public void iShouldLogInSuccessfully() {

    }


    @Then("I should see the error message")
    public void iShouldSeeTheErrorMessage() {
        Assert.assertEquals(new LoginPage().getErrorMessage(),"Login was unsuccessful. Please correct the errors and try again.\n" +
                "The credentials provided are incorrect", "Error message not displayed");
    }

    @And("I click on logout link")
    public void iClickOnLogoutLink() {
        new HomePage().clickOnLogOutLink();
    }

    @Then("I should see the login link display")
    public void iShouldSeeTheLoginLinkDisplay() {
        Assert.assertEquals(new HomePage().loginlinktext(),"Log in","not logged out");
    }
}