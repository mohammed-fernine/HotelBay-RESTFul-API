Feature: Room Category Management

  Scenario: Create room category
    Given an administrator is authenticated
    When the administrator creates a new room category such as "Single" or "Suite"
    Then the system should store the new category

  Scenario: Update room category
    Given a room category exists in the system
    When the administrator updates the category name or description
    Then the system should save the updated category information

  Scenario: Delete room category
    Given a room category exists
    When the administrator deletes the category
    Then the category should be removed from the system
    And historical reservation information should remain unaffected

  Scenario: List room categories
    Given several room categories exist in the system
    When a user requests the list of room categories
    Then the system should return all available room categories