Feature: Refund Management

  Scenario: Request refund
    Given a guest has a canceled reservation eligible for a refund
    When the client calls POST /refunds with the reservation ID
    Then the client receives status code of 201
    And the refund request is recorded as pending

  Scenario: Approve refund
    Given a pending refund request exists
    When the administrator calls PUT /refunds/{id}/approve
    Then the administrator receives status code of 200
    And the refund status is updated to approved

  Scenario: Process refund
    Given an administrator has approved a refund request
    When the system processes the transaction via PUT /refunds/{id}/process
    Then the API returns status code of 200
    And the refund status is marked as completed