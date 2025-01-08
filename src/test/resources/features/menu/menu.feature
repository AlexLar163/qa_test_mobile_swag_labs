@menu_test
    Feature: Menu
        As a user
        I want to see the menu options
        So that I can navigate to different pages

        @menu_display_test
        Scenario: Menu options success
            Given I am logged in with username "standard_user" and password "secret_sauce"
            When I open the menu options
            Then I should see the menu option: "All Items"
            And I should see the menu option: "WebView"
            And I should see the menu option: "QR Code Scanner"
            And I should see the menu option: "Geo Location"
            And I should see the menu option: "Drawing"
            And I should see the menu option: "About"
            And I should see the menu option: "Logout"
            And I should see the menu option: "Reset App State"
            And I should see the close menu button
