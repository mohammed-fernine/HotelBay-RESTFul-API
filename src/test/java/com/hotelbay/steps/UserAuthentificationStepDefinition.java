package com.hotelbay.steps;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class UserAuthentificationStepDefinition {
    @Given("the client provides valid registration details")
    public void theClientProvidesValidRegistrationDetails() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("the client calls POST \\/users\\/register")
    public void theClientCallsPOSTUsersRegister() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("a new user account is created")
    public void aNewUserAccountIsCreated() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("the client provides valid login credentials")
    public void theClientProvidesValidLoginCredentials() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("the client calls POST \\/users\\/login")
    public void theClientCallsPOSTUsersLogin() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("the system returns an authentication token")
    public void theSystemReturnsAnAuthenticationToken() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("the client is logged in")
    public void theClientIsLoggedIn() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("the client calls POST \\/users\\/logout")
    public void theClientCallsPOSTUsersLogout() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("the authentication token is invalidated")
    public void theAuthenticationTokenIsInvalidated() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
