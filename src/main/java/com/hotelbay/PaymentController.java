package com.hotelbay;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @PostMapping
    public ResponseEntity<Map<String, String>> processPayment(@RequestBody Map<String, Object> paymentDetails) {
        // If the amount is negative, simulate a 400 Bad Request (Failure Scenario)
        if (paymentDetails.containsKey("amount") && (Double) paymentDetails.get("amount") < 0) {
            return ResponseEntity.status(400).body(Map.of(
                    "error", "Invalid payment amount",
                    "reservationState", "pending" // <-- This is the exact line we needed to add!
            ));
        }

        // Otherwise, simulate a 201 Created (Success Scenario)
        return ResponseEntity.status(201).body(Map.of(
                "paymentId", "pay-123",
                "paymentStatus", "processing"
        ));
    }

    @PutMapping("/{id}/confirm")
    public ResponseEntity<Map<String, String>> confirmPayment(@PathVariable String id) {
        // Simulate a 200 OK for confirming the payment
        return ResponseEntity.ok(Map.of(
                "paymentId", id,
                "paymentStatus", "completed",
                "reservationState", "confirmed"
        ));
    }
}