Scenario: User registration

    Given the client provides valid registration details
    When the client calls POST /users/register
    Then the client receives status code of 201
    And a new user account is created

Scenario: User login

    Given the client provides valid login credentials
    When the client calls POST /users/login
    Then the client receives status code of 200
    And the system returns an authentication token

Scenario: User logout

    Given the client is logged in
    When the client calls POST /users/logout
    Then the client receives status code of 200
    And the authentication token is invalidated

