package com.springboot.kindergartenapp.services;

import com.springboot.kindergartenapp.entity.Student;

import java.util.List;

public interface StudentService {

    public List<Student> getAllStudent();

    public Student findById(int theId);

    public void save(Student theStudent);

    public void deleteById(int theId);
}
