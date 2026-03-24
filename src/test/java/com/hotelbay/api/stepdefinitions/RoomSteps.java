package com.hotelbay.api.stepdefinitions;


import io.cucumber.java.en.*;

public class RoomSteps {

    @Given("a room already exists in the hotel")
    public void room_exists() {
        System.out.println("Room exists");
    }

    @When("the administrator updates the room details")
    public void update_room() {
        System.out.println("Updating room");
    }

    @Then("the system should save the updated room information")
    public void save_room() {
        System.out.println("Room saved");
    }
}