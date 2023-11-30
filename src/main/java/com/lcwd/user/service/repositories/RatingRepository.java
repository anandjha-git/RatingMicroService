package com.lcwd.user.service.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lcwd.user.service.entities.Rating;

public interface RatingRepository extends JpaRepository<Rating, String> {
	
	//custom finder methods-> these methods are not provided by JPARepository like save(),delete(),findAll(),findById()...
	
	List<Rating>findByUserId(String userId);
	List<Rating>findByHotelId(String hotelId);
}
