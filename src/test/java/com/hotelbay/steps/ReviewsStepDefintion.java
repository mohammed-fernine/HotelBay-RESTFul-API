package com.hotelbay.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ReviewsStepDefintion {
    @Given("a hotel has received reviews from past guests")
    public void a_hotel_has_received_reviews_from_past_guests() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @When("the client calls GET \\/hotels\\/\\{hotelId}\\/reviews")
    public void the_client_calls_get_hotels_reviews() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @Then("the response status code should be {int}")
    public void the_response_status_code_should_be(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @Then("the system returns a list of reviews")
    public void the_system_returns_a_list_of_reviews() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }

    @Given("a guest has previously submitted a review")
    public void a_guest_has_previously_submitted_a_review() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @When("the client calls PUT \\/reviews\\/\\{id} with an updated description")
    public void the_client_calls_put_reviews_with_an_updated_description() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @Then("the system updates the review text")
    public void the_system_updates_the_review_text() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }

    @Given("a guest has a completed reservation for the hotel")
    public void a_guest_has_a_completed_reservation_for_the_hotel() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @When("the client calls POST \\/hotels\\/\\{hotelId}\\/reviews with a textual description")
    public void the_client_calls_post_hotels_reviews_with_a_textual_description() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @Then("the review is saved to the hotel profile")
    public void the_review_is_saved_to_the_hotel_profile() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
}
