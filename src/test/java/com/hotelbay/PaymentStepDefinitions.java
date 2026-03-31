package com.hotelbay;

import io.cucumber.java.en.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.http.MediaType;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

public class PaymentStepDefinitions {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private SharedData sharedData;

    // --- Scenario 1: Process payment ---
    @Given("the guest has a pending reservation")
    public void the_guest_has_a_pending_reservation() {}

    @When("the client calls POST \\/payments with a payment amount")
    public void the_client_calls_post_payments_with_amount() throws Exception {
        String jsonBody = "{\"bookingId\": \"1\", \"amount\": 150.00}";
        sharedData.action = mockMvc.perform(post("/payments")
                .contentType(MediaType.APPLICATION_JSON)
                .content(jsonBody));
    }

    @Then("the payment status is set to processing")
    public void the_payment_status_is_set_to_processing() throws Exception {
        sharedData.action.andExpect(jsonPath("$.paymentStatus").value("processing"));
    }

    // --- Scenario 2: Confirm payment ---
    @Given("a payment attempt is successful")
    public void a_payment_attempt_is_successful() {}

    @When("the system calls PUT \\/payments\\/\\{id}\\/confirm")
    public void the_system_calls_put_payments_confirm() throws Exception {
        sharedData.action = mockMvc.perform(put("/payments/1/confirm"));
    }

    @Then("the system returns status code of {int}")
    public void the_system_returns_status_code_of(Integer expectedCode) throws Exception {
        sharedData.action.andExpect(status().is(expectedCode));
    }

    @Then("the reservation state changes to confirmed")
    public void the_reservation_state_changes_to_confirmed() throws Exception {
        sharedData.action.andExpect(jsonPath("$.reservationState").value("confirmed"));
    }

    // --- Scenario 3: Handle payment failure ---
    @Given("the client provides invalid payment details")
    public void the_client_provides_invalid_payment_details() {}

    @When("the client calls POST \\/payments")
    public void the_client_calls_post_payments() throws Exception {
        // We simulate a failure by sending a negative amount
        String jsonBody = "{\"bookingId\": \"1\", \"amount\": -50.00}";
        sharedData.action = mockMvc.perform(post("/payments")
                .contentType(MediaType.APPLICATION_JSON)
                .content(jsonBody));
    }

    @Then("an error message is returned")
    public void an_error_message_is_returned() throws Exception {
        sharedData.action.andExpect(jsonPath("$.error").exists());
    }

    @Then("the reservation remains in a pending state")
    public void the_reservation_remains_in_a_pending_state() throws Exception {
        sharedData.action.andExpect(jsonPath("$.reservationState").value("pending"));
    }
}