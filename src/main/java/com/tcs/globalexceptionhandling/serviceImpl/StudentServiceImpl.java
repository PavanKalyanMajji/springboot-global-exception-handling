package com.tcs.globalexceptionhandling.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.globalexceptionhandling.model.Student;
import com.tcs.globalexceptionhandling.repo.StudentRepo;
import com.tcs.globalexceptionhandling.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepo repo;

	@Override
	public Student addStudent(Student student) {
		return repo.addStudent(student);
	}

	@Override
	public Student getStudentById(String studentId) {
		return repo.getStudentById(studentId);
	}

	@Override
	public List<Student> getAllStudents() {
		return repo.getAllStudents();
	}

}
