package com.example.SpringSecurityUsingMySqlDatabase.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringSecurityUsingMySqlDatabase.Modal.Student;


@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
