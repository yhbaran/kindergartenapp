package com.springboot.kindergartenapp.entity;

import javax.persistence.*;

@Entity(name = "teachers")
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "teacher_id")
    private int teacherID;

    @Column(name = "first_name")
    private  String teacherFirstName;

    @Column(name = "last_name")
    private  String teacherLastName;

    @Column(name = "school_id")
    private int schoolID;

    @Column(name = "class_id")
    private  int classID;

    public Teacher() {
    }

    public Teacher(int teacherID, String teacherFirstName, String teacherLastName, int schoolID, int classID) {
        this.teacherID = teacherID;
        this.teacherFirstName = teacherFirstName;
        this.teacherLastName = teacherLastName;
        this.schoolID = schoolID;
        this.classID = classID;
    }

    public int getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(int teacherID) {
        this.teacherID = teacherID;
    }

    public String getTeacherFirstName() {
        return teacherFirstName;
    }

    public void setTeacherFirstName(String teacherFirstName) {
        this.teacherFirstName = teacherFirstName;
    }

    public String getTeacherLastName() {
        return teacherLastName;
    }

    public void setTeacherLastName(String teacherLastName) {
        this.teacherLastName = teacherLastName;
    }

    public int getSchoolID() {
        return schoolID;
    }

    public void setSchoolID(int schoolID) {
        this.schoolID = schoolID;
    }

    public int getClassID() {
        return classID;
    }

    public void setClassID(int classID) {
        this.classID = classID;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherID=" + teacherID +
                ", teacherFirstName='" + teacherFirstName + '\'' +
                ", teacherLastName='" + teacherLastName + '\'' +
                ", schoolID=" + schoolID +
                ", classID=" + classID +
                '}';
    }
}
