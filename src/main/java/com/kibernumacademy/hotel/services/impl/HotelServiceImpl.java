package com.kibernumacademy.hotel.services.impl;

import com.kibernumacademy.hotel.entity.Hotel;
import com.kibernumacademy.hotel.exceptions.ResourceNotFoundException;
import com.kibernumacademy.hotel.repository.IHotelRepository;
import com.kibernumacademy.hotel.services.IHotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements IHotelService {

  @Autowired
  private IHotelRepository hotelRepository;
  @Override
  public Hotel create(Hotel hotel) {
    String hotelId = UUID.randomUUID().toString();
    hotel.setId(hotelId);
    return hotelRepository.save(hotel);
  }

  @Override
  public List<Hotel> getAll() {
    return hotelRepository.findAll();
  }

  @Override
  public Hotel get(String id) {
    return hotelRepository.findById(id).orElseThrow( () -> new ResourceNotFoundException("Hotel not found with the id: " + id));
  }
}
