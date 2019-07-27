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
    public List<Student> getAllStudent(int schoolId) {
        //get the current hibernate session
        Session currentSession=entityManager.unwrap(Session.class);

        //create the query
        Query<Student> theQuery =
                currentSession.createQuery("from Student where school_id=:schoolId",Student.class);
        theQuery.setParameter("schoolId",schoolId);
        // execute query and get result list
        List<Student> students=theQuery.getResultList();

        return students;
    }

    @Override
    public List<Student> getAllStudentByClassId(int classId) {
        Session currentSession=entityManager.unwrap(Session.class);

        //create the query
        Query<Student> theQuery =
                currentSession.createQuery("from Student where class_id=:classId",Student.class);
        theQuery.setParameter("classId",classId);
        // execute query and get result list
        List<Student> students=theQuery.getResultList();

        return students;
    }

    @Override
    public Student findById(int theId) {

        Session currentSession=entityManager.unwrap(Session.class);

        Student theStudent=currentSession.get(Student.class,theId);

        return theStudent;
    }

    @Override
    public void save(Student theStudent) {

        Session currentSession=entityManager.unwrap(Session.class);

        currentSession.save(theStudent);

    }

    @Override
    @Transactional
    public void deleteById(int theId) {

        Session currentSession=entityManager.unwrap(Session.class);

        Query theQuery= currentSession.createQuery("delete from Student where id=:student_id");

        theQuery.setParameter("student_id",theId);

        theQuery.executeUpdate();
    }

    @Override
    @Transactional
    public void update(Student student) {
        Session currentSession=entityManager.unwrap(Session.class);
        currentSession.clear();
        currentSession.update(student);

    }

    @Override
    public boolean isExist(int studentId){

        Session currentSession=entityManager.unwrap(Session.class);

            Student theStudent=currentSession.get(Student.class,studentId);
            if(theStudent==null)
            return false;

            return true;

    }


}
