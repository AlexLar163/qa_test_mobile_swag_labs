package com.alexlar163.screens.webview;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebViewScreen extends PageObject {
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"WEBVIEW SELECTION\"]")
    private WebElement lblWebViewTitle;

    public boolean isTitleDisplayed() {
        try {
            WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOf(lblWebViewTitle));

            return lblWebViewTitle.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}
