package com.example.sampleform.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.sampleform.model.Student;
import com.example.sampleform.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		List<Student> studentList = this.studentService.findAll();
		model.addAttribute("studentList", studentList);
		return "studentlist";
	}
	
	@RequestMapping(value = "/new", method = RequestMethod.GET)
	public String newStudent(Model model) {
		model.addAttribute("student", new Student());
		return "student";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addStudent(
			@Valid Student student,
			BindingResult bindingResult,
			Model model) {
		
		if (bindingResult.hasErrors()) {
			return "student";
		}
		
		this.studentService.addStudent(student);
		
		return "redirect:/";
	}
	
	@RequestMapping(value = "/student/{id}", method = RequestMethod.GET)
	public String edit(@PathVariable long id, Model model) {
		Student student = this.studentService.findById(id);
		model.addAttribute("student", student);
		return "student";
	}
}
