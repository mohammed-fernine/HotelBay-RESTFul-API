Feature: Reviews

  Scenario: View hotel reviews and ratings
    Given a hotel has received reviews from past guests
    When a user calls GET /hotels/{hotelId}/reviews
    Then the client receives status code of 200
    And the system returns a list of reviews and the average rating



  Scenario: Update review
    Given the guest has previously submitted a review
    When the client calls PUT /reviews/{id} with an updated description
    Then the client receives status code of 200
    And the system saves the modified review text



  Scenario: Add review
    Given the guest has a completed reservation for the hotel
    When the client calls POST /hotels/{hotelId}/reviews with a textual description
    Then the client receives status code of 201
    And the review is saved to the hotel profile



