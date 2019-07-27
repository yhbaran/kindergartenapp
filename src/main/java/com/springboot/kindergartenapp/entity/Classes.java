package com.springboot.kindergartenapp.entity;

import javax.persistence.*;

@Entity
@Table(name = "Classes")
public class Classes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int classId;

    @Column(name = "class_name")
    private String name;

    @Column(name = "school_id")
    private int schoolId;

    @Column(name = "teacher_id")
    private int teacherId;

    public Classes() {
    }

    public Classes(int classId, String name, int schoolId, int teacherId) {
        this.classId = classId;
        this.name = name;
        this.schoolId = schoolId;
        this.teacherId = teacherId;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(int schoolId) {
        this.schoolId = schoolId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Classes{" +
                "classId=" + classId +
                ", name='" + name + '\'' +
                ", schoolId=" + schoolId +
                ", teacherId=" + teacherId +
                '}';
    }
}
