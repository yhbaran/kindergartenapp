package com.springboot.kindergartenapp.services;

import com.springboot.kindergartenapp.entity.Classes;

import java.util.List;

public interface ClassService {

    public List<Classes> getClasses(int schoolId);

    public Classes findById(int classId);

    public void save(Classes classes);

    public void deleteById(int classId);

    public void update(Classes classes);

    public boolean isExist(int classId);

}
