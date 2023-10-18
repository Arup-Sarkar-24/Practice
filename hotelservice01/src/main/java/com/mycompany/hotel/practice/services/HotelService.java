package com.mycompany.hotel.practice.services;
import java.util.List;
import com.mycompany.hotel.practice.entity.Hotel;

public interface HotelService {
    Hotel saveHotel(Hotel hotel);
    List<Hotel> getAllHotels();
    Hotel getHotel(String id);
    Hotel updateHotel(String id, Hotel updatedHotel);
    void deleteHotel(String id);

}

