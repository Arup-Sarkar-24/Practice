package com.mycompany.user.external.services;
import com.mycompany.user.entities.Hotel;
import com.mycompany.user.entities.Rating;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
@FeignClient(name = "HOTEL-SERVICE")
public interface HotelService {

    @GetMapping("/hotels/{hotelId}")
    Hotel getHotel(@PathVariable("hotelId") String hotelId);
   
}
