package com.hotelbay.api.stepdefinitions;


import io.cucumber.java.en.*;

public class RoomCategorySteps {

    @Given("a room category exists in the system")
    public void room_category_exists() {
        System.out.println("Room category exists");
    }

    @When("the admin creates a new room category")
    public void admin_creates_room_category() {
        System.out.println("Room category created");
    }

    @When("the admin updates the room category details")
    public void admin_updates_room_category() {
        System.out.println("Room category updated");
    }

    @When("the admin deletes a room category")
    public void admin_deletes_room_category() {
        System.out.println("Room category deleted");
    }

    @Then("the system should reflect the updated category information")
    public void system_reflects_changes() {
        System.out.println("Room category updated in system");
    }
}
