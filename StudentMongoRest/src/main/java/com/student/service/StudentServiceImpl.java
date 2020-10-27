package com.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.dao.StudentRepository;
import com.student.exception.StudentNotFoundException;
import com.student.model.Student;
@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	StudentRepository studentRepository;
	public StudentServiceImpl() {
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		Student newStudent = studentRepository.save(student);
		return newStudent;
	}

	@Override
	public Student getStudentById(int studid) throws StudentNotFoundException {
		// TODO Auto-generated method stub
		return studentRepository.findById(studid)
				.orElseThrow(()-> new StudentNotFoundException("Id not available"));
	}

	@Override
	public boolean deleteStudent(int studid) throws StudentNotFoundException{
		// TODO Auto-generated method stub
		studentRepository.deleteById(studid);
		return true;
	}

	@Override
	public List<Student> getStudentsByCity(String city) throws StudentNotFoundException{
		// TODO Auto-generated method stub
		return studentRepository.findByAddressCity(city);
	}

	@Override
	public List<Student> getStudentsByDept(String dep) throws StudentNotFoundException{
		// TODO Auto-generated method stub
		return studentRepository. findStudentsByDept(dep);
	}

	@Override
	public List<Student> findByAge(int age) {
		// TODO Auto-generated method stub
		return studentRepository. findByAge(age);
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	
	

}
