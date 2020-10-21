package com.lts;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.lts.autowiring.Shape;
import com.lts.autowiring.ShapeFactory;
import com.lts.constr.Student;
import com.lts.foodwiring.FoodPanda;
import com.lts.setter.Employee;

@SpringBootApplication
public class TrailOneApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(TrailOneApplication.class, args);
	}
	@Autowired
	ApplicationContext context;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*Student student=context.getBean("student",Student.class);
		System.out.println(student);
		Employee employee=context.getBean("employee",Employee.class);
		System.out.println(employee);*/
		ShapeFactory shapeFactory = context.getBean(ShapeFactory.class);
		shapeFactory.printArea(20, 10,5);
		
		FoodPanda foodPanda=context.getBean(FoodPanda.class);
		System.out.println(foodPanda.showMenu("indian"));
		
		List<String> list=foodPanda.showMenu("indian");
		for(String s:list)
		{
			System.out.println(s);
		}
		System.out.println("----------------------");
		List<String> list1=foodPanda.showMenu("chinese");
		for(String s:list1)
		{
			System.out.println(s);
		}
	}

}
