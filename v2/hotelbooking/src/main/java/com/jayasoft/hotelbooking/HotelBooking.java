package com.jayasoft.hotelbooking;

public class HotelBooking {
	private String hotelName;
	private double pricePerNight;
	private int nbOfNight;
	
	public HotelBooking() {
	}

	public HotelBooking(String hotelName, double pricePerNight, int nbOfNight) {
		this.hotelName = hotelName;
		this.pricePerNight = pricePerNight;
		this.nbOfNight = nbOfNight;
	}

	public String getHotelName() {
		return hotelName;
	}

	public double getPricePerNight() {
		return pricePerNight;
	}

	public int getNbOfNight() {
		return nbOfNight;
	}
	
	public double getTotalPrice() {
		return pricePerNight * nbOfNight;
	}
	
}
