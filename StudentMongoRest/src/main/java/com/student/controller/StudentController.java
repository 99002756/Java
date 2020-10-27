package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.exception.StudentNotFoundException;
import com.student.model.Student;
import com.student.service.StudentService;

@RestController
@RequestMapping("/student-api")
public class StudentController {

	
		@Autowired
		StudentService studentService;
		@PostMapping("/students")
		Student addStudent(@RequestBody Student student)
		{
			return studentService.addStudent(student);
		}
		
		@DeleteMapping("/students/delete-one/{studentId}")
		boolean deleteStudent(@PathVariable("studentId")Integer studentid) throws StudentNotFoundException{
			return studentService.deleteStudent(studentid);
		}
		
		@GetMapping("/students/get-one/{studentId}")
		Student getStudentById(@PathVariable("studentid")Integer Id)throws StudentNotFoundException
		{
			return studentService.getStudentById(Id);
		}
		
		
		@GetMapping("/students/city/{city}")
		List<Student> getStudentsByCity(String city) throws StudentNotFoundException{
			// TODO Auto-generated method stub
			return  studentService.getStudentsByCity(city);
		}

		@GetMapping("/students/dep/{dep}")
		List<Student> getStudentsByDept(String dep) throws StudentNotFoundException{
			// TODO Auto-generated method stub
			return  studentService.getStudentsByDept(dep);
		}

		@GetMapping("/students/age/{age}")
		List<Student> findByAge(int age) {
			// TODO Auto-generated method stub
			return studentService.findByAge(age);
		}

		
	}

