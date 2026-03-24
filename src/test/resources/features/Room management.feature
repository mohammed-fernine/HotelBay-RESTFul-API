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
