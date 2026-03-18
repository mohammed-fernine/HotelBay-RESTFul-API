Scenario: Create booking

    Given the client is authenticated as a guest
    When the client calls POST /bookings with reservation details
    Then the client receives status code of 201
    And the pending booking is saved


Scenario: Cancel booking

    Given the guest has a confirmed reservation
    When the client calls PUT /bookings/{id}/cancel
    Then the client receives status code of 200
    And the reservation is marked as canceled


Scenario: View booking details

    Given the guest has an existing reservation
    When the client calls GET /bookings/{id}
    Then the client receives status code of 200
    And the system returns the reservation details

Scenario: List user bookings

    Given the client is authenticated as a guest
    When the client calls GET /users/{userId}/bookings
    Then the client receives status code of 200
    And the system returns a list of the user's reservations

Scenario: Check room availability

    Given the user provides check-in and check-out dates
    When the client calls GET /rooms/availability
    Then the client receives status code of 200
    And the system returns a list of available rooms