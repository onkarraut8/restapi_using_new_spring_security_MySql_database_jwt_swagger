package com.example.SpringSecurityUsingMySqlDatabase.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringSecurityUsingMySqlDatabase.Modal.Subject;


@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long> {

}
