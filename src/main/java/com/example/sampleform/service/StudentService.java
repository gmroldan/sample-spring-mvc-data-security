package com.example.sampleform.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sampleform.model.Student;
import com.example.sampleform.persistence.StudentDAO;

@Service
public class StudentService {
	@Autowired
	private StudentDAO studentDAO;
	
	public void addStudent(final Student student) {
		this.studentDAO.save(student);
	}
	
	public Student findById(final long id) {
		return this.studentDAO.findOne(id);
	}
	
	public List<Student> findAll() {
		return (List<Student>) this.studentDAO.findAll();
	}
}
