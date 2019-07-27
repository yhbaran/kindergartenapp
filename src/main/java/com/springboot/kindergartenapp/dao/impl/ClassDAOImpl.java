package com.springboot.kindergartenapp.dao.impl;

import com.springboot.kindergartenapp.dao.ClassDAO;
import com.springboot.kindergartenapp.entity.Classes;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

import java.util.List;

@Repository
public class ClassDAOImpl implements ClassDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Classes> getClasses(int schoolId) {

        Session currentSession=entityManager.unwrap(Session.class);

        Query<Classes> theQuery =
                currentSession.createQuery("from Classes where id=:schoolId",Classes.class);
        theQuery.setParameter("schoolId",schoolId);

        List<Classes> classes=theQuery.getResultList();

        return classes;
    }

    @Override
    public Classes findById(int classId) {

        Session currentSession=entityManager.unwrap(Session.class);

        Classes theClass=currentSession.get(Classes.class,classId);

        return theClass;
    }

    @Override
    public void save(Classes theclass) {

        Session currentSession=entityManager.unwrap(Session.class);

        currentSession.save(theclass);

    }

    @Override
    public void deleteById(int classId) {

        Session currentSession=entityManager.unwrap(Session.class);

        Query theQuery=currentSession.createQuery("delete form Classes where id=:classId");
        theQuery.setParameter("classId",classId);
        theQuery.executeUpdate();
    }

    @Override
    public void update(Classes classes) {

        Session currentSession=entityManager.unwrap(Session.class);

        currentSession.clear();
        currentSession.update(classes);

    }

    @Override
    public boolean isExist(int classId) {
        Session currentSession=entityManager.unwrap(Session.class);

        Classes theClass=currentSession.get(Classes.class,classId);
        if (theClass==null)
            return false;

        return true;
    }
}
