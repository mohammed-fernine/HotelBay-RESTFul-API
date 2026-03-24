package com.hotelbay.api;


import io.cucumber.java.en.*;

public class HotelSteps {

    @Given("a hotel already exists in the system")
    public void a_hotel_exists() {
        System.out.println("Hotel exists");
    }

    @When("the administrator updates the hotel description or contact information")
    public void update_hotel() {
        System.out.println("Updating hotel info");
    }

    @Then("the system should save the updated hotel information")
    public void save_hotel() {
        System.out.println("Hotel saved");
    }
}