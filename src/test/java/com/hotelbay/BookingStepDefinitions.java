package com.hotelbay;

import io.cucumber.java.en.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.http.MediaType;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

public class BookingStepDefinitions {

    @Autowired
    private MockMvc mockMvc;

    // 1. Bring in the shared memory
    @Autowired
    private SharedData sharedData;

    @Given("the client is authenticated as a guest")
    public void the_client_is_authenticated_as_a_guest() {}

    @When("the client calls POST \\/bookings with reservation details")
    public void the_client_calls_post_bookings() throws Exception {
        String jsonBody = "{\"guestName\": \"Filip\", \"roomType\": \"Double\"}";
        // 2. Use shared memory
        sharedData.action = mockMvc.perform(post("/bookings").contentType(MediaType.APPLICATION_JSON).content(jsonBody));
    }

    // THIS IS THE GENERIC STEP THAT CRASHED BEFORE!
    // Now it safely looks inside the shared memory.
    @Then("the client receives status code of {int}")
    public void the_client_receives_status_code_of(Integer expectedCode) throws Exception {
        sharedData.action.andExpect(status().is(expectedCode));
    }

    @Then("the pending booking is saved")
    public void the_pending_booking_is_saved() throws Exception {
        sharedData.action.andExpect(jsonPath("$.guestName").value("Filip"));
    }

    @Given("the guest has a confirmed reservation")
    public void the_guest_has_a_confirmed_reservation() {}

    @When("the client calls PUT \\/bookings\\/\\{id}\\/cancel")
    public void the_client_calls_put_bookings_cancel() throws Exception {
        sharedData.action = mockMvc.perform(put("/bookings/1/cancel"));
    }

    @Then("the reservation is marked as canceled")
    public void the_reservation_is_marked_as_canceled() throws Exception {
        sharedData.action.andExpect(jsonPath("$.status").value("canceled"));
    }

    @Given("the guest has an existing reservation")
    public void the_guest_has_an_existing_reservation() {}

    @When("the client calls GET \\/bookings\\/\\{id}")
    public void the_client_calls_get_bookings_id() throws Exception {
        sharedData.action = mockMvc.perform(get("/bookings/1"));
    }

    @Then("the system returns the reservation details")
    public void the_system_returns_the_reservation_details() throws Exception {
        sharedData.action.andExpect(status().isOk());
    }

    @When("the client calls GET \\/users\\/\\{userId}\\/bookings")
    public void the_client_calls_get_users_bookings() throws Exception {
        sharedData.action = mockMvc.perform(get("/users/1/bookings"));
    }

    @Then("the system returns a list of the user's reservations")
    public void the_system_returns_list() throws Exception {
        sharedData.action.andExpect(status().isOk());
    }

    @Given("the user provides check-in and check-out dates")
    public void the_user_provides_dates() {}

    @When("the client calls GET \\/rooms\\/availability")
    public void the_client_calls_get_rooms_availability() throws Exception {
        sharedData.action = mockMvc.perform(get("/rooms/availability"));
    }

    @Then("the system returns a list of available rooms")
    public void the_system_returns_rooms() throws Exception {
        sharedData.action.andExpect(status().isOk());
    }
}