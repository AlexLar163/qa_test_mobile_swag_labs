package com.alexlar163.screens.permissions;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PermissionsScreen extends PageObject {

    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_one_time_button\"]")
    private WebElement btnAllowOnlyThisTime;

    public void acceptCameraPermission() {
        try {
            WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOf(btnAllowOnlyThisTime));
            btnAllowOnlyThisTime.click();
        } catch (Exception e) {
            System.out.println("Camera permission dialog not displayed.");
        }
    }
}