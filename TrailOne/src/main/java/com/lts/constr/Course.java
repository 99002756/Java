package com.lts.constr;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Course {
	String courseName;
	Double price;
	public String getCourseName() {
		return courseName;
	}
	@Value("${student.course.name}")
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Double getPrice() {
		return price;
	}
	@Value("${student.course.price}")
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", price=" + price + "]";
	}
	
	
}
