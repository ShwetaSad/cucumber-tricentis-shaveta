package com.tricentis.demowebshop.steps;

import com.tricentis.demowebshop.pages.BuildYourOwnComputerPage;
import com.tricentis.demowebshop.pages.ComputerPage;
import com.tricentis.demowebshop.pages.DesktopPage;
import com.tricentis.demowebshop.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ComputerSteps {

    @Given("I am on the  home page")
    public void iAmOnTheHomePage() {
    }

    @When("I click on the computer tab")
    public void iClickOnTheComputerTab() {
        new HomePage().clickOnMenuTab("COMPUTERS");
    }

    @Then("I can see text {string}")
    public void iCanSeeText(String Computers) {
        String exptext = "Computers";
        Assert.assertEquals(exptext, "Computers");
    }

    @And("I click on Desktop Link")
    public void iClickOnDesktopLink() {
        new ComputerPage().clickOnSubMenu("Desktops");
    }

    @Then("I can see the text {string}")
    public void iCanSeeTheText(String Desktops) {
        String ExTExt = new DesktopPage().getPageTitleText();
        Assert.assertEquals(ExTExt, "Desktops");
    }

    @And("I Click on the product name {string}")
    public void iClickOnTheProductName(String Productname) {
        new DesktopPage().selectProduct("Build your own computer");

    }

    @And("I Select processor {string}")
    public void iSelectProcessor(String processor) {
        new BuildYourOwnComputerPage().selectProcessor(processor);
    }

    @And("I Select RAM {string}")
    public void iSelectRAM(String ram) {
        new BuildYourOwnComputerPage().selectRam(ram);
    }

    @And("I Select HDD {string}")
    public void iSelectHDD(String hdd) {
        new BuildYourOwnComputerPage().selectHDD(hdd);
    }

    @And("I Select OS {string}")
    public void iSelectOS(String os) {
        new BuildYourOwnComputerPage().selectOS(os);
    }

    @And("I Select Software {string}")
    public void iSelectSoftware(String software) {
        new BuildYourOwnComputerPage().selectSoftware(software);
    }


    @Then("I can see the Message{string}")
    public void iCanSeeTheMessage(String message) {
        String text = new BuildYourOwnComputerPage().getProductAddedMessage();
        Assert.assertEquals(text, "The product has been added to your shopping cart");
    }

    @And("I Click on ADD TO CART Button")
    public void iClickOnADDTOCARTButton() {
        new BuildYourOwnComputerPage().clickOnAddToCartButton();

    }
}
