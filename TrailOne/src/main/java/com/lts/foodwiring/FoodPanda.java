package com.lts.foodwiring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FoodPanda {
	@Autowired
	@Qualifier("indian")
	Menu imenu;
	@Autowired
	@Qualifier("chinese")
	Menu cmenu;
	public List<String> showMenu(String choice) {
		if(choice.equals("indian"))
		  return imenu.itemsAvailable();
		else
		return cmenu.itemsAvailable();
	}
}
