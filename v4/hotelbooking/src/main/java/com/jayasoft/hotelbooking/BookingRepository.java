package com.jayasoft.hotelbooking;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<HotelBooking, Long> {	
	//https://docs.spring.io/spring-data/jpa/docs/1.5.0.RELEASE/reference/html/jpa.repositories.html
	List<HotelBooking> findByPricePerNightLessThan(double price); //No Implementation Required
}
