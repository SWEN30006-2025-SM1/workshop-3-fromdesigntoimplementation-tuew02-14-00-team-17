package com.unimelb.swen30006.workshops;

public class Student extends Person {
    String email;
    String studentID;

    public Student(String address, Date DOB, String name, String email, String studentID) {
        super(address, DOB, name);
        this.email = email;
        this.studentID = studentID;
    }

    public void sendEmailMsg(String message) {
        // Logic to send email
    }

    public float totalGrade() {
        // Logic to calculate grade
        return 0.0f; // Placeholder return
    }
}

