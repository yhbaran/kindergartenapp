package com.springboot.kindergartenapp.dao;

import com.springboot.kindergartenapp.entity.Classes;

import java.util.List;

public interface ClassDAO {

    public List<Classes> getClasses(int schoolId);

    public Classes findById(int classId);

    public void save(Classes classes);

    public void deleteById(int classId);

    public void update(Classes classes);

    public boolean isExist(int classId);

}
