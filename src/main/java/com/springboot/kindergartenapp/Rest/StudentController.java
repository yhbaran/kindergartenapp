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

    @GetMapping("/students")
    public List<Student> findAll(){

        return studentService.getAllStudent();
    }

    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId){

        if(!studentService.isExist(studentId)){
            throw new RuntimeException("Student id not found");
        }

        Student theStudent=studentService.findById(studentId);
        return theStudent;
    }

    @PostMapping("/students")
    public Student addStudent(@RequestBody Student theStudent){

        theStudent.setId(0);

        studentService.save(theStudent);

        return theStudent;
    }

    @DeleteMapping("/students/{studentId}")
    public boolean deleteStudent(@PathVariable int studentId){
        if(!studentService.isExist(studentId)){
            throw new RuntimeException("Student id not found");
        }
        studentService.deleteById(studentId);
        return  true;
    }

    @PutMapping("/students")
    public Student updateStudent(@RequestBody Student theStudent){

        if(!studentService.isExist(theStudent.getId())){
            throw new RuntimeException("Student id not found");
        }

        studentService.update(theStudent);

        return theStudent;
    }


}
