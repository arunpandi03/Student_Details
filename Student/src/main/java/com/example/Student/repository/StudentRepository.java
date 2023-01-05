package com.example.Student.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Student.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Long> {

	Student findByName(String name);

	

}
