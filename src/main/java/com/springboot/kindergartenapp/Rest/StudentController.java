package com.springboot.kindergartenapp.Rest;

import com.springboot.kindergartenapp.dao.StudentDAO;
import com.springboot.kindergartenapp.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    private StudentDAO studentDAO;

    @Autowired
    public StudentController(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    @GetMapping("/getStudents")
    public List<Student> findAll(){

        return studentDAO.getAllStudent();
    }
}
