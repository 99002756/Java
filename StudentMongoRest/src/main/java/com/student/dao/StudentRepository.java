package com.student.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.student.model.Student;

public interface StudentRepository extends MongoRepository<Student,Integer>{
	List<Student> findByAddressCity(String city);
	List<Student> findStudentsByDept(String dep);
	
	
	//@Query("from Student b where b.age>?20")
	List<Student> findByAge(int age);

}
