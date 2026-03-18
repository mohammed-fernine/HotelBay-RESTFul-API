Scenario: Process payment

    Given the guest has a pending reservation
    When the client calls POST /payments with a payment amount
    Then the client receives status code of 201
    And the payment status is set to processing

Scenario: Confirm payment

    Given a payment attempt is successful
    When the system calls PUT /payments/{id}/confirm
    Then the system returns status code of 200
    And the reservation state changes to confirmed

Scenario: Handle payment failure

    Given the client provides invalid payment details
    When the client calls POST /payments
    Then the client receives status code of 400
    And the reservation remains in a pending state