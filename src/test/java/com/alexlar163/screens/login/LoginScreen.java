package com.alexlar163.screens.login;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginScreen extends PageObject {
    @AndroidFindBy(xpath="//android.widget.EditText[@content-desc=\"test-Username\"]")
    private WebElement txtUsername;

    @AndroidFindBy(xpath = "//android.widget.ScrollView[@content-desc=\"test-Login\"]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup")
    private WebElement txtUsernameErrorIcon;

    @AndroidFindBy(xpath="//android.widget.EditText[@content-desc=\"test-Password\"]")
    private WebElement txtPassword;

    @AndroidFindBy(xpath = "//android.widget.ScrollView[@content-desc=\"test-Login\"]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup")
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
        try {
            WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOf(lblLoginError));

            return lblLoginError.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public String getErrorMessage() {
        try {
            WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOf(lblLoginError));

            return lblLoginError.getText();
        } catch (Exception e) {
            return "";
        }
    }

    public boolean isErrorUsernameIconDisplayed() {
        try {
            WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOf(txtUsernameErrorIcon));

            return txtUsernameErrorIcon.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isErrorPasswordIconDisplayed() {
        try {
            WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOf(txtPasswordErrorIcon));

            return txtPasswordErrorIcon.isDisplayed();
        }catch (Exception e) {
            return false;
        }
    }

    public boolean isLoginButtonDisplayed() {
        try {
            WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOf(btnLogin));

            return btnLogin.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

}
