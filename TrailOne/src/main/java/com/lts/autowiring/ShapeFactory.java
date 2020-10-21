package com.lts.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ShapeFactory {
	@Autowired
	@Qualifier("triangle")
	Shape shape;
	@Autowired
	@Qualifier("rectangle")
	Shape oshape;
	public void printArea(int x,int y, int z) {
		
		if(z==1)
			shape.calculateArea(x, y);
		else
			oshape.calculateArea(x, y);
	}
}
