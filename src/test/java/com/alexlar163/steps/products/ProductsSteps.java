package com.alexlar163.steps.products;

import com.alexlar163.screens.drawing.DrawingScreen;
import com.alexlar163.screens.geolocation.GeoLocationScreen;
import com.alexlar163.screens.login.LoginScreen;
import com.alexlar163.screens.menu.MenuScreen;
import com.alexlar163.screens.permissions.PermissionsScreen;
import com.alexlar163.screens.product.ProductsScreen;
import com.alexlar163.screens.qrcodescanner.QrCodeScannerScreen;
import com.alexlar163.screens.webview.WebViewScreen;
import org.junit.Assert;

public class ProductsSteps {
    ProductsScreen productsScreen;
    WebViewScreen webViewScreen;
    QrCodeScannerScreen qrCodeScannerScreen;
    GeoLocationScreen geoLocationScreen;
    DrawingScreen drawingScreen;
    LoginScreen loginScreen;
    MenuScreen menuScreen;
    PermissionsScreen permissionsScreen;

    public void validateAllItemsPage(String page) {
        switch (page) {
            case "ALL ITEMS":
                Assert.assertTrue("The product title is not displayed", productsScreen.isTitleDisplayed());
                break;
            case "WEBVIEW":
                Assert.assertTrue("The webview title is not displayed", webViewScreen.isTitleDisplayed());
                break;
            case "QR CODE SCANNER":
                permissionsScreen.acceptCameraPermission();
                Assert.assertTrue("The qr code scanner title is not displayed", qrCodeScannerScreen.isTitleDisplayed());
                break;
            case "GEO LOCATION":
                permissionsScreen.acceptCameraPermission();
                Assert.assertTrue("The geo location title is not displayed", geoLocationScreen.isTitleDisplayed());
                break;
            case "DRAWING":
                Assert.assertTrue("The drawing title is not displayed", drawingScreen.isTitleDisplayed());
                break;
            case "ABOUT":
                Assert.assertTrue("The browser did not redirect to the expected URL", menuScreen.isRedirectedToBrowser());
                break;
            case "LOGOUT":
                Assert.assertTrue("The logout button is not displayed", loginScreen.isLoginButtonDisplayed());
                break;
            case "RESET APP STATE":
                Assert.assertTrue("", false);
                break;
        }
    }
}
