package com.mycompany.rating.operation.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.rating.operation.entities.Rating;
import com.mycompany.rating.operation.services.RatingService;

@RestController
@RequestMapping("/")
public class RatingController {

	private final RatingService ratingService;
	@Autowired
	public RatingController(RatingService ratingService) {
		this.ratingService=ratingService;
	}

	// create rating
	@PostMapping("rate")
	public ResponseEntity<Rating> create(@RequestBody Rating rating) {
		return ResponseEntity.status(HttpStatus.CREATED).body(ratingService.create(rating));
	}

	// get all ratings
	@GetMapping("ratings")
	public ResponseEntity<List<Rating>> getRatings() {
		return ResponseEntity.ok(ratingService.getAllRatings());
	}

	// get ratings By userId
	@GetMapping("user/{userId}")
	public ResponseEntity<List<Rating>> getRatingsUserId(@PathVariable String userId) {
		return ResponseEntity.ok(ratingService.getRatingByUserId(userId));
	}

	// get ratings by hotelId
	@GetMapping("hotel/{hotelId}")
	public ResponseEntity<List<Rating>> getRatingsByHotelId(@PathVariable String hotelId) {
		return ResponseEntity.ok(ratingService.getRatingByHotelId(hotelId));
	}

}
