Feature: Hotel Administration
  These scenarios allow administrators to manage hotels.

  Scenario: Create a hotel
    Given the administrator is logged into the system
    When the administrator provides hotel details such as name, address, and contact information
    Then the system should create a new hotel and save the information

  Scenario: Update hotel information
    Given a hotel already exists in the system
    When the administrator updates the hotel description or contact information
    Then the system should save the updated hotel information

  Scenario: List all hotels
    Given multiple hotels exist in the system
    When a user requests the list of hotels
    Then the system should return all registered hotels

  Scenario: Delete a hotel
    Given a hotel exists in the system
    When the administrator deletes the hotel
    Then the system should remove the hotel from the system



Feature: Room Management
  These scenarios allow administrators to manage rooms within hotels.

  Scenario: Create a room
    Given a hotel exists in the system
    When the administrator provides room details such as room number and type
    Then the system should create a new room and save the information

  Scenario: Update room information
    Given a room already exists in the system
    When the administrator updates room details such as price or availability
    Then the system should save the updated room information

  Scenario: List all rooms
    Given multiple rooms exist in the system
    When a user requests the list of rooms
    Then the system should return all rooms

  Scenario: Delete a room
    Given a room exists in the system
    When the administrator deletes the room
    Then the system should remove the room from the system



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