package com.tricentis.demowebshop.steps;

import com.tricentis.demowebshop.pages.HomePage;
import com.tricentis.demowebshop.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.math3.analysis.function.Exp;
import org.testng.Assert;

public class RegisterSteps {
    @Given("I am on home page")
    public void iAmOnHomePage() {

    }

    @When("I click on register link")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }

    @Then("I should see the Register text{string}")
    public void iShouldSeeTheRegisterText(String text) {
        String Expectedtext = new RegisterPage().getRegisterText();

        Assert.assertEquals(Expectedtext,"Register","Wrong page");
    }

    @And("I click on Register Button")
    public void iClickOnRegisterButton() {
        new RegisterPage().clickOnRegisterButton();
    }

    @Then("I should see the erroe Messages")
    public void iShouldSeeTheErroeMessages() {
        String Errormessage = new RegisterPage().getValidationErrorMessageForField("Last name:");
        Assert.assertEquals(Errormessage,"Last name is Required");
    }

    @And("I select gender {string}")
    public void iSelectGender(String gender) {
        new RegisterPage().selectGender("Female");
    }

    @And("I enter first name")
    public void iEnterFirstName() {
        new RegisterPage().enterFirstName("Shaveta");
    }

    @And("I enter last name")
    public void iEnterLastName() {
        new RegisterPage().enterLastName("Sethi");
    }

    @And("I enter emailaddress")
    public void iEnterEmailaddress() {
        new RegisterPage().enterEmail("sethi@gmail.com");
    }

    @And("I enter password")
    public void iEnterPassword() {
        new RegisterPage().enterPassword("Sethi123");
    }

    @And("I enter confirm password")
    public void iEnterConfirmPassword() {
        new RegisterPage().enterConfirmPassword("Sethi123");
    }

    @And("I click on the Register Button")
    public void iClickOnTheRegisterButton() {
        new RegisterPage().clickOnRegisterButton();
    }

    @Then("I should message {string}")
    public void iShouldMessage(String Registeration) {
        String expected = "Your registration completed";
        Assert.assertEquals(expected,"Your registration completed");
    }
}
