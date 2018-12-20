package com.web.tom.entity;

import java.io.Serializable;

public class Student implements Serializable {
    private int stNumber;
    private String name;
    private String major;

    public int getStNumber(){
        return stNumber;
    }

    public void setStNumber(int stNumber){
        this.stNumber = stNumber;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getMajor(){
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
