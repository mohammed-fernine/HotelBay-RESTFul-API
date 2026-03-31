package com.hotelbay;

import io.cucumber.java.en.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.http.MediaType;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

public class UserAuthenticationStepDefinitions {

    @Autowired
    private MockMvc mockMvc;

    // 1. Bring in the shared memory
    @Autowired
    private SharedData sharedData;

    // --- User Registration ---
    @Given("the client provides valid registration details")
    public void the_client_provides_valid_registration_details() {}

    @When("the client calls POST \\/users\\/register")
    public void the_client_calls_post_users_register() throws Exception {
        String jsonBody = "{\"username\": \"filip\", \"password\": \"secret\"}";
        // 2. Save the result to the shared memory!
        sharedData.action = mockMvc.perform(post("/users/register")
                .contentType(MediaType.APPLICATION_JSON)
                .content(jsonBody));
    }

    @Then("a new user account is created")
    public void a_new_user_account_is_created() throws Exception {
        sharedData.action.andExpect(status().is2xxSuccessful());
    }

    // --- User Login ---
    @Given("the client provides valid login credentials")
    public void the_client_provides_valid_login_credentials() {}

    @When("the client calls POST \\/users\\/login")
    public void the_client_calls_post_users_login() throws Exception {
        String jsonBody = "{\"username\": \"filip\", \"password\": \"secret\"}";
        sharedData.action = mockMvc.perform(post("/users/login")
                .contentType(MediaType.APPLICATION_JSON)
                .content(jsonBody));
    }

    @Then("the system returns an authentication token")
    public void the_system_returns_an_authentication_token() throws Exception {
        sharedData.action.andExpect(jsonPath("$.token").exists());
    }

    // --- User Logout ---
    @Given("the client is logged in")
    public void the_client_is_logged_in() {}

    @When("the client calls POST \\/users\\/logout")
    public void the_client_calls_post_users_logout() throws Exception {
        sharedData.action = mockMvc.perform(post("/users/logout"));
    }

    @Then("the authentication token is invalidated")
    public void the_authentication_token_is_invalidated() throws Exception {
        // We only check for the message here, the generic step handles the 200 status!
        sharedData.action.andExpect(jsonPath("$.message").value("Logged out successfully"));
    }
}