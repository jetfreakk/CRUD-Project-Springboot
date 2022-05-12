package com.example.studentcrud.studentcrud.repository;

import com.example.studentcrud.studentcrud.domain.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
    
}
