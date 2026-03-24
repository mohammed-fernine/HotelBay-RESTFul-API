package com.hotelbay.api.controllers.services;


import org.springframework.stereotype.Service;

@Service
public class RoomService {

    public String getRoomById(int id) {
        return "Room " + id;
    }

    public String createRoom() {
        return "Room created";
    }
}
