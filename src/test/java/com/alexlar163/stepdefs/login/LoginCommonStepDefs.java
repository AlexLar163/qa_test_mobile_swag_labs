package com.alexlar163.stepdefs.login;

import com.alexlar163.steps.login.LoginSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class LoginCommonStepDefs {
    @Steps
    LoginSteps loginSteps;

    @Given("that I am on the MyStore login page")
    public void thatIAmOnTheMyStoreLoginPage() {
        // No action needed as the app starts on the login page
    }

    @When("I log in with the credentials user: {string}")
    public void iLogInWithTheCredentialsUser(String user) {
        loginSteps.typeUser(user);
    }

    @And("password: {string}")
    public void password(String password) {
        loginSteps.typePassword(password);
    }

    @And("I tap on the login button")
    public void iTapOnTheLoginButton() {
        loginSteps.tapLogin();
    }
}
