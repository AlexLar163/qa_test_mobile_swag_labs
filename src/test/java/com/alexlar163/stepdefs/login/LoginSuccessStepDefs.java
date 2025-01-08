package com.alexlar163.stepdefs.login;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;
import com.alexlar163.steps.login.LoginSteps;

public class LoginSuccessStepDefs {
    @Steps
    LoginSteps loginSteps;

    @Then("I validate that the title is displayed")
    public void iValidateThatTheTitleIsDisplayed() {
        loginSteps.validateTitleDisplayed();
    }

}
