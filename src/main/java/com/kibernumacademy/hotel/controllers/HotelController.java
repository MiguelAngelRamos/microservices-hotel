package com.kibernumacademy.hotel.controllers;

import com.kibernumacademy.hotel.entity.Hotel;
import com.kibernumacademy.hotel.services.IHotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {

  @Autowired
  private IHotelService hotelService;

  @PostMapping
  public ResponseEntity<Hotel> saveHotel(@RequestBody Hotel hotel) {
    return ResponseEntity.status(HttpStatus.CREATED).body(hotelService.create(hotel));
  }

  @GetMapping
  public ResponseEntity<List<Hotel>> listHotels() {
    return ResponseEntity.status(HttpStatus.OK).body(hotelService.getAll());
  }

  @GetMapping("{hotelId}")
  public ResponseEntity<Hotel> getHotel(@PathVariable String hotelId) {
    return ResponseEntity.status(HttpStatus.OK).body(hotelService.get(hotelId));
  }

}
