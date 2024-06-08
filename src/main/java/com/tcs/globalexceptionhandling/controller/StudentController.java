package com.tcs.globalexceptionhandling.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.globalexceptionhandling.model.Student;
import com.tcs.globalexceptionhandling.service.StudentService;

@RestController
@RequestMapping("/student/api/v1")
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@GetMapping("/pingtest")
	public ResponseEntity<String> pingTest() {
		return new ResponseEntity<String>("Success",HttpStatus.OK);
	}
	
	@PostMapping("/addstudent")
	public Student addStudent(@RequestBody Student student) {
		return service.addStudent(student);
	}
	
	@GetMapping("/getstudentbyid/{Id}")
	public Student getStudentById(@PathVariable("Id") String studentId) {
		return service.getStudentById(studentId);
	}
}
