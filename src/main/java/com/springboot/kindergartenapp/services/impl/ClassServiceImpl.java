package com.springboot.kindergartenapp.services.impl;

import com.springboot.kindergartenapp.dao.ClassDAO;
import com.springboot.kindergartenapp.dao.StudentDAO;
import com.springboot.kindergartenapp.entity.Classes;
import com.springboot.kindergartenapp.services.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassServiceImpl implements ClassService {

    private ClassDAO classDAO;

    @Autowired
    public ClassServiceImpl(ClassDAO theClassDAO){
        classDAO=theClassDAO;
    }

    @Override
    public List<Classes> getClasses(int schoolId) {
        return classDAO.getClasses(schoolId);
    }

    @Override
    public Classes findById(int classId) {
        return classDAO.findById(classId);
    }

    @Override
    public void save(Classes classes) {
        classDAO.save(classes);
    }

    @Override
    public void deleteById(int classId) {
        classDAO.deleteById(classId);
    }

    @Override
    public void update(Classes classes) {
        classDAO.update(classes);
    }

    @Override
    public boolean isExist(int classId) {
        return classDAO.isExist(classId);
    }
}
