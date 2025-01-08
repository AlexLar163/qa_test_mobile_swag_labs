package com.alexlar163.screens.login;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class MenuScreen extends PageObject {

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Menu\"]")
    private WebElement btnMenu;

    public void TapMenu() {
        btnMenu.click();
    }


}
