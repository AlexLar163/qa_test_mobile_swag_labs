@login_test
Feature:  Login
    I, as a user
    Want, to have an option to log in
    To see all the items

    @login_username_input_test_fail
    Scenario Outline:  Log in failed: "<case>"
        Given that I am on the MyStore login page
        When I log in with the credentials user: "<username>"
        And password: "<password>"
        And I tap on the login button
        Then I validate that the input has an error message: "<message>"
        And I validate that the login username input show error: "<show_error>"
        Examples:
            | case            | username        | password     | message                                                      | show_error |
            | Empty username  |                 | password123  | Username is required                                         | true       |
            | Wrong username  | wrong-user123   | password123  | Username and password do not match any user in this service. | true       |
            | Locked out user | locked_out_user | secret_sauce | Sorry, this user has been locked out.                        | false      |

    @login_password_input_test_fail
    Scenario Outline:  Log in failed: "<case>"
        Given that I am on the MyStore login page
        When I log in with the credentials user: "<username>"
        And password: "<password>"
        And I tap on the login button
        Then I validate that the input has an error message: "<message>"
        And I validate that the login password input show error
        Examples:
            | case           | username      | password | message                                                      |
            | Empty password | standard_user |          | Password is required                                         |
            | Wrong password | standard_user | pass     | Username and password do not match any user in this service. |


    @login_test_success
    Scenario:  Log in successful
        Given that I am on the MyStore login page
        When I log in with the credentials user: "standard_user"
        And password: "secret_sauce"
        And I tap on the login button
        Then I validate that the title is displayed
