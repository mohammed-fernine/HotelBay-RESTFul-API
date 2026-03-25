Feature: Ratings

  Scenario: Add a rating
    Given a guest has completed their stay
    When the client calls POST /hotels/{hotelId}/ratings with a score
    Then the response status code should be 201
    And the rating is saved

  Scenario: View average rating
    Given a hotel has ratings
    When the client calls GET /hotels/{hotelId}/rating
    Then the response status code should be 200
    And the system returns the average rating

  Scenario: Update a rating
    Given a guest has submitted a rating
    When the client calls PUT /ratings/{id} with a new score
    Then the response status code should be 200
    And the rating is updated

  Scenario: Reject invalid rating
    Given a guest has completed their stay
    When the client calls POST /hotels/{hotelId}/ratings with an invalid score
    Then the response status code should be 400
    And an error message is returned