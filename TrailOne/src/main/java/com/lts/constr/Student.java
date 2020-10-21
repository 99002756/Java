package com.lts.constr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	String name;
	int studId;
	String dep;
@Autowired
	Course course;
	public Student(Course course) {
	super();
	this.course = course;
}
	public String getName() {
		return name;
	}
	@Value("${student.name}")
	public void setName(String name) {
		this.name = name;
	}  
	public int getStudId() {
		return studId;
	}
	@Value("${student.studId}")
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getDep() {
		return dep;
	}
	@Value("${student.dep}")
	public void setDep(String dep) {
		this.dep = dep;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", studId=" + studId + ", dep=" + dep + ", course=" + course + "]";
	}
	
}
