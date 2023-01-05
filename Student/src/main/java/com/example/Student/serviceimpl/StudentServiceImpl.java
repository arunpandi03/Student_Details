package com.example.Student.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Student.entity.Student;
import com.example.Student.repository.StudentRepository;
import com.example.Student.service.StudentService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class StudentServiceImpl implements StudentService{
	
	
	
	@Autowired
	private StudentRepository studentRepo;

	@Override
	public Student createStudent(Student student) {
		Student student1 = studentRepo.save(student);
		return student1;
	}

	@Override
	public List<Student> getAllStudent() {
		List<Student> student1 = studentRepo.findAll();
		return student1;
	}


@Override
	public Student getById(Long id) {
		Student student1 = studentRepo.findById(id).get();
		return student1;
}


	

	@Override
	public void deleteById(Long id) {
		studentRepo.deleteById(id);
		
	}
	
	@Override
	public Student updateStudent(Student student) {
		Student student1 = new Student();
		student1.setId(student.getId());
		student1.setDept(student.getDept());
		student1.setEmail(student.getEmail());
		student1.setName(student.getName());
	  
		return  studentRepo.save(student1);
	}

	@Override
	public Student getByName(String name) {
		Student student1 = studentRepo.findByName(name);
		return student1;
	}



	






}
