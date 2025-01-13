package com.alexlar163.screens.menu;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

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

    public boolean isMenuOptionDisplayed(String option) {
      try {
          switch (option) {
              case "ALL ITEMS":
                  return btnAllItems.isDisplayed();
              case "WEBVIEW":
                  return btnWebView.isDisplayed();
              case "LOGOUT":
                  return btnLogout.isDisplayed();
              case "QR CODE SCANNER":
                  return btnQRCodeScanner.isDisplayed();
              case "GEO LOCATION":
                  return btnGeoLocation.isDisplayed();
              case "DRAWING":
                  return btnDrawing.isDisplayed();
              case "ABOUT":
                  return btnAbout.isDisplayed();
              case "RESET APP STATE":
                  return btnResetAppState.isDisplayed();
              default:
                  return false;
          }
      } catch (Exception e) {
          return false;
      }
    }

    public boolean isCloseMenuBtnDisplayed() {
        try {
            WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOf(btnClose));

            return btnClose.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public void tapMenuOption(String option) {
        switch (option) {
            case "ALL ITEMS":
                btnAllItems.click();
                break;
            case "WEBVIEW":
                btnWebView.click();
                break;
            case "LOGOUT":
                btnLogout.click();
                break;
            case "QR CODE SCANNER":
                btnQRCodeScanner.click();
                break;
            case "GEO LOCATION":
                btnGeoLocation.click();
                break;
            case "DRAWING":
                btnDrawing.click();
                break;
            case "ABOUT":
                btnAbout.click();
                break;
            case "RESET APP STATE":
                btnResetAppState.click();
                break;
        }
    }

    public boolean isRedirectedToBrowser() {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlContains("https://saucelabs.com/"));
        return getDriver().getCurrentUrl().contains("https://saucelabs.com/");
    }

}
