package com.hotelbay.api.controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rooms")
public class RoomController {

    @GetMapping("/{id}")
    public ResponseEntity<String> getRoom(@PathVariable int id) {
        return ResponseEntity.ok("Room " + id + " found");
    }

    @PostMapping
    public ResponseEntity<String> createRoom() {
        return ResponseEntity.ok("Room created successfully");
    }
}