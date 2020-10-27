package com.example.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class NewController {
	@GetMapping("/user/show")
	public String showMessage() {
		return "hello";
	}
	@GetMapping("/user/greet")
	public String greet() {
		return "Have a great day";
	}
	@GetMapping("/edit")
	public String editProduct() {
		return "edited";
	}
	@GetMapping("/add") 
	public String addProduct() {
		return "added";
	}
}
