package com.alexlar163.screens.product;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductsScreen extends PageObject {
    @AndroidFindBy(xpath="//android.widget.TextView[@text=\"PRODUCTS\"]")
    private WebElement lblProduct;

    public boolean isTitleDisplayed () {
        waitFor(ExpectedConditions.visibilityOf(lblProduct));

        return lblProduct.isEnabled();
    }
}
