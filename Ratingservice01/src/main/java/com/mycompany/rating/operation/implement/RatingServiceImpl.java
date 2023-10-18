package com.mycompany.rating.operation.implement;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import com.mycompany.rating.operation.entities.Rating;
import com.mycompany.rating.operation.repository.RatingRepository;
import com.mycompany.rating.operation.services.RatingService;
@Service
public class RatingServiceImpl  implements RatingService{
	@Autowired
	public RatingRepository ratingRepository;
	@Override
	public Rating create(Rating rating) {
		String randomRatingId = UUID.randomUUID().toString();
        rating.setUserId(randomRatingId);
		return ratingRepository.save(rating);
	}
	@Override
	public List<Rating> getAllRatings() {
		return ratingRepository.findAll();
	}
	@Override
	public List<Rating> getRatingByUserId(String UserId) {
		return ratingRepository.findByUserId(UserId);
	}
	@Override
	public List<Rating> getRatingByHotelId(String hotelId) {
		return ratingRepository.findByHotelId(hotelId);
	}

	
}
