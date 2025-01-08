package com.alexlar163.steps.logout;

import com.alexlar163.screens.login.LoginScreen;
import com.alexlar163.screens.menu.MenuScreen;
import net.serenitybdd.annotations.Step;

public class LogoutSteps {
    MenuScreen menuScreen;
    LoginScreen loginScreen;

    @Step
    public void tapMenu() {
        menuScreen.tapMenu();
    }

    @Step
    public void tapLogout() {
        menuScreen.tapLogout();
    }

    @Step
    public void validateBtnLoginDisplayed() {
        loginScreen.isLoginButtonDisplayed();
    }

}
