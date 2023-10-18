package com.mycompany.rating.operation.entities;

import jakarta.persistence.*;
@Entity
@Table(name = "user_ratings")
public class Rating {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rating_id", length = 20)
    private Long ratingId;
	@Column(name = "User_Id", length = 50)
	private String userId;
	@Column(name = "Hotel_Id", length = 50)
	private String hotelId;
	@Column(name = "rating", length = 10)
	private String rating;
	@Column(name = "feedback", length = 300)
	private String feedback;
	
	@Transient
	private Hotel hotel;
	
	public Long getRatingId() {
		return ratingId;
	}
	public void setRatingId(Long ratingId) {
		this.ratingId = ratingId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getHotelId() {
		return hotelId;
	}
	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	
	public Rating(Long ratingId, String userId, String hotelId, String rating, String feedback, Hotel hotel) {
		super();
		this.ratingId = ratingId;
		this.userId = userId;
		this.hotelId = hotelId;
		this.rating = rating;
		this.feedback = feedback;
		this.hotel = hotel;
	}
	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	public Rating(Long ratingId, String userId, String hotelId, String rating, String feedback) {
		super();
		this.ratingId = ratingId;
		this.userId = userId;
		this.hotelId = hotelId;
		this.rating = rating;
		this.feedback = feedback;
	}
	public Rating() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Rating [ratingId=" + ratingId + ", userId=" + userId + ", hotelId=" + hotelId + ", rating=" + rating
				+ ", feedback=" + feedback + ", hotel=" + hotel + "]";
	}
	

}
