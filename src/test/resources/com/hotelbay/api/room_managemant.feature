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

  Scenario: Delete room
    Given a room exists in a hotel
    When the administrator deletes the room
    Then the room should be removed from the list of available rooms
    And past reservations should remain recorded

  Scenario: Search rooms
    Given multiple hotels and rooms exist in the system
    When a user searches for rooms using filters such as location, category, price, and dates
    Then the system should return rooms that match the search criteria and are available

  Scenario: View room details
    Given a room exists in the system
    When a user requests the room details
    Then the system should return the room type, capacity, price, and description