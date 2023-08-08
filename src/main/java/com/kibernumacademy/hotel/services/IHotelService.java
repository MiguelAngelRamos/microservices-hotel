package com.kibernumacademy.hotel.services;

import com.kibernumacademy.hotel.entity.Hotel;

import java.util.List;

public interface IHotelService {

  // crear
  Hotel create(Hotel hotel);
  // listar los hoteles
  List<Hotel> getAll();
  // Obtener un hotel por id
  Hotel get(String id);
}
