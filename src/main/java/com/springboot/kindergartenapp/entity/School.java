package com.springboot.kindergartenapp.entity;

import javax.persistence.*;

@Entity
@Table(name = "Schools")
public class School {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int schoolID;

    @Column(name = "name")
    private String schoolName;

    public School(){}

    public School(int schoolID, String schoolName) {
        this.schoolID = schoolID;
        this.schoolName = schoolName;
    }

    public int getSchoolID() {
        return schoolID;
    }

    public void setSchoolID(int schoolID) {
        this.schoolID = schoolID;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public String toString() {
        return "School{" +
                "schoolID=" + schoolID +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
