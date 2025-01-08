package com.alexlar163.steps.login;

import com.alexlar163.screens.login.LoginScreen;
import com.alexlar163.screens.product.ProductsScreen;
import net.serenitybdd.annotations.Step;
import org.junit.Assert;

public class LoginSteps {
    LoginScreen loginScreen;
    ProductsScreen productScreen;

    @Step
    public void typeUser(String user) {
        loginScreen.typeUsername(user);
    }

    @Step
    public void typePassword(String password) {
        loginScreen.typePassword(password);
    }

    @Step
    public void tapLogin() {
        loginScreen.tapLogin();
    }

    @Step
    public void validateTitleDisplayed() {
        Assert.assertTrue("The title is not displayed", productScreen.isTitleDisplayed());
    }

    @Step
    public void validateUsernameErrorMessage(String message) {
        Assert.assertTrue("The error message is not displayed", loginScreen.    isErrorDisplayed());
        Assert.assertEquals("The error message is not correct", message, loginScreen.getErrorMessage());
//        Assert.assertTrue("The password error icon is not displayed", loginScreen.isErrorPasswordIconDisplayed());
    }

    @Step
    public void validateUsernameInputError(boolean showError) {
        System.out.println("showError: " + showError);
        if (showError) {
            Assert.assertTrue("The username error icon is not displayed", loginScreen.isErrorUsernameIconDisplayed());
        } else {
            Assert.assertFalse("The username error icon is displayed", loginScreen.isErrorUsernameIconDisplayed());
        }
    }

    @Step
    public void validatePasswordInputError() {
        Assert.assertTrue("The username error icon is not displayed", loginScreen.isErrorPasswordIconDisplayed());
    }
}
