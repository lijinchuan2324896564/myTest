package com.web.tom.entity;

import java.io.Serializable;

public class Sign implements Serializable {
    private int id;
    private int stNumber;
    private String name;
    private String date;

    public int getId(int id){
        return this.id;
    }

    public void setId(int id){
        this.id=id;
    }

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

    public String getDate(){
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
