package com.hotelbay.steps;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class BookingManagementStepDefinition {
    @Given("the client is authenticated as a guest")
    public void theClientIsAuthenticatedAsAGuest() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("the client calls POST \\/bookings with reservation details")
    public void theClientCallsPOSTBookingsWithReservationDetails() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("the pending booking is saved")
    public void thePendingBookingIsSaved() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("the guest has a confirmed reservation")
    public void theGuestHasAConfirmedReservation() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("the client calls PUT \\/bookings\\/\\{id}\\/cancel")
    public void theClientCallsPUTBookingsIdCancel() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("the reservation is marked as canceled")
    public void theReservationIsMarkedAsCanceled() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("the guest has an existing reservation")
    public void theGuestHasAnExistingReservation() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("the client calls GET \\/bookings\\/\\{id}")
    public void theClientCallsGETBookingsId() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("the system returns the reservation details")
    public void theSystemReturnsTheReservationDetails() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("the client calls GET \\/users\\/\\{userId}\\/bookings")
    public void theClientCallsGETUsersUserIdBookings() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("the system returns a list of the user's reservations")
    public void theSystemReturnsAListOfTheUserSReservations() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("the user provides check-in and check-out dates")
    public void theUserProvidesCheckInAndCheckOutDates() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("the client calls GET \\/rooms\\/availability")
    public void theClientCallsGETRoomsAvailability() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("the system returns a list of available rooms")
    public void theSystemReturnsAListOfAvailableRooms() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
