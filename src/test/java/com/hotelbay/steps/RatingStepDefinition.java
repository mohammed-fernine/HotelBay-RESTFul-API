package com.hotelbay.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RatingStepDefinition {

    @Given("a guest has completed their stay")
    public void a_guest_has_completed_their_stay() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the client calls POST \\/hotels\\/\\{hotelId}\\/ratings with a score")
    public void the_client_calls_post_hotels_ratings_with_a_score() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the rating is saved")
    public void the_rating_is_saved() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("a hotel has ratings")
    public void a_hotel_has_ratings() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the client calls GET \\/hotels\\/\\{hotelId}\\/rating")
    public void the_client_calls_get_hotels_rating() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the system returns the average rating")
    public void the_system_returns_the_average_rating() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("a guest has submitted a rating")
    public void a_guest_has_submitted_a_rating() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the client calls PUT \\/ratings\\/\\{id} with a new score")
    public void the_client_calls_put_ratings_with_a_new_score() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the rating is updated")
    public void the_rating_is_updated() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
