package com.hotelbay.api.controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    @GetMapping("/{id}")
    public ResponseEntity<String> getHotel(@PathVariable int id) {
        return ResponseEntity.ok("Hotel " + id + " found");
    }
}