package com.student.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="student")
@TypeAlias("student")
public class Student {
	@Id
	int studId;
	String name;
	String dep;
	int age;
	@Autowired
	Address address;

	public Student(int studId, String name, String dep, int age, Address address) {
		super();
		this.studId = studId;
		this.name = name;
		this.dep = dep;
		this.age = age;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [studId=" + studId + ", name=" + name + ", dep=" + dep + ", age=" + age + ", address=" + address
				+ "]";
	}

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDep() {
		return dep;
	}

	public void setDep(String dep) {
		this.dep = dep;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Student() {
		// TODO Auto-generated constructor stub
		super();
	}

}
