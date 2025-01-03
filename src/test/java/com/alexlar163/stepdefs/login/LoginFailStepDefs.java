package com.alexlar163.stepdefs.login;

import com.alexlar163.steps.login.LoginSteps;
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
        loginSteps.validateUsernameInputError();
    }
}
