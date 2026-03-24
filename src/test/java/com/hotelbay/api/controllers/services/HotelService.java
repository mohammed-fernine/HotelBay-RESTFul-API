package com.hotelbay.api.controllers.services;


import org.springframework.stereotype.Service;

@Service
public class HotelService {

    public String getHotelById(int id) {
        return "Hotel " + id;
    }
}

