package com.kibernumacademy.hotel.repository;

import com.kibernumacademy.hotel.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IHotelRepository extends JpaRepository<Hotel, String> {
}
