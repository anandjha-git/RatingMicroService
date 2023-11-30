package com.lcwd.user.service.services;

import java.util.List;

import com.lcwd.user.service.entities.Rating;

public interface RatingService {
	
	//create
	Rating create(Rating rating);
	
	//get single rating by ratingId
	Rating getRating(String ratingId);
	
	//get all rating
	List<Rating>getAll();
	
	//get rating by userId
	List<Rating>getRatingByUserId(String userId);
	
	//get rating by hotelId
	List<Rating>getRatingByHitelId(String hotelId);

}
