Feature: Reviews

  Scenario: View hotel reviews
    Given a hotel has received reviews from past guests
    When the client calls GET /hotels/{hotelId}/reviews
    Then the response status code should be 200
    And the system returns a list of reviews

  Scenario: Update a review
    Given a guest has previously submitted a review
    When the client calls PUT /reviews/{id} with an updated description
    Then the response status code should be 200
    And the system updates the review text

  Scenario: Add a review
    Given a guest has a completed reservation for the hotel
    When the client calls POST /hotels/{hotelId}/reviews with a textual description
    Then the response status code should be 201
    And the review is saved to the hotel profile