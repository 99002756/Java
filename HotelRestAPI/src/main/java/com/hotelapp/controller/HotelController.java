package com.hotelapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.hotelapp.model.Hotel;
import com.hotelapp.service.HotelService;

@RestController
public class HotelController {
	@Autowired
	HotelService hotelService;
	@GetMapping("/hotels")
	public List<Hotel> showAllHotels(){
		return hotelService.getAllHotels();
	}
	@GetMapping("/hotels-by-city/{city}")
	public List<Hotel> showBooksByAuthor(@PathVariable("city")String city){
		return hotelService.getByCity(city);
	}
	@GetMapping("/cuisines-list/{cuisine}")
	public List<Hotel> showBooksByCategory(@PathVariable("cuisine")String cuisine){
		return hotelService.getByCuisine(cuisine);
	}
	@GetMapping("/hotels-by-Id/{hotelId}")
	public Hotel showById(@PathVariable("hotelId")int id){
		return hotelService.getById(id);	
			
	} 

}
