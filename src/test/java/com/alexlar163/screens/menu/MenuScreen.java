package com.alexlar163.screens.menu;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class MenuScreen extends PageObject {

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Menu\"]")
    private WebElement btnMenu;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-ALL ITEMS\"]")
    private WebElement btnAllItems;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-WEBVIEW\"]")
    private WebElement btnWebView;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-LOGOUT\"]")
    private WebElement btnLogout;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-QR CODE SCANNER\"]")
    private WebElement btnQRCodeScanner;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-GEO LOCATION\"]")
    private WebElement btnGeoLocation;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-DRAWING\"]")
    private WebElement btnDrawing;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-ABOUT\"]")
    private WebElement btnAbout;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Close\"]")
    private WebElement btnClose;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-RESET APP STATE\"]")
    private WebElement btnResetAppState;

    public void tapMenu() {
        btnMenu.click();
    }

    public void tapLogout() {
        btnLogout.click();
    }


}
