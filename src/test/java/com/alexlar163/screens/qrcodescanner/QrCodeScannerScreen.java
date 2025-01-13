package com.alexlar163.screens.qrcodescanner;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class QrCodeScannerScreen extends PageObject {
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Scan a QR Code that contains a url.\"]")
    private WebElement lblQrCodeScannerTitle;

    public boolean isTitleDisplayed() {
        try {
            WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOf(lblQrCodeScannerTitle));

            return lblQrCodeScannerTitle.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}
