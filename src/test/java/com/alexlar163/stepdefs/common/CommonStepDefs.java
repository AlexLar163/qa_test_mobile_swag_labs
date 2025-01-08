package com.alexlar163.stepdefs.common;

import com.alexlar163.steps.login.LoginSteps;
import io.cucumber.java.en.Given;
import net.serenitybdd.annotations.Steps;

public class CommonStepDefs {
    @Steps
    LoginSteps loginSteps;

    @Given("I am logged in with username {string} and password {string}")
    public void iAmLoggedInWithUsernameAndPassword(String username, String password) {
        loginSteps.typeUser(username);
        loginSteps.typePassword(password);
        loginSteps.tapLogin();
    }
}
