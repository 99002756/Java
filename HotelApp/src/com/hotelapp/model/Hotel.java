package com.hotelapp.model;

public class Hotel {
	Integer hotelId;
	String hotelName;
	String city;
	String Cuisine;
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hotel(Integer hotelId, String hotelName, String city, String cuisine) {
		super();
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.city = city;
		Cuisine = cuisine;
	}
	public Integer getHotelId() {
		return hotelId;
	}
	public void setHotelId(Integer hotelId) {
		this.hotelId = hotelId;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCuisine() {
		return Cuisine;
	}
	public void setCuisine(String cuisine) {
		Cuisine = cuisine;
	}
	@Override
	public String toString() {
		return "Hotel [hotelId=" + hotelId + ", hotelName=" + hotelName + ", city=" + city + ", Cuisine=" + Cuisine
				+ "]";
	}
	

}
