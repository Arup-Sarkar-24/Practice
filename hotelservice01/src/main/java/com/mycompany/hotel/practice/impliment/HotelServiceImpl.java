package com.mycompany.hotel.practice.impliment;
import com.mycompany.hotel.practice.entity.Hotel;
import com.mycompany.hotel.practice.exceptions.ResourceNotFoundException;
import com.mycompany.hotel.practice.repositories.HotelRepository;
import com.mycompany.hotel.practice.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService {

    private final HotelRepository hotelRepository;

    @Autowired
    public HotelServiceImpl(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }
    
    @Override
    public Hotel saveHotel(Hotel hotel) {
    	String randomId= UUID.randomUUID().toString();
    	hotel.setId(randomId);
        return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> getAllHotels() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel getHotel(String id) {
        return hotelRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Hotel not found with id: " + id));
    }

    @Override
    public Hotel updateHotel(String id, Hotel updatedHotel) {
        Hotel existingHotel = hotelRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Hotel not found with id: " + id));

        existingHotel.setName(updatedHotel.getName());
        existingHotel.setLocation(updatedHotel.getLocation());
        existingHotel.setAbout(updatedHotel.getAbout());

        return hotelRepository.save(existingHotel);
    }

    @Override
    public void deleteHotel(String id) {
        Hotel hotelToDelete = hotelRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Hotel not found with id: " + id));

        hotelRepository.delete(hotelToDelete);
    }
}
