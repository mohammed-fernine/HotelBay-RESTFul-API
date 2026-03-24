Feature: Reviews and Ratings
  Scenario: Add rating
    Given the guest has completed their stay
    When the client calls POST /hotels/{hotelId}/ratings with a score from 0 to 10
    Then the client receives status code of 201
    And the new rating updates the average hotel score


