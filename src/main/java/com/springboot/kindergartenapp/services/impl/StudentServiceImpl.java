package com.springboot.kindergartenapp.services.impl;

import com.springboot.kindergartenapp.dao.StudentDAO;
import com.springboot.kindergartenapp.entity.Student;
import com.springboot.kindergartenapp.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentDAO studentDAO;

    @Autowired
    public StudentServiceImpl(StudentDAO theStudentDAO){
        studentDAO=theStudentDAO;
    }

    @Override
    public List<Student> getAllStudent() {
        return studentDAO.getAllStudent();
    }

    @Override
    public Student findById(int theId) {
        return studentDAO.findById(theId);
    }

    @Override
    public void save(Student theStudent) {
        studentDAO.save(theStudent);
    }

    @Override
    public void deleteById(int theId) {
        studentDAO.deleteById(theId);
    }
}
