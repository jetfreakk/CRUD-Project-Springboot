package com.example.studentcrud.studentcrud.service;

import java.util.List;

import com.example.studentcrud.studentcrud.domain.Student;
import com.example.studentcrud.studentcrud.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService
{
@Autowired
private StudentRepository repo;
public List<Student> listAll()
{
    return repo.findAll();
}
public void save (Student student)
{
    repo.save(student);
}
public void delete (long id)
{
    repo.deleteById(id);
}
public Student get(long id)
{
    return repo.findById(id).get();
}

}