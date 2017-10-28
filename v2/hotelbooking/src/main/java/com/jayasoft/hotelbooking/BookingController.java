package com.jayasoft.hotelbooking;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/bookings")
public class BookingController {
	private List<HotelBooking> bookings;

	public BookingController() {
		bookings = new ArrayList<>();
		
		bookings.add(new HotelBooking("Everest", 200, 3));
		bookings.add(new HotelBooking("Yak and Yeti", 300, 4));
		bookings.add(new HotelBooking("Soltee", 500, 1));
	}
	
	@RequestMapping(value = "/all", method=RequestMethod.GET)
	public List<HotelBooking> getAll() {
		return bookings;
	}
	
	@RequestMapping(value = "/affordable/{price}", method=RequestMethod.GET)
	public List<HotelBooking> getAffordable(@PathVariable double price) {
		return bookings.stream().filter(x -> x.getPricePerNight() <= price).collect(Collectors.toList());
	}
	
	@RequestMapping(value = "/create", method=RequestMethod.POST)
	public List<HotelBooking> create(@RequestBody HotelBooking hotelbooking) {
		bookings.add(hotelbooking);
		return bookings;
	}
}
