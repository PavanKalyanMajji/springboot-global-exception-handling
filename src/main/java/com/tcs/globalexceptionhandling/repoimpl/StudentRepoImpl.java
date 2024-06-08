package com.tcs.globalexceptionhandling.repoimpl;

import java.util.*;

import org.springframework.stereotype.Repository;

import com.tcs.globalexceptionhandling.customexception.StudentException;
import com.tcs.globalexceptionhandling.model.Student;
import com.tcs.globalexceptionhandling.repo.StudentRepo;

@Repository
public class StudentRepoImpl implements StudentRepo{
	
	private Map<String,Student> listOfStudents =new LinkedHashMap<>();

	@Override
	public Student addStudent(Student student) {
		String stuId =student.getStudentId();
		String stuName=student.getStudentName();
		if( stuId == null || stuName==null)
			throw new StudentException("Filelds are Empty please check");
		listOfStudents.put(stuId, student);
		return student;
	}

	@Override
	public Student getStudentById(String studentId) {
		if(!listOfStudents.containsKey(studentId))
			throw new StudentException("Student Id NotFound");
		return listOfStudents.get(studentId);
	}

}
