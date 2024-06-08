package com.tcs.globalexceptionhandling.repo;

import com.tcs.globalexceptionhandling.model.Student;

public interface StudentRepo {
	public Student addStudent(Student student);

	public Student getStudentById(String studentId);
}
