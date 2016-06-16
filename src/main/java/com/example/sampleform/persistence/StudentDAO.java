package com.example.sampleform.persistence;

import org.springframework.data.repository.CrudRepository;

import com.example.sampleform.model.Student;

public interface StudentDAO extends CrudRepository<Student, Long> {
	
}
