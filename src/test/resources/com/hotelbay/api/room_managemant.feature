Feature: Room Management

  Scenario: Create room
    Given a hotel exists in the system
    When an administrator adds a new room with identifier, type, capacity, and price
    Then the system should store the room information
    And associate the room with the hotel

  Scenario: Update room information
    Given a room exists in a hotel
    When the administrator updates the room description or price
    Then the system should save the updated room information

