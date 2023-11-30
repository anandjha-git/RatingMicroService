package com.lcwd.user.service.services.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lcwd.user.service.entities.Rating;
import com.lcwd.user.service.exceptions.ResourceNotFoundException;
import com.lcwd.user.service.repositories.RatingRepository;
import com.lcwd.user.service.services.RatingService;

@Service
public class RatingServiceImpl implements RatingService{

	@Autowired
	private RatingRepository ratingRepository;
	
	//create 
	@Override
	public Rating create(Rating rating) {
		String randomRatingId= UUID.randomUUID().toString();
		rating.setRatingId(randomRatingId);
		return ratingRepository.save(rating);
	}
	
	//get all
	@Override
	public List<Rating> getAll() {
		return ratingRepository.findAll();
	}

	//get all by userId
	@Override
	public List<Rating> getRatingByUserId(String userId) {
		return ratingRepository.findByUserId(userId);
	}

	@Override
	public List<Rating> getRatingByHitelId(String hotelId) {
		return ratingRepository.findByHotelId(hotelId);
	}

	@Override
	public Rating getRating(String ratingId) {
		return ratingRepository.findById(ratingId).orElseThrow(()-> new ResourceNotFoundException("Rating with given id is not found !!"));
	}

}
