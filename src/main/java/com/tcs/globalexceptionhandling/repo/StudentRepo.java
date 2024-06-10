package com.tcs.globalexceptionhandling.repo;

import java.util.List;

import com.tcs.globalexceptionhandling.model.Student;

public interface StudentRepo {
	public Student addStudent(Student student);

	public Student getStudentById(String studentId);
	
	public List<Student> getAllStudents();
}
