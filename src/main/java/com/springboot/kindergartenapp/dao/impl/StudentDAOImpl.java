package com.springboot.kindergartenapp.dao.impl;

import com.springboot.kindergartenapp.dao.StudentDAO;
import com.springboot.kindergartenapp.entity.Student;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO {

    //define field for entityManager
    private EntityManager entityManager;

    //set up constructor injections
    @Autowired
    public StudentDAOImpl(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }

    @Override
    @Transactional
    public List<Student> getAllStudent() {
        //get the current hibernate session
        Session currentSession=entityManager.unwrap(Session.class);

        //create the query
        Query<Student> theQuery =
                currentSession.createQuery("from Students",Student.class);

        // execute query and get result list
        List<Student> students=theQuery.getResultList();

        return students;
    }
}
