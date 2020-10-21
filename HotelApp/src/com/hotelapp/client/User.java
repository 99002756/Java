package com.hotelapp.client;


import java.util.List;


import com.hotelapp.model.Hotel;
import com.hotelapp.service.HotelService;
import com.hotelapp.service.HotelServiceImpl;

public class User {
	public static void main(String[] args) {
	HotelService hotelService=new HotelServiceImpl();
	List<Hotel> HotelList=hotelService.getAllHotels();
	for(Hotel hotel:HotelList) {
		System.out.println(hotel);
	}
	
}
}
