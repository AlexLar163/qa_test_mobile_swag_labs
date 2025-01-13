@menu_test
    Feature: Menu
        As a user
        I want to see the menu options
        So that I can navigate to different pages

        @menu_display_options_test
        Scenario: Menu options success
            Given I am logged in with username "standard_user" and password "secret_sauce"
            When I open the menu options
            Then I should see the menu option: "ALL ITEMS"
            And I should see the menu option: "WEBVIEW"
            And I should see the menu option: "QR CODE SCANNER"
            And I should see the menu option: "GEO LOCATION"
            And I should see the menu option: "DRAWING"
            And I should see the menu option: "ABOUT"
            And I should see the menu option: "LOGOUT"
            And I should see the menu option: "RESET APP STATE"
            And I should see the close menu button

        @menu_redirect_to_all_items_test
        Scenario Outline: Redirect to all items success: "<option>"
            Given I am logged in with username "standard_user" and password "secret_sauce"
            When I open the menu options
            And I click on the menu option: "<option>"
            Then I should be redirected to the "<option>" page
            Examples:
                | option          |
                | ALL ITEMS       |
                | WEBVIEW         |
                | QR CODE SCANNER |
                | GEO LOCATION    |
                | DRAWING         |
#                | ABOUT           |
                | LOGOUT          |
#                | RESET APP STATE |


