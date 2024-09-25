package com.example.SpringSecurityUsingMySqlDatabase.Services;

import java.util.List;

import com.example.SpringSecurityUsingMySqlDatabase.Modal.Student;


public interface StudentService {

	Student createStudent(Student student);

	List<Student> getAllStudents();

}
