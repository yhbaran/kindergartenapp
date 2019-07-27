package com.springboot.kindergartenapp.controller;

import com.springboot.kindergartenapp.entity.Classes;
import com.springboot.kindergartenapp.services.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClassController {

    private ClassService classService;

    @Autowired
    public ClassController(ClassService classService) {
        this.classService = classService;
    }

    @RequestMapping("/classes/{schoolId}")
    public List<Classes> getAllClasses(@PathVariable int schoolId){

        return classService.getClasses(schoolId);
    }

    @GetMapping("/class/{classId}")
    public Classes findById(@PathVariable  int classId){

        return classService.findById(classId);
    }

    @PostMapping("/class")
    public Classes createClass(@RequestBody Classes theClass){
        classService.save(theClass);
        return theClass;
    }

    @DeleteMapping("/class/{classId}")
    public boolean deleteClass(@PathVariable int classId){

        if (!classService.isExist(classId))
            throw new RuntimeException("class not found");

        classService.deleteById(classId);
        return true;
    }

    @PutMapping("/class")
    public Classes updateClass(@RequestBody Classes theClass){

        if (!classService.isExist(theClass.getClassId()))
            throw new RuntimeException("class not found");

        classService.update(theClass);

        return theClass;
    }


}
