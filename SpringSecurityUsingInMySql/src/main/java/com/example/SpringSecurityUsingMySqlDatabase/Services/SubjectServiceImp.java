package com.example.SpringSecurityUsingMySqlDatabase.Services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringSecurityUsingMySqlDatabase.Dao.SubjectRepository;
import com.example.SpringSecurityUsingMySqlDatabase.Modal.Subject;

import java.util.List;

@Service
public class SubjectServiceImp implements SubjectService {

    @Autowired
    private SubjectRepository subjectRepository;

    public List<Subject> getAllSubjects() {
        return subjectRepository.findAll();
    }
}

