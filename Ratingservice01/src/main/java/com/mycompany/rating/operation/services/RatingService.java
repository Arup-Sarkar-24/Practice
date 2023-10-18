package com.mycompany.rating.operation.services;

import java.util.List;

import com.mycompany.rating.operation.entities.Rating;


public interface RatingService {
	//Create
	Rating create(Rating rating);
	//gt all ratings
	List<Rating> getAllRatings();
	//get all by userId
	List<Rating> getRatingByUserId(String UserId);
	//get all by Hotel
	List<Rating> getRatingByHotelId(String hotelId);
	//Rating updateRating(String id, Rating updateRating);
	//void deleteRating(String id);
}
