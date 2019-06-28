package com.springboot.kindergartenapp.entity;

import javax.persistence.*;

@Entity
@Table(name = "kinderGarten")
public class KinderGarten {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "kinderGarten_id")
    private int kinderGartenID;

    @Column(name = "kinderGarten_name")
    private String kinderGartenName;


    public KinderGarten() {
    }

    public KinderGarten(int kinderGartenID, String kinderGartenName) {
        this.kinderGartenID = kinderGartenID;
        this.kinderGartenName = kinderGartenName;
    }

    public int getKinderGartenID() {
        return kinderGartenID;
    }

    public void setKinderGartenID(int kinderGartenID) {
        this.kinderGartenID = kinderGartenID;
    }

    public String getKinderGartenName() {
        return kinderGartenName;
    }

    public void setKinderGartenName(String kinderGartenName) {
        this.kinderGartenName = kinderGartenName;
    }

    @Override
    public String toString() {
        return "KinderGarten{" +
                "kinderGartenID=" + kinderGartenID +
                ", kinderGartenName='" + kinderGartenName + '\'' +
                '}';
    }
}
