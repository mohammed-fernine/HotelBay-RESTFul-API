Feature : Hotel Administration

  Scenario: Create hotel Given an administrator is authenticated
    When the administrator submits a request to create a new hotel with name, description, location, and contact information
    Then the system should store the hotel information And the system should return the created hotel details

  Scenario: Update hotel information Ggit push -u origin feature/your-featureven a hotel already exists in the system
    When the administrator updates the hotel description or contact information
    Then the system should save the updated hotel information

  Scenario: Activate hotel
    Given a hotel exists but is inactive
    When the administrator activates the hotel
    Then the hotel should become available for room searches and reservations

  Scenario: Deactivate hotel
    Given a hotel exists and is active
    When the administrator deactivates the hotel
    Then the hotel should become unavailable for new reservations And existing reservations should remain valid

  Scenario: Consult hotel details
    Given a hotel exists in the system
    When a user requests the hotel details
    Then the system should return the hotel name, description, location, and services

  Scenario: List all hotels
    Given multiple hotels exist in the system
    When a user requests the list of hotels
    Then the system should return all registered hotels

hahaHh