package com.example.Student.service;

import java.util.List;

import com.example.Student.entity.Student;



public interface StudentService {
	
	public Student createStudent(Student student);
	
	public List<Student> getAllStudent();
	
	public Student getById(Long id);
	
	public Student updateStudent(Student student);

	public void deleteById(Long id);

	public Student getByName(String name);



	

	


	


	
}