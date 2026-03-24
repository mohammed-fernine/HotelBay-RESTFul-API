



Feature: Room Category Management
  These scenarios allow administrators to manage room categories.

  Scenario: Create a room category
    Given the administrator is logged into the system
    When the administrator provides room category details such as name and description
    Then the system should create a new room category

  Scenario: Update room category
    Given a room category already exists in the system
    When the administrator updates the room category details
    Then the system should save the updated information

  Scenario: List all room categories
    Given multiple room categories exist in the system
    When a user requests the list of room categories
    Then the system should return all categories

  Scenario: Delete a room category
    Given a room category exists in the system
    When the administrator deletes the category
    Then the system should remove the category from the system