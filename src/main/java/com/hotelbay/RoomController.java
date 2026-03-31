package com.hotelbay;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/rooms")
public class RoomController {

    @GetMapping("/availability")
    public ResponseEntity<List<Map<String, String>>> getAvailability() {
        return ResponseEntity.ok(List.of(
                Map.of("roomNumber", "101", "type", "Single"),
                Map.of("roomNumber", "102", "type", "Double")
        ));
    }
}