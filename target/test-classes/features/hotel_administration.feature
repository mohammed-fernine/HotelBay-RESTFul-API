Feature: Hotel Administration
  

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








