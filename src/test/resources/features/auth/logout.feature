@logout_test
    Feature: Logout
        As a user
        I want to logout
        So that I can end my session

        @logout_test_success
        Scenario: Logout success
            Given I am logged in with username "standard_user" and password "secret_sauce"
            When I open the menu options
            And I click on the logout button
            Then I should be redirected to the login page
