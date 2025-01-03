package com.alexlar163.screens.login;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginScreen extends PageObject {
    @AndroidFindBy(xpath="//android.widget.EditText[@content-desc=\"test-Username\"]")
    private WebElement txtUsername;

    @AndroidFindBy(xpath = "(//android.widget.TextView[@text=\"\uF057\"])[1]")
    private WebElement txtUsernameErrorIcon;

    @AndroidFindBy(xpath="//android.widget.EditText[@content-desc=\"test-Password\"]")
    private WebElement txtPassword;

    @AndroidFindBy(xpath = "(//android.widget.TextView[@text=\"\uF057\"])[2]")
    private WebElement txtPasswordErrorIcon;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]")
    private WebElement btnLogin;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Error message\"]/android.widget.TextView")
    private WebElement lblLoginError;

    public void typeUsername(String username) {
        txtUsername.sendKeys(username);
    }

    public void typePassword(String password) {
        txtPassword.sendKeys(password);
    }

    public void tapLogin() {
        btnLogin.click();
    }

    public boolean isErrorDisplayed() {
        waitFor(ExpectedConditions.visibilityOf(lblLoginError));

        return lblLoginError.isDisplayed();
    }

    public String getErrorMessage() {
        waitFor(ExpectedConditions.visibilityOf(lblLoginError));

        return lblLoginError.getText();
    }

    public boolean isErrorUsernameIconDisplayed() {
        waitFor(ExpectedConditions.visibilityOf(txtUsernameErrorIcon));

        return txtUsernameErrorIcon.isDisplayed();
    }

    public boolean isErrorPasswordIconDisplayed() {
        waitFor(ExpectedConditions.visibilityOf(txtPasswordErrorIcon));

        return txtPasswordErrorIcon.isDisplayed();
    }

}
