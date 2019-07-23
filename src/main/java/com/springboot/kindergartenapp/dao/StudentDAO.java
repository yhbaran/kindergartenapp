package com.springboot.kindergartenapp.dao;

import com.springboot.kindergartenapp.entity.Student;

import java.util.List;

public interface StudentDAO {

    public List<Student> getAllStudent();

    public Student findById(int theId);

    public void save(Student theStudent);

    public void deleteById(int theId);

    public void update(Student student);

    public boolean isExist(int studentId);

}
