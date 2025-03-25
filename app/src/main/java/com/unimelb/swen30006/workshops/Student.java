package com.unimelb.swen30006.workshops;
import java.util.Date;


public class Student extends Person {
    String email;
    String studentID;

    public Student(String address, Date DOB, String name, String email, String studentID) {
        super(address, DOB, name);
        this.email = email;
        this.studentID = studentID;
    }

    public void sendEmailMsg(String message) {
    }

    public float totalGrade() {
        return 0.0f; // Placeholder return
    }
}

