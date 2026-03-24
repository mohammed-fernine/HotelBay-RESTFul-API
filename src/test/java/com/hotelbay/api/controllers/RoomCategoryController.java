package com.hotelbay.api.controllers;



import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/room-categories")
public class RoomCategoryController {

    private List<String> categories = new ArrayList<>();

    @PostMapping
    public ResponseEntity<String> createCategory() {
        categories.add("Deluxe");
        return ResponseEntity.ok("Room category created");
    }

    @GetMapping
    public ResponseEntity<List<String>> getCategories() {
        return ResponseEntity.ok(categories);
    }
}