package com.springboot.kindergartenapp.services;

import com.springboot.kindergartenapp.entity.Student;

import java.util.List;

public interface StudentService {

    public List<Student> getAllStudent(int schoolId);

    public List<Student> getAllStudentByClassId(int classId);

    public Student findById(int theId);

    public void save(Student theStudent);

    public void deleteById(int theId);

    public void update(Student student);

    public boolean isExist(int studentId);
}
