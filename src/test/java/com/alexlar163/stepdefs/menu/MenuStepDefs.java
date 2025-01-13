package com.alexlar163.stepdefs.menu;

import com.alexlar163.steps.logout.LogoutSteps;
import com.alexlar163.steps.menu.MenuSteps;
import com.alexlar163.steps.products.ProductsSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class MenuStepDefs {
    @Steps
    LogoutSteps logoutSteps;

    @Steps
    MenuSteps menuSteps;

    @Steps
    ProductsSteps productSteps;

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

    @Then("I should see the menu option: {string}")
    public void iShouldSeeTheMenuOption(String option) {
        menuSteps.validateMenuOption(option);
    }

    @And("I should see the close menu button")
    public void iShouldSeeTheCloseMenuButton() {
        menuSteps.validateCloseMenuBtn();
    }

    @And("I click on the menu option: {string}")
    public void iClickOnTheMenuOption(String option) {
        menuSteps.tapMenuOption(option);
    }

    @Then("I should be redirected to the {string} page")
    public void iShouldBeRedirectedToTheAllItemsPage(String page) {
        productSteps.validateAllItemsPage(page);
    }
}
