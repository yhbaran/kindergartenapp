package com.springboot.kindergartenapp.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="Student")
public class Student {

    //define fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private int studentId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "gender")
    private int gender;

    @Column(name = "parent_name")
    private String parentName;

    @Column(name = "parent_phone_num")
    private String parentPhoneNumber;

    @Column(name = "birth_date")
    private Date birthDate;

    @Column(name = "school_id")
    private int schoolId;

    @Column(name = "class_id")
    private int classId;

    @Column(name = "teacher_id")
    private String teacherId;

    @Column(name = "medicine")
    private String medicine;

    @Column(name = "special_case")
    private String specialCase;

    //define constuctors

    public Student() {
    }

    public Student(int studentId, String firstName, String lastName, int gender, String parentName, String parentPhoneNumber, Date birthDate,
                   int schoolId, int classId, String teacherId, String medicine, String specialCase) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.parentName = parentName;
        this.parentPhoneNumber = parentPhoneNumber;
        this.birthDate = birthDate;
        this.schoolId = schoolId;
        this.classId = classId;
        this.teacherId = teacherId;
        this.medicine = medicine;
        this.specialCase = specialCase;
    }

    //define getter/setter

    public int getId() {
        return studentId;
    }

    public void setId(int studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getParentPhoneNumber() {
        return parentPhoneNumber;
    }

    public void setParentPhoneNumber(String parentPhoneNumber) {
        this.parentPhoneNumber = parentPhoneNumber;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public int getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(int schoolId) {
        this.schoolId = schoolId;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getMedicine() {
        return medicine;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }

    public String getSpecialCase() {
        return specialCase;
    }

    public void setSpecialCase(String specialCase) {
        this.specialCase = specialCase;
    }


    //define tostring


    @Override
    public String toString() {
        return "Student{" +
                "id=" + studentId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", parentName='" + parentName + '\'' +
                ", parentPhoneNumber='" + parentPhoneNumber + '\'' +
                ", birthDate=" + birthDate +
                ", schoolId=" + schoolId +
                ", classId=" + classId +
                ", teacherId='" + teacherId + '\'' +
                ", medicine='" + medicine + '\'' +
                ", specialCase='" + specialCase + '\'' +
                '}';
    }
}
