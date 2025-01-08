package com.alexlar163.stepdefs.login;

import com.alexlar163.steps.login.LoginSteps;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;

public class LoginFailStepDefs {
    @Steps
    LoginSteps loginSteps;

    @Then("I validate that the input has an error message: {string}")
    public void iValidateThatTheInputHasAnErrorMessage(String message) {
        loginSteps.validateUsernameErrorMessage(message);
    }

    @And("I validate that the login username input show error")
    public void iValidateThatTheLoginUsernameInputShowError() {
    }

    @And("I validate that the login username input show error: {string}")
    public void iValidateThatTheLoginUsernameInputShowError(String showError) {
        loginSteps.validateUsernameInputError(Boolean.parseBoolean(showError));
    }

    @And("I validate that the login password input show error")
    public void iValidateThatTheLoginPasswordInputShowError() {
        loginSteps.validatePasswordInputError();
    }
}
