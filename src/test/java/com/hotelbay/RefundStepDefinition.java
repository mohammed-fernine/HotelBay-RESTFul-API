package com.hotelbay;

import io.cucumber.core.backend.CucumberBackendException;
import io.cucumber.core.backend.CucumberInvocationTargetException;
import io.cucumber.core.backend.ParameterInfo;
import io.cucumber.core.backend.StepDefinition;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class RefundStepDefinition extends StepDefinitions {

    @Given("a guest has a canceled reservation eligible for a refund")
    public void a_guest_has_a_canceled_reservation_eligible_for_a_refund() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the client calls POST \\/refunds with the reservation ID")
    public void the_client_calls_post_refunds_with_the_reservation_id() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the client receives status code of {int}")
    public void the_client_receives_status_code_of(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the refund request is recorded as pending")
    public void the_refund_request_is_recorded_as_pending() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("a pending refund request exists")
    public void a_pending_refund_request_exists() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the administrator calls PUT \\/refunds\\/\\{id}\\/approve")
    public void the_administrator_calls_put_refunds_approve() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the administrator receives status code of {int}")
    public void the_administrator_receives_status_code_of(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the refund status is updated to approved")
    public void the_refund_status_is_updated_to_approved() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("an administrator has approved a refund request")
    public void an_administrator_has_approved_a_refund_request() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the system processes the transaction via PUT \\/refunds\\/\\{id}\\/process")
    public void the_system_processes_the_transaction_via_put_refunds_process() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the API returns status code of {int}")
    public void the_api_returns_status_code_of(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the refund status is marked as completed")
    public void the_refund_status_is_marked_as_completed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("a reservation is not eligible for a refund")
    public void a_reservation_is_not_eligible_for_a_refund() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("an error message is returned")
    public void an_error_message_is_returned() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
