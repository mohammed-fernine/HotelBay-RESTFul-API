package com.hotelbay.steps;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PaymentManagementStepDefinition {
    @Given("the guest has a pending reservation")
    public void theGuestHasAPendingReservation() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("the client calls POST \\/payments with a payment amount")
    public void theClientCallsPOSTPaymentsWithAPaymentAmount() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("the payment status is set to processing")
    public void thePaymentStatusIsSetToProcessing() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("a payment attempt is successful")
    public void aPaymentAttemptIsSuccessful() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("the system calls PUT \\/payments\\/\\{id}\\/confirm")
    public void theSystemCallsPUTPaymentsIdConfirm() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("the system returns status code of {int}")
    public void theSystemReturnsStatusCodeOf(int arg0) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("the reservation state changes to confirmed")
    public void theReservationStateChangesToConfirmed() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("the client provides invalid payment details")
    public void theClientProvidesInvalidPaymentDetails() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("the client calls POST \\/payments")
    public void theClientCallsPOSTPayments() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("the reservation remains in a pending state")
    public void theReservationRemainsInAPendingState() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
