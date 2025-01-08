package com.alexlar163.stepdefs.menu;

import com.alexlar163.steps.logout.LogoutSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class MenuStepDefs {
    @Steps
    LogoutSteps logoutSteps;

    @When("I open the menu options")
    public void iOpenTheMenuOptions() {
        logoutSteps.tapMenu();
    }

    @And("I click on the logout button")
    public void iClickOnTheLogoutButton() {
        logoutSteps.tapLogout();
    }

    @Then("I should be redirected to the login page")
    public void iShouldBeRedirectedToTheLoginPage() {
        logoutSteps.validateBtnLoginDisplayed();
    }
}
