package com.student.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
import com.student.model.Student;
import com.studentapp.exceptions.StudentNotFoundException;
public interface StudentRepository extends MongoRepository<Student,Integer>{
	List<Student> findByAddressCity(String city)throws StudentNotFoundException;
	List<Student> findStudentsByDept(String dep)throws StudentNotFoundException;
	
	
	//@Query("from Student b where b.age>?20")
	List<Student> findByAge(int age);

}
