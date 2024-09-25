package com.example.SpringSecurityUsingMySqlDatabase.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringSecurityUsingMySqlDatabase.Dao.StudentRepository;
import com.example.SpringSecurityUsingMySqlDatabase.Modal.Student;

import java.util.List;

@Service
public class StudentServiceImp implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

}

