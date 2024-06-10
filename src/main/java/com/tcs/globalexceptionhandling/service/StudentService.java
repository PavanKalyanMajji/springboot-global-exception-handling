package com.tcs.globalexceptionhandling.service;

import java.util.List;

import com.tcs.globalexceptionhandling.model.Student;

public interface StudentService {
	public Student addStudent(Student student);

	public Student getStudentById(String studentId);
	
	public List<Student> getAllStudents();
}
