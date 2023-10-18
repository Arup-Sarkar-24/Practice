package com.mycompany.rating.operation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mycompany.rating.operation.entities.Rating;
@Repository
public interface RatingRepository extends JpaRepository<Rating, String> {
	
	//custom finder methods
	List<Rating> findByUserId(String userId);
	List<Rating> findByHotelId(String hotelId);

}
