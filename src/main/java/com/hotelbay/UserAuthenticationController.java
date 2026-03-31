package com.hotelbay;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/users") // Changed to match your feature file!
public class UserAuthenticationController {

    @PostMapping("/register")
    public ResponseEntity<Map<String, String>> register(@RequestBody Map<String, String> userDetails) {
        // Simulates successful registration
        return ResponseEntity.status(201).body(Map.of("message", "User created successfully"));
    }

    @PostMapping("/login")
    public ResponseEntity<Map<String, String>> login(@RequestBody Map<String, String> creds) {
        // Simulates a successful login by returning a fake token
        return ResponseEntity.ok(Map.of("token", "fake-jwt-token-123"));
    }

    @PostMapping("/logout")
    public ResponseEntity<Map<String, String>> logout() {
        // Simulates a successful logout
        return ResponseEntity.ok(Map.of("message", "Logged out successfully"));
    }
}