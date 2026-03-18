Feature: Hotel Administration

Scenario: List all hotels
  Given multiple hotels exist in the system
  When a user requests the list of hotels
  Then the system should return all registered hotels