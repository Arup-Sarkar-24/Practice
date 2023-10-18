package com.mycompany.hotel.practice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mycompany.hotel.practice.entity.Hotel;
@Repository
public interface HotelRepository extends JpaRepository<Hotel, String> {

}
