package com.springboot.kindergartenapp.Rest;

import com.springboot.kindergartenapp.dao.StudentDAO;
import com.springboot.kindergartenapp.entity.Student;
import com.springboot.kindergartenapp.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/getStudents")
    public List<Student> findAll(){

        return studentService.getAllStudent();
    }

    @GetMapping("/getStudents/{studentId}")
    public Student getStudent(@PathVariable int studentId){

        Student theStudent=studentService.findById(studentId);

        if(theStudent == null){
            throw new RuntimeException("Student id not found");
            }
        return theStudent;
    }

    @PostMapping("/addStudents")
    public Student addStudent(@RequestBody Student theStudent){

        theStudent.setId(0);

        studentService.save(theStudent);

        return theStudent;
    }
}
