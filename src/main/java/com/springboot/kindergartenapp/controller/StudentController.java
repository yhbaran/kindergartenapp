package com.springboot.kindergartenapp.controller;

import com.springboot.kindergartenapp.entity.Student;
import com.springboot.kindergartenapp.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students/{schoolId}")
    public List<Student> findAll(@PathVariable int schoolId){

        return studentService.getAllStudent(schoolId);
    }

    @GetMapping("/students/class/{classId}")
    public List<Student> findAllByClass(@PathVariable int classId){

        return studentService.getAllStudentByClassId(classId);
    }

    @GetMapping("/student/{studentId}")
    public Student getStudent(@PathVariable int studentId){

        if(!studentService.isExist(studentId)){
            throw new RuntimeException("Student id not found");
        }

        Student theStudent=studentService.findById(studentId);
        return theStudent;
    }

    @PostMapping("/student")
    public Student addStudent(@RequestBody Student theStudent){

        theStudent.setId(0);

        studentService.save(theStudent);

        return theStudent;
    }

    @DeleteMapping("/student/{studentId}")
    public boolean deleteStudent(@PathVariable int studentId){
        if(!studentService.isExist(studentId)){
            throw new RuntimeException("Student id not found");
        }
        studentService.deleteById(studentId);
        return  true;
    }

    @PutMapping("/student")
    public Student updateStudent(@RequestBody Student theStudent){

        if(!studentService.isExist(theStudent.getId())){
            throw new RuntimeException("Student id not found");
        }

        studentService.update(theStudent);

        return theStudent;
    }


}
