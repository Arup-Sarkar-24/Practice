package com.mycompany.hotel.practice.controllers;

import com.mycompany.hotel.practice.entity.Hotel;
import com.mycompany.hotel.practice.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class HotelController {

    private final HotelService hotelService;

    @Autowired
    public HotelController(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    @PostMapping("hotel")
    public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel) {
        Hotel createdHotel = hotelService.saveHotel(hotel);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdHotel);
    }

    @GetMapping("hotel/{id}")
    public ResponseEntity<Hotel> getHotel(@PathVariable String id) {
        Hotel hotel = hotelService.getHotel(id);
        return ResponseEntity.ok(hotel);
    }

    @GetMapping("hotels")
    public ResponseEntity<List<Hotel>> getAllHotels() {
        List<Hotel> allHotels = hotelService.getAllHotels();
        return ResponseEntity.ok(allHotels);
    }

    @PutMapping("hotel/{id}")
    public ResponseEntity<Hotel> updateHotel(@PathVariable String id, @RequestBody Hotel updatedHotel) {
        Hotel updated = hotelService.updateHotel(id, updatedHotel);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("hotel/{id}")
    public ResponseEntity<Void> deleteHotel(@PathVariable String id) {
        hotelService.deleteHotel(id);
        return ResponseEntity.noContent().build();
    }
}
