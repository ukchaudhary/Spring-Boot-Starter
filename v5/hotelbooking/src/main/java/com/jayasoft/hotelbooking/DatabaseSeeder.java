package com.jayasoft.hotelbooking;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseSeeder implements CommandLineRunner {
	
	private BookingRepository bookingRepository;
	
	@Autowired
	public DatabaseSeeder(BookingRepository bookingRepository) {
		this.bookingRepository = bookingRepository;
	}
	
	@Override
	public void run(String... strings) throws Exception {
		List<HotelBooking> bookings = new ArrayList<>();
		
		bookings.add(new HotelBooking("Kanchan", 100, 10));
		bookings.add(new HotelBooking("Everest", 200, 3));
		bookings.add(new HotelBooking("Yak and Yeti", 300, 4));
		bookings.add(new HotelBooking("Soltee", 400, 1));
		
		bookingRepository.save(bookings);
	}

}
