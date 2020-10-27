package com.student.service;

import java.util.List;

import com.student.exception.StudentNotFoundException;
import com.student.model.Student;

public interface StudentService {
	Student addStudent(Student student);
	Student getStudentById(int id) throws StudentNotFoundException;
	boolean deleteStudent(int id)throws StudentNotFoundException;
	List<Student> getAllStudents();
	List<Student> getStudentsByDept(String dep)throws StudentNotFoundException;
	List<Student> findByAge(int age);
	List<Student> getStudentsByCity(String city) throws StudentNotFoundException;
	
}
