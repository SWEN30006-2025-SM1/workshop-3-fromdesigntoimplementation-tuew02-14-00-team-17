package com.unimelb.swen30006.workshops;
import java.util.Date;

public abstract class Person {
    private String address;
    private Date DOB;
    private String name;

    public Person(String name, Date DOB, String address) {
        this.name = name;
        this.DOB = DOB;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void displayInfo();
}
